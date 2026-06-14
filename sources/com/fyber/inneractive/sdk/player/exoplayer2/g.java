package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f22643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f22644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f22645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f22646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f22647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f22648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f22649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f22655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f22656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f22657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f22658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f22659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f22661s;

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.f23166e + C4240b4.j.f42674e);
        if (aVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f22643a = dVar;
        this.f22651i = false;
        this.f22652j = 1;
        this.f22647e = new CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.f22644b = hVar;
        this.f22655m = x.f23251a;
        this.f22648f = new w();
        this.f22649g = new v();
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f22916d;
        this.f22657o = hVar;
        this.f22658p = s.f22815d;
        f fVar = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f22645c = fVar;
        i iVar = new i(0, 0L);
        this.f22659q = iVar;
        this.f22646d = new l(aVarArr, dVar, cVar, this.f22651i, fVar, iVar, this);
    }

    public final void a(boolean z10) {
        if (this.f22651i != z10) {
            this.f22651i = z10;
            this.f22646d.f22696f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f22647e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.f22652j, z10);
            }
        }
    }

    public final void a(int i10, long j10) {
        long j11;
        if (i10 >= 0 && (this.f22655m.c() || i10 < this.f22655m.b())) {
            this.f22653k++;
            this.f22660r = i10;
            if (this.f22655m.c()) {
                j11 = 1000;
            } else {
                this.f22655m.a(i10, this.f22648f, 0L);
                long j12 = j10 == -9223372036854775807L ? this.f22648f.f23248e : j10;
                w wVar = this.f22648f;
                int i11 = wVar.f23246c;
                long j13 = wVar.f23250g;
                int i12 = b.f21703a;
                long j14 = (j12 == -9223372036854775807L ? -9223372036854775807L : j12 * 1000) + j13;
                j11 = 1000;
                long j15 = this.f22655m.a(i11, this.f22649g, false).f23173d;
                while (j15 != -9223372036854775807L && j14 >= j15 && i11 < this.f22648f.f23247d) {
                    j14 -= j15;
                    i11++;
                    j15 = this.f22655m.a(i11, this.f22649g, false).f23173d;
                }
            }
            if (j10 == -9223372036854775807L) {
                this.f22661s = 0L;
                this.f22646d.f22696f.obtainMessage(3, new j(this.f22655m, i10, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.f22661s = j10;
            l lVar = this.f22646d;
            x xVar = this.f22655m;
            int i13 = b.f21703a;
            lVar.f22696f.obtainMessage(3, new j(xVar, i10, j10 != -9223372036854775807L ? j10 * j11 : -9223372036854775807L)).sendToTarget();
            Iterator it = this.f22647e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
            return;
        }
        throw new q();
    }

    public final void a(e... eVarArr) {
        l lVar = this.f22646d;
        if (lVar.f22707q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f22696f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.f22655m.c() && this.f22653k <= 0) {
            return this.f22655m.a(this.f22659q.f22681a, this.f22649g, false).f23172c;
        }
        return this.f22660r;
    }
}
