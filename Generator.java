import java.util.*;

public class Generator {
	public static void main(String[] args) {
		ArrayList<String> questions = new ArrayList<>();
		ArrayList<String> answers = new ArrayList<>();
		Random rand = new Random();
		System.out.println("\\documentclass{article}\n" + "\\usepackage[margin=1.0in]{geometry}\n"
				+ "\\usepackage{lipsum}\n" + "\\usepackage{setspace}\n\\usepackage{multicol}\n" + "\\newcommand\\textbox[1]{%\n"
				+ "  \\parbox{.333\\textwidth}{#1}%\n" + "}\n" + "\\begin{document}\n" + "\\begin{center}\n"
				+ "\\textbf{The University Interscholastic League\\\\\n"
				+ "Number Sense Test $\\cdot$ HS District $\\cdot$ \\date}\n" + "\\end{center}\n"
				+ "\\hfill Final \\textunderscore\\textunderscore\\textunderscore\\textunderscore \\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\\\\n"
				+ "\\noindent \\textbf{Contestant's Number} \\textunderscore\\textunderscore\\textunderscore\\textunderscore                               \\hfill  2nd \\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\\\\n"
				+ "\\noindent   .\\hfill  1st \\textunderscore\\textunderscore\\textunderscore\\textunderscore \\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\\textunderscore\n"
				+ "\\\\\n"
				+ "\\noindent \\textbf{Read directions carefully} \\hfill {\\textbf{DO NOT UNFOLD THIS SHEET} }\\hfill{\\textbf{Score   Initials}\n"
				+ "\\\\\n"
				+ "\\noindent \\textbf{before beginning test} \\hfill{\\textbf{UNTIL TOLD TO BEGIN}}\n"
				+ "\\\\\n" + "\\\\\n"
				+ "\\textbf{Directions}:  Do not turn this page until the person conducting this test gives the signal to begin. This is a ten-minute test. There are 80 problems. Solve accurately and quickly as many as you can in the order in which they appear. ALL  PROBLEMS  ARE  TO  BE SOLVED   MENTALLY.  Make  no  calculations with paper and  pencil.  Write only the answer  in the space provided at the end of each problem.  Problems marked with a  ( * )  require approximate integral answers;  any answer to a starred problem  that is within five percent of the exact answer will be scored correct; all other problems require exact answers.\n"
				+ "\\\\\n\n" + "\\textbf{The person conducting this contest should explain these directions to the contestants.}\n\n"
				+ "\\center{\\textbf{STOP -- WAIT FOR SIGNAL!}}\n\n\n" + "\\doublespace\n\\begin{multicols}{2}\n\\begin{flushleft}");
		for (int i = 1; i <= 80; i++) {
			if (i % 10 == 0) {// Estimation problems
				Estimation estimate = new Estimation(i);
				answers.add(String.valueOf(estimate.getAnswer()));
				questions.add(("(" + i + ") " + estimate.getMess()));
				for (int q = 0; q < 60 - estimate.getMess().length(); q++) {
					//System.out.print("\\textunderscore");
				}
				//System.out.println();
				//System.out.println();
				continue;
			}
			
			if (i < 21) {
				int random = rand.nextInt(14) + 1;
				// random = scan.nextInt();
				if (random == 1) {// addition of two integers
					int rand1_1 = rand.nextInt(16) + 1;
					
					if (rand1_1 == 1) {// addition of two integers
						Addition add1 = new Addition();
						;
						answers.add(String.valueOf(add1.sum));
						String printmess = ("$ " + "(" + i + ") " + add1.num1 + "+" + add1.num2 + " = " + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 2) {// addition of two mixed numbers
						Addmix addmix = new Addmix();
						answers.add(String.valueOf(addmix.summix));
						String printmess = ("$ " + "(" + i + ") " + addmix.addmix + "\\frac{" + addmix.addfracn + "}{"
								+ addmix.addfracd + "} " + "+" + addmix.addmix2 + "\\frac{" + addmix.addfracn2 + "}{"
								+ addmix.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 3) {// addition of two improper fractions
						AddImpro addimpro = new AddImpro();
						answers.add(String.valueOf(addimpro.sumimpro));
						String printmess = ("$ " + "(" + i + ") " + "\\frac{" + addimpro.addfracn + "}{"
								+ addimpro.addfracd + "} " + "+" + "\\frac{" + addimpro.addfracn2 + "}{"
								+ addimpro.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 4) {// addition of two decimals
						AddDeci adddeci = new AddDeci();
						answers.add(String.valueOf(adddeci.sumdeci));
						String printmess = ("$ " + "(" + i + ") " + ((int) adddeci.adddeci / 100.0) + "+"
								+ ((int) adddeci.adddeci2 / 100.0) + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 5) {// subtraction of two integers
						Addition sub1 = new Addition();
						answers.add(String.valueOf(sub1.d));
						String printmess = ("$ " + "(" + i + ") " + sub1.num1 + "-" + sub1.num2 + " = " + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();

					}
					if (rand1_1 == 6) {// subtraction of two mixed numbers
						Addmix submix = new Addmix();
						answers.add(String.valueOf(submix.dmix));
						String printmess = ("$ " + "(" + i + ") " + submix.addmix + "\\frac{" + submix.addfracn + "}{"
								+ submix.addfracd + "} " + "-" + submix.addmix2 + "\\frac{" + submix.addfracn2 + "}{"
								+ submix.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 7) {// subtract two improper fractions
						AddImpro subimpro = new AddImpro();
						answers.add(String.valueOf(subimpro.dimpro));
						String printmess = ("$ " + "(" + i + ") " + "\\frac{" + subimpro.addfracn + "}{"
								+ subimpro.addfracd + "} " + "-" + "\\frac{" + subimpro.addfracn2 + "}{"
								+ subimpro.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 8) {// subtract two decimals
						AddDeci subdeci = new AddDeci();
						answers.add(String.valueOf(subdeci.ddeci));
						String printmess = ("$ " + "(" + i + ") " + ((int) subdeci.adddeci / 100.0) + "-"
								+ ((int) subdeci.adddeci2 / 100.0) + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 9) {// multiplication of two integers
						Addition mult1 = new Addition();
						answers.add(String.valueOf(mult1.p));
						String printmess = ("$ " + "(" + i + ") " + mult1.num1 / 10 + "\\cdot" + mult1.num2 / 10 + " = "
								+ "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 10) {// multiplication of two mixed numbers
						Addmix multmix = new Addmix();
						answers.add(String.valueOf(multmix.pmix));
						String printmess = ("$ " + "(" + i + ") " + multmix.addmix / 1000 + "\\frac{" + multmix.addfracn
								+ "}{" + multmix.addfracd + "} " + "\\cdot" + multmix.addmix2 / 1000 + "\\frac{"
								+ multmix.addfracn2 + "}{" + multmix.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 11) {// multiplication of two improper fractions
						AddImpro multimpro = new AddImpro();
						answers.add(String.valueOf(multimpro.pimpro));
						String printmess = ("$ " + "(" + i + ") " + "\\frac{" + multimpro.addfracn + "}{"
								+ multimpro.addfracd + "} " + "\\cdot" + "\\frac{" + multimpro.addfracn2 + "}{"
								+ multimpro.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 12) {// multiplication of two decimals
						AddDeci multdeci = new AddDeci();
						answers.add(String.valueOf(multdeci.pdeci));
						String printmess = ("$ " + "(" + i + ") " + ((int) (multdeci.adddeci / 100) / 100.0) + "\\cdot"
								+ ((int) (multdeci.adddeci2 / 100) / 100.0) + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 13) {// division of two integers
						Addition div1 = new Addition();
						String printmess = ("$ " + "(" + i + ") " + div1.num1 / 100 + "\\div" + div1.num2 / 100 + " = "
								+ "$");
						answers.add(String.valueOf(div1.q));
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 14) {// division of two mixed numbers
						Addmix divmix = new Addmix();
						answers.add(String.valueOf(divmix.qmix));
						String printmess = ("$ " + "(" + i + ") " + divmix.addmix / 1000 + "\\frac{" + divmix.addfracn
								+ "}{" + divmix.addfracd + "} " + "\\div" + divmix.addmix2 / 1000 + "\\frac{"
								+ divmix.addfracn2 + "}{" + divmix.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 15) {// division of two improper fractions
						AddImpro divimpro = new AddImpro();
						answers.add(String.valueOf(divimpro.qimpro));
						String printmess = ("$ " + "(" + i + ") " + "\\frac{" + divimpro.addfracn + "}{"
								+ divimpro.addfracd + "} " + "\\div" + "\\frac{" + divimpro.addfracn2 + "}{"
								+ divimpro.addfracd2 + "}" + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
					if (rand1_1 == 16) {// division of two decimals
						AddDeci divdeci = new AddDeci();
						answers.add(String.valueOf(divdeci.qdeci));
						String printmess = ("$ " + "(" + i + ") " + ((int) divdeci.adddeci / 10.0) + "\\div"
								+ ((int) divdeci.adddeci2 / 10.0) + "=" + "$");
						questions.add(printmess);//System.out.print(printmess);
						/*for (int q = 0; q < 60 - printmess.length(); q++) {
							//System.out.print("\\textunderscore");
						}*/
						//System.out.println();
						//System.out.println();
					}
				}
				if (random == 2) {// order of operation
					OofO ooo = new OofO();
					String printmess = ("(" + i + ")" + ooo.fstringmess());
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					answers.add(String.valueOf(ooo.outsolution));
					//System.out.println();
					//System.out.println();
					
				}

				if (random == 3) {// Distributive problems
					Distribution distro = new Distribution();
					String printmess = ("(" + i + ")" + distro.getMess());
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					answers.add(String.valueOf(distro.getAnswer()));
					//System.out.println();
					//System.out.println();
					
				}

				if (random == 4) {// comparison
					Addmix compare = new Addmix();
					int comparison = rand.nextInt(2) + 1;
					String printmess = "";
					if (comparison == 1) {
						printmess = ("(" + i + ")" + "Which is greater, " + "$\\frac{" + compare.addfracn + "}{"
								+ compare.addfracd + "} or " + (double) ((int) (compare.addmix2 / 100)) / 100 + "$");
						if ((1.0 * compare.addfracn / compare.addfracd) > (double) ((int) (compare.addmix2 / 100))
								/ 100) {
							answers.add(String.valueOf((1.0 * compare.addfracn / compare.addfracd)));
						} else {
							answers.add(String.valueOf((double) ((int) (compare.addmix2 / 100)) / 100));
						}
					} else {
						printmess = ("(" + i + ")" + "Which is greater, " + "$\\frac{" + compare.addfracn + "}{"
								+ compare.addfracd + "} or " + "\\frac{" + compare.addfracn2 + "}{" + compare.addfracd2
								+ "}" + "$");
						if ((1.0 * compare.addfracn / compare.addfracd) > (1.0 * compare.addfracn2
								/ compare.addfracd2)) {
							answers.add(String.valueOf((1.0 * compare.addfracn / compare.addfracd)));
						} else {
							answers.add(String.valueOf((1.0 * compare.addfracn2 / compare.addfracd2)));
						}
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 5) {// multiplication shortcuts
					multshort multshort = new multshort();
					String printmess = ("(" + i + ") " + multshort.multishort());
					answers.add(String.valueOf(multshort.getAns()));
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 6) {// squaring numbers
					double square = rand.nextInt(65) + 1;
					answers.add(String.valueOf(square * square));
					String printmess = ("$(" + i + ")" + (int) square + "^{2}$");
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}

				if (random == 7) {// conversion
                    Conversion convert = new Conversion();
					String printmess = convert.getQuestion();
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}

				if (random == 8) {// gcf and lcm
					LCMandGCF gcf = new LCMandGCF();
					int choose = rand.nextInt(4) + 1;
					int num1 = rand.nextInt(20) + 2;
					int num2 = rand.nextInt(120) + num1;
					int num3 = rand.nextInt(20) + 2;
					String printmess = "";
					if (choose == 1) {// gcf of two
						printmess = ("(" + i + ")" + "The GCF of " + num1 + " and " + num2 + " is");
						answers.add(String.valueOf(1.0 * gcf.GCF(num1, num2)));
					}
					if (choose == 2) {// lcm of two
						printmess = ("(" + i + ")" + "The LCM of " + num1 + " and " + num2 + " is");
						answers.add(String.valueOf(1.0 * gcf.LCM(num1, num2)));
					}
					if (choose == 3) {// gcf of three
						printmess = ("(" + i + ")" + "The GCF of " + num1 + ", " + num2 + ", and " + num3 + " is");
						answers.add(String.valueOf(1.0 * gcf.GCF3(num1, num2, num3)));
					}
					if (choose == 4) {// lcm of three
						printmess = ("(" + i + ")" + "The LCM of " + num1 + ", " + (num1 * 1.5) + ", and " + (num1 * 2)
								+ " is");
						answers.add(String.valueOf(6.0 * num1));
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 9) {// percent problems
					int percent = (rand.nextInt(15) + 1) * 10;
					int percent2 = (rand.nextInt(15) + 1) * 10;
					answers.add(String.valueOf(1.0 * percent * percent2 / 100));
					String printmess = ("(" + i + ") P is " + percent + "\\% of Q. Q is " + +percent2
							+ "\\% of R. What percent is P of R?");
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 10) {// mean, mode, and median problems
					ArrayList<Integer> integer = new ArrayList<>();
					int sum = 0;
					int choose = rand.nextInt(3) + 1;
					String printmess = "";
					String charseries = "";
					if (choose == 1) {// mean
						int length = rand.nextInt(4) + 2;
						for (int p = 0; p < length; p++) {
							integer.add(rand.nextInt(40) + 1);
							sum = integer.get(p) + sum;
						}
						for (int p = 0; p < integer.size(); p++) {
							charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
						}
						printmess = ("(" + i + ") What is the mean of " + charseries);
						answers.add(String.valueOf(1.0 * sum / integer.size()));
					} else if (choose == 2) {// median
						int length = rand.nextInt(4) + 3;
						for (int p = 0; p < length; p++) {
							integer.add(rand.nextInt(40) + 1);
							// sum = integer.get(p) + sum;
						}
						for (int p = 0; p < integer.size(); p++) {
							if (!(p == integer.size() - 1)) {
								charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
							} else {
								charseries = (charseries + String.valueOf(integer.get(p)));
							}
						}
						Collections.sort(integer);
						double median;
						if (integer.size() % 2 == 0)
							median = (((double) integer.get(integer.size() / 2)
									+ (double) integer.get(integer.size() / 2 - 1)) / 2);
						else {
							median = (double) integer.get(integer.size() / 2);
						}
						printmess = ("(" + i + ") What is the median of " + charseries);
						answers.add(String.valueOf(median));
					} else if (choose == 3) {// mode
						int length = rand.nextInt(3) + 6;
						for (int p = 0; p < length; p++) {
							integer.add(rand.nextInt(5) + 1);
							sum = integer.get(p) + sum;
						}
						for (int p = 0; p < integer.size(); p++) {
							charseries = (charseries + String.valueOf(integer.get(p)) + " , ");
						}
						mode Mode = new mode();
						answers.add(String.valueOf(1.0 * Mode.getMode(integer)));
						printmess = ("(" + i + ") What is the mode of " + charseries);
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 11) {// Sums of Integers
					ArrayList<Integer> integer = new ArrayList<>();
					int sum = 0;
					int length = rand.nextInt(5) + 1;
					for (int p = 0; p < length; p++) {
						integer.add(rand.nextInt(5) + 1);
					}
					for (int p = 0; p < length; p++) {
						sum = integer.get(p) + sum;
					}
					answers.add(String.valueOf(1.0 * sum));
					String charseries = "";
					for (int p = 0; p < integer.size(); p++) {
						charseries = (charseries + String.valueOf(integer.get(p)) + " + ");
					}
					String printmess = ("(" + i + ")" + charseries + "0");
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 12) {// Remainder Problems
					int dividend = rand.nextInt(10) + 3;
					int number = rand.nextInt(89999) + 10000;
					String printmess = "";
					if (dividend <= 10) {
						if (dividend == 7) {// traditional
							number = rand.nextInt(8999) + 1000;
						}
						printmess = ("(" + i + ") What is the remainder of " + number + "$\\div$" + dividend + "?");
						answers.add(String.valueOf(1.0 * (number % dividend)));
					} /*else if (dividend == 12) {// power
						int base = rand.nextInt(12) + 2;
						int power = rand.nextInt(12) + 2;
						printmess = ("(" + i + ") What is the remainder of $" + base + "^{" + power + "}" + "\\div"
								+ dividend + "?$");
						double exponentr = Math.pow(base, power);
						answers.add(String.valueOf(exponentr % dividend));
						*/
					//}
					else if (dividend == 12) {// expression
						OofO remainderex = new OofO();
						printmess = ("(" + i + ") What is the remainder of " + remainderex.remainder() + "$\\div"
								+ dividend + "?$");
						answers.add(String.valueOf(remainderex.outsolution % dividend));
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 13) {// Consumer Type Problems
					double price = 0;
					double postPrice = 0;
					String printmess = "";
					int oz = 0;
					double pounds = 0;
					int choose = rand.nextInt(2) + 1;
					if(choose == 1) {
						oz = (int) Math.pow(2, rand.nextInt(3) + 1);
						price = (rand.nextInt(71) + 31)/100.0;
						pounds = .5 * (rand.nextInt((int) (Math.log(oz)/Math.log(2))) + 1);
						postPrice = price * 16 * pounds / oz;
					}
					if(choose == 2) {
						oz = rand.nextInt(10) + 3;
						price = .01 * oz * (rand.nextInt(9) + 5);
						pounds = .5 * (rand.nextInt(3) + 1);
						postPrice = price * 16 * pounds / oz;
					}
					if(choose == 1) {
						printmess = "(" + i + ") If " + oz + " oz of a liquid costs \\$ " + price + " then how much does " + pounds + "cost?";
						answers.add(String.valueOf(postPrice));
					}
					if(choose == 2) {
						printmess = "(" + i + ") If " + pounds + " pounds of a liquid costs \\$ " + postPrice + " then how much does " + oz + " oz cost?";
						answers.add(String.valueOf(pounds));
					}
					choose = rand.nextInt(2) + 1;
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 14) {// Number Theory Problems Involving: Prime Numbers, Divisors, Sums of Divisors,
									// etc.
					int choose = rand.nextInt(15) + 1;
					int base = rand.nextInt(100) + 21;
					PrimeDivisors primes = new PrimeDivisors();
					SumOfDivisors composite = new SumOfDivisors();
					Relativeprimeundern relative = new Relativeprimeundern();
					String printmess = "";
					if (choose == 1) {// number of prime divisors
						printmess = ("(" + i + ") How many prime divisors in " + base + "?");
						answers.add(String.valueOf(primes.prime(base).size()));
					}
					if (choose == 2) {// sum of prime divisors
						printmess = ("(" + i + ") What is the sum of the prime divisors " + base + "?");
						answers.add(String.valueOf(primes.primesum(base)));
					}
					if (choose == 3) {// number of composite integers
						printmess = ("(" + i + ") How many divisors does " + base + " have?");
						answers.add(String.valueOf(composite.num(base)));
					}
					if (choose == 4) {// sum of composite integers
						printmess = ("(" + i + ") What is the sum of the composite integers in " + base + "?");
						answers.add(String.valueOf(composite.sum(base)));
					}
					if (choose == 5) {// number of prime divisors under n
						printmess = ("(" + i + ") How many prime divisors under " + base + " does " + base + " have?");
						answers.add(String.valueOf(relative.count(base)));
					}
					if (choose == 6) {// sum of prime divisors under n
						printmess = ("(" + i + ") What is the sum of the composite integers in " + base + "?");
						answers.add(String.valueOf(relative.sum(base)));
					}
					if(choose == 7){//abundant number
                        ArrayList<Integer> series1 = new ArrayList<>();
                        series1.add(12);
                        series1.add(18);
                        series1.add(20);
                        series1.add(24);
                        series1.add(30);
                        series1.add(36);
                        series1.add(40);
                        series1.add(42);
                        series1.add(48);
                        series1.add(54);
                        series1.add(56);
                        series1.trimToSize();
                        numberTypes abundant = new numberTypes(series1, "abundant");
                        printmess = ("(" + i + ") " + abundant.GenerateQuestion());
                        answers.add(String.valueOf(abundant.getAnswer()));
					}
					if(choose == 8){//deficient number
                        ArrayList<Integer> series2 = new ArrayList<>();
                        series2.add(1);
                        series2.add(2);
                        series2.add(3);
                        series2.add(4);
                        series2.add(5);
                        series2.add(7);
                        series2.add(8);
                        series2.add(9);
                        series2.add(10);
                        series2.add(11);
                        series2.add(13);
                        series2.trimToSize();
                        numberTypes deficient = new numberTypes(series2, "deficient");
                        printmess = ("(" + i + ") " + deficient.GenerateQuestion());
                        answers.add(String.valueOf(deficient.getAnswer()));

					}
					if(choose == 9){//perfect number
                        ArrayList<Integer> series3 = new ArrayList<>();
                        series3.add(6);
                        series3.add(28);
                        series3.add(496);
                        series3.trimToSize();
                        numberTypes perfect = new numberTypes(series3, "perfect");
                        printmess = ("(" + i + ") " + perfect.GenerateQuestion());
                        answers.add(String.valueOf(perfect.getAnswer()));

					}
                    ArrayList<Integer> lucky = new ArrayList<>();//ArrayList for lucky and its inverse
                    lucky.add(2);
                    lucky.add(3);
                    lucky.add(5);
                    lucky.add(11);
                    lucky.add(17);
                    lucky.add(41);
                    lucky.trimToSize();
					if(choose == 10){//lucky number
                        numberTypes luckyType = new numberTypes(lucky, "lucky");
                        printmess = ("(" + i + ") " + luckyType.GenerateQuestion());
                        answers.add(String.valueOf(luckyType.getAnswer()));

					}
					if(choose == 11){//unlucky number
                        ArrayList<Integer> series5 = new ArrayList<>();
                        for(int p = 1; p < 90; p++){
                            if(lucky.indexOf(p) == -1){
                                series5.add(p);
                            }
                        }
                        series5.trimToSize();
                        numberTypes unlucky = new numberTypes(series5, "unlucky");
                        printmess = ("(" + i + ") " + unlucky.GenerateQuestion());
                        answers.add(String.valueOf(unlucky.getAnswer()));

					}
					ArrayList<Integer> happy = new ArrayList<>();//ArrayList for happy and its inverse
                        happy.add(1);
                        happy.add(7);
                        happy.add(10);
                        happy.add(13);
                        happy.add(19);
                        happy.add(23);
                        happy.add(28);
                        happy.add(31);
                        happy.add(32);
                        happy.add(44);
                        happy.add(49);
                        happy.add(68);
                        happy.add(70);
                        happy.add(79);
                        happy.add(82);
                        happy.add(86);
                        happy.trimToSize();
					if(choose == 12){//happy number
                        numberTypes happyType = new numberTypes(happy, "happy");
                        printmess = ("(" + i + ") " + happyType.GenerateQuestion());
                        answers.add(String.valueOf(happyType.getAnswer()));

					}
					if(choose == 13){//unhappy number
                        ArrayList<Integer> series6 = new ArrayList<>();
                        for(int l = 0; l < 90; l++){
                            if(happy.indexOf(l) == -1){
                                series6.add(l);
                            }
                        }
                        series6.trimToSize();
                        numberTypes unhappy = new numberTypes(series6, "unhappy");
                        printmess = ("(" + i + ") " + unhappy.GenerateQuestion());
                        answers.add(String.valueOf(unhappy.getAnswer()));

					}
					if(choose == 14){//odious number
                        ArrayList<Integer> series7 = new ArrayList<>();
                        series7.add(1);
                        series7.add(2);
                        series7.add(4);
                        series7.add(7);
                        series7.add(8);
                        series7.add(11);
                        series7.add(13);
                        series7.add(14);
                        series7.add(16);
                        series7.add(19);
                        series7.trimToSize();
                        numberTypes odious = new numberTypes(series7, "odious");
                        printmess = ("(" + i + ") " + odious.GenerateQuestion());
                        answers.add(String.valueOf(odious.getAnswer()));

					}
					if(choose == 15){//evil number
                        ArrayList<Integer> series8 = new ArrayList<>();
                        series8.add(0);
                        series8.add(3);
                        series8.add(5);
                        series8.add(6);
                        series8.add(9);
                        series8.add(10);
                        series8.add(12);
                        series8.add(15);
                        series8.add(17);
                        series8.add(18);
                        series8.add(20);
                        series8.trimToSize();
                        numberTypes evil = new numberTypes(series8, "evil");
                        printmess = ("(" + i + ") " + evil.GenerateQuestion());
                        answers.add(String.valueOf(evil.getAnswer()));
                        questions.add(printmess);

					}
					//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
			}
			if (i > 20 && i < 41) {// Questions 21-40
				int random = rand.nextInt(46) + 1;
				if (random == 15 || random == 16) {// power of numbers
					String printmess = "";
					int base = rand.nextInt(19) + 2;
					int power = 0;
					if (base == 2) {
						power = rand.nextInt(8) + 3;
					} else if (base == 3) {
						power = rand.nextInt(4) + 3;
					} else {
						power = 3;
					}
					printmess = ("(" + i + ") What is " + base + "$^{" + power + "}" + "?$");
					double exponentr = Math.pow(base, power);
					answers.add(String.valueOf(exponentr));
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 17 || random == 18) {// substitution
//					String printmess = "";
//					int base = rand.nextInt(12) + 2;
//					int power = rand.nextInt(12) + 2;
//					printmess = ("(" + i + ") What is " + base + "^{" + power + "}" + "?$");
//					double exponentr = Math.pow(base, power);
//					answers.add(String.valueOf(exponentr));
//					questions.add(printmess);//System.out.print(printmess);
//					for (int q = 0; q < 60 - printmess.length(); q++) {
//						//System.out.print("\\textunderscore");
//					}
//					//System.out.println();
//					//System.out.println();
//						
				}
				if (random == 19 || random == 20) {// Word Problems
//					String printmess = "";
//					int base = rand.nextInt(12) + 2;
//					int power = rand.nextInt(12) + 2;
//					printmess = ("(" + i + ") What is " + base + "^{" + power + "}" + "?$");
//					double exponentr = Math.pow(base, power);
//					answers.add(String.valueOf(exponentr));
//					questions.add(printmess);//System.out.print(printmess);
//					for (int q = 0; q < 60 - printmess.length(); q++) {
//						//System.out.print("\\textunderscore");
//					}
//					//System.out.println();
//					//System.out.println();
//						
				}

				if (random == 21 || random == 22) {// Inverses
					int choose = rand.nextInt(2) + 1;
					String printmess = "";
					double denominator = (rand.nextInt(500) + 20) / 10;
					if (choose == 0) {
						printmess = ("(" + i + ") What is the mutliplicative reciprocal of " + denominator + "?");
						answers.add(String.valueOf(1.0 / denominator));
					} else {
						denominator = rand.nextInt(21) - 10;
						printmess = ("(" + i + ") What is the additive reciprocal of " + denominator + "?");
						answers.add(String.valueOf(-1 * denominator));
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 60 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 23 || random == 24) {// Absolute value
					Absolute ooo = new Absolute();
					String printmess = ("$(" + i + ")" + "" + ooo.abolute());
					questions.add(printmess);//System.out.print(printmess);
					answers.add(String.valueOf(1.0 * ooo.outsolution));
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 25 || random == 26) {// Proportions
//					Absolute ooo = new Absolute();
//					String printmess = ("$(" + i + ")" + "" + ooo.abolute());
//					questions.add(printmess);//System.out.print(printmess);
//					answers.add(String.valueOf(1.0 * ooo.outsolution));
//					for (int q = 0; q < 50 - printmess.length(); q++) {
//						//System.out.print("\\textunderscore");
//					}
//					//System.out.println();
//					//System.out.println();
//					
				}
				if (random == 27 || random == 28) {// Square roots/ cube roots
					int choose = rand.nextInt(2) + 1;
					String printmess = "";
					int base = 0;
					if (choose == 1) {
						base = rand.nextInt(65) + 1;
						printmess = ("(" + i + ")" + "$\\sqrt{" + Math.pow(base, 2) + "}=$");
					}
					if (choose == 2) {
						base = rand.nextInt(20) + 1;
						printmess = ("(" + i + ")" + "$" + Math.pow(base, 3) + "^{\\frac{1}{3}}=$");
					}
					questions.add(printmess);//System.out.print(printmess);
					answers.add(String.valueOf(1.0 * base));
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 29 || random == 30) {// Sets
					Set<String> setA = new HashSet<String>();
					Set<String> setB = new HashSet<String>();
					ArrayList<String> array1 = new ArrayList<>();
					ArrayList<String> array2 = new ArrayList<>();
					int length = rand.nextInt(2) + 5;
					for (int q = 0; q < length; q++) {
						array1.add(String.valueOf(rand.nextInt(10)));
					}
					length = rand.nextInt(2) + 5;
					for (int q = 0; q < length; q++) {
						array2.add(String.valueOf(rand.nextInt(7)));
					}
					setA.addAll(array1);
					setB.addAll(array2);
					int choose = rand.nextInt(6) + 1;
					String printmess = "";
					if (choose == 1) {// union
						Set<String> union = new HashSet<String>(setA);
						union.addAll(setB);
						printmess = ("(" + i + ") How many elements are in the union of " + setA + " and " + setB
								+ "?");
						
						answers.add(String.valueOf(1.0 * union.size()));
					}
					if (choose == 2) {// intercept
						Set<String> intersection = new HashSet<String>(setA);
						intersection.retainAll(setB);
						printmess = ("(" + i + ") How many elements are in the intercept of " + setA + " and " + setB
								+ "?");
						
						answers.add(String.valueOf(1.0 * (intersection.size())));
					}
					if (choose == 3) {// proper
						printmess = ("(" + i + ") How many proper subsets are in " + setA + "?");
						
						answers.add(String.valueOf(1.0 * Math.pow(2, setA.size()) - 1));
					}
					if (choose == 4) {// improper
						printmess = ("(" + i + ") How many improper subsets are in " + setA + "?");
						
						answers.add(String.valueOf(1.0));
					}
					if (choose == 5) {// choose
						Combinations chose = new Combinations();
						int chooselength = rand.nextInt(2) + 1;
					       	int doublechoose = rand.nextInt(2) + 1;
						if (doublechoose == 1) {
							printmess = ("(" + i + ") How many subsets with length " + chooselength + " are there in "
									+ setA + "?");
							
							answers.add(String.valueOf(1.0 * chose.choose(setA.size(), chooselength)));
						} else if (doublechoose == 2) {
							printmess = ("(" + i + ") How many subsets with length " + chooselength + " are there in "
									+ setA + " + subsets of length " + (setA.size() - chooselength) + " in " + setA
									+ "?");
							
							answers.add(String.valueOf(2.0 * chose.choose(setA.size(), chooselength)));
						}
					}
					if (choose == 6) {// number of subsets
						printmess = ("(" + i + ") How many subsets are there in " + setA + "?");
						
						answers.add(String.valueOf(1.0 * Math.pow(2, setA.size())));
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
				}
				if (random == 31 || random == 32) {// Bases
					int choose = rand.nextInt(3) + 1;
					baseconvert basec = new baseconvert();
					String printmess = "";
					int base = rand.nextInt(11) + 2;
					int ognumber = 0;
					String newnum = "";
					if (choose == 1) {
						ognumber = rand.nextInt(104) + 5;
						printmess = ("(" + i + ") What is " + ognumber + " in base " + base);
						answers.add(String.valueOf(basec.newnum(ognumber, base)));
					}
					if (choose == 2) {
						ognumber = rand.nextInt(104) + 5;
						newnum = basec.newnum(ognumber, base);
						printmess = ("(" + i + ") What is $" + newnum + "_ {" + base + "}$ in base 10");
						answers.add(String.valueOf(1.0 * ognumber));
					}
					if (choose == 3) {
						ognumber = rand.nextInt(104) + 5;
						int choose2 = (int) Math.pow(2, rand.nextInt(3) + 1);
						int secondchoose2 = (int) Math.pow(2, rand.nextInt(3) + 1);
						newnum = basec.newnum(ognumber, choose2);
						printmess = ("(" + i + ") What is $" + newnum + "_{" + choose2 + "}$ in base " + secondchoose2);
						answers.add(String.valueOf(basec.newnum(basec.ognum(newnum, choose2), secondchoose2)));
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if (random == 33 || random == 34) {// Solving Simple Equations
					int x1 = rand.nextInt(6) + 1;
					int x2 = rand.nextInt(6) + 1;
					int y1 = rand.nextInt(6) + 1;
					int y2 = rand.nextInt(6) + 1;
					int equal1 = rand.nextInt(10) + 1;
					int equal2 = rand.nextInt(10) + 1;
					String sign1 = "";
					String sign2 = "";
					String solve = "";
					int choose = rand.nextInt(2) + 1;
					if (choose == 1) {
						sign1 = " + ";
					}
					if (choose == 2) {
						sign1 = " - ";
					}
					choose = rand.nextInt(2) + 1;
					if (choose == 1) {
						sign2 = " - ";
					}
					if (choose == 2) {
						sign2 = " + ";
					}
					choose = rand.nextInt(2) + 1;
					if (choose == 1) {
						solve = " x ";
					}
					if (choose == 2) {
						solve = " y ";
					}
					String printmess = "";
					printmess = ("(" + i + ")" + "$" + x1 + "x" + sign1 + y1 + "y " + " = " + equal1 + " , " + x2 + "x"
							+ sign2 + y2 + "y " + " = " + equal2 + "$ What is the value of " + solve);
					if (sign2.contains("-") && sign1.contains("+")) {
						if (solve.contains("x")) {
							double ratio = y1 / y2;
							double newequal = equal1 + (ratio * equal2);
							double newx = x1 + (ratio * x2);
							answers.add(String.valueOf(newequal / newx));
						}
						if (solve.contains("y")) {
							double ratio = x1 / x2;
							double newequal = equal1 + (ratio * equal2);
							double newy = y1 + (ratio * y2);
							answers.add(String.valueOf(newequal / newy));
						}
					}
					if (sign2.contains("+") && sign1.contains("+")) {
						if (solve.contains("x")) {
							double ratio = -1.0 * y1 / y2;
							double newequal = equal1 + (ratio * equal2);
							double newx = x1 + (ratio * x2);
							answers.add(String.valueOf(newequal / newx));
						}
						if (solve.contains("y")) {
							double ratio = -1.0 * x1 / x2;
							double newequal = equal1 + (ratio * equal2);
							double newy = y1 + (ratio * y2);
							answers.add(String.valueOf(newequal / newy));
						}
					}
					if (sign2.contains("+") && sign1.contains("-")) {
						if (solve.contains("x")) {
							double ratio = y2 / y1;
							double newequal = equal2 + (ratio * equal1);
							double newx = x2 + (ratio * x1);
							answers.add(String.valueOf(newequal / newx));
						}
						if (solve.contains("y")) {
							double ratio = x2 / x1;
							double newequal = equal2 + (ratio * equal1);
							double newy = y2 - (ratio * y1);
							answers.add(String.valueOf(newequal / newy));
						}
					}
					if (sign2.contains("-") && sign1.contains("-")) {
						if (solve.contains("x")) {
							double ratio = -1.0 * y1 / y2;
							double newequal = equal1 + (ratio * equal2);
							double newx = x1 + (ratio * x2);
							answers.add(String.valueOf(newequal / newx));
						}
						if (solve.contains("y")) {
							double ratio = -1.0 * x1 / x2;
							double newequal = equal1 + (ratio * equal2);
							double newy = y1 + (ratio * y2);
							answers.add(String.valueOf(newequal / newy));
						}
					}
					questions.add(printmess);//System.out.print(printmess);
					/*for (int q = 0; q < 50 - printmess.length(); q++) {
						//System.out.print("\\textunderscore");
					}*/
					//System.out.println();
					//System.out.println();
					
				}
				if(random == 35 || random == 36){//system of equations
				
				}
				if(random == 37 || random == 38){//repeating decimal to fraction
				
				}
				// power
				if(random == 39 || random ==40){//I think this is more remainder problems
                    int dividend = rand.nextInt(4) + 3;
                    int base = rand.nextInt(12) + 2;
                    int power = rand.nextInt(12) + 2;
                    String printmess = ("(" + i + ") What is the remainder of $" + base + "^{" + power + "}" + "\\div"
                            + dividend + "?$");
                    double exponentr = Math.pow(base, power);
                    questions.add(printmess);
                    answers.add(String.valueOf(exponentr % dividend));
				
				}
            
				// chance for earlier problems
			}
			//chances for further problems
        }
		while(questions.size() <= 80){
			questions.add("0");
		}
		while(answers.size() <= 80){
			answers.add("0");
		}
		questions.trimToSize();
		answers.trimToSize();
		for(String e: questions){
            System.out.print(e);
			for(int q = 0; q < 60 - questions.size(); q++){
				System.out.print("\\textunderscore");
			}
			System.out.print("\n\n");
		}
		System.out.println("\\end{flushleft}\\end{multicols}");
		System.out.println("\\clearpage\n\\begin{multicols}{4}\n\\doublespace");
		int i = 1;
		for(String e: answers){
            System.out.print(i + ") " + e + "\n\n");
            i++;
		}
		System.out.println("\\enddoublespace\n\\end{multicols}");
		System.out.println("\\enddoublespace"+ "\\end{document}");
	}
}
