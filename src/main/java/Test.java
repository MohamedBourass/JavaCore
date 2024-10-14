public class Test {

    public static String compute(String input) {

        String output = new String();
        output = (Long.valueOf(input).intValue()%3 == 0) ? (output += "Foo") : output;
        output = (Long.valueOf(input).intValue()%5 == 0) ? (output += "Bar") : output;
        output = (Long.valueOf(input).intValue()% 7== 0) ? (output += "Qix") : output;

        for(char c : input.toCharArray()) {
            if(c == '3') {
                output = output.concat("Foo");
            }
            if(c == '3') {
                output = output.concat("Bar");
            }
            if(c == '3') {
                output += "Foo";
            }
        }


        return output;
    }

    public static int compute2(int input) {
        if(input == 0) {
            return 0;
        }
        return input%10 + compute2(input/10);
    }

    public static void main(String... args) {
        System.out.println(Test.compute("123"));
    }
}
