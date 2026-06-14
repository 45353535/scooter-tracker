package wd;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    boolean a(Runnable runnable, long j10);

    boolean b(Runnable runnable);

    void cancel(Runnable runnable);

    void execute(Runnable runnable);

    void schedule(Runnable runnable, long j10);
}
