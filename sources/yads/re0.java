package yads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class re0 extends ah1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f92 f115420i = new nx(new Comparator() { // from class: yads.il0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return re0.a((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f92 f115421j = new nx(new Comparator() { // from class: yads.dm0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return re0.b((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f115422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ao0 f115423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final je0 f115425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final me0 f115426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hk f115427h;

    public re0(Context context, je0 je0Var, bc bcVar) {
        this(je0Var, bcVar, context);
    }

    public static boolean a(boolean z10, int i10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public static /* synthetic */ int b(Integer num, Integer num2) {
        return 0;
    }

    public re0(je0 je0Var, bc bcVar, Context context) {
        this.f115422c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f115423d = bcVar;
        this.f115425f = je0Var;
        this.f115427h = hk.f111607h;
        boolean z10 = context != null && w83.d(context);
        this.f115424e = z10;
        if (!z10 && context != null && w83.f117341a >= 32) {
            this.f115426g = me0.a(context);
        }
        if (je0Var.L && context == null) {
            uf1.d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(v43 v43Var, je0 je0Var, HashMap map) {
        b53 b53Var;
        for (int i10 = 0; i10 < v43Var.f116873b; i10++) {
            b53 b53Var2 = (b53) je0Var.f109795z.get(v43Var.a(i10));
            if (b53Var2 != null && ((b53Var = (b53) map.get(Integer.valueOf(b53Var2.f108911b.f116496d))) == null || (b53Var.f108912c.isEmpty() && !b53Var2.f108912c.isEmpty()))) {
                map.put(Integer.valueOf(b53Var2.f108911b.f116496d), b53Var2);
            }
        }
    }

    public final void b() {
        boolean z10;
        e53 e53Var;
        me0 me0Var;
        synchronized (this.f115422c) {
            try {
                z10 = this.f115425f.L && !this.f115424e && w83.f117341a >= 32 && (me0Var = this.f115426g) != null && me0Var.f113447b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (e53Var = this.f110614a) == null) {
            return;
        }
        ((cn0) e53Var).f109471i.f116471a.sendEmptyMessage(10);
    }

    public static int a(yv0 yv0Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(yv0Var.f118389d)) {
            return 4;
        }
        String strB = b(str);
        String strB2 = b(yv0Var.f118389d);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        int i10 = w83.f117341a;
        return strB2.split(TokenBuilder.TOKEN_DELIMITER, 2)[0].equals(strB.split(TokenBuilder.TOKEN_DELIMITER, 2)[0]) ? 2 : 0;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int a(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005e A[Catch: all -> 0x0083, FALL_THROUGH, TryCatch #0 {all -> 0x0083, blocks: (B:4:0x0006, B:6:0x000c, B:8:0x0010, B:10:0x0014, B:34:0x0052, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0066, B:46:0x006a, B:48:0x0070, B:50:0x0078, B:56:0x0086), top: B:60:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.yv0 r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.Object r3 = r8.f115422c
            monitor-enter(r3)
            yads.je0 r4 = r8.f115425f     // Catch: java.lang.Throwable -> L83
            boolean r4 = r4.L     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L86
            boolean r4 = r8.f115424e     // Catch: java.lang.Throwable -> L83
            if (r4 != 0) goto L86
            int r4 = r9.f118411z     // Catch: java.lang.Throwable -> L83
            if (r4 <= r2) goto L86
            java.lang.String r4 = r9.f118398m     // Catch: java.lang.Throwable -> L83
            r5 = 32
            if (r4 != 0) goto L1b
            goto L5e
        L1b:
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -2123537834: goto L44;
                case 187078296: goto L39;
                case 187078297: goto L30;
                case 1504578661: goto L25;
                default: goto L23;
            }
        L23:
            r2 = r6
            goto L4e
        L25:
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L2e
            goto L23
        L2e:
            r2 = 3
            goto L4e
        L30:
            java.lang.String r7 = "audio/ac4"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L4e
            goto L23
        L39:
            java.lang.String r2 = "audio/ac3"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L42
            goto L23
        L42:
            r2 = r0
            goto L4e
        L44:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L4d
            goto L23
        L4d:
            r2 = r1
        L4e:
            switch(r2) {
                case 0: goto L52;
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L5e
        L52:
            int r2 = yads.w83.f117341a     // Catch: java.lang.Throwable -> L83
            if (r2 < r5) goto L86
            yads.me0 r2 = r8.f115426g     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L86
            boolean r2 = r2.f113447b     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L86
        L5e:
            int r2 = yads.w83.f117341a     // Catch: java.lang.Throwable -> L83
            if (r2 < r5) goto L85
            yads.me0 r2 = r8.f115426g     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L85
            boolean r4 = r2.f113447b     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L85
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L85
            yads.me0 r2 = r8.f115426g     // Catch: java.lang.Throwable -> L83
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L85
            yads.me0 r2 = r8.f115426g     // Catch: java.lang.Throwable -> L83
            yads.hk r4 = r8.f115427h     // Catch: java.lang.Throwable -> L83
            boolean r9 = r2.a(r9, r4)     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto L85
            goto L86
        L83:
            r9 = move-exception
            goto L88
        L85:
            r0 = r1
        L86:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            return r0
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.re0.a(yads.yv0):boolean");
    }

    public final List a(je0 je0Var, boolean z10, int i10, u43 u43Var, int[] iArr) {
        je2 je2Var = new je2() { // from class: yads.hn0
            @Override // yads.je2
            public final boolean apply(Object obj) {
                return this.f111638b.a((yv0) obj);
            }
        };
        v31 v31Var = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < u43Var.f116494b) {
            je0 je0Var2 = je0Var;
            boolean z11 = z10;
            int i13 = i10;
            u43 u43Var2 = u43Var;
            ge0 ge0Var = new ge0(i13, u43Var2, i11, je0Var2, iArr[i11], z11, je2Var);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = ge0Var;
            i11++;
            i12 = i14;
            i10 = i13;
            u43Var = u43Var2;
            je0Var = je0Var2;
            z10 = z11;
        }
        return y31.b(i12, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(yads.je0 r17, int[] r18, int r19, yads.u43 r20, int[] r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.re0.a(yads.je0, int[], int, yads.u43, int[]):java.util.List");
    }

    public static /* synthetic */ int a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @Override // yads.f53
    public final void a() {
        me0 me0Var;
        synchronized (this.f115422c) {
            try {
                if (w83.f117341a >= 32 && (me0Var = this.f115426g) != null) {
                    me0Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f110614a = null;
        this.f110615b = null;
    }

    public final Pair a(zg1 zg1Var, int[][][] iArr, final je0 je0Var) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < zg1Var.f118660a) {
                if (2 == zg1Var.f118661b[i10] && zg1Var.f118662c[i10].f116873b > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return a(1, zg1Var, iArr, new oe0() { // from class: yads.fn0
            @Override // yads.oe0
            public final List a(int i11, u43 u43Var, int[] iArr2) {
                return this.f110802a.a(je0Var, z10, i11, u43Var, iArr2);
            }
        }, new Comparator() { // from class: yads.gn0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ge0.a((List) obj, (List) obj2);
            }
        });
    }

    public static Pair a(zg1 zg1Var, int[][][] iArr, final je0 je0Var, final String str) {
        return a(3, zg1Var, iArr, new oe0() { // from class: yads.em0
            @Override // yads.oe0
            public final List a(int i10, u43 u43Var, int[] iArr2) {
                return re0.a(je0Var, str, i10, u43Var, iArr2);
            }
        }, new Comparator() { // from class: yads.pm0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ne0.a((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static Pair a(int i10, zg1 zg1Var, int[][][] iArr, oe0 oe0Var, Comparator comparator) {
        ?? r17;
        Object objA;
        zg1 zg1Var2 = zg1Var;
        ?? r12 = 1;
        ArrayList arrayList = new ArrayList();
        int i11 = zg1Var2.f118660a;
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            if (i10 == zg1Var2.f118661b[i13]) {
                v43 v43Var = zg1Var2.f118662c[i13];
                int i14 = i12;
                r12 = r12;
                while (i14 < v43Var.f116873b) {
                    u43 u43VarA = v43Var.a(i14);
                    List listA = oe0Var.a(i13, u43VarA, iArr[i13][i14]);
                    boolean[] zArr = new boolean[u43VarA.f116494b];
                    int i15 = i12;
                    int i16 = r12;
                    while (i15 < u43VarA.f116494b) {
                        pe0 pe0Var = (pe0) listA.get(i15);
                        int iA = pe0Var.a();
                        if (zArr[i15] || iA == 0) {
                            r17 = i16;
                        } else {
                            if (iA == i16) {
                                Object[] objArr = new Object[i16];
                                objArr[i12] = pe0Var;
                                r17 = i16;
                                objA = y31.a(objArr);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pe0Var);
                                boolean z10 = i16;
                                int i17 = i15 + 1;
                                while (i17 < u43VarA.f116494b) {
                                    pe0 pe0Var2 = (pe0) listA.get(i17);
                                    int i18 = i17;
                                    if (pe0Var2.a() == 2 && pe0Var.a(pe0Var2)) {
                                        arrayList2.add(pe0Var2);
                                        zArr[i18] = z10;
                                    }
                                    i17 = i18 + 1;
                                }
                                objA = arrayList2;
                                r17 = z10;
                            }
                            arrayList.add(objA);
                        }
                        i15++;
                        i16 = r17;
                        i12 = 0;
                    }
                    i14++;
                    i12 = 0;
                    r12 = i16;
                }
            }
            i13++;
            zg1Var2 = zg1Var;
            r12 = r12 == true ? 1 : 0;
            i12 = 0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((pe0) list.get(i19)).f114644d;
        }
        pe0 pe0Var3 = (pe0) list.get(0);
        return Pair.create(new zn0(0, pe0Var3.f114643c, iArr2), Integer.valueOf(pe0Var3.f114642b));
    }

    public static Pair a(zg1 zg1Var, int[][][] iArr, final int[] iArr2, final je0 je0Var) {
        return a(2, zg1Var, iArr, new oe0() { // from class: yads.qm0
            @Override // yads.oe0
            public final List a(int i10, u43 u43Var, int[] iArr3) {
                return re0.a(je0Var, iArr2, i10, u43Var, iArr3);
            }
        }, new Comparator() { // from class: yads.en0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qe0.a((List) obj, (List) obj2);
            }
        });
    }

    @Override // yads.f53
    public final void a(hk hkVar) {
        boolean zEquals;
        synchronized (this.f115422c) {
            zEquals = this.f115427h.equals(hkVar);
            this.f115427h = hkVar;
        }
        if (zEquals) {
            return;
        }
        b();
    }

    public static List a(je0 je0Var, String str, int i10, u43 u43Var, int[] iArr) {
        v31 v31Var = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < u43Var.f116494b) {
            je0 je0Var2 = je0Var;
            String str2 = str;
            int i13 = i10;
            u43 u43Var2 = u43Var;
            ne0 ne0Var = new ne0(i13, u43Var2, i11, je0Var2, iArr[i11], str2);
            int i14 = i12 + 1;
            if (objArrCopyOf.length < i14) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i14));
            }
            objArrCopyOf[i12] = ne0Var;
            i11++;
            i12 = i14;
            i10 = i13;
            u43Var = u43Var2;
            je0Var = je0Var2;
            str = str2;
        }
        return y31.b(i12, objArrCopyOf);
    }
}
