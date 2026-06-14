package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ConsumingQueueIterator<T> extends AbstractIterator<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f29408d;

    ConsumingQueueIterator(Queue queue) {
        this.f29408d = (Queue) Preconditions.checkNotNull(queue);
    }

    @Override // com.google.common.collect.AbstractIterator
    protected Object computeNext() {
        return this.f29408d.isEmpty() ? a() : this.f29408d.remove();
    }
}
