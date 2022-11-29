import java.util.ArrayList;
import java.util.Collections;
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// public class HomeTask03 {
//     public static void main(String[] args){
//         ArrayList<Integer> number = new ArrayList<>();
       
//         number.add(1);
//         number.add(2);
//         number.add(3);
//         number.add(4);
//         number.add(5);
//         System.out.println(number);
        
//          for (int i=0;i<number.size();i++){      
//             int even=number.get(i)%2;       
//              if (even==0){
//                  System.out.println("This is Even Number:"+ number.get(i));
//                  number.remove(i);
//              }    
//          }
//          System.out.println(number);
//     }
// }



// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// public class HomeTask03 {
//     public static void main(String[] args){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(4);
//         list.add(3);
//         list.add(6);
        
//         System.out.println("Max value is " + Collections.max(list));
//         System.out.println("Min value is " + Collections.min(list));
//         System.out.println("Average value is " + average(list));
//     }
//     static double average (ArrayList<Integer> list) {
        
//         double sum = 0;
        
//         for(int i=0;i<list.size();i++) {
//             sum+=list.get(i);
//         }
        
//         return sum/list.size();
//     }

// }


// 3.Написать простой класс ТелефонныйСправочник, 
//который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() 
//можно добавлять записи. С помощью метода get() искать 
//номер телефона по фамилии. Следует учесть, что под одной 
//фамилией может быть несколько телефонов 
//(в случае однофамильцев), тогда при запросе такой фамилии 
//должны выводиться все телефоны.

import java.util.*;

public class HomeTask03 {
    public static void main(String[] args) {
    
    Phonebook phonebook = new Phonebook();

    phonebook.add("John", "33344");
    phonebook.add("Peter", "344");
    phonebook.add("Philipp", "344");
    phonebook.add("Philipp", "122");
    
    List<String> strings = phonebook.get("Philipp");
    System.out.println(strings);

    }
}  
 