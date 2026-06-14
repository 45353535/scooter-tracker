package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f22467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22471f;

    public g(List list) {
        this.f22466a = list;
        this.f22467b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f22468c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.f22468c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f22467b) {
                rVar.a(this.f22471f, 1, this.f22470e, 0, null);
            }
            this.f22468c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f22467b.length; i10++) {
            c0 c0Var = (c0) this.f22466a.get(i10);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f22453d, 3);
            e0Var.b();
            gVarA.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.f22454e, null, "application/dvbsubs", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.f22425a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.f22426b), null, null));
            this.f22467b[i10] = gVarA;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f22468c = true;
            this.f22471f = j10;
            this.f22470e = 0;
            this.f22469d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z10;
        boolean z11;
        if (this.f22468c) {
            if (this.f22469d == 2) {
                if (nVar.f23136c - nVar.f23135b == 0) {
                    z11 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.f22468c = false;
                    }
                    this.f22469d--;
                    z11 = this.f22468c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f22469d == 1) {
                if (nVar.f23136c - nVar.f23135b == 0) {
                    z10 = false;
                } else {
                    if (nVar.j() != 0) {
                        this.f22468c = false;
                    }
                    this.f22469d--;
                    z10 = this.f22468c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = nVar.f23135b;
            int i11 = nVar.f23136c - i10;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f22467b) {
                nVar.e(i10);
                rVar.a(i11, nVar);
            }
            this.f22470e += i11;
        }
    }
}
