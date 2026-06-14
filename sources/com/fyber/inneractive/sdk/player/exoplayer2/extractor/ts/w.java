package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f22614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22615b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22619f;

    public w(v vVar) {
        this.f22614a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f22614a.a(vVar, jVar, e0Var);
        this.f22619f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f22619f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int iJ = z10 ? nVar.f23135b + nVar.j() : -1;
        if (this.f22619f) {
            if (!z10) {
                return;
            }
            this.f22619f = false;
            nVar.e(iJ);
            this.f22617d = 0;
        }
        while (true) {
            int i10 = nVar.f23136c - nVar.f23135b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f22617d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f23135b - 1);
                    if (iJ2 == 255) {
                        this.f22619f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f23136c - nVar.f23135b, 3 - this.f22617d);
                nVar.a(this.f22615b.f23134a, this.f22617d, iMin);
                int i12 = this.f22617d + iMin;
                this.f22617d = i12;
                if (i12 == 3) {
                    this.f22615b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22615b;
                    nVar2.e(nVar2.f23135b + 1);
                    int iJ3 = this.f22615b.j();
                    int iJ4 = this.f22615b.j();
                    this.f22618e = (iJ3 & 128) != 0;
                    this.f22616c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f22615b.a();
                    int i13 = this.f22616c;
                    if (iA < i13) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f22615b;
                        byte[] bArr = nVar3.f23134a;
                        nVar3.c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f22615b.f23134a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f22616c - i11);
                nVar.a(this.f22615b.f23134a, this.f22617d, iMin2);
                int i14 = this.f22617d + iMin2;
                this.f22617d = i14;
                int i15 = this.f22616c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f22618e) {
                        byte[] bArr2 = this.f22615b.f23134a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23169h[((i16 >>> 24) ^ (bArr2[i17] & 255)) & 255] ^ (i16 << 8);
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
                        if (i16 != 0) {
                            this.f22619f = true;
                            return;
                        }
                        this.f22615b.c(this.f22616c - 4);
                    } else {
                        this.f22615b.c(i15);
                    }
                    this.f22614a.a(this.f22615b);
                    this.f22617d = 0;
                }
            }
        }
    }
}
