import java.util.*;
//hollow recangle 
// class patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
// if (i == 1 || i == n || j == 1 || j == n) {
//     System.out.print("*");
// } else {
//     System.out.print(" ");
// }

//             }
//             System.out.println();
//         }
//     }
// }

//invertade triangle
// class patterns {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         int n = 5;
//         int c = 1;
//         for (int i = 1; i <= n; i++) {
//             // for (int j = n - i; j >= 1; j--) {
//             // System.out.print(" ");
//             // }
//             for (int k = 1; k <= i; k++) {
//                 // System.out.print(c + " ");
//                 // c++;
//                 if ((i + k) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }

// class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int m = 8;
//         for (int i = 1; i <= n; i++) {
//             for (int k = 1; k <= n - i; k++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

//star pyramid

// class patterns {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//printing characters in pattern

// class pattern {
//     public static void main(String[] args) {
//         int n = 6;
//         char ch = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }

//reverse a number

class pattern {
    public static void main(String[] args) {
        int n = 5567;
        int c = 0;
        while (n > 0) {
            int a = n % 10;
            c = c + a;
            n /= 10;
        }
        System.out.println(c);
    }
}
