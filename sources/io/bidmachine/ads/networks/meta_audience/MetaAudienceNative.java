package io.bidmachine.ads.networks.meta_audience;

import ac.h;
import ac.n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import dc.s;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import java.util.ArrayList;
import java.util.Set;
import od.k;
import od.l;
import od.m;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceNative extends l {

    @Nullable
    private Listener listener;

    @Nullable
    private NativeAdBase nativeAdBase;

    private static final class BannerAdapter extends BaseAdapter<NativeBannerAd> {
        public BannerAdapter(@NonNull NativeBannerAd nativeBannerAd) {
            super(nativeBannerAd);
        }

        @Override // ac.n
        public void registerNative(@NonNull ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable s sVar, @Nullable Set<View> set) {
            super.registerNative(viewGroup, imageView, sVar, set);
            if (this.nativeAdBase == 0) {
                return;
            }
            ((NativeBannerAd) this.nativeAdBase).registerViewForInteraction(viewGroup, imageView, set != null ? new ArrayList(set) : null);
        }
    }

    private static abstract class BaseAdapter<T extends NativeAdBase> extends n {

        @Nullable
        T nativeAdBase;

        public BaseAdapter(@NonNull T t10) {
            this.nativeAdBase = t10;
            setTitle(t10.getAdvertiserName());
            setDescription(t10.getAdBodyText());
            setCallToAction(t10.getAdCallToAction());
            ImageDataImpl imageDataImpl = new ImageDataImpl(t10.getPreloadedIconViewDrawable());
            NativeAdBase.Image adIcon = t10.getAdIcon();
            if (adIcon != null) {
                imageDataImpl.setRemoteUrl(adIcon.getUrl());
            }
            setIcon(imageDataImpl);
            ImageDataImpl imageDataImpl2 = new ImageDataImpl();
            NativeAdBase.Image adCoverImage = t10.getAdCoverImage();
            if (adCoverImage != null) {
                imageDataImpl2.setRemoteUrl(adCoverImage.getUrl());
            }
            setMainImage(imageDataImpl2);
        }

        @Override // ac.n
        public View createProviderView(@NonNull Context context) {
            if (this.nativeAdBase == null) {
                return null;
            }
            AdOptionsView adOptionsView = new AdOptionsView(context, this.nativeAdBase, null);
            adOptionsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return adOptionsView;
        }

        @Override // ac.n
        public void destroy() {
            T t10 = this.nativeAdBase;
            if (t10 != null) {
                t10.destroy();
                this.nativeAdBase = null;
            }
        }

        @Override // ac.n
        public void unregisterNative() {
            T t10 = this.nativeAdBase;
            if (t10 == null) {
                return;
            }
            t10.unregisterView();
        }
    }

    private static final class Listener extends BaseMetaAudienceListener<m> implements NativeAdListener {

        @Nullable
        private NativeAdBase nativeAdBase;

        Listener(@NonNull m mVar, @NonNull NativeAdBase nativeAdBase) {
            super(mVar);
            this.nativeAdBase = nativeAdBase;
        }

        public void destroy() {
            this.nativeAdBase = null;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            NativeAdBase nativeAdBase = this.nativeAdBase;
            if (nativeAdBase == null || nativeAdBase != ad2) {
                return;
            }
            n bannerAdapter = nativeAdBase instanceof NativeBannerAd ? new BannerAdapter((NativeBannerAd) nativeAdBase) : nativeAdBase instanceof NativeAd ? new MediaViewAdapter((NativeAd) nativeAdBase) : null;
            if (bannerAdapter == null || !bannerAdapter.isValid()) {
                super.onError(ad2, AdError.NO_FILL);
            } else {
                getCallback().a(bannerAdapter);
            }
        }

        @Override // io.bidmachine.ads.networks.meta_audience.BaseMetaAudienceListener, com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            NativeAdBase nativeAdBase = this.nativeAdBase;
            if (nativeAdBase == null || nativeAdBase != ad2) {
                return;
            }
            super.onError(ad2, adError);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
        }
    }

    private static final class MediaViewAdapter extends BaseAdapter<NativeAd> {

        @Nullable
        private MediaView mediaView;

        public MediaViewAdapter(@NonNull NativeAd nativeAd) {
            super(nativeAd);
        }

        @Override // ac.n
        @Nullable
        public View createCustomMediaView(@NonNull Context context) {
            if (this.mediaView == null) {
                this.mediaView = new MediaView(context);
            }
            ae.m.b(this.mediaView);
            return this.mediaView;
        }

        @Override // io.bidmachine.ads.networks.meta_audience.MetaAudienceNative.BaseAdapter, ac.n
        public void destroy() {
            super.destroy();
            MediaView mediaView = this.mediaView;
            if (mediaView != null) {
                mediaView.destroy();
                this.mediaView = null;
            }
        }

        @Override // ac.n, ac.o
        public boolean hasVideo() {
            T t10 = this.nativeAdBase;
            return t10 != 0 && ((NativeAd) t10).getAdCreativeType() == NativeAd.AdCreativeType.VIDEO;
        }

        @Override // ac.n
        public void registerNative(@NonNull ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable s sVar, @Nullable Set<View> set) {
            super.registerNative(viewGroup, imageView, sVar, set);
            if (this.nativeAdBase == 0) {
                return;
            }
            ((NativeAd) this.nativeAdBase).registerViewForInteraction(viewGroup, this.mediaView, imageView, set != null ? new ArrayList(set) : null);
        }
    }

    MetaAudienceNative() {
    }

    @Override // od.b
    public void onDestroy() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.destroy();
            this.listener = null;
        }
        NativeAdBase nativeAdBase = this.nativeAdBase;
        if (nativeAdBase != null) {
            nativeAdBase.destroy();
            this.nativeAdBase = null;
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull m mVar, @NonNull od.n nVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(kVar);
        if (metaAudienceParams.isValid(mVar)) {
            h adRequestParameters = nVar.getAdRequestParameters();
            boolean zA = adRequestParameters.a(MediaAssetType.Video);
            Context applicationContext = contextProvider.getApplicationContext();
            if (adRequestParameters.a(MediaAssetType.All) || adRequestParameters.a(MediaAssetType.Image) || zA) {
                this.nativeAdBase = new NativeAd(applicationContext, metaAudienceParams.placementId);
            } else {
                this.nativeAdBase = new NativeBannerAd(applicationContext, metaAudienceParams.placementId);
            }
            this.listener = new Listener(mVar, this.nativeAdBase);
            NativeAdBase nativeAdBase = this.nativeAdBase;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(this.listener).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withBid(metaAudienceParams.bidPayload).build());
        }
    }
}
