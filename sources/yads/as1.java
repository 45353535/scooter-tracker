package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class as1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f108767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f108768b;

    public /* synthetic */ as1() {
        this(new Executor() { // from class: yads.b3
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                as1.a(runnable);
            }
        }, Executors.newFixedThreadPool(2));
    }

    public static final void a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public as1(Executor executor, Executor executor2) {
        this.f108767a = executor;
        this.f108768b = executor2;
    }
}
