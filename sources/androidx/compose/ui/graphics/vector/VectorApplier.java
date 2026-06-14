package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4424m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "insertBottomUp", "", FirebaseAnalytics.Param.INDEX, "", C4424m2.f43617p, "insertTopDown", "move", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "onClear", "remove", "asGroup", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorApplier(@NotNull VNode root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        asGroup(getCurrent()).move(from, to, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        GroupComponent groupComponentAsGroup = asGroup(getRoot());
        groupComponentAsGroup.remove(0, groupComponentAsGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        asGroup(getCurrent()).remove(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        asGroup(getCurrent()).insertAt(index, instance);
    }
}
