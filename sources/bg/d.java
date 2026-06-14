package bg;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends IntIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6412e;

    public d(int i10, int i11, int i12) {
        this.f6409b = i12;
        this.f6410c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f6411d = z10;
        this.f6412e = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6411d;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i10 = this.f6412e;
        if (i10 != this.f6410c) {
            this.f6412e = this.f6409b + i10;
            return i10;
        }
        if (!this.f6411d) {
            throw new NoSuchElementException();
        }
        this.f6411d = false;
        return i10;
    }
}
