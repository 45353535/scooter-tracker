package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;

/* JADX INFO: loaded from: classes3.dex */
final class c extends ByteIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f93285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93286c;

    public c(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93285b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93286c < this.f93285b.length;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f93285b;
            int i10 = this.f93286c;
            this.f93286c = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93286c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
