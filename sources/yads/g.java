package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends w73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110994b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f110995c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f110994b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = pf0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA != 2) {
            this.f110994b = 4;
            this.f110995c = a();
            if (this.f110994b != 3) {
                this.f110994b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f110994b = 2;
        Object obj = this.f110995c;
        this.f110995c = null;
        return obj;
    }
}
