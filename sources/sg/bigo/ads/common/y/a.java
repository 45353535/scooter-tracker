package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f103123a = new AtomicInteger();

    public static int a() {
        return f103123a.incrementAndGet();
    }

    public static void a(int i10) {
        f103123a.set(i10);
    }
}
