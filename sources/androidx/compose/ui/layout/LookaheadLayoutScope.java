package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u000f\u001a\u00020\u0002*\u00020\u00022$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\bH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutScope;", "", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "", "onPlaced", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "intermediateLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LookaheadLayoutScope {
    @NotNull
    Modifier intermediateLayout(@NotNull Modifier modifier, @NotNull Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4);

    @NotNull
    Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> function2);
}
