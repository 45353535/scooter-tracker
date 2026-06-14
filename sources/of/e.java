package of;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f96969c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f96970d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Continuation f96971b;

    @Nullable
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(Continuation delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f96971b = delegate;
        this.result = obj;
    }

    public final Object b() throws Throwable {
        Object obj = this.result;
        pf.a aVar = pf.a.f98305c;
        if (obj == aVar) {
            if (androidx.concurrent.futures.a.a(f96970d, this, aVar, pf.b.g())) {
                return pf.b.g();
            }
            obj = this.result;
        }
        if (obj == pf.a.f98306d) {
            return pf.b.g();
        }
        if (obj instanceof Result.a) {
            throw ((Result.a) obj).f93232b;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f96971b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f96971b.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            pf.a aVar = pf.a.f98305c;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.a.a(f96970d, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != pf.b.g()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f96970d, this, pf.b.g(), pf.a.f98306d)) {
                    this.f96971b.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f96971b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Continuation delegate) {
        this(delegate, pf.a.f98305c);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
