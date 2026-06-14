package com.appodeal.ads.modules.common.internal.adtype;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "", "", "a", "I", "getCode", "()I", "code", "", "b", "Ljava/lang/String;", "getCodeName", "()Ljava/lang/String;", "codeName", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getServerCodeName", "serverCodeName", "d", "getDisplayName", "displayName", "Banner", LogConstants.KEY_MREC, "Interstitial", "Rewarded", LogConstants.KEY_NATIVE, "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdType {
    public static final AdType Banner;
    public static final AdType Interstitial;
    public static final AdType Mrec;
    public static final AdType Native;
    public static final AdType Rewarded;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AdType[] f13667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13668f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String codeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String serverCodeName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String displayName;

    static {
        AdType adType = new AdType("Banner", 0, 3164, "banner", Constants.BANNER, "Banner");
        Banner = adType;
        AdType adType2 = new AdType(LogConstants.KEY_MREC, 1, 256, "mrec", Constants.MREC, LogConstants.KEY_MREC);
        Mrec = adType2;
        AdType adType3 = new AdType("Interstitial", 2, 3, "interstitial", "banner", "Interstitial");
        Interstitial = adType3;
        AdType adType4 = new AdType("Rewarded", 3, 128, Constants.REWARDED_VIDEO, Constants.REWARDED_VIDEO, LogConstants.KEY_REWARDED_VIDEO);
        Rewarded = adType4;
        AdType adType5 = new AdType(LogConstants.KEY_NATIVE, 4, 512, "native", "native", LogConstants.KEY_NATIVE);
        Native = adType5;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5};
        f13667e = adTypeArr;
        f13668f = a.a(adTypeArr);
    }

    public AdType(String str, int i10, int i11, String str2, String str3, String str4) {
        this.code = i11;
        this.codeName = str2;
        this.serverCodeName = str3;
        this.displayName = str4;
    }

    public static EnumEntries getEntries() {
        return f13668f;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f13667e.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCodeName() {
        return this.codeName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getServerCodeName() {
        return this.serverCodeName;
    }
}
