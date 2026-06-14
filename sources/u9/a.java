package u9;

import android.util.Pair;
import ga.e1;
import n9.e0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends n9.e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f105275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e1 f105276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f105277g;

    public a(boolean z10, e1 e1Var) {
        this.f105277g = z10;
        this.f105276f = e1Var;
        this.f105275e = e1Var.getLength();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f105276f.getNextIndex(i10);
        }
        if (i10 < this.f105275e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f105276f.getPreviousIndex(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i10);

    protected abstract n9.e0 D(int i10);

    @Override // n9.e0
    public int a(boolean z10) {
        if (this.f105275e == 0) {
            return -1;
        }
        if (this.f105277g) {
            z10 = false;
        }
        int firstIndex = z10 ? this.f105276f.getFirstIndex() : 0;
        while (D(firstIndex).q()) {
            firstIndex = B(firstIndex, z10);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return A(firstIndex) + D(firstIndex).a(z10);
    }

    @Override // n9.e0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // n9.e0
    public int c(boolean z10) {
        int i10 = this.f105275e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f105277g) {
            z10 = false;
        }
        int lastIndex = z10 ? this.f105276f.getLastIndex() : i10 - 1;
        while (D(lastIndex).q()) {
            lastIndex = C(lastIndex, z10);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return A(lastIndex) + D(lastIndex).c(z10);
    }

    @Override // n9.e0
    public int e(int i10, int i11, boolean z10) {
        if (this.f105277g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iE = D(iU).e(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z10);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z10);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // n9.e0
    public final e0.b g(int i10, e0.b bVar, boolean z10) {
        int iT = t(i10);
        int iA = A(iT);
        D(iT).g(i10 - z(iT), bVar, z10);
        bVar.f95256c += iA;
        if (z10) {
            bVar.f95255b = y(x(iT), q9.a.e(bVar.f95255b));
        }
        return bVar;
    }

    @Override // n9.e0
    public final e0.b h(Object obj, e0.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f95256c += iA;
        bVar.f95255b = obj;
        return bVar;
    }

    @Override // n9.e0
    public int l(int i10, int i11, boolean z10) {
        if (this.f105277g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int iU = u(i10);
        int iA = A(iU);
        int iL = D(iU).l(i10 - iA, i11 != 2 ? i11 : 0, z10);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z10);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z10);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // n9.e0
    public final Object m(int i10) {
        int iT = t(i10);
        return y(x(iT), D(iT).m(i10 - z(iT)));
    }

    @Override // n9.e0
    public final e0.c o(int i10, e0.c cVar, long j10) {
        int iU = u(i10);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i10 - iA, cVar, j10);
        Object objX = x(iU);
        if (!e0.c.f95261q.equals(cVar.f95271a)) {
            objX = y(objX, cVar.f95271a);
        }
        cVar.f95271a = objX;
        cVar.f95284n += iZ;
        cVar.f95285o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i10);

    protected abstract int u(int i10);

    protected abstract Object x(int i10);

    protected abstract int z(int i10);
}
