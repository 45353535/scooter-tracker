package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.protobuf.Waterfall;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalAd implements InternalAdData, ExpirationHandler.Listener {

    @NonNull
    private final Waterfall.Configuration.AdUnit adUnit;

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final InternalAdListener internalAdListener;

    @Nullable
    private InternalAdLoadData internalAdLoadData;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @Nullable
    private WeakReference<InternalAdPresentListener> weakAdPresentListener;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final Map<String, Object> customParamsMap = new ConcurrentHashMap();

    enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    InternalAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        this.tag = new ae.k(networkParams.getNetworkName() + com.taurusx.tax.f.t.f66040o);
        this.taskExecutor = taskExecutor;
        this.adsFormat = adsFormat;
        this.adUnit = adUnit;
        this.internalAdListener = internalAdListener;
        this.expirationHandler = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    public static /* synthetic */ void a(InternalAd internalAd) {
        internalAd.getClass();
        try {
            internalAd.destroyAd();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    public static /* synthetic */ void e(InternalAd internalAd, Context context, InternalLoadListener internalLoadListener) {
        internalAd.getClass();
        try {
            internalAd.setStatus(Status.Loading);
            internalAd.loadAd(context, internalLoadListener);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            internalLoadListener.onAdLoadFailed(internalAd, ae.a.l("Exception loading InternalAd object", th2));
        }
    }

    public void destroy() {
        destroy(isShown());
    }

    @UiThread
    protected abstract void destroyAd() throws Throwable;

    @Nullable
    public InternalAdPresentListener getAdPresentListener() {
        WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public Waterfall.Configuration.AdUnit getAdUnit() {
        return this.adUnit;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public String getAdUnitId() {
        return getAdUnit().getAdUnitId();
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public Map<String, Object> getCustomParamsMap() {
        return this.customParamsMap;
    }

    @Nullable
    public InternalAdLoadData getInternalAdLoadData() {
        return this.internalAdLoadData;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    public double getPrice() {
        return getAdUnit().getPrice();
    }

    boolean isExpired() {
        return this.status == Status.Expired;
    }

    boolean isLoaded() {
        return this.status == Status.Loaded;
    }

    boolean isShown() {
        Status status = this.status;
        return status != null && status.ordinal() >= Status.Shown.ordinal();
    }

    final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.m
            @Override // ce.b
            public final Object get() {
                return String.format("load (%s)", GAMUtils.toString(this.f79303a.adUnit));
            }
        });
        final Context applicationContext = context.getApplicationContext();
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.n
            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.e(this.f79304b, applicationContext, internalLoadListener);
            }
        });
    }

    @UiThread
    protected abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    public void onAdLoaded(@Nullable InternalAdLoadData internalAdLoadData) {
        this.internalAdLoadData = internalAdLoadData;
        final Waterfall.Result.EstimatedPrice price = internalAdLoadData != null ? internalAdLoadData.getPrice() : null;
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.l
            @Override // ce.b
            public final Object get() {
                return String.format("onAdLoaded (%s, %s)", GAMUtils.toString(this.f79301a.adUnit), GAMUtils.toString(price));
            }
        });
        String strD = ae.f.d(price);
        if (strD != null) {
            setCustomParam("gam_estimated_price", strD);
        }
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.q
            @Override // ce.b
            public final Object get() {
                return String.format("onAdShown (%s)", GAMUtils.toString(this.f79309a.adUnit));
            }
        });
        this.internalAdListener.onAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    protected void onBackground(@NonNull Runnable runnable) {
        this.taskExecutor.execute(runnable);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.o
            @Override // ce.b
            public final Object get() {
                return String.format("onExpired (%s)", GAMUtils.toString(this.f79307a.adUnit));
            }
        });
        this.internalAdListener.onAdExpired(this);
        setStatus(Status.Expired);
        InternalAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
    }

    public void onPaidEvent(@NonNull final Waterfall.Result.EstimatedPrice estimatedPrice) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.k
            @Override // ce.b
            public final Object get() {
                return String.format("onPaidEvent (%s, %s)", GAMUtils.toString(this.f79299a.adUnit), GAMUtils.toString(estimatedPrice));
            }
        });
        String strD = ae.f.d(estimatedPrice);
        if (strD != null) {
            setCustomParam("gam_estimated_price", strD);
        }
        this.internalAdListener.onPaidEvent(this);
    }

    @VisibleForTesting
    void release() {
        this.expirationHandler.stop();
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.j
            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.a(this.f79298b);
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalAdPresentListener internalAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalAdPresentListener);
    }

    public void setCustomParam(@NonNull String str, @NonNull Object obj) {
        this.customParamsMap.put(str, obj);
    }

    void setStatus(@NonNull Status status) {
        this.status = status;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + GAMUtils.toString(this.adUnit);
    }

    @VisibleForTesting
    void destroy(boolean z10) {
        try {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.p
                @Override // ce.b
                public final Object get() {
                    return String.format("destroy (%s)", GAMUtils.toString(this.f79308a.adUnit));
                }
            });
            WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.weakAdPresentListener = null;
            if (z10) {
                release();
            }
            this.internalAdListener.onAdDestroyed(this, z10);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }
}
