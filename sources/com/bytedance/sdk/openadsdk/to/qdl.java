package com.bytedance.sdk.openadsdk.to;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo;
import com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements lnr {
    private final Map<String, mo> lnr = new HashMap();
    private final ljh qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ud f17822ud;

    private qdl(ud udVar, ljh ljhVar) {
        this.f17822ud = udVar;
        this.qdl = ljhVar;
    }

    public static qdl qdl(ud udVar, ljh ljhVar) {
        return new qdl(udVar, ljhVar);
    }

    @Override // com.bytedance.sdk.openadsdk.to.lnr
    public void qdl() {
        this.lnr.clear();
    }

    private ljh qdl(JSONObject jSONObject, String str) {
        String strQdl;
        if (jSONObject == null) {
            return null;
        }
        ljh ljhVar = new ljh();
        ljhVar.mzz(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            ljhVar.xmv(str);
        }
        if (this.qdl != null) {
            String strQdl2 = ljhVar.fhs() != null ? ljhVar.fhs().qdl() : null;
            if (TextUtils.isEmpty(strQdl2)) {
                return this.qdl;
            }
            com.bytedance.sdk.openadsdk.core.model.mo moVarFhs = this.qdl.fhs();
            if (moVarFhs != null && strQdl2.equals(moVarFhs.qdl())) {
                return this.qdl;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (moVarFhs != null) {
                try {
                    strQdl = moVarFhs.qdl();
                } catch (JSONException unused) {
                }
            } else {
                strQdl = "null";
            }
            jSONObject2.put("lu", strQdl);
            jSONObject2.put("ju", strQdl2);
            ljh ljhVar2 = this.qdl;
            com.bytedance.sdk.openadsdk.core.mml.qdl(ljhVar2, gy.qdl(ljhVar2), -5, jSONObject2);
            if (moVarFhs != null && strQdl2.contains("play.google.com/store") && !strQdl2.contains(Constants.REFERRER)) {
                ljhVar.fhs().qdl(moVarFhs.qdl());
            }
        }
        return ljhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.to.lnr
    public void qdl(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        qdl(context, qdl(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i10, z10);
    }

    private void qdl(Context context, ljh ljhVar, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || ljhVar == null || ljhVar.fhs() == null || jSONObject == null || this.f17822ud == null || this.lnr.get(ljhVar.fhs().qdl()) != null) {
            return;
        }
        String strUd = gy.ud(i10);
        if (TextUtils.isEmpty(strUd)) {
            return;
        }
        this.lnr.put(ljhVar.fhs().qdl(), qdl(context, strUd));
    }

    @Override // com.bytedance.sdk.openadsdk.to.lnr
    public void qdl(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.qdl == null) {
            return;
        }
        wd.qdl(context, str).lnr(this.qdl);
    }

    @Override // com.bytedance.sdk.openadsdk.to.lnr
    public void qdl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        qdl(qdl(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void qdl(ljh ljhVar, JSONObject jSONObject) {
        if (this.f17822ud == null || ljhVar == null || ljhVar.fhs() == null) {
            return;
        }
        String strQdl = ljhVar.fhs().qdl();
        if (this.lnr.containsKey(strQdl)) {
            this.lnr.remove(strQdl);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f17822ud.qdl("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                aaj.lnr("JsAppAdDownloadManager", e10.getMessage());
            }
        }
    }

    private mo qdl(@NonNull Context context, @NonNull String str) {
        mo moVarQdl = wd.qdl(context, str);
        moVarQdl.qdl(true);
        return moVarQdl;
    }
}
