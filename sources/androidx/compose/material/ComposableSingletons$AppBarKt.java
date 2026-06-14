package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$AppBarKt {

    @NotNull
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f6lambda1 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.f93236a;
        }

        @Composable
        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            if ((i10 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-771938130, i10, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:80)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m985getLambda1$material_release() {
        return f6lambda1;
    }
}
