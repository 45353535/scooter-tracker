package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$ScaffoldKt {

    @NotNull
    public static final ComposableSingletons$ScaffoldKt INSTANCE = new ComposableSingletons$ScaffoldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f9lambda1 = ComposableLambdaKt.composableLambdaInstance(2069405901, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-1$1
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
                ComposerKt.traceEventStart(2069405901, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-1.<anonymous> (Scaffold.kt:161)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f10lambda2 = ComposableLambdaKt.composableLambdaInstance(-231850563, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-2$1
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
                ComposerKt.traceEventStart(-231850563, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-2.<anonymous> (Scaffold.kt:162)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f11lambda3 = ComposableLambdaKt.composableLambdaInstance(-147687984, false, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return Unit.f93236a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SnackbarHostState it, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 14) == 0) {
                i10 |= composer.changed(it) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-147687984, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:163)");
            }
            SnackbarHostKt.SnackbarHost(it, null, null, composer, i10 & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f12lambda4 = ComposableLambdaKt.composableLambdaInstance(-900670499, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-4$1
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
                ComposerKt.traceEventStart(-900670499, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-4.<anonymous> (Scaffold.kt:164)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m988getLambda1$material_release() {
        return f9lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m989getLambda2$material_release() {
        return f10lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material_release, reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m990getLambda3$material_release() {
        return f11lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$material_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m991getLambda4$material_release() {
        return f12lambda4;
    }
}
