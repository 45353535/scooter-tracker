package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final IScarAdFormatProvider scarAdFormatProvider;
    private final AtomicReference<BiddingSignals> signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    protected BiddingBaseManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(null, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public static /* synthetic */ void a(BiddingBaseManager biddingBaseManager, BiddingSignals biddingSignals) {
        biddingBaseManager.getClass();
        try {
            biddingBaseManager._scarRequestHandler.makeUploadRequest(biddingBaseManager.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            biddingBaseManager.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(biddingBaseManager._isAsyncTokenCall));
        } catch (Exception e10) {
            biddingBaseManager.getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(biddingBaseManager._isAsyncTokenCall, e10.getLocalizedMessage()));
        }
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    public static /* synthetic */ void c(BiddingBaseManager biddingBaseManager) {
        biddingBaseManager.getClass();
        GMA.getInstance().getSCARBiddingSignals(biddingBaseManager.scarAdFormatProvider.buildAdFormatList(), new IBiddingSignalsListener() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1
            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(String str) {
                BiddingBaseManager.this.sendFetchResult(str);
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(BiddingSignals biddingSignals) {
                BiddingBaseManager.this.onSignalsReady(biddingSignals);
                BiddingBaseManager.this.sendFetchResult("");
            }
        });
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.b
            @Override // java.lang.Runnable
            public final void run() {
                BiddingBaseManager.c(this.f67959b);
            }
        }).start();
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getFormattedToken(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String tokenIdentifier = getTokenIdentifier();
        return (tokenIdentifier == null || tokenIdentifier.isEmpty()) ? str : String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, tokenIdentifier, str);
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(final String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67960b.unityAdsTokenListener.onUnityAdsTokenReady(str);
                }
            });
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != "") {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        final BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals == null || biddingSignals.isEmpty()) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        } else {
            new Thread(new Runnable() { // from class: com.unity3d.services.ads.gmascar.managers.a
                @Override // java.lang.Runnable
                public final void run() {
                    BiddingBaseManager.a(this.f67957b, biddingSignals);
                }
            }).start();
        }
    }

    protected BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(iScarAdFormatProvider, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    protected BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference<>();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
        this.scarAdFormatProvider = iScarAdFormatProvider;
    }
}
