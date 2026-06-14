package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a6\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a2\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\u0011"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "isVertical", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScrollKt {
    @NotNull
    public static final Modifier horizontalScroll(@NotNull Modifier modifier, @NotNull ScrollState state, boolean z10, @Nullable FlingBehavior flingBehavior, boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z11, flingBehavior, z10, false);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return horizontalScroll(modifier, scrollState, z10, flingBehavior, z11);
    }

    @Composable
    @NotNull
    public static final ScrollState rememberScrollState(final int i10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-1464256199);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.INSTANCE.getSaver();
        Integer numValueOf = Integer.valueOf(i10);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(numValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ScrollState invoke() {
                    return new ScrollState(i10);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m1261rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, boolean z12) {
        final ScrollState scrollState2;
        final boolean z13;
        final FlingBehavior flingBehavior2;
        final boolean z14;
        final boolean z15;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            scrollState2 = scrollState;
            z13 = z10;
            flingBehavior2 = flingBehavior;
            z14 = z11;
            z15 = z12;
            noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("scroll");
                    inspectorInfo.getProperties().set("state", scrollState2);
                    inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z13));
                    inspectorInfo.getProperties().set("flingBehavior", flingBehavior2);
                    inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z14));
                    inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z15));
                }
            };
        } else {
            scrollState2 = scrollState;
            z13 = z10;
            flingBehavior2 = flingBehavior;
            z14 = z11;
            z15 = z12;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        final FlingBehavior flingBehavior3 = flingBehavior2;
        final boolean z16 = z13;
        final boolean z17 = z15;
        final boolean z18 = z14;
        final ScrollState scrollState3 = scrollState2;
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ScrollKt.scroll.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1478351300);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:264)");
                }
                ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer, 6);
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
                Modifier.Companion companion = Modifier.INSTANCE;
                final boolean z19 = z16;
                final boolean z20 = z17;
                final boolean z21 = z18;
                final ScrollState scrollState4 = scrollState3;
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
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
                        final ScrollState scrollState5 = scrollState4;
                        Function0<Float> function0 = new Function0<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(scrollState5.getValue());
                            }
                        };
                        final ScrollState scrollState6 = scrollState4;
                        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(function0, new Function0<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(scrollState6.getMaxValue());
                            }
                        }, z19);
                        if (z20) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                        } else {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                        }
                        if (z21) {
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final boolean z22 = z20;
                            final ScrollState scrollState7 = scrollState4;
                            SemanticsPropertiesKt.scrollBy$default(semantics, null, new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1

                                /* JADX INFO: renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {285, MBSupportMuteAdType.INTERSTITIAL_VIDEO}, m = "invokeSuspend")
                                static final class C00251 extends k implements Function2<CoroutineScope, Continuation, Object> {
                                    final /* synthetic */ boolean $isVertical;
                                    final /* synthetic */ ScrollState $state;
                                    final /* synthetic */ float $x;
                                    final /* synthetic */ float $y;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00251(boolean z10, ScrollState scrollState, float f10, float f11, Continuation continuation) {
                                        super(2, continuation);
                                        this.$isVertical = z10;
                                        this.$state = scrollState;
                                        this.$y = f10;
                                        this.$x = f11;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.a
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        return new C00251(this.$isVertical, this.$state, this.$y, this.$x, continuation);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
                                    
                                        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(r4, r5, null, r10, 2, null) == r0) goto L17;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
                                    
                                        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(r1, r2, null, r10, 2, null) == r0) goto L17;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
                                    
                                        return r0;
                                     */
                                    @Override // kotlin.coroutines.jvm.internal.a
                                    @org.jetbrains.annotations.Nullable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                                        /*
                                            r10 = this;
                                            java.lang.Object r0 = pf.b.g()
                                            int r1 = r10.label
                                            r2 = 2
                                            r3 = 1
                                            if (r1 == 0) goto L1f
                                            if (r1 == r3) goto L1a
                                            if (r1 != r2) goto L12
                                            kotlin.d.b(r11)
                                            goto L53
                                        L12:
                                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                            r11.<init>(r0)
                                            throw r11
                                        L1a:
                                            kotlin.d.b(r11)
                                            r4 = r10
                                            goto L53
                                        L1f:
                                            kotlin.d.b(r11)
                                            boolean r11 = r10.$isVertical
                                            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState"
                                            if (r11 == 0) goto L3d
                                            androidx.compose.foundation.ScrollState r4 = r10.$state
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r1)
                                            float r5 = r10.$y
                                            r10.label = r3
                                            r6 = 0
                                            r8 = 2
                                            r9 = 0
                                            r7 = r10
                                            java.lang.Object r11 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(r4, r5, r6, r7, r8, r9)
                                            r4 = r7
                                            if (r11 != r0) goto L53
                                            goto L52
                                        L3d:
                                            r4 = r10
                                            r11 = r1
                                            androidx.compose.foundation.ScrollState r1 = r4.$state
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r11)
                                            r11 = r2
                                            float r2 = r4.$x
                                            r4.label = r11
                                            r3 = 0
                                            r5 = 2
                                            r6 = 0
                                            java.lang.Object r11 = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(r1, r2, r3, r4, r5, r6)
                                            if (r11 != r0) goto L53
                                        L52:
                                            return r0
                                        L53:
                                            kotlin.Unit r11 = kotlin.Unit.f93236a
                                            return r11
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.AnonymousClass1.C00251.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                        return ((C00251) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                                    return invoke(f10.floatValue(), f11.floatValue());
                                }

                                @NotNull
                                public final Boolean invoke(float f10, float f11) {
                                    i.d(coroutineScope2, null, null, new C00251(z22, scrollState7, f11, f10, null), 3, null);
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null);
                Orientation orientation = z17 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier modifierThen = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifierSemantics$default, orientation), overscrollEffect).then(ScrollableKt.scrollable(companion, scrollState3, orientation, overscrollEffect, z18, scrollableDefaults.reverseDirection((LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z16), flingBehavior3, scrollState3.getInternalInteractionSource())).then(new ScrollingLayoutModifier(scrollState3, z16, z17));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    @NotNull
    public static final Modifier verticalScroll(@NotNull Modifier modifier, @NotNull ScrollState state, boolean z10, @Nullable FlingBehavior flingBehavior, boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z11, flingBehavior, z10, true);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return verticalScroll(modifier, scrollState, z10, flingBehavior, z11);
    }
}
