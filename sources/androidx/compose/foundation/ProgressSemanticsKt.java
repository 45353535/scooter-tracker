package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lbg/b;", "valueRange", "", "steps", "progressSemantics", "(Landroidx/compose/ui/Modifier;FLbg/b;I)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProgressSemanticsKt {
    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier, final float f10, @NotNull final bg.b valueRange, final int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, new ProgressBarRangeInfo(((Number) g.q(Float.valueOf(f10), valueRange)).floatValue(), valueRange, i10));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f10, bg.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = g.b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return progressSemantics(modifier, f10, bVar, i10);
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semantics, ProgressBarRangeInfo.INSTANCE.getIndeterminate());
            }
        });
    }
}
