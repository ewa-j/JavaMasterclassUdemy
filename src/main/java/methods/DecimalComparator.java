package methods;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

//    // solution one
//    DecimalFormat decimalFormat = new DecimalFormat("#.###");
//    decimalFormat.setRoundingMode(RoundingMode.FLOOR);
//
//    // solution two
//    return (Math.round(numberOne * 100)/100.000d) == (Math.round(numberTwo * 100)/100.000d);
//
//    // solution three
//    BigDecimal firstNumber = new BigDecimal(numberOne).setScale(3, RoundingMode.DOWN);
//    BigDecimal secondNumber = new BigDecimal(numberTwo).setScale(3, RoundingMode.DOWN);
//    int result = firstNumber.compareTo(secondNumber);
//
//    return result == 0;

    // solution four
//    final double THRESHOLD = .001;
//    return Math.abs(numberOne - numberTwo) <= THRESHOLD;

    return (int) (numberOne * 1000) == (int) (numberTwo * 1000);
  }
}
