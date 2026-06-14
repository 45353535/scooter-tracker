package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BasicTextKt {

    @NotNull
    public static final ComposableSingletons$BasicTextKt INSTANCE = new ComposableSingletons$BasicTextKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-1495080691, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1495080691, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextKt.lambda-1.<anonymous> (BasicText.kt:254)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m708getLambda1$foundation_release() {
        return f4lambda1;
    }
}
