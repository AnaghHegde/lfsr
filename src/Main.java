

public class Main {
    public static void main(String[] args) {

        int number = 0b1001;
        LFSR lfsr = new LFSR();
        lfsr.setSeed(number);
        lfsr.setTaps(new int[] {1, 0});

        for(int i = 0; i < 15; i++) {
            System.out.println(lfsr.nextBit() + " " + Integer.toBinaryString(lfsr.getSeed()));
        }
    }

    static class LFSR {

        // Initial value of the LFSR
        int seed;

        // We are using the taps at position 1 and 0 from right-hand side
        int[] taps = new int[2];

        public int nextBit() {
            // This is shifted to the right and then XOR with position 1
            int newBit = (seed ^ (seed >> 1)) & 1 ;

            // update the seed with new value
            seed = (seed >> 1) | (newBit << 3);

            return seed;
        }

        public void setSeed(int number) {
            this.seed = number;
        }

        public void setTaps(int[] tap) {
            this.taps = tap;
        }

        public int getSeed() {
            return seed;
        }
    }
}