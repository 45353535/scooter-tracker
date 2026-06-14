package com.yandex.div.internal.util;

import kf.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/yandex/div/internal/util/DoubleCheckProvider;", "T", "Lkf/a;", "Lkotlin/Function0;", "init", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Object;", "value$delegate", "Lkotlin/Lazy;", "getValue", "value", "utils_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DoubleCheckProvider<T> implements a {

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy value;

    public DoubleCheckProvider(@NotNull Function0<? extends T> function0) {
        this.value = i.a(function0);
    }

    private final T getValue() {
        return (T) this.value.getValue();
    }

    @Override // kf.a
    public T get() {
        return getValue();
    }
}
