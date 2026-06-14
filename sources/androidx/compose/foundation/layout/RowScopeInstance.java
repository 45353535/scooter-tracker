package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedModifier;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J \u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0017J\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0004H\u0017J\u001c\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", Reporting.EventType.FILL, "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RowScopeInstance implements RowScope {

    @NotNull
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier, @NotNull final Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return modifier.then(new VerticalAlignModifier(alignment, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("align");
                inspectorInfo.setValue(alignment);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull final HorizontalAlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLine(alignmentLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("alignBy");
                inspectorInfo.setValue(alignmentLine);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier, final float f10, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f10 > 0.0d) {
            return modifier.then(new LayoutWeightImpl(f10, z10, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$weight$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                    Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                    inspectorInfo.setName("weight");
                    inspectorInfo.setValue(Float.valueOf(f10));
                    inspectorInfo.getProperties().set("weight", Float.valueOf(f10));
                    inspectorInfo.getProperties().set(Reporting.EventType.FILL, Boolean.valueOf(z10));
                }
            } : InspectableValueKt.getNoInspectorInfo()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier, @NotNull final Function1<? super Measured, Integer> alignmentLineBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return modifier.then(new SiblingsAlignedModifier.WithAlignmentLineBlock(alignmentLineBlock, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.RowScopeInstance$alignBy$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("alignBy");
                inspectorInfo.setValue(alignmentLineBlock);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
