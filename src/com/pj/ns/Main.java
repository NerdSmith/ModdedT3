package com.pj.ns;

import java.util.Scanner;

public class Main {

    private static double readPoint(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the %s point: ", name);
        return scanner.nextDouble();
    }

    private static int readNumberOfFigures() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of figures: ");
        return scanner.nextInt();
    }

    private static String readTypeOrNameOfFigure(String typeOrName) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s of figure (Line, HorizontalParabola, VerticalParabola): ", typeOrName);
        return scanner.next();
    }

    private static Figure readCoefficients(String formula) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%s \nEnter x0, y0, a: ", formula);
        double x0 = scan.nextDouble();
        double y0 = scan.nextDouble();
        double a = scan.nextDouble();
        return new Figure(x0, y0, a);
    }

    private static void printWhereIsThePoint(Figure[] arrOfFigures, String[] arrOfNameOfFigures, int numberOfFigures,
                                             double x, double y) {
        for (int i = 0; i < numberOfFigures; i++){
            if (arrOfFigures[i].isPointAbove(x, y)) {
                System.out.println("Point is above of " + arrOfNameOfFigures[i]);
            }
            else {
                System.out.println("Point is below of " + arrOfNameOfFigures[i]);
            }
        }
    }

    private static void addFiguresToArr(Figure[] arrOfFigures, String[] arrOfNameOfFigures, int numberOfFigures) {
        for (int i = 0; i < numberOfFigures; i++) {

            String figureType = readTypeOrNameOfFigure("type");
            String figureName = readTypeOrNameOfFigure("name");

            arrOfNameOfFigures[i] = figureName;

            switch (figureType) {
                case "Line": {
                    Figure figureCoefficients = readCoefficients("y = a * (x - x0) + y0");
                    arrOfFigures[i] = new Line(figureCoefficients.x0, figureCoefficients.y0, figureCoefficients.a);
                    break;
                }
                case "HorizontalParabola": {
                    Figure figureCoefficients = readCoefficients("x = a * (y - y0) + x0");
                    arrOfFigures[i] = new HorizontalParabola(figureCoefficients.x0, figureCoefficients.y0,
                            figureCoefficients.a);
                    break;
                }
                case "VerticalParabola": {
                    Figure figureCoefficients = readCoefficients("y = a * (x - x0) + y0");
                    arrOfFigures[i] = new VerticalParabola(figureCoefficients.x0, figureCoefficients.y0,
                            figureCoefficients.a);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numberOfFigures = readNumberOfFigures();

        Figure[] arrOfFigures = new Figure[numberOfFigures];
        String[] arrOfNameOfFigures = new String[numberOfFigures];

        addFiguresToArr(arrOfFigures, arrOfNameOfFigures, numberOfFigures);

        double x = readPoint("x");
        double y = readPoint("y");

        printWhereIsThePoint(arrOfFigures, arrOfNameOfFigures, numberOfFigures, x, y);

    }
}
