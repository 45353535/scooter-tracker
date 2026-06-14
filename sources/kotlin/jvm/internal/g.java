package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes3.dex */
final class g extends IntIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f93306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93307c;

    public g(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93306b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93307c < this.f93306b.length;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f93306b;
            int i10 = this.f93307c;
            this.f93307c = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93307c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
