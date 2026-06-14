package com.appodeal.ads.adapters.mytarget.mrec;

import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.my.target.ads.MyTargetView;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MyTargetView f12547a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        com.appodeal.ads.adapters.mytarget.a aVar = (com.appodeal.ads.adapters.mytarget.a) adUnitParams;
        MyTargetView myTargetView = new MyTargetView(contextProvider.getApplicationContext());
        this.f12547a = myTargetView;
        myTargetView.setSlotId(aVar.f12540a);
        this.f12547a.setAdSize(MyTargetView.AdSize.ADSIZE_300x250);
        this.f12547a.setRefreshAd(false);
        aVar.a(this.f12547a.getCustomParams());
        this.f12547a.setListener(new b((UnifiedMrecCallback) unifiedAdCallback));
        this.f12547a.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        MyTargetView myTargetView = this.f12547a;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.f12547a = null;
        }
    }
}
