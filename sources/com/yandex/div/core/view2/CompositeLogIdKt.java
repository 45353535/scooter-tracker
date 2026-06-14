package com.yandex.div.core.view2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"compositeLogIdOf", "Lcom/yandex/div/core/view2/CompositeLogId;", "scope", "Lcom/yandex/div/core/view2/Div2View;", "actionLogId", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CompositeLogIdKt {
    @NotNull
    public static final CompositeLogId compositeLogIdOf(@NotNull Div2View div2View, @NotNull String str) {
        return new CompositeLogId(div2View.getDataTag().getId(), div2View.getLogId(), str);
    }
}
