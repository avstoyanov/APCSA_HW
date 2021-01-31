public class LipogramAnalyzer {
    private String text;
    public LipogramAnalyzer(String txt){
        text = txt;
    }

    public String mark(char letter){
        String text_2 = text;
        int loc = text.indexOf(letter);
        if(loc >= 0) {
            text_2 = text.replace(letter, '#');
        }
        return text_2;
    }

    public String allWordsWith(char letter){
        StringBuffer words = new StringBuffer();
        int bef = 0;
        String word = "";
        for(int e = 0; e < text.length(); e++) {
            if(e != 0 && Character.isLetter(text.charAt(e)) && !Character.isLetter(text.charAt(e-1))) {
                bef = e;
            } else if ((e != 0 && Character.isLetter(text.charAt(e-1)) && !Character.isLetter(text.charAt(e))) || e == text.length()-1) {
                if(e == text.length()-1 && Character.isLetter(text.charAt(e))){e++;}
                word = text.substring(bef, e);
                if (word.indexOf(letter) >= 0 && words.indexOf("\n" + word + "\n") < 0) {
                    words.append(word + "\n");
                }
            }
        }
        return words.toString();
    }
}
