package yads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ew0 implements xo0 {
    public static final byte[] G;
    public static final yv0 H;
    public int A;
    public boolean B;
    public ap0 C;
    public z43[] D;
    public z43[] E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f110483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f110484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w92 f110485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w92 f110486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f110487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w92 f110488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ul0 f110489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w92 f110490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f110491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f110492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z43 f110493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f110494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f110495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f110496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f110497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w92 f110498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f110499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f110500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f110501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f110502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f110503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dw0 f110504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f110505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f110506z;

    static {
        new cp0() { // from class: yads.m6
            @Override // yads.cp0
            public final xo0[] a() {
                return ew0.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
        G = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        xv0 xv0Var = new xv0();
        xv0Var.f117982k = "application/x-emsg";
        H = new yv0(xv0Var);
    }

    public ew0(int i10) {
        this(Collections.EMPTY_LIST);
    }

    public final r43 a(r43 r43Var) {
        return r43Var;
    }

    @Override // yads.xo0
    public final void release() {
    }

    public ew0(int i10, List list, z43 z43Var) {
        this.f110481a = i10;
        this.f110482b = DesugarCollections.unmodifiableList(list);
        this.f110493m = z43Var;
        this.f110489i = new ul0();
        this.f110490j = new w92(16);
        this.f110484d = new w92(pw1.f114801a);
        this.f110485e = new w92(5);
        this.f110486f = new w92();
        byte[] bArr = new byte[16];
        this.f110487g = bArr;
        this.f110488h = new w92(bArr);
        this.f110491k = new ArrayDeque();
        this.f110492l = new ArrayDeque();
        this.f110483c = new SparseArray();
        this.f110502v = -9223372036854775807L;
        this.f110501u = -9223372036854775807L;
        this.f110503w = -9223372036854775807L;
        this.C = ap0.f108745a;
        this.D = new z43[0];
        this.E = new z43[0];
    }

    public static fj0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            oj ojVar = (oj) arrayList.get(i10);
            if (ojVar.f114688a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = ojVar.f114339b.f117356a;
                zi2 zi2VarA = aj2.a(bArr);
                UUID uuid = zi2VarA == null ? null : zi2VarA.f118713a;
                if (uuid == null) {
                    uf1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new ej0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new fj0(null, false, (ej0[]) arrayList2.toArray(new ej0[0]));
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        int i10;
        this.C = ap0Var;
        int i11 = 0;
        this.f110494n = 0;
        this.f110497q = 0;
        z43[] z43VarArr = new z43[2];
        this.D = z43VarArr;
        z43 z43Var = this.f110493m;
        if (z43Var != null) {
            z43VarArr[0] = z43Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f110481a & 4) != 0) {
            z43VarArr[i10] = ap0Var.a(100, 5);
            i12 = 101;
            i10++;
        }
        z43[] z43VarArr2 = (z43[]) w83.a(i10, this.D);
        this.D = z43VarArr2;
        for (z43 z43Var2 : z43VarArr2) {
            z43Var2.a(H);
        }
        this.E = new z43[this.f110482b.size()];
        while (i11 < this.E.length) {
            z43 z43VarA = this.C.a(i12, 3);
            z43VarA.a((yv0) this.f110482b.get(i11));
            this.E[i11] = z43VarA;
            i11++;
            i12++;
        }
    }

    public ew0(List list) {
        this(0, list, null);
    }

    public final void a(nj njVar) {
        ae0 ae0Var;
        ae0 ae0Var2;
        fj0 fj0VarA = a(njVar.f113920c);
        nj njVarB = njVar.b(1836475768);
        njVarB.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = njVarB.f113920c.size();
        long jN = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            oj ojVar = (oj) njVarB.f113920c.get(i10);
            int i11 = ojVar.f114688a;
            if (i11 == 1953654136) {
                w92 w92Var = ojVar.f114339b;
                w92Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(w92Var.b()), new ae0(w92Var.b() - 1, w92Var.b(), w92Var.b(), w92Var.b()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (ae0) pairCreate.second);
            } else if (i11 == 1835362404) {
                w92 w92Var2 = ojVar.f114339b;
                w92Var2.e(8);
                jN = ((w92Var2.b() >> 24) & 255) == 0 ? w92Var2.n() : w92Var2.q();
            }
        }
        ArrayList arrayListA = wj.a(njVar, new lx0(), jN, fj0VarA, (this.f110481a & 16) != 0, false, new ix0() { // from class: yads.l6
            @Override // yads.ix0
            public final Object apply(Object obj) {
                return this.f112977a.a((r43) obj);
            }
        });
        int size2 = arrayListA.size();
        if (this.f110483c.size() == 0) {
            for (int i12 = 0; i12 < size2; i12++) {
                a53 a53Var = (a53) arrayListA.get(i12);
                r43 r43Var = a53Var.f108566a;
                z43 z43VarA = this.C.a(i12, r43Var.f115307b);
                int i13 = r43Var.f115306a;
                if (sparseArray.size() == 1) {
                    ae0Var2 = (ae0) sparseArray.valueAt(0);
                } else {
                    ae0Var2 = (ae0) sparseArray.get(i13);
                    ae0Var2.getClass();
                }
                this.f110483c.put(r43Var.f115306a, new dw0(z43VarA, a53Var, ae0Var2));
                this.f110502v = Math.max(this.f110502v, r43Var.f115310e);
            }
            this.C.a();
            return;
        }
        if (this.f110483c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i14 = 0; i14 < size2; i14++) {
            a53 a53Var2 = (a53) arrayListA.get(i14);
            r43 r43Var2 = a53Var2.f108566a;
            dw0 dw0Var = (dw0) this.f110483c.get(r43Var2.f115306a);
            int i15 = r43Var2.f115306a;
            if (sparseArray.size() == 1) {
                ae0Var = (ae0) sparseArray.valueAt(0);
            } else {
                ae0Var = (ae0) sparseArray.get(i15);
                ae0Var.getClass();
            }
            dw0Var.a(a53Var2, ae0Var);
        }
    }

    public static void a(w92 w92Var, int i10, t43 t43Var) throws ba2 {
        w92Var.e(i10 + 8);
        int iB = w92Var.b();
        if ((iB & 1) == 0) {
            boolean z10 = (iB & 2) != 0;
            int iP = w92Var.p();
            if (iP == 0) {
                Arrays.fill(t43Var.f116062l, 0, t43Var.f116055e, false);
                return;
            }
            if (iP == t43Var.f116055e) {
                Arrays.fill(t43Var.f116062l, 0, iP, z10);
                t43Var.f116064n.c(w92Var.f117358c - w92Var.f117357b);
                t43Var.f116061k = true;
                t43Var.f116065o = true;
                w92 w92Var2 = t43Var.f116064n;
                w92Var.a(w92Var2.f117356a, 0, w92Var2.f117358c);
                t43Var.f116064n.e(0);
                t43Var.f116065o = false;
                return;
            }
            throw new ba2("Senc sample count " + iP + " is different from fragment sample count" + t43Var.f116055e, null, true, 1);
        }
        throw ba2.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0397  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r52) throws yads.ba2 {
        /*
            Method dump skipped, instruction units count: 1617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ew0.a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0209, code lost:
    
        if ("video/hevc".equals(r14) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0210, code lost:
    
        if (((r17 & 126) >> (r2 == true ? 1 : 0)) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0212, code lost:
    
        r9 = r2 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0214, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0215, code lost:
    
        r29.B = r9;
        r29.f110506z += 5;
        r29.f110505y += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        r9 = 0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
    
        throw new yads.ba2("Invalid NAL length", null, r2, r2 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022e, code lost:
    
        if (r29.B == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0230, code lost:
    
        r29.f110486f.c(r14);
        r9 = r29.f110486f.f117356a;
        r14 = r29.A;
        r26 = r2 == true ? 1 : 0;
        ((yads.yc0) r1).a(r9, 0, r14, false);
        r7.a(r29.A, r29.f110486f);
        r2 = r29.A;
        r5 = r29.f110486f;
        r5 = yads.pw1.a(r5.f117358c, r5.f117356a);
        r29.f110486f.e("video/hevc".equals(r6.f115311f.f118398m) ? 1 : 0);
        r29.f110486f.d(r5);
        yads.ht.a(r10, r29.f110486f, r29.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0271, code lost:
    
        r26 = r2 == true ? 1 : 0;
        r2 = r7.a(r1, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0279, code lost:
    
        r29.f110506z += r2;
        r29.A -= r2;
        r2 = r26;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0287, code lost:
    
        r26 = r2 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028a, code lost:
    
        r26 = r2 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028c, code lost:
    
        r2 = r29.f110506z;
        r4 = r29.f110505y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0290, code lost:
    
        if (r2 >= r4) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0292, code lost:
    
        r29.f110506z += r7.a(r1, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a0, code lost:
    
        if (r3.f110097l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a2, code lost:
    
        r1 = r3.f110089d.f108572g[r3.f110091f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b3, code lost:
    
        if (r3.f110087b.f116060j[r3.f110091f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b5, code lost:
    
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b8, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bd, code lost:
    
        if (r3.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bf, code lost:
    
        r1 = (r1 == true ? 1 : 0) | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c2, code lost:
    
        r22 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c8, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ca, code lost:
    
        r25 = r1.f115698c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02cf, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d1, code lost:
    
        r20 = r10;
        r7.a(r20, r22 == true ? 1 : 0, r29.f110505y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e4, code lost:
    
        if (r29.f110492l.isEmpty() != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e6, code lost:
    
        r1 = (yads.cw0) r29.f110492l.removeFirst();
        r29.f110500t -= r1.f109622c;
        r4 = r1.f109620a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f9, code lost:
    
        if (r1.f109621b == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02fb, code lost:
    
        r4 = r4 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fd, code lost:
    
        r10 = r4;
        r2 = r29.D;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0302, code lost:
    
        if (r5 >= r4) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0304, code lost:
    
        r2[r5].a(r10, 1, r1.f109622c, r29.f110500t, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0312, code lost:
    
        r3.f110091f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031a, code lost:
    
        if (r3.f110097l != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031c, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031e, code lost:
    
        r1 = r3.f110092g + 1;
        r3.f110092g = r1;
        r2 = r3.f110087b.f116057g;
        r4 = r3.f110093h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x032c, code lost:
    
        if (r1 != r2[r4]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x032e, code lost:
    
        r3.f110093h = r4 + 1;
        r2 = 0;
        r3.f110092g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0335, code lost:
    
        r29.f110504x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0339, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x033b, code lost:
    
        r29.f110494n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x033d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (r29.f110494n != 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        if (r3.f110097l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        r4 = r3.f110089d.f108569d[r3.f110091f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r4 = r3.f110087b.f116058h[r3.f110091f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
    
        r29.f110505y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r3.f110091f >= r3.f110094i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
    
        ((yads.yc0) r1).a(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        r4 = r3.f110087b.f116064n;
        r1 = r1.f115699d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f1, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        r4.e(r4.f117357b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r1 = r3.f110087b;
        r6 = r3.f110091f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        if (r1.f116061k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        if (r1.f116062l[r6] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        r4.e(r4.f117357b + (r4.r() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        r3.f110091f += r2 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        if (r3.f110097l != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r1 = r3.f110092g + (r2 ? 1 : 0);
        r3.f110092g = r1;
        r4 = r3.f110087b.f116057g;
        r5 = r3.f110093h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        if (r1 != r4[r5]) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012b, code lost:
    
        r3.f110093h = r5 + (r2 ? 1 : 0);
        r3.f110092g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        r29.f110504x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0132, code lost:
    
        r29.f110494n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013e, code lost:
    
        if (r3.f110089d.f108566a.f115312g != r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        r29.f110505y = r4 - 8;
        ((yads.yc0) r1).a(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015a, code lost:
    
        if ("audio/ac4".equals(r3.f110089d.f108566a.f115311f.f118398m) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
    
        r29.f110506z = r3.a(r29.f110505y, 7);
        yads.l0.a(r29.f110505y, r29.f110488h);
        r3.f110086a.a(7, r29.f110488h);
        r29.f110506z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        r29.f110506z = r3.a(r29.f110505y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r29.f110505y += r29.f110506z;
        r29.f110494n = 4;
        r29.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        r4 = r3.f110089d;
        r6 = r4.f108566a;
        r7 = r3.f110086a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        if (r3.f110097l != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        r10 = r4.f108571f[r3.f110091f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019e, code lost:
    
        r10 = r3.f110087b.f116059i[r3.f110091f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a6, code lost:
    
        r4 = r6.f115315j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a8, code lost:
    
        if (r4 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01aa, code lost:
    
        r12 = r29.f110485e.f117356a;
        r12[0] = 0;
        r12[r2 ? 1 : 0] = 0;
        r12[r31] = 0;
        r13 = r4 + 1;
        r4 = 4 - r4;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
    
        if (r29.f110506z >= r29.f110505y) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        r14 = r29.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        if (r14 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c6, code lost:
    
        ((yads.yc0) r1).a(r12, r4, r13, r9);
        r29.f110485e.e(r9);
        r14 = r29.f110485e.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (r14 < r2) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r29.A = r14 - (r2 == true ? 1 : 0);
        r29.f110484d.e(r9);
        r7.a(4, r29.f110484d);
        r7.a(r2 == true ? 1 : 0, r29.f110485e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ef, code lost:
    
        if (r29.E.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f1, code lost:
    
        r14 = r6.f115311f.f118398m;
        r17 = r12[4];
        r9 = yads.pw1.f114801a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ff, code lost:
    
        if ("video/avc".equals(r14) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0203, code lost:
    
        if ((r17 & com.google.common.base.Ascii.US) == r5) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r30, yads.be2 r31) throws yads.ba2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 2002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ew0.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        int size = this.f110483c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((dw0) this.f110483c.valueAt(i10)).b();
        }
        this.f110492l.clear();
        this.f110500t = 0;
        this.f110501u = j11;
        this.f110491k.clear();
        this.f110494n = 0;
        this.f110497q = 0;
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) {
        return ez2.a(yo0Var, true, false);
    }

    public static xo0[] a() {
        return new xo0[]{new ew0(0)};
    }
}
