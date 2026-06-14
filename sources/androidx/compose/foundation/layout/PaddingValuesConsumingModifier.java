package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/layout/WindowInsets;", "modifierLocalInsets", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {

    @NotNull
    private final PaddingValues paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesConsumingModifier(@NotNull PaddingValues paddingValues, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo, null);
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    @NotNull
    public WindowInsets calculateInsets(@NotNull WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), modifierLocalInsets);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PaddingValuesConsumingModifier) {
            return Intrinsics.areEqual(((PaddingValuesConsumingModifier) other).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
