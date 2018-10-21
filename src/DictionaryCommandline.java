import java.util.Scanner;

public class DictionaryCommandline {
    private DictionaryManagement dictionaryManagement;
    public  DictionaryCommandline()
    {
        dictionaryManagement = new DictionaryManagement();
    }
    public void showAllWords()
    {
        dictionaryManagement.showDictionary();
    }
    public void dictionaryBasic()
    {
        dictionaryManagement.insertFromFile();
        Scanner sc = new Scanner(System.in);
        String temp;
        while (true){
        System.out.println("\n0 to finish\n1 to show dictionary\n");

        temp = sc.nextLine();

        if (temp.compareTo("0") == 0) {
            break;
        }
        else if (temp.compareTo("1") == 0) {
            showAllWords();
        } else {
            continue;
        }
        }
    }
    public void dictionaryAdvanced()
    {
        dictionaryManagement.insertFromFile();
        String temp;
        while(true)
        {
            System.out.println("\\nPress 0 to finish\n" +
                    "Press 1 to insert a new word\n" +
                    "Press 2 to show dictionary\n" +
                    "Press 3 to look up a word\n" +
                    "Press 4 to search a word\n" +
                    "Press 5 to delete a word\n" +
                    "Press 6 to export this dictionary to a \\\".txt\\\" file\"");
            temp = new Scanner(System.in).nextLine();
            if(temp.equals("0"))
            {
                break;
            }
            else if(temp.equals("1"))
            {
                dictionaryManagement.insertword();
            }
            else if(temp.equals("2"))
            {
                showAllWords();
            }
            else if(temp.equals("3"))
            {
                String tu = new Scanner(System.in).nextLine();
                dictionaryManagement.dictionaryLookup(tu);
            }
            else if(temp.equals("4"))
            {
                String tu = new Scanner(System.in).nextLine();
                dictionaryManagement.dictionarySearcher(tu);
            }
            else if(temp.equals("5"))
            {
                String tu = new Scanner(System.in).nextLine();
                dictionaryManagement.deleteword(tu);
            }
            else if(temp.equals("6"))
            {
                dictionaryManagement.dictionaryExportToFile();
            }
            else{
                continue;
            }
        }
    }
}
