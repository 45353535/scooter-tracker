package yads;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public final class og3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx2 f114310a;

    public og3(kx2 kx2Var, kx2 kx2Var2) {
        this.f114310a = kx2Var;
    }

    public final Matrix a(float f10, float f11, ng3 ng3Var) {
        int iOrdinal = ng3Var.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new lf.m();
        }
        kx2 kx2Var = this.f114310a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, kx2Var.f112887b / 2.0f, kx2Var.f112888c / 2.0f);
        return matrix2;
    }
}
