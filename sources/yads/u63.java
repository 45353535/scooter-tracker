package yads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class u63 implements xo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f116539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w92 f116540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f116541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x63 f116542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f116543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f116544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f116545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r63 f116546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q63 f116547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ap0 f116548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f116549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f116550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f116551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f116552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z63 f116553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f116554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f116555s;

    static {
        new cp0() { // from class: yads.yq0
            @Override // yads.cp0
            public final xo0[] a() {
                return u63.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    public u63(int i10) {
        this(new l43(0L), new se0());
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f116548l = ap0Var;
    }

    public final void b() {
        this.f116544h.clear();
        this.f116543g.clear();
        ((se0) this.f116542f).getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f116543g.put(sparseArray.keyAt(i10), (z63) sparseArray.valueAt(i10));
        }
        this.f116543g.put(0, new ku2(new s63(this)));
        this.f116553q = null;
    }

    @Override // yads.xo0
    public final void release() {
    }

    public u63(l43 l43Var, se0 se0Var) {
        this.f116542f = (x63) fi.a(se0Var);
        this.f116538b = 112800;
        this.f116537a = 1;
        this.f116539c = Collections.singletonList(l43Var);
        this.f116540d = new w92(0, new byte[9400]);
        this.f116544h = new SparseBooleanArray();
        this.f116545i = new SparseBooleanArray();
        this.f116543g = new SparseArray();
        this.f116541e = new SparseIntArray();
        this.f116546j = new r63();
        this.f116548l = ap0.f108745a;
        this.f116555s = -1;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [yads.z63] */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // yads.xo0
    public final int a(yo0 yo0Var, be2 be2Var) throws ba2, EOFException, InterruptedIOException {
        long j10;
        int i10;
        ?? r11;
        long j11;
        long j12;
        boolean z10;
        yc0 yc0Var = (yc0) yo0Var;
        long j13 = yc0Var.f118151c;
        if (this.f116550n) {
            long j14 = -9223372036854775807L;
            if (j13 == -1 || this.f116537a == 2) {
                j11 = 0;
            } else {
                r63 r63Var = this.f116546j;
                j11 = 0;
                if (!r63Var.f115348d) {
                    int i11 = this.f116555s;
                    if (i11 <= 0) {
                        r63Var.f115347c.a(w83.f117346f);
                        r63Var.f115348d = true;
                        yc0Var.f118154f = 0;
                    } else {
                        if (!r63Var.f115350f) {
                            int iMin = (int) Math.min(r63Var.f115345a, j13);
                            long j15 = j13 - ((long) iMin);
                            if (yc0Var.f118152d != j15) {
                                be2Var.f108980a = j15;
                                return 1;
                            }
                            r63Var.f115347c.c(iMin);
                            yc0Var.f118154f = 0;
                            yc0Var.b(r63Var.f115347c.f117356a, 0, iMin, false);
                            w92 w92Var = r63Var.f115347c;
                            int i12 = w92Var.f117357b;
                            int i13 = w92Var.f117358c;
                            int i14 = i13 - 188;
                            while (true) {
                                if (i14 < i12) {
                                    break;
                                }
                                byte[] bArr = w92Var.f117356a;
                                int i15 = -4;
                                int i16 = 0;
                                while (true) {
                                    if (i15 > 4) {
                                        break;
                                    }
                                    int i17 = (i15 * 188) + i14;
                                    if (i17 < i12 || i17 >= i13 || bArr[i17] != 71) {
                                        i16 = 0;
                                    } else {
                                        i16++;
                                        if (i16 == 5) {
                                            long jA = a73.a(i14, i11, w92Var);
                                            if (jA != -9223372036854775807L) {
                                                j14 = jA;
                                                break;
                                            }
                                        }
                                    }
                                    i15++;
                                }
                                i14--;
                            }
                            r63Var.f115352h = j14;
                            r63Var.f115350f = true;
                            return 0;
                        }
                        if (r63Var.f115352h == -9223372036854775807L) {
                            r63Var.f115347c.a(w83.f117346f);
                            r63Var.f115348d = true;
                            yc0Var.f118154f = 0;
                        } else {
                            if (!r63Var.f115349e) {
                                int iMin2 = (int) Math.min(r63Var.f115345a, j13);
                                long j16 = 0;
                                if (yc0Var.f118152d != j16) {
                                    be2Var.f108980a = j16;
                                    return 1;
                                }
                                r63Var.f115347c.c(iMin2);
                                yc0Var.f118154f = 0;
                                yc0Var.b(r63Var.f115347c.f117356a, 0, iMin2, false);
                                w92 w92Var2 = r63Var.f115347c;
                                int i18 = w92Var2.f117357b;
                                int i19 = w92Var2.f117358c;
                                while (true) {
                                    if (i18 >= i19) {
                                        break;
                                    }
                                    if (w92Var2.f117356a[i18] == 71) {
                                        long jA2 = a73.a(i18, i11, w92Var2);
                                        if (jA2 != -9223372036854775807L) {
                                            j14 = jA2;
                                            break;
                                        }
                                    }
                                    i18++;
                                }
                                r63Var.f115351g = j14;
                                r63Var.f115349e = true;
                                return 0;
                            }
                            long j17 = r63Var.f115351g;
                            if (j17 == -9223372036854775807L) {
                                r63Var.f115347c.a(w83.f117346f);
                                r63Var.f115348d = true;
                                yc0Var.f118154f = 0;
                            } else {
                                long jB = r63Var.f115346b.b(r63Var.f115352h) - r63Var.f115346b.b(j17);
                                r63Var.f115353i = jB;
                                if (jB < 0) {
                                    uf1.d("TsDurationReader", "Invalid duration: " + r63Var.f115353i + ". Using TIME_UNSET instead.");
                                    r63Var.f115353i = -9223372036854775807L;
                                }
                                r63Var.f115347c.a(w83.f117346f);
                                r63Var.f115348d = true;
                                yc0Var.f118154f = 0;
                            }
                        }
                    }
                    return 0;
                }
            }
            if (this.f116551o) {
                j10 = -1;
                i10 = 1;
                j12 = j11;
                z10 = false;
            } else {
                this.f116551o = true;
                r63 r63Var2 = this.f116546j;
                long j18 = r63Var2.f115353i;
                if (j18 != -9223372036854775807L) {
                    j10 = -1;
                    i10 = 1;
                    j12 = j11;
                    z10 = false;
                    q63 q63Var = new q63(r63Var2.f115346b, j18, j13, this.f116555s, this.f116538b);
                    this.f116547k = q63Var;
                    this.f116548l.a(q63Var.f113182a);
                } else {
                    j10 = -1;
                    i10 = 1;
                    j12 = j11;
                    z10 = false;
                    this.f116548l.a(new mu2(j18, j12));
                }
            }
            if (this.f116552p) {
                this.f116552p = z10;
                a(j12, j12);
                if (yc0Var.f118152d != j12) {
                    be2Var.f108980a = j12;
                    return i10;
                }
            }
            q63 q63Var2 = this.f116547k;
            r11 = z10;
            if (q63Var2 != null) {
                r11 = z10;
                if (q63Var2.f113184c != null) {
                    return q63Var2.a(yc0Var, be2Var);
                }
            }
        } else {
            j10 = -1;
            i10 = 1;
            r11 = 0;
        }
        w92 w92Var3 = this.f116540d;
        byte[] bArr2 = w92Var3.f117356a;
        int i20 = w92Var3.f117357b;
        if (9400 - i20 < 188) {
            int i21 = w92Var3.f117358c - i20;
            if (i21 > 0) {
                System.arraycopy(bArr2, i20, bArr2, r11, i21);
            }
            w92 w92Var4 = this.f116540d;
            w92Var4.f117356a = bArr2;
            w92Var4.f117358c = i21;
            w92Var4.f117357b = r11;
        }
        while (true) {
            w92 w92Var5 = this.f116540d;
            int i22 = w92Var5.f117358c;
            int i23 = w92Var5.f117357b;
            if (i22 - i23 >= 188) {
                byte[] bArr3 = w92Var5.f117356a;
                int i24 = i23;
                while (i24 < i22 && bArr3[i24] != 71) {
                    i24++;
                }
                this.f116540d.e(i24);
                int i25 = i24 + 188;
                if (i25 > i22) {
                    int i26 = (i24 - i23) + this.f116554r;
                    this.f116554r = i26;
                    if (this.f116537a == 2 && i26 > 376) {
                        ?? r42 = i10;
                        throw new ba2("Cannot find sync byte. Most likely not a Transport Stream.", null, r42, r42 == true ? 1 : 0);
                    }
                } else {
                    this.f116554r = r11;
                }
                w92 w92Var6 = this.f116540d;
                int i27 = w92Var6.f117358c;
                if (i25 > i27) {
                    return r11;
                }
                int iB = w92Var6.b();
                if ((8388608 & iB) != 0) {
                    this.f116540d.e(i25);
                    return r11;
                }
                ?? r52 = (4194304 & iB) != 0 ? 1 : r11;
                int i28 = (2096896 & iB) >> 8;
                ?? r92 = (iB & 32) != 0 ? 1 : r11;
                ?? r32 = (iB & 16) != 0 ? (z63) this.f116543g.get(i28) : 0;
                if (r32 == 0) {
                    this.f116540d.e(i25);
                    return r11;
                }
                if (this.f116537a != 2) {
                    int i29 = iB & 15;
                    int i30 = this.f116541e.get(i28, i29 - 1);
                    this.f116541e.put(i28, i29);
                    if (i30 == i29) {
                        this.f116540d.e(i25);
                        return r11;
                    }
                    if (i29 != ((i30 + 1) & 15)) {
                        r32.a();
                    }
                }
                if (r92 != 0) {
                    int iM = this.f116540d.m();
                    r52 = (r52 == true ? 1 : 0) | ((this.f116540d.m() & 64) != 0 ? 2 : r11);
                    w92 w92Var7 = this.f116540d;
                    w92Var7.e(w92Var7.f117357b + (iM - 1));
                }
                boolean z11 = this.f116550n;
                if (this.f116537a == 2 || z11 || !this.f116545i.get(i28, r11)) {
                    this.f116540d.d(i25);
                    r32.a(r52, this.f116540d);
                    this.f116540d.d(i27);
                }
                if (this.f116537a != 2 && !z11 && this.f116550n && j13 != j10) {
                    this.f116552p = true;
                }
                this.f116540d.e(i25);
                return r11;
            }
            int iC = yc0Var.c(bArr2, i22, 9400 - i22);
            if (iC == -1) {
                return -1;
            }
            this.f116540d.d(i22 + iC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r9, long r11) {
        /*
            r8 = this;
            int r9 = r8.f116537a
            r10 = 2
            if (r9 == r10) goto L76
            java.util.List r9 = r8.f116539c
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        Ld:
            r1 = 0
            if (r0 >= r9) goto L47
            java.util.List r3 = r8.f116539c
            java.lang.Object r3 = r3.get(r0)
            yads.l43 r3 = (yads.l43) r3
            monitor-enter(r3)
            long r4 = r3.f112968b     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r10
        L29:
            if (r4 != 0) goto L3c
            long r4 = r3.a()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L41
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L41
            goto L3e
        L3c:
            if (r4 == 0) goto L41
        L3e:
            r3.c(r11)
        L41:
            int r0 = r0 + 1
            goto Ld
        L44:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L47:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L52
            yads.q63 r9 = r8.f116547k
            if (r9 == 0) goto L52
            r9.a(r11)
        L52:
            yads.w92 r9 = r8.f116540d
            r9.c(r10)
            android.util.SparseIntArray r9 = r8.f116541e
            r9.clear()
            r9 = r10
        L5d:
            android.util.SparseArray r11 = r8.f116543g
            int r11 = r11.size()
            if (r9 >= r11) goto L73
            android.util.SparseArray r11 = r8.f116543g
            java.lang.Object r11 = r11.valueAt(r9)
            yads.z63 r11 = (yads.z63) r11
            r11.a()
            int r9 = r9 + 1
            goto L5d
        L73:
            r8.f116554r = r10
            return
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u63.a(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.yo0 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            yads.w92 r0 = r6.f116540d
            byte[] r0 = r0.f117356a
            yads.yc0 r7 = (yads.yc0) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u63.a(yads.yo0):boolean");
    }

    public static xo0[] a() {
        return new xo0[]{new u63(0)};
    }
}
