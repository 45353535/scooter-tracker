package yg;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
final class y implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f119100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f119101b;

    public y(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f119100a = compute;
        this.f119101b = new ConcurrentHashMap();
    }

    @Override // yg.u2
    public KSerializer a(KClass key) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f119101b;
        Class clsB = xf.a.b(key);
        Object mVar = concurrentHashMap.get(clsB);
        if (mVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (mVar = new m((KSerializer) this.f119100a.invoke(key))))) != null) {
            mVar = objPutIfAbsent;
        }
        return ((m) mVar).f119028a;
    }
}
