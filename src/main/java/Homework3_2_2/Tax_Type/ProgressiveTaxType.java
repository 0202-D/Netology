package Homework3_2_2.Tax_Type;

import java.math.BigDecimal;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class ProgressiveTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal percent1= new BigDecimal("0.1");
        BigDecimal percent2 = new BigDecimal("0.15");
        if(amount.intValue()<=100000){
            return amount.multiply(percent1);
        }
        else {
            return amount.multiply(percent2);
        }
    }
}
