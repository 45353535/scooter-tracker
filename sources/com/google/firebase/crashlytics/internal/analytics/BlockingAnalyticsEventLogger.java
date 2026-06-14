package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CrashlyticsOriginAnalyticsEventLogger f31960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f31962c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f31964e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f31963d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31965f = false;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i10, TimeUnit timeUnit) {
        this.f31960a = crashlyticsOriginAnalyticsEventLogger;
        this.f31961b = i10;
        this.f31962c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.f31963d) {
            try {
                Logger.getLogger().v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f31964e = new CountDownLatch(1);
                this.f31965f = false;
                this.f31960a.logEvent(str, bundle);
                Logger.getLogger().v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f31964e.await(this.f31961b, this.f31962c)) {
                        this.f31965f = true;
                        Logger.getLogger().v("App exception callback received from Analytics listener.");
                    } else {
                        Logger.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f31964e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f31964e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
