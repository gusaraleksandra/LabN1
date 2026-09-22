```java
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Создаём Scanner для чтения данных с клавиатуры
      Scanner in = new Scanner(System.in);

      int x = in.nextInt(); // всего бананов
      int a = in.nextInt(); // нужно первому покупателю
      int b = in.nextInt(); // нужно второму покупателю
      int c = in.nextInt(); // нужно третьему покупателю

      int count = 0; // счётчик успешных покупок

      // Проверяем первого покупателя
      if (x >= a) {
         count++;
         x = x-a;
      }

      // Проверяем второго покупателя (независимо от результата первого)
      if (x >= b) {
         count++;
         x = x-b;
      }

      // Проверяем третьего покупателя (независимо от результата второго)
      if (x >= c) {
         count++;
         x = x-c;
      }

      System.out.println(count); // Выводим количество покупателей, которые смогли купить бананы

    }
}
