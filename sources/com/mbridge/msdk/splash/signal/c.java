package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.taurusx.tax.g.n;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f50899a = "SplashSignalUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f50900b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f50901c = 1;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50902a;

        a(CampaignEx campaignEx) {
            this.f50902a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f50902a.getId())) {
                        jVarA.b(this.f50902a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f50902a.getId());
                        gVar.b(this.f50902a.getFca());
                        gVar.c(this.f50902a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                c.b(this.f50902a.getCampaignUnitId(), this.f50902a);
            } catch (Throwable th2) {
                q0.b(c.f50899a, th2.getMessage(), th2);
            }
        }
    }

    public static void b(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        String str;
        JSONArray jSONArray;
        int i10;
        boolean z10;
        String str2;
        File file;
        String str3 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                q0.a(f50899a, e10.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
            JSONArray jSONArray2 = jSONObject.getJSONArray(n.f66163g);
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray2.length();
                int i12 = 0;
                while (i12 < length) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String strOptString = jSONObject3.optString("ref", str3);
                    int i13 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i13 == i11 && !TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject();
                        m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(strOptString);
                        if (mVarB != null) {
                            jSONArray = jSONArray2;
                            q0.a(f50899a, "VideoBean not null");
                            jSONObject5.put("type", 1);
                            jSONObject5.put("videoDataLength", mVarB.d());
                            String strE = mVarB.e();
                            if (TextUtils.isEmpty(strE)) {
                                i10 = length;
                                q0.a(f50899a, "VideoPath null");
                                jSONObject5.put("path", str3);
                                jSONObject5.put("path4Web", str3);
                                str = str3;
                            } else {
                                i10 = length;
                                str = str3;
                                q0.a(f50899a, "VideoPath not null");
                                jSONObject5.put("path", strE);
                                jSONObject5.put("path4Web", strE);
                            }
                            if (mVarB.b() == 5) {
                                jSONObject5.put("downloaded", 1);
                                z10 = false;
                            } else {
                                z10 = false;
                                jSONObject5.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str = str3;
                            jSONArray = jSONArray2;
                            i10 = length;
                            z10 = false;
                            q0.a(f50899a, "VideoBean null");
                        }
                    } else {
                        str = str3;
                        jSONArray = jSONArray2;
                        i10 = length;
                        z10 = false;
                        if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 2);
                            jSONObject6.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th2) {
                                if (MBridgeConstans.DEBUG) {
                                    th2.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                q0.a(f50899a, "getFileInfo Mraid file " + strOptString);
                                str2 = "file:////" + strOptString;
                            } else {
                                str2 = str;
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 3);
                            jSONObject7.put("path", str2);
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("type", 4);
                            jSONObject8.put("path", u0.a(strOptString) == null ? str : u0.a(strOptString));
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        }
                    }
                    i12++;
                    jSONArray2 = jSONArray;
                    length = i10;
                    str3 = str;
                    i11 = 1;
                }
                jSONObject2.put(n.f66163g, jSONArray3);
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e11) {
                q0.a(f50899a, e11.getMessage());
                return;
            }
        } catch (Throwable th3) {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
        try {
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e12) {
            q0.a(f50899a, e12.getMessage());
        }
    }

    public static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f50900b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            q0.a(f50899a, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f48632m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "splash");
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b(f50899a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f50901c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            q0.a(f50899a, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        q0.b(f50899a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
