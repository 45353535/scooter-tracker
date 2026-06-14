package io.bidmachine.ads.networks.my_target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class MyTargetBanner extends e {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private MyTargetView adView;

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.my_target.MyTargetBanner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        static {
            int[] iArr = new int[u8.e.values().length];
            $SwitchMap$io$bidmachine$banner$BannerSize = iArr;
            try {
                iArr[u8.e.Size_728x90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$banner$BannerSize[u8.e.Size_300x250.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class Listener implements MyTargetView.MyTargetViewListener {

        @NonNull
        private final f callback;

        Listener(@NonNull f fVar) {
            this.callback = fVar;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(@NonNull MyTargetView myTargetView) {
            this.callback.onAdClicked();
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(@NonNull MyTargetView myTargetView) {
            this.callback.onAdLoaded(myTargetView);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView) {
            this.callback.onAdLoadFailed(MyTargetAdapter.mapError(iAdLoadingError));
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(@NonNull MyTargetView myTargetView) {
            this.callback.onAdShown();
        }
    }

    MyTargetBanner() {
    }

    @Override // od.b
    public void onDestroy() {
        MyTargetView myTargetView = this.adView;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.adView = null;
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MyTargetParams myTargetParams = new MyTargetParams(kVar);
        if (myTargetParams.isValid(fVar)) {
            fVar.setVisibilitySource(io.bidmachine.core.k.BidMachine);
            int i10 = AnonymousClass1.$SwitchMap$io$bidmachine$banner$BannerSize[gVar.getAdRequestParameters().b().ordinal()];
            MyTargetView.AdSize adSize = i10 != 1 ? i10 != 2 ? MyTargetView.AdSize.ADSIZE_320x50 : MyTargetView.AdSize.ADSIZE_300x250 : MyTargetView.AdSize.ADSIZE_728x90;
            MyTargetView myTargetView = new MyTargetView(contextProvider.getContext());
            this.adView = myTargetView;
            myTargetView.setSlotId(myTargetParams.slotId.intValue());
            this.adView.setAdSize(adSize);
            this.adView.setRefreshAd(false);
            this.adView.setListener(new Listener(fVar));
            MyTargetAdapter.updateTargeting(gVar, this.adView.getCustomParams());
            this.adView.loadFromBid(myTargetParams.bidId);
        }
    }
}
