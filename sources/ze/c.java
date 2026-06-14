package ze;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ze.b;

/* JADX INFO: loaded from: classes3.dex */
abstract class c implements b {
    @Override // ze.b
    public final Object a(a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h().get(key);
    }

    @Override // ze.b
    public Object b(a aVar) {
        return b.a.a(this, aVar);
    }

    @Override // ze.b
    public final List c() {
        return CollectionsKt.toList(h().keySet());
    }

    @Override // ze.b
    public final void e(a key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        h().put(key, value);
    }

    @Override // ze.b
    public final void f(a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        h().remove(key);
    }

    @Override // ze.b
    public final boolean g(a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return h().containsKey(key);
    }

    protected abstract Map h();
}
