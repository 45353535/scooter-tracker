package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "id", "", "getId$annotations", "()V", "getId", "()I", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SemanticsModifier extends Modifier.Element {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return b.a(semanticsModifier, predicate);
        }

        @Deprecated
        public static boolean any(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return b.b(semanticsModifier, predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull SemanticsModifier semanticsModifier, R r10, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) b.c(semanticsModifier, r10, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull SemanticsModifier semanticsModifier, R r10, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) b.d(semanticsModifier, r10, operation);
        }

        @Deprecated
        public static int getId(@NotNull SemanticsModifier semanticsModifier) {
            return a.a(semanticsModifier);
        }

        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull SemanticsModifier semanticsModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return androidx.compose.ui.a.a(semanticsModifier, other);
        }
    }

    int getId();

    @NotNull
    SemanticsConfiguration getSemanticsConfiguration();
}
