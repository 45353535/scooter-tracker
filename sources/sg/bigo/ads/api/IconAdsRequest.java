package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes4.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.api.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f102085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f102086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f102087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f102088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f102089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f102090n;

    public static class a extends c<a, IconAdsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f102091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.core.b f102092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f102093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f102094d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f102095e = 20;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f102096f;

        @Override // sg.bigo.ads.api.c
        protected final /* synthetic */ sg.bigo.ads.api.b createAdRequest() {
            if (this.f102091a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(@NonNull a aVar) {
        super(aVar.mSlotId, null);
        this.f102085i = aVar.f102091a;
        this.f102086j = aVar.f102092b;
        this.f102087k = aVar.f102093c;
        this.f102088l = aVar.f102094d;
        this.f102089m = aVar.f102095e;
        this.f102090n = aVar.f102096f;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f102085i.b();
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.b bVar = this.f102086j;
        if (bVar != null) {
            linkedHashMap.put("host_slot", bVar.b());
            linkedHashMap.put("host_placement", this.f102086j.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f102086j.x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f102086j.w()));
            linkedHashMap.put("dsp_source", this.f102086j.v());
            linkedHashMap.put("main_domain", this.f102086j.i());
            linkedHashMap.put("main_bundle", this.f102086j.n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f102086j.y()));
            linkedHashMap.put("main_ad_id", this.f102086j.r());
            linkedHashMap.put("dsp_extra", this.f102086j.an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.f102088l));
        linkedHashMap.put("scene_page", Integer.valueOf(this.f102087k));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f102089m));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final l h() {
        return this.f102085i;
    }

    @Override // sg.bigo.ads.api.b.b
    public final sg.bigo.ads.api.core.b i() {
        return this.f102086j;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int j() {
        return this.f102089m;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int k() {
        return this.f102087k;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int l() {
        b bVar = this.f102090n;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }

    /* synthetic */ IconAdsRequest(a aVar, byte b10) {
        this(aVar);
    }
}
