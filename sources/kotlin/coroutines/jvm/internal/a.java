package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Continuation, CoroutineStackFrame, Serializable {

    @Nullable
    private final Continuation completion;

    public a(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation create(@NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Nullable
    public final Continuation getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return f.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Object objInvokeSuspend;
        Continuation continuation = this;
        while (true) {
            g.b(continuation);
            a aVar = (a) continuation;
            Continuation continuation2 = aVar.completion;
            Intrinsics.checkNotNull(continuation2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                Result.Companion companion = Result.f93230c;
                obj = Result.b(kotlin.d.a(th2));
            }
            if (objInvokeSuspend == pf.b.g()) {
                return;
            }
            obj = Result.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(continuation2 instanceof a)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Continuation create(@Nullable Object obj, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
