package w1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f106929a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ConcurrencyUtil#" + this.f106929a.getAndIncrement());
    }
}
