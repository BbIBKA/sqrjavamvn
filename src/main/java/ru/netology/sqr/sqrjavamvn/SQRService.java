package ru.netology.sqr.sqrjavamvn;

public class SQRService {
    public int squareRootCalc (int firstNumber, int secondNumber) {
            int count = 0;

            for (int i = 10; i <= 99; i++) {
                if (i * i >= firstNumber & i * i <= secondNumber) {
                    count++;
                }
            }
            return count;
    }
}
