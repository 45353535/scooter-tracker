package w2;

import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1321a f106932d = new C1321a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f106933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f106935c;

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    public static final class C1321a {
        public /* synthetic */ C1321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            IntIterator it = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                i10 *= iArr[it.nextInt()];
            }
            return i10;
        }

        private C1321a() {
        }
    }

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f106933a = shape;
        int iB = f106932d.b(shape);
        this.f106934b = iB;
        this.f106935c = new float[iB];
    }

    public final float[] a() {
        return this.f106935c;
    }

    public final int b(int i10) {
        return this.f106933a[i10];
    }

    public final int c() {
        return this.f106933a.length;
    }

    public final void d(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f106933a = shape;
        int iB = f106932d.b(shape);
        float[] fArr = new float[iB];
        System.arraycopy(this.f106935c, 0, fArr, 0, Math.min(this.f106934b, iB));
        this.f106935c = fArr;
        this.f106934b = iB;
    }
}
