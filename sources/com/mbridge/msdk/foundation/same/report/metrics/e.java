package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f48887a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f48887a.put(str, (String) obj);
            } else {
                this.f48887a.put(str, obj + "");
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f48887a.get(str);
    }

    public void c(String str) {
        if (this.f48887a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f48887a.remove(str);
    }

    public boolean a(String str) {
        return this.f48887a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f48887a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f48887a) == null || (map2 = this.f48887a) == null) {
            return;
        }
        map2.putAll(map);
    }
}
