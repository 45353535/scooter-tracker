package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.b;

/* JADX INFO: loaded from: classes10.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f51992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f51993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f51994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f51995d;

    public interface a {
        void a(b0 b0Var);
    }

    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, b.a aVar) {
        this.f51995d = false;
        this.f51992a = t10;
        this.f51993b = aVar;
        this.f51994c = null;
    }

    public static <T> v<T> a(T t10, b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f51994c == null;
    }

    private v(b0 b0Var) {
        this.f51995d = false;
        this.f51992a = null;
        this.f51993b = null;
        this.f51994c = b0Var;
    }
}
