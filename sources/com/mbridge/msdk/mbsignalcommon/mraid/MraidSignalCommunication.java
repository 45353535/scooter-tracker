package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f49770h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f49771g;

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b, "close");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.f49771g;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID close", th2);
        }
    }

    public void expand(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f49808b;
            a.a().b(aVar.f49808b, "expand");
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.f46632d && com.mbridge.msdk.click.utils.a.a(this.f49771g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f46631c)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f49771g == null) {
                return;
            }
            this.f49771g.expand(strOptString, strOptString2.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID expand", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.f49771g = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.f49771g = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() == null || !(windVaneWebView.getMraidObject() instanceof b)) {
                return;
            }
            this.f49771g = (b) windVaneWebView.getMraidObject();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f49808b;
            a.a().b(aVar.f49808b, "open");
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = new JSONObject(str).optString("url");
            q0.b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.f49771g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.utils.a.f46632d || !com.mbridge.msdk.click.utils.a.a(this.f49771g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.f46629a)) {
                this.f49771g.open(strOptString);
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID Open", th2);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("allowOrientationChange");
            String strOptString2 = jSONObject.optString("forceOrientation");
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.f49771g == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = "portrait";
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = "landscape";
            }
            lowerCase.equals(str2);
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties", th2);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b, "unload");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.f49771g;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID unload", th2);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f49808b, "useCustomClose");
        }
        try {
            String strOptString = new JSONObject(str).optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.f49771g == null) {
                return;
            }
            this.f49771g.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable th2) {
            q0.b("MraidSignalCommunication", "MRAID useCustomClose", th2);
        }
    }
}
