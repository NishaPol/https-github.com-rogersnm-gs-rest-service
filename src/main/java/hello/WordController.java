package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
public class WordController {

    //@Autowired
   // private WordService ws;
    
    @RequestMapping("/{word}")
    public Model getModel(@PathVariable String word) {
        StringBuilder wordBuilder  = new StringBuilder(word);
        String tempString = wordBuilder.reverse().toString();
        boolean palindrome = tempString.equals(word);
        Model m = new Model(word);
        m.setPalindrom(palindrome);
        int[] charCount = new int[128];
        for(int i = 0 ; i < word.length() ; i++) {
            charCount[(int)word.charAt(i)]++;
        }
        int oddCount = 0 ;
        for(int i  = 0 ; i < 128 ; i++) {
            if(charCount[i] % 2!=0) {
                oddCount++;
            }
        }
        if(oddCount != 0 && oddCount != 1) {
           m.setAnagramOfPalindrome(false);
        }
         m.setAnagramOfPalindrome(true);
        return m;
     }
}
