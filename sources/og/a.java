package og;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f96972b = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
