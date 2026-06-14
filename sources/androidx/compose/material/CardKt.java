package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Card-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Card-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardKt {
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m937Card9VG74zQ(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z10, @Nullable String str, @Nullable Role role, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        MutableInteractionSource mutableInteractionSource2;
        String str2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1353606722);
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Shape medium = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM966getSurface0d7_KjU = (i12 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU() : j10;
        long jM980contentColorForek8zF_U = (i12 & 16) != 0 ? ColorsKt.m980contentColorForek8zF_U(jM966getSurface0d7_KjU, composer, (i10 >> 9) & 14) : j11;
        BorderStroke borderStroke2 = (i12 & 32) != 0 ? null : borderStroke;
        float fM3951constructorimpl = (i12 & 64) != 0 ? Dp.m3951constructorimpl(1) : f10;
        if ((i12 & 128) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Indication indication2 = (i12 & 256) != 0 ? (Indication) composer.consume(IndicationKt.getLocalIndication()) : indication;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        boolean z11 = (i12 & 512) != 0 ? true : z10;
        String str3 = (i12 & 1024) != 0 ? null : str;
        Role role2 = (i12 & 2048) != 0 ? null : role;
        if (ComposerKt.isTraceInProgress()) {
            str2 = str3;
            ComposerKt.traceEventStart(1353606722, i10, i11, "androidx.compose.material.Card (Card.kt:179)");
        } else {
            str2 = str3;
        }
        SurfaceKt.m1123Surface9VG74zQ(onClick, modifier2, medium, jM966getSurface0d7_KjU, jM980contentColorForek8zF_U, borderStroke2, fM3951constructorimpl, mutableInteractionSource3, indication2, z11, str2, role2, content, composer, i10 & 2147483646, i11 & 1022, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m938CardFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1956755640);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Shape medium = (i11 & 2) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM966getSurface0d7_KjU = (i11 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU() : j10;
        long jM980contentColorForek8zF_U = (i11 & 8) != 0 ? ColorsKt.m980contentColorForek8zF_U(jM966getSurface0d7_KjU, composer, (i10 >> 6) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 16) != 0 ? null : borderStroke;
        float fM3951constructorimpl = (i11 & 32) != 0 ? Dp.m3951constructorimpl(1) : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i10, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        SurfaceKt.m1124SurfaceFjzlyU(modifier, medium, jM966getSurface0d7_KjU, jM980contentColorForek8zF_U, borderStroke2, fM3951constructorimpl, content, composer, i10 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m939CardLPr_se0(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable Shape shape, long j10, long j11, @Nullable BorderStroke borderStroke, float f10, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(778538979);
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Shape medium = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long jM966getSurface0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m966getSurface0d7_KjU() : j10;
        long jM980contentColorForek8zF_U = (i11 & 32) != 0 ? ColorsKt.m980contentColorForek8zF_U(jM966getSurface0d7_KjU, composer, (i10 >> 12) & 14) : j11;
        BorderStroke borderStroke2 = (i11 & 64) != 0 ? null : borderStroke;
        float fM3951constructorimpl = (i11 & 128) != 0 ? Dp.m3951constructorimpl(1) : f10;
        if ((i11 & 256) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            mutableInteractionSource3 = mutableInteractionSource2;
            ComposerKt.traceEventStart(778538979, i10, -1, "androidx.compose.material.Card (Card.kt:107)");
        } else {
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        SurfaceKt.m1125SurfaceLPr_se0(onClick, modifier2, z11, medium, jM966getSurface0d7_KjU, jM980contentColorForek8zF_U, borderStroke2, fM3951constructorimpl, mutableInteractionSource3, content, composer, i10 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
