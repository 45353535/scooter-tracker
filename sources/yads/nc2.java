package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nc2 implements oq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nc2 f113808c = new nc2(new ou0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu0 f113809b;

    static {
        new nq() { // from class: yads.ur
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return nc2.a(bundle);
            }
        };
    }

    public nc2(pu0 pu0Var) {
        this.f113809b = pu0Var;
    }

    public static nc2 a(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
        if (integerArrayList == null) {
            return f113808c;
        }
        ou0 ou0Var = new ou0();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            ou0Var.a(integerArrayList.get(i10).intValue());
        }
        return new nc2(ou0Var.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nc2) {
            return this.f113809b.equals(((nc2) obj).f113809b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f113809b.hashCode();
    }
}
