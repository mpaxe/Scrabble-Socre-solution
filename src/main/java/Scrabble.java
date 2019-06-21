
class Scrabble {

	private final int score;

	Scrabble(String word) {
		this.score = calculateSocre(word);
	}

	int getScore() {
		return score;
	}

	private int calculateSocre(String word) {
		int score = 0;
		for (Character c : word.toCharArray()) {
			score += getSocreForLetter(c);
		}
		return score;
	}

	private int getSocreForLetter(Character letra) {
		String c = Character.toString(letra).toUpperCase();
		if (c.matches("[AEIOULNRST]")) {
			return 1;
		} else if (c.toUpperCase().matches("[DG]")) {
			return 2;
		} else if (c.toUpperCase().matches("[BCMP]")) {
			return 3;
		} else if (c.toUpperCase().matches("[FHVWY]")) {
			return 4;
		} else if (c.toUpperCase().matches("[K]")) {
			return 5;
		} else if (c.toUpperCase().matches("[JX]")) {
			return 8;
		} else {
			return 10;
		}
	}

}
