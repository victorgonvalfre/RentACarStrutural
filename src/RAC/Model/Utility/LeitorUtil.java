package RAC.Model.Utility;

import java.util.Scanner;

public class LeitorUtil {
		
		private static Scanner leitorOpcao = new Scanner(System.in);
		
		public static Integer lervalorInteiro() {
			return  leitorOpcao.nextInt();
		}

		public static Double lervalorDouble() {
			return leitorOpcao.nextDouble();
		}
		
		public static String lervalorString() {
			return leitorOpcao.nextLine();
		}
}
