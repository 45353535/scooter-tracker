package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f19368a = c();

    public static w a() {
        w wVarB = b("getEmptyRegistry");
        return wVarB != null ? wVarB : w.f19394e;
    }

    private static final w b(String str) {
        Class cls = f19368a;
        if (cls == null) {
            return null;
        }
        try {
            return (w) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            u uVar = u.f19349j;
            return u.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
