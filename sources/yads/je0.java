package yads;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class je0 extends d53 {
    public static final je0 R = new je0(new ie0());
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final SparseArray P;
    public final SparseBooleanArray Q;

    static {
        new nq() { // from class: yads.na
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return je0.b(bundle);
            }
        };
    }

    public je0(ie0 ie0Var) {
        super(ie0Var);
        this.C = ie0Var.A;
        this.D = ie0Var.B;
        this.E = ie0Var.C;
        this.F = ie0Var.D;
        this.G = ie0Var.E;
        this.H = ie0Var.F;
        this.I = ie0Var.G;
        this.J = ie0Var.H;
        this.K = ie0Var.I;
        this.L = ie0Var.J;
        this.M = ie0Var.K;
        this.N = ie0Var.L;
        this.O = ie0Var.M;
        this.P = ie0Var.N;
        this.Q = ie0Var.O;
    }

    public static je0 a(Context context) {
        return new je0(new ie0(context));
    }

    public static je0 b(Bundle bundle) {
        return new je0(new ie0(bundle));
    }

    @Override // yads.d53
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && je0.class == obj.getClass()) {
            je0 je0Var = (je0) obj;
            if (super.equals(je0Var) && this.C == je0Var.C && this.D == je0Var.D && this.E == je0Var.E && this.F == je0Var.F && this.G == je0Var.G && this.H == je0Var.H && this.I == je0Var.I && this.J == je0Var.J && this.K == je0Var.K && this.L == je0Var.L && this.M == je0Var.M && this.N == je0Var.N && this.O == je0Var.O) {
                SparseBooleanArray sparseBooleanArray = this.Q;
                SparseBooleanArray sparseBooleanArray2 = je0Var.Q;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.P;
                            SparseArray sparseArray2 = je0Var.P;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                v43 v43Var = (v43) entry.getKey();
                                                if (!map2.containsKey(v43Var) || !w83.a(entry.getValue(), map2.get(v43Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // yads.d53
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0);
    }
}
