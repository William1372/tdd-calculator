public class Calculator {

    public int add(int a, int b){

        return a+b;

    }

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] parts = numbers.split(",");
        int sum = 0;
        for (String num : parts) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int subtract(int a, int b){

        return a-b;

    }

    public float multiply(int a, int b){

        return a*b;

    }

    public float divide(int a, int b){

        return a/b;

    }

}
