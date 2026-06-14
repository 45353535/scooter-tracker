package com.explorestack.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes7.dex */
final class t0 implements y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1 f19346b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f19347a;

    static class a implements d1 {
        a() {
        }

        @Override // com.explorestack.protobuf.d1
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // com.explorestack.protobuf.d1
        public c1 messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    private static class b implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d1[] f19348a;

        b(d1... d1VarArr) {
            this.f19348a = d1VarArr;
        }

        @Override // com.explorestack.protobuf.d1
        public boolean isSupported(Class cls) {
            for (d1 d1Var : this.f19348a) {
                if (d1Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.explorestack.protobuf.d1
        public c1 messageInfoFor(Class cls) {
            for (d1 d1Var : this.f19348a) {
                if (d1Var.isSupported(cls)) {
                    return d1Var.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public t0() {
        this(a());
    }

    private static d1 a() {
        return new b(f0.a(), b());
    }

    private static d1 b() {
        try {
            int i10 = o.f19251d;
            return (d1) o.class.getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return f19346b;
        }
    }

    private static boolean c(c1 c1Var) {
        return c1Var.getSyntax() == r1.PROTO2;
    }

    private static x1 d(Class cls, c1 c1Var) {
        return g0.class.isAssignableFrom(cls) ? c(c1Var) ? f1.p(cls, c1Var, l1.b(), q0.b(), z1.J(), a0.b(), b1.b()) : f1.p(cls, c1Var, l1.b(), q0.b(), z1.J(), null, b1.b()) : c(c1Var) ? f1.p(cls, c1Var, l1.a(), q0.a(), z1.E(), a0.a(), b1.a()) : f1.p(cls, c1Var, l1.a(), q0.a(), z1.F(), null, b1.a());
    }

    @Override // com.explorestack.protobuf.y1
    public x1 createSchema(Class cls) {
        z1.G(cls);
        c1 c1VarMessageInfoFor = this.f19347a.messageInfoFor(cls);
        return c1VarMessageInfoFor.isMessageSetWireFormat() ? g0.class.isAssignableFrom(cls) ? g1.d(z1.J(), a0.b(), c1VarMessageInfoFor.getDefaultInstance()) : g1.d(z1.E(), a0.a(), c1VarMessageInfoFor.getDefaultInstance()) : d(cls, c1VarMessageInfoFor);
    }

    private t0(d1 d1Var) {
        this.f19347a = (d1) j0.b(d1Var, "messageInfoFactory");
    }
}
