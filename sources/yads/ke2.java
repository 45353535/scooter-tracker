package yads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ke2 implements je2, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112696b;

    public ke2(List list) {
        this.f112696b = list;
    }

    @Override // yads.je2
    public final boolean apply(Object obj) {
        for (int i10 = 0; i10 < this.f112696b.size(); i10++) {
            if (!((je2) this.f112696b.get(i10)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ke2) {
            return this.f112696b.equals(((ke2) obj).f112696b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f112696b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f112696b;
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
