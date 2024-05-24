
import java.util.Scanner;
import java.text.DecimalFormat;

public class CombinedCode {

    public static void main(String[] args) {
        QuadraticEquationSolver.main(null);
        QuadrantIdentifier.main(null);
        NumberChecker.main(null);
        Main.main(null);
        EquationSystem.main(null);
        DayOfWeek.main(null);
        SeasonOfMonth.main(null);
        DaysInMonth.main(null);
        TextMenu.main(null);
        ClassSubject.main(null);
        QuarterOfHour.main(null);
        ArithmeticMenu.main(null);
    }

    // QuadraticEquationSolver class
    public static class QuadraticEquationSolver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the coefficients of the quadratic ax^2 + bx + c = 0:");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("the quadration has two solutions :");
                System.out.println("x1 = " + root1);
                System.out.println("x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("the quadration has one solution:");
                System.out.println("x = " + root);
            } else {
                System.out.println("The equation has no real solutions");
            }
        }
    }

    // QuadrantIdentifier class
    public static class QuadrantIdentifier {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter x: ");
            double x = scanner.nextDouble();
            System.out.print("enter y: ");
            double y = scanner.nextDouble();
            int quadrant = findQuadrant(x, y);
            System.out.println("quadrant: " + quadrant);
        }

        public static int findQuadrant(double x, double y) {
            if (x > 0 && y > 0) {
                return 1;
            } else if (x < 0 && y > 0) {
                return 2;
            } else if (x < 0 && y < 0) {
                return 3;
            } else if (x > 0 && y < 0) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    // NumberChecker class
    public static class NumberChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter number: ");
            int number = scanner.nextInt();
            if (number >= 10 && number <= 99) {
                if (number % 2 == 0) {
                    System.out.println("The number is two-digit and even.");
                } else {
                    System.out.println("The number is two-digit, but not even.");
                }
            } else {
                System.out.println("The number is not double-digit.");
            }
        }
    }

    // Main class
    public static class Main {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = scanner.nextInt();
        System.out.println(formatNumber(number));
    }

        private static String formatNumber(double number) {
            DecimalFormat df = new DecimalFormat("#.###");
            return df.format(number);
        }
    }


    // EquationSystem class
    public static class EquationSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter number: ");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 4) {
                System.out.println(getSubject(number));
            } else {
                System.out.println("Invalid period number.");
            }
        }

        private static String getSubject(int period) {
            switch (period) {
                case 1:
                    return "Math";
                case 2:
                    return "English";
                case 3:
                    return "Science";
                case 4:
                    return "History";
                default:
                    throw new IllegalArgumentException("Invalid period number: " + period);
            }
        }
    }

    // DayOfWeek class
    public static class DayOfWeek {
        public static void main(String[] args) {
            int dayOfWeek = 5; // replace with the day of the week (1 for Monday, 7 for Sunday)
            System.out.println(isWorkday(dayOfWeek) ? "Workday" : "Weekend");
        }

        public static boolean isWorkday(int dayOfWeek) {
            return dayOfWeek != 1 && dayOfWeek != 7;
        }
    }

    // SeasonOfMonth class
    public static class SeasonOfMonth {
        public static void main(String[] args) {
            int month = 3; // replace with the month number (1 for January, 12 for December)
            System.out.println(seasonOfMonth(month));
        }

        public static String seasonOfMonth(int month) {
            switch (month) {
                case 12:
                case 1:
                case 2:
                    return "Winter";
                case 3:
                case 4:
                case 5:
                    return "Spring";
                case 6:
                case 7:
                case 8:
                    return "Summer";
                case 9:
                case 10:
                case 11:
                    return "Autumn";
                default:
                    throw new IllegalArgumentException("Invalid month number: " + month);
            }
        }
    }

    // DaysInMonth class
    public static class DaysInMonth {
        public static void main(String[] args) {
            int month = 4; // replace with the month number (1 for January, 12 for December)
            System.out.println(daysInMonth(month));
        }

        public static int daysInMonth(int month) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return isLeapYear() ? 29 : 28;
                default:
                    throw new IllegalArgumentException("Invalid month number: " + month);
            }
        }

        public static boolean isLeapYear() {
            // TODO: implement the logic to determine if the current year is a leap year
            return false;
        }
    }

    // TextMenu class
    public static class TextMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            while (choice != 3) {
                System.out.println("1. Greeting");
                System.out.println("2. Invitation to work on the computer");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Hello!");
                        break;
                    case 2:
                        System.out.println("Welcome to the computer!");
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
            scanner.close();
        }
    }

    // ClassSubject class
    public static class ClassSubject {
        public static void main(String[] args) {
            int period = 2; // replace with the period number (1 for the first period, 4 for the last period)
            System.out.println(getSubject(period));
        }

        private static String getSubject(int period) {
            switch (period) {
                case 1:
                    return "Math";
                case 2:
                    return "English";
                case 3:
                    return "Science";
                case 4:
                    return "History";
                default:
                    throw new IllegalArgumentException("Invalid period number: " + period);
            }
        }
    }

    // QuarterOfHour class
    public static class QuarterOfHour {
        public static void main(String[] args) {
            int min = 37; // replace with the minute number (0 for the first minute, 59 for the last minute)
            System.out.println(getQuarterOfHour(min));
        }

        public static int getQuarterOfHour(int min) {
            return min / 15 + 1;
        }
    }

    // ArithmeticMenu class
    public static class ArithmeticMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            while (choice != 4) {
                System.out.println("1. Multiply two numbers");
                System.out.println("2. Add two numbers");
                System.out.println("3. Subtract two numbers");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 3) {
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("The product of " + num1 + " and " + num2 + " is " + num1 * num2 + ".");
                            break;
                        case 2:
                            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2) + ".");
                            break;
                        case 3:
                            System.out.println("The difference between " + num1 + " and " + num2 + " is " + (num1 - num2) + ".");
                            break;
                    }
                } else if (choice != 4) {
                    System.out.println("Invalid choice.");
                }
            }
            scanner.close();
        }
    }
}