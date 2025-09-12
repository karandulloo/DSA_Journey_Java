package recursion;

public class SkipACharacter {

	public static void main(String[] args) {
		String p = "";
		char target = 'a';
		String up = "bacca";
		System.out.println(removeLetter(p, up, target));

	}

	private static String removeLetter(String p, String up, char target) {
		if (up.isEmpty()) {
			return p;
		}
		char ch = up.charAt(0);
		if (ch != target) {
			return removeLetter(p + ch, up.substring(1), target);
		} else {
			return removeLetter(p, up.substring(1), target);
		}

	}
}
