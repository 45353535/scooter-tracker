package qa;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f98947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98948b;

    private f(int i10, ImmutableList immutableList) {
        this.f98948b = i10;
        this.f98947a = immutableList;
    }

    private static a a(int i10, int i11, d0 d0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, d0Var);
            case 1751742049:
                return c.b(d0Var);
            case 1752331379:
                return d.c(d0Var);
            case 1852994675:
                return h.a(d0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, d0 d0Var) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int iG = d0Var.g();
        int iB = -2;
        while (d0Var.a() > 8) {
            int iU = d0Var.u();
            int iF = d0Var.f() + d0Var.u();
            d0Var.V(iF);
            a aVarC = iU == 1414744396 ? c(d0Var.u(), d0Var) : a(iU, iB, d0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                builder.add(aVarC);
            }
            d0Var.W(iF);
            d0Var.V(iG);
        }
        return new f(i10, builder.build());
    }

    public a b(Class cls) {
        UnmodifiableIterator it = this.f98947a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // qa.a
    public int getType() {
        return this.f98948b;
    }
}
