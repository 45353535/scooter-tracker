package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class tt3 implements et3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f116384b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nt3 f116385c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f116383a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        nt3 nt3Var = (nt3) this.f116384b.poll();
        this.f116385c = nt3Var;
        if (nt3Var != null) {
            nt3Var.a(this.f116383a);
        }
    }

    public final void a(nt3 nt3Var) {
        nt3Var.f114032a = this;
        this.f116384b.add(nt3Var);
        if (this.f116385c == null) {
            a();
        }
    }
}
