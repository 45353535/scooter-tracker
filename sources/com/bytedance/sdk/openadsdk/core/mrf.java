package com.bytedance.sdk.openadsdk.core;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mrf {
    private static volatile mrf qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Map<String, Map<String, String>> f17411ud = new ConcurrentHashMap();

    private mrf() {
    }

    public static mrf qdl() {
        if (qdl == null) {
            synchronized (mrf.class) {
                try {
                    if (qdl == null) {
                        qdl = new mrf();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public boolean lnr(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f17411ud;
        if (map2 == null || !map2.containsKey(str) || (map = this.f17411ud.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public boolean ud(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f17411ud;
        if (map2 == null || !map2.containsKey(str) || (map = this.f17411ud.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void qdl(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f17411ud;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f17411ud.put(str, concurrentHashMap);
    }

    public String qdl(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f17411ud;
        if (map2 == null || !map2.containsKey(str) || (map = this.f17411ud.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void qdl(String str) {
        Map<String, Map<String, String>> map = this.f17411ud;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f17411ud.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f17411ud.remove(str);
        }
    }
}
