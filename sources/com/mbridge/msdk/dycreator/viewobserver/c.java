package com.mbridge.msdk.dycreator.viewobserver;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c extends a {
    public void a(Object obj) {
        b bVar;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f48181b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f48181b.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (bVar = (b) entry.getValue()) != null) {
                        bVar.a(obj);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}
