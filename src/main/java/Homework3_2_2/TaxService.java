package Homework3_2_2;

import java.math.BigDecimal;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class TaxService {
    public void payOut(BigDecimal taxAmount) {
        if (taxAmount.intValue() <0) {
            System.out.println("Вы ввели отрицательную сумму доходов.Налог не уплачен");
        }
       else if (taxAmount.intValue() == 0) {
            System.out.println("У Вас нет доходов");
        } else {
            System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
        }
    }
}
