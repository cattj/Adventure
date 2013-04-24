package com.adventure.control;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericDAO<Type> {

	@SuppressWarnings("unchecked")
	public List<Type> findAll(Class<Type> type) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select obj from ");
		stringBuilder.append(type.getName());
		stringBuilder.append(" obj");
		return getEntityManager().createQuery(stringBuilder.toString())
				.getResultList();
	}

	private EntityManager getEntityManager() {
		return AdventureEntityManager.get().createEntityManager();
	}

}
