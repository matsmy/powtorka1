import java.lang.Math;
import java.util.Scanner;
class Main
  {
    public static void main(String[] args)
    {
      Scanner to = new Scanner (System.in);
      int zmienna = 2022;
      System.out.println("Obecnie jest rok " + zmienna + "r.\n");
      System.out.println("Podaj pierwsza liczbe: ");
      Scanner first = new Scanner (System.in);
      double a = first.nextDouble();
      System.out.println("\nPodaj druga liczbe: ");
      Scanner second = new Scanner (System.in);
      double b = second.nextDouble();
      double c = Math.pow(a, b);
      double d = a - b;
      System.out.println("Wynik odejmowania obu liczb to " + d + ", natomiast wynik potegowania to " + c);
    
    System.out.println("\n WYBIERZ CO CHCESZ ROBIC\n1. Piosenka1\n2.Piosenka2\n");
    int wybor = to.nextInt();
  
    
switch(wybor)
    {
    case 1:
        System.out.println("Zycie jak wysoka wieża\nTakie życie w morde jezaaaaaa");
      break;
  case 2:
        System.out.println("Zycie jak wysokie pole\nTakie zycie ja         pierdole");
        break;
    }
    }
  }