package com.yandex.div.core.view2.animations;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0080\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/transition/TransitionSet;", "", "Landroidx/transition/Transition;", "transitions", "", "plusAssign", "(Landroidx/transition/TransitionSet;Ljava/lang/Iterable;)V", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TransitionsKt {
    public static final void plusAssign(@NotNull TransitionSet transitionSet, @NotNull Iterable<? extends Transition> iterable) {
        Iterator<? extends Transition> it = iterable.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(it.next());
        }
    }
}
