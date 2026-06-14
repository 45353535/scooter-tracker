package androidx.compose.foundation.text.selection;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"isCopyKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "isCopyKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "selectionMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionManager_androidKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ SelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SelectionManager selectionManager) {
            super(3);
            this.$manager = selectionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j10) {
            mutableState.setValue(IntSize.m4103boximpl(j10));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(-1914520728);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914520728, i10, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:47)");
            }
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m4103boximpl(IntSize.INSTANCE.m4116getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            final SelectionManager selectionManager = this.$manager;
            Function0<Offset> function0 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt.selectionMagnifier.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m1360boximpl(m861invokeF1C5BW0());
                }

                /* JADX INFO: renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m861invokeF1C5BW0() {
                    return SelectionManagerKt.m858calculateSelectionMagnifierCenterAndroidO0kMr_c(selectionManager, AnonymousClass1.invoke$lambda$1(mutableState));
                }
            };
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(mutableState) | composer.changed(density);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function02) {
                        return invoke2((Function0<Offset>) function02);
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Modifier invoke2(@NotNull final Function0<Offset> center) {
                        Intrinsics.checkNotNullParameter(center, "center");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MagnifierStyle textDefault = MagnifierStyle.INSTANCE.getTextDefault();
                        Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                                return Offset.m1360boximpl(m862invoketuRUvjQ(density2));
                            }

                            /* JADX INFO: renamed from: invoke-tuRUvjQ, reason: not valid java name */
                            public final long m862invoketuRUvjQ(@NotNull Density magnifier) {
                                Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
                                return center.invoke().getPackedValue();
                            }
                        };
                        final Density density2 = density;
                        final MutableState<IntSize> mutableState2 = mutableState;
                        return MagnifierKt.magnifier$default(companion2, function1, null, 0.0f, textDefault, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
                                m863invokeEaSLcWc(dpSize.getPackedValue());
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke-EaSLcWc, reason: not valid java name */
                            public final void m863invokeEaSLcWc(long j10) {
                                MutableState<IntSize> mutableState3 = mutableState2;
                                Density density3 = density2;
                                SelectionManager_androidKt.AnonymousClass1.invoke$lambda$2(mutableState3, IntSizeKt.IntSize(density3.mo302roundToPx0680j_4(DpSize.m4049getWidthD9Ej5fM(j10)), density3.mo302roundToPx0680j_4(DpSize.m4047getHeightD9Ej5fM(j10))));
                            }
                        }, 6, null);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(composed, function0, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    /* JADX INFO: renamed from: isCopyKeyEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m860isCopyKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo718mapZmokQxo(keyEvent) == KeyCommand.COPY;
    }

    @SuppressLint({"ModifierInspectorInfo"})
    @NotNull
    public static final Modifier selectionMagnifier(@NotNull Modifier modifier, @NotNull SelectionManager manager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return !MagnifierStyle.INSTANCE.getTextDefault().isSupported() ? modifier : ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(manager), 1, null);
    }
}
