package qn.projectredstone.api;

import qn.projectredstone.api.functions.PlayerFunctions;
import qn.projectredstone.api.functions.ServerFunctions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Linker {

	public static Method[] getRegisteredFunctions() {
		ArrayList<Method> functions = new ArrayList<>();
		Collections.addAll(functions, PlayerFunctions.class.getDeclaredMethods());
		Collections.addAll(functions, ServerFunctions.class.getDeclaredMethods());
		return (Method[])functions.toArray();
	}

	public static String[] getFunctionNames() {
		ArrayList<String> functions = new ArrayList<>();
		for (Method method : getRegisteredFunctions()) {
			FunctionName nameAnnotation = method.getAnnotation(FunctionName.class);
			functions.add(nameAnnotation != null ? nameAnnotation.value() : null);
		}
		return (String[])functions.toArray();
	}
}
