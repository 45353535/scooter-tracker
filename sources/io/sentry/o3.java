package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f83778a;

    private o3(Class cls) {
        this.f83778a = cls;
    }

    public static o3 a(Class cls) {
        return new o3(cls);
    }

    public Object b() {
        return this.f83778a.getDeclaredConstructor(null).newInstance(null);
    }
}
