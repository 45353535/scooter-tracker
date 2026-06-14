package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class O5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41500e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f41501a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4457o f41503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4587vb f41504d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4457o interfaceC4457o = O5.this.f41503c;
            if (interfaceC4457o != null) {
                interfaceC4457o.a();
            }
        }
    }

    public O5(int i10, InterfaceC4457o interfaceC4457o) {
        this.f41503c = interfaceC4457o;
        this.f41502b = i10;
    }

    public boolean b() {
        return this.f41502b > 0;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f41502b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f41503c.a();
                return;
            }
            a();
            this.f41504d = new C4587vb(millis, this.f41501a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public void a() {
        if (!b() || this.f41504d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f41504d.e();
        this.f41504d = null;
    }
}
