package com.yandex.div.core.expression.variables;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "delegate", "<init>", "(Lcom/yandex/div/core/expression/variables/DivVariableController;)V", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "()Lcom/yandex/div/core/expression/variables/DivVariableController;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlobalVariableController {

    @NotNull
    private final DivVariableController delegate;

    public GlobalVariableController(@NotNull DivVariableController divVariableController) {
        this.delegate = divVariableController;
    }
}
