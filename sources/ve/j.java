package ve;

import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ve.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f106679c = new j();

    private j() {
    }

    @Override // ze.w
    public List a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // ze.w
    public boolean b() {
        return true;
    }

    @Override // ze.w
    public void c(Function2 function2) {
        g0.b.a(this, function2);
    }

    @Override // ze.w
    public Set entries() {
        return SetsKt.emptySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g0) && ((g0) obj).isEmpty();
    }

    @Override // ze.w
    public boolean isEmpty() {
        return true;
    }

    @Override // ze.w
    public Set names() {
        return SetsKt.emptySet();
    }

    public String toString() {
        return "Parameters " + entries();
    }
}
