package com.startapp.sdk.adsbase.model;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.iab.omid.library.startio.Omid;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.g;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.v0;
import com.startapp.sdk.internal.ve;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.z1;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class a extends z1 {
    public Integer A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public Set F0;
    public Set G0;
    public HashSet H0;
    public Set I0;
    public HashSet J0;
    public Pair K0;
    public boolean L0;
    public final long M0;
    public final int N0;
    public final String O0;
    public String P0;
    public String Q0;
    public boolean R0;
    public Boolean S0;
    public String T0;
    public Ad.AdType U0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public AdPreferences.Placement f64087j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f64088k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f64089l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f64090m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Integer f64091n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Long f64092o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f64093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f64094q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SDKAdPreferences.Gender f64095r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f64096s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f64097t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f64098u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Boolean f64099v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f64100w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Double f64101x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f64102y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f64103z0;

    public a() {
        super(4);
        this.f64097t0 = 1;
        this.f64098u0 = true;
        this.f64100w0 = AdsCommonMetaData.k().J();
        this.C0 = true;
        this.E0 = 0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.L0 = true;
        this.U0 = null;
        this.M0 = System.currentTimeMillis() - pg.f65112d.f65114b;
        WeakHashMap weakHashMap = vi.f65408a;
        this.N0 = t.f65279d.f65280a.size();
        this.O0 = MetaData.E().Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r3, com.startapp.sdk.adsbase.model.AdPreferences r4, com.startapp.sdk.adsbase.model.AdPreferences.Placement r5, com.startapp.sdk.common.utils.Pair r6) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.model.a.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.model.AdPreferences$Placement, com.startapp.sdk.common.utils.Pair):void");
    }

    @Override // com.startapp.sdk.internal.z1
    public final boolean b() {
        return true;
    }

    public void f(Context context) {
        sg sgVar = (sg) com.startapp.sdk.components.a.a(context).f64185l.a();
        AdPreferences.Placement placement = this.f64087j0;
        this.f64103z0 = placement == null ? null : (String) sgVar.f65269a.get(new rg(placement));
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        h6 h6Var = (h6) aVarA.f64183j.a();
        this.f64091n0 = h6Var.c();
        this.f64092o0 = (h6Var.d() && ((vf) h6Var.f64601b.a()).contains("consentTimestamp")) ? Long.valueOf(((vf) h6Var.f64601b.a()).getLong("consentTimestamp", 0L)) : null;
        this.f64093p0 = h6Var.b();
        this.f64094q0 = ((vf) aVarA.H.a()).getString("IABTCF_TCString", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public void a(ve veVar) {
        super.a(veVar);
        veVar.a("placement", this.f64087j0.name(), true, true);
        veVar.a("placementId", this.f64088k0, false, true);
        veVar.a("testMode", Boolean.toString(this.f64089l0), false, true);
        veVar.a("gender", this.f64095r0, false, true);
        veVar.a("keywords", this.f64096s0, false, true);
        veVar.a("adsNumber", Integer.toString(this.f64097t0), false, true);
        veVar.a("category", this.F0);
        veVar.a("categoryExclude", this.G0);
        veVar.a("packageExclude", this.H0);
        veVar.a("campaignExclude", this.J0);
        veVar.a("offset", Integer.toString(this.E0), false, true);
        veVar.a("ai", this.S0, false, true);
        Double d10 = this.f64101x0;
        WeakHashMap weakHashMap = vi.f65408a;
        veVar.a("minCPM", d10 != null ? String.format(Locale.US, "%.2f", d10) : null, false, true);
        veVar.a("previousAdId", this.f64103z0, false, true);
        veVar.a("twoClicks", Boolean.valueOf(!this.f64100w0), false, true);
        veVar.a("engInclude", Boolean.toString(this.L0), false, true);
        Object obj = this.U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            veVar.a("type", obj, false, true);
        }
        veVar.a("timeSinceSessionStart", Long.valueOf(this.M0), true, true);
        veVar.a("adsDisplayed", Integer.valueOf(this.N0), true, true);
        veVar.a("profileId", this.O0, false, true);
        veVar.a("hardwareAccelerated", Boolean.valueOf(this.f64098u0), false, true);
        veVar.a("autoLoadAmount", this.A0, false, true);
        veVar.a("dts", this.f64099v0, false, true);
        if (this.B0) {
            veVar.a("downloadingMode", "CACHE", false, true);
        }
        veVar.a("primaryImg", this.P0, false, true);
        veVar.a("moreImg", this.Q0, false, true);
        veVar.a("contentAd", Boolean.toString(this.R0), false, true);
        veVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, this.f64091n0, false, true);
        veVar.a("tsc", this.f64092o0, false, true);
        veVar.a("apc", this.f64093p0, false, true);
        veVar.a("IABTCF_TCString", this.f64094q0, false, true);
        if (this.f64090m0) {
            veVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            veVar.a("adTag", this.f64102y0, false, true);
        }
        String strA = g.a();
        veVar.a(g.f64534b, strA, true, true);
        String str = g.f64536d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f65633b);
        sb2.append(this.f64087j0.name());
        String str2 = this.Q;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(this.f65635c);
        sb2.append(strA);
        veVar.a(str, g.a(sb2.toString()), true, false);
        veVar.a("sound", Boolean.valueOf(this.D0), false, true);
        Set set = this.I0;
        if (set != null) {
            veVar.a("packageInclude", set);
        }
        veVar.a("defaultMetaData", Boolean.valueOf(this.C0), true, true);
        Pair pair = this.K0;
        veVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.T0;
        if (obj2 != null) {
            veVar.a("trv", obj2, false, false);
        }
        v0 v0Var = this.f65644g0;
        if (v0Var != null) {
            Integer num = (Integer) v0Var.f65365c.get(this.f64087j0);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                veVar.a("adsDisplayed", Integer.valueOf(iIntValue), false, false);
            }
        }
        veVar.a("omsdkv", Omid.getVersion(), false, true);
    }
}
