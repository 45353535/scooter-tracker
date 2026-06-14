package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f46702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f46703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f46704c;

    public c(String str, d dVar, d dVar2) {
        this.f46702a = str;
        this.f46703b = dVar;
        this.f46704c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f46703b.a(dVar, eVar, aVar);
        Object objA2 = this.f46704c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.add(objA2);
            return dVar.a(objA, arrayList, this.f46702a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(objA instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) objA;
        String strA = aVar3.a();
        List<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(objA2);
        Object objA3 = dVar.a(aVar3, arrayList2, this.f46702a, aVar);
        aVar2.a(strA);
        aVar2.a(objA3);
        return aVar2;
    }
}
