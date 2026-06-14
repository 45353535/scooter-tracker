package com.mobilefuse.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J$\u0010\n\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J,\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/utils/TestableLazy;", "T", "", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "Ljava/lang/Object;", "isInitialized", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "reset", "", "setValue", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class TestableLazy<T> {
    private T _value;
    private final Function0<T> initializer;
    private boolean isInitialized;

    /* JADX WARN: Multi-variable type inference failed */
    public TestableLazy(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    public final T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (!this.isInitialized) {
            this._value = this.initializer.invoke();
            this.isInitialized = true;
        }
        T t10 = this._value;
        Intrinsics.checkNotNull(t10);
        return t10;
    }

    public final void reset() {
        this.isInitialized = false;
        this._value = null;
    }

    public final void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        this._value = value;
        this.isInitialized = true;
    }
}
