package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.touch.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static void a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> mapA;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        com.mbridge.msdk.config.dynamic.baseview.touch.a touchEventData = xMLView.getTouchEventData();
        HashMap map2 = new HashMap();
        if (touchEventData != null && (mapA = touchEventData.a()) != null) {
            a.C0501a c0501aB = touchEventData.b();
            if (c0501aB != null) {
                mapA.put("click_x", String.valueOf(c0501aB.f47517b));
                mapA.put("click_y", String.valueOf(c0501aB.f47518c));
            }
            mapA.put("click_time", String.valueOf(System.currentTimeMillis()));
            map2.putAll(mapA);
        }
        if (map != null) {
            map2.putAll(map);
        }
        xMLView.getXmlViewActionListener().a(String.valueOf(obj), map2);
    }
}
