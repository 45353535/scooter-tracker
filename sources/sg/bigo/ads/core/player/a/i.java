package sg.bigo.ads.core.player.a;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f104583b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f104585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f104586e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f104582a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f104584c = new Object();

    public final int a(byte[] bArr, long j10) throws j {
        if (j10 < 0) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i10 = 0;
        while (!this.f104583b.c() && this.f104583b.a() < PlaybackStateCompat.ACTION_PLAY_FROM_URI + j10 && !this.f104585d) {
            i10++;
            synchronized (this.f104582a) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f104586e.f102458b + ",count=" + i10);
                    this.f104582a.wait(1000L);
                } catch (InterruptedException e10) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e10.toString());
                }
            }
            if (i10 >= 15) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j("Error reading source " + i10 + " times");
            }
        }
        int iA = this.f104583b.a(bArr, j10);
        if (iA <= 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(iA)));
        }
        return iA;
    }
}
