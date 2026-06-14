package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u0006\u0010$\u001a\u00020!J1\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0017H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u0004\u0018\u00010\rH\u0082@ø\u0001\u0001¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020\rH\u0016J)\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b3\u00104J-\u00105\u001a\u0002062\u0006\u00102\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020!2\u0006\u0010/\u001a\u00020\r2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020!H\u0002J%\u0010E\u001a\u0002062\u0006\u0010'\u001a\u0002062\u0006\u0010F\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "sideCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "animationController", "Landroid/view/WindowInsetsAnimationController;", "animationJob", "Lkotlinx/coroutines/Job;", "cancellationSignal", "Landroid/os/CancellationSignal;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "isControllerRequested", "", "partialConsumption", "", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "getView", "()Landroid/view/View;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "adjustInsets", "", "inset", "animationEnded", "dispose", "fling", "Landroidx/compose/ui/unit/Velocity;", "available", "flingAmount", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelled", "controller", "onFinished", "onPostFling", "consumed", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "onReady", "types", "", "requestAnimationController", "scroll", "scrollAmount", "scroll-8S9VItk", "(JF)J", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    @Nullable
    private WindowInsetsAnimationController animationController;

    @Nullable
    private Job animationJob;

    @NotNull
    private final CancellationSignal cancellationSignal;

    @Nullable
    private CancellableContinuation continuation;

    @NotNull
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;

    @NotNull
    private final SideCalculator sideCalculator;

    @NotNull
    private final View view;

    @NotNull
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(@NotNull AndroidWindowInsets windowInsets, @NotNull View view, @NotNull SideCalculator sideCalculator, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sideCalculator, "sideCalculator");
        Intrinsics.checkNotNullParameter(density, "density");
        this.windowInsets = windowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
        this.cancellationSignal = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
            Intrinsics.checkNotNullExpressionValue(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, zf.a.d(inset)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.r(null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }
            });
        }
        this.continuation = null;
        Job job = this.animationJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m480flinghuYlsQE(long r26, float r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m480flinghuYlsQE(long, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(Continuation continuation) {
        Object objC = this.animationController;
        if (objC == null) {
            kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
            eVar.I();
            this.continuation = eVar;
            requestAnimationController();
            objC = eVar.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType(), -1L, null, this.cancellationSignal, k.a(this));
        }
    }

    /* JADX INFO: renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m481scroll8S9VItk(long available, float scrollAmount) {
        Job job = this.animationJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount != 0.0f) {
            if (this.windowInsets.isVisible() != (scrollAmount > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo442consumedOffsetsMKHz9U(available);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
                int iValueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
                int iValueOf2 = sideCalculator2.valueOf(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
                int iValueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (scrollAmount > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.INSTANCE.m1387getZeroF1C5BW0();
                }
                float f10 = iValueOf3 + scrollAmount + this.partialConsumption;
                int iN = kotlin.ranges.g.n(zf.a.d(f10), iValueOf, iValueOf2);
                this.partialConsumption = f10 - zf.a.d(f10);
                if (iN != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iN), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo442consumedOffsetsMKHz9U(available);
            }
        }
        return Offset.INSTANCE.m1387getZeroF1C5BW0();
    }

    public final void dispose() {
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.r(null, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }
            });
        }
        Job job = this.animationJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(@Nullable WindowInsetsAnimationController controller) {
        animationEnded();
    }

    public void onFinished(@NotNull WindowInsetsAnimationController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo314onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation continuation) {
        return m480flinghuYlsQE(j11, this.sideCalculator.showMotion(Velocity.m4176getXimpl(j11), Velocity.m4177getYimpl(j11)), true, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo315onPostScrollDzOQY0M(long consumed, long available, int source) {
        return m481scroll8S9VItk(available, this.sideCalculator.showMotion(Offset.m1371getXimpl(available), Offset.m1372getYimpl(available)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo316onPreFlingQWom1Mo(long j10, @NotNull Continuation continuation) {
        return m480flinghuYlsQE(j10, this.sideCalculator.hideMotion(Velocity.m4176getXimpl(j10), Velocity.m4177getYimpl(j10)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo317onPreScrollOzD1aCk(long available, int source) {
        return m481scroll8S9VItk(available, this.sideCalculator.hideMotion(Offset.m1371getXimpl(available), Offset.m1372getYimpl(available)));
    }

    public void onReady(@NotNull WindowInsetsAnimationController controller, int types) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.animationController = controller;
        this.isControllerRequested = false;
        CancellableContinuation cancellableContinuation = this.continuation;
        if (cancellableContinuation != null) {
            cancellableContinuation.r(controller, new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.onReady.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.f93236a;
                }
            });
        }
        this.continuation = null;
    }
}
