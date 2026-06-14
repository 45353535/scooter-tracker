package com.explorestack.protobuf;

import com.explorestack.protobuf.v0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
class a1 implements y0 {
    a1() {
    }

    private static int a(int i10, Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        androidx.privacysandbox.ads.adservices.topics.a.a(obj2);
        if (x0Var.isEmpty()) {
            return 0;
        }
        Iterator it = x0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static x0 b(Object obj, Object obj2) {
        x0 x0VarR = (x0) obj;
        x0 x0Var = (x0) obj2;
        if (!x0Var.isEmpty()) {
            if (!x0VarR.n()) {
                x0VarR = x0VarR.r();
            }
            x0VarR.q(x0Var);
        }
        return x0VarR;
    }

    @Override // com.explorestack.protobuf.y0
    public v0.b forMapMetadata(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.a.a(obj);
        throw null;
    }

    @Override // com.explorestack.protobuf.y0
    public Map forMutableMapData(Object obj) {
        return (x0) obj;
    }

    @Override // com.explorestack.protobuf.y0
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // com.explorestack.protobuf.y0
    public boolean isImmutable(Object obj) {
        return !((x0) obj).n();
    }

    @Override // com.explorestack.protobuf.y0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.explorestack.protobuf.y0
    public Object newMapField(Object obj) {
        return x0.i().r();
    }

    @Override // com.explorestack.protobuf.y0
    public Object toImmutable(Object obj) {
        ((x0) obj).o();
        return obj;
    }
}
