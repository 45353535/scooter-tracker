package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f52416a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f52417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f52418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f52419d;

    private static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f52420a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f52420a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f52420a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f52420a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f52417b = j10;
        return this;
    }

    public b b(long j10) {
        this.f52416a = j10;
        return this;
    }

    public void c() {
        if (this.f52419d == null) {
            b();
        }
        this.f52419d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f52418c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f52419d;
        if (aVar != null) {
            aVar.cancel();
            this.f52419d = null;
        }
        if (this.f52417b <= 0) {
            this.f52417b = this.f52416a + 1000;
        }
        a aVar2 = new a(this.f52416a, this.f52417b);
        this.f52419d = aVar2;
        aVar2.a(this.f52418c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f52416a = j10;
        this.f52418c = aVar;
        b();
        a aVar2 = this.f52419d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f52419d;
        if (aVar != null) {
            aVar.cancel();
            this.f52419d = null;
        }
    }
}
