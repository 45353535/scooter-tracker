package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.s3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements io.sentry.w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f82803h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f82796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f82797b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f82798c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f82799d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f82800e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f82801f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f82802g = new File(AndroidDynamicDeviceInfoDataSource.DIRECTORY_PROCESS_INFO);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f82804i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pattern f82805j = Pattern.compile("[\n\t\r ]");

    public w(ILogger iLogger) {
        this.f82803h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = io.sentry.util.h.c(this.f82802g);
        } catch (IOException e10) {
            this.f82804i = false;
            this.f82803h.a(g7.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f82805j.split(strC.trim());
            try {
                long j10 = Long.parseLong(strArrSplit[13]);
                long j11 = Long.parseLong(strArrSplit[14]);
                return (long) ((j10 + j11 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f82801f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.f82803h.a(g7.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.w0
    public void c() {
        this.f82804i = true;
        this.f82798c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f82799d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f82801f = 1.0E9d / this.f82798c;
        this.f82797b = e();
    }

    @Override // io.sentry.w0
    public void d(s3 s3Var) {
        if (this.f82804i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.f82796a;
            this.f82796a = jElapsedRealtimeNanos;
            long jE = e();
            long j11 = jE - this.f82797b;
            this.f82797b = jE;
            s3Var.e(Double.valueOf(((j11 / j10) / this.f82799d) * 100.0d));
        }
    }
}
