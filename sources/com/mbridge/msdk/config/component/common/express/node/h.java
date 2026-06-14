package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class h extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<d> f46712a;

    public h(List<d> list) {
        this.f46712a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        HashMap map = new HashMap();
        Iterator<d> it = this.f46712a.iterator();
        while (it.hasNext()) {
            Object objA = it.next().a(dVar, eVar, aVar);
            map.putAll(objA instanceof Map ? (HashMap) objA : new HashMap());
        }
        return map;
    }
}
