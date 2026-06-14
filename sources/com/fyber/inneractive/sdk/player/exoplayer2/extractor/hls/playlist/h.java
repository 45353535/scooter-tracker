package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements x, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f21969b = new b0("HlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f21970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f21977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f21978k;

    public h(k kVar, a aVar, long j10) {
        this.f21978k = kVar;
        this.f21968a = aVar;
        this.f21974g = j10;
        this.f21970c = new d0(kVar.f21979a.f21811a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.f21988j.f21942a, aVar.f21912a), kVar.f21980b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21978k.f21987i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
        long j12 = d0Var.f23019f;
        if (fVar.f22849b != null) {
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    public final void b() {
        this.f21975h = 0L;
        if (this.f21976i || this.f21969b.a()) {
            return;
        }
        b0 b0Var = this.f21969b;
        d0 d0Var = this.f21970c;
        int i10 = this.f21978k.f21981c;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, this, i10, SystemClock.elapsedRealtime());
        if (b0Var.f22944b != null) {
            throw new IllegalStateException();
        }
        b0Var.f22944b = yVar;
        yVar.f23095e = null;
        b0Var.f22943a.execute(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21976i = false;
        b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f23017d;
        if (eVar instanceof d) {
            a((d) eVar);
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21978k.f21987i;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
            long j12 = d0Var.f23019f;
            if (fVar.f22849b != null) {
                fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
                return;
            }
            return;
        }
        this.f21977j = new r("Loaded playlist has unexpected type.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        int i10;
        IOException iOException2 = iOException;
        d0 d0Var = (d0) zVar;
        boolean z10 = iOException2 instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21978k.f21987i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f23014a;
        long j12 = d0Var.f23019f;
        if (fVar.f22849b != null) {
            iOException2 = iOException;
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        }
        if (z10) {
            return 3;
        }
        if ((iOException2 instanceof v) && ((i10 = ((v) iOException2).f23088a) == 404 || i10 == 410)) {
            a();
            k kVar2 = this.f21978k;
            if (kVar2.f21989k != this.f21968a) {
                return 2;
            }
            List list = kVar2.f21988j.f21914b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = (h) kVar2.f21982d.get(list.get(i11));
                if (jElapsedRealtime > hVar.f21975h) {
                    kVar2.f21989k = hVar.f21968a;
                    hVar.b();
                    return 2;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d r29) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d):void");
    }

    public final void a() {
        this.f21975h = SystemClock.elapsedRealtime() + 60000;
        k kVar = this.f21978k;
        a aVar = this.f21968a;
        int size = kVar.f21985g.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f21985g.get(i10);
            for (n nVar : iVar.f21867n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.f21880c;
                int iA = fVar.f21826f.a(aVar.f21913b);
                if (iA != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f21836p;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVar.f22926b) {
                            i11 = -1;
                            break;
                        } else if (bVar.f22927c[i11] == iA) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        fVar.f21836p.a(i11);
                    }
                }
            }
            if (iVar.f21866m != null) {
                l lVar = (l) iVar.f21863j;
                lVar.getClass();
                lVar.f22696f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (n nVar2 : iVar.f21867n) {
                    if (!nVar2.f21892o) {
                        nVar2.b(nVar2.f21900w);
                    }
                }
            }
        }
    }
}
