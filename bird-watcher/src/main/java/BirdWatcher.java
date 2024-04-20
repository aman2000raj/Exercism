
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int cnt : birdsPerDay) {
            if(cnt == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int cnt = 0;
        numberOfDays = Math.min(numberOfDays, 7);
        for (int i = 0; i < numberOfDays; i++) {
            cnt += birdsPerDay[i];
        }
        return cnt;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int busyDays = 0;
        for(int cnt : birdsPerDay) {
            if(cnt >= 5) busyDays += 1;
        }
        return busyDays;
    }
}
