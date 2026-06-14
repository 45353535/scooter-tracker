package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "layout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutModifierKt {
    @NotNull
    public static final Modifier layout(@NotNull Modifier modifier, @NotNull Function3<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measure) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        return modifier.then(new LayoutModifierElement(measure));
    }
}
