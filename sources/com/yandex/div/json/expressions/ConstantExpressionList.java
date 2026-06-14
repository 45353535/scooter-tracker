package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/json/expressions/ConstantExpressionList;", "", "T", "Lcom/yandex/div/json/expressions/ExpressionList;", "", "values", "<init>", "(Ljava/util/List;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "evaluate", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lkotlin/Function1;", "", "callback", "Lcom/yandex/div/core/Disposable;", "observe", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getValues$div_data_release", "()Ljava/util/List;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConstantExpressionList<T> implements ExpressionList<T> {

    @NotNull
    private final List<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(@NotNull List<? extends T> list) {
        this.values = list;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ConstantExpressionList) && Intrinsics.areEqual(this.values, ((ConstantExpressionList) other).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public List<T> evaluate(@NotNull ExpressionResolver resolver) {
        return this.values;
    }

    @NotNull
    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback) {
        return Disposable.NULL;
    }
}
