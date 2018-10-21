public class Word {
    private String explain;
    private String spelling;


    public Word(String explain,String spelling)
    {
        this.explain = explain;
        this.spelling = spelling;
    }
    public String getExplain() {
        return explain;
    }

    public String getSpelling() {
        return spelling;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }
    public String toString()
    {
        return explain+ " : " + spelling;
    }

}
