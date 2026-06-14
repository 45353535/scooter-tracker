package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/util/SparseArrayIterator;", "T", "", "array", "Landroidx/collection/SparseArrayCompat;", "(Landroidx/collection/SparseArrayCompat;)V", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "()Ljava/lang/Object;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SparseArrayIterator<T> implements Iterator<T>, a {

    @NotNull
    private final SparseArrayCompat<T> array;
    private int index;

    public SparseArrayIterator(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        this.array = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.size() > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.array;
        int i10 = this.index;
        this.index = i10 + 1;
        return sparseArrayCompat.valueAt(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
