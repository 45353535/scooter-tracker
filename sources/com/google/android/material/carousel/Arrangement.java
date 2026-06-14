package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Arrangement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f25816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f25817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f25820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f25821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f25822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f25823h;

    public Arrangement(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f25816a = i10;
        this.f25817b = MathUtils.clamp(f10, f11, f12);
        this.f25818c = i11;
        this.f25820e = f13;
        this.f25819d = i12;
        this.f25821f = f14;
        this.f25822g = i13;
        c(f15, f11, f12, f14);
        this.f25823h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (f()) {
            return Math.abs(f10 - this.f25821f) * this.f25816a;
        }
        return Float.MAX_VALUE;
    }

    private void c(float f10, float f11, float f12, float f13) {
        float fE = f10 - e();
        int i10 = this.f25818c;
        if (i10 > 0 && fE > 0.0f) {
            float f14 = this.f25817b;
            this.f25817b = f14 + Math.min(fE / i10, f12 - f14);
        } else if (i10 > 0 && fE < 0.0f) {
            float f15 = this.f25817b;
            this.f25817b = f15 + Math.max(fE / i10, f11 - f15);
        }
        int i11 = this.f25818c;
        float f16 = i11 > 0 ? this.f25817b : 0.0f;
        this.f25817b = f16;
        float fA = a(f10, i11, f16, this.f25819d, this.f25822g);
        this.f25821f = fA;
        float f17 = (this.f25817b + fA) / 2.0f;
        this.f25820e = f17;
        int i12 = this.f25819d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f18 = (f13 - fA) * this.f25822g;
        float fMin = Math.min(Math.abs(f18), f17 * 0.1f * i12);
        if (f18 > 0.0f) {
            this.f25820e -= fMin / this.f25819d;
            this.f25821f += fMin / this.f25822g;
        } else {
            this.f25820e += fMin / this.f25819d;
            this.f25821f -= fMin / this.f25822g;
        }
    }

    private float e() {
        return (this.f25821f * this.f25822g) + (this.f25820e * this.f25819d) + (this.f25817b * this.f25818c);
    }

    private boolean f() {
        int i10 = this.f25822g;
        if (i10 <= 0 || this.f25818c <= 0 || this.f25819d <= 0) {
            return i10 <= 0 || this.f25818c <= 0 || this.f25821f > this.f25817b;
        }
        float f10 = this.f25821f;
        float f11 = this.f25820e;
        return f10 > f11 && f11 > this.f25817b;
    }

    @Nullable
    public static Arrangement findLowestCostArrangement(float f10, float f11, float f12, float f13, @NonNull int[] iArr, float f14, @NonNull int[] iArr2, float f15, @NonNull int[] iArr3) {
        Arrangement arrangement = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    Arrangement arrangement2 = new Arrangement(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (arrangement == null || arrangement2.f25823h < arrangement.f25823h) {
                        if (arrangement2.f25823h == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return arrangement;
    }

    int d() {
        return this.f25818c + this.f25819d + this.f25822g;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f25816a + ", smallCount=" + this.f25818c + ", smallSize=" + this.f25817b + ", mediumCount=" + this.f25819d + ", mediumSize=" + this.f25820e + ", largeCount=" + this.f25822g + ", largeSize=" + this.f25821f + ", cost=" + this.f25823h + C4240b4.j.f42674e;
    }
}
