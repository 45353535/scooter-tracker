package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f103129a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f103130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f103131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.c f103132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f103133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f103134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final sg.bigo.ads.controller.a.a.f f103135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final sg.bigo.ads.controller.a.a.e f103136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.h f103137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.d f103138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f103139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f103140o;

    public a(@NonNull Context context, sg.bigo.ads.api.a.h hVar) {
        super(context);
        this.f103132g = new sg.bigo.ads.controller.a.a.c(sg.bigo.ads.b.a());
        this.f103133h = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.b(), "");
        this.f103134i = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.c(), "");
        this.f103135j = new sg.bigo.ads.controller.a.a.f();
        this.f103136k = new sg.bigo.ads.controller.a.a.e();
        this.f103137l = new sg.bigo.ads.controller.a.a.h();
        this.f103138m = new sg.bigo.ads.controller.a.a.d(hVar);
        this.f103131f = LogConstants.KEY_SDK;
        this.f103140o = false;
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "AntiBanConfig";
    }

    public final void c() {
        sg.bigo.ads.controller.a.a.c cVar = this.f103132g;
        if (cVar != null) {
            cVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar = this.f103133h;
        if (bVar != null) {
            bVar.a();
        }
        sg.bigo.ads.controller.a.a.b bVar2 = this.f103134i;
        if (bVar2 != null) {
            bVar2.a();
        }
        a(0L);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    private static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (n.a(parcel, 4) < 4) {
            return;
        }
        this.f103139n = n.a(parcel, 0);
        this.f103129a = n.b(parcel, false);
        this.f103130e = n.b(parcel, false);
        this.f103131f = n.a(parcel, LogConstants.KEY_SDK);
        n.b(parcel, this.f103132g);
        n.b(parcel, this.f103133h);
        n.b(parcel, this.f103134i);
        n.b(parcel, this.f103135j);
        n.b(parcel, this.f103136k);
        n.b(parcel, this.f103137l);
        n.b(parcel, this.f103138m);
        this.f103140o = n.b(parcel, true);
    }

    @NonNull
    public final h a(String str, String str2, Map<String, String> map, String str3, int i10) {
        boolean z10;
        if (TextUtils.isEmpty(str)) {
            return h.a("", false, 4003, "config content is empty");
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith("{");
        final ArrayList arrayList = new ArrayList();
        if (!zStartsWith) {
            String strA = sg.bigo.ads.common.j.a.a(strTrim, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", new ValueCallback<Exception>() { // from class: sg.bigo.ads.controller.a.a.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Exception exc) {
                    Exception exc2 = exc;
                    if (exc2 != null) {
                        arrayList.add(exc2);
                    }
                }
            });
            if (TextUtils.isEmpty(strA)) {
                sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "decrypt error, decrypted content is empty.");
                strTrim = null;
            } else {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", "decrypt, cryptStr=" + strTrim + ", hexStringSecKey=FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F, decryptStr=" + strA);
                strTrim = strA;
            }
        }
        String str4 = strTrim;
        if (!sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
            this.f103130e = true;
            return h.a(str4, zStartsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int iOptInt = jSONObject.optInt("version", 0);
            int i11 = this.f103139n;
            if (iOptInt < i11) {
                z10 = false;
            } else {
                z10 = iOptInt == i11 ? this.f103140o : true;
            }
            if (!z10) {
                return new h(str4, false, zStartsWith, 0, "local config version is " + this.f103139n + ", remote version is " + iOptInt);
            }
            boolean z11 = iOptInt == i11;
            this.f103139n = iOptInt;
            this.f103129a = zStartsWith;
            this.f103131f = str2;
            this.f103132g.a(a(jSONObject.optJSONObject("cfg_svr")), z11, str3, i10);
            this.f103133h.a(a(jSONObject.optJSONObject("report_svr")), z11, str3, i10);
            this.f103134i.a(a(jSONObject.optJSONObject("ad_svr")), z11, str3, i10);
            if (!z11) {
                this.f103135j.a(a(jSONObject.optJSONObject("third_pay_svr")));
                this.f103136k.a(a(jSONObject.optJSONObject("third_free_svr")));
                sg.bigo.ads.controller.a.a.h hVar = this.f103137l;
                JSONObject jSONObjectA = a(jSONObject.optJSONObject("uri_opt_timeout"));
                synchronized (hVar) {
                    hVar.f103200a = jSONObjectA.optLong("getsdkconfig", 0L) * 1000;
                    hVar.f103201b = jSONObjectA.optLong("getuniad", 0L) * 1000;
                    hVar.f103202c = jSONObjectA.optLong("unicallback", 0L) * 1000;
                    hVar.f103203d = jSONObjectA.optLong("getuniconfig", 0L) * 1000;
                    hVar.f103204e = jSONObjectA.optLong("reportunibaina", 0L) * 1000;
                }
                sg.bigo.ads.controller.a.a.d dVar = this.f103138m;
                JSONObject jSONObjectA2 = a(jSONObject.optJSONObject("req_pool_size"));
                synchronized (dVar) {
                    dVar.f103170a = jSONObjectA2.optInt("sdk_config", 3);
                    dVar.f103171b = jSONObjectA2.optInt(Constants.REPORT, 2);
                    dVar.f103172c = jSONObjectA2.optInt("config_ad", 12);
                    dVar.f103173d = jSONObjectA2.optInt("callback", 3);
                    dVar.f103174e = jSONObjectA2.optInt("vast_wrapper", 3);
                    dVar.f103175f = jSONObjectA2.optInt("tracker", 10);
                    dVar.f103176g = jSONObjectA2.optInt(Reporting.Key.CREATIVE, 5);
                }
                if (!sg.bigo.ads.common.utils.k.a(map)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.f103140o = false;
            return new h(str4, zStartsWith);
        } catch (JSONException e10) {
            return h.a(str4, zStartsWith, 4005, Log.getStackTraceString(e10));
        }
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (this.f102310d) {
            try {
                new File(o.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(o.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(4);
        parcel.writeInt(this.f103139n);
        n.a(parcel, this.f103129a);
        n.a(parcel, this.f103130e);
        parcel.writeString(this.f103131f);
        n.a(parcel, this.f103132g);
        n.a(parcel, this.f103133h);
        n.a(parcel, this.f103134i);
        n.a(parcel, this.f103135j);
        n.a(parcel, this.f103136k);
        n.a(parcel, this.f103137l);
        n.a(parcel, this.f103138m);
        n.a(parcel, this.f103140o);
    }

    public final boolean a(@NonNull String str, @NonNull String str2) {
        return this.f103134i.a(str, str2) | this.f103132g.a(str, str2) | this.f103133h.a(str, str2);
    }
}
