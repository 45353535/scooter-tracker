package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f23523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f23524b;

    static {
        k2 k2Var = null;
        try {
            k2Var = (k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23523a = k2Var;
        f23524b = new k2();
    }
}
