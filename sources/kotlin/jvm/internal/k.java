package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes3.dex */
final class k extends LongIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f93312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93313c;

    public k(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93312b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93313c < this.f93312b.length;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.f93312b;
            int i10 = this.f93313c;
            this.f93313c = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93313c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
