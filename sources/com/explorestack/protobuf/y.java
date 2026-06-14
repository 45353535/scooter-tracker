package com.explorestack.protobuf;

import com.explorestack.protobuf.h0;

/* JADX INFO: loaded from: classes7.dex */
final class y extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f19462a = i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19463b = 0;

    y() {
    }

    private static long i() {
        return w2.M(h0.e.class.getDeclaredField("b"));
    }

    @Override // com.explorestack.protobuf.x
    Object a(w wVar, MessageLite messageLite, int i10) {
        ((u) wVar).d(((Message) messageLite).getDescriptorForType(), i10);
        return null;
    }

    @Override // com.explorestack.protobuf.x
    public c0 b(Object obj) {
        return (c0) w2.G(obj, f19462a);
    }

    @Override // com.explorestack.protobuf.x
    c0 c(Object obj) {
        c0 c0VarB = b(obj);
        if (!c0VarB.A()) {
            return c0VarB;
        }
        c0 c0VarClone = c0VarB.clone();
        j(obj, c0VarClone);
        return c0VarClone;
    }

    @Override // com.explorestack.protobuf.x
    boolean d(MessageLite messageLite) {
        return messageLite instanceof h0.e;
    }

    @Override // com.explorestack.protobuf.x
    void e(Object obj) {
        b(obj).F();
    }

    @Override // com.explorestack.protobuf.x
    Object f(u1 u1Var, Object obj, w wVar, c0 c0Var, Object obj2, q2 q2Var) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.x
    void g(u1 u1Var, Object obj, w wVar, c0 c0Var) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        if (!w.c()) {
            throw null;
        }
        throw null;
    }

    @Override // com.explorestack.protobuf.x
    void h(ByteString byteString, Object obj, w wVar, c0 c0Var) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        throw null;
    }

    void j(Object obj, c0 c0Var) {
        w2.X(obj, f19462a, c0Var);
    }
}
