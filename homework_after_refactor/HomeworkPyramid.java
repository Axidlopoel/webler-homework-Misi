package homework_after_refactor;

public class HomeworkPyramid {


    /*
    2. feladat - for
    Rajzolj ki a konzolra egy fél piramist:
    +
    ++
    +++
    ++++
    +++++
    A kódban egyszer szerepelhet a konzolra való kiíratás
    */
    public static void main(String[] args) {

        // Variable that is passed to the static methods
        int pyramidHeight = 5;

        System.out.println("/===== Begin - Homework #2 ======/");
        System.out.println("Solution #1 (simple):");
        PyramidSimple();
        System.out.println("--------------------------");
        System.out.println("Solution #2 (flexi):");
        PyramidFlexible(pyramidHeight);
        System.out.println("--------------------------");
        System.out.println("Solution #3 (string concat):");
        PyramidWithArrays(pyramidHeight);
        System.out.println("/===== End - Homework #2 ======/");
    }

    /**
     * homework #2: A little more flexible solution to the requirement
     *
     * @param pyramidHeight the height of the pyramid to display
     */
    public static void PyramidFlexible(int pyramidHeight)
    {
        // Declare & initialize a variable to handle string concatenation
        // StringBuilder here is a specific type for efficient string manipulation
        StringBuilder sb = new StringBuilder();

        // Outer loop using the pyramid height
        // variable i starts from 1 because zero value
        // would add an empty line at the beginning
        for (int i = 1; i <= pyramidHeight; i++) {
            // Inner loop where we append as many
            // plus sign as the actual line of the pyramid
            for (int j = 0; j < i; j++) {
                sb.append('+');
            }

            // Append newline char after each line iteration
            sb.append('\n');
        }

        // Print out the actual value of the StringBuilder
        // println() is not needed since we always append
        // newline character after each line
        System.out.print(sb.toString());
    }

    /**
     * homework #2: A little more flexible solution to the requirement
     *
     * @param pyramidHeight the height of the pyramid to display
     */
    public static void PyramidWithArrays(int pyramidHeight)
    {
        // Outer loop using the pyramid height
        // variable i starts from 1 because zero value
        // would add an empty line at the beginning
        for (int i = 1; i <= pyramidHeight; i++) {
            // Inner loop where we append as many
            // plus sign as the actual line of the pyramid
            String line = "";

            for (int j = 0; j < i; j++) {
                // String concatenation in a loop is not elegant
                // IDE advise: use the StringBuilder instead
                line = line + "+";
            }

            // Print out the actual line with new line
            System.out.println(line);
        }
    }

    /**
     * homework #2: Strictly compliant with the requirements but not too
     * elegant in production ready code.
     */
    public static void PyramidSimple() {
        // A string array that holds the string values for the individual lines
        String[] pyramid = { "+", "++", "+++", "++++", "+++++"};

        // An iteration over the string array the actualLine
        // string variable holds one item from the string array
        for (String actualLine : pyramid) {
            System.out.println(actualLine);
        }
    }
}

