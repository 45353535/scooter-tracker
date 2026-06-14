package net.pubnative.lite.sdk.utils.browser;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DoubleClickPreventionListener implements View.OnClickListener {
    private static final long MIN_CLICK_INTERVAL_MS = 1000;
    private long lastClickTimestamp;
    TimeProvider timeProvider;

    interface TimeProvider {
        long getCurrentTime();
    }

    public DoubleClickPreventionListener() {
        this(new TimeProvider() { // from class: net.pubnative.lite.sdk.utils.browser.c
            @Override // net.pubnative.lite.sdk.utils.browser.DoubleClickPreventionListener.TimeProvider
            public final long getCurrentTime() {
                return SystemClock.elapsedRealtime();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTime = this.timeProvider.getCurrentTime();
        if (currentTime - this.lastClickTimestamp < 1000) {
            return;
        }
        this.lastClickTimestamp = currentTime;
        processClick();
    }

    protected abstract void processClick();

    public DoubleClickPreventionListener(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }
}
