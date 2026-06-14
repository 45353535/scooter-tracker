package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/internal/util/WeakRef;", "T", "Lkotlin/properties/e;", "", "obj", "<init>", "(Ljava/lang/Object;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/ref/WeakReference;", "weakReference", "Ljava/lang/ref/WeakReference;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class WeakRef<T> implements e {

    @Nullable
    private WeakReference<T> weakReference;

    public WeakRef(@Nullable T t10) {
        this.weakReference = t10 != null ? new WeakReference<>(t10) : null;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    @Nullable
    public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // kotlin.properties.e
    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        this.weakReference = value != null ? new WeakReference<>(value) : null;
    }
}
