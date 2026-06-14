package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "", "Lcom/yandex/div/core/view2/Div2View;", "divView", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "", "postTransitions", "()V", "", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$TransitionData;", "Landroid/view/View;", TypedValues.AttributesType.S_TARGET, "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "getChange", "(Ljava/util/List;Landroid/view/View;)Ljava/util/List;", "Landroid/view/ViewGroup;", "root", "", "endTransitions", "beginDelayedTransitions", "(Landroid/view/ViewGroup;Z)V", "runTransitions", "Landroidx/transition/Transition;", "transition", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "changeType", "putTransition", "(Landroidx/transition/Transition;Landroid/view/View;Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;)V", "getLastChange", "(Landroid/view/View;)Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "Lcom/yandex/div/core/view2/Div2View;", "", "pendingTransitions", "Ljava/util/List;", "activeTransitions", "posted", "Z", "ChangeType", "TransitionData", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTransitionHandler {

    @NotNull
    private final Div2View divView;
    private boolean posted;

    @NotNull
    private List<TransitionData> pendingTransitions = new ArrayList();

    @NotNull
    private List<TransitionData> activeTransitions = new ArrayList();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "", "<init>", "()V", "Visibility", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ChangeType {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType;", "new", "", "(I)V", "getNew", "()I", "apply", "", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Visibility extends ChangeType {
            private final int new;

            public Visibility(int i10) {
                super(null);
                this.new = i10;
            }

            public void apply(@NotNull View view) {
                view.setVisibility(this.new);
            }

            public final int getNew() {
                return this.new;
            }
        }

        public /* synthetic */ ChangeType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ChangeType() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivTransitionHandler$TransitionData;", "", "transition", "Landroidx/transition/Transition;", TypedValues.AttributesType.S_TARGET, "Landroid/view/View;", "changes", "", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler$ChangeType$Visibility;", "savedChanges", "(Landroidx/transition/Transition;Landroid/view/View;Ljava/util/List;Ljava/util/List;)V", "getChanges", "()Ljava/util/List;", "getSavedChanges", "getTarget", "()Landroid/view/View;", "getTransition", "()Landroidx/transition/Transition;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionData {

        @NotNull
        private final List<ChangeType.Visibility> changes;

        @NotNull
        private final List<ChangeType.Visibility> savedChanges;

        @NotNull
        private final View target;

        @NotNull
        private final Transition transition;

        public TransitionData(@NotNull Transition transition, @NotNull View view, @NotNull List<ChangeType.Visibility> list, @NotNull List<ChangeType.Visibility> list2) {
            this.transition = transition;
            this.target = view;
            this.changes = list;
            this.savedChanges = list2;
        }

        @NotNull
        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        @NotNull
        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }

        @NotNull
        public final View getTarget() {
            return this.target;
        }

        @NotNull
        public final Transition getTransition() {
            return this.transition;
        }
    }

    public DivTransitionHandler(@NotNull Div2View div2View) {
        this.divView = div2View;
    }

    private final void beginDelayedTransitions(ViewGroup root, boolean endTransitions) {
        if (!root.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (endTransitions) {
            TransitionManager.endTransitions(root);
        }
        final TransitionSet transitionSet = new TransitionSet();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(((TransitionData) it.next()).getTransition());
        }
        transitionSet.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                this.activeTransitions.clear();
                transitionSet.removeListener(this);
            }
        });
        TransitionManager.beginDelayedTransition(root, transitionSet);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }

    static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z10);
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = Intrinsics.areEqual(transitionData.getTarget(), view) ? (ChangeType.Visibility) CollectionsKt.lastOrNull((List) transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new Runnable() { // from class: m7.b
            @Override // java.lang.Runnable
            public final void run() {
                DivTransitionHandler.postTransitions$lambda$0(this.f94475b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler divTransitionHandler) {
        if (divTransitionHandler.posted) {
            beginDelayedTransitions$default(divTransitionHandler, null, false, 3, null);
        }
        divTransitionHandler.posted = false;
    }

    @Nullable
    public final ChangeType.Visibility getLastChange(@NotNull View target) {
        ChangeType.Visibility visibility = (ChangeType.Visibility) CollectionsKt.lastOrNull((List) getChange(this.pendingTransitions, target));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) CollectionsKt.lastOrNull((List) getChange(this.activeTransitions, target));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    public final void putTransition(@NotNull Transition transition, @NotNull View view, @NotNull ChangeType.Visibility changeType) {
        this.pendingTransitions.add(new TransitionData(transition, view, CollectionsKt.mutableListOf(changeType), new ArrayList()));
        postTransitions();
    }

    public final void runTransitions(@NotNull ViewGroup root, boolean endTransitions) {
        this.posted = false;
        beginDelayedTransitions(root, endTransitions);
    }
}
