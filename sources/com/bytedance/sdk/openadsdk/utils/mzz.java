package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static boolean lnr;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.ljh> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static long f17881ud;

    public static boolean lnr() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.ljh> weakReference = qdl;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        lnr = true;
        return true;
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.mo moVarFhs = ljhVar.fhs();
        if (moVarFhs == null || TextUtils.isEmpty(moVarFhs.qdl())) {
            return;
        }
        qdl = new WeakReference<>(ljhVar);
    }

    private static void ud(final long j10) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.ljh> weakReference = qdl;
        if (weakReference == null || j10 <= 0 || (ljhVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, ljhVar.mzz(), "store_duration", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.utils.mzz.1
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        qdl = null;
        lnr = false;
    }

    public static void qdl(long j10) {
        ud(j10);
    }

    public static void qdl() {
        if (qdl == null || lnr) {
            return;
        }
        if (f17881ud > 0) {
            ud(SystemClock.elapsedRealtime() - f17881ud);
        }
        qdl = null;
        f17881ud = 0L;
    }

    public static void ud() {
        if (qdl == null || lnr) {
            return;
        }
        f17881ud = SystemClock.elapsedRealtime();
    }
}
