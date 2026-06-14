package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28271b;

    public ExpandableBehavior() {
        this.f28271b = 0;
    }

    private boolean b(boolean z10) {
        if (!z10) {
            return this.f28271b == 1;
        }
        int i10 = this.f28271b;
        return i10 == 0 || i10 == 2;
    }

    @Nullable
    public static <T extends ExpandableBehavior> T from(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof ExpandableBehavior) {
            return cls.cast(behavior);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ExpandableWidget c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = dependencies.get(i10);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    protected abstract boolean d(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!b(expandableWidget.isExpanded())) {
            return false;
        }
        this.f28271b = expandableWidget.isExpanded() ? 1 : 2;
        return d((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final View view, int i10) {
        final ExpandableWidget expandableWidgetC;
        if (view.isLaidOut() || (expandableWidgetC = c(coordinatorLayout, view)) == null || !b(expandableWidgetC.isExpanded())) {
            return false;
        }
        final int i11 = expandableWidgetC.isExpanded() ? 1 : 2;
        this.f28271b = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.f28271b == i11) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    ExpandableWidget expandableWidget = expandableWidgetC;
                    expandableBehavior.d((View) expandableWidget, view, expandableWidget.isExpanded(), false);
                }
                return false;
            }
        });
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28271b = 0;
    }
}
