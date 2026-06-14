package j$.util;

import j$.util.PrimitiveIterator;
import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f84804a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f84805b = new k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f84806c = new l0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f84807d = new j0();

    public static Spliterator.OfInt spliterator(int[] iArr, int i10, int i11, int i12) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i10, i11);
        return new n0(iArr, i10, i11, i12);
    }

    public static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i10) {
        return new p0((java.util.Collection) Objects.requireNonNull(collection), i10);
    }

    public static Spliterator.OfInt spliteratorUnknownSize(PrimitiveIterator.OfInt ofInt, int i10) {
        return new o0((PrimitiveIterator.OfInt) Objects.requireNonNull(ofInt), i10);
    }
}
