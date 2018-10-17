
package hello;

public class Model {
    private String word;
    private boolean palindrom;
    private boolean anagramOfPalindrome ;
    
    public Model(String word){
        this.word = word;  
    }              

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
   
     public boolean getPalindrom() {
        return palindrom;
    }

    public void setPalindrom(boolean palindrom) {
        this.palindrom = palindrom;
    }
    public boolean getAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

    public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
        this.anagramOfPalindrome = anagramOfPalindrome;
    }
    
    
}
