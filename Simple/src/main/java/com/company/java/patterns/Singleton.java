package com.company.java.patterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	/*
	 * 1 - The sole instance will be a static final instance in the class itself.
	 */
	private static final Singleton soleInstance = new Singleton();

	/*
	 * 2 - This ensures that nobody can create an object of this class using a new
	 * keyword
	 */
	private Singleton() {
		System.out.println("Creating...");
	}

	/*
	 * 3 - This public API returns the sole instance for access that developers
	 * require.
	 */
	public static Singleton getInstance() {
		return soleInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return super.clone();
		return soleInstance;
	}

	private Object readResolve() throws ObjectStreamException {
		System.out.println("... read resolve ...");
		return soleInstance;
	}

}
