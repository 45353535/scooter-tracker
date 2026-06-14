package com.appodeal.ads.adnetworks;

import com.ironsource.N6;
import com.taurusx.tax.f.y;
import com.vungle.ads.BuildConfig;
import io.bidmachine.BidMachine;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006)"}, d2 = {"Lcom/appodeal/ads/adnetworks/MediationAdNetwork;", "", "networkName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "A4g", "Admob", "AdmobNative", "AdmobMediation", "Applovin", "ApplovinMax", "Amazon", "Appodeal", BidMachine.NAME, "BigoAds", "DTExchange", "Gam", "Meta", "MobileFuse", "Moloco", "Mintegral", "Inmobi", "IronSource", "LevelPlay", "Mraid", "MyTarget", "Ogury", "Pangle", "Pubmatic", "Smaato", "Notsy", N6.H1, "Verve", "Vast", BuildConfig.OMSDK_PARTNER_NAME, "Bidon", "Yandex", y.f66058y, "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediationAdNetwork {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediationAdNetwork[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String networkName;
    public static final MediationAdNetwork A4g = new MediationAdNetwork("A4g", 0, "a4g");
    public static final MediationAdNetwork Admob = new MediationAdNetwork("Admob", 1, "admob");
    public static final MediationAdNetwork AdmobNative = new MediationAdNetwork("AdmobNative", 2, "admob_native");
    public static final MediationAdNetwork AdmobMediation = new MediationAdNetwork("AdmobMediation", 3, "admob_mediation");
    public static final MediationAdNetwork Applovin = new MediationAdNetwork("Applovin", 4, "applovin");
    public static final MediationAdNetwork ApplovinMax = new MediationAdNetwork("ApplovinMax", 5, "max");
    public static final MediationAdNetwork Amazon = new MediationAdNetwork("Amazon", 6, "amazon");
    public static final MediationAdNetwork Appodeal = new MediationAdNetwork("Appodeal", 7, "appodeal");
    public static final MediationAdNetwork BidMachine = new MediationAdNetwork(BidMachine.NAME, 8, "bidmachine");
    public static final MediationAdNetwork BigoAds = new MediationAdNetwork("BigoAds", 9, "bigo_ads");
    public static final MediationAdNetwork DTExchange = new MediationAdNetwork("DTExchange", 10, "dt_exchange");
    public static final MediationAdNetwork Gam = new MediationAdNetwork("Gam", 11, io.bidmachine.ads.networks.gam.BuildConfig.ADAPTER_NAME);
    public static final MediationAdNetwork Meta = new MediationAdNetwork("Meta", 12, "facebook");
    public static final MediationAdNetwork MobileFuse = new MediationAdNetwork("MobileFuse", 13, "mobilefuse");
    public static final MediationAdNetwork Moloco = new MediationAdNetwork("Moloco", 14, "moloco");
    public static final MediationAdNetwork Mintegral = new MediationAdNetwork("Mintegral", 15, "mintegral");
    public static final MediationAdNetwork Inmobi = new MediationAdNetwork("Inmobi", 16, "inmobi");
    public static final MediationAdNetwork IronSource = new MediationAdNetwork("IronSource", 17, "ironsource");
    public static final MediationAdNetwork LevelPlay = new MediationAdNetwork("LevelPlay", 18, "level_play");
    public static final MediationAdNetwork Mraid = new MediationAdNetwork("Mraid", 19, "mraid");
    public static final MediationAdNetwork MyTarget = new MediationAdNetwork("MyTarget", 20, "my_target");
    public static final MediationAdNetwork Ogury = new MediationAdNetwork("Ogury", 21, "ogury");
    public static final MediationAdNetwork Pangle = new MediationAdNetwork("Pangle", 22, "pangle");
    public static final MediationAdNetwork Pubmatic = new MediationAdNetwork("Pubmatic", 23, "pubmatic");
    public static final MediationAdNetwork Smaato = new MediationAdNetwork("Smaato", 24, "smaato");
    public static final MediationAdNetwork Notsy = new MediationAdNetwork("Notsy", 25, "notsy");
    public static final MediationAdNetwork UnityAds = new MediationAdNetwork(N6.H1, 26, "unity_ads");
    public static final MediationAdNetwork Verve = new MediationAdNetwork("Verve", 27, "verve");
    public static final MediationAdNetwork Vast = new MediationAdNetwork("Vast", 28, "vast");
    public static final MediationAdNetwork Vungle = new MediationAdNetwork(BuildConfig.OMSDK_PARTNER_NAME, 29, "vungle");
    public static final MediationAdNetwork Bidon = new MediationAdNetwork("Bidon", 30, "bidon");
    public static final MediationAdNetwork Yandex = new MediationAdNetwork("Yandex", 31, "yandex");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/adnetworks/MediationAdNetwork$Companion;", "", "<init>", "()V", "getByName", "Lcom/appodeal/ads/adnetworks/MediationAdNetwork;", "networkName", "", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediationAdNetwork getByName(String networkName) {
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            for (MediationAdNetwork mediationAdNetwork : MediationAdNetwork.values()) {
                if (Intrinsics.areEqual(mediationAdNetwork.getNetworkName(), networkName)) {
                    return mediationAdNetwork;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MediationAdNetwork[] $values() {
        return new MediationAdNetwork[]{A4g, Admob, AdmobNative, AdmobMediation, Applovin, ApplovinMax, Amazon, Appodeal, BidMachine, BigoAds, DTExchange, Gam, Meta, MobileFuse, Moloco, Mintegral, Inmobi, IronSource, LevelPlay, Mraid, MyTarget, Ogury, Pangle, Pubmatic, Smaato, Notsy, UnityAds, Verve, Vast, Vungle, Bidon, Yandex};
    }

    static {
        MediationAdNetwork[] mediationAdNetworkArr$values = $values();
        $VALUES = mediationAdNetworkArr$values;
        $ENTRIES = a.a(mediationAdNetworkArr$values);
        INSTANCE = new Companion(null);
    }

    private MediationAdNetwork(String str, int i10, String str2) {
        this.networkName = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MediationAdNetwork valueOf(String str) {
        return (MediationAdNetwork) Enum.valueOf(MediationAdNetwork.class, str);
    }

    public static MediationAdNetwork[] values() {
        return (MediationAdNetwork[]) $VALUES.clone();
    }

    public final String getNetworkName() {
        return this.networkName;
    }
}
