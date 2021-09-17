import java.util.Scanner;
import java.lang.Math;
class complex
{
    Scanner sc=new Scanner(System.in);
    double real1,real2,imag1,imag2;
    complex()
    {
        System.out.println("This is a class named complex");
    }
    complex(double real1,double imag1,double real2,double imag2)
    {
        double areal=0,aimag=0,mod;
        this.real1=real1;
        this.imag1=imag1;
        this.real2=real2;
        this.imag2=imag2;
        int n;
        while(true)
        {
            System.out.println("Enter operation you will like to perform: \n0. Exit     1. Addition     2. Subtraction     3. Multiplication     4. Division\n");
            n=sc.nextInt();
            if(n<0 && n>4)
            System.out.println("Wrong choice: Please choose between 0-4");
            else
            {
            switch (n) 
            {
                case 1:
                {
                    areal=real1+real2;
                    aimag=imag1+imag2;
                    break;
                }
                case 2:
                {
                    areal=real1-real2;
                    aimag=imag1-imag2;
                    break;
                }
                case 3:
                {
                    areal=(real1*real2)-(imag1*imag2);
                    aimag=(real1*imag2)+(imag1*real2);
                    break;
                }
                case 4:
                {
                    double den=1/(Math.pow(real2,2.0)+Math.pow(imag2,2.0));
                    areal=((real1*real2)+(imag1*imag2))*den;
                    aimag=((imag1*real2)-(real1*imag2))*den;
                    break;
                }
                case 0:
                    System.exit(0);
            }
            mod=Math.sqrt(Math.pow(areal,2.0)+Math.pow(aimag,2.0));
            System.out.println("The answer is: "+areal+" + "+aimag+"i \nMod value of answer is: "+mod);
            }
        }
    }

}
public class Main
{
    public static void main(String[] args)
    {
        double real1,imag1,real2,imag2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st complex number in real_part imaginary_part format");
        real1=sc.nextDouble();
        imag1=sc.nextDouble();
        System.out.println("Enter 2nd complex number in real_part imaginary_part format");
        real2=sc.nextDouble();
        imag2=sc.nextDouble();
        complex complex0 = new complex();
        complex complex1 = new complex(real1,imag1,real2,imag2);
    }
}