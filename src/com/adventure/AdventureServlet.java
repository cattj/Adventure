package com.adventure;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adventure.control.AdventureCharacterDAO;
import com.adventure.control.AdventureEntityManager;
import com.adventure.entity.AdventureCharacter;

@SuppressWarnings("serial")
public class AdventureServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		AdventureCharacterDAO adventureCharDAO = new AdventureCharacterDAO();
		List<AdventureCharacter> chars = adventureCharDAO
				.findAll(AdventureCharacter.class);
		if (chars.size() == 0) {
			AdventureCharacter newChar = new AdventureCharacter();
			newChar.setCharacterName("TESTCHAR");
			AdventureEntityManager.get().createEntityManager().persist(newChar);
		}
		for (AdventureCharacter character : chars) {
			System.out.println(character.getCharacterName());
		}
	}
}
