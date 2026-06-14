package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import bg.b;
import com.ironsource.C4240b4;
import eg.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¼\u0001\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¼\u0001\u0010#\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a¸\u0001\u0010(\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a*\u0010+\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a-\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0011H\u0003¢\u0006\u0004\b7\u00108\u001a\u001e\u0010<\u001a\u00020\u00192\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0082\b¢\u0006\u0004\b<\u0010=\"\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@\"\u0014\u0010B\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010D\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, d2 = {"", "pageCount", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "", C4240b4.i.W, "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "", "Landroidx/compose/runtime/Composable;", "pageContent", "HorizontalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "VerticalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Pager-wKDqQAw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/pager/PageSize;FLandroidx/compose/foundation/gestures/Orientation;ILandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Pager", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateContentPaddings", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "isVertical", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeHorizontalFlingNestedScrollConnection", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeVerticalFlingNestedScrollConnection", "DEBUG", "Z", "LowVelocityAnimationDefaultDuration", "I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PagerKt {

    @NotNull
    private static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);

    @NotNull
    private static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0364 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HorizontalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m658HorizontalPagerAlbwjTQ(final int r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.pager.PagerState r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.pager.PageSize r37, int r38, float r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r41, boolean r42, boolean r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r44, @org.jetbrains.annotations.Nullable androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m658HorizontalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Pager-wKDqQAw, reason: not valid java name */
    public static final void m659PagerwKDqQAw(@NotNull final Modifier modifier, @NotNull final PagerState state, final int i10, @NotNull final PageSize pageSize, final float f10, @NotNull final Orientation orientation, final int i11, @Nullable Alignment.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @NotNull final PaddingValues contentPadding, @NotNull final SnapFlingBehavior flingBehavior, final boolean z10, final boolean z11, @Nullable final Function1<? super Integer, ? extends Object> function1, @NotNull final NestedScrollConnection pageNestedScrollConnection, @NotNull final Function3<? super Integer, ? super Composer, ? super Integer, Unit> pageContent, @Nullable Composer composer, final int i12, final int i13, final int i14) {
        Dp dp;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pageSize, "pageSize");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(pageNestedScrollConnection, "pageNestedScrollConnection");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-765777783);
        Alignment.Vertical centerVertically = (i14 & 128) != 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
        Alignment.Horizontal centerHorizontally = (i14 & 256) != 0 ? Alignment.INSTANCE.getCenterHorizontally() : horizontal;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-765777783, i12, i13, "androidx.compose.foundation.pager.Pager (Pager.kt:240)");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + i11).toString());
        }
        boolean z12 = orientation == Orientation.Vertical;
        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        final boolean z13 = z12;
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged = composerStartRestartGroup.changed(contentPadding) | composerStartRestartGroup.changed(orientation) | composerStartRestartGroup.changed(layoutDirection);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Dp.m3949boximpl(calculateContentPaddings(contentPadding, orientation, layoutDirection));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final float fM3965unboximpl = ((Dp) objRememberedValue).m3965unboximpl();
        int i15 = i12 & 112;
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(flingBehavior) | composerStartRestartGroup.changed(state);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new PagerWrapperFlingBehavior(flingBehavior, state);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objRememberedValue2;
        Dp dpM3949boximpl = Dp.m3949boximpl(f10);
        Dp dpM3949boximpl2 = Dp.m3949boximpl(f10);
        int i16 = (i12 >> 6) & 896;
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged3 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(dpM3949boximpl2);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            dp = dpM3949boximpl;
            objRememberedValue3 = new PagerKt$Pager$2$1(density, state, f10, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        } else {
            dp = dpM3949boximpl;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(density, state, dp, (Function2) objRememberedValue3, composerStartRestartGroup, i15 | 4096 | i16);
        int i17 = (i12 >> 3) & 14;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(state);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new PagerKt$Pager$3$1(state, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(state, (Function2<? super CoroutineScope, ? super Continuation, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i17 | 64);
        composerStartRestartGroup.startReplaceableGroup(1445594592);
        Modifier modifierPagerSemantics = z10 ? pagerSemantics(Modifier.INSTANCE, state, z13, composerStartRestartGroup, i15 | 6) : Modifier.INSTANCE;
        composerStartRestartGroup.endReplaceableGroup();
        final Alignment.Vertical vertical2 = centerVertically;
        final Alignment.Horizontal horizontal2 = centerHorizontally;
        BoxWithConstraintsKt.BoxWithConstraints(modifier.then(modifierPagerSemantics), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1677736225, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                invoke(boxWithConstraintsScope, composer2, num.intValue());
                return Unit.f93236a;
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.BoxWithConstraintsScope r24, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r25, int r26) {
                /*
                    Method dump skipped, instruction units count: 418
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$4.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
            }
        }), composerStartRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$Pager$5
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
                PagerKt.m659PagerwKDqQAw(modifier, state, i10, pageSize, f10, orientation, i11, vertical2, horizontal2, contentPadding, flingBehavior, z10, z11, function1, pageNestedScrollConnection, pageContent, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt.SnapLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(@NotNull Density density, float f10) {
                int currentPage;
                LazyListItemInfo lazyListItemInfo;
                Intrinsics.checkNotNullParameter(density, "<this>");
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f10);
                LazyListItemInfo firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release();
                if (firstVisiblePage$foundation_release != null) {
                    currentPage = firstVisiblePage$foundation_release.getIndex();
                    if (f10 < 0.0f) {
                        currentPage++;
                    }
                } else {
                    currentPage = pagerState.getCurrentPage();
                }
                int i10 = currentPage;
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    lazyListItemInfo = visibleItemsInfo.get(i11);
                    if (lazyListItemInfo.getIndex() == i10) {
                        break;
                    }
                    i11++;
                }
                LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
                float f11 = ((i10 * pageSize$foundation_release) + fCalculateTargetValue) / pageSize$foundation_release;
                int iE = g.e(Math.abs((g.n(pagerSnapDistance.calculateTargetPage(i10, g.n((int) (f10 > 0.0f ? Math.ceil(f11) : Math.floor(f11)), 0, pagerState.getPageCount$foundation_release()), f10, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount$foundation_release()) - i10) * pageSize$foundation_release) - Math.abs(lazyListItemInfo2 != null ? lazyListItemInfo2.getOffset() : 0), 0);
                return iE == 0 ? iE : iE * Math.signum(f10);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(@NotNull Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0.0f;
                }
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int size2 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    size2 += visibleItemsInfo.get(i10).getSize();
                }
                return size2 / layoutInfo.getVisibleItemsInfo().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            @NotNull
            public b calculateSnappingOffsetBounds(@NotNull Density density) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                float f10 = Float.NEGATIVE_INFINITY;
                float f11 = Float.POSITIVE_INFINITY;
                for (int i10 = 0; i10 < size; i10++) {
                    float fCalculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i10), PagerStateKt.getSnapAlignmentStartToStart());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f10) {
                        f10 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f11) {
                        f11 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return g.b(f10, f11);
            }

            @NotNull
            public final LazyListLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo$foundation_release();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0365 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: VerticalPager-AlbwjTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m660VerticalPagerAlbwjTQ(final int r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.pager.PagerState r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r36, @org.jetbrains.annotations.Nullable androidx.compose.foundation.pager.PageSize r37, int r38, float r39, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r40, @org.jetbrains.annotations.Nullable androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r41, boolean r42, boolean r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r44, @org.jetbrains.annotations.Nullable androidx.compose.ui.input.nestedscroll.NestedScrollConnection r45, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m660VerticalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateContentPaddings(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        Orientation orientation2 = Orientation.Vertical;
        return Dp.m3951constructorimpl((orientation == orientation2 ? paddingValues.getTop() : paddingValues.mo399calculateLeftPaddingu2uoSUM(layoutDirection)) + (orientation == orientation2 ? paddingValues.getBottom() : paddingValues.mo400calculateRightPaddingu2uoSUM(layoutDirection)));
    }

    private static final void debugLog(Function0<String> function0) {
    }

    @Composable
    private static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z10, Composer composer, int i10) {
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i10, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
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
                if (z10) {
                    final PagerState pagerState2 = pagerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.pageUp$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, coroutineScope2));
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    SemanticsPropertiesKt.pageDown$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, coroutineScope3));
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final CoroutineScope coroutineScope4 = coroutineScope;
                SemanticsPropertiesKt.pageLeft$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, coroutineScope4));
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final CoroutineScope coroutineScope5 = coroutineScope;
                SemanticsPropertiesKt.pageRight$default(semantics, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, coroutineScope5));
                    }
                }, 1, null);
            }
        }, 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        i.d(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        i.d(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }
}
