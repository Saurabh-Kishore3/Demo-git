import java.util.Scanner;
class Addition{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Fno.: ");
int a= obj.nextInt();
System.out.print("Enter Sno.: ");
int b = obj.nextInt();

int c = a+b;
System.out.println("Result : "+c);
}

}