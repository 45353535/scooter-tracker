package com.mbridge.msdk.dycreator.viewobserver;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class d extends a {
    public void a(Object obj) {
        i iVar;
        try {
            synchronized (this) {
                try {
                    ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f48181b;
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        for (Map.Entry<Integer, Object> entry : this.f48181b.entrySet()) {
                            if (entry != null && (entry.getValue() instanceof i) && (iVar = (i) entry.getValue()) != null) {
                                iVar.a(obj);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
