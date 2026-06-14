package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class u20 implements bl1, dv2, bu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m20 f116442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e63 f116443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nj0 f116444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fe1 f116445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final no f116446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f116447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final se1 f116448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ke f116449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v43 f116450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t20[] f116451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dy f116452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.monetization.ads.exo.source.dash.l f116453n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ol1 f116455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jj0 f116456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wc2 f116457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public al1 f116458s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public cy f116461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p20 f116462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f116463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f116464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f116440z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public cu[] f116459t = a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public vl0[] f116460u = new vl0[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f116454o = new IdentityHashMap();

    public u20(int i10, p20 p20Var, no noVar, int i11, m20 m20Var, e63 e63Var, nj0 nj0Var, jj0 jj0Var, fe1 fe1Var, ol1 ol1Var, long j10, se1 se1Var, ke keVar, dy dyVar, com.monetization.ads.exo.source.dash.j jVar, wc2 wc2Var) {
        this.f116441b = i10;
        this.f116462w = p20Var;
        this.f116446g = noVar;
        this.f116463x = i11;
        this.f116442c = m20Var;
        this.f116443d = e63Var;
        this.f116444e = nj0Var;
        this.f116456q = jj0Var;
        this.f116445f = fe1Var;
        this.f116455p = ol1Var;
        this.f116447h = j10;
        this.f116448i = se1Var;
        this.f116449j = keVar;
        this.f116452m = dyVar;
        this.f116457r = wc2Var;
        this.f116453n = new com.monetization.ads.exo.source.dash.l(p20Var, jVar, keVar);
        this.f116461v = ((ub0) dyVar).a(this.f116459t);
        sa2 sa2VarA = p20Var.a(i11);
        List list = sa2VarA.f115733d;
        this.f116464y = list;
        Pair pairA = a(nj0Var, sa2VarA.f115732c, list);
        this.f116450k = (v43) pairA.first;
        this.f116451l = (t20[]) pairA.second;
    }

    public static Pair a(nj0 nj0Var, List list, List list2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        yv0[] yv0VarArrA;
        int iMin;
        ff0 ff0VarA;
        boolean z11 = true;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((xb) list.get(i14)).f117768a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            xb xbVar = (xb) list.get(i15);
            ff0 ff0VarA2 = a("http://dashif.org/guidelines/trickmode", xbVar.f117772e);
            if (ff0VarA2 == null) {
                ff0VarA2 = a("http://dashif.org/guidelines/trickmode", xbVar.f117773f);
            }
            if (ff0VarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(ff0VarA2.f110701b), -1)) == -1) {
                iMin = i15;
            }
            if (iMin == i15 && (ff0VarA = a("urn:mpeg:dash:adaptation-set-switching:2016", xbVar.f117773f)) != null) {
                String str = ff0VarA.f110701b;
                int i16 = w83.f117341a;
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    int i17 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i17 != -1) {
                        iMin = Math.min(iMin, i17);
                    }
                }
            }
            if (iMin != i15) {
                List list3 = (List) sparseArray.get(i15);
                List list4 = (List) sparseArray.get(iMin);
                list4.addAll(list3);
                sparseArray.put(i15, list4);
                arrayList.remove(list3);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrA = ec1.a((Collection) arrayList.get(i18));
            iArr[i18] = iArrA;
            Arrays.sort(iArrA);
        }
        boolean[] zArr = new boolean[size2];
        yv0[][] yv0VarArr = new yv0[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr2 = iArr[i19];
            int length = iArr2.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length) {
                    break;
                }
                List list5 = ((xb) list.get(iArr2[i21])).f117770c;
                for (int i22 = 0; i22 < list5.size(); i22 += z11 ? 1 : 0) {
                    if (!((gm2) list5.get(i22)).f111280d.isEmpty()) {
                        zArr[i19] = z11;
                        i20 += z11 ? 1 : 0;
                        break;
                    }
                }
                i21 += z11 ? 1 : 0;
            }
            int[] iArr3 = iArr[i19];
            int length2 = iArr3.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    z10 = z11;
                    yv0VarArrA = new yv0[0];
                    break;
                }
                int i24 = iArr3[i23];
                xb xbVar2 = (xb) list.get(i24);
                List list6 = ((xb) list.get(i24)).f117771d;
                z10 = z11;
                for (int i25 = 0; i25 < list6.size(); i25++) {
                    ff0 ff0Var = (ff0) list6.get(i25);
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ff0Var.f110700a)) {
                        xv0 xv0Var = new xv0();
                        xv0Var.f117982k = "application/cea-608";
                        xv0Var.f117972a = xbVar2.f117768a + ":cea608";
                        yv0VarArrA = a(ff0Var, f116440z, new yv0(xv0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(ff0Var.f110700a)) {
                        xv0 xv0Var2 = new xv0();
                        xv0Var2.f117982k = "application/cea-708";
                        xv0Var2.f117972a = xbVar2.f117768a + ":cea708";
                        yv0VarArrA = a(ff0Var, A, new yv0(xv0Var2));
                        break;
                    }
                }
                i23++;
                z11 = z10 ? 1 : 0;
            }
            yv0VarArr[i19] = yv0VarArrA;
            if (yv0VarArrA.length != 0) {
                i20++;
            }
            i19++;
            z11 = z10;
        }
        int i26 = z11 ? 1 : 0;
        int size3 = list2.size() + i20 + size2;
        u43[] u43VarArr = new u43[size3];
        t20[] t20VarArr = new t20[size3];
        int i27 = 0;
        int i28 = 0;
        while (i27 < size2) {
            int[] iArr4 = iArr[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr4) {
                arrayList3.addAll(((xb) list.get(i29)).f117770c);
            }
            int size4 = arrayList3.size();
            yv0[] yv0VarArr2 = new yv0[size4];
            int i30 = 0;
            while (i30 < size4) {
                yv0 yv0Var = ((gm2) arrayList3.get(i30)).f111277a;
                int i31 = size2;
                int iA = nj0Var.a(yv0Var);
                int[][] iArr5 = iArr;
                xv0 xv0Var3 = new xv0(yv0Var);
                xv0Var3.D = iA;
                yv0VarArr2[i30] = new yv0(xv0Var3);
                i30++;
                size4 = size4;
                size2 = i31;
                iArr = iArr5;
            }
            int i32 = size2;
            int[][] iArr6 = iArr;
            xb xbVar3 = (xb) list.get(iArr4[0]);
            int i33 = xbVar3.f117768a;
            String string = i33 != -1 ? Integer.toString(i33) : he2.a("unset:", i27);
            int i34 = i28 + 1;
            if (zArr[i27]) {
                i10 = i28 + 2;
            } else {
                i10 = i34;
                i34 = -1;
            }
            if (yv0VarArr[i27].length != 0) {
                i11 = i10 + 1;
            } else {
                i11 = i10;
                i10 = -1;
            }
            u43VarArr[i28] = new u43(string, yv0VarArr2);
            int i35 = i34;
            t20VarArr[i28] = new t20(xbVar3.f117769b, 0, iArr4, i28, i35, i10, -1);
            if (i35 != -1) {
                String str3 = string + ":emsg";
                xv0 xv0Var4 = new xv0();
                xv0Var4.f117972a = str3;
                xv0Var4.f117982k = "application/x-emsg";
                yv0[] yv0VarArr3 = new yv0[i26];
                yv0VarArr3[0] = new yv0(xv0Var4);
                u43VarArr[i35] = new u43(str3, yv0VarArr3);
                i12 = i10;
                t20VarArr[i35] = new t20(5, 1, iArr4, i28, -1, -1, -1);
                i13 = -1;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (i12 != i13) {
                u43VarArr[i12] = new u43(string + ":cc", yv0VarArr[i27]);
                t20VarArr[i12] = new t20(3, 1, iArr4, i28, -1, -1, -1);
            }
            i27++;
            i28 = i11;
            size2 = i32;
            iArr = iArr6;
            i26 = 1;
        }
        int i36 = 0;
        while (i36 < list2.size()) {
            wl0 wl0Var = (wl0) list2.get(i36);
            xv0 xv0Var5 = new xv0();
            xv0Var5.f117972a = wl0Var.f117509c + "/" + wl0Var.f117510d;
            xv0Var5.f117982k = "application/x-emsg";
            yv0 yv0Var2 = new yv0(xv0Var5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wl0Var.f117509c + "/" + wl0Var.f117510d);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i36);
            u43VarArr[i28] = new u43(sb2.toString(), yv0Var2);
            int i37 = i36;
            t20VarArr[i28] = new t20(5, 2, new int[0], -1, -1, -1, i37);
            i36 = i37 + 1;
            i28++;
        }
        return Pair.create(new v43(u43VarArr), t20VarArr);
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        return this.f116461v.continueLoading(j10);
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) throws Throwable {
        long j11;
        for (cu cuVar : this.f116459t) {
            if (!cuVar.d()) {
                hq2 hq2Var = cuVar.f109584n;
                int i10 = hq2Var.f111696q;
                hq2Var.a(j10, z10, true);
                hq2 hq2Var2 = cuVar.f109584n;
                int i11 = hq2Var2.f111696q;
                if (i11 > i10) {
                    synchronized (hq2Var2) {
                        j11 = hq2Var2.f111695p == 0 ? Long.MIN_VALUE : hq2Var2.f111693n[hq2Var2.f111697r];
                    }
                    int i12 = 0;
                    while (true) {
                        hq2[] hq2VarArr = cuVar.f109585o;
                        if (i12 >= hq2VarArr.length) {
                            break;
                        }
                        hq2VarArr[i12].a(j11, z10, cuVar.f109575e[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(cuVar.a(i11, 0), cuVar.f109592v);
                if (iMin > 0) {
                    ArrayList arrayList = cuVar.f109582l;
                    int i13 = w83.f117341a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    cuVar.f109592v -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        return this.f116461v.getBufferedPositionUs();
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        return this.f116461v.getNextLoadPositionUs();
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        return this.f116450k;
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f116461v.isLoading();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() {
        this.f116448i.a();
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        this.f116461v.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[LOOP:2: B:44:0x008e->B:45:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u20.seekToUs(long):long");
    }

    public static ff0 a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            ff0 ff0Var = (ff0) list.get(i10);
            if (str.equals(ff0Var.f110700a)) {
                return ff0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r19, yads.ou2 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            yads.cu[] r0 = r7.f116459t
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L7b
            r6 = r0[r5]
            int r8 = r6.f109572b
            r9 = 2
            if (r8 != r9) goto L76
            yads.n20 r0 = r6.f109576f
            yads.ac0 r0 = (yads.ac0) r0
            yads.yb0[] r0 = r0.f108631h
            int r3 = r0.length
        L19:
            if (r4 >= r3) goto L7b
            r5 = r0[r4]
            yads.v20 r6 = r5.f118135d
            if (r6 == 0) goto L71
            long r3 = r5.f118136e
            long r3 = r6.a(r1, r3)
            long r8 = r5.f118137f
            long r3 = r3 + r8
            yads.v20 r0 = r5.f118135d
            long r8 = r3 - r8
            long r8 = r0.a(r8)
            yads.v20 r0 = r5.f118135d
            long r10 = r5.f118136e
            long r10 = r0.c(r10)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L69
            r12 = -1
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L57
            yads.v20 r0 = r5.f118135d
            long r14 = r0.b()
            r16 = 1
            long r12 = r5.f118137f
            long r14 = r14 + r12
            long r14 = r14 + r10
            long r14 = r14 - r16
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L69
            goto L59
        L57:
            r16 = 1
        L59:
            long r3 = r3 + r16
            yads.v20 r0 = r5.f118135d
            long r5 = r5.f118137f
            long r3 = r3 - r5
            long r3 = r0.a(r3)
            r5 = r3
            r3 = r8
        L66:
            r0 = r21
            goto L6c
        L69:
            r3 = r8
            r5 = r3
            goto L66
        L6c:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L71:
            int r4 = r4 + 1
            r1 = r19
            goto L19
        L76:
            int r5 = r5 + 1
            r1 = r19
            goto L9
        L7b:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u20.a(long, yads.ou2):long");
    }

    public static cu[] a() {
        return new cu[0];
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        this.f116458s.a((ev2) this);
    }

    public static yv0[] a(ff0 ff0Var, Pattern pattern, yv0 yv0Var) {
        String str = ff0Var.f110701b;
        if (str == null) {
            return new yv0[]{yv0Var};
        }
        int i10 = w83.f117341a;
        String[] strArrSplit = str.split(";", -1);
        yv0[] yv0VarArr = new yv0[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new yv0[]{yv0Var};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            xv0 xv0Var = new xv0(yv0Var);
            xv0Var.f117972a = yv0Var.f118387b + StringUtils.PROCESS_POSTFIX_DELIMITER + i12;
            xv0Var.C = i12;
            xv0Var.f117974c = matcher.group(2);
            yv0VarArr[i11] = new yv0(xv0Var);
        }
        return yv0VarArr;
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f116458s = al1Var;
        al1Var.a((bl1) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.bo0[] r37, boolean[] r38, yads.iq2[] r39, boolean[] r40, long r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u20.a(yads.bo0[], boolean[], yads.iq2[], boolean[], long):long");
    }
}
