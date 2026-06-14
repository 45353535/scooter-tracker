package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayStringVariableBinder;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "toStringValue", "(Ljava/lang/String;)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {
    public TwoWayStringVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    @NotNull
    public String toStringValue(@NotNull String str) {
        return str;
    }
}
