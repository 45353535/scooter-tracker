package com.fyber.inneractive.sdk.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f23544c = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23546b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f23545a = new x1();

    public final t2 a(Class cls) {
        t2 t2VarA;
        Class cls2;
        Charset charset = l1.f23521a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        t2 t2Var = (t2) this.f23546b.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        x1 x1Var = this.f23545a;
        x1Var.getClass();
        Class cls3 = u2.f23590a;
        if (!z0.class.isAssignableFrom(cls) && (cls2 = u2.f23590a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        r2 r2VarB = x1Var.f23625a.b(cls);
        if ((r2VarB.f23561d & 2) == 2) {
            if (z0.class.isAssignableFrom(cls)) {
                t2VarA = new j2(u2.f23593d, k0.f23515a, r2VarB.f23558a);
            } else {
                o3 o3Var = u2.f23591b;
                j0 j0Var = k0.f23516b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = new j2(o3Var, j0Var, r2VarB.f23558a);
            }
        } else if (z0.class.isAssignableFrom(cls)) {
            t2VarA = ((r2VarB.f23561d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2 ? i2.a(r2VarB, l2.f23524b, t1.f23578b, u2.f23593d, k0.f23515a, a2.f23437b) : i2.a(r2VarB, l2.f23524b, t1.f23578b, u2.f23593d, (j0) null, a2.f23437b);
        } else {
            if (((r2VarB.f23561d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2) {
                k2 k2Var = l2.f23523a;
                r1 r1Var = t1.f23577a;
                o3 o3Var2 = u2.f23591b;
                j0 j0Var2 = k0.f23516b;
                if (j0Var2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t2VarA = i2.a(r2VarB, k2Var, r1Var, o3Var2, j0Var2, a2.f23436a);
            } else {
                t2VarA = i2.a(r2VarB, l2.f23523a, t1.f23577a, u2.f23592c, (j0) null, a2.f23436a);
            }
        }
        t2 t2Var2 = (t2) this.f23546b.putIfAbsent(cls, t2VarA);
        return t2Var2 != null ? t2Var2 : t2VarA;
    }
}
