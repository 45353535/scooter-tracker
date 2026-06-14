package com.yandex.div.core.view2.state;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.ea;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "", "Lk8/ea$c;", "state", "", "Lcom/yandex/div/core/state/DivStatePath;", "paths", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "switchStates", "(Lk8/ea$c;Ljava/util/List;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivStateSwitcher {
    void switchStates(@NotNull ea.c state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) throws StateConflictException;
}
