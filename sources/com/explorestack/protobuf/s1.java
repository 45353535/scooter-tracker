package com.explorestack.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes7.dex */
final class s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s1 f19337c = new s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19339b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1 f19338a = new t0();

    private s1() {
    }

    public static s1 a() {
        return f19337c;
    }

    public x1 b(Class cls, x1 x1Var) {
        j0.b(cls, "messageType");
        j0.b(x1Var, "schema");
        return (x1) this.f19339b.putIfAbsent(cls, x1Var);
    }

    public x1 c(Class cls) {
        x1 x1VarB;
        j0.b(cls, "messageType");
        x1 x1VarCreateSchema = (x1) this.f19339b.get(cls);
        return (x1VarCreateSchema != null || (x1VarB = b(cls, (x1VarCreateSchema = this.f19338a.createSchema(cls)))) == null) ? x1VarCreateSchema : x1VarB;
    }

    public x1 d(Object obj) {
        return c(obj.getClass());
    }
}
