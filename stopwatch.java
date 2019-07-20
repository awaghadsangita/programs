public class stopwatch {
    /** Time the Stopwatch started. */
    private long start = 0;

    /** Time the Stopwatch stopped. */
    private long stop = 0;

    /**
     * Start ticking, resets the watch.
     */
    public final void start() {
        start = System.currentTimeMillis();
    }

    /**
     * Stop ticking.
     */
    public final void stop() {
        stop = System.currentTimeMillis();
    }

    /**
     * Calculates time elapsed. If stop has not been called yet, the current time is taken to calculate elapsed time.
     * 
     * @return the time elapsed between start and stop as String. The string contains two of days, hours, minutes, seconds and
     *         milliseconds.
     * 
     * @throws StopWatchException If StopWatch was never started.
     */
    public final String elapsedTime()  {
        long difference;

        if (stop == 0) {
            long now = System.currentTimeMillis();

            difference = (now - start); // in millis
        } else {
            difference = (stop - start); // in millis
        }

   

        long mils = difference % 1000;

        difference = (difference - mils) / 1000; // in seconds

        long secs = difference % 60;

        difference = (difference - secs) / 60; // in minutes

        long minutes = difference % 60;

        difference = (difference - minutes) / 60; // in hours

        long hours = difference % 24;

        difference = (difference - hours) / 24; // in days

        long days = difference;
        String message = "";

        if (days > 0) {
            message = days + " days and  " + hours + " hours";
        } else if (hours > 0) {
            message = hours + " hours and " + minutes + " minutes";
        } else if (minutes > 0) {
            message = minutes + " minutes and " + secs + " seconds";
        } else if (secs > 0) {
            message = secs + " seconds and " + mils + " milliseconds";
        } else {
            message = mils + " milliseconds";
        }

        return message;
    }
}
