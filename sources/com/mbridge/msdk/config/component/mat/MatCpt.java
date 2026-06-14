package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MatCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<Map<String, Object>> f47117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    d f47118i;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        super.b(map);
        this.f46644f = "920001";
        Object obj = map.get("expression");
        if (obj instanceof List) {
            this.f47117h = (ArrayList) obj;
        }
        this.f47118i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        ArrayList<Map<String, Object>> arrayList = this.f47117h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Object objA = null;
        for (Map<String, Object> map : this.f47117h) {
            String strValueOf = String.valueOf(map.get("condition"));
            String strValueOf2 = String.valueOf(map.get("expression"));
            String strValueOf3 = String.valueOf(map.get("can_continue"));
            Object objA2 = this.f47118i.a(strValueOf, this.f46642d);
            boolean zEquals = false;
            if (objA2 instanceof Integer) {
                if (((Integer) objA2).intValue() == 1) {
                    zEquals = true;
                }
            } else if (objA2 instanceof String) {
                zEquals = String.valueOf(objA2).equals("1");
            }
            if (zEquals) {
                objA = this.f47118i.a(strValueOf2, this.f46642d);
                if (strValueOf3.equals("N")) {
                    break;
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put("data", objA);
        a(a("920002", map2));
    }
}
