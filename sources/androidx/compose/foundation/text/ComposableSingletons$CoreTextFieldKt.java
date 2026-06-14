package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
public final class ComposableSingletons$CoreTextFieldKt {

    @NotNull
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f5lambda1 = ComposableLambdaKt.composableLambdaInstance(671295101, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.f93236a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i10 & 14) == 0) {
                i10 |= composer.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:197)");
            }
            innerTextField.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m709getLambda1$foundation_release() {
        return f5lambda1;
    }
}
