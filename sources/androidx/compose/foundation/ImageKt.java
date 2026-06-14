package androidx.compose.foundation;

import androidx.activity.s;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Image", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final /* synthetic */ void Image(ImageBitmap bitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-2123228673);
        if ((i11 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        Alignment center = (i11 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i11 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i10, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        m213Image5hnEew(bitmap, str, modifier2, center, fit, f11, colorFilter2, FilterQuality.INSTANCE.m1699getLowfv9h1I(), composer, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m213Image5hnEew(@NotNull ImageBitmap bitmap, @Nullable String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, int i10, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-1396260732);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i12 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i12 & 64) != 0 ? null : colorFilter;
        int iM2071getDefaultFilterQualityfv9h1I = (i12 & 128) != 0 ? DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(bitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BitmapPainterKt.m2136BitmapPainterQZhYCtY$default(bitmap, 0L, 0L, iM2071getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Image((BitmapPainter) objRememberedValue, str, modifier2, center, fit, f11, colorFilter2, composer, (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@NotNull ImageVector imageVector, @Nullable String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(1595907091);
        if ((i11 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i11 & 8) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i11 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        ContentScale contentScale2 = contentScale;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i10, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i10 & 14), str, modifier2, alignment2, contentScale2, f11, colorFilter2, composer, VectorPainter.$stable | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@NotNull final Painter painter, @Nullable final String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i10, final int i11) {
        int i12;
        Modifier modifierSemantics$default;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(1142754848);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i11 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i11 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            i12 = i10;
            ComposerKt.traceEventStart(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        } else {
            i12 = i10;
        }
        composerStartRestartGroup.startReplaceableGroup(-816794123);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
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
                        SemanticsPropertiesKt.setContentDescription(semantics, str);
                        SemanticsPropertiesKt.m3364setRolekuIjeqM(semantics, Role.INSTANCE.m3353getImageo7Vup1c());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
        } else {
            modifierSemantics$default = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierPaint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier2.then(modifierSemantics$default)), painter, false, center, fit, f11, colorFilter2, 2, null);
        AnonymousClass2 anonymousClass2 = new MeasurePolicy() { // from class: androidx.compose.foundation.ImageKt.Image.2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                return e.a(this, intrinsicMeasureScope, list, i13);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                return e.b(this, intrinsicMeasureScope, list, i13);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> list, long j10) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                return MeasureScope.CC.p(Layout, Constraints.m3921getMinWidthimpl(j10), Constraints.m3920getMinHeightimpl(j10), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$2$measure$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.f93236a;
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                return e.c(this, intrinsicMeasureScope, list, i13);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                return e.d(this, intrinsicMeasureScope, list, i13);
            }
        };
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPaint$default);
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
        Updater.m1255setimpl(composerM1248constructorimpl, anonymousClass2, companion2.getSetMeasurePolicy());
        Updater.m1255setimpl(composerM1248constructorimpl, density, companion2.getSetDensity());
        Updater.m1255setimpl(composerM1248constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1255setimpl(composerM1248constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        function3MaterializerOf.invoke(SkippableUpdater.m1239boximpl(SkippableUpdater.m1240constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
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
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f12 = f11;
        final ColorFilter colorFilter3 = colorFilter2;
        final Modifier modifier3 = modifier2;
        final int i13 = i12;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i14) {
                ImageKt.Image(painter, str, modifier3, alignment2, contentScale2, f12, colorFilter3, composer2, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i11);
            }
        });
    }
}
