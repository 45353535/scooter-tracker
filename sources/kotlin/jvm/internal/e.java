package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;

/* JADX INFO: loaded from: classes3.dex */
final class e extends DoubleIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f93297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93298c;

    public e(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93297b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93298c < this.f93297b.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.f93297b;
            int i10 = this.f93298c;
            this.f93298c = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93298c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
