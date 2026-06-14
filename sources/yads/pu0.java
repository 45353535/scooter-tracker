package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f114786a;

    public pu0(SparseBooleanArray sparseBooleanArray) {
        this.f114786a = sparseBooleanArray;
    }

    public final int a(int i10) {
        fi.a(i10, this.f114786a.size());
        return this.f114786a.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu0)) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        if (w83.f117341a >= 24) {
            return this.f114786a.equals(pu0Var.f114786a);
        }
        if (this.f114786a.size() != pu0Var.f114786a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f114786a.size(); i10++) {
            if (a(i10) != pu0Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (w83.f117341a >= 24) {
            return this.f114786a.hashCode();
        }
        int size = this.f114786a.size();
        for (int i10 = 0; i10 < this.f114786a.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }

    public final int a() {
        return this.f114786a.size();
    }
}
