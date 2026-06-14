package com.yandex.div.evaluable;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/FunctionProvider;", "", "", "name", "", "Lcom/yandex/div/evaluable/EvaluableType;", "args", "Lcom/yandex/div/evaluable/Function;", "get", "(Ljava/lang/String;Ljava/util/List;)Lcom/yandex/div/evaluable/Function;", "getMethod", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FunctionProvider {
    @NotNull
    Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args);

    @NotNull
    Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args);
}
