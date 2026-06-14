package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f118330c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f118331d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wb0 f118332e;

    public yr(int i10, String str, wb0 wb0Var) {
        this.f118328a = i10;
        this.f118329b = str;
        this.f118332e = wb0Var;
    }

    public final long a(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        kw2 kw2VarB = b(j10, j11);
        if (!kw2VarB.f115134e) {
            long j12 = kw2VarB.f115133d;
            return -Math.min(j12 != -1 ? j12 : Long.MAX_VALUE, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = kw2VarB.f115132c + kw2VarB.f115133d;
        if (jMax < j14) {
            for (kw2 kw2Var : this.f118330c.tailSet(kw2VarB, false)) {
                long j15 = kw2Var.f115132c;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + kw2Var.f115133d);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final kw2 b(long j10, long j11) {
        long j12;
        long jMin = j11;
        kw2 kw2Var = new kw2(this.f118329b, j10, -1L, -9223372036854775807L, null);
        kw2 kw2Var2 = (kw2) this.f118330c.floor(kw2Var);
        if (kw2Var2 != null && kw2Var2.f115132c + kw2Var2.f115133d > j10) {
            return kw2Var2;
        }
        kw2 kw2Var3 = (kw2) this.f118330c.ceiling(kw2Var);
        if (kw2Var3 != null) {
            long j13 = kw2Var3.f115132c - j10;
            if (jMin == -1) {
                j12 = j13;
            } else {
                jMin = Math.min(j13, jMin);
                j12 = jMin;
            }
        } else {
            j12 = jMin;
        }
        return new kw2(this.f118329b, j10, j12, -9223372036854775807L, null);
    }

    public final boolean c(long j10, long j11) {
        for (int i10 = 0; i10 < this.f118331d.size(); i10++) {
            xr xrVar = (xr) this.f118331d.get(i10);
            long j12 = xrVar.f117933b;
            if (j12 == -1) {
                if (j10 >= xrVar.f117932a) {
                    return true;
                }
            } else if (j11 == -1) {
                continue;
            } else {
                long j13 = xrVar.f117932a;
                if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yr.class == obj.getClass()) {
            yr yrVar = (yr) obj;
            if (this.f118328a == yrVar.f118328a && this.f118329b.equals(yrVar.f118329b) && this.f118330c.equals(yrVar.f118330c) && this.f118332e.equals(yrVar.f118332e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f118332e.hashCode() + j4.a(this.f118329b, this.f118328a * 31, 31);
    }
}
