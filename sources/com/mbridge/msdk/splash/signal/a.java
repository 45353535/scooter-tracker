package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.mbridge.msdk.mbsignalcommon.mraid.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f50887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f50888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50892g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f50895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f50896k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f50886a = "SplashSignalCommunicationImpl";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50893h = 5;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.a$a, reason: collision with other inner class name */
    class RunnableC0573a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f50897a;

        RunnableC0573a(ArrayList arrayList) {
            this.f50897a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                Iterator it = this.f50897a.iterator();
                while (it.hasNext()) {
                    jVarA.b((String) it.next());
                }
            } catch (Exception unused) {
                q0.b(a.this.f50886a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f50890e = str;
        this.f50889d = str2;
        this.f50887b = new WeakReference<>(context);
    }

    public void a(Context context) {
        this.f50887b = new WeakReference<>(context);
    }

    public void b(int i10) {
        this.f50893h = i10;
    }

    public void c(int i10) {
        this.f50894i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        q0.b(this.f50886a, "close");
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "close", th2);
        }
    }

    public void d(Object obj, String str) {
        q0.a(this.f50886a, "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f50888c) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f50889d, campaignEx, "splash");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new RunnableC0573a(arrayList)).start();
        } catch (Throwable th2) {
            q0.b(this.f50886a, "sendImpressions", th2);
        }
    }

    public void e(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f50894i);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.b(this.f50886a, e10.getMessage());
        }
        com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f50887b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f50896k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f50887b.get(), bundle, this.f50895j);
                this.f50896k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f50889d, this.f50888c);
                this.f50896k.show();
                com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
                if (aVar != null) {
                    aVar.a(true);
                }
                com.mbridge.msdk.splash.report.a.a(this.f50889d, getMraidCampaign(), str);
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "expand", th2);
        }
    }

    public void f(Object obj, String str) {
        int iOptInt;
        int i10 = 0;
        if (!TextUtils.isEmpty(str)) {
            try {
                iOptInt = new JSONObject(str).optInt("countdown");
            } catch (Exception e10) {
                e = e10;
            }
            try {
                f.a().b(obj, c.a(0));
                i10 = iOptInt;
            } catch (Exception e11) {
                e = e11;
                i10 = iOptInt;
                q0.b(this.f50886a, e.getMessage());
            }
        }
        com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
        if (aVar != null) {
            aVar.a(2, i10);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f50888c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f50888c.get(0);
    }

    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.splash.common.b bVar = new com.mbridge.msdk.splash.common.b(com.mbridge.msdk.foundation.controller.c.n().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f50891f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C4240b4.i.G, bVar.b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f50888c));
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f50889d);
            if (lVarE == null) {
                lVarE = l.i(this.f50889d);
            }
            if (!TextUtils.isEmpty(this.f50890e)) {
                lVarE.d(this.f50890e);
            }
            lVarE.e(this.f50889d);
            lVarE.j(this.f50893h);
            lVarE.a(this.f50892g);
            jSONObject.put("unitSetting", lVarE.M());
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
            jSONObject.put("sdk_info", d.f49698a);
            q0.b(this.f50886a, "init" + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            q0.b(this.f50886a, "init", th2);
        }
    }

    public void install(Object obj, String str) {
        q0.b(this.f50886a, "install");
        try {
            List<CampaignEx> list = this.f50888c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = list.size() > 0 ? this.f50888c.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                campaignEx = campaignWithBackData;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "click", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        q0.b(this.f50886a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                q0.b(this.f50886a, e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            q0.b(this.f50886a, e11.getMessage());
        } catch (Throwable th2) {
            q0.b(this.f50886a, th2.getMessage());
        }
    }

    public void reportUrls(Object obj, String str) {
        q0.a(this.f50886a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int iOptInt = jSONObject.optInt("type");
                String strA = v0.a(jSONObject.optString("url"), "&tun=", m0.y() + "");
                int iOptInt2 = jSONObject.optInt(Constants.REPORT);
                if (iOptInt2 == 0) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list = this.f50888c;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list2 = this.f50888c;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, c.a(0));
        } catch (Throwable th2) {
            q0.b(this.f50886a, "reportUrls", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "toggleCloseBtn", th2);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
        if (aVar != null) {
            aVar.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10 = z10 ? 2 : 1;
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
            if (aVar != null) {
                aVar.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "useCustomClose", th2);
        }
    }

    public void a(int i10) {
        this.f50892g = i10;
    }

    public List<CampaignEx> b() {
        return this.f50888c;
    }

    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b);
            }
        } catch (Throwable th2) {
            q0.b(this.f50886a, "onJSBridgeConnect", th2);
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f50895j = aVar;
        }
    }

    public com.mbridge.msdk.splash.middle.a a() {
        return this.f50895j;
    }

    public void a(List<CampaignEx> list) {
        this.f50888c = list;
    }

    public void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = new JSONObject(str).getInt("countdown");
            com.mbridge.msdk.splash.middle.a aVar = this.f50895j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
