import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    ArrayList<Word> words = new ArrayList<>();

    public  void insertFromFile()
    {
        File file = new File("MyFile.txt");
        try(Scanner sc = new Scanner(file)){
            String str;
            while(sc.hasNext()){
                str = sc.nextLine();
                int temp;
                temp = str.indexOf("\t");
                String a = str.substring(0,temp);
                String b = str.substring(temp +1).trim();
                Word word = new Word(a,b);
                words.add(word);
            }
        }
        catch (Exception e){}
    }
    public void showDictionary()
    {

        for(int i = 0 ; i< words.size(); i++)
        {
            System.out.println(words.get(i).toString());
        }
    }

    public void dictionaryLookup(String a)
    {
        int kt = 0;
        for(int i = 0 ; i< words.size(); i++)
        {
            if(words.get(i).getExplain().equals(a))
            {
                kt = 1;
                System.out.println(words.get(i).toString());
                break;
            }
        }
        if(kt == 0) System.out.println("khong ton tai tu nay");
    }
    public void dictionarySearcher(String a)
    {
        for(int i = 0 ; i< words.size(); i++)
        {
            String h =  words.get(i).getExplain();
            if(h.length() < a.length()){
                continue;
            }
            else {
                String k = h.substring(0, a.length());
                if (k.equals(a)) {
                    System.out.println(words.get(i).toString());
                }
            }
        }
    }
    public void deleteword(String a)
    {
        for(int i = 0 ; i< words.size(); i++)
        {
            if(words.get(i).getExplain().equals(a))
            {
                words.remove(i);
            }
        }
    }
    public void insertword ()
    {
        System.out.println("nhap tu tieng anh : ");
        String ex = new Scanner(System.in).nextLine();
        System.out.println("nhap nghia tieng viet : ");
        String ax = new Scanner(System.in).nextLine();
        Word a = new Word(ex,ax);
        words.add(a);
    }
    public void dictionaryExportToFile() {

        File file = new File("MiFile.txt");
        try(PrintWriter pw = new PrintWriter(file)){
            for(int i = 0 ; i < words.size() ; i++)
            {
                pw.println(words.get(i).getExplain() + "\t" + words.get(i).getSpelling());
            }

        }catch (Exception e){
        }
    }



}
