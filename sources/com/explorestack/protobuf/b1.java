package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y0 f18869a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y0 f18870b = new a1();

    static y0 a() {
        return f18869a;
    }

    static y0 b() {
        return f18870b;
    }

    private static y0 c() {
        try {
            return (y0) z0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
