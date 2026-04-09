public class MathClass
{
    public static void main(String[] args)
    {
        System.out.println(Math.PI); //math is the class. can be directly used like this.
        System.out.println(Math.E);
        double result1 = Math.pow(2,3); // 2 raised to 3.
        System.out.println("Result: "+result1);
        double result2 = Math.abs(-89); //absolute value
        System.out.println("Result: "+result2);
        double result3 = Math.sqrt(49); //square root value
        System.out.println("Result: "+result3);
        double result4 = Math.round(3.14); //rounds up to closest integer
        System.out.println("Result: "+result4);
        double result5 = Math.ceil(3.14); //rounds up to next integer
        System.out.println("Result: "+result5);
        double result6 = Math.floor(3.14); //rounds down to the integer
        System.out.println("Result: "+result6);
        double result7 = Math.max(21,21.7);
        System.out.println("Result: "+result7);
        double result8 = Math.min(21,21.7);
        System.out.println("Result: "+result8);
    }
    
}
