package com.appodeal.ads.initializing;

import com.appodeal.ads.adnetworks.MediationAdNetwork;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.ironsource.N6;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f13481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f13482f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13485d;

    static {
        String networkName = MediationAdNetwork.A4g.getNetworkName();
        AdType adType = AdType.Banner;
        AdType adType2 = AdType.Interstitial;
        AdType adType3 = AdType.Mrec;
        AdType adType4 = AdType.Native;
        AdType adType5 = AdType.Rewarded;
        l[] lVarArr = {new l("A4g", 0, networkName, "com.appodeal.ads.adapters.a4g.A4GNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Admob", 1, MediationAdNetwork.Admob.getNetworkName(), "com.appodeal.ads.adapters.admob.AdmobNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("AdmobNative", 2, MediationAdNetwork.AdmobNative.getNetworkName(), "com.appodeal.ads.adapters.admobnative.AdmobNativeNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType3})), new l("AdmobMediation", 3, MediationAdNetwork.AdmobMediation.getNetworkName(), "com.appodeal.ads.adapters.admobmediation.AdmobMediationNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Applovin", 4, MediationAdNetwork.Applovin.getNetworkName(), "com.appodeal.ads.adapters.applovin.ApplovinNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5})), new l("ApplovinMax", 5, MediationAdNetwork.ApplovinMax.getNetworkName(), "com.appodeal.ads.adapters.applovin_max.ApplovinMaxNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5, adType4})), new l("Amazon", 6, MediationAdNetwork.Amazon.getNetworkName(), "com.appodeal.ads.adapters.amazon.AmazonNetwork", CollectionsKt.emptyList()), new l("Appodeal", 7, MediationAdNetwork.Appodeal.getNetworkName(), "com.appodeal.ads.adapters.iab.appodeal.AppodealNativeNetwork", CollectionsKt.listOf(adType4)), new l(BidMachine.NAME, 8, MediationAdNetwork.BidMachine.getNetworkName(), "com.appodeal.ads.adapters.bidmachine.BidMachineNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Bidon", 9, MediationAdNetwork.Bidon.getNetworkName(), "com.appodeal.ads.adapters.bidon.BidonNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5})), new l("BigoAds", 10, MediationAdNetwork.BigoAds.getNetworkName(), "com.appodeal.ads.adapters.bigo_ads.BigoAdsNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("DTExchange", 11, MediationAdNetwork.DTExchange.getNetworkName(), "com.appodeal.ads.adapters.dtexchange.DTExchangeNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5})), new l("Gam", 12, MediationAdNetwork.Gam.getNetworkName(), "com.appodeal.ads.adapters.gam.GamNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Meta", 13, MediationAdNetwork.Meta.getNetworkName(), "com.appodeal.ads.adapters.meta.MetaNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("MobileFuse", 14, MediationAdNetwork.MobileFuse.getNetworkName(), "com.appodeal.ads.adapters.mobilefuse.MobileFuseNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Moloco", 15, MediationAdNetwork.Moloco.getNetworkName(), "com.appodeal.ads.adapters.moloco.MolocoNetwork", CollectionsKt.emptyList()), new l("Mintegral", 16, MediationAdNetwork.Mintegral.getNetworkName(), "com.appodeal.ads.adapters.mintegral.MintegralNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Inmobi", 17, MediationAdNetwork.Inmobi.getNetworkName(), "com.appodeal.ads.adapters.inmobi.InmobiNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("IronSource", 18, MediationAdNetwork.IronSource.getNetworkName(), "com.appodeal.ads.adapters.ironsource.IronSourceNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType2, adType5})), new l("LevelPlay", 19, MediationAdNetwork.LevelPlay.getNetworkName(), "com.appodeal.ads.adapters.level_play.LevelPlayNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5})), new l("Mraid", 20, MediationAdNetwork.Mraid.getNetworkName(), "com.appodeal.ads.adapters.iab.mraid.MraidNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType5})), new l("MyTarget", 21, MediationAdNetwork.MyTarget.getNetworkName(), "com.appodeal.ads.adapters.mytarget.MyTargetNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l("Ogury", 22, MediationAdNetwork.Ogury.getNetworkName(), "com.appodeal.ads.adapters.ogury.OguryNetwork", CollectionsKt.emptyList()), new l("Pangle", 23, MediationAdNetwork.Pangle.getNetworkName(), "com.appodeal.ads.adapters.pangle.PangleNetwork", CollectionsKt.emptyList()), new l("Pubmatic", 24, MediationAdNetwork.Pubmatic.getNetworkName(), "com.appodeal.ads.adapters.pubmatic.PubmaticNetwork", CollectionsKt.emptyList()), new l("Smaato", 25, MediationAdNetwork.Smaato.getNetworkName(), "com.appodeal.ads.adapters.smaato.SmaatoNetwork", CollectionsKt.emptyList()), new l("Notsy", 26, MediationAdNetwork.Notsy.getNetworkName(), "com.appodeal.ads.adapters.notsy.NotsyNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5})), new l(N6.H1, 27, MediationAdNetwork.UnityAds.getNetworkName(), "com.appodeal.ads.adapters.unityads.UnityadsNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType5, adType2})), new l("Vast", 28, MediationAdNetwork.Vast.getNetworkName(), "com.appodeal.ads.adapters.iab.vast.VASTNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType5, adType2})), new l("Verve", 29, MediationAdNetwork.Verve.getNetworkName(), "com.appodeal.ads.adapters.verve.VerveNetwork", CollectionsKt.emptyList()), new l(BuildConfig.OMSDK_PARTNER_NAME, 30, MediationAdNetwork.Vungle.getNetworkName(), "com.appodeal.ads.adapters.vungle.VungleNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType3, adType5, adType2})), new l("Yandex", 31, MediationAdNetwork.Yandex.getNetworkName(), "com.appodeal.ads.adapters.yandex.YandexNetwork", CollectionsKt.listOf((Object[]) new AdType[]{adType, adType2, adType3, adType4, adType5}))};
        f13482f = lVarArr;
        qf.a.a(lVarArr);
        f13481e = new k();
    }

    public l(String str, int i10, String str2, String str3, List list) {
        this.f13483b = str2;
        this.f13484c = str3;
        this.f13485d = list;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f13482f.clone();
    }

    public final String d() {
        return this.f13484c;
    }
}
