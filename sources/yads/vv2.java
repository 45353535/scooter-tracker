package yads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class vv2 extends vw implements Set {
    public vv2(Set set, je2 je2Var) {
        super(set, je2Var);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return yv2.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return yv2.a(this);
    }
}
