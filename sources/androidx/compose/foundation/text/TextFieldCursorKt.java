package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import eg.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a4\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "getDefaultCursorThickness", "()F", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "cursor", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldCursorKt {

    @NotNull
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m110infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframes.at(fValueOf, 0);
            keyframes.at(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframes.at(fValueOf2, 500);
            keyframes.at(fValueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m3951constructorimpl(2);

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull final TextFieldState state, @NotNull final TextFieldValue value, @NotNull final OffsetMapping offsetMapping, @NotNull final Brush cursorBrush, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(cursorBrush, "cursorBrush");
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1

            /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {52}, m = "invokeSuspend")
            static final class C00531 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {54, 56}, m = "invokeSuspend")
                static final class C00541 extends k implements Function2<CoroutineScope, Continuation, Object> {
                    final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00541(Animatable<Float, AnimationVector1D> animatable, Continuation continuation) {
                        super(2, continuation);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new C00541(this.$cursorAlpha, continuation);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                    
                        if (androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, null, null, r11, 12, null) == r0) goto L15;
                     */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = pf.b.g()
                            int r1 = r11.label
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L1e
                            if (r1 == r3) goto L1a
                            if (r1 != r2) goto L12
                            kotlin.d.b(r12)
                            goto L4c
                        L12:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1a:
                            kotlin.d.b(r12)
                            goto L32
                        L1e:
                            kotlin.d.b(r12)
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r12 = r11.$cursorAlpha
                            r1 = 1065353216(0x3f800000, float:1.0)
                            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                            r11.label = r3
                            java.lang.Object r12 = r12.snapTo(r1, r11)
                            if (r12 != r0) goto L32
                            goto L4b
                        L32:
                            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r3 = r11.$cursorAlpha
                            r12 = 0
                            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.c(r12)
                            androidx.compose.animation.core.AnimationSpec r5 = androidx.compose.foundation.text.TextFieldCursorKt.access$getCursorAnimationSpec$p()
                            r11.label = r2
                            r6 = 0
                            r7 = 0
                            r9 = 12
                            r10 = 0
                            r8 = r11
                            java.lang.Object r12 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
                            if (r12 != r0) goto L4c
                        L4b:
                            return r0
                        L4c:
                            kotlin.Unit r12 = kotlin.Unit.f93236a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt.AnonymousClass1.C00531.C00541.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((C00541) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00531(Animatable<Float, AnimationVector1D> animatable, Continuation continuation) {
                    super(2, continuation);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00531(this.$cursorAlpha, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                        C00541 c00541 = new C00541(this.$cursorAlpha, null);
                        this.label = 1;
                        if (g.g(fixedMotionDurationScale, c00541, this) == objG) {
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
                    return ((C00531) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

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
                Modifier modifierDrawWithContent;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1634330012);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1634330012, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Animatable animatable = (Animatable) objRememberedValue;
                Brush brush = cursorBrush;
                boolean z11 = ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == Color.INSTANCE.m1640getUnspecified0d7_KjU()) ? false : true;
                if (state.getHasFocus() && TextRange.m3497getCollapsedimpl(value.getSelection()) && z11) {
                    EffectsKt.LaunchedEffect(value.getText(), TextRange.m3491boximpl(value.getSelection()), new C00531(animatable, null), composer, 512);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue = value;
                    final TextFieldState textFieldState = state;
                    final Brush brush2 = cursorBrush;
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt.cursor.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
                            Rect rect;
                            TextLayoutResult value2;
                            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                            drawWithContent.drawContent();
                            float fM = kotlin.ranges.g.m(animatable.getValue().floatValue(), 0.0f, 1.0f);
                            if (fM == 0.0f) {
                                return;
                            }
                            int iOriginalToTransformed = offsetMapping2.originalToTransformed(TextRange.m3503getStartimpl(textFieldValue.getSelection()));
                            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                            if (layoutResult == null || (value2 = layoutResult.getValue()) == null || (rect = value2.getCursorRect(iOriginalToTransformed)) == null) {
                                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float fMo308toPx0680j_4 = drawWithContent.mo308toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
                            float f10 = fMo308toPx0680j_4 / 2;
                            float fI = kotlin.ranges.g.i(rect.getLeft() + f10, Size.m1440getWidthimpl(drawWithContent.mo2040getSizeNHjbRc()) - f10);
                            androidx.compose.ui.graphics.drawscope.b.B(drawWithContent, brush2, OffsetKt.Offset(fI, rect.getTop()), OffsetKt.Offset(fI, rect.getBottom()), fMo308toPx0680j_4, 0, null, fM, null, 0, 432, null);
                        }
                    });
                } else {
                    modifierDrawWithContent = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawWithContent;
            }
        }, 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return DefaultCursorThickness;
    }
}
