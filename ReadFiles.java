import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles
{
    public static void main(String[] args)
    {
        //BufferedReader + FileReader = reading text file line by line
        //FileInputStream = reading binary files like audio files, images
        //RandomAccessFile = read/write specific section of a large file

        String filepath = "C:\\Users\\hp\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader buffer = new BufferedReader(new FileReader(filepath)))//java gives warning if we dont use exception handling,since filereading is a dangerous code
        {
            System.out.println("That file exists");

            String line;
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException f)
        {
            System.out.println("Couldn't locate file!");
        } 
        catch (IOException e)
        {
            System.out.println("Something went wrong!");
        }  

    }
}
