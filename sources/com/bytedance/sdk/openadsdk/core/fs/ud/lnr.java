package com.bytedance.sdk.openadsdk.core.fs.ud;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.openadsdk.core.fs.ud.qdl;
import com.bytedance.sdk.openadsdk.core.fs.ud.ud;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static final Map<String, ud> qdl = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final AtomicBoolean f17241ud = new AtomicBoolean(false);
    private final String lnr;
    private final boolean mml;
    private boolean mo;
    private EnumC0259lnr mzz;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.ud.lnr$lnr, reason: collision with other inner class name */
    enum EnumC0259lnr {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    public static class qdl {
        private final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private EnumC0259lnr f17247ud = EnumC0259lnr.TRACKING_URL;
        private boolean lnr = false;

        public qdl(String str) {
            this.qdl = str;
        }

        public qdl qdl(boolean z10) {
            this.lnr = z10;
            return this;
        }

        public lnr qdl() {
            return new lnr(this.qdl, this.f17247ud, Boolean.valueOf(this.lnr));
        }
    }

    public static class ud {
        float lnr;
        final ljh qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        String f17248ud;

        public ud(String str, ljh ljhVar) {
            this(str, ljhVar, -1.0f);
        }

        public String toString() {
            return super.toString();
        }

        public ud(String str, ljh ljhVar, float f10) {
            this.f17248ud = str;
            this.qdl = ljhVar;
            this.lnr = f10;
        }
    }

    static {
        bqt.qdl(new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.1
            @Override // com.bytedance.sdk.component.utils.bqt.qdl
            public void qdl(Context context, Intent intent, boolean z10, int i10) {
                if (i10 == 0 || lnr.qdl.size() <= 0) {
                    return;
                }
                lnr.ud();
            }
        }, yt.qdl());
    }

    protected lnr(String str, EnumC0259lnr enumC0259lnr, Boolean bool) {
        this.lnr = str;
        this.mzz = enumC0259lnr;
        this.mml = bool.booleanValue();
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.qdl> lnr(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new qdl.C0260qdl(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).qdl());
                }
            }
        }
        return arrayList;
    }

    public static void ud(ljh ljhVar, @NonNull List<lnr> list, @Nullable com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, @Nullable long j10, @Nullable String str, String str2) {
        qdl(ljhVar, list, qdlVar, j10, str, null, str2);
    }

    public void j_() {
        this.mo = true;
    }

    public boolean mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mo;
    }

    public static List<String> qdl(ljh ljhVar, @NonNull List<lnr> list, @Nullable com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, @Nullable long j10, @Nullable String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (lnr lnrVar : list) {
            if (lnrVar != null && (!lnrVar.mzz() || lnrVar.mml())) {
                arrayList.add(lnrVar.lnr());
                lnrVar.j_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.fs.lnr.lnr(arrayList, ljhVar).qdl(qdlVar).qdl(j10).ud(str).qdl(str2).qdl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud() {
        if (f17241ud.compareAndSet(false, true)) {
            Map<String, ud> map = qdl;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    qdl((String) entry.getKey(), (ud) entry.getValue(), true);
                }
            }
            f17241ud.set(false);
        }
    }

    public String lnr() {
        return this.lnr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(final boolean z10, final String str, final String str2, final ud udVar, final String str3, final boolean z11) {
        ljh ljhVar;
        if (udVar == null || (ljhVar = udVar.qdl) == null) {
            return;
        }
        final boolean zUj = ljhVar.uj();
        final String str4 = zUj ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new jpc(str4) { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", udVar.f17248ud);
                    jSONObject.put("success", z10);
                    jSONObject.put("url", str3);
                    if (zUj) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        float f10 = udVar.lnr;
                        if (f10 >= 0.0f) {
                            jSONObject.put("progress", ((double) Math.round(f10 * 100.0f)) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), udVar.qdl, str2, str4, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.3.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject lnr() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        if (!z11) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.ud> ud(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ud.qdl(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).qdl());
                }
            }
        }
        return arrayList;
    }

    public static boolean qdl(ljh ljhVar, @NonNull List<lnr> list, @Nullable com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar, @Nullable long j10, @Nullable String str, ud udVar, @Nullable String str2) {
        List<String> listQdl = qdl(ljhVar, list, qdlVar, j10, str, str2);
        qdl(listQdl, udVar);
        return !listQdl.isEmpty();
    }

    public static void qdl(List<String> list, ud udVar) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                qdl(str, udVar, false);
            }
        }
    }

    private static void qdl(final String str, final ud udVar, final boolean z10) {
        com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
        if (udVarLnr == null) {
            return;
        }
        udVarLnr.qdl(true);
        udVarLnr.ud(str);
        udVarLnr.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.ud.lnr.2
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar2) {
                String str2;
                boolean z11;
                ud udVar3 = udVar;
                if (udVar3 == null || udVar3.qdl == null) {
                    return;
                }
                String str3 = null;
                if (udVar2 == null || !udVar2.mo()) {
                    if (udVar2 != null) {
                        str3 = udVar2.qdl() + StringUtils.PROCESS_POSTFIX_DELIMITER + udVar2.ud();
                        if (!z10 && (udVar2.qdl() <= 300 || udVar2.qdl() >= 400)) {
                            lnr.qdl.put(str, udVar);
                        }
                    }
                    str2 = str3;
                    z11 = false;
                } else {
                    str2 = null;
                    z11 = true;
                }
                lnr.ud(z11, str2, gy.lnr(udVar.qdl.vz()), udVar, str, z10);
                if (!z11 || lnr.qdl.isEmpty()) {
                    return;
                }
                lnr.ud();
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                ljh ljhVar;
                ud udVar2 = udVar;
                if (udVar2 != null && (ljhVar = udVar2.qdl) != null) {
                    lnr.ud(false, iOException != null ? iOException.getMessage() : null, gy.lnr(ljhVar.vz()), udVar, str, z10);
                }
                if (z10 || udVar == null) {
                    return;
                }
                lnr.qdl.put(str, udVar);
            }
        });
    }

    public static JSONArray qdl(List<lnr> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).lnr());
        }
        return jSONArray;
    }

    public static List<lnr> qdl(JSONArray jSONArray) {
        return qdl(jSONArray, false);
    }

    public static List<lnr> qdl(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new qdl(strOptString).qdl(z10).qdl());
                }
            }
        }
        return arrayList;
    }
}
