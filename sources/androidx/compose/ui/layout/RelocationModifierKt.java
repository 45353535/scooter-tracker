package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aZ\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00012(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onProvideDestination", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "onPerformRelocation", "onRelocationRequest", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RelocationModifierKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier onRelocationRequest(@NotNull Modifier modifier, @NotNull Function2<? super Rect, ? super LayoutCoordinates, Rect> onProvideDestination, @NotNull Function3<? super Rect, ? super Rect, ? super Continuation, ? extends Object> onPerformRelocation) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onProvideDestination, "onProvideDestination");
        Intrinsics.checkNotNullParameter(onPerformRelocation, "onPerformRelocation");
        return modifier;
    }
}
