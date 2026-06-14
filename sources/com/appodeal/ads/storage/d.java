package com.appodeal.ads.storage;

import androidx.webkit.Profile;
import com.appodeal.ads.modules.common.internal.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f14788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f14789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f14790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f14791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f14792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f14793h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14794b;

    static {
        d dVar = new d(Profile.DEFAULT_PROFILE_NAME, 0, "appodeal");
        f14788c = dVar;
        d dVar2 = new d("Placement", 1, Constants.PLACEMENT_FREQUENCY);
        f14789d = dVar2;
        d dVar3 = new d("InstallTracking", 2, "install_tracking");
        f14790e = dVar3;
        d dVar4 = new d("CampaignFrequency", 3, Constants.CAMPAIGN_FREQUENCY);
        f14791f = dVar4;
        d dVar5 = new d("CampaignFrequencyClicks", 4, "freq_clicks");
        f14792g = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f14793h = dVarArr;
        qf.a.a(dVarArr);
    }

    public d(String str, int i10, String str2) {
        this.f14794b = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14793h.clone();
    }
}
