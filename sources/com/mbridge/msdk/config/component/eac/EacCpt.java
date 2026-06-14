package com.mbridge.msdk.config.component.eac;

import com.ironsource.C4240b4;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class EacCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f46854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f46855i;

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f46855i.a(this.f46854h.b(), this.f46642d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f46855i.a(this.f46854h.a(), this.f46642d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put("count", i10 + "");
                if (obj != null) {
                    map.put("value", obj);
                }
                if (obj instanceof Map.Entry) {
                    map.put(C4240b4.i.W, ((Map.Entry) obj).getKey().toString());
                } else {
                    map.put(C4240b4.i.W, i11 + "");
                }
                a(a("921002", map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put("count", Integer.valueOf(i10));
        a(a("921003", map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "921001";
        this.f46854h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f46855i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f46854h.c();
        if (objC == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", "");
            map.put("reason", "iterationData is null");
            map.put("count", 0);
            a(a("921003", map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.e());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put("code", "");
            map3.put("reason", "iterationData type not match");
            map3.put("count", 0);
            a(a("921003", map3));
        }
    }
}
