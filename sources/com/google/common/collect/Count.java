package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29410b;

    public void add(int i10) {
        this.f29410b += i10;
    }

    public int addAndGet(int i10) {
        int i11 = this.f29410b + i10;
        this.f29410b = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Count) && ((Count) obj).f29410b == this.f29410b;
    }

    public int get() {
        return this.f29410b;
    }

    public int getAndSet(int i10) {
        int i11 = this.f29410b;
        this.f29410b = i10;
        return i11;
    }

    public int hashCode() {
        return this.f29410b;
    }

    public void set(int i10) {
        this.f29410b = i10;
    }

    public String toString() {
        return Integer.toString(this.f29410b);
    }
}
