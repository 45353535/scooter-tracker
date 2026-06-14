package sg.bigo.ads.controller.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f103342a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.common.h.a.a f103343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.core.d.a.a f103344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f103345g;

    public d(@NonNull Context context) {
        super(context);
        this.f103342a = new q();
        this.f103343e = new sg.bigo.ads.common.h.a.a();
        this.f103344f = new sg.bigo.ads.core.d.a.a();
        this.f103345g = new sg.bigo.ads.core.b.a.a();
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.f103365w)) {
            try {
                d(new JSONObject(this.f103365w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.f103364v)) {
            try {
                a(new JSONObject(this.f103364v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f103363u)) {
            try {
                b(new JSONObject(this.f103363u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.f103366x)) {
            return;
        }
        try {
            c(new JSONObject(this.f103366x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.controller.b.e
    protected final void c(JSONObject jSONObject) {
        this.f103344f.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    protected final void d(JSONObject jSONObject) {
        this.f103345g.a(jSONObject);
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final q m() {
        return this.f103342a;
    }

    @NonNull
    public final String toString() {
        return "GlobalConfigData{huaweiAdIdInfo=" + this.f103350h + ", googleAdIdInfo=" + this.f103351i + ", location=" + this.f103352j + ", state=" + this.f103355m + ", configId=" + this.f103356n + ", interval=" + this.f103357o + ", token='" + this.f103358p + "', antiBan='" + this.f103359q + "', strategy=" + this.f103360r + ", abflags='" + this.f103361s + "', country='" + this.f103362t + "', creatives='" + this.f103363u + "', trackConfig='" + this.f103364v + "', callbackConfig='" + this.f103365w + "', reportConfig='" + this.f103366x + "', appCheckConfig='" + this.f103367y + "', uid='" + this.f103368z + "', maxRequestNum=" + this.A + ", negFeedbackState=" + this.B + ", omUrl='" + this.C + "', globalSwitch=" + this.E.f102206a + ", bannerJsUrl='" + this.D + "', reqCountry='" + this.L + "', appFlag='" + this.N + "'}";
    }

    @Override // sg.bigo.ads.controller.b.e
    protected final void a(JSONObject jSONObject) {
        this.f103342a.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    protected final void b(JSONObject jSONObject) {
        this.f103343e.a(jSONObject);
    }
}
