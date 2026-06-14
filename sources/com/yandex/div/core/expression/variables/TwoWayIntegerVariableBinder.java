package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "Lcom/yandex/div/core/expression/variables/TwoWayVariableBinder;", "", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "", "toStringValue", "(J)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {
    public TwoWayIntegerVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Long l10) {
        return toStringValue(l10.longValue());
    }

    @NotNull
    public String toStringValue(long j10) {
        return String.valueOf(j10);
    }
}
