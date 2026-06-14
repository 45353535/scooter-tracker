package com.google.accompanist.drawablepainter;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001b\u0010\r\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Landroidx/compose/ui/graphics/painter/Painter;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/os/Handler;", "a", "Lkotlin/Lazy;", "b", "()Landroid/os/Handler;", "MAIN_HANDLER", "Landroidx/compose/ui/geometry/Size;", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "drawablepainter_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DrawablePainterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f24098a = i.b(l.f94211d, new Function0<Handler>() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? Size.INSTANCE.m1448getUnspecifiedNHjbRc() : SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler b() {
        return (Handler) f24098a.getValue();
    }

    @Composable
    @NotNull
    public static final Painter rememberDrawablePainter(@Nullable Drawable drawable, @Nullable Composer composer, int i10) {
        Object drawablePainter;
        composer.startReplaceableGroup(1756822313);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756822313, i10, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:154)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(drawable);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (drawable == null) {
                objRememberedValue = EmptyPainter.INSTANCE;
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "drawable.bitmap");
                objRememberedValue = new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null);
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawableMutate, "drawable.mutate()");
                    drawablePainter = new DrawablePainter(drawableMutate);
                }
                objRememberedValue = drawablePainter;
            }
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Painter painter = (Painter) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painter;
    }
}
