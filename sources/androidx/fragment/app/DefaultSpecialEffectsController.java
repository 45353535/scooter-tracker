package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003*+,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u000e\u001a\u00020\fH\u0002J@\u0010\u0018\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0002JL\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010%\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002J&\u0010&\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)H\u0002¨\u0006-"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "applyContainerChanges", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "captureTransitioningViews", "transitioningViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "executeOperations", "operations", "", "isPop", "", "findNamedViews", "namedViews", "", "", "startAnimations", "animationInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "awaitingContainerChanges", "", "startedAnyTransition", "startedTransitions", "", "startTransitions", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationInfo", "SpecialEffectsInfo", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull CancellationSignal signal, boolean z10) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.isPop = z10;
        }

        @Nullable
        public final FragmentAnim.AnimationOrAnimator getAnimation(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getSignal", "()Landroidx/core/os/CancellationSignal;", "completeSpecialEffect", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static class SpecialEffectsInfo {

        @NotNull
        private final SpecialEffectsController.Operation operation;

        @NotNull
        private final CancellationSignal signal;

        public SpecialEffectsInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }

        @NotNull
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        @NotNull
        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 implements Animation.AnimationListener {
        final /* synthetic */ AnimationInfo $animationInfo;
        final /* synthetic */ SpecialEffectsController.Operation $operation;
        final /* synthetic */ View $viewToAnimate;
        final /* synthetic */ DefaultSpecialEffectsController this$0;

        AnonymousClass3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, AnimationInfo animationInfo) {
            this.$operation = operation;
            this.this$0 = defaultSpecialEffectsController;
            this.$viewToAnimate = view;
            this.$animationInfo = animationInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController this$0, View view, AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.getContainer().endViewTransition(view);
            animationInfo.completeSpecialEffect();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewGroup container = this.this$0.getContainer();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
            final View view = this.$viewToAnimate;
            final AnimationInfo animationInfo = this.$animationInfo;
            container.post(new Runnable() { // from class: androidx.fragment.app.h
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.AnonymousClass3.onAnimationEnd$lambda$0(defaultSpecialEffectsController, view, animationInfo);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    private final void captureTransitioningViews(ArrayList<View> transitioningViews, View view) {
        if (!(view instanceof ViewGroup)) {
            if (transitioningViews.contains(view)) {
                return;
            }
            transitioningViews.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (transitioningViews.contains(view)) {
                return;
            }
            transitioningViews.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                captureTransitioningViews(transitioningViews, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void findNamedViews(Map<String, View> namedViews, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            namedViews.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(namedViews, child);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        });
    }

    private final void startAnimations(List<AnimationInfo> animationInfos, List<SpecialEffectsController.Operation> awaitingContainerChanges, boolean startedAnyTransition, Map<SpecialEffectsController.Operation, Boolean> startedTransitions) {
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z10 = false;
        for (final AnimationInfo animationInfo : animationInfos) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Intrinsics.areEqual(startedTransitions.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z11 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z11) {
                                awaitingContainerChanges.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(@NotNull Animator anim) {
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z11) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.a
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z10 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (startedAnyTransition) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z10) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new AnonymousClass3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                    }
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.b
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> transitionInfos, List<SpecialEffectsController.Operation> awaitingContainerChanges, final boolean isPop, final SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        View view;
        LinkedHashMap linkedHashMap;
        String str3;
        Object obj4;
        View view2;
        Object obj5;
        SpecialEffectsController.Operation operation;
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        View view3;
        boolean z10;
        final Rect rect;
        int i10;
        int i11;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        final SpecialEffectsController.Operation operation2 = lastIn;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : transitionInfos) {
            if (!((TransitionInfo) obj6).isVisibilityUnchanged()) {
                arrayList3.add(obj6);
            }
        }
        ArrayList<TransitionInfo> arrayList4 = new ArrayList();
        for (Object obj7 : arrayList3) {
            if (((TransitionInfo) obj7).getHandlingImpl() != null) {
                arrayList4.add(obj7);
            }
        }
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : arrayList4) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl != null && handlingImpl != fragmentTransitionImpl) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl = handlingImpl;
        }
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : transitionInfos) {
                linkedHashMap2.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap2;
        }
        View view4 = new View(defaultSpecialEffectsController.getContainer().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Iterator<TransitionInfo> it = transitionInfos.iterator();
        Object obj8 = null;
        View view5 = null;
        boolean z11 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            obj = obj8;
            str = FragmentManager.TAG;
            if (!zHasNext) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || firstOut == null || operation2 == null) {
                arrayList = arrayList6;
                view4 = view4;
                linkedHashMap2 = linkedHashMap2;
                obj8 = obj;
                arrayList5 = arrayList5;
                arrayMap = arrayMap;
                view5 = view5;
                rect2 = rect2;
                arrayList6 = arrayList;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                View view6 = view5;
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = firstOut.getFragment().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view7 = view4;
                Rect rect3 = rect2;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = size;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                    }
                    i12++;
                    size = i13;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                Pair pair = !isPop ? TuplesKt.to(firstOut.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : TuplesKt.to(firstOut.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                int i14 = 0;
                for (int size2 = sharedElementSourceNames.size(); i14 < size2; size2 = size2) {
                    arrayMap.put(sharedElementSourceNames.get(i14), sharedElementTargetNames2.get(i14));
                    i14++;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    Iterator<String> it2 = sharedElementTargetNames2.iterator();
                    while (true) {
                        Iterator<String> it3 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                        it2 = it3;
                        arrayList6 = arrayList6;
                    }
                    arrayList2 = arrayList6;
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it4 = sharedElementSourceNames.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v(FragmentManager.TAG, "Name: " + it4.next());
                    }
                } else {
                    arrayList2 = arrayList6;
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                View view8 = firstOut.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view8, "firstOut.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap2, view8);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + firstOut);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i15 = size3 - 1;
                            String str4 = sharedElementSourceNames.get(size3);
                            View view9 = arrayMap2.get(str4);
                            if (view9 == null) {
                                arrayMap.remove(str4);
                                i11 = i15;
                            } else {
                                i11 = i15;
                                if (!Intrinsics.areEqual(str4, ViewCompat.getTransitionName(view9))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view9), (String) arrayMap.remove(str4));
                                }
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size3 = i11;
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                View view10 = operation2.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view10, "lastIn.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap3, view10);
                arrayMap3.retainAll(sharedElementTargetNames2);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i16 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view11 = arrayMap3.get(name);
                            if (view11 == null) {
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                String strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, name);
                                if (strFindKeyForValue != null) {
                                    arrayMap.remove(strFindKeyForValue);
                                }
                                i10 = i16;
                            } else {
                                i10 = i16;
                                if (!Intrinsics.areEqual(name, ViewCompat.getTransitionName(view11))) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, name);
                                    if (strFindKeyForValue2 != null) {
                                        arrayMap.put(strFindKeyForValue2, ViewCompat.getTransitionName(view11));
                                    }
                                }
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size4 = i10;
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> collectionKeySet = arrayMap.keySet();
                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap2, collectionKeySet);
                Collection<String> collectionValues = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap3, collectionValues);
                if (arrayMap.isEmpty()) {
                    arrayList5.clear();
                    arrayList2.clear();
                    view5 = view6;
                    linkedHashMap2 = linkedHashMap3;
                    view4 = view7;
                    rect2 = rect3;
                    arrayList6 = arrayList2;
                    obj8 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), firstOut.getFragment(), isPop, arrayMap2, true);
                    OneShotPreDrawListener.add(defaultSpecialEffectsController.getContainer(), new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(operation2, firstOut, isPop, arrayMap3);
                        }
                    });
                    arrayList5.addAll(arrayMap2.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view3 = view6;
                    } else {
                        view3 = arrayMap2.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl.setEpicenter(objWrapTransitionInSet, view3);
                    }
                    ArrayList<View> arrayList7 = arrayList2;
                    arrayList7.addAll(arrayMap3.values());
                    if (sharedElementTargetNames2.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = false;
                        final View view12 = arrayMap3.get(sharedElementTargetNames2.get(0));
                        if (view12 != null) {
                            rect = rect3;
                            OneShotPreDrawListener.add(defaultSpecialEffectsController.getContainer(), new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$10(fragmentTransitionImpl, view12, rect);
                                }
                            });
                            z11 = true;
                        }
                        fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view7, arrayList5);
                        arrayList = arrayList7;
                        ArrayMap arrayMap4 = arrayMap;
                        Rect rect4 = rect;
                        fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap3.put(firstOut, bool);
                        linkedHashMap3.put(operation2, bool);
                        view5 = view3;
                        obj8 = objWrapTransitionInSet;
                        arrayList5 = arrayList5;
                        arrayMap = arrayMap4;
                        rect2 = rect4;
                        view4 = view7;
                        linkedHashMap2 = linkedHashMap3;
                        arrayList6 = arrayList;
                    }
                    rect = rect3;
                    fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view7, arrayList5);
                    arrayList = arrayList7;
                    ArrayMap arrayMap42 = arrayMap;
                    Rect rect42 = rect;
                    fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList);
                    Boolean bool2 = Boolean.TRUE;
                    linkedHashMap3.put(firstOut, bool2);
                    linkedHashMap3.put(operation2, bool2);
                    view5 = view3;
                    obj8 = objWrapTransitionInSet;
                    arrayList5 = arrayList5;
                    arrayMap = arrayMap42;
                    rect2 = rect42;
                    view4 = view7;
                    linkedHashMap2 = linkedHashMap3;
                    arrayList6 = arrayList;
                }
            }
        }
        ArrayList<View> arrayList8 = arrayList5;
        ArrayMap arrayMap5 = arrayMap;
        ArrayList<View> arrayList9 = arrayList6;
        View view13 = view5;
        boolean z12 = false;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view14 = view4;
        Rect rect5 = rect2;
        boolean z13 = true;
        ArrayList arrayList10 = new ArrayList();
        Object objMergeTransitionsTogether = null;
        Object objMergeTransitionsTogether2 = null;
        for (TransitionInfo transitionInfo3 : transitionInfos) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                linkedHashMap4.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation3 = transitionInfo3.getOperation();
                boolean z14 = (obj == null || !(operation3 == firstOut || operation3 == operation2)) ? z12 : z13;
                if (objCloneTransition != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    final ArrayList<View> arrayList11 = new ArrayList<>();
                    View view15 = operation3.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view15, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList11, view15);
                    if (z14) {
                        if (operation3 == firstOut) {
                            arrayList11.removeAll(CollectionsKt.toSet(arrayList8));
                        } else {
                            arrayList11.removeAll(CollectionsKt.toSet(arrayList9));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        fragmentTransitionImpl.addTarget(objCloneTransition, view14);
                        obj2 = objMergeTransitionsTogether;
                        obj4 = objMergeTransitionsTogether2;
                        obj3 = objCloneTransition;
                        str3 = str;
                        operation = operation3;
                        view = view13;
                        linkedHashMap = linkedHashMap5;
                        view2 = view14;
                        obj5 = obj;
                    } else {
                        fragmentTransitionImpl.addTargets(objCloneTransition, arrayList11);
                        obj2 = objMergeTransitionsTogether;
                        obj3 = objCloneTransition;
                        view = view13;
                        linkedHashMap = linkedHashMap5;
                        str3 = str;
                        obj4 = objMergeTransitionsTogether2;
                        view2 = view14;
                        obj5 = obj;
                        fragmentTransitionImpl.scheduleRemoveTargets(obj3, obj3, arrayList11, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation = operation3;
                            awaitingContainerChanges.remove(operation);
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList11);
                            arrayList12.remove(operation.getFragment().mView);
                            fragmentTransitionImpl.scheduleHideFragmentView(obj3, operation.getFragment().mView, arrayList12);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList11);
                                }
                            });
                        } else {
                            operation = operation3;
                        }
                    }
                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z11) {
                            fragmentTransitionImpl.setEpicenter(obj3, rect5);
                        }
                    } else {
                        fragmentTransitionImpl.setEpicenter(obj3, view);
                    }
                    linkedHashMap.put(operation, Boolean.TRUE);
                    if (transitionInfo3.getIsOverlapAllowed()) {
                        objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj3, null);
                        linkedHashMap4 = linkedHashMap;
                        view13 = view;
                        obj = obj5;
                        objMergeTransitionsTogether2 = obj4;
                    } else {
                        linkedHashMap4 = linkedHashMap;
                        view13 = view;
                        obj = obj5;
                        objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(obj4, obj3, null);
                        objMergeTransitionsTogether = obj2;
                    }
                    view14 = view2;
                    str = str3;
                    z12 = false;
                    z13 = true;
                    defaultSpecialEffectsController = this;
                    operation2 = lastIn;
                } else if (!z14) {
                    linkedHashMap4.put(operation3, Boolean.FALSE);
                    transitionInfo3.completeSpecialEffect();
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        String str5 = str;
        Object obj9 = obj;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, obj9);
        if (objMergeTransitionsInSequence == null) {
            return linkedHashMap6;
        }
        ArrayList<TransitionInfo> arrayList13 = new ArrayList();
        for (Object obj10 : transitionInfos) {
            if (!((TransitionInfo) obj10).isVisibilityUnchanged()) {
                arrayList13.add(obj10);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList13) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation4 = transitionInfo4.getOperation();
            boolean z15 = obj9 != null && (operation4 == firstOut || operation4 == lastIn);
            if (transition == null && !z15) {
                str2 = str5;
            } else if (ViewCompat.isLaidOut(getContainer())) {
                str2 = str5;
                fragmentTransitionImpl.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(transitionInfo4, operation4);
                    }
                });
            } else {
                if (FragmentManager.isLoggingEnabled(2)) {
                    str2 = str5;
                    Log.v(str2, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation4);
                } else {
                    str2 = str5;
                }
                transitionInfo4.completeSpecialEffect();
            }
            str5 = str2;
        }
        String str6 = str5;
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap6;
        }
        FragmentTransition.setViewVisibility(arrayList10, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl.prepareSetNameOverridesReordered(arrayList9);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(str6, ">>>>> Beginning transition <<<<<");
            Log.v(str6, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View sharedElementFirstOutViews : arrayList8) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view16 = sharedElementFirstOutViews;
                Log.v(str6, "View: " + view16 + " Name: " + ViewCompat.getTransitionName(view16));
            }
            Log.v(str6, ">>>>> SharedElementLastInViews <<<<<");
            for (View sharedElementLastInViews : arrayList9) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view17 = sharedElementLastInViews;
                Log.v(str6, "View: " + view17 + " Name: " + ViewCompat.getTransitionName(view17));
            }
        }
        fragmentTransitionImpl.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl.setNameOverridesReordered(getContainer(), arrayList8, arrayList9, arrayListPrepareSetNameOverridesReordered, arrayMap5);
        FragmentTransition.setViewVisibility(arrayList10, 0);
        fragmentTransitionImpl.swapSharedElementTargets(obj9, arrayList8, arrayList9);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, ArrayMap lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z10, lastInViews, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> operations) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) operations)).getFragment();
        for (SpecialEffectsController.Operation operation : operations) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeOperations(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.executeOperations(java.util.List, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0007R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "signal", "Landroidx/core/os/CancellationSignal;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/core/os/CancellationSignal;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @Nullable
        private final Object sharedElementTransition;

        @Nullable
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@NotNull SpecialEffectsController.Operation operation, @NotNull CancellationSignal signal, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z10 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z10 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z10 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z11 ? z10 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        @Nullable
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @Nullable
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        /* JADX INFO: renamed from: isOverlapAllowed, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object transition) {
            if (transition == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(transition)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(transition)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
