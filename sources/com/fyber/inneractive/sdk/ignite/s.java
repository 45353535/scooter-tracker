package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.flow.w;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21089b;

    public s(e eVar, c cVar) {
        this.f21088a = eVar;
        this.f21089b = cVar;
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.a("InstallCallback onError %s", str);
        if (this.f21088a != null) {
            String strA = a(str);
            String strOptString = null;
            try {
                jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(PglCryptUtils.KEY_MESSAGE) : null;
            try {
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString = jSONObjectOptJSONObject2.optString("code");
                }
            } catch (Exception unused2) {
            }
            this.f21088a.a(strA, strOptString2, strOptString);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.a("InstallCallback onProgress %s", str);
        try {
            String strA = a(str);
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("progress")) == null) {
                return;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("action");
            double dOptDouble = jSONObjectOptJSONObject.optDouble("value");
            r rVar = this.f21088a;
            if (rVar != null) {
                rVar.a(strA, iOptInt, dOptDouble);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        String strOptString;
        IAlog.a("InstallCallback onScheduled %s", str);
        try {
            String strA = a(str);
            try {
                strOptString = new JSONObject(str).getJSONObject("application").optString("packageName");
            } catch (Exception unused) {
                strOptString = null;
            }
            r rVar = this.f21088a;
            if (rVar != null) {
                rVar.a(strA, strOptString);
            }
        } catch (Exception unused2) {
            IAlog.a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.a("InstallCallback onStart %s", str);
        if (this.f21088a != null) {
            this.f21088a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.a("InstallCallback onSuccess %s", str);
        if (this.f21088a != null) {
            this.f21088a.b(a(str));
            c cVar = this.f21089b;
            if (cVar != null) {
                h hVar = cVar.f21062b;
                String str2 = cVar.f21061a.f21066a;
                hVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    IAConfigManager.O.f20313s.a(new z0(new f(str2), str2));
                }
                g gVar = cVar.f21061a;
                w wVar = gVar.f21067b;
                m mVar = gVar.f21068c;
                v vVar = wVar.f21016h;
                u uVar = u.IGNITE_FLOW_INSTALL_DONE;
                if (mVar == null) {
                    mVar = m.SINGLE_TAP;
                }
                vVar.a(uVar, mVar);
            }
        }
    }
}
