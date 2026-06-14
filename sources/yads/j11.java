package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f112217a = new AtomicLong();

    public static final long a() {
        return f112217a.getAndIncrement();
    }
}
