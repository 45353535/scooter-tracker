package eg;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {
    public static final Executor a(CoroutineDispatcher coroutineDispatcher) {
        Executor executorM;
        kotlinx.coroutines.s sVar = coroutineDispatcher instanceof kotlinx.coroutines.s ? (kotlinx.coroutines.s) coroutineDispatcher : null;
        return (sVar == null || (executorM = sVar.m()) == null) ? new n0(coroutineDispatcher) : executorM;
    }

    public static final CoroutineDispatcher b(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        n0 n0Var = executor instanceof n0 ? (n0) executor : null;
        return (n0Var == null || (coroutineDispatcher = n0Var.f69159b) == null) ? new kotlinx.coroutines.t(executor) : coroutineDispatcher;
    }

    public static final kotlinx.coroutines.s c(ExecutorService executorService) {
        return new kotlinx.coroutines.t(executorService);
    }
}
