package Homework3_2_2;

import Homework3_2_2.Tax_Type.IncomeTaxType;
import Homework3_2_2.Tax_Type.ProgressiveTaxType;
import Homework3_2_2.Tax_Type.VATaxType;

import java.math.BigDecimal;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100525.5"),new IncomeTaxType(),taxService),
                new Bill(new BigDecimal(100000),new ProgressiveTaxType(),taxService),
                new Bill(new BigDecimal(-130),new VATaxType(),taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
    }

