package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x f18778a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x f18779b = c();

    static x a() {
        x xVar = f18779b;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static x b() {
        return f18778a;
    }

    private static x c() {
        try {
            int i10 = y.f19463b;
            return (x) y.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
