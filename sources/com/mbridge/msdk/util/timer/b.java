package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f52066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f52068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f52069d = 0;

    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f52070a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f52070a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f52070a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f52070a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f52068c;
        if (aVar != null) {
            aVar.cancel();
            this.f52068c = null;
        }
    }

    public b b(long j10) {
        this.f52069d = j10;
        return this;
    }

    public void c() {
        if (this.f52068c == null) {
            b();
        }
        this.f52068c.start();
    }

    public void b() {
        a aVar = this.f52068c;
        if (aVar != null) {
            aVar.cancel();
            this.f52068c = null;
        }
        if (this.f52067b <= 0) {
            this.f52067b = this.f52069d + 1000;
        }
        a aVar2 = new a(this.f52069d, this.f52067b);
        this.f52068c = aVar2;
        aVar2.a(this.f52066a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f52067b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f52066a = aVar;
        return this;
    }
}
