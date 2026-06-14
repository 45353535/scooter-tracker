package ve;

import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ve.o;

/* JADX INFO: loaded from: classes3.dex */
final class i implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f106677c = new i();

    private i() {
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
        o.b.a(this, function2);
    }

    @Override // ze.w
    public Set entries() {
        return SetsKt.emptySet();
    }

    @Override // ze.w
    public String get(String str) {
        return o.b.b(this, str);
    }

    @Override // ze.w
    public Set names() {
        return SetsKt.emptySet();
    }

    public String toString() {
        return "Headers " + entries();
    }
}
