package z;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f119127b;

    public f(i iVar) {
        this.f119127b = iVar;
    }

    @Override // z.j
    public Object b(Continuation continuation) {
        return this.f119127b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f119127b, ((f) obj).f119127b);
    }

    public int hashCode() {
        return this.f119127b.hashCode();
    }
}
