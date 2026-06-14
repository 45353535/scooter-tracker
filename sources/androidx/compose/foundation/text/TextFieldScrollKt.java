package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a4\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000\u001a*\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0000¨\u0006\u001b"}, d2 = {"getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "", "textFieldWidth", "textFieldScroll", "Landroidx/compose/ui/Modifier;", "scrollerPosition", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "textLayoutResultProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textFieldScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldScrollKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i10, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z10, int i11) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i10))) == null) {
            zero = Rect.INSTANCE.getZero();
        }
        Rect rect = zero;
        int iMo302roundToPx0680j_4 = density.mo302roundToPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z10 ? (i11 - rect.getLeft()) - iMo302roundToPx0680j_4 : rect.getLeft(), 0.0f, z10 ? i11 - rect.getLeft() : iMo302roundToPx0680j_4 + rect.getLeft(), 0.0f, 10, null);
    }

    @NotNull
    public static final Modifier textFieldScroll(@NotNull Modifier modifier, @NotNull TextFieldScrollerPosition scrollerPosition, @NotNull TextFieldValue textFieldValue, @NotNull VisualTransformation visualTransformation, @NotNull Function0<TextLayoutResultProxy> textLayoutResultProvider) {
        Modifier verticalScrollLayoutModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientation = scrollerPosition.getOrientation();
        int iM780getOffsetToFollow5zctL8 = scrollerPosition.m780getOffsetToFollow5zctL8(textFieldValue.getSelection());
        scrollerPosition.m782setPreviousSelection5zctL8(textFieldValue.getSelection());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getText());
        int i10 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i10 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(scrollerPosition, iM780getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        } else {
            if (i10 != 2) {
                throw new m();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(scrollerPosition, iM780getOffsetToFollow5zctL8, transformedTextFilterWithValidation, textLayoutResultProvider);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    @NotNull
    public static final Modifier textFieldScrollable(@NotNull Modifier modifier, @NotNull final TextFieldScrollerPosition scrollerPosition, @Nullable final MutableInteractionSource mutableInteractionSource, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", scrollerPosition);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt.textFieldScrollable.2
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
                composer.startReplaceableGroup(805428266);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)");
                }
                boolean z11 = scrollerPosition.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
                final TextFieldScrollerPosition textFieldScrollerPosition = scrollerPosition;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(textFieldScrollerPosition);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                            return invoke(f10.floatValue());
                        }

                        @NotNull
                        public final Float invoke(float f10) {
                            float offset = textFieldScrollerPosition.getOffset() + f10;
                            if (offset > textFieldScrollerPosition.getMaximum()) {
                                f10 = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
                            } else if (offset < 0.0f) {
                                f10 = -textFieldScrollerPosition.getOffset();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                            textFieldScrollerPosition2.setOffset(textFieldScrollerPosition2.getOffset() + f10);
                            return Float.valueOf(f10);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) objRememberedValue, composer, 0);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = scrollerPosition;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(scrollableStateRememberScrollableState) | composer.changed(textFieldScrollerPosition2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ScrollableState(textFieldScrollerPosition2) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                        @NotNull
                        private final State canScrollBackward$delegate;

                        @NotNull
                        private final State canScrollForward$delegate;

                        {
                            this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition2.getOffset() < textFieldScrollerPosition2.getMaximum());
                                }
                            });
                            this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    return Boolean.valueOf(textFieldScrollerPosition2.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float f10) {
                            return this.$$delegate_0.dispatchRawDelta(f10);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return this.$$delegate_0.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        @Nullable
                        public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
                            return this.$$delegate_0.scroll(mutatePriority, function2, continuation);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierScrollable$default = ScrollableKt.scrollable$default(Modifier.INSTANCE, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objRememberedValue2, scrollerPosition.getOrientation(), z10 && scrollerPosition.getMaximum() != 0.0f, z11, null, mutableInteractionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierScrollable$default;
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z10);
    }
}
