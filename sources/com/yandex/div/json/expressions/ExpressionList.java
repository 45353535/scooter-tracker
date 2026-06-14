package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/expressions/ExpressionList;", "", "T", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "evaluate", "(Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lkotlin/Function1;", "", "callback", "Lcom/yandex/div/core/Disposable;", "observe", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "Lcom/yandex/div/json/expressions/ConstantExpressionList;", "Lcom/yandex/div/json/expressions/MutableExpressionList;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExpressionList<T> {
    @NotNull
    List<T> evaluate(@NotNull ExpressionResolver resolver) throws ParsingException;

    @NotNull
    Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback);
}
