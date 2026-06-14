package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\f\u001a(\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tø\u0001\u0001¢\u0006\u0004\b\b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset", "absoluteOffset-VpY3zN4", "absoluteOffset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OffsetKt {
    @NotNull
    public static final Modifier absoluteOffset(@NotNull Modifier modifier, @NotNull final Function1<? super Density, IntOffset> offset) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return modifier.then(new OffsetPxModifier(offset, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("offset", offset);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m404absoluteOffsetVpY3zN4(@NotNull Modifier absoluteOffset, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(absoluteOffset, "$this$absoluteOffset");
        return absoluteOffset.then(new OffsetModifier(f10, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt$absoluteOffset-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("y", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m405absoluteOffsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        return m404absoluteOffsetVpY3zN4(modifier, f10, f11);
    }

    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier, @NotNull final Function1<? super Density, IntOffset> offset) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return modifier.then(new OffsetPxModifier(offset, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", offset);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m406offsetVpY3zN4(@NotNull Modifier offset, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return offset.then(new OffsetModifier(f10, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("x", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("y", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m407offsetVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        return m406offsetVpY3zN4(modifier, f10, f11);
    }
}
