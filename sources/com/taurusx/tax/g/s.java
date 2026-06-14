package com.taurusx.tax.g;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.taurusx.tax.log.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f66350c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f66351w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f66352y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile y f66353z;

    public static class c implements w {
        public c() {
        }

        @Override // com.taurusx.tax.g.s.w
        public long z() {
            return SystemClock.elapsedRealtime();
        }
    }

    public interface w {
        long z();
    }

    public enum y {
        STARTED,
        PAUSED
    }

    public s() {
        this(new c());
    }

    private synchronized long z() {
        if (this.f66353z == y.PAUSED) {
            return 0L;
        }
        return this.f66350c.z() - this.f66351w;
    }

    public synchronized void c() {
        y yVar = this.f66353z;
        y yVar2 = y.STARTED;
        if (yVar == yVar2) {
            LogUtil.d("taurusx", "DoubleTimeTracker already started.");
        } else {
            this.f66353z = yVar2;
            this.f66351w = this.f66350c.z();
        }
    }

    public synchronized double w() {
        return this.f66352y + z();
    }

    public synchronized void y() {
        y yVar = this.f66353z;
        y yVar2 = y.PAUSED;
        if (yVar == yVar2) {
            LogUtil.d("taurusx", "DoubleTimeTracker already paused.");
            return;
        }
        this.f66352y += z();
        this.f66351w = 0L;
        this.f66353z = yVar2;
    }

    @VisibleForTesting
    public s(w wVar) {
        this.f66350c = wVar;
        this.f66353z = y.PAUSED;
    }
}
