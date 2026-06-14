package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdType;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "CONTENT", "APP_INSTALL", "MEDIA", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class NativeAdType {
    public static final NativeAdType APP_INSTALL;
    public static final NativeAdType CONTENT;
    public static final NativeAdType MEDIA;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ NativeAdType[] f68282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f68283d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        NativeAdType nativeAdType = new NativeAdType(0, "CONTENT", "content");
        CONTENT = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType(1, "APP_INSTALL", "app");
        APP_INSTALL = nativeAdType2;
        NativeAdType nativeAdType3 = new NativeAdType(2, "MEDIA", "media");
        MEDIA = nativeAdType3;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2, nativeAdType3};
        f68282c = nativeAdTypeArr;
        f68283d = qf.a.a(nativeAdTypeArr);
    }

    private NativeAdType(int i10, String str, String str2) {
        this.value = str2;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) f68282c.clone();
    }
}
