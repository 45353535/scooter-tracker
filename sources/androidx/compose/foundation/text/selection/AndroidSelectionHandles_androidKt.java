package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
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
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\t\u001a8\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aR\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0011H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0000\u001a \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a$\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DefaultSelectionHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/Composer;I)V", "HandlePopup", C4240b4.i.L, "Landroidx/compose/ui/geometry/Offset;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "HandlePopup-ULxng0E", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "SelectionHandle-8fL75-g", "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "isHandleLtrDirection", "areHandlesCrossed", "isLeft", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidSelectionHandles_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultSelectionHandle(@NotNull final Modifier modifier, final boolean z10, @NotNull final ResolvedTextDirection direction, final boolean z11, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Composer composerStartRestartGroup = composer.startRestartGroup(47957398);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47957398, i10, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m463sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z10, direction, z11), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.DefaultSelectionHandle.1
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
                AndroidSelectionHandles_androidKt.DefaultSelectionHandle(modifier, z10, direction, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m802HandlePopupULxng0E(final long j10, @NotNull final HandleReferencePoint handleReferencePoint, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(handleReferencePoint, "handleReferencePoint");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1409050158);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1409050158, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)");
            }
            long jIntOffset = IntOffsetKt.IntOffset(zf.a.d(Offset.m1371getXimpl(j10)), zf.a.d(Offset.m1372getYimpl(j10)));
            IntOffset intOffsetM4060boximpl = IntOffset.m4060boximpl(jIntOffset);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(intOffsetM4060boximpl) | composerStartRestartGroup.changed(handleReferencePoint);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new HandlePositionProvider(handleReferencePoint, jIntOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) objRememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), content, composerStartRestartGroup, ((i11 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
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
                AndroidSelectionHandles_androidKt.m802HandlePopupULxng0E(j10, handleReferencePoint, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m803SelectionHandle8fL75g(final long j10, final boolean z10, @NotNull final ResolvedTextDirection direction, final boolean z11, @NotNull final Modifier modifier, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i10) {
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(direction) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            function22 = function2;
            i11 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        } else {
            function22 = function2;
        }
        final int i12 = i11;
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616295642, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            composer2 = composerStartRestartGroup;
            m802HandlePopupULxng0E(j10, isLeft(z10, direction, z11) ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 732099485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.f93236a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i13) {
                    if ((i13 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(732099485, i13, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
                    }
                    if (function23 == null) {
                        composer3.startReplaceableGroup(386443790);
                        Modifier modifier2 = modifier;
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        Offset offsetM1360boximpl = Offset.m1360boximpl(j10);
                        final boolean z12 = z10;
                        final long j11 = j10;
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged = composer3.changed(boolValueOf) | composer3.changed(offsetM1360boximpl);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1
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
                                    semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(z12 ? Handle.SelectionStart : Handle.SelectionEnd, j11, null));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        AndroidSelectionHandles_androidKt.DefaultSelectionHandle(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue, 1, null), z10, direction, z11, composer3, i12 & 8176);
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(386444465);
                        function23.invoke(composer3, Integer.valueOf((i12 >> 15) & 14));
                        composer3.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, (i12 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer3, int i13) {
                AndroidSelectionHandles_androidKt.m803SelectionHandle8fL75g(j10, z10, direction, z11, modifier, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    @NotNull
    public static final ImageBitmap createHandleImage(@NotNull CacheDrawScope cacheDrawScope, float f10) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "<this>");
        int iCeil = ((int) Math.ceil(f10)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || iCeil > imageBitmap.getWidth() || iCeil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m1806ImageBitmapx__hDU$default(iCeil, iCeil, ImageBitmapConfig.INSTANCE.m1800getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long jSize = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m2045setSizeuvyYCjk(jSize);
        canvas2.save();
        androidx.compose.ui.graphics.drawscope.b.K(canvasDrawScope2, Color.INSTANCE.m1630getBlack0d7_KjU(), 0L, canvasDrawScope2.mo2040getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m1527getClear0nO6VwU(), 58, null);
        androidx.compose.ui.graphics.drawscope.b.K(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.INSTANCE.m1387getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f10, f10), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.b.x(canvasDrawScope2, ColorKt.Color(4278190080L), f10, OffsetKt.Offset(f10, f10), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2045setSizeuvyYCjk(size);
        return imageBitmap2;
    }

    @NotNull
    public static final Modifier drawSelectionHandle(@NotNull Modifier modifier, final boolean z10, @NotNull final ResolvedTextDirection direction, final boolean z11) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.drawSelectionHandle.1
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
                composer.startReplaceableGroup(-1538687176);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1538687176, i10, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:112)");
                }
                final long selectionHandleColor = ((SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionHandleColor();
                Modifier.Companion companion = Modifier.INSTANCE;
                Object[] objArr = {Color.m1594boximpl(selectionHandleColor), Boolean.valueOf(z10), direction, Boolean.valueOf(z11)};
                final boolean z12 = z10;
                final ResolvedTextDirection resolvedTextDirection = direction;
                final boolean z13 = z11;
                composer.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    zChanged |= composer.changed(objArr[i11]);
                }
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1<CacheDrawScope, DrawResult> function1 = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                            final ImageBitmap imageBitmapCreateHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m1440getWidthimpl(drawWithCache.m1281getSizeNHjbRc()) / 2.0f);
                            final ColorFilter colorFilterM1645tintxETnrds$default = ColorFilter.Companion.m1645tintxETnrds$default(ColorFilter.INSTANCE, selectionHandleColor, 0, 2, null);
                            final boolean z14 = z12;
                            final ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                            final boolean z15 = z13;
                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
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
                                    if (!AndroidSelectionHandles_androidKt.isLeft(z14, resolvedTextDirection2, z15)) {
                                        androidx.compose.ui.graphics.drawscope.b.A(onDrawWithContent, imageBitmapCreateHandleImage, 0L, 0.0f, null, colorFilterM1645tintxETnrds$default, 0, 46, null);
                                        return;
                                    }
                                    ImageBitmap imageBitmap = imageBitmapCreateHandleImage;
                                    ColorFilter colorFilter = colorFilterM1645tintxETnrds$default;
                                    long jMo2039getCenterF1C5BW0 = onDrawWithContent.mo2039getCenterF1C5BW0();
                                    DrawContext drawContext = onDrawWithContent.getDrawContext();
                                    long jMo2046getSizeNHjbRc = drawContext.mo2046getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    drawContext.getTransform().mo2053scale0AR0LA0(-1.0f, 1.0f, jMo2039getCenterF1C5BW0);
                                    androidx.compose.ui.graphics.drawscope.b.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    drawContext.getCanvas().restore();
                                    drawContext.mo2047setSizeuvyYCjk(jMo2046getSizeNHjbRc);
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(function1);
                    objRememberedValue = function1;
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

    public static final boolean isHandleLtrDirection(@NotNull ResolvedTextDirection direction, boolean z10) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (direction != ResolvedTextDirection.Ltr || z10) {
            return direction == ResolvedTextDirection.Rtl && z10;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLeft(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return z10 ? isHandleLtrDirection(resolvedTextDirection, z11) : !isHandleLtrDirection(resolvedTextDirection, z11);
    }
}
