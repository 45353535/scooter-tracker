package com.mbridge.msdk.config.component.common.express.node;

import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f46698d = com.google.android.gms.measurement.internal.j.a(new Object[]{C4240b4.j.f42668b, "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f46699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f46700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f46701c;

    public b(String str, d dVar, d dVar2) {
        this.f46699a = str;
        this.f46700b = dVar;
        this.f46701c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f46700b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f46701c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f46699a, aVar);
    }
}
