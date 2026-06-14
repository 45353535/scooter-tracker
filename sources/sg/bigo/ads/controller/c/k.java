package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements b.InterfaceC1253b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f103455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f103457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f103458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f103460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f103461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f103462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f103463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f103464j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f103465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f103466l;

    public k(@NonNull JSONObject jSONObject) {
        this.f103455a = jSONObject.optString("land_url", "");
        this.f103456b = jSONObject.optString("deeplink_url", "");
        this.f103457c = jSONObject.optInt("web_ad_model", 0);
        this.f103459e = jSONObject.optString("return_tracker_url", "");
        this.f103460f = jSONObject.optInt("land_preload_type", 0);
        this.f103461g = jSONObject.optString("click_open_pkg", "");
        this.f103462h = jSONObject.optInt("probe_interval", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pixel");
        if (jSONObjectOptJSONObject != null) {
            this.f103463i = jSONObjectOptJSONObject.optString("host", "");
            String strOptString = jSONObjectOptJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strOptString)) {
                b(strOptString);
            }
        } else {
            this.f103463i = "";
        }
        this.f103465k = jSONObject.optString("pre_landing_url", "");
        this.f103466l = jSONObject.optInt("pre_landing_scene", 0);
        this.f103458d = jSONObject.optJSONArray("webview_bundle");
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String a() {
        return this.f103455a;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String b() {
        return this.f103456b;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final int c() {
        return this.f103457c;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final JSONArray d() {
        return this.f103458d;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String e() {
        return this.f103459e;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final int f() {
        return this.f103460f;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String g() {
        return this.f103461g;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String h() {
        return this.f103463i;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final Map<String, String> i() {
        return this.f103464j;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final String j() {
        return this.f103465k;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final int k() {
        return this.f103466l;
    }

    private void b(String str) {
        this.f103464j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(C4240b4.j.f42670c)) {
            if (str2.indexOf(C4240b4.j.f42668b) >= 0) {
                String strSubstring = str2.substring(0, str2.indexOf(C4240b4.j.f42668b));
                if (!TextUtils.isEmpty(strSubstring)) {
                    String str3 = this.f103464j.get(strSubstring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str3)) {
                        str2 = str3 + C4240b4.j.f42670c + str2;
                    }
                    this.f103464j.put(strSubstring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC1253b
    public final void a(@NonNull String str) {
        this.f103455a = str;
    }
}
