package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f103488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f103490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f103493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f103494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f103495h;

    public o(@NonNull JSONObject jSONObject) {
        this.f103488a = jSONObject.optString("imageurl");
        this.f103489b = jSONObject.optString(POBCTAOverlayData.KEY_CTA_CLICKURL);
        this.f103490c = jSONObject.optString("longlegaltext");
        this.f103491d = jSONObject.optString("ad_info");
        this.f103492e = jSONObject.optString("ad_link");
        this.f103493f = jSONObject.optInt("percent");
        this.f103494g = jSONObject.optString("rec_rule");
        this.f103495h = jSONObject.optString("user_privacy");
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String a() {
        return this.f103488a;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String b() {
        return this.f103489b;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String c() {
        return this.f103490c;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String d() {
        return this.f103491d;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String e() {
        return this.f103492e;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final int f() {
        return this.f103493f;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String g() {
        return this.f103494g;
    }

    @Override // sg.bigo.ads.api.core.b.e
    public final String h() {
        return this.f103495h;
    }
}
