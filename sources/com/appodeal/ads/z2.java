package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedNativeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z2 implements UnifiedNativeParams {
    @Override // com.appodeal.ads.unified.UnifiedNativeParams
    public final NativeMediaViewContentType getNativeMediaContentType() {
        NativeMediaViewContentType mediaViewContent = t1.f14852b;
        Intrinsics.checkNotNullExpressionValue(mediaViewContent, "mediaViewContent");
        return mediaViewContent;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainPlacementId() {
        String strK = t1.a().K();
        Intrinsics.checkNotNullExpressionValue(strK, "obtainLastPlacementId(...)");
        return strK;
    }

    @Override // com.appodeal.ads.unified.UnifiedAdParams
    public final String obtainSegmentId() {
        return String.valueOf(t1.a().L().longValue());
    }
}
