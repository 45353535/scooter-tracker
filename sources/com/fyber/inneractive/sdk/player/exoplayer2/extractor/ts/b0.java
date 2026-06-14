package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f22406l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f22407m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f22408n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f22412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f22413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f22414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f22415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f22419k;

    public b0(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.f22413e = eVar;
        this.f22409a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f22410b = Collections.singletonList(vVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f22410b = arrayList;
            arrayList.add(vVar);
        }
        this.f22411c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.f22415g = new SparseBooleanArray();
        this.f22414f = new SparseArray();
        this.f22412d = new SparseIntArray();
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7) throws java.lang.InterruptedException, java.io.EOFException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = r6.f22411c
            byte[] r0 = r0.f23134a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.a(r0, r2, r1, r2)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.a(r1)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r1 = r1 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f22416h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f22410b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.f22410b.get(i10)).f23160c = -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22411c;
        nVar.f23135b = 0;
        nVar.f23136c = 0;
        this.f22412d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22411c;
        byte[] bArr = nVar.f23134a;
        int i10 = nVar.f23135b;
        if (940 - i10 < 188) {
            int i11 = nVar.f23136c - i10;
            if (i11 > 0) {
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22411c;
            nVar2.f23134a = bArr;
            nVar2.f23136c = i11;
            nVar2.f23135b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f22411c;
            int i12 = nVar3.f23136c;
            int i13 = nVar3.f23135b;
            if (i12 - i13 < 188) {
                int i14 = 940 - i12;
                int i15 = bVar.f21744f;
                if (i15 == 0) {
                    iMin = 0;
                } else {
                    iMin = Math.min(i15, i14);
                    System.arraycopy(bVar.f21742d, 0, bArr, i12, iMin);
                    bVar.b(iMin);
                }
                if (iMin == 0) {
                    bVar2 = bVar;
                    iMin = bVar2.a(bArr, i12, i14, 0, true);
                } else {
                    bVar2 = bVar;
                }
                if (iMin != -1) {
                    bVar2.f21741c += (long) iMin;
                }
                if (iMin == -1) {
                    return -1;
                }
                this.f22411c.d(i12 + iMin);
                bVar = bVar2;
            } else {
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                this.f22411c.e(i13);
                int i16 = i13 + 188;
                if (i16 > i12) {
                    return 0;
                }
                int iB = this.f22411c.b();
                if ((8388608 & iB) != 0) {
                    this.f22411c.e(i16);
                    return 0;
                }
                boolean z10 = true;
                boolean z11 = (4194304 & iB) != 0;
                int i17 = (2096896 & iB) >> 8;
                boolean z12 = (iB & 32) != 0;
                boolean z13 = (iB & 16) != 0;
                if (this.f22409a != 2) {
                    int i18 = iB & 15;
                    int i19 = this.f22412d.get(i17, i18 - 1);
                    this.f22412d.put(i17, i18);
                    if (i19 == i18) {
                        if (z13) {
                            this.f22411c.e(i16);
                            return 0;
                        }
                    } else if (i18 == ((i19 + 1) & 15)) {
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z12) {
                    int iJ = this.f22411c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f22411c;
                    nVar4.e(nVar4.f23135b + iJ);
                }
                if (z13 && (f0Var = (f0) this.f22414f.get(i17)) != null) {
                    if (z10) {
                        f0Var.a();
                    }
                    this.f22411c.d(i16);
                    f0Var.a(this.f22411c, z11);
                    this.f22411c.d(i12);
                }
                this.f22411c.e(i16);
                return 0;
            }
        }
    }

    public final void a() {
        this.f22415g.clear();
        this.f22414f.clear();
        this.f22413e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22414f.put(sparseArray.keyAt(i10), (f0) sparseArray.valueAt(i10));
        }
        this.f22414f.put(0, new w(new z(this)));
        this.f22419k = null;
    }
}
