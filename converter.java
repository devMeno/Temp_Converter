import java.util.Scanner;

public class converter {
     public static void main(String[] args) {
          String title = "CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT",
                    separator = "-------------------------------------------------",
                    order1 = "Quel mode de conversion choisissez vous?",
                    option1 = "1- Celsius en Fahrenheit",
                    option2 = "2- Fahrenheit en Celsius",
                    order2 = "Entrez votre valeur...",
                    result = "Votre résultat est : ",
                    otherConversion = "Avez-vous une autre conversion à faire? (O/N)",
                    correctChoice = "Veuillez entre un choix correct!",
                    goodBye = "A la prochaine!",
                    decision = "";
          Scanner sc = new Scanner(System.in);
          int vector;

          System.out.println(title);
          System.out.println(separator);

          do {
               System.out.println(order1);
               System.out.println(option1);
               System.out.println(option2);

               int choice = sc.nextInt();

               do {
                    if (choice != 1 && choice != 2) {
                         vector = 0;
                         System.out.println(correctChoice);
                         choice = sc.nextInt();
                    } else {
                         vector = 1;
                    }
               } while (vector == 0);

               System.out.println(order2);
               double temp = sc.nextDouble();
               double conversionValue;

               if (choice == 1) {
                    conversionValue = ((9 * temp) / 5) + 32;
                    System.out.println(result + conversionValue + "°F");
               } else {
                    conversionValue = ((temp - 32) * 5) / 9;
                    System.out.println(result + conversionValue + "°C");
               }

               System.out.println(otherConversion);
               decision = sc.nextLine();

          } while (decision == "O");

          System.out.println(goodBye);
          sc.close();
     }
}
