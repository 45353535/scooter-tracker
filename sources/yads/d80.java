package yads;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bf1 f109830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xk2 f109831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i50 f109832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f109833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w70 f109834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mutex f109835f = ng.f.b(false, 1, null);

    public d80(bf1 bf1Var, xk2 xk2Var, i50 i50Var, CoroutineDispatcher coroutineDispatcher) {
        this.f109830a = bf1Var;
        this.f109831b = xk2Var;
        this.f109832c = i50Var;
        this.f109833d = coroutineDispatcher;
    }
}
