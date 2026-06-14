package com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud;

import android.content.Context;
import com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    public static final ConcurrentHashMap<String, ud> qdl = new ConcurrentHashMap<>();

    public static synchronized void qdl(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, qdl.InterfaceC0201qdl interfaceC0201qdl) {
        if (lnrVar == null) {
            return;
        }
        try {
            ConcurrentHashMap<String, ud> concurrentHashMap = qdl;
            ud udVar = concurrentHashMap.get(lnrVar.yt());
            if (udVar == null) {
                udVar = new ud(context, lnrVar);
                concurrentHashMap.put(lnrVar.yt(), udVar);
                lnrVar.mo();
                lnrVar.yt();
            }
            udVar.qdl(interfaceC0201qdl);
            lnrVar.mo();
            lnrVar.yt();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        try {
            ud udVarRemove = qdl.remove(lnrVar.yt());
            if (udVarRemove != null) {
                udVarRemove.qdl(true);
            }
            lnrVar.mo();
            lnrVar.yt();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
