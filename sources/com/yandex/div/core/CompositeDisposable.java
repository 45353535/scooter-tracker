package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0003R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/CompositeDisposable;", "Lcom/yandex/div/core/Disposable;", "<init>", "()V", "disposable", "", "add", "(Lcom/yandex/div/core/Disposable;)V", "close", "", "disposables", "Ljava/util/List;", "", "closed", "Z", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeDisposable implements Disposable, AutoCloseable {
    private boolean closed;

    @NotNull
    private final List<Disposable> disposables = new ArrayList();

    public final void add(@NotNull Disposable disposable) {
        if (this.closed) {
            throw new IllegalArgumentException("close() method was called");
        }
        if (disposable != Disposable.NULL) {
            this.disposables.add(disposable);
        }
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        Iterator<T> it = this.disposables.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        this.disposables.clear();
        this.closed = true;
    }
}
