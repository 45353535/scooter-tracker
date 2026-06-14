package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f23436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f23437b;

    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f23436a = z1Var;
        f23437b = new z1();
    }
}
