package ze;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f119354a = new ConcurrentHashMap();

    @Override // ze.b
    public Object d(a key, Function0 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        Object obj = h().get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = block.invoke();
        Object objPutIfAbsent = h().putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap h() {
        return this.f119354a;
    }
}
