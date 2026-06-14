package net.pubnative.lite.sdk.request;

import android.graphics.Bitmap;
import android.text.TextUtils;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.NativeAd;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNBitmapDownloader;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidNativeAdRequest implements RequestManager.RequestListener {
    private static final String TAG = "HyBidNativeAdRequest";
    private PNBitmapDownloader mBitmapDownloader;
    private RequestListener mListener;
    private boolean mPreLoadMediaAssets;
    private final RequestManager mRequestManager;
    private String mScreenIabCategory;
    private String mScreenKeywords;
    private SignalDataProcessor mSignalDataProcessor;
    private String mUserIntent;

    public interface RequestListener {
        void onRequestFail(Throwable th2);

        void onRequestSuccess(NativeAd nativeAd);
    }

    public HyBidNativeAdRequest() {
        NativeRequestManager nativeRequestManager = new NativeRequestManager();
        this.mRequestManager = nativeRequestManager;
        nativeRequestManager.setIntegrationType(IntegrationType.STANDALONE);
        nativeRequestManager.setRequestListener(this);
        this.mBitmapDownloader = new PNBitmapDownloader();
        this.mPreLoadMediaAssets = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createNativeAd(Ad ad2) {
        NativeAd nativeAd = new NativeAd(ad2);
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.sendAdSessionDataToAtom(ad2, Double.valueOf(1.0d));
        }
        if (this.mPreLoadMediaAssets) {
            fetchBanner(nativeAd);
            return;
        }
        RequestListener requestListener = this.mListener;
        if (requestListener != null) {
            requestListener.onRequestSuccess(nativeAd);
        }
    }

    private void fetchBanner(final NativeAd nativeAd) {
        if (TextUtils.isEmpty(nativeAd.getBannerUrl())) {
            fetchIcon(nativeAd);
        } else {
            this.mBitmapDownloader.download(nativeAd.getBannerUrl(), new PNBitmapDownloader.DownloadListener() { // from class: net.pubnative.lite.sdk.request.HyBidNativeAdRequest.2
                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFailed(String str, Exception exc) {
                    HyBid.reportException(exc);
                    HyBidNativeAdRequest.this.fetchIcon(nativeAd);
                }

                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFinish(String str, Bitmap bitmap) {
                    if (bitmap != null) {
                        nativeAd.setBannerBitmap(bitmap);
                    }
                    HyBidNativeAdRequest.this.fetchIcon(nativeAd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchIcon(final NativeAd nativeAd) {
        if (!TextUtils.isEmpty(nativeAd.getIconUrl())) {
            this.mBitmapDownloader.download(nativeAd.getIconUrl(), new PNBitmapDownloader.DownloadListener() { // from class: net.pubnative.lite.sdk.request.HyBidNativeAdRequest.3
                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFailed(String str, Exception exc) {
                    HyBid.reportException(exc);
                    RequestListener requestListener = HyBidNativeAdRequest.this.mListener;
                    if (requestListener != null) {
                        requestListener.onRequestSuccess(nativeAd);
                    }
                }

                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFinish(String str, Bitmap bitmap) {
                    if (bitmap != null) {
                        nativeAd.setIconBitmap(bitmap);
                    }
                    RequestListener requestListener = HyBidNativeAdRequest.this.mListener;
                    if (requestListener != null) {
                        requestListener.onRequestSuccess(nativeAd);
                    }
                }
            });
            return;
        }
        RequestListener requestListener = this.mListener;
        if (requestListener != null) {
            requestListener.onRequestSuccess(nativeAd);
        }
    }

    public void load(String str, RequestListener requestListener) {
        load(null, str, requestListener);
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th2) {
        if (th2 instanceof HyBidError) {
            if (((HyBidError) th2).getErrorCode() == HyBidErrorCode.NO_FILL) {
                Logger.w(TAG, th2.getMessage());
            } else {
                Logger.e(TAG, th2.getMessage());
            }
        }
        RequestListener requestListener = this.mListener;
        if (requestListener != null) {
            requestListener.onRequestFail(th2);
        }
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad2) {
        createNativeAd(ad2);
    }

    public void prepareAd(String str, RequestListener requestListener) {
        if (TextUtils.isEmpty(str)) {
            if (requestListener != null) {
                requestListener.onRequestFail(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
            }
        } else {
            this.mListener = requestListener;
            SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
            this.mSignalDataProcessor = signalDataProcessor;
            signalDataProcessor.processSignalData(str, new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.request.HyBidNativeAdRequest.1
                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onError(Throwable th2) {
                    RequestListener requestListener2 = HyBidNativeAdRequest.this.mListener;
                    if (requestListener2 != null) {
                        requestListener2.onRequestFail(th2);
                    }
                }

                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onProcessed(Ad ad2) {
                    if (ad2 != null) {
                        HyBidNativeAdRequest.this.createNativeAd(ad2);
                        return;
                    }
                    RequestListener requestListener2 = HyBidNativeAdRequest.this.mListener;
                    if (requestListener2 != null) {
                        requestListener2.onRequestFail(new HyBidError(HyBidErrorCode.NULL_AD));
                    }
                }
            });
        }
    }

    public void setMediation(boolean z10) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setIntegrationType(z10 ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
    }

    public void setPreLoadMediaAssets(boolean z10) {
        this.mPreLoadMediaAssets = z10;
    }

    public void setScreenIabCategory(String str) {
        this.mScreenIabCategory = str;
    }

    public void setScreenKeywords(String str) {
        this.mScreenKeywords = str;
    }

    public void setUserIntent(String str) {
        this.mUserIntent = str;
    }

    public void load(String str, String str2, RequestListener requestListener) {
        this.mListener = requestListener;
        if (!TextUtils.isEmpty(str)) {
            this.mRequestManager.setAppToken(str);
        }
        this.mRequestManager.setZoneId(str2);
        this.mRequestManager.requestAd();
    }

    public void prepareAd(Ad ad2, RequestListener requestListener) {
        if (ad2 != null) {
            this.mListener = requestListener;
            createNativeAd(ad2);
        } else if (requestListener != null) {
            requestListener.onRequestFail(new HyBidError(HyBidErrorCode.NULL_AD));
        }
    }
}
