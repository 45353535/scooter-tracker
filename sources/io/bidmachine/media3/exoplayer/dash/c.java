package io.bidmachine.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import ga.c0;
import ga.c1;
import ga.d1;
import ga.j;
import ga.m1;
import ga.n0;
import ga.s;
import ha.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.dash.a;
import io.bidmachine.media3.exoplayer.dash.f;
import io.bidmachine.media3.exoplayer.l1;
import j$.util.Objects;
import ja.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.m;
import ka.q;
import n9.f0;
import q9.o0;
import s9.y;
import u9.m0;
import v9.c2;
import y9.g;
import z9.u;
import z9.w;

/* JADX INFO: loaded from: classes12.dex */
final class c implements c0, d1.a, h.b {
    private static final Pattern B = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern C = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private long A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f80714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0982a f80715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f80716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f80717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f80718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x9.b f80719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f80720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f80721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ka.b f80722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m1 f80723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a[] f80724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j f80725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f80726n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n0.a f80728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final u.a f80729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c2 f80730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c0.a f80731s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d1 f80734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private y9.c f80735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f80736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f80737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f80738z = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h[] f80732t = x(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e[] f80733u = new e[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap f80727o = new IdentityHashMap();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f80739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f80741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f80742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f80743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f80744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f80745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ImmutableList f80746h;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, ImmutableList immutableList) {
            this.f80740b = i10;
            this.f80739a = iArr;
            this.f80741c = i11;
            this.f80743e = i12;
            this.f80744f = i13;
            this.f80745g = i14;
            this.f80742d = i15;
            this.f80746h = immutableList;
        }

        public static a a(int[] iArr, int i10, ImmutableList immutableList) {
            return new a(3, 1, iArr, i10, -1, -1, -1, immutableList);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, ImmutableList.of());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, ImmutableList.of());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, ImmutableList.of());
        }
    }

    public c(int i10, y9.c cVar, x9.b bVar, int i11, a.InterfaceC0982a interfaceC0982a, y yVar, ka.f fVar, w wVar, u.a aVar, m mVar, n0.a aVar2, long j10, q qVar, ka.b bVar2, j jVar, f.b bVar3, c2 c2Var) {
        this.f80714b = i10;
        this.f80735w = cVar;
        this.f80719g = bVar;
        this.f80736x = i11;
        this.f80715c = interfaceC0982a;
        this.f80716d = yVar;
        this.f80717e = wVar;
        this.f80729q = aVar;
        this.f80718f = mVar;
        this.f80728p = aVar2;
        this.f80720h = j10;
        this.f80721i = qVar;
        this.f80722j = bVar2;
        this.f80725m = jVar;
        this.f80730r = c2Var;
        this.f80726n = new f(cVar, bVar3, bVar2);
        this.f80734v = jVar.empty();
        g gVarC = cVar.c(i11);
        List list = gVarC.f108444d;
        this.f80737y = list;
        Pair pairL = l(wVar, interfaceC0982a, gVarC.f108443c, list);
        this.f80723k = (m1) pairL.first;
        this.f80724l = (a[]) pairL.second;
    }

    private void B(r[] rVarArr, boolean[] zArr, c1[] c1VarArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10] == null || !zArr[i10]) {
                c1 c1Var = c1VarArr[i10];
                if (c1Var instanceof h) {
                    ((h) c1Var).G(this);
                } else if (c1Var instanceof h.a) {
                    ((h.a) c1Var).b();
                }
                c1VarArr[i10] = null;
            }
        }
    }

    private void C(r[] rVarArr, c1[] c1VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            if ((c1Var instanceof s) || (c1Var instanceof h.a)) {
                int iS = s(i10, iArr);
                if (iS == -1) {
                    z10 = c1VarArr[i10] instanceof s;
                } else {
                    c1 c1Var2 = c1VarArr[i10];
                    z10 = (c1Var2 instanceof h.a) && ((h.a) c1Var2).f73040b == c1VarArr[iS];
                }
                if (!z10) {
                    c1 c1Var3 = c1VarArr[i10];
                    if (c1Var3 instanceof h.a) {
                        ((h.a) c1Var3).b();
                    }
                    c1VarArr[i10] = null;
                }
            }
        }
    }

    private void D(r[] rVarArr, c1[] c1VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                c1 c1Var = c1VarArr[i10];
                if (c1Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f80724l[iArr[i10]];
                    int i11 = aVar.f80741c;
                    if (i11 == 0) {
                        c1VarArr[i10] = k(aVar, rVar, j10);
                    } else if (i11 == 2) {
                        c1VarArr[i10] = new e((y9.f) this.f80737y.get(aVar.f80742d), rVar.getTrackGroup().a(0), this.f80735w.f108408d);
                    }
                } else if (c1Var instanceof h) {
                    ((io.bidmachine.media3.exoplayer.dash.a) ((h) c1Var).u()).a(rVar);
                }
            }
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (c1VarArr[i12] == null && rVarArr[i12] != null) {
                a aVar2 = this.f80724l[iArr[i12]];
                if (aVar2.f80741c == 1) {
                    int iS = s(i12, iArr);
                    if (iS == -1) {
                        c1VarArr[i12] = new s();
                    } else {
                        c1VarArr[i12] = ((h) c1VarArr[iS]).J(j10, aVar2.f80740b);
                    }
                }
            }
        }
    }

    private static void h(List list, f0[] f0VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            y9.f fVar = (y9.f) list.get(i11);
            f0VarArr[i10] = new f0(fVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i11, new a.b().f0(fVar.a()).u0("application/x-emsg").N());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int i(w wVar, a.InterfaceC0982a interfaceC0982a, List list, int[][] iArr, int i10, boolean[] zArr, io.bidmachine.media3.common.a[][] aVarArr, f0[] f0VarArr, a[] aVarArr2) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i10) {
            int[] iArr2 = iArr[i15];
            ArrayList arrayList = new ArrayList();
            int length = iArr2.length;
            for (int i17 = i14; i17 < length; i17++) {
                arrayList.addAll(((y9.a) list.get(iArr2[i17])).f108397c);
            }
            int size = arrayList.size();
            io.bidmachine.media3.common.a[] aVarArr3 = new io.bidmachine.media3.common.a[size];
            for (int i18 = i14; i18 < size; i18++) {
                io.bidmachine.media3.common.a aVar = ((y9.j) arrayList.get(i18)).f108456b;
                aVarArr3[i18] = aVar.b().V(wVar.d(aVar)).N();
            }
            y9.a aVar2 = (y9.a) list.get(iArr2[i14]);
            long j10 = aVar2.f108395a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i15;
            int i19 = i16 + 1;
            if (zArr[i15]) {
                i11 = i16 + 2;
            } else {
                i11 = i19;
                i19 = -1;
            }
            if (aVarArr[i15].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            w(interfaceC0982a, aVarArr3);
            int i20 = i14;
            f0VarArr[i16] = new f0(string, aVarArr3);
            aVarArr2[i16] = a.d(aVar2.f108396b, iArr2, i16, i19, i11);
            if (i19 != -1) {
                String str = string + ":emsg";
                io.bidmachine.media3.common.a[] aVarArr4 = new io.bidmachine.media3.common.a[1];
                aVarArr4[i20] = new a.b().f0(str).u0("application/x-emsg").N();
                f0VarArr[i19] = new f0(str, aVarArr4);
                aVarArr2[i19] = a.b(iArr2, i16);
                i13 = -1;
            } else {
                i13 = -1;
            }
            if (i11 != i13) {
                aVarArr2[i11] = a.a(iArr2, i16, ImmutableList.copyOf(aVarArr[i15]));
                w(interfaceC0982a, aVarArr[i15]);
                f0VarArr[i11] = new f0(string + ":cc", aVarArr[i15]);
            }
            i15++;
            i16 = i12;
            i14 = i20;
        }
        return i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h k(a aVar, r rVar, long j10) {
        int i10;
        f0 f0VarB;
        int i11;
        int i12 = aVar.f80744f;
        boolean z10 = i12 != -1;
        f.c cVarK = null;
        if (z10) {
            f0VarB = this.f80723k.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            f0VarB = null;
        }
        int i13 = aVar.f80745g;
        ImmutableList immutableListOf = i13 != -1 ? this.f80724l[i13].f80746h : ImmutableList.of();
        int size = i10 + immutableListOf.size();
        io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[size];
        int[] iArr = new int[size];
        if (z10) {
            aVarArr[0] = f0VarB.a(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < immutableListOf.size(); i14++) {
            io.bidmachine.media3.common.a aVar2 = (io.bidmachine.media3.common.a) immutableListOf.get(i14);
            aVarArr[i11] = aVar2;
            iArr[i11] = 3;
            arrayList.add(aVar2);
            i11++;
        }
        if (this.f80735w.f108408d && z10) {
            cVarK = this.f80726n.k();
        }
        f.c cVar = cVarK;
        h hVar = new h(aVar.f80740b, iArr, aVarArr, this.f80715c.d(this.f80721i, this.f80735w, this.f80719g, this.f80736x, aVar.f80739a, rVar, aVar.f80740b, this.f80720h, z10, arrayList, cVar, this.f80716d, this.f80730r, null), this, this.f80722j, j10, this.f80717e, this.f80729q, this.f80718f, this.f80728p, this.f80738z, null);
        synchronized (this) {
            this.f80727o.put(hVar, cVar);
        }
        return hVar;
    }

    private static Pair l(w wVar, a.InterfaceC0982a interfaceC0982a, List list, List list2) {
        int[][] iArrR = r(list);
        int length = iArrR.length;
        boolean[] zArr = new boolean[length];
        io.bidmachine.media3.common.a[][] aVarArr = new io.bidmachine.media3.common.a[length][];
        int iV = v(length, list, iArrR, zArr, aVarArr) + length + list2.size();
        f0[] f0VarArr = new f0[iV];
        a[] aVarArr2 = new a[iV];
        h(list2, f0VarArr, aVarArr2, i(wVar, interfaceC0982a, list, iArrR, length, zArr, aVarArr, f0VarArr, aVarArr2));
        return Pair.create(new m1(f0VarArr), aVarArr2);
    }

    private static boolean m(y9.a aVar, y9.a aVar2) {
        if (aVar.f108396b != aVar2.f108396b) {
            return false;
        }
        if (aVar.f108397c.isEmpty() || aVar2.f108397c.isEmpty()) {
            return true;
        }
        io.bidmachine.media3.common.a aVar3 = ((y9.j) aVar.f108397c.get(0)).f108456b;
        io.bidmachine.media3.common.a aVar4 = ((y9.j) aVar2.f108397c.get(0)).f108456b;
        return Objects.equals(aVar3.f80550d, aVar4.f80550d) && aVar3.f80552f == aVar4.f80552f;
    }

    private static y9.e n(List list) {
        return o(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static y9.e o(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            y9.e eVar = (y9.e) list.get(i10);
            if (str.equals(eVar.f108433a)) {
                return eVar;
            }
        }
        return null;
    }

    private static y9.e p(List list) {
        return o(list, "http://dashif.org/guidelines/trickmode");
    }

    private static io.bidmachine.media3.common.a[] q(List list, int[] iArr) {
        for (int i10 : iArr) {
            y9.a aVar = (y9.a) list.get(i10);
            List list2 = ((y9.a) list.get(i10)).f108398d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                y9.e eVar = (y9.e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f108433a)) {
                    return z(eVar, B, new a.b().u0("application/cea-608").f0(aVar.f108395a + ":cea608").N());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f108433a)) {
                    return z(eVar, C, new a.b().u0("application/cea-708").f0(aVar.f108395a + ":cea708").N());
                }
            }
        }
        return new io.bidmachine.media3.common.a[0];
    }

    private static int[][] r(List list) {
        y9.e eVarN;
        Integer num;
        int size = list.size();
        HashMap mapNewHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapNewHashMapWithExpectedSize.put(Long.valueOf(((y9.a) list.get(i10)).f108395a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            y9.a aVar = (y9.a) list.get(i11);
            y9.e eVarP = p(aVar.f108399e);
            if (eVarP == null) {
                eVarP = p(aVar.f108400f);
            }
            int iIntValue = (eVarP == null || (num = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(eVarP.f108434b)))) == null) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarN = n(aVar.f108400f)) != null) {
                for (String str : o0.j1(eVarN.f108434b, StringUtils.COMMA)) {
                    Integer num2 = (Integer) mapNewHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && m(aVar, (y9.a) list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] array = Ints.toArray((Collection) arrayList.get(i12));
            iArr[i12] = array;
            Arrays.sort(array);
        }
        return iArr;
    }

    private int s(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f80724l[i11].f80743e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f80724l[i14].f80741c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] t(r[] rVarArr) {
        int[] iArr = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                iArr[i10] = this.f80723k.d(rVar.getTrackGroup());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean u(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((y9.a) list.get(i10)).f108397c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((y9.j) list2.get(i11)).f108459e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int v(int i10, List list, int[][] iArr, boolean[] zArr, io.bidmachine.media3.common.a[][] aVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (u(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            io.bidmachine.media3.common.a[] aVarArrQ = q(list, iArr[i12]);
            aVarArr[i12] = aVarArrQ;
            if (aVarArrQ.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static void w(a.InterfaceC0982a interfaceC0982a, io.bidmachine.media3.common.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr[i10] = interfaceC0982a.c(aVarArr[i10]);
        }
    }

    private static h[] x(int i10) {
        return new h[i10];
    }

    private static io.bidmachine.media3.common.a[] z(y9.e eVar, Pattern pattern, io.bidmachine.media3.common.a aVar) {
        String str = eVar.f108434b;
        if (str == null) {
            return new io.bidmachine.media3.common.a[]{aVar};
        }
        String[] strArrJ1 = o0.j1(str, ";");
        io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[strArrJ1.length];
        for (int i10 = 0; i10 < strArrJ1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrJ1[i10]);
            if (!matcher.matches()) {
                return new io.bidmachine.media3.common.a[]{aVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            aVarArr[i10] = aVar.b().f0(aVar.f80547a + StringUtils.PROCESS_POSTFIX_DELIMITER + i11).O(i11).j0(matcher.group(2)).N();
        }
        return aVarArr;
    }

    public void A() {
        this.f80726n.o();
        for (h hVar : this.f80732t) {
            hVar.G(this);
        }
        this.f80731s = null;
    }

    public void E(y9.c cVar, int i10) {
        this.f80735w = cVar;
        this.f80736x = i10;
        this.f80726n.q(cVar);
        h[] hVarArr = this.f80732t;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                ((io.bidmachine.media3.exoplayer.dash.a) hVar.u()).d(cVar, i10);
            }
            this.f80731s.d(this);
        }
        this.f80737y = cVar.c(i10).f108444d;
        for (e eVar : this.f80733u) {
            Iterator it = this.f80737y.iterator();
            while (true) {
                if (it.hasNext()) {
                    y9.f fVar = (y9.f) it.next();
                    if (fVar.a().equals(eVar.a())) {
                        eVar.c(fVar, cVar.f108408d && i10 == cVar.d() - 1);
                    }
                }
            }
        }
    }

    @Override // ga.c0, ga.d1
    public boolean a(l1 l1Var) {
        return this.f80734v.a(l1Var);
    }

    @Override // ga.c0
    public long b(long j10, m0 m0Var) {
        for (h hVar : this.f80732t) {
            if (hVar.f73015b == 2) {
                return hVar.b(j10, m0Var);
            }
        }
        return j10;
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f80731s = aVar;
        aVar.f(this);
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        for (h hVar : this.f80732t) {
            hVar.discardBuffer(j10, z10);
        }
    }

    @Override // ha.h.b
    public synchronized void e(h hVar) {
        f.c cVar = (f.c) this.f80727o.remove(hVar);
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return this.f80734v.getBufferedPositionUs();
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return this.f80734v.getNextLoadPositionUs();
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return this.f80723k;
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f80734v.isLoading();
    }

    @Override // ga.c0
    public long j(r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        int[] iArrT = t(rVarArr);
        B(rVarArr, zArr, c1VarArr);
        C(rVarArr, c1VarArr, iArrT);
        D(rVarArr, c1VarArr, zArr2, j10, iArrT);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c1 c1Var : c1VarArr) {
            if (c1Var instanceof h) {
                arrayList.add((h) c1Var);
            } else if (c1Var instanceof e) {
                arrayList2.add((e) c1Var);
            }
        }
        h[] hVarArrX = x(arrayList.size());
        this.f80732t = hVarArrX;
        arrayList.toArray(hVarArrX);
        e[] eVarArr = new e[arrayList2.size()];
        this.f80733u = eVarArr;
        arrayList2.toArray(eVarArr);
        this.f80734v = this.f80725m.create(arrayList, Lists.transform(arrayList, new Function() { // from class: io.bidmachine.media3.exoplayer.dash.b
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableList.of(Integer.valueOf(((h) obj).f73015b));
            }
        }));
        if (this.f80738z) {
            this.f80738z = false;
            this.A = j10;
        }
        return j10;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() {
        this.f80721i.maybeThrowError();
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        for (h hVar : this.f80732t) {
            if (hVar.p()) {
                return this.A;
            }
        }
        return -9223372036854775807L;
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        for (h hVar : this.f80732t) {
            if (!hVar.isLoading()) {
                hVar.t(this.f80735w.f(this.f80736x));
            }
        }
        this.f80734v.reevaluateBuffer(j10);
    }

    @Override // ga.c0
    public long seekToUs(long j10) throws Throwable {
        for (h hVar : this.f80732t) {
            hVar.I(j10);
        }
        for (e eVar : this.f80733u) {
            eVar.b(j10);
        }
        return j10;
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void d(h hVar) {
        this.f80731s.d(this);
    }
}
