package aa;

import android.util.SparseArray;
import q9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f4164a = new SparseArray();

    public j0 a(int i10) {
        j0 j0Var = (j0) this.f4164a.get(i10);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(9223372036854775806L);
        this.f4164a.put(i10, j0Var2);
        return j0Var2;
    }

    public void b() {
        this.f4164a.clear();
    }
}
