package f1;

import f1.vc;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final id f70124a = new id();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70125a;

        static {
            int[] iArr = new int[vc.a.values().length];
            try {
                iArr[vc.a.f71403e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vc.a.f71402d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vc.a.f71404f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70125a = iArr;
        }
    }

    public final r0 a(vc vcVar, int i10, int i11) {
        return new r0(i10, i11);
    }

    public final r0 b(vc vcVar, xb xbVar, int i10, int i11) {
        Integer numE = vcVar.e();
        int iA = numE != null ? xbVar.a(numE.intValue()) : i10;
        Integer numC = vcVar.c();
        int iA2 = numC != null ? xbVar.a(numC.intValue()) : i11;
        if (iA2 == 0 || iA == 0) {
            return a(vcVar, i10, i11);
        }
        float f10 = iA / iA2;
        float f11 = i10;
        float f12 = i11;
        Pair pair = f10 > f11 / f12 ? TuplesKt.to(Integer.valueOf(i10), Integer.valueOf((int) (f11 / f10))) : TuplesKt.to(Integer.valueOf((int) (f12 * f10)), Integer.valueOf(i11));
        return new r0(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
    }

    public final r0 c(vc vcVar, xb densityProvider, int i10, int i11) {
        Intrinsics.checkNotNullParameter(vcVar, "<this>");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        int i12 = a.f70125a[vcVar.b().ordinal()];
        if (i12 == 1) {
            return a(vcVar, i10, i11);
        }
        if (i12 == 2) {
            return b(vcVar, densityProvider, i10, i11);
        }
        if (i12 == 3) {
            return d(vcVar, densityProvider, i10, i11);
        }
        throw new lf.m();
    }

    public final r0 d(vc vcVar, xb xbVar, int i10, int i11) {
        Integer numE = vcVar.e();
        if (numE != null) {
            i10 = xbVar.a(numE.intValue());
        }
        Integer numC = vcVar.c();
        if (numC != null) {
            i11 = xbVar.a(numC.intValue());
        }
        return new r0(i10, i11);
    }
}
