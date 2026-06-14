package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\n\b \u0018\u0000 52\u00020\u0001:\u0003567B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u0016J\r\u0010$\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0016J\r\u0010%\u001a\u00020\u0012¢\u0006\u0004\b%\u0010\u0016J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0016J%\u0010)\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103¨\u00068"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "findPendingOperation", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;", "findRunningOperation", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/FragmentStateManager;", "fragmentStateManager", "", "enqueue", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "updateFinalState", "()V", "getAwaitingCompletionLifecycleImpact", "(Landroidx/fragment/app/FragmentStateManager;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "enqueueAdd", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/FragmentStateManager;)V", "enqueueShow", "(Landroidx/fragment/app/FragmentStateManager;)V", "enqueueHide", "enqueueRemove", "", "isPop", "updateOperationDirection", "(Z)V", "markPostponedState", "forcePostponedExecutePendingOperations", "executePendingOperations", "forceCompleteAllOperations", "", "operations", "executeOperations", "(Ljava/util/List;Z)V", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "", "pendingOperations", "Ljava/util/List;", "runningOperations", "operationDirectionIsPop", "Z", "isContainerPostponed", y.f66058y, "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;

    @NotNull
    private final List<Operation> pendingOperations;

    @NotNull
    private final List<Operation> runningOperations;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        private Companion() {
        }

        @NotNull
        public final SpecialEffectsController getOrCreateController(@NotNull ViewGroup container, @NotNull SpecialEffectsControllerFactory factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            int i10 = R.id.special_effects_controller_view_tag;
            Object tag = container.getTag(i10);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController specialEffectsControllerCreateController = factory.createController(container);
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerCreateController, "factory.createController(container)");
            container.setTag(i10, specialEffectsControllerCreateController);
            return specialEffectsControllerCreateController;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;Landroidx/core/os/CancellationSignal;)V", "complete", "", "onStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class FragmentStateManagerOperation extends Operation {

        @NotNull
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentStateManagerOperation(@NotNull Operation.State finalState, @NotNull Operation.LifecycleImpact lifecycleImpact, @NotNull FragmentStateManager fragmentStateManager, @NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Fragment fragment = fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragment, cancellationSignal);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() != Operation.LifecycleImpact.ADDING) {
                if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = this.fragmentStateManager.getFragment();
                    Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = getFragment().requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                this.fragmentStateManager.addViewToContainer();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002+,B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020 H\u0017J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\tJ\u0016\u0010'\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragment", "Landroidx/fragment/app/Fragment;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/CancellationSignal;)V", "completionListeners", "", "Ljava/lang/Runnable;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "<set-?>", "", "isCanceled", "()Z", "isComplete", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "specialEffectsSignals", "", "addCompletionListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MenuActionType.CANCEL, "complete", "completeSpecialEffect", "signal", "markStartedSpecialEffect", "mergeWith", "onStart", "toString", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Operation {

        @NotNull
        private final List<Runnable> completionListeners;

        @NotNull
        private State finalState;

        @NotNull
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;

        @NotNull
        private LifecycleImpact lifecycleImpact;

        @NotNull
        private final Set<CancellationSignal> specialEffectsSignals;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "(Ljava/lang/String;I)V", "applyState", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", y.f66058y, "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", TypedValues.TransitionType.S_FROM, "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final State asOperationState(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : from(view.getVisibility());
                }

                @NotNull
                public final State from(int visibility) {
                    if (visibility == 0) {
                        return State.VISIBLE;
                    }
                    if (visibility == 4) {
                        return State.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                private Companion() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @NotNull
            public static final State from(int i10) {
                return INSTANCE.from(i10);
            }

            public final void applyState(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact, @NotNull Fragment fragment, @NotNull CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.w
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation._init_$lambda$0(this.f4613a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Operation this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.cancel();
        }

        public final void addCompletionListener(@NotNull Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.specialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            Iterator it = CollectionsKt.toMutableSet(this.specialEffectsSignals).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).cancel();
            }
        }

        @CallSuper
        public void complete() {
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeSpecialEffect(@NotNull CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        @NotNull
        public final State getFinalState() {
            return this.finalState;
        }

        @NotNull
        public final Fragment getFragment() {
            return this.fragment;
        }

        @NotNull
        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* JADX INFO: renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: isComplete, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void markStartedSpecialEffect(@NotNull CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void mergeWith(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = State.VISIBLE;
                    this.lifecycleImpact = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                return;
            }
            if (i10 == 3 && this.finalState != State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public void onStart() {
        }

        public final void setFinalState(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(@NotNull LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        @NotNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State finalState, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            Operation operationFindPendingOperation = findPendingOperation(fragment);
            if (operationFindPendingOperation != null) {
                operationFindPendingOperation.mergeWith(finalState, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(finalState, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$2(this.f4609b, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.v
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$3(this.f4611b, fragmentStateManagerOperation);
                }
            });
            Unit unit = Unit.f93236a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.getIsCanceled()) {
                break;
            }
        }
        return (Operation) next;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.getIsCanceled()) {
                break;
            }
        }
        return (Operation) next;
    }

    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull FragmentManager fragmentManager) {
        return INSTANCE.getOrCreateController(viewGroup, fragmentManager);
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.INSTANCE.from(viewRequireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(@NotNull Operation.State finalState, @NotNull FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(@NotNull FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(@NotNull FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(@NotNull FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(@NotNull List<Operation> operations, boolean isPop);

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.container)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                if (!this.pendingOperations.isEmpty()) {
                    List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                    this.runningOperations.clear();
                    for (Operation operation : mutableList) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.cancel();
                        if (!operation.getIsComplete()) {
                            this.runningOperations.add(operation);
                        }
                    }
                    updateFinalState();
                    List<Operation> mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(mutableList2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator<Operation> it = mutableList2.iterator();
                    while (it.hasNext()) {
                        it.next().onStart();
                    }
                    executeOperations(mutableList2, this.operationDirectionIsPop);
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forceCompleteAllOperations() {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = ViewCompat.isAttachedToWindow(this.container);
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                Iterator<Operation> it = this.pendingOperations.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
                for (Operation operation : CollectionsKt.toMutableList((Collection) this.runningOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + operation);
                    }
                    operation.cancel();
                }
                for (Operation operation2 : CollectionsKt.toMutableList((Collection) this.pendingOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                    }
                    operation2.cancel();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    @Nullable
    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@NotNull FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Operation operationFindPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = operationFindPendingOperation != null ? operationFindPendingOperation.getLifecycleImpact() : null;
        Operation operationFindRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = operationFindRunningOperation != null ? operationFindRunningOperation.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final void markPostponedState() {
        Operation operationPrevious;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operationPrevious = null;
                        break;
                    }
                    operationPrevious = listIterator.previous();
                    Operation operation = operationPrevious;
                    Operation.State.Companion companion = Operation.State.INSTANCE;
                    View view = operation.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    Operation.State stateAsOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && stateAsOperationState != state) {
                        break;
                    }
                }
                Operation operation2 = operationPrevious;
                Fragment fragment = operation2 != null ? operation2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void updateOperationDirection(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    @NotNull
    public static final SpecialEffectsController getOrCreateController(@NotNull ViewGroup viewGroup, @NotNull SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return INSTANCE.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }
}
