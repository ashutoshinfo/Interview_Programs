package info.ashutosh;
public class FindRepeatharactersFromString{
	public static void main(String[] args) {
		String s = "   aa bbb cccc ddddd  ";

		int distinct = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					distinct++;

				}
			}
			System.out.println(s.charAt(i) + "--" + distinct);
			String d = String.valueOf(s.charAt(i));
			System.out.println(d);
			s = s.replaceAll(d, "");
			distinct = 0;

		}

	}// Find Repeat Characters From String
}