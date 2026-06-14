package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f21880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f21881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o f21882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21883f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f21885h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f21894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f21897t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean[] f21899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f21900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f21901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21902y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f21884g = new b0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f21886i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f21887j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList f21888k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f21889l = new m(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f21890m = new Handler();

    public n(int i10, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i11, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f21878a = i10;
        this.f21879b = iVar;
        this.f21880c = fVar;
        this.f21881d = bVar;
        this.f21882e = oVar;
        this.f21883f = i11;
        this.f21885h = fVar2;
        this.f21900w = j10;
        this.f21901x = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(long r41) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.b(long):boolean");
    }

    public final void c(long j10) {
        this.f21900w = j10;
        this.f21901x = j10;
        this.f21902y = false;
        this.f21888k.clear();
        if (this.f21884g.a()) {
            this.f21884g.f22944b.a(false);
            return;
        }
        int size = this.f21887j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.valueAt(i10)).a(this.f21899v[i10]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f21890m.post(this.f21889l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j10 = this.f21901x;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f21902y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.f21888k.getLast()).f22837g;
    }

    public final void h() {
        if (this.f21896s || this.f21892o || !this.f21891n) {
            return;
        }
        int size = this.f21887j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.valueAt(i10)).e() == null) {
                return;
            }
        }
        int size2 = this.f21887j.size();
        int i11 = 0;
        char c10 = 0;
        int i12 = -1;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.valueAt(i11)).e().f22793f;
            char c11 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c11 > c10) {
                i12 = i11;
                c10 = c11;
            } else if (c11 == c10 && i12 != -1) {
                i12 = -1;
            }
            i11++;
        }
        y yVar = this.f21880c.f21826f;
        int i13 = yVar.f22913a;
        this.f21898u = -1;
        this.f21899v = new boolean[size2];
        y[] yVarArr = new y[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.valueAt(i14)).e();
            if (i14 == i12) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i13];
                for (int i15 = 0; i15 < i13; i15++) {
                    oVarArr[i15] = a(yVar.f22914b[i15], oVarE);
                }
                yVarArr[i14] = new y(oVarArr);
                this.f21898u = i14;
            } else {
                yVarArr[i14] = new y(a((c10 == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(oVarE.f22793f))) ? this.f21882e : null, oVarE));
            }
        }
        this.f21897t = new z(yVarArr);
        this.f21892o = true;
        i iVar = this.f21879b;
        int i16 = iVar.f21864k - 1;
        iVar.f21864k = i16;
        if (i16 > 0) {
            return;
        }
        int i17 = 0;
        for (n nVar : iVar.f21867n) {
            i17 += nVar.f21897t.f22917a;
        }
        y[] yVarArr2 = new y[i17];
        int i18 = 0;
        for (n nVar2 : iVar.f21867n) {
            int i19 = nVar2.f21897t.f22917a;
            int i20 = 0;
            while (i20 < i19) {
                yVarArr2[i18] = nVar2.f21897t.f22918b[i20];
                i20++;
                i18++;
            }
        }
        iVar.f21866m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f21863j).f22696f.obtainMessage(8, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f21885h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f22831a;
        int i10 = aVar.f22832b;
        int i11 = this.f21878a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f22833c;
        int i12 = aVar.f22834d;
        Object obj = aVar.f22835e;
        long j12 = aVar.f22836f;
        long j13 = aVar.f22837g;
        long jC = aVar.c();
        if (fVar.f22849b != null) {
            fVar.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (z10) {
            return;
        }
        int size = this.f21887j.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.valueAt(i13)).a(this.f21899v[i13]);
        }
        i iVar = this.f21879b;
        iVar.getClass();
        if (iVar.f21866m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f21863j;
        lVar.getClass();
        lVar.f22696f.obtainMessage(9, iVar).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j10, long j11) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.f21880c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.f21829i = cVar.f21812i;
            fVar.a(cVar.f22831a.f23036a, cVar.f21815l, cVar.f21816m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f21885h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f22831a;
        int i10 = aVar.f22832b;
        int i11 = this.f21878a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f22833c;
        int i12 = aVar.f22834d;
        Object obj = aVar.f22835e;
        long j12 = aVar.f22836f;
        long j13 = aVar.f22837g;
        long jC = aVar.c();
        if (fVar2.f22849b != null) {
            fVar2.f22848a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i10, i11, oVar, i12, obj, j12, j13, j10, j11, jC));
        }
        if (!this.f21892o) {
            b(this.f21900w);
            return;
        }
        i iVar = this.f21879b;
        iVar.getClass();
        if (iVar.f21866m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f21863j;
        lVar.getClass();
        lVar.f22696f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z r23, long r24, long r26, java.io.IOException r28) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z, long, long, java.io.IOException):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i10, int i11) {
        if (this.f21887j.indexOfKey(i10) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f21887j.get(i10);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f21881d);
        gVar.f21806n = this;
        gVar.f21795c.f21767r = this.f21895r;
        this.f21887j.put(i10, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        String strA;
        if (oVar == null) {
            return oVar2;
        }
        int iC = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f22793f);
        if (iC == 1) {
            strA = a(oVar.f22790c, 1);
        } else {
            strA = iC == 2 ? a(oVar.f22790c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f22788a, oVar2.f22792e, oVar2.f22793f, strA, oVar.f22789b, oVar2.f22794g, oVar.f22797j, oVar.f22798k, oVar2.f22799l, oVar2.f22800m, oVar2.f22801n, oVar2.f22803p, oVar2.f22802o, oVar2.f22804q, oVar2.f22805r, oVar2.f22806s, oVar2.f22807t, oVar2.f22808u, oVar2.f22809v, oVar.f22811x, oVar.f22812y, oVar2.f22813z, oVar2.f22810w, oVar2.f22795h, oVar2.f22796i, oVar2.f22791d);
    }

    public static String a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i10 == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f21891n = true;
        this.f21890m.post(this.f21889l);
    }
}
