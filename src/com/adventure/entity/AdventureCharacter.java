package com.adventure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class AdventureCharacter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key key;

	private String characterName;

	public String getCharacterName() {
		return characterName;
	}

	public Key getKey() {
		return key;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public void setKey(Key key) {
		this.key = key;
	}

}
