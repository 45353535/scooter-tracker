package org.bidon.sdk.ads.banner.render;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.y.z.w.s;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.ads.banner.AdSize;
import org.bidon.sdk.ads.banner.BannerPosition;
import org.bidon.sdk.ads.banner.BannerView;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.DpToPxExtKt;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\nH\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\nH\u0016J\u0014\u0010(\u001a\u00020\"*\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010)\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0+H\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0002J\u001e\u0010/\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\n2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0+H\u0002J\u0018\u00101\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\n2\u0006\u00102\u001a\u000203H\u0002J,\u00104\u001a\u00020\u001e*\u00020\u00142\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002J\u0014\u0010;\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\nH\u0002J\f\u0010=\u001a\u000209*\u00020 H\u0002J\f\u0010>\u001a\u000209*\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006?"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/AdRendererImpl;", "Lorg/bidon/sdk/ads/banner/render/AdRenderer;", "inspector", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderInspector;", "calculateAdContainerParams", "Lorg/bidon/sdk/ads/banner/render/CalculateAdContainerParamsUseCase;", "<init>", "(Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderInspector;Lorg/bidon/sdk/ads/banner/render/CalculateAdContainerParamsUseCase;)V", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "safeAreaScreenSize", "Landroid/graphics/Point;", s.z.f67720z, "", "getTag", "()Ljava/lang/String;", "rootContainer", "Lorg/bidon/sdk/ads/banner/render/RootAdContainer;", "adContainer", "Landroid/widget/FrameLayout;", "positionState", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", "lifecycleObserver", "Lorg/bidon/sdk/ads/banner/render/LifecycleObserver;", "getLifecycleObserver", "()Lorg/bidon/sdk/ads/banner/render/LifecycleObserver;", "lifecycleObserver$delegate", "Lkotlin/Lazy;", Reporting.EventType.RENDER, "", "bannerView", "Lorg/bidon/sdk/ads/banner/BannerView;", "animate", "", "handleConfigurationChanges", "renderListener", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderListener;", MenuActionType.HIDE, "destroy", "fits", "withRootContainer", "onRootContainerReady", "Lkotlin/Function0;", "setAdViewsVisible", "adView", "Landroid/view/ViewGroup;", "createRootContainer", "onFinished", "createAdContainer", "params", "Lorg/bidon/sdk/ads/banner/render/AdViewsParameters;", "setParams", "offset", "pivot", "Landroid/graphics/PointF;", "width", "", "height", "addAdView", "observeActivity", "obtainWidth", "obtainHeight", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdRendererImpl implements AdRenderer {

    @NotNull
    private WeakReference<Activity> activity;

    @Nullable
    private FrameLayout adContainer;

    @NotNull
    private final CalculateAdContainerParamsUseCase calculateAdContainerParams;

    @NotNull
    private final AdRenderer.RenderInspector inspector;

    /* JADX INFO: renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lifecycleObserver;

    @NotNull
    private AdRenderer.PositionState positionState;

    @Nullable
    private RootAdContainer rootContainer;

    @NotNull
    private Point safeAreaScreenSize;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerPosition.values().length];
            try {
                iArr[BannerPosition.HorizontalTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerPosition.HorizontalBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerPosition.VerticalLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerPosition.VerticalRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdRendererImpl(@NotNull AdRenderer.RenderInspector inspector, @NotNull CalculateAdContainerParamsUseCase calculateAdContainerParams) {
        Intrinsics.checkNotNullParameter(inspector, "inspector");
        Intrinsics.checkNotNullParameter(calculateAdContainerParams, "calculateAdContainerParams");
        this.inspector = inspector;
        this.calculateAdContainerParams = calculateAdContainerParams;
        this.activity = new WeakReference<>(null);
        this.safeAreaScreenSize = new Point(0, 0);
        this.positionState = new AdRenderer.PositionState.Place(BannerPosition.INSTANCE.getDefault());
        this.lifecycleObserver = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.render.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdRendererImpl.lifecycleObserver_delegate$lambda$0();
            }
        });
    }

    private final void addAdView(final FrameLayout frameLayout, BannerView bannerView) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithLayer;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        bannerView.setClipChildren(false);
        bannerView.setClipToPadding(false);
        final View childAt = frameLayout.getChildAt(0);
        if (Intrinsics.areEqual(childAt, bannerView)) {
            LogExtKt.logInfo(getTag(), "View and position does not changed");
            return;
        }
        ViewParent parent = bannerView.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(bannerView);
        }
        frameLayout.setBackgroundColor(0);
        frameLayout.addView(bannerView, new FrameLayout.LayoutParams(obtainWidth(bannerView), obtainHeight(bannerView), 17));
        if (childAt == null || (viewPropertyAnimatorAnimate = childAt.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(800L)) == null || (viewPropertyAnimatorWithLayer = duration.withLayer()) == null || (viewPropertyAnimatorWithStartAction = viewPropertyAnimatorWithLayer.withStartAction(new Runnable() { // from class: org.bidon.sdk.ads.banner.render.f
            @Override // java.lang.Runnable
            public final void run() {
                childAt.bringToFront();
            }
        })) == null || (viewPropertyAnimatorWithEndAction = viewPropertyAnimatorWithStartAction.withEndAction(new Runnable() { // from class: org.bidon.sdk.ads.banner.render.g
            @Override // java.lang.Runnable
            public final void run() {
                frameLayout.removeView(childAt);
            }
        })) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    private final void createAdContainer(Activity activity, AdViewsParameters params) {
        FrameLayout frameLayout = this.adContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        RootAdContainer rootAdContainer = this.rootContainer;
        if (rootAdContainer != null) {
            rootAdContainer.removeAllViews();
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.adContainer = frameLayout2;
        setParams(frameLayout2, params.getBaseParams().getOffset(), params.getBaseParams().getPivot(), params.getAdContainerWidth(), params.getAdContainerHeight());
        RootAdContainer rootAdContainer2 = this.rootContainer;
        if (rootAdContainer2 != null) {
            rootAdContainer2.addView(frameLayout2, new FrameLayout.LayoutParams(params.getAdContainerLayoutParamsWidth(), params.getAdContainerLayoutParamsHeight()));
        }
    }

    private final void createRootContainer(Activity activity, final Function0<Unit> onFinished) {
        FrameLayout frameLayout = this.adContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        RootAdContainer rootAdContainer = this.rootContainer;
        if (rootAdContainer != null) {
            rootAdContainer.clearRootContainer();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        RootAdContainer rootAdContainer2 = new RootAdContainer(activity);
        this.rootContainer = rootAdContainer2;
        activity.addContentView(rootAdContainer2, layoutParams);
        RootAdContainer rootAdContainer3 = this.rootContainer;
        if (rootAdContainer3 != null) {
            rootAdContainer3.obtainSize(new Function1() { // from class: org.bidon.sdk.ads.banner.render.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdRendererImpl.createRootContainer$lambda$3(this.f97594b, onFinished, (Point) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createRootContainer$lambda$3(AdRendererImpl adRendererImpl, Function0 function0, Point safeAreaScreenSize) {
        Intrinsics.checkNotNullParameter(safeAreaScreenSize, "safeAreaScreenSize");
        adRendererImpl.safeAreaScreenSize = safeAreaScreenSize;
        function0.invoke();
        return Unit.f93236a;
    }

    private final boolean fits(BannerView bannerView, AdRenderer.PositionState positionState) {
        if (!(positionState instanceof AdRenderer.PositionState.Place)) {
            return true;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[((AdRenderer.PositionState.Place) positionState).getPosition().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return this.safeAreaScreenSize.x >= obtainWidth(bannerView);
        }
        if (i10 == 3 || i10 == 4) {
            return this.safeAreaScreenSize.y >= obtainWidth(bannerView);
        }
        throw new m();
    }

    private final LifecycleObserver getLifecycleObserver() {
        return (LifecycleObserver) this.lifecycleObserver.getValue();
    }

    private final String getTag() {
        return TagKt.getTAG(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleObserver lifecycleObserver_delegate$lambda$0() {
        return new LifecycleObserver();
    }

    private final void observeActivity(final Activity activity) {
        LifecycleObserver lifecycleObserver = getLifecycleObserver();
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        lifecycleObserver.observe(applicationContext, new Function1() { // from class: org.bidon.sdk.ads.banner.render.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdRendererImpl.observeActivity$lambda$8(this.f97592b, activity, (Activity) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeActivity$lambda$8(AdRendererImpl adRendererImpl, Activity activity, Activity destroyedActivity) {
        Intrinsics.checkNotNullParameter(destroyedActivity, "destroyedActivity");
        LogExtKt.logInfo(adRendererImpl.getTag(), "Activity destroyed: " + destroyedActivity);
        if (Intrinsics.areEqual(adRendererImpl.activity.get(), destroyedActivity)) {
            adRendererImpl.hide(activity);
            RootAdContainer rootAdContainer = adRendererImpl.rootContainer;
            if (rootAdContainer != null) {
                rootAdContainer.removeAllViews();
            }
            adRendererImpl.rootContainer = null;
            adRendererImpl.activity = new WeakReference<>(null);
        }
        return Unit.f93236a;
    }

    private final int obtainHeight(BannerView bannerView) {
        return DpToPxExtKt.getDpToPx(Integer.valueOf(bannerView.getAdSize().getHeightDp()));
    }

    private final int obtainWidth(BannerView bannerView) {
        return DpToPxExtKt.getDpToPx(Integer.valueOf(bannerView.getAdSize().getWidthDp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(AdRendererImpl adRendererImpl, BannerView bannerView, AdRenderer.PositionState positionState, AdRenderer.RenderListener renderListener, Activity activity) {
        if (!adRendererImpl.fits(bannerView, positionState)) {
            LogExtKt.logInfo(adRendererImpl.getTag(), "Banner does not fit");
            renderListener.onVisibilityIssued();
            return Unit.f93236a;
        }
        AdViewsParameters adViewsParametersInvoke = adRendererImpl.calculateAdContainerParams.invoke(positionState, adRendererImpl.safeAreaScreenSize, adRendererImpl.obtainWidth(bannerView), adRendererImpl.obtainHeight(bannerView));
        if (!adRendererImpl.inspector.isViewVisibleOnScreen(adRendererImpl.adContainer)) {
            adRendererImpl.createAdContainer(activity, adViewsParametersInvoke);
        }
        bannerView.setRotation(adViewsParametersInvoke.getBaseParams().getRotation());
        bannerView.showAd();
        FrameLayout frameLayout = adRendererImpl.adContainer;
        if (frameLayout != null) {
            adRendererImpl.addAdView(frameLayout, bannerView);
        }
        adRendererImpl.setAdViewsVisible(bannerView);
        renderListener.onRendered();
        return Unit.f93236a;
    }

    private final void setAdViewsVisible(ViewGroup adView) {
        adView.setVisibility(0);
        FrameLayout frameLayout = this.adContainer;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        RootAdContainer rootAdContainer = this.rootContainer;
        if (rootAdContainer != null) {
            rootAdContainer.setVisibility(0);
        }
        RootAdContainer rootAdContainer2 = this.rootContainer;
        if (rootAdContainer2 != null) {
            rootAdContainer2.bringToFront();
        }
        FrameLayout frameLayout2 = this.adContainer;
        if (frameLayout2 != null) {
            frameLayout2.bringToFront();
        }
    }

    private final void setParams(FrameLayout frameLayout, Point point, PointF pointF, int i10, int i11) {
        float f10 = point.x;
        float f11 = pointF.x;
        float f12 = i10;
        float f13 = i11;
        float f14 = point.y - (pointF.y * f13);
        frameLayout.setPivotX(f12 * f11);
        frameLayout.setPivotY(f13 * pointF.y);
        frameLayout.setX(f10 - (f11 * f12));
        frameLayout.setY(f14);
    }

    private final void withRootContainer(Activity activity, final Function0<Unit> onRootContainerReady) {
        if (this.inspector.isViewVisibleOnScreen(this.rootContainer) && Intrinsics.areEqual(activity, this.activity.get())) {
            onRootContainerReady.invoke();
        } else {
            createRootContainer(activity, new Function0() { // from class: org.bidon.sdk.ads.banner.render.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdRendererImpl.withRootContainer$lambda$2(onRootContainerReady);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withRootContainer$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.f93236a;
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer
    public void destroy(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        hide(activity);
        RootAdContainer rootAdContainer = this.rootContainer;
        if (rootAdContainer != null) {
            rootAdContainer.clearRootContainer();
        }
        this.rootContainer = null;
        this.activity = new WeakReference<>(null);
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer
    public void hide(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FrameLayout frameLayout = this.adContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.adContainer = null;
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer
    public void render(@NotNull final Activity activity, @NotNull final BannerView bannerView, @NotNull final AdRenderer.PositionState positionState, boolean animate, boolean handleConfigurationChanges, @NotNull final AdRenderer.RenderListener renderListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(positionState, "positionState");
        Intrinsics.checkNotNullParameter(renderListener, "renderListener");
        observeActivity(activity);
        LogExtKt.logInfo(getTag(), "Render banner " + bannerView + " at " + activity + ". " + Thread.currentThread());
        LogExtKt.logInfo(getTag(), "--> AdContainer(" + this.adContainer + "), AdView(" + bannerView + "), " + positionState + ", " + bannerView.getFormat() + ", animate(" + animate + "), ");
        String tag = getTag();
        AdSize adSize = bannerView.getAdSize();
        int iObtainWidth = obtainWidth(bannerView);
        int iObtainHeight = obtainHeight(bannerView);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(adSize);
        sb2.append(". Obtained size: ");
        sb2.append(iObtainWidth);
        sb2.append(" x ");
        sb2.append(iObtainHeight);
        LogExtKt.logInfo(tag, sb2.toString());
        if (!this.inspector.isActivityValid(activity)) {
            hide(activity);
            renderListener.onRenderFailed();
            return;
        }
        if (!Intrinsics.areEqual(this.positionState, positionState)) {
            LogExtKt.logInfo(getTag(), "Position changed: " + this.positionState + " -> " + positionState);
            hide(activity);
        }
        if (!this.inspector.isRenderPermitted()) {
            renderListener.onRenderFailed();
            return;
        }
        this.positionState = positionState;
        this.activity = new WeakReference<>(activity);
        withRootContainer(activity, new Function0() { // from class: org.bidon.sdk.ads.banner.render.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdRendererImpl.render$lambda$1(this.f97587b, bannerView, positionState, renderListener, activity);
            }
        });
    }
}
