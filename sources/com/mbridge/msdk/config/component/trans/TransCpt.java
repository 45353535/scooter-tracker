package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TransCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.trans.model.a f47292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f47293i;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "911001";
        if (this.f46639a.containsKey("event") && (this.f46639a.get("event") instanceof Map)) {
            this.f47293i = (Map) this.f46639a.get("event");
        }
        this.f47292h = new com.mbridge.msdk.config.component.trans.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objA = new d().a(this.f47292h.a(), this.f46642d);
        HashMap map = new HashMap();
        if (objA != null) {
            map.put("result", objA);
            q0.b("TransformComponent", "当前算子结果 " + map.toString());
        }
        a(a("911002", map));
    }
}
