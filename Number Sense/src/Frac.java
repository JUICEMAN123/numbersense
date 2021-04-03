import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Frac {
	private int num;
	private int denom;
	private static final String DOT = ".";
	private static final String ERROR = "ERROR";
	private static final String LEFT_PARENTHESIS = "\\overline{";
	private static final String RIGHT_PARENTHESIS = "}";

	public Frac(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}

	public Frac(String fraction) {
		String[] parts = fraction.split("/");
		this.num = Integer.parseInt(parts[0]);
		this.denom = Integer.parseInt(parts[1]);
	}

	public int getNum() {
		return num;
	}

	public int getDenom() {
		return denom;
	}

	public Frac simp(Frac unSimp) {
		if (LCMandGCF.GCF(unSimp.getNum(), unSimp.getDenom()) > 1) {
			return new Frac(unSimp.getNum() / LCMandGCF.GCF(unSimp.getNum(), unSimp.getDenom()),
					unSimp.getDenom() / LCMandGCF.GCF(unSimp.getNum(), unSimp.getDenom()));
		}
		// if(unSimp.getNum() == 0){
		// return 0;
		// }
		return unSimp;
	}

	public Frac add(Frac frac1, Frac frac2) {
		int num1 = simp(frac1).getNum();
		int num2 = simp(frac1).getNum();
		int denom1 = simp(frac1).getDenom();
		int denom2 = simp(frac1).getDenom();
		return simp(new Frac(num1 * denom2 + num2 * denom1, denom1 * denom2));
	}

	public Frac sub(Frac frac1, Frac frac2) {
		int num1 = simp(frac1).getNum();
		int num2 = simp(frac1).getNum();
		int denom1 = simp(frac1).getDenom();
		int denom2 = simp(frac1).getDenom();
		return simp(new Frac(num1 * denom2 - num2 * denom1, denom1 * denom2));
	}

	public Frac mult(Frac frac1, Frac frac2) {
		int num1 = simp(frac1).getNum();
		int num2 = simp(frac1).getNum();
		int denom1 = simp(frac1).getDenom();
		int denom2 = simp(frac1).getDenom();
		return simp(new Frac(num1 * num2, denom1 * denom2));
	}

	public Frac div(Frac frac1, Frac frac2) {
		int num1 = simp(frac1).getNum();
		int num2 = simp(frac1).getNum();
		int denom1 = simp(frac1).getDenom();
		int denom2 = simp(frac1).getDenom();
		return simp(new Frac(num1 * denom2, denom1 * num2));
	}

	public String toDeci() {
		return divide(num, denom);
	}

	public static String divide(final int a, final int b) {
		if (b == 0) {
			return ERROR;
		}

		int value = a / b;
		int remainder = a % b;
		return String.valueOf(value) + DOT + divider(remainder, b);
	}

	public static String divider(final int a, final int b) {
		final Map<Integer, Integer> remainderIndexMap = new HashMap<>();
		final List<Integer> values = new ArrayList<>();

		int value;
		int remainder = a;
		while (!remainderIndexMap.containsKey(remainder)) {
			remainderIndexMap.put(remainder, values.size());

			remainder *= 10;
			value = remainder / b;
			remainder = remainder % b;
			values.add(value);
		}

		final int index = remainderIndexMap.get(remainder);
		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < index; i++) {
			result.append(values.get(i));
		}
		result.append(LEFT_PARENTHESIS);
		for (int i = index; i < values.size(); i++) {
			result.append(values.get(i));
		}
		result.append(RIGHT_PARENTHESIS);
		return result.toString();
	}

	public static boolean repeating(int num, int den) {
		if (divide(num, den).indexOf("\\overline{") == -1 || divide(num, den).length() > 15) {
			return false;
		}
		return true;
	}

	// class should be pretty obvious
	public static String fracAdd(String frac1, String frac2) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return Simp.getFraction((num1 * denom2 + num2 * denom1) + "/" + (denom1 * denom2));
	}

	public static String fracAdd(String frac1, String frac2, boolean latexFormat) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return (num1 * denom2 + num2 * denom1) + "/" + (denom1 * denom2);
	}

	public static String fracSub(String frac1, String frac2) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return Simp.getFraction((num1 * denom2 - num2 * denom1) + "/" + (denom1 * denom2));
	}

	public static String fracSub(String frac1, String frac2, boolean dollarSigns){
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return Simp.getFraction((num1 * denom2 - num2 * denom1) + "/" + (denom1 * denom2), false);
	}

	public static String fracMult(String frac1, String frac2) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return Simp.getFraction((num1 * num2) + "/" + (denom1 * denom2));
	}

	public static String fracMult(String frac1, String frac2, boolean latexFormat) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		int num1 = Integer.valueOf((frac1.substring(0, frac1.indexOf("/"))));
		int denom1 = Integer.valueOf((frac1.substring(frac1.indexOf("/") + 1)));
		int num2 = Integer.valueOf((frac2.substring(0, frac2.indexOf("/"))));
		int denom2 = Integer.valueOf((frac2.substring(frac2.indexOf("/") + 1)));
		return Simp.getFraction((num1 * num2) + "/" + (denom1 * denom2), false);
	}

	public static String fracDivide(String frac1, String frac2, boolean latexFormat) {
		frac1 = verifyFrac(frac1);
		frac2 = verifyFrac(frac2);
		// verifyFrac(frac1, frac2);
		if (latexFormat) {
			return fracMult(frac1, reci(frac2));
		} else {
			return fracMult(frac1, reci(frac2), false);
		}
	}

	public static String reci(String frac) {
		return Integer.valueOf((frac.substring(frac.indexOf("/") + 1))) + "/"
				+ Integer.valueOf((frac.substring(0, frac.indexOf("/"))));
	}

	public static String properAdd(String frac1, String frac2) {
		return Simp.getProper(fracAdd(frac1, frac2, false));
	}

	public static String properMult(String frac1, String frac2) {
		String[] parts1 = frac1.split(" ");
		String[] parts2 = frac2.split(" ");
		String[] answer = new String[4];
		answer[0] = String.valueOf(Integer.valueOf(parts1[0]) * Integer.valueOf(parts2[0])) + "/1";
		answer[1] = fracMult(parts1[0] + "/1", parts2[1], false);
		answer[2] = fracMult(parts2[0] + "/1", parts1[1], false);
		answer[3] = fracMult(parts1[1], parts2[1], false);
		return Simp
				.getProper(fracAdd(fracAdd(answer[0], answer[1], false), fracAdd(answer[2], answer[3], false), false));
	}

	public String toString() {
		return Simp.getFraction(num + "/" + denom);
	}

	public String toString(boolean a) {
		return num + "/" + denom;
	}

	public static String verifyFrac(String integer) {
		if (integer.indexOf("\\frac") != -1) {
			String[] parts = integer.split("\\{");
			return parts[1].substring(0, parts[1].indexOf("}")) + "/" + parts[2].substring(0, parts[2].indexOf("}"));
		} else {
			if (integer.indexOf("/") == -1) {
				return integer + "/1";
			}
			return integer;
		}
	}

	public static void main(String[] args){
		Log log1 = Log.random();
		Log log2 = Log.random();
		System.out.println(Frac.fracMult("3", "5"));
		System.out.println(" What is $" + log1 + " + " + log2 + "$?");
		System.out.println((Log.add(log1, log2).toAns()));
	}

}
