package ze;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f119363a = new HashMap();

    @Override // ze.b
    public Object d(a key, Function0 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = block.invoke();
        Object objPut = h().put(key, objInvoke);
        if (objPut != null) {
            objInvoke = objPut;
        }
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return objInvoke;
    }

    @Override // ze.c
    protected Map h() {
        return this.f119363a;
    }
}
