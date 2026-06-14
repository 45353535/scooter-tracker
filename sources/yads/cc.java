package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cc extends lo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final am f109316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f109317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f109318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f109319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f109320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f109321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f109322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f109323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y31 f109324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hv f109325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f109326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f109327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f109328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f109329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public bo f109330u;

    public cc(u43 u43Var, int[] iArr, int i10, am amVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, y31 y31Var, hv hvVar) {
        long j13;
        super(u43Var, iArr);
        if (j12 < j10) {
            uf1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f109316g = amVar;
        this.f109317h = j10 * 1000;
        this.f109318i = j11 * 1000;
        this.f109319j = j13 * 1000;
        this.f109320k = i11;
        this.f109321l = i12;
        this.f109322m = f10;
        this.f109323n = f11;
        this.f109324o = y31.a((Collection) y31Var);
        this.f109325p = hvVar;
        this.f109326q = 1.0f;
        this.f109328s = 0;
        this.f109329t = -9223372036854775807L;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u31 u31Var = (u31) arrayList.get(i10);
            if (u31Var != null) {
                u31Var.a(new ac(j10, jArr[i10]));
            }
        }
    }

    @Override // yads.lo, yads.bo0
    public final void b() {
        this.f109330u = null;
    }

    @Override // yads.bo0
    public final int e() {
        return this.f109328s;
    }

    @Override // yads.bo0
    public final int f() {
        return this.f109327r;
    }

    @Override // yads.bo0
    public final Object h() {
        return null;
    }

    public final int a(long j10) {
        long j11;
        qb0 qb0Var = (qb0) this.f109316g;
        synchronized (qb0Var) {
            j11 = qb0Var.f114927l;
        }
        long j12 = (long) (j11 * this.f109322m);
        this.f109316g.getClass();
        long j13 = (long) (j12 / this.f109326q);
        if (!this.f109324o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f109324o.size() - 1 && ((ac) this.f109324o.get(i10)).f108622a < j13) {
                i10++;
            }
            ac acVar = (ac) this.f109324o.get(i10 - 1);
            ac acVar2 = (ac) this.f109324o.get(i10);
            long j14 = acVar.f108622a;
            long j15 = acVar.f108623b;
            j13 = j15 + ((long) (((j13 - j14) / (acVar2.f108622a - j14)) * (acVar2.f108623b - j15)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f113173b; i12++) {
            if (j10 == Long.MIN_VALUE || !b(i12, j10)) {
                if (a(i12).f118394i <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // yads.lo, yads.bo0
    public final void a() {
        this.f109329t = -9223372036854775807L;
        this.f109330u = null;
    }

    @Override // yads.lo, yads.bo0
    public final int a(long j10, List list) {
        int i10;
        int i11;
        ((r23) this.f109325p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f109329t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((bo) gc1.a(list)).equals(this.f109330u))) {
            return list.size();
        }
        this.f109329t = jElapsedRealtime;
        this.f109330u = list.isEmpty() ? null : (bo) gc1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jRound = ((bo) list.get(size - 1)).f116369g - j10;
        float f10 = this.f109326q;
        int i12 = w83.f117341a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long j12 = this.f109319j;
        if (jRound >= j12) {
            if (!list.isEmpty()) {
                long j13 = ((bo) gc1.a(list)).f116369g;
            }
            yv0 yv0Var = this.f113175d[a(jElapsedRealtime)];
            for (int i13 = 0; i13 < size; i13++) {
                bo boVar = (bo) list.get(i13);
                yv0 yv0Var2 = boVar.f116366d;
                long jRound2 = boVar.f116369g - j10;
                float f11 = this.f109326q;
                if (f11 != 1.0f) {
                    jRound2 = Math.round(jRound2 / ((double) f11));
                }
                if (jRound2 >= j12 && yv0Var2.f118394i < yv0Var.f118394i && (i10 = yv0Var2.f118404s) != -1 && i10 <= this.f109321l && (i11 = yv0Var2.f118403r) != -1 && i11 <= this.f109320k && i10 < yv0Var.f118404s) {
                    return i13;
                }
            }
        }
        return size;
    }

    @Override // yads.lo, yads.bo0
    public final void a(float f10) {
        this.f109326q = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // yads.bo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, long r10, long r12, java.util.List r14, yads.ki1[] r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.cc.a(long, long, long, java.util.List, yads.ki1[]):void");
    }

    public static nk2 a(zn0[] zn0VarArr) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= zn0VarArr.length) {
                break;
            }
            zn0 zn0Var = zn0VarArr[i14];
            if (zn0Var != null && zn0Var.f118743b.length > 1) {
                u31 u31VarF = y31.f();
                u31VarF.a(new ac(0L, 0L));
                arrayList.add(u31VarF);
            } else {
                arrayList.add(null);
            }
            i14++;
        }
        int length = zn0VarArr.length;
        long[][] jArr = new long[length][];
        for (int i15 = 0; i15 < zn0VarArr.length; i15++) {
            zn0 zn0Var2 = zn0VarArr[i15];
            if (zn0Var2 == null) {
                jArr[i15] = new long[0];
            } else {
                jArr[i15] = new long[zn0Var2.f118743b.length];
                int i16 = 0;
                while (true) {
                    if (i16 >= zn0Var2.f118743b.length) {
                        break;
                    }
                    jArr[i15][i16] = zn0Var2.f118742a.f116497e[r11[i16]].f118394i;
                    i16++;
                }
                Arrays.sort(jArr[i15]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            long[] jArr3 = jArr[i17];
            jArr2[i17] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        l62 l62Var = l62.f112983b;
        l62Var.getClass();
        ew1 ew1VarB = new zv1(l62Var).a().b();
        int i18 = 0;
        while (i18 < length) {
            long[] jArr4 = jArr[i18];
            if (jArr4.length <= i10) {
                i11 = i13;
                i12 = length;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i19 = i13;
                while (true) {
                    long[] jArr5 = jArr[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr5.length) {
                        break;
                    }
                    int i20 = i13;
                    int i21 = length;
                    long j10 = jArr5[i19];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i13 = i20;
                    length = i21;
                }
                i11 = i13;
                i12 = length;
                int i22 = length2 - 1;
                double d10 = dArr[i22] - dArr[i11];
                int i23 = i11;
                while (i23 < i22) {
                    double d11 = dArr[i23];
                    i23++;
                    ew1VarB.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i23]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i13 = i11;
            length = i12;
            i10 = i10;
        }
        int i24 = i13;
        d0 d0Var = ew1VarB.f110123d;
        if (d0Var == null) {
            d0Var = new d0(ew1VarB);
            ew1VarB.f110123d = d0Var;
        }
        y31 y31VarA = y31.a((Collection) d0Var);
        for (int i25 = i24; i25 < y31VarA.size(); i25++) {
            int iIntValue = ((Integer) y31VarA.get(i25)).intValue();
            int i26 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i26;
            jArr2[iIntValue] = jArr[iIntValue][i26];
            a(arrayList, jArr2);
        }
        for (int i27 = i24; i27 < zn0VarArr.length; i27++) {
            if (arrayList.get(i27) != null) {
                jArr2[i27] = jArr2[i27] * 2;
            }
        }
        a(arrayList, jArr2);
        u31 u31VarF2 = y31.f();
        for (int i28 = i24; i28 < arrayList.size(); i28++) {
            u31 u31Var = (u31) arrayList.get(i28);
            u31VarF2.a((Object) (u31Var == null ? y31.g() : u31Var.a()));
        }
        return u31VarF2.a();
    }
}
