package yads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class am0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f108718a;

    public am0(Handler handler) {
        this.f108718a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f108718a.post(runnable);
    }
}
