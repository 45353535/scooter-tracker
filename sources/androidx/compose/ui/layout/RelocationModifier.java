package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RelocationModifier;", "Landroidx/compose/ui/Modifier$Element;", "computeDestination", "Landroidx/compose/ui/geometry/Rect;", "source", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "performRelocation", "", FirebaseAnalytics.Param.DESTINATION, "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface RelocationModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull RelocationModifier relocationModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return androidx.compose.ui.b.a(relocationModifier, predicate);
        }

        @Deprecated
        public static boolean any(@NotNull RelocationModifier relocationModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return androidx.compose.ui.b.b(relocationModifier, predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull RelocationModifier relocationModifier, R r10, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) androidx.compose.ui.b.c(relocationModifier, r10, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull RelocationModifier relocationModifier, R r10, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) androidx.compose.ui.b.d(relocationModifier, r10, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull RelocationModifier relocationModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return androidx.compose.ui.a.a(relocationModifier, other);
        }
    }

    @NotNull
    Rect computeDestination(@NotNull Rect source, @NotNull LayoutCoordinates layoutCoordinates);

    @Nullable
    Object performRelocation(@NotNull Rect rect, @NotNull Rect rect2, @NotNull Continuation continuation);
}
