public class BoothAlgorithm {

  /* -------------------------------------------------------------------------- */
  /*                        //! What is Booths Algorithms                       */
  /* -------------------------------------------------------------------------- */
  //NOTE -
  //^ Booth's algorithm is a multiplication algorithm used for binary signed numbers.

  public static void main(String[] args) {
    int multiplicand = 8; //? The number to be multiplied
    int multiplier = 3; //? The number by which multiplicand is multiplied

    int product = boothAlgorithm(multiplicand, multiplier);
    System.out.println("Product: " + product);
  }

  public static int boothAlgorithm(int multiplicand, int multiplier) {
    int multiplicandCopy = multiplicand; //? Copy of the multiplicand
    int multiplierCopy = multiplier; //? Copy of the multiplier
    int product = 0; //? The final product
    int accumulator = 0; //? Accumulator for intermediate results
    int count = Math.max(
      Integer.bitCount(multiplicand),
      Integer.bitCount(multiplier)
    );
    //^ Number of bits to be processed based on the size of the operands

    while (count > 0) {
      int lsb = multiplierCopy & 1;
      //? Extract the least significant bit (LSB) of the multiplier

      if (lsb == 1 && (accumulator & 1) == 0) {
        //? If LSB is 1 and the accumulator's LSB is 0, add the multiplicand to the accumulator
        accumulator += multiplicandCopy;
      } else if (lsb == 0 && (accumulator & 1) == 1) {
        //? If LSB is 0 and the accumulator's LSB is 1, subtract the multiplicand from the accumulator
        accumulator -= multiplicandCopy;
      }

      accumulator >>= 1; //? Right-shift the accumulator by 1 bit
      multiplierCopy >>= 1; //? Right-shift the multiplier by 1 bit
      count--; //? Decrement the count to process the next bit

      //? Add the multiplicand to the product if the last two bits of the accumulator are '01' or '10'
      if ((accumulator & 3) == 1 || (accumulator & 3) == 2) {
        product += multiplicandCopy << (Math.max(0, count));
        //? Multiply the multiplicand by the appropriate power of 2 and add it to the product
      }
    }

    return product; //? Return the calculated product
  }
}
