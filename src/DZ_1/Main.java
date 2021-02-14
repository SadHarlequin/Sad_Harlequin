package DZ_1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String[]> stringer = array-> {
            int t=array.length;
            int countOfUniqueChars;
            int[] arrayOfChars = new int[t];
            for (int i=0; i<t; i++) {
                String lowerCase = array[i].toLowerCase();
                char characters[] = lowerCase.toCharArray();
                countOfUniqueChars = array[i].length();
                for (int j = 0; j < characters.length; j++) {
                    if (j != lowerCase.indexOf(characters[j])) {
                        countOfUniqueChars--;
                    }
                }
                arrayOfChars[i]=countOfUniqueChars;
            }
            int max=0;
            int currentMaxId=0;
            for (int i=0; i<t; i++){
                   if (arrayOfChars[i]>max){
                       max=arrayOfChars[i];
                       currentMaxId=i;
                   }
            }
            System.out.print(array[currentMaxId]);
        };
        stringer.accept(new String[]{"abc", "aabbcc", "aaaaa", "abcde", "aabbccdd"});
    }
}