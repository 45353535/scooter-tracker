package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
public final class ComposableSingletons$SnackbarHostKt {

    @NotNull
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarData, Composer, Integer, Unit> f13lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SnackbarData it, @Nullable Composer composer, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (composer.changed(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            SnackbarKt.m1107SnackbarsPrSdHI(it, null, false, null, 0L, 0L, 0L, 0.0f, composer, i11 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m992getLambda1$material_release() {
        return f13lambda1;
    }
}
