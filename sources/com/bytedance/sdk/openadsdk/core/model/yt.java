package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class yt {
    private qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f17409ud;

    public yt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.qdl = new qdl(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.f17409ud = new qdl(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static qdl lnr(ljh ljhVar) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return null;
        }
        return ytVarXv.qdl;
    }

    public static boolean qdl(ljh ljhVar) {
        return qdl(ljhVar, false);
    }

    public static qdl ud(ljh ljhVar) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return null;
        }
        return ytVarXv.f17409ud;
    }

    public static class qdl {
        C0265qdl qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        C0265qdl f17410ud;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.yt$qdl$qdl, reason: collision with other inner class name */
        public static class C0265qdl {
            String qdl;

            public C0265qdl(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.qdl = jSONObject.optString("entry");
            }

            public boolean qdl() {
                return !TextUtils.isEmpty(this.qdl);
            }
        }

        public qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.qdl = new C0265qdl(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.f17410ud = new C0265qdl(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean qdl() {
            C0265qdl c0265qdl = this.f17410ud;
            if (c0265qdl != null && c0265qdl.qdl()) {
                return true;
            }
            C0265qdl c0265qdl2 = this.qdl;
            return c0265qdl2 != null && c0265qdl2.qdl();
        }

        public String qdl(boolean z10) {
            if (z10) {
                C0265qdl c0265qdl = this.qdl;
                if (c0265qdl != null) {
                    return c0265qdl.qdl;
                }
                return "";
            }
            C0265qdl c0265qdl2 = this.f17410ud;
            if (c0265qdl2 != null) {
                return c0265qdl2.qdl;
            }
            return "";
        }
    }

    public static boolean qdl(ljh ljhVar, boolean z10) {
        yt ytVarXv;
        if (ljhVar == null || (ytVarXv = ljhVar.xv()) == null) {
            return false;
        }
        if (z10) {
            qdl qdlVar = ytVarXv.f17409ud;
            return qdlVar != null && qdlVar.qdl();
        }
        qdl qdlVar2 = ytVarXv.qdl;
        return qdlVar2 != null && qdlVar2.qdl();
    }
}
