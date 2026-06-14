package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes4.dex */
class i implements l, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f103378a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f103379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f103380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f103381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f103382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f103383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f103384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f103385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f103386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f103387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f103388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f103389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f103390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f103391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f103392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List<sg.bigo.ads.api.a.a> f103393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f103394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f103395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected m f103396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f103397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f103398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f103399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f103400w;

    i() {
    }

    @Override // sg.bigo.ads.api.a.l
    public String a() {
        return this.f103379b;
    }

    @Override // sg.bigo.ads.api.a.l
    public int b() {
        return this.f103380c;
    }

    @Override // sg.bigo.ads.api.a.l
    public int c() {
        return this.f103381d;
    }

    @Override // sg.bigo.ads.api.a.l
    public int d() {
        return this.f103382e;
    }

    @Override // sg.bigo.ads.api.a.l
    public int e() {
        return this.f103383f;
    }

    @Override // sg.bigo.ads.api.a.l
    public int f() {
        return this.f103384g;
    }

    @Override // sg.bigo.ads.api.a.l
    public int g() {
        return this.f103385h;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean h() {
        return this.f103386i;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean i() {
        return this.f103387j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean j() {
        return this.f103388k;
    }

    @Override // sg.bigo.ads.api.a.l
    public int k() {
        return this.f103389l;
    }

    @Override // sg.bigo.ads.api.a.l
    public String l() {
        return this.f103390m;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean m() {
        return this.f103391n;
    }

    @Override // sg.bigo.ads.api.a.l
    public String n() {
        return this.f103392o;
    }

    @Override // sg.bigo.ads.api.a.l
    public String o() {
        return this.f103394q;
    }

    @Override // sg.bigo.ads.api.a.l
    public String p() {
        return this.f103395r;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public m q() {
        if (this.f103396s == null) {
            this.f103396s = new j(new JSONObject());
        }
        return this.f103396s;
    }

    @Override // sg.bigo.ads.api.a.l
    public int r() {
        return this.f103397t;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean s() {
        return this.f103397t == 1;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean t() {
        return this.f103398u == 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<sg.bigo.ads.api.a.a> list = this.f103393p;
        if (list != null) {
            for (sg.bigo.ads.api.a.a aVar : list) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(aVar);
            }
        }
        return "{strategyId=" + this.f103379b + ", adType=" + this.f103380c + ", countdown=" + this.f103381d + ", reqTimeout=" + this.f103382e + ", mediaStrategy=" + this.f103383f + ", webViewEnforceDuration=" + this.f103384g + ", videoDirection=" + this.f103385h + ", videoReplay=" + this.f103386i + ", videoMute=" + this.f103387j + ", bannerAutoRefresh=" + this.f103388k + ", bannerRefreshInterval=" + this.f103389l + ", slotId='" + this.f103390m + "', state=" + this.f103391n + ", placementId='" + this.f103392o + "', express=[" + sb2.toString() + "], styleId=" + this.f103395r + ", playable=" + this.f103397t + ", isCompanionRenderSupport=" + this.f103398u + ", aucMode=" + this.f103400w + ", nativeAdClickConfig=" + this.f103378a + '}';
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean u() {
        return this.f103399v;
    }

    @Override // sg.bigo.ads.api.a.l
    public int v() {
        return this.f103400w;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean w() {
        return this.f103400w == 3;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public k x() {
        return this.f103378a;
    }

    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f103379b);
        parcel.writeInt(this.f103380c);
        parcel.writeInt(this.f103381d);
        parcel.writeInt(this.f103382e);
        parcel.writeInt(this.f103383f);
        parcel.writeInt(this.f103384g);
        parcel.writeInt(this.f103385h);
        parcel.writeInt(this.f103386i ? 1 : 0);
        parcel.writeInt(this.f103387j ? 1 : 0);
        parcel.writeInt(this.f103388k ? 1 : 0);
        parcel.writeInt(this.f103389l);
        parcel.writeString(this.f103390m);
        parcel.writeInt(this.f103391n ? 1 : 0);
        parcel.writeString(this.f103392o);
        n.a(parcel, this.f103393p);
        parcel.writeInt(this.f103397t);
        parcel.writeString(this.f103395r);
        m mVar = this.f103396s;
        parcel.writeString(mVar == null ? null : mVar.toString());
        parcel.writeInt(this.f103399v ? 1 : 0);
        parcel.writeInt(this.f103398u);
        parcel.writeInt(this.f103400w);
        n.a(parcel, this.f103378a);
    }

    public void b(@NonNull Parcel parcel) {
        this.f103379b = parcel.readString();
        this.f103380c = parcel.readInt();
        this.f103381d = parcel.readInt();
        this.f103382e = parcel.readInt();
        this.f103383f = parcel.readInt();
        this.f103384g = parcel.readInt();
        this.f103385h = parcel.readInt();
        this.f103386i = parcel.readInt() != 0;
        this.f103387j = parcel.readInt() != 0;
        this.f103388k = parcel.readInt() != 0;
        this.f103389l = parcel.readInt();
        this.f103390m = parcel.readString();
        this.f103391n = parcel.readInt() != 0;
        this.f103392o = parcel.readString();
        this.f103393p = n.a(parcel, new f.a<sg.bigo.ads.api.a.a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        });
        this.f103397t = n.a(parcel, 0);
        this.f103395r = n.a(parcel, "");
        a(n.a(parcel, ""));
        this.f103399v = n.b(parcel, true);
        this.f103398u = n.a(parcel, 0);
        this.f103400w = n.a(parcel, 0);
        n.b(parcel, this.f103378a);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f103380c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.f103396s = new j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            sg.bigo.ads.common.t.a.a(0, "Slot", "parseData error, jsonObject is null.");
            return false;
        }
        this.f103381d = jSONObject.optInt("countdown", 5);
        this.f103380c = jSONObject.optInt("ad_type", -1);
        this.f103379b = jSONObject.optString("strategy_id", "");
        this.f103382e = jSONObject.optInt("req_once_load_timeout", 15);
        this.f103383f = jSONObject.optInt("media_strategy", 0);
        this.f103384g = jSONObject.optInt("webview_enforce_duration", 0) * 1000;
        this.f103385h = jSONObject.optInt("video_direction", 0);
        this.f103386i = sg.bigo.ads.api.core.a.d(this.f103380c) || jSONObject.optInt(Reporting.EventType.VIDEO_REPLAY, 1) == 1;
        this.f103387j = sg.bigo.ads.api.core.a.d(this.f103380c) || jSONObject.optInt(Reporting.EventType.VIDEO_MUTE, 0) == 0;
        this.f103388k = jSONObject.optInt("banner_auto_refresh", 0) == 1;
        this.f103389l = jSONObject.optInt("banner_refresh_interval", 20);
        this.f103390m = jSONObject.optString("slot", "");
        this.f103391n = jSONObject.optInt("state", 1) == 1;
        this.f103392o = jSONObject.optString(Reporting.Key.PLACEMENT_ID, "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("express_list");
        this.f103393p = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                a aVar = new a();
                if (jSONObjectOptJSONObject == null) {
                    sg.bigo.ads.common.t.a.a(0, "AdExpress", "parseData error, jsonObject is null.");
                } else {
                    aVar.f103306a = jSONObjectOptJSONObject.optLong("id", 0L);
                    aVar.f103307b = jSONObjectOptJSONObject.optString("name", "");
                    aVar.f103308c = jSONObjectOptJSONObject.optString("url", "");
                    aVar.f103309d = jSONObjectOptJSONObject.optString("md5", "");
                    aVar.f103310e = jSONObjectOptJSONObject.optString("style", "");
                    aVar.f103311f = jSONObjectOptJSONObject.optString("ad_types", "");
                    aVar.f103312g = jSONObjectOptJSONObject.optString(FontsContractCompat.Columns.FILE_ID, "");
                    if (aVar.f103306a != 0 && !TextUtils.isEmpty(aVar.f103307b) && !TextUtils.isEmpty(aVar.f103308c) && !TextUtils.isEmpty(aVar.f103309d) && !TextUtils.isEmpty(aVar.f103311f) && !TextUtils.isEmpty(aVar.f103312g)) {
                        this.f103393p.add(aVar);
                    }
                }
            }
        }
        this.f103394q = jSONObject.optString("abflags");
        this.f103397t = jSONObject.optInt("playable", 0);
        this.f103395r = jSONObject.optString("style_id");
        a(jSONObject.optString("interstitial_style_config"));
        this.f103399v = jSONObject.optInt("banner_multiple_click", 1) == 1;
        this.f103398u = jSONObject.optInt("companion_render", 0);
        this.f103400w = jSONObject.optInt("auc_mode", 0);
        g gVar = this.f103378a;
        gVar.f103373a = jSONObject.optInt("video_click_mode", 1) == 1;
        gVar.f103374b = jSONObject.optInt("native_ad_view_clickable", 0) == 1;
        gVar.f103375c = jSONObject.optInt("native_ad_click_type", 0);
        if (this.f103391n) {
            return (TextUtils.isEmpty(this.f103390m) || TextUtils.isEmpty(this.f103392o)) ? false : true;
        }
        return true;
    }
}
