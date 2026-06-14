package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.yandex.div.internal.widget.TransientView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\nH\u0016J6\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "Landroidx/transition/Visibility;", "()V", "onAppear", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "Landroidx/transition/TransitionValues;", "startVisibility", "", "endValues", "endVisibility", "onDisappear", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OutlineAwareVisibility extends Visibility {
    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues startValues, int startVisibility, @Nullable final TransitionValues endValues, int endVisibility) {
        View view = endValues != null ? endValues.view : null;
        final TransientView transientView = view instanceof TransientView ? (TransientView) view : null;
        if (transientView != null) {
            transientView.transitionStarted(endValues.view);
        }
        addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onAppear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(endValues.view);
                }
                this.removeListener(this);
            }
        });
        return super.onAppear(sceneRoot, startValues, startVisibility, endValues, endVisibility);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @Nullable final TransitionValues startValues, int startVisibility, @Nullable TransitionValues endValues, int endVisibility) {
        View view = startValues != null ? startValues.view : null;
        final TransientView transientView = view instanceof TransientView ? (TransientView) view : null;
        if (transientView != null) {
            transientView.transitionStarted(startValues.view);
        }
        addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onDisappear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.transitionFinished(startValues.view);
                }
                this.removeListener(this);
            }
        });
        return super.onDisappear(sceneRoot, startValues, startVisibility, endValues, endVisibility);
    }
}
