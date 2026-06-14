package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f103479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f103480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f103481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f103482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f103483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f103484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String[] f103485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f103486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f103487i;

    public n(@NonNull JSONObject jSONObject) {
        this.f103479a = jSONObject.optString("icon");
        this.f103480b = jSONObject.optString("title");
        this.f103481c = jSONObject.optString("rate");
        this.f103482d = jSONObject.optString("comments");
        this.f103483e = jSONObject.optString("downloads");
        this.f103484f = jSONObject.optString("description");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genre");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.f103485g = new String[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                this.f103485g[i10] = jSONArrayOptJSONArray.optString(i10);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(POBCoreNativeConstants.NATIVE_IMAGE);
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            this.f103486h = new String[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                this.f103486h[i11] = jSONArrayOptJSONArray2.optString(i11);
            }
        }
        this.f103487i = jSONObject.optString("name");
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String a() {
        return this.f103479a;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String b() {
        return this.f103480b;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String c() {
        return this.f103484f;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] d() {
        return this.f103485g;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String[] e() {
        return this.f103486h;
    }

    @Override // sg.bigo.ads.api.core.b.d
    public final String f() {
        return this.f103487i;
    }
}
