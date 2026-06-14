package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a<\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001aF\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aP\u0010\u0010\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0012\u0010\n\u001a2\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001c\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\"\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0011\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "", "block", "withSave", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLkotlin/jvm/functions/Function1;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLkotlin/jvm/functions/Function1;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLkotlin/jvm/functions/Function1;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function1;)V", "", "left", "top", "right", "bottom", "(Landroid/graphics/Canvas;IIIILkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CanvasKt {
    public static final void withClip(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withMatrix(@NotNull Canvas canvas, @NotNull Matrix matrix, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withRotation(@NotNull Canvas canvas, float f10, float f11, float f12, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f10, float f11, float f12, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f10, f11, f12);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withScale(@NotNull Canvas canvas, float f10, float f11, float f12, float f13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f10, float f11, float f12, float f13, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withSkew(@NotNull Canvas canvas, float f10, float f11, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withTranslation(@NotNull Canvas canvas, float f10, float f11, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withClip(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withClip(@NotNull Canvas canvas, int i10, int i11, int i12, int i13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(i10, i11, i12, i13);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withClip(@NotNull Canvas canvas, float f10, float f11, float f12, float f13, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }

    public static final void withClip(@NotNull Canvas canvas, @NotNull Path path, @NotNull Function1<? super Canvas, Unit> function1) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            function1.invoke(canvas);
        } finally {
            z.b(1);
            canvas.restoreToCount(iSave);
            z.a(1);
        }
    }
}
