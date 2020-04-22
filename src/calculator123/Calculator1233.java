
package calculator123;

import java.util.Scanner;


public class Calculator1233 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = one();
        double b = two();
        char operation = znak();
        double itog = result(a , b, operation);
        System.out.print("�����: "+itog);
    }
public static double one(){
    System.out.print("������� �����: ");
    double num;
if(scanner.hasNextDouble()){
    num = scanner.nextDouble();
}
else{
    System.out.print("�� �� ����� �����!");
    scanner.next();
    num = one();
}
        return num;
    }    
    public static double two(){
    System.out.print("������� �����: ");
        double num;
if(scanner.hasNextDouble()){
    num = scanner.nextDouble();
}
else{
    System.out.print("�� �� ����� �����!");
    scanner.next();
    num = two();
}
        return num;
    } 
    public static char znak(){
        System.out.print("������� ����: ");
        char operation;
        if(scanner.hasNext()){
            
            operation = scanner.next().charAt(0);
        }
        else{
            System.out.print("�� ������ �� �����!");
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
            System.out.print("������ �� �����");
            result1 = result(a, b, znak());
}
return result1;
    }
    
}
