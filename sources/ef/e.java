package ef;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements CoroutineScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f69109b;

    public e(Object context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f69109b = context;
    }

    public abstract Object a(Object obj, Continuation continuation);

    public final Object b() {
        return this.f69109b;
    }

    public abstract Object c();

    public abstract Object d(Continuation continuation);

    public abstract Object e(Object obj, Continuation continuation);
}
