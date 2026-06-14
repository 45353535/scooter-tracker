package com.appodeal.ads;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/NativeMediaViewContentType;", "", "", "a", "Ljava/lang/String;", "getContentName", "()Ljava/lang/String;", "contentName", "Auto", "NoVideo", "Video", "public_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeMediaViewContentType {
    private static final /* synthetic */ NativeMediaViewContentType[] $VALUES;
    public static final NativeMediaViewContentType Auto;
    public static final NativeMediaViewContentType NoVideo;
    public static final NativeMediaViewContentType Video;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f11833b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String contentName;

    static {
        NativeMediaViewContentType nativeMediaViewContentType = new NativeMediaViewContentType("Auto", 0, "auto");
        Auto = nativeMediaViewContentType;
        NativeMediaViewContentType nativeMediaViewContentType2 = new NativeMediaViewContentType("NoVideo", 1, "static");
        NoVideo = nativeMediaViewContentType2;
        NativeMediaViewContentType nativeMediaViewContentType3 = new NativeMediaViewContentType("Video", 2, "video");
        Video = nativeMediaViewContentType3;
        NativeMediaViewContentType[] nativeMediaViewContentTypeArr = {nativeMediaViewContentType, nativeMediaViewContentType2, nativeMediaViewContentType3};
        $VALUES = nativeMediaViewContentTypeArr;
        f11833b = qf.a.a(nativeMediaViewContentTypeArr);
    }

    public NativeMediaViewContentType(String str, int i10, String str2) {
        this.contentName = str2;
    }

    public static EnumEntries getEntries() {
        return f11833b;
    }

    public static NativeMediaViewContentType valueOf(String str) {
        return (NativeMediaViewContentType) Enum.valueOf(NativeMediaViewContentType.class, str);
    }

    public static NativeMediaViewContentType[] values() {
        return (NativeMediaViewContentType[]) $VALUES.clone();
    }

    public final String getContentName() {
        return this.contentName;
    }
}
