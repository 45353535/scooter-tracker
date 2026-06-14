package sg.bigo.ads.ad.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InnerBannerAd;

/* JADX INFO: loaded from: classes4.dex */
public class BigoAdView extends sg.bigo.ads.api.a<sg.bigo.ads.core.adview.d> implements Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BannerAd f100248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdLoadListener<BigoAdView> f100249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup.LayoutParams f100250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdLoadListener<BannerAd> f100251d;

    public BigoAdView(@NonNull Context context) {
        super(context);
        this.f100251d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f100248a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.Ad
    public void destroy() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.getExtraInfo(str);
        }
        return null;
    }

    public int getHeightInDP() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.getHeight();
        }
        return 0;
    }

    public int getWidthInDP() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.isExpired();
        }
        return false;
    }

    public void loadAd(BannerAdRequest bannerAdRequest) {
        new BannerAdLoader.Builder().withAdLoadListener(this.f100251d).build().loadAd(bannerAdRequest);
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(adInteractionListener);
        }
    }

    public void setAdLoadListener(AdLoadListener<BigoAdView> adLoadListener) {
        this.f100249b = adLoadListener;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f100250c = layoutParams;
        a(false);
        super.setLayoutParams(layoutParams);
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100251d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f100248a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onError(adError);
                }
            }
        };
    }

    @Override // java.lang.Comparable
    public int compareTo(Ad ad2) {
        BannerAd bannerAd = this.f100248a;
        if (bannerAd != null) {
            return bannerAd.compareTo(ad2);
        }
        return 0;
    }

    public void loadAd(BannerAdRequest bannerAdRequest, String str) {
        new BannerAdLoader.Builder().withAdLoadListener(this.f100251d).withExt(str).build().loadAd(bannerAdRequest);
    }

    public BigoAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f100251d = new AdLoadListener<BannerAd>() { // from class: sg.bigo.ads.ad.banner.BigoAdView.1
            @Override // sg.bigo.ads.api.AdLoadListener
            public final /* synthetic */ void onAdLoaded(@NonNull Ad ad2) {
                BigoAdView.this.f100248a = (BannerAd) ad2;
                BigoAdView.this.a(true);
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onAdLoaded(BigoAdView.this);
                }
            }

            @Override // sg.bigo.ads.api.AdLoadListener
            public final void onError(@NonNull AdError adError) {
                if (BigoAdView.this.f100249b != null) {
                    BigoAdView.this.f100249b.onError(adError);
                }
            }
        };
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        BannerAd bannerAd = this.f100248a;
        if (!(bannerAd instanceof InnerBannerAd) || bannerAd.adView() == null) {
            return;
        }
        View viewAdView = this.f100248a.adView();
        int iA = sg.bigo.ads.common.utils.e.a(getContext(), this.f100248a.getWidth());
        int iA2 = sg.bigo.ads.common.utils.e.a(getContext(), this.f100248a.getHeight());
        BannerAd bannerAd2 = this.f100248a;
        if ((bannerAd2 instanceof i) && (((i) bannerAd2).f100319y instanceof e) && (layoutParams = this.f100250c) != null) {
            int i10 = -2 == layoutParams.width ? iA : 1;
            int i11 = -2 == layoutParams.height ? iA2 : 1;
            if (i10 != 1 || 1 == bannerAd2.getWidth()) {
                iA = i10;
            } else {
                int i12 = this.f100250c.width;
                if (-1 == i12 || i12 > 1) {
                    iA = i12;
                }
            }
            if (i11 != 1 || 1 == this.f100248a.getHeight()) {
                iA2 = i11;
            } else {
                int i13 = this.f100250c.height;
                if (-1 == i13 || i13 > 1) {
                    iA2 = i13;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams2 = viewAdView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iA, iA2);
        } else {
            layoutParams2.width = iA;
            layoutParams2.height = iA2;
        }
        if (((InnerBannerAd) this.f100248a).getWebView() != null) {
            ViewGroup.LayoutParams layoutParams3 = ((InnerBannerAd) this.f100248a).getWebView().getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new FrameLayout.LayoutParams(iA, iA2);
            } else {
                layoutParams3.width = iA;
                layoutParams3.height = iA2;
            }
            ((InnerBannerAd) this.f100248a).getWebView().setLayoutParams(layoutParams3);
        }
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        viewAdView.setLayoutParams(layoutParams2);
        if (z10) {
            removeAllViews();
            addView(viewAdView);
        }
    }
}
