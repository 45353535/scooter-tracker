package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
public final class ComposableSingletons$TabRowKt {

    @NotNull
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f14lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(182187156, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:140)");
            }
            TabRowDefaults.INSTANCE.m1154Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f15lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1480449365, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:235)");
            }
            TabRowDefaults.INSTANCE.m1154Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m993getLambda1$material_release() {
        return f14lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m994getLambda2$material_release() {
        return f15lambda2;
    }
}
