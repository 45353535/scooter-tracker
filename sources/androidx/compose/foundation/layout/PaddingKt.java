package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaddingKt {
    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m411PaddingValues0680j_4(float f10) {
        return new PaddingValues(f10, f10, f10, f10, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m412PaddingValuesYgX7TsA(float f10, float f11) {
        return new PaddingValues(f10, f11, f10, f11, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m413PaddingValuesYgX7TsA$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        return m412PaddingValuesYgX7TsA(f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m414PaddingValuesa9UjIt4(float f10, float f11, float f12, float f13) {
        return new PaddingValues(f10, f11, f12, f13, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m415PaddingValuesa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.m3951constructorimpl(0);
        }
        return m414PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m416absolutePaddingqDBjuR0(@NotNull Modifier absolutePadding, final float f10, final float f11, final float f12, final float f13) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingModifier(f10, f11, f12, f13, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("top", Dp.m3949boximpl(f11));
                inspectorInfo.getProperties().set("right", Dp.m3949boximpl(f12));
                inspectorInfo.getProperties().set("bottom", Dp.m3949boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m417absolutePaddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.m3951constructorimpl(0);
        }
        return m416absolutePaddingqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo400calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo399calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo399calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo400calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m418padding3ABfNKs(@NotNull Modifier padding, final float f10) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f10, f10, f10, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m419paddingVpY3zN4(@NotNull Modifier padding, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f10, f11, f10, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("vertical", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m420paddingVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        return m419paddingVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m421paddingqDBjuR0(@NotNull Modifier padding, final float f10, final float f11, final float f12, final float f13) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f10, f11, f12, f13, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("start", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("top", Dp.m3949boximpl(f11));
                inspectorInfo.getProperties().set("end", Dp.m3949boximpl(f12));
                inspectorInfo.getProperties().set("bottom", Dp.m3949boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m422paddingqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.m3951constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.m3951constructorimpl(0);
        }
        return m421paddingqDBjuR0(modifier, f10, f11, f12, f13);
    }
}
