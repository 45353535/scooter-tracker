package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f111170a = new AtomicLong();

    public static long a() {
        return f111170a.getAndIncrement();
    }
}
