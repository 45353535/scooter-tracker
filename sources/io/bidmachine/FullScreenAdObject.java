package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.FullScreenAdRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, zb.b, od.h, od.i, od.j> {
    private final AtomicBoolean isShowing;
    private final b thresholdTask;

    class a extends b {
        a() {
            super(null);
        }

        @Override // io.bidmachine.FullScreenAdObject.b
        void b() {
            FullScreenAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
        }
    }

    private static abstract class b implements Runnable {
        private b() {
        }

        void a() {
            io.bidmachine.core.h.f(this);
        }

        abstract void b();

        void d(long j10) {
            io.bidmachine.core.h.T(this, j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c extends AdObjectImpl.BaseUnifiedAdCallback implements od.i {
        c(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        @Override // od.i
        public void onAdClosed() {
            this.processCallback.processClosed();
        }

        @Override // od.i
        public void onAdFinished() {
            this.processCallback.processFinished();
        }

        @Override // od.i
        public void onAdLoaded() {
            this.processCallback.processLoadSuccess();
        }
    }

    public FullScreenAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull zb.b bVar, @NonNull od.h hVar) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, hVar);
        this.isShowing = new AtomicBoolean(false);
        this.thresholdTask = new a();
    }

    private void cancelImpressionThresholdTask() {
        this.thresholdTask.a();
    }

    private void startImpressionThresholdTask() {
        this.thresholdTask.d(getParams().e().b());
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onClosed(boolean z10) {
        this.isShowing.set(false);
        super.onClosed(z10);
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onFinished() {
        super.onFinished();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onImpression() {
        super.onImpression();
        cancelImpressionThresholdTask();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onShown() {
        super.onShown();
        startImpressionThresholdTask();
    }

    public void show(@NonNull ContextProvider contextProvider, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        if (this.isShowing.get()) {
            io.bidmachine.core.a.d("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        getUnifiedAd().show(contextProvider, getUnifiedAdCallback(), rendererConfiguration);
        getProcessCallback().processFillAd();
    }

    @Override // io.bidmachine.AdObjectImpl
    @NonNull
    public od.i createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new c(adProcessCallback);
    }
}
