package eg;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
final class n0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f69159b;

    public n0(CoroutineDispatcher coroutineDispatcher) {
        this.f69159b = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f69159b;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.f93267b;
        if (jg.j.d(coroutineDispatcher, eVar)) {
            jg.j.c(this.f69159b, eVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f69159b.toString();
    }
}
