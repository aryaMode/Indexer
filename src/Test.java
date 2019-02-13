import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Test{
    public static void rename(String oldName, String newName){
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        oldFile.renameTo(newFile);
    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        File folder = new File("C:/Users/adhra/Downloads/Documents");
        File[] files = folder.listFiles();
        Arrays.sort(files, new Comparator<File>(){
            public int compare(File f1, File f2)
            {
                return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
            } });
        ArrayList<String> al = new ArrayList<String>();
        for (File file : files)
        {
            al.add(file.getName());
        }
        for (int i=0; i<al.size(); i++){
            int c = i+1;
            rename("C:/Users/adhra/Downloads/New folder/"+al.get(i),"C:/Users/adhra/Downloads/New folder/"+c+".pdf");
        }
    }
}