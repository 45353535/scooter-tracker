package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import java.util.List;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.api.PNApiClient;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.SignalData;
import net.pubnative.lite.sdk.vpaid.VideoAdCache;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SignalDataProcessor {
    private static final String TAG = "SignalDataProcessor";
    private final AdCache mAdCache;
    private final PNApiClient mApiClient;
    private final DeviceInfo mDeviceInfo;
    private boolean mIsDestroyed;
    private Listener mListener;
    private final VideoAdCache mVideoCache;

    public interface Listener {
        void onError(Throwable th2);

        void onProcessed(Ad ad2);
    }

    public SignalDataProcessor() {
        this(HyBid.getApiClient(), HyBid.getDeviceInfo(), HyBid.getAdCache(), HyBid.getVideoAdCache());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAd(final String str, final Ad ad2) {
        ad2.setZoneId(str);
        this.mAdCache.put(str, ad2);
        AdTopicsAPIManager.setTopicsAPIEnabled(this.mApiClient.getContext(), ad2);
        int i10 = ad2.assetgroupid;
        if (i10 == 4 || i10 == 15) {
            new VideoAdProcessor().process(this.mApiClient.getContext(), ad2.getVast(), null, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.3
                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheError(Throwable th2) {
                    if (SignalDataProcessor.this.mIsDestroyed) {
                        return;
                    }
                    Logger.w(SignalDataProcessor.TAG, th2.getMessage());
                    Listener listener = SignalDataProcessor.this.mListener;
                    if (listener != null) {
                        listener.onError(th2);
                    }
                }

                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheSuccess(AdParams adParams, String str2, EndCardData endCardData, String str3, List<String> list) {
                    if (SignalDataProcessor.this.mIsDestroyed) {
                        return;
                    }
                    ad2.setHasEndCard((adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true);
                    SignalDataProcessor.this.mVideoCache.put(str, new VideoAdCacheItem(adParams, str2, endCardData, str3));
                    Listener listener = SignalDataProcessor.this.mListener;
                    if (listener != null) {
                        listener.onProcessed(ad2);
                    }
                }
            });
            return;
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onProcessed(ad2);
        }
    }

    public void destroy() {
        this.mIsDestroyed = true;
        this.mListener = null;
    }

    public void processSignalData(String str, Listener listener) {
        Listener listener2;
        this.mListener = listener;
        try {
            final SignalData signalData = new SignalData(new JSONObject(str));
            if (TextUtils.isEmpty(signalData.tagid)) {
                Listener listener3 = this.mListener;
                if (listener3 != null) {
                    listener3.onError(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(signalData.admurl)) {
                if (this.mApiClient != null) {
                    DeviceInfo deviceInfo = this.mDeviceInfo;
                    this.mApiClient.getAd(signalData.admurl, deviceInfo != null ? deviceInfo.getUserAgent() : "", new ApiClient.AdRequestListener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.1
                        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                        public void onFailure(Throwable th2) {
                            if (SignalDataProcessor.this.mIsDestroyed) {
                                return;
                            }
                            Logger.w(SignalDataProcessor.TAG, th2.getMessage());
                            Listener listener4 = SignalDataProcessor.this.mListener;
                            if (listener4 != null) {
                                listener4.onError(new Exception(th2));
                            }
                        }

                        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                        public void onSuccess(Ad ad2) {
                            if (SignalDataProcessor.this.mIsDestroyed) {
                                return;
                            }
                            Logger.d(SignalDataProcessor.TAG, "Received ad response for zone id: " + signalData.tagid);
                            SignalDataProcessor.this.processAd(signalData.tagid, ad2);
                        }
                    });
                    return;
                } else {
                    Listener listener4 = this.mListener;
                    if (listener4 != null) {
                        listener4.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
            }
            AdResponse adResponse = signalData.adm;
            if (adResponse == null) {
                Listener listener5 = this.mListener;
                if (listener5 != null) {
                    listener5.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            PNApiClient pNApiClient = this.mApiClient;
            if (pNApiClient != null) {
                pNApiClient.processStream(adResponse, null, new ApiClient.AdRequestListener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.2
                    @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                    public void onFailure(Throwable th2) {
                        if (SignalDataProcessor.this.mIsDestroyed) {
                            return;
                        }
                        Logger.w(SignalDataProcessor.TAG, th2.getMessage());
                        Listener listener6 = SignalDataProcessor.this.mListener;
                        if (listener6 != null) {
                            listener6.onError(new Exception(th2));
                        }
                    }

                    @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                    public void onSuccess(Ad ad2) {
                        if (SignalDataProcessor.this.mIsDestroyed) {
                            return;
                        }
                        Logger.d(SignalDataProcessor.TAG, "Received ad response for zone id: " + signalData.tagid);
                        SignalDataProcessor.this.processAd(signalData.tagid, ad2);
                    }
                });
                return;
            }
            Listener listener6 = this.mListener;
            if (listener6 != null) {
                listener6.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
            }
        } catch (Exception e10) {
            HyBid.reportException(e10);
            Logger.e(TAG, e10.getMessage());
            Listener listener7 = this.mListener;
            if (listener7 != null) {
                listener7.onError(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
            }
        } catch (OutOfMemoryError e11) {
            HyBid.reportException(e11);
            Logger.e(TAG, e11.getMessage());
            Listener listener8 = this.mListener;
            if (listener8 != null) {
                listener8.onError(new HyBidError(HyBidErrorCode.OUT_OF_MEMORY));
            }
        } catch (RuntimeException e12) {
            HyBid.reportException((Exception) e12);
            Logger.e(TAG, e12.getMessage());
            if (!(e12 instanceof AndroidRuntimeException) || (listener2 = this.mListener) == null) {
                return;
            }
            listener2.onError(new HyBidError(HyBidErrorCode.INVALID_VIEW_BINDER));
        }
    }

    SignalDataProcessor(PNApiClient pNApiClient, DeviceInfo deviceInfo, AdCache adCache, VideoAdCache videoAdCache) {
        this.mApiClient = pNApiClient;
        this.mDeviceInfo = deviceInfo;
        this.mAdCache = adCache;
        this.mVideoCache = videoAdCache;
    }
}
