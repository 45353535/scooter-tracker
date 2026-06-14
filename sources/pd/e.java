package pd;

import android.graphics.Color;
import android.os.Build;
import androidx.core.view.ViewCompat;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f98220a = new e();

    private e() {
    }

    public final int a(int i10) {
        return Color.alpha(i10);
    }

    public final float b(int i10) {
        return m(a(i10));
    }

    public final int c(float f10, float f11, float f12, float f13) {
        return Build.VERSION.SDK_INT >= 26 ? Color.argb(f10, f11, f12, f13) : (r(f10) << 24) | (r(f11) << 16) | (r(f12) << 8) | r(f13);
    }

    public final int d(int[] pixels, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        int i11 = z10 ? 4 : 3;
        float[] fArr = new float[i11];
        int length = pixels.length - 1;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i10 + '.');
        }
        int iC = rf.c.c(0, length, i10);
        long j10 = 0;
        if (iC >= 0) {
            int i12 = 0;
            while (true) {
                int i13 = pixels[i12];
                float f10 = fArr[0];
                e eVar = f98220a;
                fArr[0] = f10 + eVar.o(i13);
                fArr[1] = fArr[1] + eVar.k(i13);
                fArr[2] = fArr[2] + eVar.g(i13);
                if (i11 > 3) {
                    fArr[3] = fArr[3] + eVar.b(i13);
                }
                j10++;
                if (i12 == iC) {
                    break;
                }
                i12 += i10;
            }
        }
        float f11 = j10;
        float f12 = fArr[0] / f11;
        float f13 = fArr[1] / f11;
        float f14 = fArr[2] / f11;
        Float orNull = ArraysKt.getOrNull(fArr, 3);
        return q(f12, f13, f14, orNull != null ? Float.valueOf(orNull.floatValue() / f11) : null);
    }

    public final int e(int i10, int i11, int i12, int i13, float f10, float f11, boolean z10) {
        return l(l(i10, i11, f10, z10), l(i12, i13, f10, z10), f11, z10);
    }

    public final int f(int i10) {
        return Color.blue(i10);
    }

    public final float g(int i10) {
        return m(f(i10));
    }

    public final float h(int i10) {
        return Math.max(o(i10), Math.max(k(i10), g(i10)));
    }

    public final float i(int i10, int i11) {
        float fO = o(i10) - o(i11);
        float fK = k(i10) - k(i11);
        float fG = g(i10) - g(i11);
        return (float) Math.sqrt((fO * fO) + (fK * fK) + (fG * fG));
    }

    public final int j(int i10) {
        return Color.green(i10);
    }

    public final float k(int i10) {
        return m(j(i10));
    }

    public final int l(int i10, int i11, float f10, boolean z10) {
        return q(q.a(o(i10), o(i11), f10), q.a(k(i10), k(i11), f10), q.a(g(i10), g(i11), f10), z10 ? Float.valueOf(q.a(b(i10), b(i11), f10)) : null);
    }

    public final float m(int i10) {
        return kotlin.ranges.g.m(i10 / 255.0f, 0.0f, 1.0f);
    }

    public final int n(int i10) {
        return Color.red(i10);
    }

    public final float o(int i10) {
        return m(n(i10));
    }

    public final int p(float f10, float f11, float f12) {
        return Build.VERSION.SDK_INT >= 26 ? Color.rgb(f10, f11, f12) : (r(f10) << 16) | ViewCompat.MEASURED_STATE_MASK | (r(f11) << 8) | r(f12);
    }

    public final int q(float f10, float f11, float f12, Float f13) {
        return f13 != null ? c(f13.floatValue(), f10, f11, f12) : p(f10, f11, f12);
    }

    public final int r(float f10) {
        return (int) ((f10 * 255.0f) + 0.5f);
    }
}
