class PrimeCalculator {

    int nth(int nth) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if(nth <= 0) throw new IllegalArgumentException("Cant be 0 or negative");
        if(nth == 1) return 2;
        long range = 3;
        int flag = 0;
        while(true) {
            for(int i=2; i<=Math.sqrt(range); i++) {
                if(range % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                nth--;
            }
            if(nth == 1) break;
            range++;
            flag = 0;
        }
        return (int) range;
    }

}
