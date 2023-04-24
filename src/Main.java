//Написати метод який приймає массив цілих чисел і вертає суму всіх його парних
// елементів(не тих які мають парні індекси а ті які самі є парними).
// [8,2,3,4,5,6,7] -> 20


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] myArray = new Integer[]{8, 2, 3, 4, 5, 6, 7};
        String alexWord = "Alexx9800";
        task2(alexWord);


        int sum = 0;
        for (int item : myArray) {
            if (item % 2 == 0) {
                sum += item;
                System.out.printf(" %d +", item);
            }
        }
        System.out.printf(" = %d", sum);
    }


//        Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
//      Alexx9800
//      A
//      l
//      e
//      x
//      9
//      8
//      0
    //String alex = "Alexx9800";

    public static void task2(String alexWord) {

        List<String> helpList = new ArrayList<>();

        char[] allCharacters = alexWord.toCharArray();

        for (char c : allCharacters) {
            //System.out.println(c);

            Map<Character, Integer> helpMap = new HashMap<>();

            //System.out.println(helpMap);

            for(Character character: allCharacters){
                if(helpMap.containsKey(character)){
                    Integer value = helpMap.get(character) +1;
                    helpMap.put(character, value);
                }
                else{
                    helpMap.put(character, 1);
                }

            }

            boolean isRightChar = false;

            for(Character key: helpMap.keySet()){
                if (helpMap.get(key) %2 == 0){
                    isRightChar = true;
                }

            }

            if(isRightChar){
                helpList.add(alexWord);
            }
            System.out.println(helpMap); //***************


        }

        Set<Character> mySet = new HashSet<>();

        for(String word: helpList){
            for (Character character: word.toCharArray()){
                mySet.add(character);
                System.out.println(mySet);


            }

        }

    }

}
