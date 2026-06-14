package androidx.compose.material;

import androidx.activity.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1631148337);
        if ((i11 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i10, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i12) {
                return e.a(this, intrinsicMeasureScope, list2, i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i12) {
                return e.b(this, intrinsicMeasureScope, list2, i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
                int height;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                long jM3910copyZbe2FdA$default = Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                List<? extends Measurable> list2 = measurables;
                final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).mo3011measureBRTryo0(jM3910copyZbe2FdA$default));
                }
                Iterator it2 = arrayList.iterator();
                int iMax = 0;
                while (it2.hasNext()) {
                    iMax = Math.max(iMax, ((Placeable) it2.next()).getWidth());
                }
                int size = arrayList.size();
                final Integer[] numArr = new Integer[size];
                for (int i12 = 0; i12 < size; i12++) {
                    numArr[i12] = 0;
                }
                List<Dp> list3 = list;
                int size2 = arrayList.size();
                int height2 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    Placeable placeable = (Placeable) arrayList.get(i13);
                    if (i13 > 0) {
                        int i14 = i13 - 1;
                        height = ((Placeable) arrayList.get(i14)).getHeight() - ((Placeable) arrayList.get(i14)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        height = 0;
                    }
                    int iMax2 = Math.max(0, (Layout.mo302roundToPx0680j_4(list3.get(i13).m3965unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - height);
                    numArr[i13] = Integer.valueOf(iMax2 + height2);
                    height2 += iMax2 + placeable.getHeight();
                }
                return MeasureScope.CC.p(Layout, iMax, height2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        List<Placeable> list4 = arrayList;
                        Integer[] numArr2 = numArr;
                        int size3 = list4.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            Placeable.PlacementScope.placeRelative$default(layout, list4.get(i15), 0, numArr2[i15].intValue(), 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i12) {
                return e.c(this, intrinsicMeasureScope, list2, i12);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i12) {
                return e.d(this, intrinsicMeasureScope, list2, i12);
            }
        };
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
        int i12 = (((((i10 >> 6) & 14) | (i10 & 112)) << 9) & 7168) | 6;
        if (!s.a(composerStartRestartGroup.getApplier())) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
        Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 9) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.BaselinesOffsetColumn.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                ListItemKt.BaselinesOffsetColumn(list, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ListItem(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r19, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, boolean r22, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1045OffsetToBaselineOrCenterKz89ssw(final float f10, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i12, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return e.a(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return e.b(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* JADX INFO: renamed from: measure-3p2s80s */
                public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
                    int iMax;
                    final int iM4070getYimpl;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final Placeable placeableMo3011measureBRTryo0 = measurables.get(0).mo3011measureBRTryo0(Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                    int i14 = placeableMo3011measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i14 != Integer.MIN_VALUE) {
                        iM4070getYimpl = Layout.mo302roundToPx0680j_4(f10) - i14;
                        iMax = Math.max(Constraints.m3920getMinHeightimpl(j10), placeableMo3011measureBRTryo0.getHeight() + iM4070getYimpl);
                    } else {
                        iMax = Math.max(Constraints.m3920getMinHeightimpl(j10), placeableMo3011measureBRTryo0.getHeight());
                        iM4070getYimpl = IntOffset.m4070getYimpl(Alignment.INSTANCE.getCenter().mo1265alignKFBX0sM(IntSize.INSTANCE.m4116getZeroYbymL2g(), IntSizeKt.IntSize(0, iMax - placeableMo3011measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return MeasureScope.CC.p(Layout, placeableMo3011measureBRTryo0.getWidth(), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo3011measureBRTryo0, 0, iM4070getYimpl, 0.0f, 4, null);
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return e.c(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return e.d(this, intrinsicMeasureScope, list, i14);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i14 = ((((i12 & 112) | ((i12 >> 6) & 14)) << 9) & 7168) | 6;
            if (!s.a(composerStartRestartGroup.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1248constructorimpl = Updater.m1248constructorimpl(composerStartRestartGroup);
            Updater.m1255setimpl(composerM1248constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1255setimpl(composerM1248constructorimpl, density, companion.getSetDensity());
            Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i14 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                ListItemKt.m1045OffsetToBaselineOrCenterKz89ssw(f10, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
            }
        });
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(final TextStyle textStyle, final float f10, final Function2<? super Composer, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

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
                    ComposerKt.traceEventStart(-830176860, i10, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:422)");
                }
                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f10))};
                final TextStyle textStyle2 = textStyle;
                final Function2<Composer, Integer, Unit> function22 = function2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer, 1665877604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt.applyTextStyle.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.f93236a;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11) {
                        if ((i11 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1665877604, i11, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:423)");
                        }
                        TextKt.ProvideTextStyle(textStyle2, function22, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
