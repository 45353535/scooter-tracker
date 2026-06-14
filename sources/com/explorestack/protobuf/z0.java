package com.explorestack.protobuf;

import com.explorestack.protobuf.v0;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class z0 implements y0 {
    z0() {
    }

    private static int a(int i10, Object obj, Object obj2) {
        int iX = 0;
        if (obj == null) {
            return 0;
        }
        Map mapI = ((w0) obj).i();
        u0 u0Var = (u0) obj2;
        if (mapI.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapI.entrySet()) {
            iX += n.X(i10) + n.E(v0.a(u0Var.j(), entry.getKey(), entry.getValue()));
        }
        return iX;
    }

    private static Object b(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        w0 w0Var2 = (w0) obj2;
        if (!w0Var.m()) {
            w0Var.f();
        }
        w0Var.o(w0Var2);
        return w0Var;
    }

    @Override // com.explorestack.protobuf.y0
    public v0.b forMapMetadata(Object obj) {
        return ((u0) obj).j();
    }

    @Override // com.explorestack.protobuf.y0
    public Map forMutableMapData(Object obj) {
        return ((w0) obj).l();
    }

    @Override // com.explorestack.protobuf.y0
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // com.explorestack.protobuf.y0
    public boolean isImmutable(Object obj) {
        return !((w0) obj).m();
    }

    @Override // com.explorestack.protobuf.y0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.explorestack.protobuf.y0
    public Object newMapField(Object obj) {
        return w0.p((u0) obj);
    }

    @Override // com.explorestack.protobuf.y0
    public Object toImmutable(Object obj) {
        ((w0) obj).n();
        return obj;
    }
}
