package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements CoroutineContext.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f93260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext.b f93261c;

    public b(CoroutineContext.b baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f93260b = safeCast;
        this.f93261c = baseKey instanceof b ? ((b) baseKey).f93261c : baseKey;
    }

    public final boolean a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f93261c == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f93260b.invoke(element);
    }
}
