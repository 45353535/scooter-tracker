package yd;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class b extends wd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f118924a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Looper looper) {
        this(new Handler(looper));
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    private final boolean g() {
        return Intrinsics.areEqual(Looper.myLooper(), this.f118924a.getLooper());
    }

    @Override // wd.a
    protected void d(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f118924a.removeCallbacks(task);
    }

    @Override // wd.a
    protected void e(Runnable task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (j10 > 0) {
            this.f118924a.postDelayed(task, j10);
        } else if (g()) {
            task.run();
        } else {
            this.f118924a.post(task);
        }
    }

    public final Handler f() {
        return this.f118924a;
    }

    public b(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f118924a = handler;
    }
}
