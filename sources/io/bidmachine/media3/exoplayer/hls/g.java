package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import ba.g;
import ba.k;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.ironsource.C4240b4;
import ga.c0;
import ga.d1;
import ga.m1;
import ga.n0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.hls.l;
import io.bidmachine.media3.exoplayer.l1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ka.m;
import n9.f0;
import n9.v;
import n9.x;
import q9.o0;
import s9.y;
import u9.m0;
import v9.c2;
import z9.u;
import z9.w;

/* JADX INFO: loaded from: classes12.dex */
final class g implements c0, k.b {
    private d1 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aa.e f80997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ba.k f80998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aa.d f80999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f81000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f81001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u.a f81002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f81003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n0.a f81004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ka.b f81005j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ga.j f81008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f81009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f81010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f81011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c2 f81012q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f81014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c0.a f81015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f81016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private m1 f81017v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f81021z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l.b f81013r = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IdentityHashMap f81006k = new IdentityHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aa.j f81007l = new aa.j();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private l[] f81018w = new l[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l[] f81019x = new l[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[][] f81020y = new int[0][];

    private class b implements l.b {
        private b() {
        }

        @Override // ga.d1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void d(l lVar) {
            g.this.f81015t.d(g.this);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.l.b
        public void onPlaylistRefreshRequired(Uri uri) {
            g.this.f80998c.refreshPlaylist(uri);
        }

        @Override // io.bidmachine.media3.exoplayer.hls.l.b
        public void onPrepared() {
            if (g.f(g.this) > 0) {
                return;
            }
            int i10 = 0;
            for (l lVar : g.this.f81018w) {
                i10 += lVar.getTrackGroups().f72380a;
            }
            f0[] f0VarArr = new f0[i10];
            int i11 = 0;
            for (l lVar2 : g.this.f81018w) {
                int i12 = lVar2.getTrackGroups().f72380a;
                int i13 = 0;
                while (i13 < i12) {
                    f0VarArr[i11] = lVar2.getTrackGroups().b(i13);
                    i13++;
                    i11++;
                }
            }
            g.this.f81017v = new m1(f0VarArr);
            g.this.f81015t.f(g.this);
        }
    }

    public g(aa.e eVar, ba.k kVar, aa.d dVar, y yVar, ka.f fVar, w wVar, u.a aVar, m mVar, n0.a aVar2, ka.b bVar, ga.j jVar, boolean z10, int i10, boolean z11, c2 c2Var, long j10) {
        this.f80997b = eVar;
        this.f80998c = kVar;
        this.f80999d = dVar;
        this.f81000e = yVar;
        this.f81001f = wVar;
        this.f81002g = aVar;
        this.f81003h = mVar;
        this.f81004i = aVar2;
        this.f81005j = bVar;
        this.f81008m = jVar;
        this.f81009n = z10;
        this.f81010o = i10;
        this.f81011p = z11;
        this.f81012q = c2Var;
        this.f81014s = j10;
        this.A = jVar.empty();
    }

    static /* synthetic */ int f(g gVar) {
        int i10 = gVar.f81016u - 1;
        gVar.f81016u = i10;
        return i10;
    }

    private void l(long j10, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((g.a) list.get(i10)).f6078d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Objects.equals(str, ((g.a) list.get(i11)).f6078d)) {
                        g.a aVar = (g.a) list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f6075a);
                        arrayList2.add(aVar.f6076b);
                        z10 &= o0.R(aVar.f6076b.f80557k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                l lVarO = o(str2, 1, (Uri[]) arrayList.toArray((Uri[]) o0.j(new Uri[0])), (io.bidmachine.media3.common.a[]) arrayList2.toArray(new io.bidmachine.media3.common.a[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(Ints.toArray(arrayList3));
                list2.add(lVarO);
                if (this.f81009n && z10) {
                    lVarO.U(new f0[]{new f0(str2, (io.bidmachine.media3.common.a[]) arrayList2.toArray(new io.bidmachine.media3.common.a[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void m(ba.g gVar, long j10, List list, List list2, Map map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = gVar.f6066e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < gVar.f6066e.size(); i13++) {
            io.bidmachine.media3.common.a aVar = ((g.b) gVar.f6066e.get(i13)).f6080b;
            if (aVar.f80569w > 0 || o0.S(aVar.f80557k, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (o0.S(aVar.f80557k, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z10 = true;
            z11 = false;
        } else if (i12 < size) {
            i10 = size - i12;
            z11 = true;
            z10 = false;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < gVar.f6066e.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                g.b bVar = (g.b) gVar.f6066e.get(i15);
                uriArr[i14] = bVar.f6079a;
                aVarArr[i14] = bVar.f6080b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = aVarArr[0].f80557k;
        int iR = o0.R(str, 2);
        int iR2 = o0.R(str, 1);
        boolean z12 = (iR2 == 1 || (iR2 == 0 && gVar.f6068g.isEmpty())) && iR <= 1 && iR2 + iR > 0;
        l lVarO = o(C4240b4.i.Z, (z10 || iR2 <= 0) ? 0 : 1, uriArr, aVarArr, gVar.f6071j, gVar.f6072k, map, j10);
        list.add(lVarO);
        list2.add(iArr2);
        if (this.f81009n && z12) {
            ArrayList arrayList = new ArrayList();
            if (iR > 0) {
                io.bidmachine.media3.common.a[] aVarArr2 = new io.bidmachine.media3.common.a[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    aVarArr2[i16] = r(aVarArr[i16]);
                }
                arrayList.add(new f0(C4240b4.i.Z, aVarArr2));
                if (iR2 > 0 && (gVar.f6071j != null || gVar.f6068g.isEmpty())) {
                    arrayList.add(new f0(C4240b4.i.Z + ":audio", p(aVarArr[0], gVar.f6071j, false)));
                }
                List list3 = gVar.f6072k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new f0(C4240b4.i.Z + ":cc:" + i17, this.f80997b.c((io.bidmachine.media3.common.a) list3.get(i17))));
                    }
                }
            } else {
                io.bidmachine.media3.common.a[] aVarArr3 = new io.bidmachine.media3.common.a[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    aVarArr3[i18] = p(aVarArr[i18], gVar.f6071j, true);
                }
                arrayList.add(new f0(C4240b4.i.Z, aVarArr3));
            }
            f0 f0Var = new f0(C4240b4.i.Z + ":id3", new a.b().f0("ID3").u0("application/id3").N());
            arrayList.add(f0Var);
            lVarO.U((f0[]) arrayList.toArray(new f0[0]), 0, arrayList.indexOf(f0Var));
        }
    }

    private void n(long j10) {
        int i10 = 0;
        ba.g gVar = (ba.g) q9.a.e(this.f80998c.getMultivariantPlaylist());
        Map mapQ = this.f81011p ? q(gVar.f6074m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = gVar.f6066e.isEmpty();
        List list = gVar.f6068g;
        List list2 = gVar.f6069h;
        this.f81016u = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            m(gVar, j10, arrayList, arrayList2, mapQ);
        }
        l(j10, list, arrayList, arrayList2, mapQ);
        this.f81021z = arrayList.size();
        int i11 = 0;
        while (i11 < list2.size()) {
            g.a aVar = (g.a) list2.get(i11);
            String str = "subtitle:" + i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.f6078d;
            io.bidmachine.media3.common.a aVar2 = aVar.f6076b;
            Uri[] uriArr = new Uri[1];
            uriArr[i10] = aVar.f6075a;
            io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[1];
            aVarArr[i10] = aVar2;
            Map map = mapQ;
            int i12 = i10;
            l lVarO = o(str, 3, uriArr, aVarArr, null, Collections.EMPTY_LIST, map, j10);
            mapQ = map;
            arrayList2.add(new int[]{i11});
            arrayList.add(lVarO);
            io.bidmachine.media3.common.a[] aVarArr2 = new io.bidmachine.media3.common.a[1];
            aVarArr2[i12] = this.f80997b.c(aVar2);
            f0[] f0VarArr = new f0[1];
            f0VarArr[i12] = new f0(str, aVarArr2);
            lVarO.U(f0VarArr, i12, new int[i12]);
            i11++;
            i10 = i12;
        }
        int i13 = i10;
        this.f81018w = (l[]) arrayList.toArray(new l[i13]);
        this.f81020y = (int[][]) arrayList2.toArray(new int[i13][]);
        this.f81016u = this.f81018w.length;
        for (int i14 = i13; i14 < this.f81021z; i14++) {
            this.f81018w[i14].d0(true);
        }
        l[] lVarArr = this.f81018w;
        int length = lVarArr.length;
        for (int i15 = i13; i15 < length; i15++) {
            lVarArr[i15].r();
        }
        this.f81019x = this.f81018w;
    }

    private l o(String str, int i10, Uri[] uriArr, io.bidmachine.media3.common.a[] aVarArr, io.bidmachine.media3.common.a aVar, List list, Map map, long j10) {
        return new l(str, i10, this.f81013r, new c(this.f80997b, this.f80998c, uriArr, aVarArr, this.f80999d, this.f81000e, this.f81007l, this.f81014s, list, this.f81012q, null), map, this.f81005j, j10, aVar, this.f81001f, this.f81002g, this.f81003h, this.f81004i, this.f81010o);
    }

    private static io.bidmachine.media3.common.a p(io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2, boolean z10) {
        v vVar;
        int i10;
        String str;
        String str2;
        List list;
        int i11;
        int i12;
        String str3;
        ImmutableList immutableListOf = ImmutableList.of();
        if (aVar2 != null) {
            str2 = aVar2.f80557k;
            vVar = aVar2.f80558l;
            i11 = aVar2.E;
            i10 = aVar2.f80551e;
            i12 = aVar2.f80552f;
            str = aVar2.f80550d;
            str3 = aVar2.f80548b;
            list = aVar2.f80549c;
        } else {
            String strS = o0.S(aVar.f80557k, 1);
            vVar = aVar.f80558l;
            if (z10) {
                i11 = aVar.E;
                i10 = aVar.f80551e;
                i12 = aVar.f80552f;
                str = aVar.f80550d;
                str3 = aVar.f80548b;
                str2 = strS;
                list = aVar.f80549c;
            } else {
                i10 = 0;
                str = null;
                str2 = strS;
                list = immutableListOf;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new a.b().f0(aVar.f80547a).h0(str3).i0(list).U(aVar.f80560n).u0(n9.w.g(str2)).S(str2).n0(vVar).Q(z10 ? aVar.f80554h : -1).p0(z10 ? aVar.f80555i : -1).R(i11).w0(i10).s0(i12).j0(str).N();
    }

    private static Map q(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataF = (DrmInitData) list.get(i10);
            String str = drmInitDataF.f80509d;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.f80509d, str)) {
                    drmInitDataF = drmInitDataF.f(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataF);
        }
        return map;
    }

    private static io.bidmachine.media3.common.a r(io.bidmachine.media3.common.a aVar) {
        String strS = o0.S(aVar.f80557k, 2);
        return new a.b().f0(aVar.f80547a).h0(aVar.f80548b).i0(aVar.f80549c).U(aVar.f80560n).u0(n9.w.g(strS)).S(strS).n0(aVar.f80558l).Q(aVar.f80554h).p0(aVar.f80555i).B0(aVar.f80568v).d0(aVar.f80569w).b0(aVar.f80570x).w0(aVar.f80551e).s0(aVar.f80552f).N();
    }

    @Override // ga.c0, ga.d1
    public boolean a(l1 l1Var) {
        if (this.f81017v != null) {
            return this.A.a(l1Var);
        }
        for (l lVar : this.f81018w) {
            lVar.r();
        }
        return false;
    }

    @Override // ga.c0
    public long b(long j10, m0 m0Var) {
        for (l lVar : this.f81019x) {
            if (lVar.H()) {
                return lVar.b(j10, m0Var);
            }
        }
        return j10;
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f81015t = aVar;
        this.f80998c.c(this);
        n(j10);
    }

    @Override // ba.k.b
    public boolean d(Uri uri, m.c cVar, boolean z10) {
        boolean zR = true;
        for (l lVar : this.f81018w) {
            zR &= lVar.R(uri, cVar, z10);
        }
        this.f81015t.d(this);
        return zR;
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        for (l lVar : this.f81019x) {
            lVar.discardBuffer(j10, z10);
        }
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return this.A.getBufferedPositionUs();
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return this.A.getNextLoadPositionUs();
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return (m1) q9.a.e(this.f81017v);
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.A.isLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // ga.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(ja.r[] r21, boolean[] r22, ga.c1[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.hls.g.j(ja.r[], boolean[], ga.c1[], boolean[], long):long");
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() throws x {
        for (l lVar : this.f81018w) {
            lVar.maybeThrowPrepareError();
        }
    }

    @Override // ba.k.b
    public void onPlaylistChanged() {
        for (l lVar : this.f81018w) {
            lVar.S();
        }
        this.f81015t.d(this);
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        this.A.reevaluateBuffer(j10);
    }

    public void s() {
        this.f80998c.a(this);
        for (l lVar : this.f81018w) {
            lVar.W();
        }
        this.f81015t = null;
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        l[] lVarArr = this.f81019x;
        if (lVarArr.length > 0) {
            boolean Z = lVarArr[0].Z(j10, false);
            int i10 = 1;
            while (true) {
                l[] lVarArr2 = this.f81019x;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                lVarArr2[i10].Z(j10, Z);
                i10++;
            }
            if (Z) {
                this.f81007l.b();
            }
        }
        return j10;
    }
}
