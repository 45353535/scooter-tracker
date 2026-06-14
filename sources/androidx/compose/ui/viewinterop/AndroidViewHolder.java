package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010U\u001a\u00020\u00132\b\u0010V\u001a\u0004\u0018\u00010WH\u0016J\u000e\u0010X\u001a\n\u0018\u00010Oj\u0004\u0018\u0001`YJ\n\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010\\\u001a\u00020\u0015H\u0016J\u001e\u0010]\u001a\u0004\u0018\u00010^2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\b\u0010a\u001a\u00020\u0013H\u0016J \u0010b\u001a\u00020\u00152\u0006\u0010c\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00152\u0006\u0010e\u001a\u00020\u0015H\u0002J\b\u0010f\u001a\u00020-H\u0014J\b\u0010g\u001a\u00020-H\u0016J\u0018\u0010h\u001a\u00020-2\u0006\u0010i\u001a\u00020O2\u0006\u0010j\u001a\u00020OH\u0016J\b\u0010k\u001a\u00020-H\u0014J0\u0010l\u001a\u00020-2\u0006\u0010m\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\u00152\u0006\u0010o\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u00152\u0006\u0010q\u001a\u00020\u0015H\u0014J\u0018\u0010r\u001a\u00020-2\u0006\u0010s\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\u0015H\u0014J(\u0010u\u001a\u00020\u00132\u0006\u0010j\u001a\u00020O2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020w2\u0006\u0010y\u001a\u00020\u0013H\u0016J \u0010z\u001a\u00020\u00132\u0006\u0010j\u001a\u00020O2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020wH\u0016J0\u0010{\u001a\u00020-2\u0006\u0010j\u001a\u00020O2\u0006\u0010|\u001a\u00020\u00152\u0006\u0010}\u001a\u00020\u00152\u0006\u0010y\u001a\u00020\"2\u0006\u0010~\u001a\u00020\u0015H\u0016J<\u0010\u007f\u001a\u00020-2\u0006\u0010j\u001a\u00020O2\u0007\u0010\u0080\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u0015H\u0016JD\u0010\u007f\u001a\u00020-2\u0006\u0010j\u001a\u00020O2\u0007\u0010\u0080\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0083\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u00152\u0006\u0010y\u001a\u00020\"H\u0016J*\u0010\u0084\u0001\u001a\u00020-2\u0006\u0010i\u001a\u00020O2\u0006\u0010j\u001a\u00020O2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u0015H\u0016J\t\u0010\u0086\u0001\u001a\u00020-H\u0016J\t\u0010\u0087\u0001\u001a\u00020-H\u0016J*\u0010\u0088\u0001\u001a\u00020\u00132\u0006\u0010i\u001a\u00020O2\u0006\u0010j\u001a\u00020O2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u0015H\u0016J\u0019\u0010\u0089\u0001\u001a\u00020-2\u0006\u0010j\u001a\u00020O2\u0006\u0010~\u001a\u00020\u0015H\u0016J\u0012\u0010\u008a\u0001\u001a\u00020-2\u0007\u0010\u008b\u0001\u001a\u00020\u0015H\u0014J\u0007\u0010\u008c\u0001\u001a\u00020-J\u0012\u0010\u008d\u0001\u001a\u00020-2\u0007\u0010\u008e\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u0013H\u0016R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00103\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R(\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020-\u0018\u00010,X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R0\u0010;\u001a\b\u0012\u0004\u0012\u00020-0:2\f\u00109\u001a\b\u0012\u0004\u0012\u00020-0:@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010@\u001a\b\u0012\u0004\u0012\u00020-0:2\f\u00109\u001a\b\u0012\u0004\u0012\u00020-0:@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020-0:X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010E\u001a\u0004\u0018\u00010D2\b\u0010\u000b\u001a\u0004\u0018\u00010D@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010L\u001a\b\u0012\u0004\u0012\u00020-0:2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020-0:@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R(\u0010P\u001a\u0004\u0018\u00010O2\b\u0010\u000b\u001a\u0004\u0018\u00010O@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "lastHeightMeasureSpec", "", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "location", "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "onCommitAffectingUpdate", "Lkotlin/Function1;", "", "onDensityChanged", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "<set-?>", "Lkotlin/Function0;", "release", "getRelease", "()Lkotlin/jvm/functions/Function0;", "setRelease", "(Lkotlin/jvm/functions/Function0;)V", "reset", "getReset", "setReset", "runUpdate", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "snapshotObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "update", "getUpdate", "setUpdate", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getInteropView", "Landroidx/compose/ui/viewinterop/InteropView;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getNestedScrollAxes", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "isNestedScrollingEnabled", "obtainMeasureSpec", "min", "max", "preferred", "onAttachedToWindow", "onDeactivate", "onDescendantInvalidated", "child", TypedValues.AttributesType.S_TARGET, "onDetachedFromWindow", "onLayout", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "velocityX", "", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "axes", "onRelease", "onReuse", "onStartNestedScroll", "onStopNestedScroll", "onWindowVisibilityChanged", "visibility", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "shouldDelayChildPressedState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback {

    @NotNull
    private Density density;

    @NotNull
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    @NotNull
    private final int[] location;

    @NotNull
    private Modifier modifier;

    @NotNull
    private final NestedScrollingParentHelper nestedScrollingParentHelper;

    @NotNull
    private final Function1<AndroidViewHolder, Unit> onCommitAffectingUpdate;

    @Nullable
    private Function1<? super Density, Unit> onDensityChanged;

    @Nullable
    private Function1<? super Modifier, Unit> onModifierChanged;

    @Nullable
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    @NotNull
    private Function0<Unit> release;

    @NotNull
    private Function0<Unit> reset;

    @NotNull
    private final Function0<Unit> runUpdate;

    @Nullable
    private SavedStateRegistryOwner savedStateRegistryOwner;

    @NotNull
    private final SnapshotStateObserver snapshotObserver;

    @NotNull
    private Function0<Unit> update;

    @Nullable
    private View view;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {523, 528}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, AndroidViewHolder androidViewHolder, long j10, Continuation continuation) {
            super(2, continuation);
            this.$consumed = z10;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.m2806dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.m2806dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.d.b(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.d.b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r5 = r11.m4187getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m2806dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r4 = r4.m4187getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m2806dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r11 = kotlin.Unit.f93236a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {541}, m = "invokeSuspend")
    static final class C16121 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16121(long j10, Continuation continuation) {
            super(2, continuation);
            this.$toBeConsumed = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidViewHolder.this.new C16121(this.$toBeConsumed, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j10 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m2808dispatchPreFlingQWom1Mo(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C16121) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, @NotNull NestedScrollDispatcher dispatcher) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.snapshotObserver = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.onCommitAffectingUpdate = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.hasUpdateBlock) {
                    SnapshotStateObserver snapshotStateObserver = this.this$0.snapshotObserver;
                    AndroidViewHolder androidViewHolder = this.this$0;
                    snapshotStateObserver.observeReads(androidViewHolder, androidViewHolder.onCommitAffectingUpdate, this.this$0.getUpdate());
                }
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }
        }), this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder = this;
                Canvas canvas = drawBehind.getDrawContext().getCanvas();
                Owner owner = layoutNode2.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.drawAndroidView(androidViewHolder, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                }
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
            }
        });
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Modifier it) {
                Intrinsics.checkNotNullParameter(it, "it");
                layoutNode.setModifier(it.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Density it) {
                Intrinsics.checkNotNullParameter(it, "it");
                layoutNode.setDensity(it);
            }
        };
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
                invoke2(owner);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Owner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                Object obj = ref$ObjectRef.f93280b;
                if (obj != null) {
                    this.$this_run.setView$ui_release((View) obj);
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
                invoke2(owner);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Owner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                ref$ObjectRef.f93280b = this.$this_run.getView();
                this.$this_run.setView$ui_release(null);
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int width) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int height) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicHeight(i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicWidth(i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.CC.p(measure, Constraints.m3921getMinWidthimpl(j10), Constraints.m3920getMinHeightimpl(j10), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.f93236a;
                        }
                    }, 4, null);
                }
                if (Constraints.m3921getMinWidthimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m3921getMinWidthimpl(j10));
                }
                if (Constraints.m3920getMinHeightimpl(j10) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m3920getMinHeightimpl(j10));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM3921getMinWidthimpl = Constraints.m3921getMinWidthimpl(j10);
                int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM3921getMinWidthimpl, iM3919getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM3920getMinHeightimpl = Constraints.m3920getMinHeightimpl(j10);
                int iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM3920getMinHeightimpl, iM3918getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.CC.p(measure, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicHeight(i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return intrinsicWidth(i10);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(g.n(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.view;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Nullable
    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Nullable
    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.release;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.reset;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @Nullable
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ViewParent invalidateChildInParent(@Nullable int[] location, @Nullable Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        this.layoutNode.invalidateLayer$ui_release();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        View view = this.view;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.start();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotObserver.stop();
        this.snapshotObserver.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        View view = this.view;
        if (view != null) {
            view.layout(0, 0, r10 - l10, b10 - t10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View view = this.view;
        if ((view != null ? view.getParent() : null) != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        View view2 = this.view;
        if (view2 != null) {
            view2.measure(widthMeasureSpec, heightMeasureSpec);
        }
        View view3 = this.view;
        int measuredWidth = view3 != null ? view3.getMeasuredWidth() : 0;
        View view4 = this.view;
        setMeasuredDimension(measuredWidth, view4 != null ? view4.getMeasuredHeight() : 0);
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NotNull View target, float velocityX, float velocityY, boolean consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        i.d(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NotNull View target, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        i.d(this.dispatcher.getCoroutineScope(), null, null, new C16121(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM2809dispatchPreScrollOzD1aCk = this.dispatcher.m2809dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dx), AndroidViewHolder_androidKt.toComposeOffset(dy)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1371getXimpl(jM2809dispatchPreScrollOzD1aCk));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1372getYimpl(jM2809dispatchPreScrollOzD1aCk));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            long jM2807dispatchPostScrollDzOQY0M = this.dispatcher.m2807dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1371getXimpl(jM2807dispatchPostScrollDzOQY0M));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m1372getYimpl(jM2807dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        View view = this.view;
        Intrinsics.checkNotNull(view);
        if (view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i10;
        int i11 = this.lastWidthMeasureSpec;
        if (i11 == Integer.MIN_VALUE || (i10 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.density) {
            this.density = value;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.modifier) {
            this.modifier = value;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    protected final void setRelease(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.release = function0;
    }

    protected final void setReset(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    protected final void setUpdate(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.update = value;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setView$ui_release(@Nullable View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.runUpdate.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m2807dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
        }
    }
}
