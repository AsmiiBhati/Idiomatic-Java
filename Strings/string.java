public class string//can't use "S"tring to name this.
{
    public static void main(String[] Strings)
    {
        String name = "Alice cooper";

        int length = name.length(); //includes spaces
        char letter = name.charAt(7); //begine at zero from left
        int indexp = name.indexOf("p");
        int indexo = name.indexOf("o"); // first occurrence of o.
        int lastindexo = name.lastIndexOf("o"); //last occurrence of o
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        name = name.trim();//removes spaces or tab spaces from the string(not the ones in between though)
        System.out.println(name);
        name = name.replace("o","*");
        System.out.println(name);
        
        System.out.println(name.contains("l")); //checks if character exists in string.
        System.out.println(name.equals("ALICE COOPER")); //equals is case sensitive
        System.out.println(name.equalsIgnoreCase("ALICE COOPER")); //ignores case
        System.out.println(name.isEmpty());
        System.out.println(length);
        System.out.println(letter);
        System.out.println(indexp);
        System.out.println(indexo);
        System.out.println(lastindexo);
        
    }  
}
