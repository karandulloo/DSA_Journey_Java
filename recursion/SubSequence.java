package recursion;

class SubSequence {
	public static void main(String[] args) {
		String p = "";
		String up = "abc";

		subsequence(p, up);
	}

	static void subsequence(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subsequence(p + ch, up.substring(1));
		subsequence(p, up.substring(1));
	}


}