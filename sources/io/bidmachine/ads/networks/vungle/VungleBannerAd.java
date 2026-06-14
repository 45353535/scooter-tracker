package io.bidmachine.ads.networks.vungle;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.h;
import od.e;
import od.f;
import od.g;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class VungleBannerAd extends e {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private BannerAd bannerAd;

    @Nullable
    private Listener listener;

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.vungle.VungleBannerAd$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$banner$BannerSize;

        static {
            int[] iArr = new int[u8.e.values().length];
            $SwitchMap$io$bidmachine$banner$BannerSize = iArr;
            try {
                iArr[u8.e.Size_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$banner$BannerSize[u8.e.Size_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Listener extends VungleBaseAdListener<f> implements BannerAdListener {
        Listener(@NonNull f fVar) {
            super(fVar);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(@NonNull BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(@NonNull BaseAd baseAd) {
            if (baseAd instanceof BannerAd) {
                getCallback().onAdLoaded(((BannerAd) baseAd).getBannerView());
            } else {
                getCallback().onAdLoadFailed(ae.a.i("Vungle return empty VungleBanner"));
            }
        }
    }

    VungleBannerAd() {
    }

    public static /* synthetic */ void a(VungleBannerAd vungleBannerAd) {
        vungleBannerAd.getClass();
        try {
            vungleBannerAd.listener = null;
            BannerAd bannerAd = vungleBannerAd.bannerAd;
            if (bannerAd != null) {
                bannerAd.setAdListener(null);
                vungleBannerAd.bannerAd.finishAd();
                vungleBannerAd.bannerAd = null;
            }
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    public static /* synthetic */ void b(VungleBannerAd vungleBannerAd, f fVar, Context context, VungleParams vungleParams, VungleAdSize vungleAdSize) {
        vungleBannerAd.getClass();
        try {
            vungleBannerAd.listener = new Listener(fVar);
            BannerAd bannerAd = new BannerAd(context, vungleParams.placementId, vungleAdSize);
            vungleBannerAd.bannerAd = bannerAd;
            bannerAd.setAdListener(vungleBannerAd.listener);
            vungleBannerAd.bannerAd.load(vungleParams.markup);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            fVar.onAdLoadFailed(ae.a.l("Exception loading Vungle banner object", th2));
        }
    }

    @Override // od.b
    public void onDestroy() {
        h.U(new Runnable() { // from class: io.bidmachine.ads.networks.vungle.a
            @Override // java.lang.Runnable
            public final void run() {
                VungleBannerAd.a(this.f79437b);
            }
        });
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull final f fVar, @NonNull g gVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        final VungleParams vungleParams = new VungleParams(kVar);
        if (vungleParams.isValid(fVar)) {
            fVar.setVisibilitySource(io.bidmachine.core.k.BidMachine);
            int i10 = AnonymousClass1.$SwitchMap$io$bidmachine$banner$BannerSize[gVar.getAdRequestParameters().b().ordinal()];
            final VungleAdSize vungleAdSize = i10 != 1 ? i10 != 2 ? VungleAdSize.BANNER : VungleAdSize.BANNER_LEADERBOARD : VungleAdSize.MREC;
            final Context applicationContext = contextProvider.getApplicationContext();
            h.U(new Runnable() { // from class: io.bidmachine.ads.networks.vungle.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleBannerAd.b(this.f79438b, fVar, applicationContext, vungleParams, vungleAdSize);
                }
            });
        }
    }
}
