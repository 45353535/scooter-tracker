package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f46705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f46706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<d> f46707c;

    public e(d dVar, String str, List<d> list) {
        this.f46705a = dVar;
        this.f46706b = str;
        this.f46707c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f46707c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList("map", "filter", "sorted").contains(this.f46706b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f46707c.get(0), aVar));
            for (int i10 = 1; i10 < this.f46707c.size(); i10++) {
                arrayList.add(this.f46707c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f46707c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f46705a.a(dVar, eVar, aVar), arrayList, this.f46706b, aVar);
    }
}
