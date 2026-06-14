package com.yandex.div.core.animation;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/animation/NumberValueProperty;", "Lcom/yandex/div/core/animation/FloatProperty;", "Lcom/yandex/div/data/Variable$DoubleVariable;", "()V", "get", "", TypedValues.AttributesType.S_TARGET, "(Lcom/yandex/div/data/Variable$DoubleVariable;)Ljava/lang/Float;", "setValue", "", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NumberValueProperty extends FloatProperty<Variable.DoubleVariable> {

    @NotNull
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Float get(@NotNull Variable.DoubleVariable target) {
        Object value = target.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
        return Float.valueOf((float) ((Double) value).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(@NotNull Variable.DoubleVariable target, float value) {
        Log.i("NumberValueProperty", "set variable value: " + value);
        target.setValueDirectly(Double.valueOf((double) value));
    }
}
