package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.taurusx.tax.f.t;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class InternalGAMAd implements ExpirationHandler.Listener {

    @NonNull
    private final AdsFormat adsFormat;

    @NonNull
    private final ExpirationHandler expirationHandler;

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final GAMUnitData gamUnitData;

    @Nullable
    private volatile Status status = Status.Idle;

    @NonNull
    private final ae.k tag;

    @Nullable
    private WeakReference<InternalGAMAdPresentListener> weakAdPresentListener;

    enum Status {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    InternalGAMAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        this.tag = new ae.k(gAMLoader.getNetworkName() + t.f66040o);
        this.gamLoader = gAMLoader;
        this.adsFormat = adsFormat;
        this.gamUnitData = gAMUnitData;
        this.expirationHandler = new ExpirationHandler(gAMLoader.getExpirationTimeMs(), this);
    }

    public static /* synthetic */ void b(InternalGAMAd internalGAMAd, Context context, InternalLoadListener internalLoadListener) {
        internalGAMAd.getClass();
        try {
            internalGAMAd.setStatus(Status.Loading);
            internalGAMAd.loadAd(context, internalLoadListener);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            internalLoadListener.onAdLoadFailed(internalGAMAd, ae.a.l("Exception loading InternalGAM object", th2));
        }
    }

    public static /* synthetic */ void d(InternalGAMAd internalGAMAd) {
        internalGAMAd.getClass();
        try {
            internalGAMAd.destroyAd();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    public void destroy() {
        destroy(isShown());
    }

    @UiThread
    protected abstract void destroyAd() throws Throwable;

    @Nullable
    public InternalGAMAdPresentListener getAdPresentListener() {
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public String getAdUnitId() {
        return getGamUnitData().getAdUnitId();
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public GAMLoader getGamLoader() {
        return this.gamLoader;
    }

    @NonNull
    public GAMUnitData getGamUnitData() {
        return this.gamUnitData;
    }

    public float getScope() {
        return getGamUnitData().getScore();
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
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.n
            @Override // ce.b
            public final Object get() {
                return String.format("load (%s)", this.f79230a.gamUnitData);
            }
        });
        final Context applicationContext = context.getApplicationContext();
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam.o
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.b(this.f79231b, applicationContext, internalLoadListener);
            }
        });
    }

    @UiThread
    protected abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    public void onAdLoaded() {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.m
            @Override // ce.b
            public final Object get() {
                return String.format("onAdLoaded (%s)", this.f79229a.gamUnitData);
            }
        });
        setStatus(Status.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.j
            @Override // ce.b
            public final Object get() {
                return String.format("onAdShown (%s)", this.f79226a.gamUnitData);
            }
        });
        this.gamLoader.onGAMAdShown(this);
        setStatus(Status.Shown);
        this.expirationHandler.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.k
            @Override // ce.b
            public final Object get() {
                return String.format("onExpired (%s)", this.f79227a.gamUnitData);
            }
        });
        setStatus(Status.Expired);
        InternalGAMAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
        this.gamLoader.load(this.adsFormat);
    }

    final void release() {
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.gam.p
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.d(this.f79234b);
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalGAMAdPresentListener internalGAMAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalGAMAdPresentListener);
    }

    void setStatus(@NonNull Status status) {
        this.status = status;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + getGamUnitData();
    }

    private void destroy(boolean z10) {
        io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.l
            @Override // ce.b
            public final Object get() {
                return String.format("destroy (%s)", this.f79228a.gamUnitData);
            }
        });
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            weakReference.clear();
            this.weakAdPresentListener = null;
        }
        this.expirationHandler.stop();
        this.gamLoader.onGAMAdDestroy(this, z10);
    }
}
