package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import com.ironsource.C4257c4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/Modifier$Element;", "onGloballyPositioned", "", C4257c4.f42802f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OnGloballyPositionedModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return androidx.compose.ui.b.a(onGloballyPositionedModifier, predicate);
        }

        @Deprecated
        public static boolean any(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return androidx.compose.ui.b.b(onGloballyPositionedModifier, predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) androidx.compose.ui.b.c(onGloballyPositionedModifier, r10, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r10, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) androidx.compose.ui.b.d(onGloballyPositionedModifier, r10, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return androidx.compose.ui.a.a(onGloballyPositionedModifier, other);
        }
    }

    void onGloballyPositioned(@NotNull LayoutCoordinates coordinates);
}
