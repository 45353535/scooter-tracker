package org.bidon.sdk.ads.banner.render;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.app.UnitySpecificInfo;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\tH\u0014J\u001a\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rJ\u0006\u0010\u000f\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/RootAdContainer;", "Landroid/widget/FrameLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "onAttachedToWindow", "", "onDetachedFromWindow", "obtainSize", "onFinished", "Lkotlin/Function1;", "Landroid/graphics/Point;", "clearRootContainer", "isPlugin", "", "bringToFrontIfNeed", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootAdContainer extends FrameLayout {

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootAdContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ApplyInsetUseCase.INSTANCE.applyWindowInsets(this);
        setClipChildren(false);
        setClipToPadding(false);
        this.layoutChangeListener = new View.OnLayoutChangeListener() { // from class: org.bidon.sdk.ads.banner.render.i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f97600b.bringToFrontIfNeed();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bringToFrontIfNeed() {
        int i10;
        int childCount;
        if (isPlugin()) {
            try {
                Result.Companion companion = Result.f93230c;
                ViewParent parent = getParent();
                Unit unit = null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int iIndexOfChild = viewGroup.indexOfChild(this);
                    if (iIndexOfChild != -1 && (i10 = iIndexOfChild + 1) <= (childCount = viewGroup.getChildCount())) {
                        while (true) {
                            View childAt = viewGroup.getChildAt(i10);
                            if (childAt == null || !Intrinsics.areEqual(childAt.getClass().getSimpleName(), "UnityPlayer")) {
                                if (i10 == childCount) {
                                    break;
                                } else {
                                    i10++;
                                }
                            } else {
                                LogExtKt.logInfo(TagKt.getTAG(this), "Bring to front");
                                bringToFront();
                                break;
                            }
                        }
                    }
                    unit = Unit.f93236a;
                }
                Result.b(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }

    private final boolean isPlugin() {
        UnitySpecificInfo unitySpecificInfo = UnitySpecificInfo.INSTANCE;
        return (unitySpecificInfo.getPluginVersion() == null || unitySpecificInfo.getFrameworkVersion() == null) ? false : true;
    }

    public final void clearRootContainer() {
        removeAllViews();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void obtainSize(@NotNull final Function1<? super Point, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.bidon.sdk.ads.banner.render.RootAdContainer.obtainSize.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Point point = new Point(RootAdContainer.this.getWidth(), RootAdContainer.this.getHeight());
                    ViewTreeObserver viewTreeObserver2 = RootAdContainer.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    }
                    onFinished.invoke(point);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isPlugin()) {
            try {
                Result.Companion companion = Result.f93230c;
                ViewParent parent = getParent();
                Unit unit = null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.addOnLayoutChangeListener(this.layoutChangeListener);
                    unit = Unit.f93236a;
                }
                Result.b(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isPlugin()) {
            try {
                Result.Companion companion = Result.f93230c;
                ViewParent parent = getParent();
                Unit unit = null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeOnLayoutChangeListener(this.layoutChangeListener);
                    unit = Unit.f93236a;
                }
                Result.b(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }
}
