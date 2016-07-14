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

        ArrayList<String> arr=new ArrayList<>(Arrays.asList(text.split(" ")));
        Pattern pattern = Pattern.compile("=([^<]+)");


        for(int i=0;i<arr.size();i++){
            Matcher matcher = pattern.matcher(arr.get(i));
            while(matcher.find()) {
                arr.remove(i);
                arr.add (i,matcher.group(1));
            }
        }

        arr.stream().forEach(System.out::println);


    }
}
