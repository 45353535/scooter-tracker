package xc;

import id.p;
import id.r;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f108168a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108169a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.ColorHistogram.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.BrightnessVariance.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.EdgeDetection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f108169a = iArr;
        }
    }

    private b() {
    }

    public final xc.a a(p algorithmParams) {
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
        int i10 = a.f108169a[algorithmParams.b().ordinal()];
        if (i10 == 1) {
            return new d(algorithmParams);
        }
        if (i10 == 2) {
            return new c(algorithmParams);
        }
        if (i10 == 3) {
            return new e(algorithmParams);
        }
        throw new m();
    }
}
