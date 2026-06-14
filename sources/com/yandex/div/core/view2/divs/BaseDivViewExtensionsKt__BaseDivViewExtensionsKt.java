package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.MainThread;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k8.a6;
import k8.cc;
import k8.dp;
import k8.f7;
import k8.hb;
import k8.hx;
import k8.j1;
import k8.jp;
import k8.k8;
import k8.ml;
import k8.nl;
import k8.ra;
import k8.tl;
import k8.w6;
import k8.wv;
import k8.y0;
import k8.y5;
import k8.z5;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.k;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a#\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010#\u001a\u00020\u0005*\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a«\u0001\u00104\u001a\u00020\u0005*\u00020\u00002\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010(2\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f02H\u0000¢\u0006\u0004\b4\u00105\u001aC\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001f\u0018\u000109*\u00020\u00002\u0006\u0010%\u001a\u00020$2\b\u00106\u001a\u0004\u0018\u0001002\b\u00108\u001a\u0004\u0018\u000107H\u0000¢\u0006\u0004\b;\u0010<\u001a#\u0010@\u001a\u00020\u0005*\u00020\u00002\u0006\u0010=\u001a\u00020$2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010A\u001a+\u0010F\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00002\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001f0CH\u0002¢\u0006\u0004\bD\u0010E\u001a9\u0010M\u001a\u00020\u0005*\u00020G2\u0006\u0010I\u001a\u00020H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0(2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010(H\u0001¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010Q\u001a\u00020\u0005*\u00020\u00002\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010R\u001a/\u0010V\u001a\u00020\u0005*\u00020\u00002\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010U\u001a\u0004\u0018\u00010S2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\bV\u0010W\u001a\u001d\u0010]\u001a\u00020\u0005*\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b[\u0010\\\u001aG\u0010c\u001a\u00020\u0005*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010_\u001a\u00020^2\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010(2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u00050CH\u0000¢\u0006\u0004\bc\u0010d\u001a\u001b\u0010g\u001a\u00020\u0005*\u00020\u00002\u0006\u0010f\u001a\u00020eH\u0000¢\u0006\u0004\bg\u0010h\u001a3\u0010m\u001a\u00020\u00052\u0006\u0010j\u001a\u00020i2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u00050CH\u0000¢\u0006\u0004\bm\u0010n\u001a\u0013\u0010o\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\bo\u0010p\u001a9\u0010s\u001a\u00020\u0005*\u00020G2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u001f022\u000e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\bs\u0010t\u001a\u001b\u0010x\u001a\u00020\u0005*\u00020G2\u0006\u0010u\u001a\u00020\u001fH\u0002¢\u0006\u0004\bv\u0010w\"\u001a\u0010=\u001a\u0004\u0018\u00010$*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Landroid/view/View;", "Lk8/hb;", "insets", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "applyPaddings", "(Landroid/view/View;Lk8/hb;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "applyMargins", "Lk8/f7;", "div", "applyTransform", "(Landroid/view/View;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", POBCoreNativeConstants.NATIVE_LENGTH, "Lk8/ml;", "divPivot", "", "getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Landroid/view/View;ILk8/ml;Lcom/yandex/div/json/expressions/ExpressionResolver;)F", "getPivotValue", "Lk8/y5;", "horizontal", "Lk8/z5;", "vertical", "applyAlignment", "(Landroid/view/View;Lk8/y5;Lk8/z5;)V", "newGravity", "applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Landroid/view/View;I)V", "applyGravity", "", "baselineAligned", "applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Landroid/view/View;Z)V", "applyBaselineAlignment", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lk8/j1;", "action", "", "actions", "longTapActions", "doubleTapActions", "hoverStartActions", "hoverEndActions", "pressStartActions", "pressEndActions", "Lk8/a6;", "actionAnimation", "Lcom/yandex/div/json/expressions/Expression;", "captureFocusOnAction", "applyDivActions", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/j1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lk8/a6;Lcom/yandex/div/json/expressions/Expression;)V", "divAnimation", "Lcom/yandex/div/core/view2/DivGestureListener;", "divGestureListener", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "createAnimatedTouchListener", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/a6;Lcom/yandex/div/core/view2/DivGestureListener;)Lkotlin/jvm/functions/Function2;", "bindingContext", "Lcom/yandex/div/core/view2/DivBinder;", "binder", "bindStates", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function1;", "traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "traverseViewHierarchy", "Landroid/view/ViewGroup;", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "newItems", "oldItems", "trackVisibilityActions", "(Landroid/view/ViewGroup;Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Ljava/util/List;)V", "Landroid/graphics/Canvas;", "canvas", "drawShadow", "(Landroid/view/View;Landroid/graphics/Canvas;)V", "Lk8/w6;", "newAspect", "oldAspect", "bindAspectRatio", "(Landroid/view/View;Lk8/w6;Lk8/w6;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/widget/AspectView;", "", "ratio", "applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Lcom/yandex/div/core/widget/AspectView;Ljava/lang/Double;)V", "applyAspectRatio", "Landroid/graphics/Bitmap;", "bitmap", "Lk8/cc;", "filters", "actionAfterFilters", "applyBitmapFilters", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Landroid/graphics/Bitmap;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "focusTracker", "clearFocusOnClick", "(Landroid/view/View;Lcom/yandex/div/core/view2/reuse/InputFocusTracker;)V", "Lk8/k8;", "builder", "", "callback", "bindItemBuilder", "(Lk8/k8;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "gainAccessibilityFocus", "(Landroid/view/View;)V", "newClipToBounds", "oldClipToBounds", "bindClipChildren", "(Landroid/view/ViewGroup;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "clip", "applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Landroid/view/ViewGroup;Z)V", "applyClipChildren", "getBindingContext", "(Landroid/view/View;)Lcom/yandex/div/core/view2/BindingContext;", "div_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt")
abstract /* synthetic */ class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jp.values().length];
            try {
                iArr[jp.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jp.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jp.SP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyAlignment(@NotNull View view, @Nullable y5 y5Var, @Nullable z5 z5Var) {
        applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, DivUtilKt.evaluateGravity(y5Var, z5Var));
        applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, z5Var == z5.BASELINE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(AspectView aspectView, Double d10) {
        aspectView.setAspectRatio(d10 != null ? (float) d10.doubleValue() : 0.0f);
    }

    private static final void applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getIsBaselineAligned() == z10) {
            return;
        }
        divLayoutParams.setBaselineAligned(z10);
        view.requestLayout();
    }

    public static final void applyBitmapFilters(@NotNull final View view, @NotNull BindingContext bindingContext, @NotNull final Bitmap bitmap, @Nullable final List<? extends cc> list, @NotNull final Function1<? super Bitmap, Unit> function1) {
        int i10;
        List<? extends cc> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            function1.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = bindingContext.getDivView().getDiv2Component().getBitmapEffectHelper();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    int i11;
                    view2.removeOnLayoutChangeListener(this);
                    float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (r4.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
                    for (cc ccVar : list) {
                        if (ccVar instanceof cc.a) {
                            long jLongValue = ((Number) ((cc.a) ccVar).c().f87989a.evaluate(expressionResolver)).longValue();
                            long j10 = jLongValue >> 31;
                            if (j10 == 0 || j10 == -1) {
                                i11 = (int) jLongValue;
                            } else {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                                }
                                i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            }
                            bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i11), view.getResources().getDisplayMetrics()));
                        } else if ((ccVar instanceof cc.d) && ViewsKt.isLayoutRtl(view)) {
                            bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                    function1.invoke(bitmapCreateScaledBitmap);
                }
            });
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        for (cc ccVar : list) {
            if (ccVar instanceof cc.a) {
                long jLongValue = ((Number) ((cc.a) ccVar).c().f87989a.evaluate(expressionResolver)).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), view.getResources().getDisplayMetrics()));
            } else if ((ccVar instanceof cc.d) && ViewsKt.isLayoutRtl(view)) {
                bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
            }
        }
        function1.invoke(bitmapCreateScaledBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(ViewGroup viewGroup, boolean z10) {
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z10);
        }
        ViewParent parent = viewGroup.getParent();
        if (z10 || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable j1 j1Var, @Nullable List<j1> list, @Nullable List<j1> list2, @Nullable List<j1> list3, @Nullable List<j1> list4, @Nullable List<j1> list5, @Nullable List<j1> list6, @Nullable List<j1> list7, @NotNull a6 a6Var, @NotNull Expression<Boolean> expression) {
        DivActionBinder actionBinder = bindingContext.getDivView().getDiv2Component().getActionBinder();
        List<j1> list8 = list;
        if (list8 == null || list8.isEmpty()) {
            list = j1Var != null ? CollectionsKt.listOf(j1Var) : null;
        }
        actionBinder.bindDivActions(bindingContext, view, list, list2, list3, list4, list5, list6, list7, a6Var, expression);
    }

    private static final void applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i10) {
                divLayoutParams.setGravity(i10);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    public static final void applyMargins(@NotNull View view, @Nullable hb hbVar, @NotNull ExpressionResolver expressionResolver) {
        int iUnitToPx;
        int iUnitToPx2;
        int iUnitToPx3;
        int iUnitToPx4;
        Integer numValueOf;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (hbVar != null) {
            jp jpVar = (jp) hbVar.f88006g.evaluate(expressionResolver);
            iUnitToPx = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88002c.evaluate(expressionResolver), displayMetrics, jpVar);
            iUnitToPx2 = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88005f.evaluate(expressionResolver), displayMetrics, jpVar);
            iUnitToPx3 = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88003d.evaluate(expressionResolver), displayMetrics, jpVar);
            iUnitToPx4 = BaseDivViewExtensionsKt.unitToPx((Long) hbVar.f88000a.evaluate(expressionResolver), displayMetrics, jpVar);
            Expression expression = hbVar.f88004e;
            Integer numValueOf2 = expression != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx((Long) expression.evaluate(expressionResolver), displayMetrics, jpVar)) : null;
            Expression expression2 = hbVar.f88001b;
            numValueOf = expression2 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx((Long) expression2.evaluate(expressionResolver), displayMetrics, jpVar)) : null;
            num = numValueOf2;
        } else {
            iUnitToPx = 0;
            iUnitToPx2 = 0;
            iUnitToPx3 = 0;
            iUnitToPx4 = 0;
            numValueOf = null;
        }
        if (marginLayoutParams.leftMargin == iUnitToPx && marginLayoutParams.topMargin == iUnitToPx2 && marginLayoutParams.rightMargin == iUnitToPx3 && marginLayoutParams.bottomMargin == iUnitToPx4 && ((num == null || marginLayoutParams.getMarginStart() == num.intValue()) && (numValueOf == null || marginLayoutParams.getMarginEnd() == numValueOf.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = iUnitToPx2;
        marginLayoutParams.bottomMargin = iUnitToPx4;
        if (num == null && numValueOf == null) {
            marginLayoutParams.leftMargin = iUnitToPx;
            marginLayoutParams.rightMargin = iUnitToPx3;
        } else {
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : 0);
            marginLayoutParams.setMarginEnd(numValueOf != null ? numValueOf.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final void applyPaddings(@NotNull View view, @Nullable hb hbVar, @NotNull ExpressionResolver expressionResolver) {
        if (hbVar == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        jp jpVar = (jp) hbVar.f88006g.evaluate(expressionResolver);
        Expression expression = hbVar.f88004e;
        if (expression == null && hbVar.f88001b == null) {
            view.setPadding(BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88002c.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88005f.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88003d.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88000a.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics));
            return;
        }
        int px = expression != null ? BaseDivViewExtensionsKt.toPx(((Number) expression.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics) : 0;
        int px2 = BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88005f.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics);
        Expression expression2 = hbVar.f88001b;
        view.setPaddingRelative(px, px2, expression2 != null ? BaseDivViewExtensionsKt.toPx(((Number) expression2.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(((Number) hbVar.f88000a.evaluate(expressionResolver)).longValue(), jpVar, displayMetrics));
    }

    public static final void applyTransform(@NotNull final View view, @NotNull f7 f7Var, @NotNull final ExpressionResolver expressionResolver) {
        Unit unit;
        Expression expression;
        final wv transform = f7Var.getTransform();
        if (transform == null || (expression = transform.f92249c) == null) {
            unit = null;
        } else {
            view.setRotation((float) ((Number) expression.evaluate(expressionResolver)).doubleValue());
            unit = Unit.f93236a;
        }
        if (unit == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.add(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    view2.setPivotX(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view2, view2.getWidth(), transform.f92247a, expressionResolver));
                    View view3 = view;
                    view3.setPivotY(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view3, view3.getHeight(), transform.f92248b, expressionResolver));
                }
            });
        } else {
            view.setPivotX(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getWidth(), transform.f92247a, expressionResolver));
            view.setPivotY(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getHeight(), transform.f92248b, expressionResolver));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(@NotNull final View view, @Nullable w6 w6Var, @Nullable w6 w6Var2, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        if (view instanceof AspectView) {
            Disposable disposableObserve = null;
            if (ExpressionsKt.equalsToConstant(w6Var != null ? w6Var.f92110a : null, w6Var2 != null ? w6Var2.f92110a : null)) {
                return;
            }
            applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, (w6Var == null || (expression2 = w6Var.f92110a) == null) ? null : (Double) expression2.evaluate(expressionResolver));
            if (ExpressionsKt.isConstantOrNull(w6Var != null ? w6Var.f92110a : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (w6Var != null && (expression = w6Var.f92110a) != null) {
                disposableObserve = expression.observe(expressionResolver, new Function1<Double, Unit>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Double d10) {
                        invoke(d10.doubleValue());
                        return Unit.f93236a;
                    }

                    public final void invoke(double d10) {
                        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, Double.valueOf(d10));
                    }
                });
            }
            expressionSubscriber.addSubscription(disposableObserve);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(@NotNull final ViewGroup viewGroup, @NotNull Expression<Boolean> expression, @Nullable Expression<Boolean> expression2, @NotNull ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, expression.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.addSubscription(expression.observe(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.f93236a;
                }

                public final void invoke(boolean z10) {
                    BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, z10);
                }
            }));
        }
    }

    public static final void bindItemBuilder(@NotNull k8 k8Var, @NotNull ExpressionResolver expressionResolver, @NotNull Function1<Object, Unit> function1) {
        k8Var.f88580a.observe(expressionResolver, function1);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(k8Var, expressionResolver);
        Iterator it = k8Var.f88582c.iterator();
        while (it.hasNext()) {
            ((k8.c) it.next()).f88590c.observe(itemResolver, function1);
        }
    }

    public static final void bindStates(@NotNull View view, @NotNull final BindingContext bindingContext, @NotNull final DivBinder divBinder) {
        traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, new Function1<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull View view2) {
                DivStatePath path;
                if (!(view2 instanceof DivStateLayout)) {
                    return Boolean.TRUE;
                }
                DivStateLayout divStateLayout = (DivStateLayout) view2;
                y0.o div = divStateLayout.getDiv();
                if (div != null && (path = divStateLayout.getPath()) != null) {
                    divBinder.bind(bindingContext, view2, div, path.parentState());
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker inputFocusTracker) {
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        inputFocusTracker.removeFocusFromFocusedInput();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function2<android.view.View, android.view.MotionEvent, java.lang.Boolean> createAnimatedTouchListener(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull com.yandex.div.core.view2.BindingContext r4, @org.jetbrains.annotations.Nullable k8.a6 r5, @org.jetbrains.annotations.Nullable com.yandex.div.core.view2.DivGestureListener r6) {
        /*
            r0 = 0
            if (r5 == 0) goto Lc
            com.yandex.div.json.expressions.ExpressionResolver r1 = r4.getExpressionResolver()
            kotlin.jvm.functions.Function2 r3 = com.yandex.div.core.view2.animations.UtilsKt.asTouchListener(r5, r1, r3)
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r6 == 0) goto L37
            kotlin.jvm.functions.Function0 r5 = r6.getOnSingleTapListener()
            if (r5 != 0) goto L1d
            kotlin.jvm.functions.Function0 r5 = r6.getOnDoubleTapListener()
            if (r5 != 0) goto L1d
            r5 = r0
            goto L1e
        L1d:
            r5 = r6
        L1e:
            if (r5 == 0) goto L37
            android.view.GestureDetector r5 = new android.view.GestureDetector
            com.yandex.div.core.view2.Div2View r4 = r4.getDivView()
            com.yandex.div.core.Div2Context r4 = r4.getContext()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r5.<init>(r4, r6, r1)
            goto L38
        L37:
            r5 = r0
        L38:
            if (r3 != 0) goto L3e
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            return r0
        L3e:
            com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1 r4 = new com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(android.view.View, com.yandex.div.core.view2.BindingContext, k8.a6, com.yandex.div.core.view2.DivGestureListener):kotlin.jvm.functions.Function2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        DivBorderDrawer divBorderDrawer;
        int iSave = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
            if (divBorderSupports != null && (divBorderDrawer = divBorderSupports.getBorderDrawer()) != null) {
                divBorderDrawer.drawShadow(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10, ml mlVar, ExpressionResolver expressionResolver) {
        Object objB = mlVar.b();
        if (!(objB instanceof nl)) {
            return objB instanceof tl ? (((float) ((Number) ((tl) objB).f91404a.evaluate(expressionResolver)).doubleValue()) / 100.0f) * i10 : i10 / 2.0f;
        }
        nl nlVar = (nl) objB;
        Expression expression = nlVar.f90052b;
        if (expression == null) {
            return i10 / 2.0f;
        }
        float fLongValue = ((Number) expression.evaluate(expressionResolver)).longValue();
        int i11 = WhenMappings.$EnumSwitchMapping$0[((jp) nlVar.f90051a.evaluate(expressionResolver)).ordinal()];
        if (i11 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
        }
        if (i11 == 2) {
            return fLongValue;
        }
        if (i11 == 3) {
            return BaseDivViewExtensionsKt.spToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
        }
        throw new m();
    }

    @MainThread
    public static final void trackVisibilityActions(@NotNull final ViewGroup viewGroup, @NotNull final Div2View div2View, @NotNull final List<DivItemBuilderResult> list, @Nullable List<DivItemBuilderResult> list2) {
        final DivVisibilityActionTracker visibilityActionTracker = div2View.getDiv2Component().getVisibilityActionTracker();
        List<DivItemBuilderResult> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, DivUtilKt.getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().c()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((dp) it2.next()).b());
            }
            for (DivItemBuilderResult divItemBuilderResult : list2) {
                List<hx> allAppearActions = DivUtilKt.getAllAppearActions(divItemBuilderResult.getDiv().c());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : allAppearActions) {
                    if (!hashSet.contains(((hx) obj).b())) {
                        arrayList2.add(obj);
                    }
                }
                List<ra> allDisappearActions = DivUtilKt.getAllDisappearActions(divItemBuilderResult.getDiv().c());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : allDisappearActions) {
                    if (!hashSet.contains(((ra) obj2).b())) {
                        arrayList3.add(obj2);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(div2View, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                for (Pair pair : k.f0(ViewGroupKt.getChildren(viewGroup), CollectionsKt.asSequence(list))) {
                    View view2 = (View) pair.component1();
                    DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.component2();
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, div2View, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                }
            }
        });
    }

    private static final void traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, Function1<? super View, Boolean> function1) {
        if (function1.invoke(view).booleanValue() && (view instanceof ViewGroup)) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((View) it.next(), function1);
            }
        }
    }
}
