package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

  static double[] celsiusValues = {-40, 0, 100, 37.1};
  static double[] expectedFahrenheitVales = {-40, 32, 212, 98.78};

  @Test
   void convertC2F(double[] expectedFahrenheitValues) {
     for (int i = 0; i < celsiusValues.length; i++) {
       double celsius = celsiusValues[i];
       double expectedFahrenheit = expectedFahrenheitValues[i];
       double actualFahrenheit = Converter.convertC2F(celsius);
       assertEquals(expectedFahrenheit, actualFahrenheit);
     }
   }


  @Test
  void testConvertC2F() {
  }
}