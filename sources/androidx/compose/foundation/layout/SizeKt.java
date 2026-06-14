package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a-\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010 \u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010!\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\u0016\u0010\"\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a!\u0010#\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a-\u0010&\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001f\u001a!\u0010*\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010%\u001a-\u0010,\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010%\u001a)\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010\u001f\u001a!\u0010.\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aA\u00106\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010%\u001a-\u0010=\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010%\u001a)\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010\u001f\u001a!\u0010/\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u00105\u001aA\u0010B\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010:\u001a!\u00101\u001a\u00020\u001a*\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010%\u001a-\u0010E\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010\u001f\u001a \u0010G\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010H\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a \u0010I\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "createFillHeightModifier", "fraction", "", "createFillSizeModifier", "createFillWidthModifier", "createWrapContentHeightModifier", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "createWrapContentSizeModifier", "Landroidx/compose/ui/Alignment;", "createWrapContentWidthModifier", "Landroidx/compose/ui/Alignment$Horizontal;", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "wrapContentSize", "wrapContentWidth", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SizeKt {

    @NotNull
    private static final WrapContentModifier WrapContentHeightCenter;

    @NotNull
    private static final WrapContentModifier WrapContentHeightTop;

    @NotNull
    private static final WrapContentModifier WrapContentSizeCenter;

    @NotNull
    private static final WrapContentModifier WrapContentSizeTopStart;

    @NotNull
    private static final WrapContentModifier WrapContentWidthCenter;

    @NotNull
    private static final WrapContentModifier WrapContentWidthStart;

    @NotNull
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);

    @NotNull
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);

    @NotNull
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);

    static {
        Alignment.Companion companion = Alignment.INSTANCE;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    private static final FillModifier createFillHeightModifier(final float f10) {
        return new FillModifier(Direction.Vertical, f10, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillHeightModifier.1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxHeight");
                $receiver.getProperties().set("fraction", Float.valueOf(f10));
            }
        });
    }

    private static final FillModifier createFillSizeModifier(final float f10) {
        return new FillModifier(Direction.Both, f10, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillSizeModifier.1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxSize");
                $receiver.getProperties().set("fraction", Float.valueOf(f10));
            }
        });
    }

    private static final FillModifier createFillWidthModifier(final float f10) {
        return new FillModifier(Direction.Horizontal, f10, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createFillWidthModifier.1
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxWidth");
                $receiver.getProperties().set("fraction", Float.valueOf(f10));
            }
        });
    }

    private static final WrapContentModifier createWrapContentHeightModifier(final Alignment.Vertical vertical, final boolean z10) {
        return new WrapContentModifier(Direction.Vertical, z10, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4060boximpl(m469invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m469invoke5SAbXVA(long j10, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                return IntOffsetKt.IntOffset(0, vertical.align(0, IntSize.m4110getHeightimpl(j10)));
            }
        }, vertical, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentHeight");
                $receiver.getProperties().set("align", vertical);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z10));
            }
        });
    }

    private static final WrapContentModifier createWrapContentSizeModifier(final Alignment alignment, final boolean z10) {
        return new WrapContentModifier(Direction.Both, z10, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4060boximpl(m470invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m470invoke5SAbXVA(long j10, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return alignment.mo1265alignKFBX0sM(IntSize.INSTANCE.m4116getZeroYbymL2g(), j10, layoutDirection);
            }
        }, alignment, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentSize");
                $receiver.getProperties().set("align", alignment);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z10));
            }
        });
    }

    private static final WrapContentModifier createWrapContentWidthModifier(final Alignment.Horizontal horizontal, final boolean z10) {
        return new WrapContentModifier(Direction.Horizontal, z10, new Function2<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                return IntOffset.m4060boximpl(m471invoke5SAbXVA(intSize.getPackedValue(), layoutDirection));
            }

            /* JADX INFO: renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m471invoke5SAbXVA(long j10, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return IntOffsetKt.IntOffset(horizontal.align(0, IntSize.m4111getWidthimpl(j10), layoutDirection), 0);
            }
        }, horizontal, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.2
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
            public final void invoke2(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentWidth");
                $receiver.getProperties().set("align", horizontal);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z10));
            }
        });
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m445defaultMinSizeVpY3zN4(@NotNull Modifier defaultMinSize, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsModifier(f10, f11, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("defaultMinSize");
                inspectorInfo.getProperties().set("minWidth", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m446defaultMinSizeVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m445defaultMinSizeVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier, float f10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f10 == 1.0f ? FillWholeMaxHeight : createFillHeightModifier(f10));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxHeight(modifier, f10);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier, float f10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f10 == 1.0f ? FillWholeMaxSize : createFillSizeModifier(f10));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxSize(modifier, f10);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier, float f10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f10 == 1.0f ? FillWholeMaxWidth : createFillWidthModifier(f10));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxWidth(modifier, f10);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m447height3ABfNKs(@NotNull Modifier height, final float f10) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeModifier(0.0f, f10, 0.0f, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m448heightInVpY3zN4(@NotNull Modifier heightIn, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeModifier(0.0f, f10, 0.0f, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("max", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m449heightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m448heightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m450requiredHeight3ABfNKs(@NotNull Modifier requiredHeight, final float f10) {
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new SizeModifier(0.0f, f10, 0.0f, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m451requiredHeightInVpY3zN4(@NotNull Modifier requiredHeightIn, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeModifier(0.0f, f10, 0.0f, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("max", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m452requiredHeightInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m451requiredHeightInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m453requiredSize3ABfNKs(@NotNull Modifier requiredSize, final float f10) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f10, f10, f10, f10, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m454requiredSize6HolHcs(@NotNull Modifier requiredSize, long j10) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m455requiredSizeVpY3zN4(requiredSize, DpSize.m4049getWidthD9Ej5fM(j10), DpSize.m4047getHeightD9Ej5fM(j10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m455requiredSizeVpY3zN4(@NotNull Modifier requiredSize, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f10, f11, f10, f11, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("height", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m456requiredSizeInqDBjuR0(@NotNull Modifier requiredSizeIn, final float f10, final float f11, final float f12, final float f13) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeModifier(f10, f11, f12, f13, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", Dp.m3949boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", Dp.m3949boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", Dp.m3949boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m457requiredSizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m456requiredSizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m458requiredWidth3ABfNKs(@NotNull Modifier requiredWidth, final float f10) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeModifier(f10, 0.0f, f10, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m459requiredWidthInVpY3zN4(@NotNull Modifier requiredWidthIn, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new SizeModifier(f10, 0.0f, f11, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set("min", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("max", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m460requiredWidthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m459requiredWidthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m461size3ABfNKs(@NotNull Modifier size, final float f10) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f10, f10, f10, f10, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m462size6HolHcs(@NotNull Modifier size, long j10) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m463sizeVpY3zN4(size, DpSize.m4049getWidthD9Ej5fM(j10), DpSize.m4047getHeightD9Ej5fM(j10));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m463sizeVpY3zN4(@NotNull Modifier size, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f10, f11, f10, f11, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("height", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m464sizeInqDBjuR0(@NotNull Modifier sizeIn, final float f10, final float f11, final float f12, final float f13) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeModifier(f10, f11, f12, f13, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("minHeight", Dp.m3949boximpl(f11));
                inspectorInfo.getProperties().set("maxWidth", Dp.m3949boximpl(f12));
                inspectorInfo.getProperties().set("maxHeight", Dp.m3949boximpl(f13));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m465sizeInqDBjuR0$default(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m464sizeInqDBjuR0(modifier, f10, f11, f12, f13);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m466width3ABfNKs(@NotNull Modifier width, final float f10) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeModifier(f10, 0.0f, f10, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m3949boximpl(f10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m467widthInVpY3zN4(@NotNull Modifier widthIn, final float f10, final float f11) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeModifier(f10, 0.0f, f11, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m3949boximpl(f10));
                inspectorInfo.getProperties().set("max", Dp.m3949boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m468widthInVpY3zN4$default(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = Dp.INSTANCE.m3971getUnspecifiedD9Ej5fM();
        }
        return m467widthInVpY3zN4(modifier, f10, f11);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier, @NotNull Alignment.Vertical align, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterVertically()) || z10) ? (!Intrinsics.areEqual(align, companion.getTop()) || z10) ? createWrapContentHeightModifier(align, z10) : WrapContentHeightTop : WrapContentHeightCenter);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vertical = Alignment.INSTANCE.getCenterVertically();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentHeight(modifier, vertical, z10);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier, @NotNull Alignment align, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenter()) || z10) ? (!Intrinsics.areEqual(align, companion.getTopStart()) || z10) ? createWrapContentSizeModifier(align, z10) : WrapContentSizeTopStart : WrapContentSizeCenter);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentSize(modifier, alignment, z10);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier, @NotNull Alignment.Horizontal align, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        return modifier.then((!Intrinsics.areEqual(align, companion.getCenterHorizontally()) || z10) ? (!Intrinsics.areEqual(align, companion.getStart()) || z10) ? createWrapContentWidthModifier(align, z10) : WrapContentWidthStart : WrapContentWidthCenter);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            horizontal = Alignment.INSTANCE.getCenterHorizontally();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentWidth(modifier, horizontal, z10);
    }
}
