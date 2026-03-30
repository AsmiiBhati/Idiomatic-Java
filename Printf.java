public class Printf
{
    public static void main(String[] args)
    {
        //printf is a alternative to println() and print()
        //printf here works similar to printf in C. we use placeholders.
        // placeholder = %[flags][width][.precision][specifier character] (sequence)

        /*[FLAGS] 
          + = adds a plus in front of positive values. eg. +12 but -4 stays same.(plus minus still minus.)
          (eg. %+.2f --> %[flags][precision][specifier character])
          , = number system seperation. eg. 10000 --> 10,000
          (eg. %,.2f)
          ( = puts negative values in brackets. (eg. %(.2f)
          <space> = puts minus if negative number, leaves a space if positive number.
          (eg. % .2f)
        */
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 21;
        boolean isEmployed = true;
        double salary = 200.76528;

        System.out.printf("This is %s.\nThe first letter of his name is %c.He is %d years old\n",name,firstLetter,age);
        System.out.printf("is he employed? %b.\nHis salary is %.3f.\n",isEmployed,salary);
        /*[WIDTH]
          0 = zero padding i.e. add zero to make it a desired digit number (eg. %03d = 001 or 023 or 456)
          number = add space to the right
          negative number = add space to the left
        */
        int id1 = 1;
        int id2 = 23;

        System.out.printf("%04d\n",id1);
        System.out.printf("%03d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%03d\n",id2);
        System.out.printf("%02d\n",id2);
        System.out.printf("%4d\n",id1);
        System.out.printf("%3d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id1);
        System.out.printf("%-3d",id2);

    }
}
