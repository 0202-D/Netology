package Homework3_2_2.Tax_Type;

import java.math.BigDecimal;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class TaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        System.out.println("Налог по умолчанию 50%");
        BigDecimal percent = new BigDecimal("0.5");
        return amount.multiply(percent);
    }
}
