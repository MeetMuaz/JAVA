// class Calculator {
//     public int add(int n1, int n2) {
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         int num1 = 20;
//         int num2 = 10;
//         Calculator calc = new Calculator();

//         int result = calc.add(num1, num2);

//         System.out.println(result);
//     }

// }

// public class Demo {

//     public static void main(String[] args) {
//         int nums[] = new int[4];
//         nums[0] = 9;
//         nums[1] = 21;
//         nums[2] = 5;
//         nums[3] = 300;

//         for (int i = 0; i <= 3; i++) {
//             System.out.println(nums[i]);
//         }

//         int j = 0;
//         while (j <= 3) {
//             System.out.println(nums[j++]);
//         }
//     }
// }

public class Demo {

    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

    }
}
