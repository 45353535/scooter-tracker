package org.bidon.sdk.config;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lorg/bidon/sdk/config/DefaultAdapters;", "", "classPath", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getClassPath", "()Ljava/lang/String;", "AdmobAdapter", "AmazonAdapter", "ApplovinAdapter", "BidmachineAdapter", "BigoAdsAdapter", "Chartboost", "DTExchangeAdapter", "GoogleAdManagerAdapter", "InmobiAdapter", "IronSourceAdapter", "MetaAdapter", "MintegralAdapter", "MobilefuseAdapter", "MolocoAdapter", "TaurusXAdapter", "StartIoAdapter", "UnityAdsAdapter", "VkAdsAdapter", "VungleAdapter", "YandexAdapter", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultAdapters {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DefaultAdapters[] $VALUES;

    @NotNull
    private final String classPath;
    public static final DefaultAdapters AdmobAdapter = new DefaultAdapters("AdmobAdapter", 0, "org.bidon.admob.AdmobAdapter");
    public static final DefaultAdapters AmazonAdapter = new DefaultAdapters("AmazonAdapter", 1, "org.bidon.amazon.AmazonAdapter");
    public static final DefaultAdapters ApplovinAdapter = new DefaultAdapters("ApplovinAdapter", 2, "org.bidon.applovin.ApplovinAdapter");
    public static final DefaultAdapters BidmachineAdapter = new DefaultAdapters("BidmachineAdapter", 3, "org.bidon.bidmachine.BidMachineAdapter");
    public static final DefaultAdapters BigoAdsAdapter = new DefaultAdapters("BigoAdsAdapter", 4, "org.bidon.bigoads.BigoAdsAdapter");
    public static final DefaultAdapters Chartboost = new DefaultAdapters("Chartboost", 5, "org.bidon.chartboost.ChartboostAdapter");
    public static final DefaultAdapters DTExchangeAdapter = new DefaultAdapters("DTExchangeAdapter", 6, "org.bidon.dtexchange.DTExchangeAdapter");
    public static final DefaultAdapters GoogleAdManagerAdapter = new DefaultAdapters("GoogleAdManagerAdapter", 7, "org.bidon.gam.GamAdapter");
    public static final DefaultAdapters InmobiAdapter = new DefaultAdapters("InmobiAdapter", 8, "org.bidon.inmobi.InmobiAdapter");
    public static final DefaultAdapters IronSourceAdapter = new DefaultAdapters("IronSourceAdapter", 9, "org.bidon.ironsource.IronSourceAdapter");
    public static final DefaultAdapters MetaAdapter = new DefaultAdapters("MetaAdapter", 10, "org.bidon.meta.MetaAudienceAdapter");
    public static final DefaultAdapters MintegralAdapter = new DefaultAdapters("MintegralAdapter", 11, "org.bidon.mintegral.MintegralAdapter");
    public static final DefaultAdapters MobilefuseAdapter = new DefaultAdapters("MobilefuseAdapter", 12, "org.bidon.mobilefuse.MobileFuseAdapter");
    public static final DefaultAdapters MolocoAdapter = new DefaultAdapters("MolocoAdapter", 13, "org.bidon.moloco.MolocoAdapter");
    public static final DefaultAdapters TaurusXAdapter = new DefaultAdapters("TaurusXAdapter", 14, "org.bidon.taurusx.TaurusXAdapter");
    public static final DefaultAdapters StartIoAdapter = new DefaultAdapters("StartIoAdapter", 15, "org.bidon.startio.StartIoAdapter");
    public static final DefaultAdapters UnityAdsAdapter = new DefaultAdapters("UnityAdsAdapter", 16, "org.bidon.unityads.UnityAdsAdapter");
    public static final DefaultAdapters VkAdsAdapter = new DefaultAdapters("VkAdsAdapter", 17, "org.bidon.vkads.VkAdsAdapter");
    public static final DefaultAdapters VungleAdapter = new DefaultAdapters("VungleAdapter", 18, "org.bidon.vungle.VungleAdapter");
    public static final DefaultAdapters YandexAdapter = new DefaultAdapters("YandexAdapter", 19, "org.bidon.yandex.YandexAdapter");

    private static final /* synthetic */ DefaultAdapters[] $values() {
        return new DefaultAdapters[]{AdmobAdapter, AmazonAdapter, ApplovinAdapter, BidmachineAdapter, BigoAdsAdapter, Chartboost, DTExchangeAdapter, GoogleAdManagerAdapter, InmobiAdapter, IronSourceAdapter, MetaAdapter, MintegralAdapter, MobilefuseAdapter, MolocoAdapter, TaurusXAdapter, StartIoAdapter, UnityAdsAdapter, VkAdsAdapter, VungleAdapter, YandexAdapter};
    }

    static {
        DefaultAdapters[] defaultAdaptersArr$values = $values();
        $VALUES = defaultAdaptersArr$values;
        $ENTRIES = a.a(defaultAdaptersArr$values);
    }

    private DefaultAdapters(String str, int i10, String str2) {
        this.classPath = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DefaultAdapters valueOf(String str) {
        return (DefaultAdapters) Enum.valueOf(DefaultAdapters.class, str);
    }

    public static DefaultAdapters[] values() {
        return (DefaultAdapters[]) $VALUES.clone();
    }

    @NotNull
    public final String getClassPath() {
        return this.classPath;
    }
}
