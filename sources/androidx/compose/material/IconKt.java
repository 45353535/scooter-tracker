package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.taurusx.tax.f.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", s.f66014g, "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IconKt {

    @NotNull
    private static final Modifier DefaultIconSizeModifier = SizeKt.m461size3ABfNKs(Modifier.INSTANCE, Dp.m3951constructorimpl(24));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1043Iconww6aTOc(@NotNull ImageVector imageVector, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jM1603copywmQWz5c$default = (i11 & 8) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i10, -1, "androidx.compose.material.Icon (Icon.kt:61)");
        }
        m1042Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i10 & 14), str, modifier2, jM1603copywmQWz5c$default, composer, VectorPainter.$stable | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m1436equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m1448getUnspecifiedNHjbRc()) || m1044isInfiniteuvyYCjk(painter.getIntrinsicSize())) ? DefaultIconSizeModifier : Modifier.INSTANCE);
    }

    /* JADX INFO: renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1044isInfiniteuvyYCjk(long j10) {
        return Float.isInfinite(Size.m1440getWidthimpl(j10)) && Float.isInfinite(Size.m1437getHeightimpl(j10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1041Iconww6aTOc(@NotNull ImageBitmap bitmap, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-554892675);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jM1603copywmQWz5c$default = (i11 & 8) != 0 ? Color.m1603copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i10, -1, "androidx.compose.material.Icon (Icon.kt:95)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(bitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            objRememberedValue = bitmapPainter;
        }
        composer.endReplaceableGroup();
        m1042Iconww6aTOc((BitmapPainter) objRememberedValue, str, modifier2, jM1603copywmQWz5c$default, composer, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1042Iconww6aTOc(@NotNull final Painter painter, @Nullable final String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, final int i11) {
        int i12;
        long jM1603copywmQWz5c$default;
        int i13;
        Modifier modifierSemantics$default;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            i12 = i10;
            i13 = i12 & (-7169);
            jM1603copywmQWz5c$default = Color.m1603copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1614unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            i12 = i10;
            jM1603copywmQWz5c$default = j10;
            i13 = i12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i13, -1, "androidx.compose.material.Icon (Icon.kt:129)");
        }
        ColorFilter colorFilterM1645tintxETnrds$default = Color.m1605equalsimpl0(jM1603copywmQWz5c$default, Color.INSTANCE.m1640getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m1645tintxETnrds$default(ColorFilter.INSTANCE, jM1603copywmQWz5c$default, 0, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1547387026);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
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
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier2), painter), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilterM1645tintxETnrds$default, 22, null).then(modifierSemantics$default), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final int i14 = i12;
        final long j11 = jM1603copywmQWz5c$default;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.IconKt$Icon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i15) {
                IconKt.m1042Iconww6aTOc(painter, str, modifier3, j11, composer2, RecomposeScopeImplKt.updateChangedFlags(i14 | 1), i11);
            }
        });
    }
}
