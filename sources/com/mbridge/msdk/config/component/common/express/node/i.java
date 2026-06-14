package com.mbridge.msdk.config.component.common.express.node;

/* JADX INFO: loaded from: classes10.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f46713a;

    public i(String str) {
        this.f46713a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objSubstring;
        if (this.f46713a.startsWith("$")) {
            objSubstring = com.mbridge.msdk.config.component.common.express.c.a(this.f46713a, aVar);
        } else if (this.f46713a.startsWith("\\") && this.f46713a.endsWith("\\\"")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f46713a.substring(1, r2.length() - 2));
            sb2.append("\"");
            objSubstring = sb2.toString();
        } else if (this.f46713a.startsWith("\"") && this.f46713a.endsWith("\"")) {
            String str = this.f46713a;
            objSubstring = str.substring(1, str.length() - 1);
        } else {
            objSubstring = this.f46713a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objSubstring;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f46713a.substring(1));
        return aVar2;
    }
}
