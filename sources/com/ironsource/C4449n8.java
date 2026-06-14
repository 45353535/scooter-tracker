package com.ironsource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4449n8 implements InterfaceC4219a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44451b = "n8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C4449n8 f44452c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, H8> f44453a = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4430m8 f44454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f44455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44456c;

        a(C4430m8 c4430m8, Context context, String str) {
            this.f44454a = c4430m8;
            this.f44455b = context;
            this.f44456c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4449n8.this.f44453a.put(this.f44456c, new C4346h8(this.f44454a, this.f44455b));
        }
    }

    private C4312f8 b(JSONObject jSONObject) {
        C4312f8 c4312f8 = new C4312f8();
        try {
            return a(jSONObject);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return c4312f8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C4240b4.i.f42651s0);
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static synchronized C4449n8 a() {
        try {
            if (f44452c == null) {
                f44452c = new C4449n8();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44452c;
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f44451b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f44453a.containsKey(string)) {
            Logger.i(f44451b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        H8 h82 = this.f44453a.get(string);
        if (h82 != null) {
            h82.c(jSONObject, str, str2);
        }
    }

    private C4312f8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C4240b4.i.O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C4312f8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return new C4312f8();
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f44453a.containsKey(string)) {
                H8 h82 = this.f44453a.get(string);
                String string2 = jSONObject.getString(C4240b4.i.f42657v0);
                if (h82 != null) {
                    h82.a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f44451b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f44451b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f44453a.containsKey(string)) {
                H8 h82 = this.f44453a.get(string);
                this.f44453a.remove(string);
                if (h82 != null) {
                    h82.a(str, str2);
                    return;
                }
                return;
            }
            Logger.i(f44451b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f44451b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    public void a(InterfaceC4363i8 interfaceC4363i8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C4312f8 c4312f8B = b(jSONObject);
            if (!this.f44453a.containsKey(string)) {
                C4430m8 c4430m8 = new C4430m8(interfaceC4363i8, context, string, c4312f8B);
                c4430m8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c4430m8.b(jSONObject, str, str2);
                if (d(jSONObject)) {
                    S7.f41731a.d(new a(c4430m8, context, string));
                    return;
                } else {
                    this.f44453a.put(string, c4430m8);
                    return;
                }
            }
            Logger.i(f44451b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.i(f44451b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC4219a1
    @Nullable
    public H8 a(String str) {
        if (str.isEmpty() || !this.f44453a.containsKey(str)) {
            return null;
        }
        return this.f44453a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f44453a.containsKey(string)) {
                H8 h82 = this.f44453a.get(string);
                if (h82 != null) {
                    h82.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(f44451b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.i(f44451b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
