/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package calculadora;


/**
 * 
 * @author dam
 */

/**
 * 
 * @since 28/02/2020
 */

/**
 * 
 * @version 1.0
 */
//hola como estas
public class Calculadora {
    private int num1;
    private int num2;
    
    /**
     * 
     * @param num1
     * @param num2
     */
    
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
 
    
    public int suma(){
        int result=num1+num2;
        return result;
    }
    /**
     * 
     * @return suma
     */
    
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    /**
     * 
     * @return resta
     */
        
    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    /**
     * 
     * @return resta2
     */
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
     * 
     * @return multiplica
     */
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @return divide
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return divide2
     */
     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        /**
         * @throws ("División por 0")
         * @exception ArithmeticException
         */
        else{
            int result=num1/num2;
            return result;
        }
        /**
     * 
     * @return divide0
     */
    }
     
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
        
    }
    
}
