package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class SoundUtils {
    private static final long CACHE_DURATION_MS = 2000;
    private static final String TAG = "SoundUtils";
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    private static volatile boolean isRefreshing = false;
    private static long lastCheckedTime = 0;
    private static boolean lastMutedState = true;

    public static /* synthetic */ void a(Context context) {
        try {
            try {
                try {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        lastMutedState = audioManager.getStreamVolume(2) == 0;
                        lastCheckedTime = System.currentTimeMillis();
                        Logger.d(TAG, "Update and return lastMutedState");
                    }
                } catch (Exception e10) {
                    HyBid.reportException(e10);
                    Logger.e(TAG, "Error fetching sound state: ", e10);
                }
            } catch (SecurityException e11) {
                HyBid.reportException((Exception) e11);
                Logger.e(TAG, "Security Error fetching sound state: ", e11);
            }
        } finally {
            isRefreshing = false;
        }
    }

    public static boolean isSoundMuted(Context context) {
        if (context == null) {
            return true;
        }
        if (System.currentTimeMillis() - lastCheckedTime >= 2000 && !isRefreshing) {
            refreshInBackground(context.getApplicationContext());
        }
        return lastMutedState;
    }

    private static void refreshInBackground(final Context context) {
        isRefreshing = true;
        executor.execute(new Runnable() { // from class: net.pubnative.lite.sdk.utils.h
            @Override // java.lang.Runnable
            public final void run() {
                SoundUtils.a(context);
            }
        });
    }
}
