package controlFlow;

public class CharSwitch {

  public static void checkChar() {

    char character = 'A';

    switch (character) {
      case 'A':
        System.out.println("It's A");
        break;
      case 'B':
        System.out.println("It's B");
        break;
      case 'C':
        System.out.println("It's C");
        break;
      case 'D':
        System.out.println("It's D");
        break;
      case 'E':
        System.out.println("It's E");
        break;
      default:
        System.out.println("Not found");
        break;
    }

  }
}
