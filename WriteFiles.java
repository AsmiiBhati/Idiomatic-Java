import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles
{
    public static void main(String[] args)
    {
        //FileWriter = small ormedium sized texts
        //BufferedWriter = Large amount of texts
        //PrintWriter = Structured data, like reports or logs
        //FileOutputStreams = Binary files like audio files,image files

        //FileWriter writer = new FileWriter("test.txt");
        //in modern java we can use try with resources

        String filepath = "C:\\Users\\hp\\OneDrive\\Desktop\\test.txt";
        String filecontent = "I like Pizza\nI love Burger\nNo wonder I have a tummy!🙃";
        try(FileWriter writer = new FileWriter(/*"test.txt"*//*"C:\\Users\\hp\\OneDrive\\Desktop\\test.txt"*/filepath))//got my file on my desktop
        {
            /*writer.write("I like Pizza\n");
            writer.write("I love Burger\n");
            writer.write("No wonder I have a tummy🙃");*/
            writer.write(filecontent);
            System.out.println("File has been written!");
        }
        //when handling exceptions it is best practice to handle specific exceptions first, then put the generic one for exceptions that can't be predicted(this will allow all exceptions to be handled, even the ones we couldn't think of!)

        catch(FileNotFoundException f)
        {
            System.out.println("Couldn't locate file location!");
        }

        catch(IOException i)
        {//any exceptions like "desktp" instead of "desktop" are caught here.
            System.out.println("Couldn't write file.");
        }

    }
}
