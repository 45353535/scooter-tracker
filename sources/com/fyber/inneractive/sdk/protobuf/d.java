package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f23452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f23453b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f23452a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f23453b = cls2 != null;
    }

    public static boolean a() {
        return (f23452a == null || f23453b) ? false : true;
    }
}
