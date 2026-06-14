package io.bidmachine.media3.exoplayer;

import ga.f0;
import io.bidmachine.media3.exoplayer.k1;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class j implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ka.h f81092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f81094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f81095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f81096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f81097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f81098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f81099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f81100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f81101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81102k;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f81103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81104b;

        private b() {
        }
    }

    public j() {
        this(new ka.h(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static void j(int i10, int i11, String str, String str2) {
        q9.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int m(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void n(v9.c2 c2Var) {
        if (this.f81101j.remove(c2Var) != null) {
            p();
        }
    }

    private void o(v9.c2 c2Var) {
        b bVar = (b) q9.a.e((b) this.f81101j.get(c2Var));
        int i10 = this.f81097f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f81104b = i10;
        bVar.f81103a = false;
    }

    private void p() {
        if (this.f81101j.isEmpty()) {
            this.f81092a.d();
        } else {
            this.f81092a.e(l());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public boolean a(n9.e0 e0Var, f0.b bVar, long j10) {
        Iterator it = this.f81101j.values().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f81103a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public void b(v9.c2 c2Var) {
        n(c2Var);
        if (this.f81101j.isEmpty()) {
            this.f81102k = -1L;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public boolean c(k1.a aVar) {
        long jL0 = q9.o0.l0(aVar.f81170e, aVar.f81171f);
        long jMin = aVar.f81173h ? this.f81096e : this.f81095d;
        long j10 = aVar.f81174i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jL0 >= jMin) {
            return true;
        }
        return !this.f81098g && this.f81092a.c() >= l();
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public boolean d(k1.a aVar) {
        b bVar = (b) q9.a.e((b) this.f81101j.get(aVar.f81166a));
        boolean z10 = true;
        boolean z11 = this.f81092a.c() >= l();
        long jMin = this.f81093b;
        float f10 = aVar.f81171f;
        if (f10 > 1.0f) {
            jMin = Math.min(q9.o0.g0(jMin, f10), this.f81094c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f81170e;
        if (j10 < jMax) {
            if (!this.f81098g && z11) {
                z10 = false;
            }
            bVar.f81103a = z10;
            if (!z10 && j10 < 500000) {
                q9.u.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f81094c || z11) {
            bVar.f81103a = false;
        }
        return bVar.f81103a;
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public void e(v9.c2 c2Var) {
        n(c2Var);
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public boolean f(v9.c2 c2Var) {
        return this.f81100i;
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public void g(v9.c2 c2Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f81102k;
        q9.a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f81102k = id2;
        if (!this.f81101j.containsKey(c2Var)) {
            this.f81101j.put(c2Var, new b());
        }
        o(c2Var);
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public ka.b getAllocator() {
        return this.f81092a;
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public void h(k1.a aVar, ga.m1 m1Var, ja.r[] rVarArr) {
        b bVar = (b) q9.a.e((b) this.f81101j.get(aVar.f81166a));
        int iK = this.f81097f;
        if (iK == -1) {
            iK = k(rVarArr);
        }
        bVar.f81104b = iK;
        p();
    }

    @Override // io.bidmachine.media3.exoplayer.k1
    public long i(v9.c2 c2Var) {
        return this.f81099h;
    }

    protected int k(ja.r[] rVarArr) {
        int iM = 0;
        for (ja.r rVar : rVarArr) {
            if (rVar != null) {
                iM += m(rVar.getTrackGroup().f95296c);
            }
        }
        return Math.max(13107200, iM);
    }

    int l() {
        Iterator it = this.f81101j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((b) it.next()).f81104b;
        }
        return i10;
    }

    protected j(ka.h hVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        j(i12, 0, "bufferForPlaybackMs", "0");
        j(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        j(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i11, i10, "maxBufferMs", "minBufferMs");
        j(i15, 0, "backBufferDurationMs", "0");
        this.f81092a = hVar;
        this.f81093b = q9.o0.P0(i10);
        this.f81094c = q9.o0.P0(i11);
        this.f81095d = q9.o0.P0(i12);
        this.f81096e = q9.o0.P0(i13);
        this.f81097f = i14;
        this.f81098g = z10;
        this.f81099h = q9.o0.P0(i15);
        this.f81100i = z11;
        this.f81101j = new HashMap();
        this.f81102k = -1L;
    }
}
