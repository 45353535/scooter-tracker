package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.webkit.Profile;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "installFor", "Lkotlin/Function0;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/AbstractComposeView;", com.taurusx.tax.f.y.f66058y, "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ViewCompositionStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v10) {
                    Intrinsics.checkNotNullParameter(v10, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v10) {
                    Intrinsics.checkNotNullParameter(v10, "v");
                    view.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener(r02);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    view.removeOnAttachStateChangeListener(r02);
                }
            };
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v10) {
                    Intrinsics.checkNotNullParameter(v10, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v10) {
                    Intrinsics.checkNotNullParameter(v10, "v");
                    if (PoolingContainer.isWithinPoolingContainer(view)) {
                        return;
                    }
                    view.disposeComposition();
                }
            };
            view.addOnAttachStateChangeListener(r02);
            final PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    view.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(view, poolingContainerListener);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    view.removeOnAttachStateChangeListener(r02);
                    PoolingContainer.removePoolingContainerListener(view, poolingContainerListener);
                }
            };
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @NotNull
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull final AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!view.isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final ?? r12 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View v10) {
                        Intrinsics.checkNotNullParameter(v10, "v");
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
                        AbstractComposeView abstractComposeView = view;
                        if (lifecycleOwner != null) {
                            ref$ObjectRef.f93280b = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                            view.removeOnAttachStateChangeListener(this);
                        } else {
                            throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View v10) {
                        Intrinsics.checkNotNullParameter(v10, "v");
                    }
                };
                view.addOnAttachStateChangeListener(r12);
                ref$ObjectRef.f93280b = new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        view.removeOnAttachStateChangeListener(r12);
                    }
                };
                return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
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
                        ((Function0) ref$ObjectRef.f93280b).invoke();
                    }
                };
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                return ViewCompositionStrategy_androidKt.installForLifecycle(view, lifecycleOwner.getLifecycle());
            }
            throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    @NotNull
    Function0<Unit> installFor(@NotNull AbstractComposeView view);

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;)V", "installFor", "Lkotlin/Function0;", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;

        @NotNull
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(@NotNull Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0<Unit> installFor(@NotNull AbstractComposeView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return ViewCompositionStrategy_androidKt.installForLifecycle(view, this.lifecycle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisposeOnLifecycleDestroyed(@NotNull LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        }
    }
}
