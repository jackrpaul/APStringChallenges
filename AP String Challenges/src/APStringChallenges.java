
public class APStringChallenges
	{
		static String alphabet;
		public static void main(String[] args)
			{
			alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			challenge1();
			alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			challenge2();
			alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			challenge3();
			alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			challenge4();
			challenge5();
			challenge6();	
			}
		private static void challenge1()
			{
			System.out.println(alphabet.replaceAll(" ", ""));	
			}

		private static void challenge2()
			{
			for(int i = 0; i < alphabet.length(); i++)
				{
				if (i%4 == 0)
					{
					System.out.print(alphabet.substring(i, i + 1).replaceAll(" ", "") + " ");
					}
				}
			System.out.println("");
			}

		private static void challenge3()
			{
				for(int i = 2; i < alphabet.length(); i+=4)
					{
						System.out.print(alphabet.substring(i, i + 1));
					}
				System.out.println("");
			}

		private static void challenge4()
			{
				for(int i = 0; i < alphabet.length(); i+=2)
					{
						System.out.println(alphabet.substring(i, i+1).replaceAll(" ", ""));
					}
			}

		private static void challenge5()
			{
				int charCounter = 0;
				for(int i = 0; i < alphabet.length(); i++)
					{
					charCounter++;
					}
				System.out.println("The number of characters is " + charCounter + ".");
			}

		private static void challenge6()
			{
				int spaceCounter = 0;
				for(int i = 1; i < alphabet.length(); i+=2)
					{
					spaceCounter++;
					}
				System.out.println("The number of spaces is " + spaceCounter + ".");
				
			}

	}
