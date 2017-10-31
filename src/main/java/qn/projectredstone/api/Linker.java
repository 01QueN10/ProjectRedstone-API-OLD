package qn.projectredstone.api;

import qn.projectredstone.api.functions.PlayerFunctions;
import qn.projectredstone.api.functions.ServerFunctions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Linker {

	public static Method[] getRegisteredFunctions() {
		ArrayList<Method> functions = new ArrayList<>();
		Collections.addAll(functions, PlayerFunctions.class.getDeclaredMethods());
		Collections.addAll(functions, ServerFunctions.class.getDeclaredMethods());
		return (Method[])functions.toArray();
	}

	public static String[] getFunctionNames() {
		ArrayList<String> functions = new ArrayList<>();
		for (Method method : getRegisteredFunctions()) functions.add(method.getAnnotation(FunctionName.class).value());
		return (String[])functions.toArray();
	}
}
