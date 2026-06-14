package vb;

import io.bidmachine.media3.common.a;
import java.util.Collections;
import java.util.List;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f106228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f106230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106234g = -9223372036854775807L;

    public l(List list, String str) {
        this.f106228a = list;
        this.f106229b = str;
        this.f106230c = new s0[list.size()];
    }

    private boolean c(q9.d0 d0Var, int i10) {
        if (d0Var.a() == 0) {
            return false;
        }
        if (d0Var.H() != i10) {
            this.f106231d = false;
        }
        this.f106232e--;
        return this.f106231d;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        if (this.f106231d) {
            if (this.f106232e != 2 || c(d0Var, 32)) {
                if (this.f106232e != 1 || c(d0Var, 0)) {
                    int iF = d0Var.f();
                    int iA = d0Var.a();
                    for (s0 s0Var : this.f106230c) {
                        d0Var.W(iF);
                        s0Var.c(d0Var, iA);
                    }
                    this.f106233f += iA;
                }
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f106230c.length; i10++) {
            l0.a aVar = (l0.a) this.f106228a.get(i10);
            dVar.a();
            s0 s0VarTrack = tVar.track(dVar.c(), 3);
            s0VarTrack.f(new a.b().f0(dVar.b()).U(this.f106229b).u0("application/dvbsubs").g0(Collections.singletonList(aVar.f106237c)).j0(aVar.f106235a).N());
            this.f106230c[i10] = s0VarTrack;
        }
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
        if (this.f106231d) {
            q9.a.g(this.f106234g != -9223372036854775807L);
            for (s0 s0Var : this.f106230c) {
                s0Var.e(this.f106234g, 1, this.f106233f, 0, null);
            }
            this.f106231d = false;
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f106231d = true;
        this.f106234g = j10;
        this.f106233f = 0;
        this.f106232e = 2;
    }

    @Override // vb.m
    public void seek() {
        this.f106231d = false;
        this.f106234g = -9223372036854775807L;
    }
}
