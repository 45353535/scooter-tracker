package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4396k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4363i8 f43446a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f43448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43450e = C4396k8.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f43451f = {"handleGetViewVisibility"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f43452g = {C4329g8.f43163h, C4329g8.f43164i, C4329g8.f43162g, "handleGetViewVisibility", C4329g8.f43165j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fg f43447b = new fg();

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f43455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f43456d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f43453a = str;
            this.f43454b = str2;
            this.f43455c = str3;
            this.f43456d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C4396k8.this.b(this.f43453a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f43453a;
                    Log.e(C4396k8.this.f43450e, str);
                    C4396k8.this.a(this.f43454b, str);
                    return;
                }
                if (this.f43453a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C4396k8.this.e(this.f43455c);
                } else if (this.f43453a.equalsIgnoreCase(C4329g8.f43165j) || this.f43453a.equalsIgnoreCase(C4329g8.f43164i)) {
                    C4396k8.this.a(this.f43456d.getString("params"), this.f43455c, this.f43454b);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f43453a;
                Log.e(C4396k8.this.f43450e, str2);
                C4396k8.this.a(this.f43454b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43459b;

        b(String str, String str2) {
            this.f43458a = str;
            this.f43459b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4396k8.this.f43448c.evaluateJavascript(this.f43458a, null);
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                Log.e(C4396k8.this.f43450e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f43459b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f43446a == null || this.f43447b == null) {
            return;
        }
        a(C4329g8.f43156a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f43451f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C4329g8.f43166k);
    }

    public void e() {
        if (this.f43446a == null || this.f43447b == null) {
            return;
        }
        a(C4329g8.f43157b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f43449d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void g(String str) {
        this.f43449d = str;
    }

    public void a(WebView webView) {
        this.f43448c = webView;
    }

    public void b() {
        this.f43446a = null;
        this.f43447b = null;
    }

    public String c() {
        return this.f43449d;
    }

    public void a(InterfaceC4363i8 interfaceC4363i8) {
        this.f43446a = interfaceC4363i8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (!TextUtils.isEmpty(strOptString) && h(strOptString)) {
                if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                    a(jSONObject, (String) null, (String) null);
                    return;
                }
                return;
            }
            a(jSONObject.optString(C4329g8.f43177v, C4329g8.f43158c), jSONObject);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            Log.e(this.f43450e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f43452g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d(String str) {
        S7.f41731a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC4363i8 interfaceC4363i8 = this.f43446a;
        if (interfaceC4363i8 != null) {
            interfaceC4363i8.a(str, jSONObject);
        }
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f43447b.a();
        jSONObjectA.put("adViewId", this.f43449d);
        a(str, jSONObjectA);
    }

    public void a(String str, String str2) {
        InterfaceC4363i8 interfaceC4363i8 = this.f43446a;
        if (interfaceC4363i8 != null) {
            interfaceC4363i8.a(str, str2, this.f43449d);
        }
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f43446a == null) {
            C4618x8.a(Xd.f42086t, new C4533s8().a(D5.f40578y, "mDelegate is null").a());
        } else {
            S7.f41731a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i10, boolean z10) {
        this.f43447b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C4329g8.f43174s, this.f43447b.a());
            jSONObject.put(C4329g8.f43171p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return new JSONObject();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f43448c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f43450e, str4);
            this.f43446a.a(str3, str4, this.f43449d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f43449d);
        a(str2, jSONObject);
    }

    private String a(String str) {
        return String.format(C4329g8.f43176u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f43447b.a());
            return jSONObject2;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Log.e(this.f43450e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject2;
        }
    }
}
