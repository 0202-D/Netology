package Homework3_2_2.Tax_Type;

import java.math.BigDecimal;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
            BigDecimal percent = new BigDecimal("0.18");
            return amount.multiply(percent);

    }
}