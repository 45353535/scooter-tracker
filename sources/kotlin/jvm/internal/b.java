package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;

/* JADX INFO: loaded from: classes3.dex */
final class b extends BooleanIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f93283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93284c;

    public b(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93283b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93284c < this.f93283b.length;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f93283b;
            int i10 = this.f93284c;
            this.f93284c = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93284c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
