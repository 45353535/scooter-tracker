package com.appodeal.ads.services.sentry_analytics;

import com.google.android.gms.ads.MobileAds;
import com.ironsource.N6;
import com.mbridge.msdk.out.MBConfiguration;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.vungle.ads.BuildConfig;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f14751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14752d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14753b;

    static {
        g[] gVarArr = {new g("Yandex", 0, "com.yandex.mobile"), new g(N6.H1, 1, "com.unity3d.services"), new g("MyTarget", 2, "com.my.target"), new g("Admob", 3, MobileAds.ERROR_DOMAIN), new g("GoogleApi", 4, "com.google.android.gms.common.api"), new g("Applovin", 5, "com.applovin.sdk"), new g(BuildConfig.OMSDK_PARTNER_NAME, 6, "com.vungle.warren"), new g("InMobi", 7, "com.inmobi.ads"), new g("BigoAds", 8, "sg.bigo.ads"), new g("DTExchange", 9, "com.fyber.inneractive"), new g("BillingLibrary", 10, com.android.billingclient.BuildConfig.APPLICATION_ID), new g("IronSourceAds", 11, "com.ironsource.sdk"), new g(MobileFuseDefaults.OMID_PARTNER_NAME, 12, "com.mobilefuse"), new g("Amazon", 13, "com.amazon"), new g("Pangle", 14, "com.bytedance"), new g("OpenAd", 15, "com.bytedance.sdk"), new g("Meta", 16, com.facebook.ads.BuildConfig.APPLICATION_ID), new g("Moloco", 17, com.moloco.sdk.BuildConfig.LIBRARY_PACKAGE_NAME), new g("Ogury", 18, "com.ogury.sdk"), new g("Pubmatic", 19, "com.pubmatic.sdk"), new g("Smaato", 20, "com.smaato.sdk"), new g("Verve", 21, "net.pubnative"), new g("Mintegral", 22, MBConfiguration.LOG_TAG), new g("Iab", 23, "com.explorestack.iab"), new g("Adjust", 24, "com.adjust.sdk"), new g("Appsflyer", 25, "com.appsflyer"), new g("Facebook", 26, "com.facebook"), new g("Firebase", 27, com.google.firebase.BuildConfig.LIBRARY_PACKAGE_NAME), new g("Sentry", 28, "io.sentry"), new g("ApplovinMax", 29, "com.applovin.mediation"), new g("LevelPlay", 30, "com.ironsource.mediationsdk"), new g("Bidmachine", 31, io.bidmachine.BuildConfig.LIBRARY_PACKAGE_NAME), new g("Bidon", 32, "org.bidon"), new g("Appodeal", 33, "com.appodeal.ads"), new g("Consent", 34, "com.appodeal.consent")};
        f14751c = gVarArr;
        f14752d = qf.a.a(gVarArr);
    }

    public g(String str, int i10, String str2) {
        this.f14753b = str2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14751c.clone();
    }
}
