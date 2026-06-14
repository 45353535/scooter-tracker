package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class di implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f64432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable[] f64433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64435d;

    public di(Throwable th2) {
        this.f64432a = th2;
        this.f64433b = th2.getSuppressed();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i10;
        Throwable th2 = this.f64432a;
        this.f64435d = false;
        if (th2 != null) {
            this.f64432a = th2.getCause();
        } else {
            Throwable[] thArr = this.f64433b;
            if (thArr != null && (i10 = this.f64434c) < thArr.length) {
                this.f64435d = i10 == 0;
                this.f64434c = i10 + 1;
                th2 = thArr[i10];
            }
        }
        if (th2 != null) {
            return th2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f64432a != null) {
            return true;
        }
        Throwable[] thArr = this.f64433b;
        return thArr != null && this.f64434c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
