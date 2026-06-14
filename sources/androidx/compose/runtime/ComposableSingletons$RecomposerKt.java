package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$RecomposerKt {

    @NotNull
    public static final ComposableSingletons$RecomposerKt INSTANCE = new ComposableSingletons$RecomposerKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f19lambda1 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.f93236a;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091980426, i10, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda-1.<anonymous> (Recomposer.kt:383)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1225getLambda1$runtime_release() {
        return f19lambda1;
    }
}
