package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class H {
    public static final int a(String str, String str2, AdConfig adConfig) {
        return Intrinsics.areEqual("video", str) ? Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed() : Intrinsics.areEqual("audio", str) ? Intrinsics.areEqual("audio", str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed() : Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(String str, String str2, AdConfig adConfig) {
        return Intrinsics.areEqual("video", str) ? Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed() : Intrinsics.areEqual("audio", str) ? Intrinsics.areEqual("audio", str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed() : Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }

    public static final int a(String str) {
        if (StringsKt.a0(str, "track_", false, 2, null)) {
            str = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
