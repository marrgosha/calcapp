package fi.margokomarova.extrapp._main;

import static fi.margokomarova.extrapp.service.ResultWriterService.printResult;
import static fi.margokomarova.extrapp.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        int res = addNumbers (3, 5);
        printResult (3, 5, res, "summa");
        int otv = subNumbers(3, 5);
        printResult(3,5,otv,"raznitsa");
        int otvet= multNumbers(3,5);
        printResult(3,5,otvet,"proizvedenie");
}
    }
