package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class af1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f108670d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile af1 f108671e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qw1 f108672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f108673b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108674c;

    public af1(qw1 qw1Var) {
        this.f108672a = qw1Var;
    }

    public final Executor a() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f108670d) {
            try {
                if (this.f108673b.size() < 4) {
                    executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f108672a);
                    this.f108673b.add(executorNewSingleThreadExecutor);
                } else {
                    ArrayList arrayList = this.f108673b;
                    int i10 = this.f108674c;
                    this.f108674c = i10 + 1;
                    executorNewSingleThreadExecutor = (Executor) arrayList.get(i10);
                    if (this.f108674c == 4) {
                        this.f108674c = 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
