package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;

/* JADX INFO: loaded from: classes3.dex */
final class d extends CharIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f93294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f93295c;

    public d(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f93294b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93295c < this.f93294b.length;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        try {
            char[] cArr = this.f93294b;
            int i10 = this.f93295c;
            this.f93295c = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f93295c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
