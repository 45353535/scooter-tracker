package com.mbridge.msdk.config.component.info;

import android.content.Context;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class InfoCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.model.a f46859h;

    private Object a(String str, Context context) {
        com.mbridge.msdk.config.component.info.model.a aVar = this.f46859h;
        if (aVar == null || context == null) {
            return null;
        }
        return aVar.b(str);
    }

    private Map<String, Object> g() {
        HashMap map = new HashMap();
        com.mbridge.msdk.config.component.info.model.a aVar = this.f46859h;
        return aVar != null ? aVar.c() : map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f46644f = "918001";
        this.f46859h = new com.mbridge.msdk.config.component.info.model.a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        a(a("918001", new HashMap<>()));
        String strE = this.f46859h.e();
        Map<String, Object> map = new HashMap<>();
        Context contextD = c.n().d();
        HashMap map2 = new HashMap();
        if (strE != null) {
            if (strE.equals("ALL")) {
                map2.putAll(g());
            } else {
                map2.put(strE, a(strE, contextD));
            }
        }
        if (this.f46859h.d() != null && !this.f46859h.d().isEmpty()) {
            int size = this.f46859h.d().size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < this.f46859h.d().size(); i10++) {
                iArr[i10] = v0.c(contextD, this.f46859h.d().get(i10)) ? 1 : 0;
            }
            try {
                List<String> listB = this.f46859h.b();
                List<String> listA = this.f46859h.a();
                if (listB != null && listB.size() == this.f46859h.d().size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < size; i11++) {
                        HashMap map3 = new HashMap();
                        map3.put("ind", Integer.valueOf(iArr[i11]));
                        map3.put("cid", listB.get(i11));
                        map3.put(CampaignEx.JSON_KEY_RETARGET_OFFER, listA.get(i11));
                        arrayList.add(map3);
                    }
                    map2.put("filter_list", arrayList);
                }
            } catch (Exception e10) {
                q0.a("InfoCpt", e10.getMessage());
            }
            map2.put("state_array", iArr);
        }
        map.put("result", map2);
        a(a("918002", map));
    }
}
