import java.util.InputMismatchException;
import java.util.Scanner;

public class TheForce {

    /**
     * Returns a String containing a Yoda ASCII art and quote.
     *
     * @return Yoda Face and Quote as a String.
     */
    static String yoda() {
        return """
                          .--.                  Try not.
                ::\\`--._,'.::.`._.--'/::     Do or do not.
                ::::.  ` __::__ '  .::::    There is no try.
                ::::::-:.`'..`'.:-::::::
                ::::::::\\ `--' /::::::::              -Yoda""";
    }

    /**
     * Runs operating system specific command to clear the console screen.
     */
    static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

    /**
     * Returns a String indicating if the apprentice has enough Midi-Chlorians to
     * become a Jedi.
     * <p>
     * This method always returns immediately, whether the
     * apprentice is a Jedi or not. Hopefully you won't be a lowly human.
     *
     * @param name          a String giving the name of the apprentice desiring to be a jedi.
     * @param midiChlorians the count of Midi-Chlorians in the apprentice's blood.
     * @return The outcome of the Jedi Midi-Chlorian test as a String
     */
    static String jediIAm(String name, int midiChlorians) {
        // Chained ternary operator!!!
        return name + ", " + ((midiChlorians >= 4096) ? "Luke you are!" :
                (midiChlorians >= 2048) ? "Vader you are." :
                        (midiChlorians >= 1024) ? "Yoda you are." :
                                (midiChlorians >= 512) ? "Jedi you are" : "lowly human you are.");
    }

    public static void main(String[] args) {
        System.out.println(yoda());
        Scanner jediQuery = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Called are you? ");
                String apprentice = jediQuery.nextLine();
                if (apprentice.equals("Q")) {  // Quit on single letter uppercase "Q"
                    break;
                }
                System.out.println("Hrrmmm. Your Midi-Chlorian count what is?");
                int midiChlorianCount = jediQuery.nextInt();

                System.out.println(
                        jediIAm(apprentice, midiChlorianCount));

                jediQuery.nextLine();
            } catch(InputMismatchException ime){
                System.out.println("Input not valid apprentice.");
                jediQuery.nextLine();
            }
            clearConsole();
        }

        System.out.println("When you look at the Dark Side, careful you must be. For the Dark Side looks back.");
    }
}
