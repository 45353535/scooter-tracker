package bg;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends CharIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6408e;

    public a(char c10, char c11, int i10) {
        this.f6405b = i10;
        this.f6406c = c11;
        boolean z10 = false;
        if (i10 <= 0 ? Intrinsics.compare((int) c10, (int) c11) >= 0 : Intrinsics.compare((int) c10, (int) c11) <= 0) {
            z10 = true;
        }
        this.f6407d = z10;
        this.f6408e = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6407d;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i10 = this.f6408e;
        if (i10 != this.f6406c) {
            this.f6408e = this.f6405b + i10;
        } else {
            if (!this.f6407d) {
                throw new NoSuchElementException();
            }
            this.f6407d = false;
        }
        return (char) i10;
    }
}
