package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u009d\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a£\u0001\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00122\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0017\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScaffoldKt {

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m3951constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1095Scaffold27mzLpw(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r41, @org.jetbrains.annotations.Nullable androidx.compose.material.ScaffoldState r42, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, int r47, boolean r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, boolean r50, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r51, float r52, long r53, long r55, long r57, long r59, long r61, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m1095Scaffold27mzLpw(androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1096ScaffoldLayoutMDYNRJg(final boolean z10, final int i10, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i11) {
        boolean z11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1401632215);
        if ((i11 & 14) == 0) {
            z11 = z10;
            i12 = (composerStartRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            z11 = z10;
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 = i10;
            i12 |= composerStartRestartGroup.changed(i13) ? 32 : 16;
        } else {
            i13 = i10;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((2995931 & i12) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401632215, i12, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {function2, function22, function23, FabPosition.m1025boximpl(i13), Boolean.valueOf(z11), function24, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i14 = 0;
            boolean zChanged = false;
            for (int i15 = 7; i14 < i15; i15 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                i14++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final boolean z12 = z11;
                final int i16 = i12;
                final int i17 = i13;
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1098invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1098invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, long j10) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int iM3919getMaxWidthimpl = Constraints.m3919getMaxWidthimpl(j10);
                        final int iM3918getMaxHeightimpl = Constraints.m3918getMaxHeightimpl(j10);
                        final long jM3910copyZbe2FdA$default = Constraints.m3910copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final int i18 = i17;
                        final boolean z13 = z12;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        final int i19 = i16;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.CC.p(SubcomposeLayout, iM3919getMaxWidthimpl, iM3918getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
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

                            /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.Placeable.PlacementScope r29) {
                                /*
                                    Method dump skipped, instruction units count: 884
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.AnonymousClass1.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i18) {
                ScaffoldKt.m1096ScaffoldLayoutMDYNRJg(z10, i10, function2, function3, function22, function23, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1569641925);
        if ((i11 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}
