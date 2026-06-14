package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f18936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f18937b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f18938c;

    static {
        f18938c = (f18936a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f18937b;
    }

    static boolean c() {
        if (f18936a) {
            return true;
        }
        return (f18937b == null || f18938c) ? false : true;
    }
}
