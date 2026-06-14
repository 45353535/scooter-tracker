package io.bidmachine.ads.networks.adaptiverendering.measurer;

import ae.k;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Df;
import hd.f;
import id.a0;
import io.bidmachine.core.a;
import io.bidmachine.core.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public abstract class OMMeasurer<AdView extends View> implements f {

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @Nullable
    protected MediaEvents mediaEvents;

    @NonNull
    private final k tag = new k("OMMeasurer");

    @NonNull
    private final AtomicBoolean isLoadedTracked = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isShownTracked = new AtomicBoolean(false);

    @Override // hd.f
    public void destroy(@Nullable final Runnable runnable) {
        final Handler handlerL = h.l();
        h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    OMMeasurer oMMeasurer = OMMeasurer.this;
                    oMMeasurer.mediaEvents = null;
                    oMMeasurer.adEvents = null;
                    if (OMMeasurer.this.adSession != null) {
                        OMMeasurer.this.adSession.finish();
                    }
                    OMMeasurer.this.log("destroy");
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        handlerL.postDelayed(runnable2, OMMeasurer.this.getDestroyDelayMs());
                    }
                } catch (Throwable th2) {
                    a.p(th2);
                }
            }
        });
    }

    protected long getDestroyDelayMs() {
        return 0L;
    }

    protected boolean isSessionPrepared() {
        return this.adSession != null;
    }

    protected void log(@NonNull String str) {
        a.c(this.tag, str);
    }

    @UiThread
    protected abstract void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable;

    @Override // hd.f
    public void onClicked() {
        h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MediaEvents mediaEvents = OMMeasurer.this.mediaEvents;
                    if (mediaEvents != null) {
                        mediaEvents.adUserInteraction(InteractionType.CLICK);
                        OMMeasurer.this.log(Df.f40645f);
                    }
                } catch (Throwable th2) {
                    a.p(th2);
                }
            }
        });
    }

    @Override // hd.f
    public void onError(@NonNull a0 a0Var) {
        trackError(a0Var.b());
    }

    @Override // hd.f
    public void onShown() {
        if (this.isShownTracked.compareAndSet(false, true)) {
            h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                            return;
                        }
                        OMMeasurer.this.adEvents.impressionOccurred();
                        OMMeasurer.this.log("onAdShown");
                    } catch (Throwable th2) {
                        a.p(th2);
                    }
                }
            });
        }
    }

    @Override // hd.f
    public void onViewAddedToContainer(@NonNull AdView adview, @NonNull ViewGroup viewGroup) {
    }

    @Override // hd.f
    public void onViewCreated(@NonNull AdView adview) {
    }

    @Override // hd.f
    public void onViewReady(@NonNull AdView adview) {
    }

    @UiThread
    protected void prepareAdSession(@NonNull AdSessionConfiguration adSessionConfiguration, @NonNull AdSessionContext adSessionContext) {
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.adSession = adSessionCreateAdSession;
            this.adEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.mediaEvents = MediaEvents.createMediaEvents(this.adSession);
            }
            this.adSession.start();
            log("prepareAdSession");
        } catch (Throwable th2) {
            a.p(th2);
        }
    }

    protected void registerView(@NonNull final View view) {
        h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (OMMeasurer.this.adSession != null) {
                        OMMeasurer.this.adSession.registerAdView(view);
                        OMMeasurer.this.log("registerView");
                    }
                } catch (Throwable th2) {
                    a.p(th2);
                }
            }
        });
    }

    public void trackError(@NonNull String str) {
        trackError(ErrorType.GENERIC, str);
    }

    protected void trackLoaded() {
        if (this.isLoadedTracked.compareAndSet(false, true)) {
            h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                            return;
                        }
                        OMMeasurer oMMeasurer = OMMeasurer.this;
                        oMMeasurer.onAdLoaded(oMMeasurer.adEvents);
                        OMMeasurer.this.log("onAdLoaded");
                    } catch (Throwable th2) {
                        a.p(th2);
                    }
                }
            });
        }
    }

    public void trackVideoError(@NonNull String str) {
        trackError(ErrorType.VIDEO, str);
    }

    private void trackError(@NonNull final ErrorType errorType, @NonNull final String str) {
        h.U(new Runnable() { // from class: io.bidmachine.ads.networks.adaptiverendering.measurer.OMMeasurer.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (OMMeasurer.this.adSession != null) {
                        OMMeasurer.this.adSession.error(errorType, str);
                        OMMeasurer.this.log("error");
                    }
                } catch (Throwable th2) {
                    a.p(th2);
                }
            }
        });
    }
}
