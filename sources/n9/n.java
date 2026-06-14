package n9;

import android.util.SparseBooleanArray;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f95429a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f95430a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f95431b;

        public b a(int i10) {
            q9.a.g(!this.f95431b);
            this.f95430a.append(i10, true);
            return this;
        }

        public b b(n nVar) {
            for (int i10 = 0; i10 < nVar.d(); i10++) {
                a(nVar.c(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public n e() {
            q9.a.g(!this.f95431b);
            this.f95431b = true;
            return new n(this.f95430a);
        }
    }

    public boolean a(int i10) {
        return this.f95429a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        q9.a.c(i10, 0, d());
        return this.f95429a.keyAt(i10);
    }

    public int d() {
        return this.f95429a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (o0.f98837a >= 24) {
            return this.f95429a.equals(nVar.f95429a);
        }
        if (d() != nVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != nVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (o0.f98837a >= 24) {
            return this.f95429a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    private n(SparseBooleanArray sparseBooleanArray) {
        this.f95429a = sparseBooleanArray;
    }
}
