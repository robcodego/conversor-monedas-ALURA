package modelos;

import java.math.BigDecimal;

public record Conversion(BigDecimal conversionRate, String baseCode, String targetCode) {
    @Override
    public String toString() {
        return "1 " +
                baseCode + " equivale a " +
                conversionRate + " " +
                targetCode;
    }
}
