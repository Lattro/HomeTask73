import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");
        int countA = 0;
        FileReader fileReader = new FileReader(file);
        while (fileReader.ready())
        {
            if (fileReader.read() == 97)
            countA+=1;
        }
        System.out.println(countA);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.getEncoding();
        fileWriter.write(countA);
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }
}
