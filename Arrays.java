public class Arrays {
    public static void main(String[] args) {
        int age = 20;
        double height = 1.674d;
        String Name = "Mushraf";
        char Blood = 'O';

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int even_num[] = new int[5];
        int count = 0;
        int odd_num[] = new int[5];
        int count_odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even_num[count] = numbers[i];
                count++;
            } else {
                odd_num[count_odd] = numbers[i];
                count_odd++;
            }
        }

        System.out.println(Name + " was " + age + " years old");
        System.out.println("Height: " + height + " m");
        System.out.println("Blood Group: " + Blood);

        System.out.print("Even numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(even_num[i] + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < count_odd; i++) {
            System.out.print(odd_num[i] + " ");
        }
    }
}
