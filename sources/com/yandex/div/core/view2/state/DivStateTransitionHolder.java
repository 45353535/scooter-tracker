package com.yandex.div.core.view2.state;

import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.Transition;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0012¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/state/DivStateTransitionHolder;", "", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "", "scheduleClean", "()V", "Landroidx/transition/Transition;", "transition", "append", "(Landroidx/transition/Transition;)V", "clear", "Lcom/yandex/div/core/view2/Div2View;", "", "transitions", "Ljava/util/List;", "", "cleanScheduled", "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivStateTransitionHolder {
    private boolean cleanScheduled;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final List<Transition> transitions = new ArrayList();

    public DivStateTransitionHolder(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    private void scheduleClean() {
        if (this.cleanScheduled) {
            return;
        }
        final Div2View div2View = this.div2View;
        OneShotPreDrawListener.add(div2View, new Runnable() { // from class: com.yandex.div.core.view2.state.DivStateTransitionHolder$scheduleClean$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.clear();
            }
        });
        this.cleanScheduled = true;
    }

    public void append(@NotNull Transition transition) {
        this.transitions.add(transition);
        scheduleClean();
    }

    public void clear() {
        this.transitions.clear();
    }
}
