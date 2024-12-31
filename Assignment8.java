/*************************************************************************
 * Compilation: javac RottenTomatoes.java
 * Execution: java RottenTomatoes
 *
 * @author:
 *
 *          RottenTomatoes creates a 2 dimensional array of movie ratings
 *          from the command line arguments and displays the index of the movie
 *          that has the highest sum of ratings.
 *
 *          java RottenTomatoes 3 2 5 2 3 3 4 1
 *          0
 *************************************************************************/

public class RottenTomatoes {

	public static void main(String[] args) {

		int[][] movies = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];

		int m = 2;
		// int p = 3;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// int first = 0;
		// int t = 0;

		for (int n = 0; n < a; n = n + 1) {

			for (int c = 0; c < b; c = c + 1) {

				int pass = Integer.parseInt(args[m]); // m is 2
				movies[n][c] = pass; // pass is [2][0]
				m = m + 1;

			}

			/*
			 * while (b > 0) { // we need to target args 2, 4, 6 for the first number
			 * int num = 0;
			 * num = Integer.parseInt(args[b+2]);
			 * counter = counter + a;
			 * }
			 */

		}
		/*
		 * for (int c = 0; c < b; c = c + 1) {
		 * 
		 * int pass = Integer.parseInt(args[p]);
		 * movies[0][c] = pass;
		 * a = a + 1;
		 * p = p + 2;
		 * }
		 */
		/*
		 * System.out.println(movies[0][0]);
		 * System.out.println(movies[0][1]);
		 * System.out.println(movies[1][0]);
		 * System.out.println(movies[1][1]);
		 * System.out.println(movies[2][0]);
		 * System.out.println(movies[2][1]);
		 */
		// System.out.println(movies[1].length);

		int[] totals = new int[b];

		for (int s = 0; s < b; s++) {
			int total = 0;

			for (int t = 0; t < a; t++) {
				total = total + movies[t][s];

				totals[s] = total;
			}
		}

		// System.out.println(totals[0]);
		/*
		 * 
		 * for (g = 0; g < a; g = g + 1) {
		 * 
		 * sums[g] = movies[g][h]+ movies[g][h];
		 * System.out.println(sums);
		 * }
		 * 
		 * 
		 */

		int d = 0;
		for (int e = 0; e < totals.length; e++) {
			if (totals[e] > d) {
				d = totals[e];
			}
		}

		int g = 0;
		for (int h = 0; h < totals.length; h++) {
			if (totals[h] == d) {
				System.out.println(h);
			}
		}

		// System.out.println(d);
		// System.out.println(movies.length);
		// System.out.println(movies[1].length);

	}
}

// System.out.println(first);
