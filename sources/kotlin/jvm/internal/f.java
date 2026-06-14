package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;

/* JADX INFO: loaded from: classes3.dex */
final class f extends FloatIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f93304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93305c;

    public f(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93304b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93305c < this.f93304b.length;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.f93304b;
            int i10 = this.f93305c;
            this.f93305c = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93305c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
