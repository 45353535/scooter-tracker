package f1;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l6 implements c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f70335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f70336b;

    public l6(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f70335a = scope;
        this.f70336b = new ConcurrentHashMap();
    }
}
