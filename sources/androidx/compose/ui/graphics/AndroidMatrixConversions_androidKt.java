package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"setFrom", "", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidMatrixConversions_androidKt {
    /* JADX INFO: renamed from: setFrom-EL8BTi8, reason: not valid java name */
    public static final void m1483setFromEL8BTi8(@NotNull android.graphics.Matrix setFrom, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float f10 = matrix[2];
        if (f10 == 0.0f) {
            float f11 = matrix[6];
            if (f11 == 0.0f && matrix[10] == 1.0f && matrix[14] == 0.0f) {
                float f12 = matrix[8];
                if (f12 == 0.0f && matrix[9] == 0.0f && matrix[11] == 0.0f) {
                    float f13 = matrix[0];
                    float f14 = matrix[1];
                    float f15 = matrix[3];
                    float f16 = matrix[4];
                    float f17 = matrix[5];
                    float f18 = matrix[7];
                    float f19 = matrix[12];
                    float f20 = matrix[13];
                    float f21 = matrix[15];
                    matrix[0] = f13;
                    matrix[1] = f16;
                    matrix[2] = f19;
                    matrix[3] = f14;
                    matrix[4] = f17;
                    matrix[5] = f20;
                    matrix[6] = f15;
                    matrix[7] = f18;
                    matrix[8] = f21;
                    setFrom.setValues(matrix);
                    matrix[0] = f13;
                    matrix[1] = f14;
                    matrix[2] = f10;
                    matrix[3] = f15;
                    matrix[4] = f16;
                    matrix[5] = f17;
                    matrix[6] = f11;
                    matrix[7] = f18;
                    matrix[8] = f12;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms");
    }

    /* JADX INFO: renamed from: setFrom-tU-YjHk, reason: not valid java name */
    public static final void m1484setFromtUYjHk(@NotNull float[] setFrom, @NotNull android.graphics.Matrix matrix) {
        Intrinsics.checkNotNullParameter(setFrom, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(setFrom);
        float f10 = setFrom[0];
        float f11 = setFrom[1];
        float f12 = setFrom[2];
        float f13 = setFrom[3];
        float f14 = setFrom[4];
        float f15 = setFrom[5];
        float f16 = setFrom[6];
        float f17 = setFrom[7];
        float f18 = setFrom[8];
        setFrom[0] = f10;
        setFrom[1] = f13;
        setFrom[2] = 0.0f;
        setFrom[3] = f16;
        setFrom[4] = f11;
        setFrom[5] = f14;
        setFrom[6] = 0.0f;
        setFrom[7] = f17;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f12;
        setFrom[13] = f15;
        setFrom[14] = 0.0f;
        setFrom[15] = f18;
    }
}
