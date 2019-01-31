package spencerstudios.com.chronologger;

import android.util.Log;

import java.util.Locale;

public class ChronoLogger {

    private String tag;

    private long prev_time;
    private long total_time = 0;

    public ChronoLogger(String tag) {
        this.tag = tag;
        this.prev_time = getTime();
        Log.d(tag, "start...");
    }

    public void split(String splitLabel) {
        long time_diff = getTime() - prev_time;
        appendTotalTime(time_diff);
        Log.d(tag, String.format(Locale.getDefault(), "  %dms, %s", time_diff, splitLabel));
        prev_time = getTime();
    }

    private void appendTotalTime(long time) {
        total_time += time;
    }

    private long getTime() {
        return System.currentTimeMillis();
    }

    public void dump() {
        Log.d(tag, "dump -> ".concat(String.format(Locale.getDefault(), "%dms (%.2fs)", total_time, ((double) total_time / 1000))));
    }
}