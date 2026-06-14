package yads;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends f43 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fw2 f110119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f110120e = false;

    public e(fw2 fw2Var) {
        this.f110119d = fw2Var;
        this.f110118c = fw2Var.a();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // yads.f43
    public final int a(boolean z10) {
        if (this.f110118c == 0) {
            return -1;
        }
        int iA = 0;
        if (this.f110120e) {
            z10 = false;
        }
        if (z10) {
            int[] iArr = this.f110119d.f110953b;
            iA = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            sd2 sd2Var = (sd2) this;
            if (!sd2Var.f115760j[iA].c()) {
                return sd2Var.f115760j[iA].a(z10) + sd2Var.f115759i[iA];
            }
            iA = a(z10, iA);
        } while (iA != -1);
        return -1;
    }

    @Override // yads.f43
    public final int b(boolean z10) {
        int iB;
        int i10 = this.f110118c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f110120e) {
            z10 = false;
        }
        if (z10) {
            int[] iArr = this.f110119d.f110953b;
            iB = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iB = i10 - 1;
        }
        do {
            sd2 sd2Var = (sd2) this;
            if (!sd2Var.f115760j[iB].c()) {
                return sd2Var.f115760j[iB].b(z10) + sd2Var.f115759i[iB];
            }
            iB = b(z10, iB);
        } while (iB != -1);
        return -1;
    }

    @Override // yads.f43
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        sd2 sd2Var = (sd2) this;
        Integer num = (Integer) sd2Var.f115762l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iA = sd2Var.f115760j[iIntValue].a(obj3)) == -1) {
            return -1;
        }
        return sd2Var.f115758h[iIntValue] + iA;
    }

    public final int b(boolean z10, int i10) {
        if (z10) {
            fw2 fw2Var = this.f110119d;
            int i11 = fw2Var.f110954c[i10] - 1;
            if (i11 >= 0) {
                return fw2Var.f110953b[i11];
            }
        } else if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // yads.f43
    public final int b(int i10, int i11, boolean z10) {
        if (this.f110120e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        sd2 sd2Var = (sd2) this;
        int iA = w83.a(sd2Var.f115759i, i10 + 1, false, false);
        int i12 = sd2Var.f115759i[iA];
        int iB = sd2Var.f115760j[iA].b(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iB != -1) {
            return i12 + iB;
        }
        int iB2 = b(z10, iA);
        while (iB2 != -1 && sd2Var.f115760j[iB2].c()) {
            iB2 = b(z10, iB2);
        }
        if (iB2 != -1) {
            return sd2Var.f115760j[iB2].b(z10) + sd2Var.f115759i[iB2];
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    public final int a(boolean z10, int i10) {
        if (z10) {
            fw2 fw2Var = this.f110119d;
            int i11 = fw2Var.f110954c[i10] + 1;
            int[] iArr = fw2Var.f110953b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }
        if (i10 < this.f110118c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    @Override // yads.f43
    public final int a(int i10, int i11, boolean z10) {
        if (this.f110120e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        sd2 sd2Var = (sd2) this;
        int iA = w83.a(sd2Var.f115759i, i10 + 1, false, false);
        int i12 = sd2Var.f115759i[iA];
        int iA2 = sd2Var.f115760j[iA].a(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iA2 != -1) {
            return i12 + iA2;
        }
        int iA3 = a(z10, iA);
        while (iA3 != -1 && sd2Var.f115760j[iA3].c()) {
            iA3 = a(z10, iA3);
        }
        if (iA3 != -1) {
            return sd2Var.f115760j[iA3].a(z10) + sd2Var.f115759i[iA3];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        sd2 sd2Var = (sd2) this;
        int iA = w83.a(sd2Var.f115758h, i10 + 1, false, false);
        int i11 = sd2Var.f115759i[iA];
        sd2Var.f115760j[iA].a(i10 - sd2Var.f115758h[iA], c43Var, z10);
        c43Var.f109216d += i11;
        if (z10) {
            Object obj = sd2Var.f115761k[iA];
            Object obj2 = c43Var.f109215c;
            obj2.getClass();
            c43Var.f109215c = Pair.create(obj, obj2);
        }
        return c43Var;
    }

    @Override // yads.f43
    public final c43 a(Object obj, c43 c43Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        sd2 sd2Var = (sd2) this;
        Integer num = (Integer) sd2Var.f115762l.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = sd2Var.f115759i[iIntValue];
        sd2Var.f115760j[iIntValue].a(obj3, c43Var);
        c43Var.f109216d += i10;
        c43Var.f109215c = obj;
        return c43Var;
    }

    @Override // yads.f43
    public final Object a(int i10) {
        sd2 sd2Var = (sd2) this;
        int iA = w83.a(sd2Var.f115758h, i10 + 1, false, false);
        return Pair.create(sd2Var.f115761k[iA], sd2Var.f115760j[iA].a(i10 - sd2Var.f115758h[iA]));
    }

    @Override // yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        sd2 sd2Var = (sd2) this;
        int iA = w83.a(sd2Var.f115759i, i10 + 1, false, false);
        int i11 = sd2Var.f115759i[iA];
        int i12 = sd2Var.f115758h[iA];
        sd2Var.f115760j[iA].a(i10 - i11, e43Var, j10);
        Object objCreate = sd2Var.f115761k[iA];
        if (!e43.f110183s.equals(e43Var.f110187b)) {
            objCreate = Pair.create(objCreate, e43Var.f110187b);
        }
        e43Var.f110187b = objCreate;
        e43Var.f110201p += i12;
        e43Var.f110202q += i12;
        return e43Var;
    }
}
