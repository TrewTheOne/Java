package vinkler;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Udregning 
{
    public static void main(String[] args) 
    {
        Scanner tast = new Scanner(System.in);
        double a,b,c;
        
        System.out.print("Indtast dit a: ");
        a = tast.nextDouble();
        System.out.print("Indtast dit b: ");
        b = tast.nextDouble();
        System.out.print("Indtast dit c: ");
        c = tast.nextDouble();
        
        double d = b*b-4*a*c;
        double x1 = -b+Math.sqrt(d)/(2*a);
        double x2 = -b-Math.sqrt(d)/(2*a);
        String formel = "b^2-4*ac";
        String formelx1 = "-b+sqrt(d)/(2*a)";
        String formelx2 = "-b-sqrt(d)/(2*a)";
        
        System.out.println("Nu beregnes Diskriminanten med formlen "+formel);
        
        if (d>0) 
        {
            System.out.println("Din diskriminant er større end 0, derfor er der 2 løsninger");
            System.out.println("d = "+d);
            System.out.println("Vi udregner nu dit x1 med formlen: "+formelx1);
            System.out.println("x1 = "+x1);
            System.out.println("Vi udregner nu dit x2 med formlen: "+formelx2);
            System.out.println("x2 = "+x2);
        }     
        else if (d==0)
        {
            System.out.println("Din diskriminant er lige med 0, derfor er der 1 løsning");
            System.out.println("d = "+d);
            System.out.println("Vi udregner nu dit x1 med formlen: "+formelx1);
            System.out.println("x1 = "+x1);
            System.out.println("Vi udregner nu dit x2 med formlen: "+formelx2);
            System.out.println("x2 = "+x2);
        }
        else if (d<0)
        {
            System.out.println("Din diskriminant er mindre end 0, derfor er der 0 løsninger");
            System.out.println("d = "+d);
            System.out.println("vi udregner nu x1 med formlen: "+formelx1);
            System.out.println("x1 = "+x1);
            System.out.println("Vi udregner nu dit x2 med formlen: "+formelx2);
            System.out.println("x2 = "+x2);
        }
        else
        {
            System.out.println("Ikke i stand til det...");
        }
    }
    
}
