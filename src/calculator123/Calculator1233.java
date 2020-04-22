
package calculator123;

import java.util.Scanner;


public class Calculator1233 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = one();
        double b = two();
        char operation = znak();
        double itog = result(a , b, operation);
        System.out.print("Ответ: "+itog);
    }
public static double one(){
    System.out.print("Введите число: ");
    double num;
if(scanner.hasNextDouble()){
    num = scanner.nextDouble();
}
else{
    System.out.print("Вы не ввели число!");
    scanner.next();
    num = one();
}
        return num;
    }    
    public static double two(){
    System.out.print("Введите число: ");
        double num;
if(scanner.hasNextDouble()){
    num = scanner.nextDouble();
}
else{
    System.out.print("Вы не ввели число!");
    scanner.next();
    num = two();
}
        return num;
    } 
    public static char znak(){
        System.out.print("Введите знак: ");
        char operation;
        if(scanner.hasNext()){
            
            operation = scanner.next().charAt(0);
        }
        else{
            System.out.print("Вы ничего не введи!");
            scanner.next();
            operation = znak();
        }
        return operation;
    }
    public static double result(double a, double b, char operation){
    double result1;
switch(operation){
    case'+':
        result1 = a + b;
        break;
        case'-':
        result1 = a - b;
        break;
        case'*':
        result1 = a * b;
        break;
        case'/':
        result1 = a / b;
        break;
        default:
            System.out.print("Ничего не вышло");
            result1 = result(a, b, znak());
}
return result1;
    }
    
}
