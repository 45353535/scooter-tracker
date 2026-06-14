package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;

/* JADX INFO: loaded from: classes3.dex */
final class l extends ShortIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short[] f93314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93315c;

    public l(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93314b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93315c < this.f93314b.length;
    }

    @Override // kotlin.collections.ShortIterator
    public short nextShort() {
        try {
            short[] sArr = this.f93314b;
            int i10 = this.f93315c;
            this.f93315c = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93315c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
