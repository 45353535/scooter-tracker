package yads;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b53 implements oq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nq f108910d = new nq() { // from class: yads.e3
        @Override // yads.nq
        public final oq fromBundle(Bundle bundle) {
            return b53.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u43 f108911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y31 f108912c;

    public b53(u43 u43Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= u43Var.f116494b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f108911b = u43Var;
        this.f108912c = y31.a((Collection) list);
    }

    public static b53 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        u43 u43Var = (u43) u43.f116493g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new b53(u43Var, intArray.length == 0 ? Collections.EMPTY_LIST : new dc1(0, intArray.length, intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b53.class == obj.getClass()) {
            b53 b53Var = (b53) obj;
            if (this.f108911b.equals(b53Var.f108911b) && this.f108912c.equals(b53Var.f108912c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f108912c.hashCode() * 31) + this.f108911b.hashCode();
    }
}
