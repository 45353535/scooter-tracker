package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl f110402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f110404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f110405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110407f;

    public el(AudioTrack audioTrack) {
        if (w83.f117341a >= 19) {
            this.f110402a = new dl(audioTrack);
            a();
        } else {
            this.f110402a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f110402a != null) {
            a(0);
        }
    }

    public final void a(int i10) {
        this.f110403b = i10;
        if (i10 == 0) {
            this.f110406e = 0L;
            this.f110407f = -1L;
            this.f110404c = System.nanoTime() / 1000;
            this.f110405d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f110405d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f110405d = 10000000L;
        } else {
            if (i10 == 4) {
                this.f110405d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
