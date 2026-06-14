package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
final class g1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MessageLite f19033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q2 f19034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f19036d;

    private g1(q2 q2Var, x xVar, MessageLite messageLite) {
        this.f19034b = q2Var;
        this.f19035c = xVar.d(messageLite);
        this.f19036d = xVar;
        this.f19033a = messageLite;
    }

    private int b(q2 q2Var, Object obj) {
        return q2Var.i(q2Var.g(obj));
    }

    private void c(q2 q2Var, x xVar, Object obj, u1 u1Var, w wVar) throws Throwable {
        q2 q2Var2;
        x xVar2;
        u1 u1Var2;
        w wVar2;
        Object objF = q2Var.f(obj);
        c0 c0VarC = xVar.c(obj);
        while (u1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                q2Var2 = q2Var;
                xVar2 = xVar;
                u1Var2 = u1Var;
                wVar2 = wVar;
            } catch (Throwable th2) {
                th = th2;
                q2Var2 = q2Var;
            }
            try {
                if (!e(u1Var2, wVar2, xVar2, c0VarC, q2Var2, objF)) {
                    q2Var2.n(obj, objF);
                    return;
                }
                u1Var = u1Var2;
                wVar = wVar2;
                xVar = xVar2;
                q2Var = q2Var2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                q2Var2.n(obj, objF);
                throw th4;
            }
        }
        q2Var.n(obj, objF);
    }

    static g1 d(q2 q2Var, x xVar, MessageLite messageLite) {
        return new g1(q2Var, xVar, messageLite);
    }

    private boolean e(u1 u1Var, w wVar, x xVar, c0 c0Var, q2 q2Var, Object obj) throws InvalidProtocolBufferException {
        int tag = u1Var.getTag();
        if (tag != z2.f19468a) {
            if (z2.b(tag) != 2) {
                return u1Var.skipField();
            }
            Object objA = xVar.a(wVar, this.f19033a, z2.a(tag));
            if (objA == null) {
                return q2Var.l(obj, u1Var);
            }
            xVar.g(u1Var, objA, wVar, c0Var);
            return true;
        }
        Object objA2 = null;
        int uInt32 = 0;
        ByteString bytes = null;
        while (u1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = u1Var.getTag();
            if (tag2 == z2.f19470c) {
                uInt32 = u1Var.readUInt32();
                objA2 = xVar.a(wVar, this.f19033a, uInt32);
            } else if (tag2 == z2.f19471d) {
                if (objA2 != null) {
                    xVar.g(u1Var, objA2, wVar, c0Var);
                } else {
                    bytes = u1Var.readBytes();
                }
            } else if (!u1Var.skipField()) {
                break;
            }
        }
        if (u1Var.getTag() != z2.f19469b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objA2 != null) {
                xVar.h(bytes, objA2, wVar, c0Var);
            } else {
                q2Var.d(obj, uInt32, bytes);
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.x1
    public void a(Object obj, u1 u1Var, w wVar) throws Throwable {
        c(this.f19034b, this.f19036d, obj, u1Var, wVar);
    }

    @Override // com.explorestack.protobuf.x1
    public int getSerializedSize(Object obj) {
        int iB = b(this.f19034b, obj);
        return this.f19035c ? iB + this.f19036d.b(obj).t() : iB;
    }

    @Override // com.explorestack.protobuf.x1
    public void makeImmutable(Object obj) {
        this.f19034b.j(obj);
        this.f19036d.e(obj);
    }

    @Override // com.explorestack.protobuf.x1
    public Object newInstance() {
        return this.f19033a.newBuilderForType().buildPartial();
    }
}
