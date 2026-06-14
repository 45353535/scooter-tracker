package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R!\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "invalidate", "()V", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "Lkotlin/jvm/functions/Function2;", "androidMatrixCache", "Landroid/graphics/Matrix;", "previousAndroidMatrix", "matrixCache", "[F", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayerMatrixCache<T> {

    @Nullable
    private Matrix androidMatrixCache;

    @NotNull
    private final Function2<T, Matrix, Unit> getMatrix;

    @Nullable
    private float[] inverseMatrixCache;
    private boolean isDirty;
    private boolean isInverseDirty;
    private boolean isInverseValid;

    @Nullable
    private float[] matrixCache;

    @Nullable
    private Matrix previousAndroidMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(@NotNull Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.getMatrix = getMatrix;
        this.isDirty = true;
        this.isInverseDirty = true;
        this.isInverseValid = true;
    }

    @Nullable
    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m3303calculateInverseMatrixbWbORWo(T target) {
        float[] fArrM1809constructorimpl$default = this.inverseMatrixCache;
        if (fArrM1809constructorimpl$default == null) {
            fArrM1809constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1809constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM1809constructorimpl$default;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m3301invertToJiSxe2E(m3304calculateMatrixGrdbGEg(target), fArrM1809constructorimpl$default);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrM1809constructorimpl$default;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m3304calculateMatrixGrdbGEg(T target) {
        float[] fArrM1809constructorimpl$default = this.matrixCache;
        if (fArrM1809constructorimpl$default == null) {
            fArrM1809constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1809constructorimpl$default(null, 1, null);
            this.matrixCache = fArrM1809constructorimpl$default;
        }
        if (!this.isDirty) {
            return fArrM1809constructorimpl$default;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m1484setFromtUYjHk(fArrM1809constructorimpl$default, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrM1809constructorimpl$default;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
