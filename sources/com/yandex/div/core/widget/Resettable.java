package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/widget/Resettable;", "T", "", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "initialized", "", "getInitialized", "()Z", "value", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "reset", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Resettable<T> {

    @NotNull
    private final Function0<T> initializer;

    @Nullable
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(@NotNull Function0<? extends T> function0) {
        this.initializer = function0;
    }

    public final T get() {
        if (this.value == null) {
            this.value = this.initializer.invoke();
        }
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    public final void reset() {
        this.value = null;
    }
}
