package io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdRequest;
import java.lang.ref.WeakReference;
import od.d;
import od.p;

/* JADX INFO: loaded from: classes12.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends od.p, UnifiedAdRequestParamsType extends od.d> extends AdObjectImpl<AdRequestType, zb.b, UnifiedAdType, od.f, UnifiedAdRequestParamsType> {

    @Nullable
    private View adView;
    private int height;

    @NonNull
    private MeasureMode heightMeasureMode;

    @NonNull
    private final j9.b visibilityTrackerHolder;
    private int width;

    @NonNull
    private MeasureMode widthMeasureMode;

    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        int getSize(@NonNull Context context, int i10) {
            int i11 = b.f79172a[ordinal()];
            return i11 != 1 ? i11 != 2 ? -1 : -2 : Math.round(i10 * io.bidmachine.core.h.A(context));
        }
    }

    class a implements j9.p {
        a() {
        }

        @Override // j9.p
        public boolean a() {
            return ViewAdObject.this.getProcessCallback().processVisibilityTrackerShown();
        }

        @Override // j9.p
        public void b() {
            ViewAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79172a;

        static {
            int[] iArr = new int[MeasureMode.values().length];
            f79172a = iArr;
            try {
                iArr[MeasureMode.Direct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79172a[MeasureMode.Wrap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static final class c extends AdObjectImpl.BaseUnifiedAdCallback implements od.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f79173a;

        c(ViewAdObject viewAdObject, AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            this.f79173a = new WeakReference(viewAdObject);
        }

        @Override // od.f
        public void onAdLoaded(View view) {
            ViewAdObject viewAdObject = (ViewAdObject) this.f79173a.get();
            if (viewAdObject == null) {
                this.processCallback.processLoadFail(ae.a.i("ViewAdObject is null"));
            } else {
                viewAdObject.setAdView(view);
                this.processCallback.processLoadSuccess();
            }
        }
    }

    public ViewAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull zb.b bVar, @NonNull UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
        this.visibilityTrackerHolder = new j9.b();
    }

    private int getHeight() {
        return this.height;
    }

    private int getScaledHeight(@NonNull Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(@NonNull Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    private int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(@Nullable View view) {
        hide();
        this.adView = view;
    }

    @NonNull
    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    @NonNull
    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void hide() {
        super.hide();
        this.visibilityTrackerHolder.c();
        View view = this.adView;
        if (view != null) {
            ae.m.b(view);
        }
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    @Override // io.bidmachine.AdObjectImpl, zb.a
    public void onImpression() {
        super.onImpression();
        this.visibilityTrackerHolder.c();
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setHeightMeasureMode(@NonNull MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public void setWidthMeasureMode(@NonNull MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    void show(@Nullable ViewGroup viewGroup, @Nullable RendererConfiguration rendererConfiguration) {
        if (viewGroup == null) {
            getUnifiedAdCallback().onAdShowFailed(ae.a.k("Target container"));
            return;
        }
        View view = this.adView;
        if (view == null) {
            getUnifiedAdCallback().onAdShowFailed(ae.a.i("Ad view is null"));
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            getUnifiedAdCallback().onAdShowFailed(ae.a.h("Width or height are not provided"));
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        getProcessCallback().processStartVisibilityTracker();
        this.visibilityTrackerHolder.b(view, getParams().e(), new a());
        ae.m.c(viewGroup, view, layoutParams);
        getProcessCallback().processFillAd();
        try {
            getUnifiedAd().prepareToShow(rendererConfiguration);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    @Override // io.bidmachine.AdObjectImpl
    @NonNull
    public od.f createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new c(this, adProcessCallback);
    }
}
