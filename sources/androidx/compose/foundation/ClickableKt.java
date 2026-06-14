package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import eg.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aW\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0017\u001aE\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0018\u001a\u0089\u0001\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001d\u001aw\u0010\u0019\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001e\u001a©\u0001\u0010\u001f\u001a\u00020\f*\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b&\u001aQ\u0010'\u001a\u00020\u0001*\u00020(2\u0006\u0010)\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160$H\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"PressedInteractionSourceDisposableEffect", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pressedInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Ljava/util/Map;Landroidx/compose/runtime/Composer;I)V", "clickable", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "clickable-O2vRcR0", "clickable-XHw0xAI", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "gestureModifiers", "indicationScope", "Lkotlinx/coroutines/CoroutineScope;", "keyClickOffset", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/geometry/Offset;", "genericClickableWithoutGesture-bdNGguI", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pressPoint", "delayPressInteraction", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ClickableKt {
    @Composable
    public static final void PressedInteractionSourceDisposableEffect(@NotNull final MutableInteractionSource interactionSource, @NotNull final MutableState<PressInteraction.Press> pressedInteraction, @NotNull final Map<Key, PressInteraction.Press> currentKeyPressInteractions, @Nullable Composer composer, final int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1297229208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1297229208, i10, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.DisposableEffect(interactionSource, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<PressInteraction.Press> mutableState = pressedInteraction;
                final Map<Key, PressInteraction.Press> map = currentKeyPressInteractions;
                final MutableInteractionSource mutableInteractionSource = interactionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        PressInteraction.Press press = (PressInteraction.Press) mutableState.getValue();
                        if (press != null) {
                            mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
                            mutableState.setValue(null);
                        }
                        Iterator it = map.values().iterator();
                        while (it.hasNext()) {
                            mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
                        }
                        map.clear();
                    }
                };
            }
        }, composerStartRestartGroup, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, pressedInteraction, currentKeyPressInteractions, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m191clickableO2vRcR0(@NotNull Modifier clickable, @NotNull final MutableInteractionSource interactionSource, @Nullable Indication indication, boolean z10, @Nullable String str, @Nullable Role role, @NotNull final Function0<Unit> onClick) {
        final MutableInteractionSource mutableInteractionSource;
        final Indication indication2;
        final boolean z11;
        final String str2;
        final Role role2;
        Function0<Unit> function0;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            indication2 = indication;
            z11 = z10;
            str2 = str;
            role2 = role;
            noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("clickable");
                    inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z11));
                    inspectorInfo.getProperties().set("onClickLabel", str2);
                    inspectorInfo.getProperties().set("role", role2);
                    inspectorInfo.getProperties().set("onClick", onClick);
                    inspectorInfo.getProperties().set("indication", indication2);
                    inspectorInfo.getProperties().set("interactionSource", interactionSource);
                }
            };
            function0 = onClick;
            mutableInteractionSource = interactionSource;
        } else {
            mutableInteractionSource = interactionSource;
            indication2 = indication;
            z11 = z10;
            str2 = str;
            role2 = role;
            function0 = onClick;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        final Role role3 = role2;
        final boolean z12 = z11;
        final String str3 = str2;
        final Function0<Unit> function02 = function0;
        return ComposedModifierKt.composed(clickable, noInspectorInfo, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Modifier.Companion companion;
                Object clickableKt$clickable$4$gesture$1$1;
                MutableInteractionSource mutableInteractionSource2;
                Boolean bool;
                int i11 = 0;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(92076020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(92076020, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function02, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1841981561);
                if (z12) {
                    ClickableKt.PressedInteractionSourceDisposableEffect(mutableInteractionSource, mutableState, map, composer, 560);
                }
                composer.endReplaceableGroup();
                final Function0<Boolean> function0IsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue3;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState2) | composer.changed(function0IsComposeRootInScrollableContainer);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged || objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(mutableState2.getValue().booleanValue() || function0IsComposeRootInScrollableContainer.invoke().booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue4, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1360boximpl(Offset.INSTANCE.m1387getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue5;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Boolean boolValueOf = Boolean.valueOf(z12);
                Object objValueOf = Boolean.valueOf(z12);
                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource;
                Object[] objArr = {mutableState3, objValueOf, mutableInteractionSource4, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState};
                boolean z13 = z12;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged2 = false;
                for (int i12 = 6; i11 < i12; i12 = 6) {
                    zChanged2 |= composer.changed(objArr[i11]);
                    i11++;
                }
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    companion = companion3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    bool = boolValueOf;
                    clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(mutableState3, z13, mutableInteractionSource4, mutableState, stateRememberUpdatedState2, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(clickableKt$clickable$4$gesture$1$1);
                } else {
                    clickableKt$clickable$4$gesture$1$1 = objRememberedValue6;
                    companion = companion3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    bool = boolValueOf;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, mutableInteractionSource2, bool, (Function2) clickableKt$clickable$4$gesture$1$1);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue7 = composer.rememberedValue();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objRememberedValue7 == companion5.getEmpty()) {
                    objRememberedValue7 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ boolean all(Function1 function1) {
                            return androidx.compose.ui.b.a(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ boolean any(Function1 function1) {
                            return androidx.compose.ui.b.b(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                            return androidx.compose.ui.b.c(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                            return androidx.compose.ui.b.d(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            mutableState2.setValue((Boolean) scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        public /* synthetic */ Modifier then(Modifier modifier) {
                            return androidx.compose.ui.a.a(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion4.then((Modifier) objRememberedValue7);
                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource;
                Indication indication3 = indication2;
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                if (objRememberedValue8 == companion5.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue8 = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue8).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM199genericClickableWithoutGesturebdNGguI = ClickableKt.m199genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource5, indication3, coroutineScope, map, mutableState3, z12, str3, role3, null, null, function02);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM199genericClickableWithoutGesturebdNGguI;
            }
        });
    }

    /* JADX INFO: renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m192clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m191clickableO2vRcR0(modifier, mutableInteractionSource, indication, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : role, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m193clickableXHw0xAI(@NotNull Modifier clickable, final boolean z10, @Nullable final String str, @Nullable final Role role, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-756081143);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM191clickableO2vRcR0 = ClickableKt.m191clickableO2vRcR0(companion, (MutableInteractionSource) objRememberedValue, indication, z10, str, role, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM191clickableO2vRcR0;
            }
        });
    }

    /* JADX INFO: renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m194clickableXHw0xAI$default(Modifier modifier, boolean z10, String str, Role role, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        return m193clickableXHw0xAI(modifier, z10, str, role, function0);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final Modifier m195combinedClickableXVZzFYc(@NotNull Modifier combinedClickable, @NotNull final MutableInteractionSource interactionSource, @Nullable final Indication indication, final boolean z10, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1841718000);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1841718000, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
                }
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onClick, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function0, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function02, composer, 0);
                boolean z11 = function0 != null;
                boolean z12 = function02 != null;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LinkedHashMap();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Map map = (Map) objRememberedValue2;
                composer.startReplaceableGroup(1321107720);
                if (z10) {
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    final MutableInteractionSource mutableInteractionSource = interactionSource;
                    composer.startReplaceableGroup(511388516);
                    boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PressInteraction.Press press = (PressInteraction.Press) mutableState2.getValue();
                                        if (press != null) {
                                            mutableInteractionSource2.tryEmit(new PressInteraction.Cancel(press));
                                            mutableState2.setValue(null);
                                        }
                                    }
                                };
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    EffectsKt.DisposableEffect(boolValueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
                    ClickableKt.PressedInteractionSourceDisposableEffect(interactionSource, mutableState, map, composer, 560);
                }
                composer.endReplaceableGroup();
                final Function0<Boolean> function0IsComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue4;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(mutableState2) | composer.changed(function0IsComposeRootInScrollableContainer);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(mutableState2.getValue().booleanValue() || function0IsComposeRootInScrollableContainer.invoke().booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(objRememberedValue5, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue6 = composer.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1360boximpl(Offset.INSTANCE.m1387getZeroF1C5BW0()), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceableGroup();
                MutableState mutableState3 = (MutableState) objRememberedValue6;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChanged3 = false;
                Object[] objArr = {interactionSource, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z10)};
                Object objValueOf = Boolean.valueOf(z12);
                Object objValueOf2 = Boolean.valueOf(z10);
                Object objValueOf3 = Boolean.valueOf(z11);
                MutableInteractionSource mutableInteractionSource2 = interactionSource;
                Object[] objArr2 = {mutableState3, objValueOf, objValueOf2, stateRememberUpdatedState3, objValueOf3, stateRememberUpdatedState2, mutableInteractionSource2, mutableState, stateRememberUpdatedState4, stateRememberUpdatedState};
                boolean z13 = z10;
                composer.startReplaceableGroup(-568225417);
                for (int i11 = 0; i11 < 10; i11++) {
                    zChanged3 |= composer.changed(objArr2[i11]);
                }
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object clickableKt$combinedClickable$4$gesture$1$1 = new ClickableKt$combinedClickable$4$gesture$1$1(mutableState3, z12, z13, z11, stateRememberUpdatedState3, stateRememberUpdatedState2, mutableInteractionSource2, mutableState, stateRememberUpdatedState4, stateRememberUpdatedState, null);
                    composer.updateRememberedValue(clickableKt$combinedClickable$4$gesture$1$1);
                    objRememberedValue7 = clickableKt$combinedClickable$4$gesture$1$1;
                }
                composer.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, objArr, (Function2<? super PointerInputScope, ? super Continuation, ? extends Object>) objRememberedValue7);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue8 = composer.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue8 == companion4.getEmpty()) {
                    objRememberedValue8 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ boolean all(Function1 function1) {
                            return androidx.compose.ui.b.a(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ boolean any(Function1 function1) {
                            return androidx.compose.ui.b.b(this, function1);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
                            return androidx.compose.ui.b.c(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
                            return androidx.compose.ui.b.d(this, obj, function2);
                        }

                        @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            mutableState2.setValue((Boolean) scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                        }

                        @Override // androidx.compose.ui.Modifier
                        public /* synthetic */ Modifier then(Modifier modifier) {
                            return androidx.compose.ui.a.a(this, modifier);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = companion3.then((Modifier) objRememberedValue8);
                MutableInteractionSource mutableInteractionSource3 = interactionSource;
                Indication indication2 = indication;
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == companion4.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(e.f93267b, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue9 = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue9).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier modifierM199genericClickableWithoutGesturebdNGguI = ClickableKt.m199genericClickableWithoutGesturebdNGguI(modifierThen, modifierPointerInput, mutableInteractionSource3, indication2, coroutineScope, map, mutableState3, z10, str, role, str2, function0, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM199genericClickableWithoutGesturebdNGguI;
            }
        });
    }

    /* JADX INFO: renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m196combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i10, Object obj) {
        Function0 function04;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        Function0 function05;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        String str3 = (i10 & 8) != 0 ? null : str;
        Role role2 = (i10 & 16) != 0 ? null : role;
        String str4 = (i10 & 32) != 0 ? null : str2;
        Function0 function06 = (i10 & 64) != 0 ? null : function0;
        if ((i10 & 128) != 0) {
            function04 = null;
            modifier2 = modifier;
            indication2 = indication;
            function05 = function03;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            function04 = function02;
            modifier2 = modifier;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            function05 = function03;
        }
        return m195combinedClickableXVZzFYc(modifier2, mutableInteractionSource2, indication2, z11, str3, role2, str4, function06, function04, function05);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final Modifier m197combinedClickablecJG_KMw(@NotNull Modifier combinedClickable, final boolean z10, @Nullable final String str, @Nullable final Role role, @Nullable final String str2, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("onDoubleClick", function02);
                inspectorInfo.getProperties().set("onLongClick", function0);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1969174843);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969174843, i10, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierM195combinedClickableXVZzFYc = ClickableKt.m195combinedClickableXVZzFYc(companion, (MutableInteractionSource) objRememberedValue, indication, z10, str, role, str2, function0, function02, onClick);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM195combinedClickableXVZzFYc;
            }
        });
    }

    /* JADX INFO: renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m198combinedClickablecJG_KMw$default(Modifier modifier, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, Function0 function03, int i10, Object obj) {
        Function0 function04;
        Function0 function05;
        String str3;
        Function0 function06;
        String str4;
        Role role2;
        Modifier modifier2;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            role = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            function0 = null;
        }
        if ((i10 & 32) != 0) {
            function04 = null;
            str3 = str2;
            function05 = function03;
            str4 = str;
            function06 = function0;
            modifier2 = modifier;
            role2 = role;
        } else {
            function04 = function02;
            function05 = function03;
            str3 = str2;
            function06 = function0;
            str4 = str;
            role2 = role;
            modifier2 = modifier;
        }
        return m197combinedClickablecJG_KMw(modifier2, z10, str4, role2, str3, function06, function04, function05);
    }

    @NotNull
    /* JADX INFO: renamed from: genericClickableWithoutGesture-bdNGguI, reason: not valid java name */
    public static final Modifier m199genericClickableWithoutGesturebdNGguI(@NotNull Modifier genericClickableWithoutGesture, @NotNull Modifier gestureModifiers, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, @NotNull CoroutineScope indicationScope, @NotNull Map<Key, PressInteraction.Press> currentKeyPressInteractions, @NotNull State<Offset> keyClickOffset, boolean z10, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(indicationScope, "indicationScope");
        Intrinsics.checkNotNullParameter(currentKeyPressInteractions, "currentKeyPressInteractions");
        Intrinsics.checkNotNullParameter(keyClickOffset, "keyClickOffset");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey(genericClickableWithoutGesture_bdNGguI$clickSemantics(genericClickableWithoutGesture, role, str, function0, str2, z10, onClick), z10, currentKeyPressInteractions, keyClickOffset, indicationScope, onClick, interactionSource), interactionSource, indication), interactionSource, z10), z10, interactionSource).then(gestureModifiers);
    }

    /* JADX INFO: renamed from: genericClickableWithoutGesture-bdNGguI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m200genericClickableWithoutGesturebdNGguI$default(Modifier modifier, Modifier modifier2, MutableInteractionSource mutableInteractionSource, Indication indication, CoroutineScope coroutineScope, Map map, State state, boolean z10, String str, Role role, String str2, Function0 function0, Function0 function02, int i10, Object obj) {
        Function0 function03;
        Modifier modifier3;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        CoroutineScope coroutineScope2;
        Map map2;
        State state2;
        Function0 function04;
        boolean z11 = (i10 & 64) != 0 ? true : z10;
        String str3 = (i10 & 128) != 0 ? null : str;
        Role role2 = (i10 & 256) != 0 ? null : role;
        String str4 = (i10 & 512) != 0 ? null : str2;
        if ((i10 & 1024) != 0) {
            function03 = null;
            modifier4 = modifier2;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            coroutineScope2 = coroutineScope;
            map2 = map;
            state2 = state;
            function04 = function02;
            modifier3 = modifier;
        } else {
            function03 = function0;
            modifier3 = modifier;
            modifier4 = modifier2;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            coroutineScope2 = coroutineScope;
            map2 = map;
            state2 = state;
            function04 = function02;
        }
        return m199genericClickableWithoutGesturebdNGguI(modifier3, modifier4, mutableInteractionSource2, indication2, coroutineScope2, map2, state2, z11, str3, role2, str4, function03, function04);
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$clickSemantics(Modifier modifier, final Role role, final String str, final Function0<Unit> function0, final String str2, final boolean z10, final Function0<Unit> function02) {
        return SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1
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
                Role role2 = role;
                if (role2 != null) {
                    SemanticsPropertiesKt.m3364setRolekuIjeqM(semantics, role2.getValue());
                }
                String str3 = str;
                final Function0<Unit> function03 = function02;
                SemanticsPropertiesKt.onClick(semantics, str3, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        function03.invoke();
                        return Boolean.TRUE;
                    }
                });
                final Function0<Unit> function04 = function0;
                if (function04 != null) {
                    SemanticsPropertiesKt.onLongClick(semantics, str2, new Function0<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            function04.invoke();
                            return Boolean.TRUE;
                        }
                    });
                }
                if (z10) {
                    return;
                }
                SemanticsPropertiesKt.disabled(semantics);
            }
        });
    }

    private static final Modifier genericClickableWithoutGesture_bdNGguI$detectPressAndClickFromKey(Modifier modifier, final boolean z10, final Map<Key, PressInteraction.Press> map, final State<Offset> state, final CoroutineScope coroutineScope, final Function0<Unit> function0, final MutableInteractionSource mutableInteractionSource) {
        return KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1

            /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", f = "Clickable.kt", l = {540}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ PressInteraction.Press $press;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation continuation) {
                    super(2, continuation);
                    this.$interactionSource = mutableInteractionSource;
                    this.$press = press;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.$interactionSource, this.$press, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        PressInteraction.Press press = this.$press;
                        this.label = 1;
                        if (mutableInteractionSource.emit(press, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d.b(obj);
                    }
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m208invokeZmokQxo(keyEvent.m2781unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m208invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                boolean z11 = false;
                if (z10 && Clickable_androidKt.m211isPressZmokQxo(keyEvent)) {
                    if (!map.containsKey(Key.m2194boximpl(KeyEvent_androidKt.m2792getKeyZmokQxo(keyEvent)))) {
                        PressInteraction.Press press = new PressInteraction.Press(state.getValue().getPackedValue(), null);
                        map.put(Key.m2194boximpl(KeyEvent_androidKt.m2792getKeyZmokQxo(keyEvent)), press);
                        i.d(coroutineScope, null, null, new AnonymousClass1(mutableInteractionSource, press, null), 3, null);
                        z11 = true;
                    }
                } else if (z10 && Clickable_androidKt.m209isClickZmokQxo(keyEvent)) {
                    PressInteraction.Press pressRemove = map.remove(Key.m2194boximpl(KeyEvent_androidKt.m2792getKeyZmokQxo(keyEvent)));
                    if (pressRemove != null) {
                        i.d(coroutineScope, null, null, new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(mutableInteractionSource, pressRemove, null), 3, null);
                    }
                    function0.invoke();
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: handlePressInteraction-EPk0efs, reason: not valid java name */
    public static final Object m201handlePressInteractionEPk0efs(@NotNull PressGestureScope pressGestureScope, long j10, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull MutableState<PressInteraction.Press> mutableState, @NotNull State<? extends Function0<Boolean>> state, @NotNull Continuation continuation) {
        Object objG = kotlinx.coroutines.i.g(new ClickableKt$handlePressInteraction$2(pressGestureScope, j10, mutableInteractionSource, mutableState, state, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
