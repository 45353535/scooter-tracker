package yads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class nx extends f92 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f114066b;

    public nx(Comparator comparator) {
        this.f114066b = (Comparator) ie2.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f114066b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx) {
            return this.f114066b.equals(((nx) obj).f114066b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f114066b.hashCode();
    }

    public final String toString() {
        return this.f114066b.toString();
    }
}
