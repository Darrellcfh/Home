import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by antonio on 13/07/2016.
 */
public class Test {
    public static void main(String[] args){
//"<span>a</span>testo<span>b</span>altro testo<span>c</span>
       // nome=input activationFunction=TanH inputUnits=5
        String text = "nome=input activationFunction=TanH inputUnits=5";


        Pattern pattern = Pattern.compile("=([^<]+)\\s");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println("Sottogruppo 1 : "+matcher.group(1));
        }


    }
}
