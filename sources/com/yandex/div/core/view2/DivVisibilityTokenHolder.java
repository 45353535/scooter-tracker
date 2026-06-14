package com.yandex.div.core.view2;

import androidx.annotation.AnyThread;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import k8.dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@AnyThread
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/DivVisibilityTokenHolder;", "", "<init>", "()V", "Lcom/yandex/div/core/view2/CompositeLogId;", "logId", "Lkotlin/Function1;", "", "Lk8/dp;", "", "emptyTokenCallback", "remove", "(Lcom/yandex/div/core/view2/CompositeLogId;Lkotlin/jvm/functions/Function1;)V", "", "logIds", "", "add", "(Ljava/util/Map;)Z", "getLogId", "(Lcom/yandex/div/core/view2/CompositeLogId;)Lcom/yandex/div/core/view2/CompositeLogId;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "tokens", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVisibilityTokenHolder {

    @NotNull
    private final ConcurrentLinkedQueue<Map<CompositeLogId, dp>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(@NotNull Map<CompositeLogId, dp> logIds) {
        return this.tokens.add(logIds);
    }

    @Nullable
    public final CompositeLogId getLogId(@NotNull CompositeLogId logId) {
        Object next;
        Set setKeySet;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Map) next).containsKey(logId)) {
                break;
            }
        }
        Map map = (Map) next;
        if (map != null && (setKeySet = map.keySet()) != null) {
            CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) setKeySet.toArray(new CompositeLogId[0]);
            if (compositeLogIdArr != null) {
                for (CompositeLogId compositeLogId : compositeLogIdArr) {
                    if (Intrinsics.areEqual(compositeLogId, logId)) {
                        return compositeLogId;
                    }
                }
            }
        }
        return null;
    }

    public final void remove(@NotNull CompositeLogId logId, @NotNull Function1<? super Map<CompositeLogId, ? extends dp>, Unit> emptyTokenCallback) {
        Object next;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map) next).remove(logId) != null) {
                    break;
                }
            }
        }
        Map map = (Map) next;
        if (map != null && map.isEmpty()) {
            emptyTokenCallback.invoke(map);
            this.tokens.remove(map);
        }
    }
}
