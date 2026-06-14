package wd;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Runnable, pd.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f107909b = new AtomicBoolean(false);

    @Override // pd.b
    public void a(boolean z10) {
        this.f107909b.set(z10);
    }

    public boolean b() {
        return this.f107909b.get();
    }

    public final Object d(CoroutineContext coroutineContext, Continuation continuation) {
        if (b()) {
            return Unit.f93236a;
        }
        Object objE = e(coroutineContext, continuation);
        return objE == pf.b.g() ? objE : Unit.f93236a;
    }

    public abstract Object e(CoroutineContext coroutineContext, Continuation continuation);

    @Override // java.lang.Runnable
    public final void run() {
    }
}
