package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f83529b = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f83530a = new CopyOnWriteArrayList();

    public interface a {
    }

    private h0() {
    }

    public static h0 a() {
        return f83529b;
    }

    public void b(a aVar) {
        this.f83530a.add(aVar);
    }
}
