// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
public class HomeTask02 {
    
private static boolean isPolindrom(String targetStr){
    if (targetStr.length() == 1)
        return true;
    for (int i = 0; i < targetStr.length()/2; i++) {
        if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
            return false;
    }
    return true;
    }
 
public static void main(String[] args) {
    String [] arrStr = {"uwu", "rru" };
    for (String s: arrStr)
        if (isPolindrom(s))
            System.out.printf("%s - true \n", s);
        else
        System.out.printf("%s - false \n", s);
    }   
}    