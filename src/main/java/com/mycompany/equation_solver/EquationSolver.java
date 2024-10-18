/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equation_solver;

/**
 *
 * @author PC
 */
public class EquationSolver {
    public static void SolveEq1(double a , double b){
        double x=-b/a;
        System.out.println("Solving equation a*x+b=0.");
        System.out.format("where a=%f and b=%f \n", a,b);
        System.out.println("Solution:");
        System.out.format("x = %f\n", x);
        System.out.println("________________________");
    }
    public static void SolveEq2(double a, double b, double c){
        System.out.println("Solving equation a*x^2+b=0.");
        System.out.format("where a=%f and b=%f and c=%f \n", a,b,c);
        System.out.println("Solution:");
        
        double delta = b*b - 4*a*c;
        if(delta>0){
            //two distinced real roots
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.format("x1 = %f , x2 = %f \n", x1 ,x2);
            
        }else if(delta==0){
            //a distinced real root
            double x = -b/(2*a);
            System.out.format("x = %f\n", x);
         
        }else{
            //no real root
            System.out.println("The equation has not real roots.\n");
            
        }
    }
    
}
