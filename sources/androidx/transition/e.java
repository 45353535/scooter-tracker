package androidx.transition;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionEnd(transition);
    }

    public static void b(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionStart(transition);
    }
}
