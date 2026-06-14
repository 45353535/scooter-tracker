package yads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu0 f115768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f115769b;

    public se(pu0 pu0Var, SparseArray sparseArray) {
        this.f115768a = pu0Var;
        SparseArray sparseArray2 = new SparseArray(pu0Var.a());
        for (int i10 = 0; i10 < pu0Var.a(); i10++) {
            int iA = pu0Var.a(i10);
            sparseArray2.append(iA, (re) fi.a((re) sparseArray.get(iA)));
        }
        this.f115769b = sparseArray2;
    }

    public final boolean a(int i10) {
        return this.f115768a.f114786a.get(i10);
    }
}
