package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"booleanResource", "", "id", "", "(ILandroidx/compose/runtime/Composer;I)Z", "dimensionResource", "Landroidx/compose/ui/unit/Dp;", "(ILandroidx/compose/runtime/Composer;I)F", "integerArrayResource", "", "(ILandroidx/compose/runtime/Composer;I)[I", "integerResource", "(ILandroidx/compose/runtime/Composer;I)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean booleanResource(@BoolRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432394447, i11, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z10 = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getBoolean(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z10;
    }

    @Composable
    @ReadOnlyComposable
    public static final float dimensionResource(@DimenRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i11, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        float fM3951constructorimpl = Dp.m3951constructorimpl(((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDimension(i10) / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM3951constructorimpl;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final int[] integerArrayResource(@ArrayRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i11, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] intArray = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getIntArray(i10);
        Intrinsics.checkNotNullExpressionValue(intArray, "context.resources.getIntArray(id)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    @Composable
    @ReadOnlyComposable
    public static final int integerResource(@IntegerRes int i10, @Nullable Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, i11, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getInteger(i10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return integer;
    }
}
