package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s f22662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.v[] f22664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f22665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f22672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f22674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a[] f22675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a[] f22676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f22677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f22678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.u f22679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f22680s;

    public h(a[] aVarArr, a[] aVarArr2, long j10, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, Object obj, int i10, boolean z10, long j11) {
        this.f22675n = aVarArr;
        this.f22676o = aVarArr2;
        this.f22666e = j10;
        this.f22677p = iVar;
        this.f22678q = cVar;
        this.f22679r = uVar;
        obj.getClass();
        this.f22663b = obj;
        this.f22667f = i10;
        this.f22669h = z10;
        this.f22668g = j11;
        this.f22664c = new com.fyber.inneractive.sdk.player.exoplayer2.source.v[aVarArr.length];
        this.f22665d = new boolean[aVarArr.length];
        this.f22662a = uVar.a(i10, cVar.f21705a, j11);
    }

    public final long a(long j10, boolean z10, boolean[] zArr) {
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = this.f22674m.f22938b;
        for (int i11 = 0; i11 < hVar.f22934a; i11++) {
            this.f22665d[i11] = !z10 && this.f22674m.a(this.f22680s, i11);
        }
        long jA = this.f22662a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[]) hVar.f22935b.clone(), this.f22665d, this.f22664c, zArr, j10);
        this.f22680s = this.f22674m;
        this.f22671j = false;
        int i12 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.v[] vVarArr = this.f22664c;
            if (i12 >= vVarArr.length) {
                c cVar = this.f22678q;
                a[] aVarArr = this.f22675n;
                z zVar = this.f22674m.f22937a;
                cVar.f21710f = 0;
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (hVar.f22935b[i13] != null) {
                        int i14 = cVar.f21710f;
                        int i15 = aVarArr[i13].f21573a;
                        int i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
                        if (i15 == 0) {
                            i10 = 16777216;
                        } else if (i15 == 1) {
                            i10 = C.DEFAULT_AUDIO_BUFFER_SIZE;
                        } else if (i15 == 2) {
                            i10 = 13107200;
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                throw new IllegalStateException();
                            }
                            i10 = 131072;
                        }
                        cVar.f21710f = i14 + i10;
                    }
                }
                cVar.f21705a.a(cVar.f21710f);
                return jA;
            }
            if (vVarArr[i12] != null) {
                if (hVar.f22935b[i12] == null) {
                    throw new IllegalStateException();
                }
                this.f22671j = true;
            } else if (hVar.f22935b[i12] != null) {
                throw new IllegalStateException();
            }
            i12++;
        }
    }

    public final void a() {
        try {
            this.f22679r.a(this.f22662a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }
}
