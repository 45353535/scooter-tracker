package com.appodeal.ads.adapters.bidmachine.native_ad;

import ac.p;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.NativeMediaViewContentType;
import com.appodeal.ads.adapters.bidmachine.i;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import io.bidmachine.MediaAssetType;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f12102a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedNativeParams adTypeParams = (UnifiedNativeParams) unifiedAdParams;
        i adUnitParams2 = (i) adUnitParams;
        UnifiedNativeCallback callback = (UnifiedNativeCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        if (NativeMediaViewContentType.Video == adTypeParams.getNativeMediaContentType()) {
            arrayList.add(MediaAssetType.Video);
        } else {
            arrayList.add(MediaAssetType.Image);
        }
        arrayList.add(MediaAssetType.Icon);
        p.b request = new p.b();
        adUnitParams2.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        request.setPriceFloorParams(adUnitParams2.f12091a);
        request.setNetworks(adUnitParams2.f12093c);
        request.setCustomParams(adUnitParams2.f12092b);
        MediaAssetType[] mediaAssetTypeArr = (MediaAssetType[]) arrayList.toArray(new MediaAssetType[0]);
        this.f12102a = (p) request.c((MediaAssetType[]) Arrays.copyOf(mediaAssetTypeArr, mediaAssetTypeArr.length)).build();
        ((ac.b) new ac.b(contextProvider.getApplicationContext()).setListener(new a(callback))).load(this.f12102a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        p pVar = this.f12102a;
        if (pVar != null) {
            pVar.notifyMediationLoss(str, Double.valueOf(d10));
        }
        p pVar2 = this.f12102a;
        if (pVar2 != null) {
            pVar2.destroy();
        }
        this.f12102a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        p pVar = this.f12102a;
        if (pVar != null) {
            pVar.notifyMediationWin();
        }
    }
}
