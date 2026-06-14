package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f21854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21855b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f21857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f21858e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f21863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f21866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n[] f21867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n[] f21868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f21869p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21856c = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentityHashMap f21859f = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f21860g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f21861h = new Handler();

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j10) {
        this.f21854a = kVar;
        this.f21855b = bVar;
        this.f21857d = fVar;
        this.f21858e = bVar2;
        this.f21862i = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.f21854a.f21985g.add(this);
        this.f21863j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.f21854a.f21988j;
        ArrayList arrayList = new ArrayList(bVar.f21914b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f21913b;
            if (oVar.f22798k > 0) {
                arrayList2.add(aVar);
                break;
                break;
            }
            String str = oVar.f22790c;
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split("(\\s*,\\s*)|(\\s*$)")) {
                    if (str2.startsWith("avc")) {
                        arrayList2.add(aVar);
                        break;
                    }
                }
            }
            String str3 = aVar.f21913b.f22790c;
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split("(\\s*,\\s*)|(\\s*$)");
                int length = strArrSplit.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (strArrSplit[i11].startsWith("mp4a")) {
                        arrayList3.add(aVar);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.f21915c;
        List list2 = bVar.f21916d;
        int size = list2.size() + list.size() + 1;
        this.f21867n = new n[size];
        this.f21864k = size;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.f21917e;
        f fVar = new f(this.f21854a, aVarArr, this.f21855b, this.f21860g, bVar.f21918f);
        n nVar = new n(0, this, fVar, this.f21858e, this.f21862i, oVar2, this.f21856c, this.f21857d);
        this.f21867n[0] = nVar;
        fVar.f21828h = true;
        if (!nVar.f21892o) {
            nVar.b(nVar.f21900w);
        }
        int i12 = 1;
        int i13 = 0;
        while (i13 < list.size()) {
            n nVar2 = new n(1, this, new f(this.f21854a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i13)}, this.f21855b, this.f21860g, Collections.EMPTY_LIST), this.f21858e, this.f21862i, null, this.f21856c, this.f21857d);
            int i14 = i12 + 1;
            this.f21867n[i12] = nVar2;
            if (!nVar2.f21892o) {
                nVar2.b(nVar2.f21900w);
            }
            i13++;
            i12 = i14;
        }
        int i15 = 0;
        while (i15 < list2.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i15);
            f fVar2 = new f(this.f21854a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.f21855b, this.f21860g, Collections.EMPTY_LIST);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.f21858e;
            n nVar3 = new n(3, this, fVar2, bVar2, this.f21862i, null, this.f21856c, this.f21857d);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.f21913b;
            if (nVar3.f21887j.indexOfKey(0) >= 0) {
                gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.f21887j.get(0);
            } else {
                gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                gVar.f21806n = nVar3;
                gVar.f21795c.f21767r = nVar3.f21895r;
                nVar3.f21887j.put(0, gVar);
            }
            gVar.a(oVar3);
            nVar3.f21891n = true;
            nVar3.h();
            this.f21867n[i12] = nVar3;
            i15++;
            i12++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        return this.f21869p.b(j10);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        /*
            r18 = this;
            r0 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] r1 = r0.f21868o
            int r2 = r1.length
            r5 = 0
            r6 = r5
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            r9 = -9223372036854775808
            if (r6 >= r2) goto L85
            r11 = r1[r6]
            boolean r12 = r11.f21902y
            if (r12 == 0) goto L1d
            r12 = r9
        L17:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L7a
        L1d:
            long r12 = r11.f21901x
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 == 0) goto L29
            goto L17
        L29:
            long r12 = r11.f21900w
            java.util.LinkedList r14 = r11.f21888k
            java.lang.Object r14 = r14.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            boolean r15 = r14.F
            if (r15 == 0) goto L38
            goto L51
        L38:
            java.util.LinkedList r14 = r11.f21888k
            int r14 = r14.size()
            r15 = 1
            if (r14 <= r15) goto L50
            java.util.LinkedList r14 = r11.f21888k
            int r15 = r14.size()
            int r15 = r15 + (-2)
            java.lang.Object r14 = r14.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            goto L51
        L50:
            r14 = 0
        L51:
            if (r14 == 0) goto L59
            long r14 = r14.f22837g
            long r12 = java.lang.Math.max(r12, r14)
        L59:
            android.util.SparseArray r14 = r11.f21887j
            int r14 = r14.size()
            r15 = r5
        L60:
            if (r15 >= r14) goto L17
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            android.util.SparseArray r3 = r11.f21887j
            java.lang.Object r3 = r3.valueAt(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) r3
            long r3 = r3.d()
            long r12 = java.lang.Math.max(r12, r3)
            int r15 = r15 + 1
            goto L60
        L7a:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 == 0) goto L82
            long r7 = java.lang.Math.min(r7, r12)
        L82:
            int r6 = r6 + 1
            goto Lc
        L85:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            return r9
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i.c():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        n[] nVarArr = this.f21867n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.f21884g.b();
                f fVar = nVar.f21880c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f21830j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f21831k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f21825e.f21982d.get(aVar);
                    hVar.f21969b.b();
                    IOException iOException = hVar.f21977j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.f21869p.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f21866m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        int[] iArr;
        int i10;
        boolean z10;
        v[] vVarArr2;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2;
        int i12;
        int[] iArr2;
        int[] iArr3 = new int[bVarArr.length];
        int[] iArr4 = new int[bVarArr.length];
        for (int i13 = 0; i13 < bVarArr.length; i13++) {
            v vVar = vVarArr[i13];
            iArr3[i13] = vVar == null ? -1 : ((Integer) this.f21859f.get(vVar)).intValue();
            iArr4[i13] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i13];
            if (bVar != null) {
                y yVar = bVar.f22925a;
                int i14 = 0;
                while (true) {
                    n[] nVarArr = this.f21867n;
                    if (i14 < nVarArr.length) {
                        z zVar = nVarArr[i14].f21897t;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= zVar.f22917a) {
                                i15 = -1;
                                break;
                            }
                            if (zVar.f22918b[i15] == yVar) {
                                break;
                            }
                            i15++;
                        }
                        if (i15 != -1) {
                            iArr4[i13] = i14;
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        this.f21859f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList = new ArrayList(this.f21867n.length);
        int i16 = 0;
        boolean z11 = false;
        while (i16 < this.f21867n.length) {
            int i17 = 0;
            while (true) {
                iArr = iArr3;
                if (i17 >= bVarArr.length) {
                    break;
                }
                vVarArr4[i17] = iArr[i17] == i16 ? vVarArr[i17] : null;
                bVarArr3[i17] = iArr4[i17] == i16 ? bVarArr[i17] : null;
                i17++;
                iArr3 = iArr;
            }
            n nVar = this.f21867n[i16];
            boolean z12 = this.f21865l;
            if (nVar.f21892o) {
                int i18 = 0;
                while (i18 < length2) {
                    v vVar2 = vVarArr4[i18];
                    if (vVar2 == null || (bVarArr3[i18] != null && zArr[i18])) {
                        i12 = i18;
                        iArr2 = iArr4;
                    } else {
                        i12 = i18;
                        int i19 = ((k) vVar2).f21875a;
                        iArr2 = iArr4;
                        boolean[] zArr3 = nVar.f21899v;
                        if (zArr3[i19]) {
                            zArr3[i19] = false;
                            nVar.f21893p--;
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i19)).b();
                            vVarArr4[i12] = null;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i18 = i12 + 1;
                    iArr4 = iArr2;
                }
                int[] iArr5 = iArr4;
                int i20 = 0;
                boolean z13 = false;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
                while (i20 < length2) {
                    if (vVarArr4[i20] == null) {
                        i10 = i20;
                        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr3[i10];
                        z10 = z12;
                        if (bVar3 != null) {
                            z zVar2 = nVar.f21897t;
                            vVarArr2 = vVarArr4;
                            y yVar2 = bVar3.f22925a;
                            i11 = length2;
                            bVarArr2 = bVarArr3;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= zVar2.f22917a) {
                                    i21 = -1;
                                    break;
                                }
                                if (zVar2.f22918b[i21] == yVar2) {
                                    break;
                                }
                                i21++;
                            }
                            boolean[] zArr4 = nVar.f21899v;
                            if (!zArr4[i21]) {
                                zArr4[i21] = true;
                                nVar.f21893p++;
                                if (i21 == nVar.f21898u) {
                                    nVar.f21880c.f21836p = bVar3;
                                    bVar2 = bVar3;
                                }
                                vVarArr2[i10] = new k(nVar, i21);
                                zArr2[i10] = true;
                                z13 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        i20 = i10 + 1;
                        z12 = z10;
                        vVarArr4 = vVarArr2;
                        length2 = i11;
                        bVarArr3 = bVarArr2;
                    } else {
                        i10 = i20;
                        z10 = z12;
                    }
                    vVarArr2 = vVarArr4;
                    i11 = length2;
                    bVarArr2 = bVarArr3;
                    i20 = i10 + 1;
                    z12 = z10;
                    vVarArr4 = vVarArr2;
                    length2 = i11;
                    bVarArr3 = bVarArr2;
                }
                v[] vVarArr5 = vVarArr4;
                int i22 = length2;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr4 = bVarArr3;
                if (!z12) {
                    int size = nVar.f21887j.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        if (!nVar.f21899v[i23]) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f21887j.valueAt(i23)).b();
                        }
                    }
                    if (bVar2 != null && !nVar.f21888k.isEmpty()) {
                        bVar2.d();
                        if (bVar2.f22927c[bVar2.a()] != nVar.f21880c.f21826f.a(((h) nVar.f21888k.getLast()).f22833c)) {
                            nVar.c(nVar.f21900w);
                        }
                    }
                }
                if (nVar.f21893p == 0) {
                    nVar.f21880c.f21830j = null;
                    nVar.f21894q = null;
                    nVar.f21888k.clear();
                    if (nVar.f21884g.a()) {
                        nVar.f21884g.f22944b.a(false);
                    }
                }
                z11 |= z13;
                boolean z14 = false;
                for (int i24 = 0; i24 < bVarArr.length; i24++) {
                    if (iArr5[i24] == i16) {
                        v vVar3 = vVarArr5[i24];
                        if (vVar3 != null) {
                            vVarArr3[i24] = vVar3;
                            this.f21859f.put(vVarArr5[i24], Integer.valueOf(i16));
                            z14 = true;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (iArr[i24] == i16 && vVarArr5[i24] != null) {
                        throw new IllegalStateException();
                    }
                }
                if (z14) {
                    arrayList.add(this.f21867n[i16]);
                }
                i16++;
                iArr3 = iArr;
                iArr4 = iArr5;
                vVarArr4 = vVarArr5;
                length2 = i22;
                bVarArr3 = bVarArr4;
            } else {
                throw new IllegalStateException();
            }
        }
        System.arraycopy(vVarArr3, 0, vVarArr, 0, length);
        n[] nVarArr2 = new n[arrayList.size()];
        this.f21868o = nVarArr2;
        arrayList.toArray(nVarArr2);
        n[] nVarArr3 = this.f21868o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].f21880c.f21828h = true;
            int i25 = 1;
            while (true) {
                n[] nVarArr4 = this.f21868o;
                if (i25 >= nVarArr4.length) {
                    break;
                }
                nVarArr4[i25].f21880c.f21828h = false;
                i25++;
            }
        }
        this.f21869p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f21868o);
        if (this.f21865l && z11) {
            a(j10);
            for (int i26 = 0; i26 < bVarArr.length; i26++) {
                if (vVarArr[i26] != null) {
                    zArr2[i26] = true;
                }
            }
        }
        this.f21865l = true;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        this.f21860g.f21903a.clear();
        for (n nVar : this.f21868o) {
            nVar.c(j10);
        }
        return j10;
    }
}
