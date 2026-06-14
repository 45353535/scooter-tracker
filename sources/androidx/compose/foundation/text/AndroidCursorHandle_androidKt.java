package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\u000e*\u00020\u000eH\u0000\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"CursorHandleHeight", "Landroidx/compose/ui/unit/Dp;", "getCursorHandleHeight", "()F", "F", "CursorHandleWidth", "getCursorHandleWidth", "Sqrt2", "", "CursorHandle", "", "handlePosition", "Landroidx/compose/ui/geometry/Offset;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CursorHandle-ULxng0E", "(JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "drawCursorHandle", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float fM3951constructorimpl = Dp.m3951constructorimpl(25);
        CursorHandleHeight = fM3951constructorimpl;
        CursorHandleWidth = Dp.m3951constructorimpl(Dp.m3951constructorimpl(fM3951constructorimpl * 2.0f) / 2.4142137f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: CursorHandle-ULxng0E, reason: not valid java name */
    public static final void m693CursorHandleULxng0E(long j10, @NotNull final Modifier modifier, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i10) {
        final int i11;
        long j11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-5185995);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            j11 = j10;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-5185995, i11, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            j11 = j10;
            AndroidSelectionHandles_androidKt.m802HandlePopupULxng0E(j11, HandleReferencePoint.TopMiddle, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1458480226, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
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

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i12) {
                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1458480226, i12, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
                    }
                    if (function2 == null) {
                        composer2.startReplaceableGroup(1275643833);
                        AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, (i11 >> 3) & 14);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1275643903);
                        function2.invoke(composer2, Integer.valueOf((i11 >> 6) & 14));
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j12 = j11;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
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

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidCursorHandle_androidKt.m693CursorHandleULxng0E(j12, modifier, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(@NotNull final Modifier modifier, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(694251107);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i10, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m463sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.DefaultCursorHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i12) {
                AndroidCursorHandle_androidKt.DefaultCursorHandle(modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @NotNull
    public static final Modifier drawCursorHandle(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.drawCursorHandle.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i10) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-2126899193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
                }
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                Color colorM1594boximpl = Color.m1594boximpl(selectionHandleColor);
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(colorM1594boximpl);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                            final float fM1440getWidthimpl = Size.m1440getWidthimpl(drawWithCache.m1281getSizeNHjbRc()) / 2.0f;
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, fM1440getWidthimpl);
                            final ColorFilter colorFilterM1645tintxETnrds$default = ColorFilter.Companion.m1645tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
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
                                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                    onDrawWithContent.drawContent();
                                    float f10 = fM1440getWidthimpl;
                                    ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                    ColorFilter colorFilter = colorFilterM1645tintxETnrds$default;
                                    DrawContext drawContext = onDrawWithContent.getDrawContext();
                                    long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    DrawTransform transform = drawContext.getTransform();
                                    c.g(transform, f10, 0.0f, 2, null);
                                    transform.mo2052rotateUv8p0NA(45.0f, Offset.INSTANCE.m1387getZeroF1C5BW0());
                                    b.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    drawContext.getCanvas().restore();
                                    drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = composed.then(DrawModifierKt.drawWithCache(companion, (Function1) objRememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
