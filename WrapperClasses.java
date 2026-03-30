public class WrapperClasses
{
    public static void main(String[] args)
    {
        //Wrapper classes = allows primitive values(int,char,boolean,double) to be used as objects.
        //allows use of collection framework.

        //Integer i = new Integer(123); i is now an object with pritive int value 123.Integer is the wrapper class
        //the above format can't be used now since its deprecated (autoboxing is the modern approach now)
        //Double d = new Double(2.1);
        //Character c = new Character('h');
        //Boolean b = new Boolean(true);

        //Modern way to access wrapper classes is to just assign them directly to their primitive value
        //Autoboxing
        Integer i = 123;//directly assigning primitive value 123 to i object of the Integer wrapper class
        Double d = 2.1;//directly assigning primitive value 2.1 to d object of the Double wrapper class
        Character c = 'h';//directly assigning primitive value h to c object of the Character wrapper class
        Boolean b = true;//directly assigning primitive value true to b object of the Boolean wrapper class
        //The above are all reference data type (remember how we have always written String this way)
        //String s = "Hello";

        //Unboxing (convert wrapper class to primitive value)
        int w = i;
        double x = d;
        char y = c;
        boolean z = b;
        System.out.println(w +" "+ x + " "+ y + " " + z);//this statement is written just too avoid warnings of unused variable

        //primitive datatype --> String(use toString method)(toString is utility method of wrapper class)
        String e = Integer.toString(123);//integer is converted to a String using Integer Wrapper Class
        String f = Double.toString(3.21);
        String g = Character.toString('q');
        String h = Boolean.toString(false);

        //now since int and double(applies for others too), we can't add them as is.But strings can be concatenated,so
        String j = e + f + g + h;
        System.out.println(j); 

        //Parsing(String --> Primitive data type)(parse is a utility method of wrapper class)
        int k = Integer.parseInt("123");
        double l = Double.parseDouble("2.31");
        //char doesnt have a parse method, so we can use inbuilt methods of strings ( unrelated to wrapper classes)
        char m = "Hello".charAt(2);
        boolean n = Boolean.parseBoolean("true");
        System.out.println(k +" "+ l + " "+ m + " " + n);//this statement is written just too avoid warnings of unused variable

        //Now, since they are back to their primitive data types, we can't add them together.

        char letter = 'p';
        System.out.println(Character.isLetter(letter));//will return true or false (is not case  sensitive)
        System.out.println(Character.isUpperCase(letter));
    }
}