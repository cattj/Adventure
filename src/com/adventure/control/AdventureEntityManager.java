package com.adventure.control;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdventureEntityManager {
	private static final EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("transactions-optional");

	public static EntityManagerFactory get() {
		return entityManagerFactory;
	}

	private AdventureEntityManager() {
	}
}
