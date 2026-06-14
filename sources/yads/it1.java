package yads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class it1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f112120a = new AtomicBoolean(false);

    public static final void a() {
        if (f112120a.compareAndSet(false, true)) {
            wa1.b("Yandex Mobile Ads 7.17.0 initialized successfully", new Object[0]);
        }
    }
}
