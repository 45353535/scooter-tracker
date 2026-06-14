package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/widget/DimensionAffectingViewProperty;", "T", "Lkotlin/properties/e;", "Landroid/view/View;", "propertyValue", "Lkotlin/Function1;", "modifier", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/view/View;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Landroid/view/View;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DimensionAffectingViewProperty<T> implements e {

    @Nullable
    private final Function1<T, T> modifier;
    private T propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionAffectingViewProperty(T t10, @Nullable Function1<? super T, ? extends T> function1) {
        this.propertyValue = t10;
        this.modifier = function1;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((View) obj, (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.e
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue((View) obj, (KProperty<?>) kProperty, obj2);
    }

    public T getValue(@NotNull View thisRef, @NotNull KProperty<?> property) {
        return this.propertyValue;
    }

    public void setValue(@NotNull View thisRef, @NotNull KProperty<?> property, T value) {
        T tInvoke;
        Function1<T, T> function1 = this.modifier;
        if (function1 != null && (tInvoke = function1.invoke(value)) != null) {
            value = tInvoke;
        }
        if (Intrinsics.areEqual(this.propertyValue, value)) {
            return;
        }
        this.propertyValue = value;
        thisRef.requestLayout();
    }
}
