package com.mbridge.msdk.advanced.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
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
public class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f46416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<CampaignEx> f46417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46421h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f46423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NativeAdvancedExpandDialog f46424k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46415b = "NativeAdvancedJSBridgeImpl";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f46422i = 5;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f46425a;

        a(ArrayList arrayList) {
            this.f46425a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                Iterator it = this.f46425a.iterator();
                while (it.hasNext()) {
                    jVarA.b((String) it.next());
                }
            } catch (Exception unused) {
                q0.b(b.this.f46415b, "campain can't insert db");
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f46419f = str;
        this.f46418e = str2;
        this.f46416c = new WeakReference<>(context);
    }

    public void b(int i10) {
        this.f46422i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b);
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "onSignalCommunicationConnect", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void click(Object obj, String str) {
        try {
            List<CampaignEx> list = this.f46417d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f46417d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
                q0.b(this.f46415b, e10.getMessage());
            }
            com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "click", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        q0.b(this.f46415b, "close");
        try {
            com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "close", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void d(Object obj, String str) {
        q0.a(this.f46415b, "sendImpressions:" + str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f46417d) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f46418e, campaignEx, "h5_native");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new a(arrayList)).start();
        } catch (Throwable th2) {
            q0.b(this.f46415b, "sendImpressions", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f46416c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f46424k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f46416c.get(), bundle, this.f46423j);
                this.f46424k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f46418e, this.f46417d);
                this.f46424k.show();
                com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
                if (aVar != null) {
                    aVar.a(true);
                }
                com.mbridge.msdk.advanced.report.a.a(this.f46418e, getMraidCampaign(), str);
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "expand", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void getFileInfo(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            com.mbridge.msdk.advanced.signal.a.a(obj, new JSONObject(str));
        } catch (Throwable th2) {
            q0.a(this.f46415b, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f46417d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f46417d.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.advanced.common.b bVar = new com.mbridge.msdk.advanced.common.b(com.mbridge.msdk.foundation.controller.c.n().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f46420g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C4240b4.i.G, bVar.b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f46417d));
            l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f46418e);
            if (lVarA == null) {
                lVarA = l.k(this.f46418e);
            }
            if (!TextUtils.isEmpty(this.f46419f)) {
                lVarA.d(this.f46419f);
            }
            lVarA.e(this.f46418e);
            lVarA.j(this.f46422i);
            lVarA.a(this.f46421h);
            jSONObject.put("unitSetting", lVarA.M());
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f49698a);
            q0.b(this.f46415b, "init" + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            q0.b(this.f46415b, "init", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void install(Object obj, String str) {
        q0.b(this.f46415b, "install");
        try {
            List<CampaignEx> list = this.f46417d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f46417d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "install", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().a(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().a(windVaneWebView, 2);
            }
        } catch (Throwable th2) {
            q0.a(this.f46415b, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void reportUrls(Object obj, String str) {
        q0.a(this.f46415b, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                    List<CampaignEx> list = this.f46417d;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
                    List<CampaignEx> list2 = this.f46417d;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            q0.b(this.f46415b, "reportUrls", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void triggerCloseBtn(Object obj, String str) {
        if (this.f46423j != null) {
            com.mbridge.msdk.advanced.signal.a.a(obj);
            this.f46423j.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            if (this.f46421h == -1) {
                int i10 = z10 ? 2 : 1;
                com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
                if (aVar != null) {
                    aVar.toggleCloseBtn(i10);
                }
            }
        } catch (Throwable th2) {
            q0.b(this.f46415b, "useCustomClose", th2);
        }
    }

    public void a(int i10) {
        this.f46421h = i10;
    }

    public void a(com.mbridge.msdk.advanced.middle.a aVar) {
        if (aVar != null) {
            this.f46423j = aVar;
        }
    }

    public void a(List<CampaignEx> list) {
        this.f46417d = list;
    }

    public List<CampaignEx> a() {
        return this.f46417d;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = new JSONObject(str).getInt("countdown");
            com.mbridge.msdk.advanced.middle.a aVar = this.f46423j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (JSONException e10) {
            q0.b(this.f46415b, "resetCountdown", e10);
        }
    }
}
