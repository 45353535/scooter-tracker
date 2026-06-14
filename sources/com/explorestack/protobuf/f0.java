package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
class f0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f0 f18992a = new f0();

    private f0() {
    }

    public static f0 a() {
        return f18992a;
    }

    @Override // com.explorestack.protobuf.d1
    public boolean isSupported(Class cls) {
        return g0.class.isAssignableFrom(cls);
    }

    @Override // com.explorestack.protobuf.d1
    public c1 messageInfoFor(Class cls) {
        if (!g0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            g0.b(cls.asSubclass(g0.class));
            throw null;
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
