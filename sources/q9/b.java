package q9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f98760a;

    public static synchronized Executor a() {
        try {
            if (f98760a == null) {
                f98760a = o0.Q0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f98760a;
    }
}
