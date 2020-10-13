package com.company.lab3;
import com.company.lab3.TextCounter;

public class Main4 {
    public static void main(String[] args) {
       /* String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vitae molestie sem. Fusce pretium " +
                "vitae odio in tristique. Aenean quis nibh purus. Nam turpis est, viverra vitae lectus quis, laoreet " +
                "porta dolor. Curabitur commodo metus velit, in consectetur lorem posuere nec. Sed metus magna, cursus " +
                "vitae leo quis, feugiat dictum nulla. Aliquam ut enim molestie ipsum aliquam imperdiet. Nam vel mauris " +
                "tempus, hendrerit odio ac, tempor justo. In ultrices nisl lacinia quam auctor, ut fringilla " +
                "nunc maximus. Nulla eget justo et dolor gravida bibendum. Maecenas fringilla ligula ut nisi accumsan " +
                "semper. Nunc porta vehicula ante ut finibus. Donec pulvinar pharetra arcu, consectetur elementum nulla " +
                "vehicula ac. Phasellus et ante sollicitudin, egestas dui mattis, posuere est. Nulla facilisi. " +
                "Nullam nulla nulla, fermentum eget sem ac, euismod cursus neque. Aliquam erat volutpat. " +
                "Sed consectetur vulputate sodales. Ut sem elit, bibendum ac enim sed, bibendum accumsan libero.\n" +
                "Aliquam erat volutpat. Quisque fermentum efficitur lacinia. Mauris est sapien, scelerisque in auctor " +
                "ut, ornare at ipsum. Nulla laoreet turpis lorem, eu eleifend justo interdum ut. Fusce non dui blandit," +
                " dignissim felis sit amet, porta velit. Quisque rhoncus iaculis turpis non porta. Donec egestas nibh " +
                "non ullamcorper faucibus. Phasellus porta sapien faucibus, consectetur eros vel, fringilla felis. " +
                "Vivamus sodales in felis non scelerisque.";
                 */

        String text2 = "Donec eu! imperdiet eu dignissim orci eu. Fusce viverra mi. Sit? amet dignissim ";
        TextCounter textCounter = new TextCounter(text2);
        System.out.println("The number of sentences is " + textCounter.getSentenceCount());
        System.out.println("The number of words is " + textCounter.getWordCount());
        System.out.println("Nr. of vowels " + textCounter.getVowelsCount());
        System.out.println("Nr. of consonants " + textCounter.getConsonantsCount());
        System.out.println("Nr. of letters " + textCounter.getLetterCount());
        textCounter.printTop5Words();
    }
}
