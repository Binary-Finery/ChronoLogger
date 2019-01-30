package spencerstudios.com.chronologger;

import android.util.Log;

import java.util.Locale;

public class ChronoLogger {

    private String tag;
    private String label;

    private long time_now;
    private long totalTime = 0;

    public ChronoLogger(String tag, String label) {
        this.tag = tag;
        this.label = label;
        this.time_now = getCurrentTimeInMillis();
    }

    public void split(String splitLabel) {
        long diff = System.currentTimeMillis() - time_now;
        appendTotalTime(diff);
        Log.d(tag, String.format(Locale.getDefault(), "  %dms, %s", diff, splitLabel));
        time_now = getCurrentTimeInMillis();
    }

    private void appendTotalTime(long time) {
        totalTime += time;
    }

    private long getCurrentTimeInMillis() {
        return System.currentTimeMillis();
    }

    public void dump() {
        Log.d(tag, "dump -> ".concat(String.format(Locale.getDefault(), "%dms (%.2fs)", totalTime, ((double) totalTime / 1000))));
    }
}