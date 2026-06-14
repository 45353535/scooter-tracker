package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class ic1 extends w73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f111957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f111958c;

    public ic1(Object obj) {
        this.f111958c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f111957b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f111957b) {
            throw new NoSuchElementException();
        }
        this.f111957b = true;
        return this.f111958c;
    }
}
