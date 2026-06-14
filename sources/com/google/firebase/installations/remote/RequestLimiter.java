package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
class RequestLimiter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f32920d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f32921e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Utils f32922a = Utils.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32924c;

    RequestLimiter() {
    }

    private synchronized long a(int i10) {
        if (b(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f32924c) + this.f32922a.getRandomDelayForSyncPrevention(), f32921e);
        }
        return f32920d;
    }

    private static boolean b(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean c(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void d() {
        this.f32924c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isRequestAllowed() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f32924c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.Utils r0 = r4.f32922a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.currentTimeInMillis()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f32923b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.RequestLimiter.isRequestAllowed():boolean");
    }

    public synchronized void setNextRequestTime(int i10) {
        if (c(i10)) {
            d();
            return;
        }
        this.f32924c++;
        this.f32923b = this.f32922a.currentTimeInMillis() + a(i10);
    }
}
