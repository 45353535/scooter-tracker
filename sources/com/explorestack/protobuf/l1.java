package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i1 f19207a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i1 f19208b = new k1();

    static i1 a() {
        return f19207a;
    }

    static i1 b() {
        return f19208b;
    }

    private static i1 c() {
        try {
            return (i1) j1.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
