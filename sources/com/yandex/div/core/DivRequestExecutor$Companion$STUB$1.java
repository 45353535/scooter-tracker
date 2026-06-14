package com.yandex.div.core;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.DivRequestExecutor$Companion$STUB$1;
import com.yandex.div.core.images.LoadReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/yandex/div/core/DivRequestExecutor$Companion$STUB$1", "Lcom/yandex/div/core/DivRequestExecutor;", "execute", "Lcom/yandex/div/core/images/LoadReference;", "request", "Lcom/yandex/div/core/DivRequestExecutor$Request;", "callback", "Lcom/yandex/div/core/DivRequestExecutor$Callback;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivRequestExecutor$Companion$STUB$1 implements DivRequestExecutor {
    DivRequestExecutor$Companion$STUB$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
    }

    @Override // com.yandex.div.core.DivRequestExecutor
    @NotNull
    public LoadReference execute(@NotNull DivRequestExecutor.Request request, @Nullable DivRequestExecutor.Callback callback) {
        return new LoadReference() { // from class: y6.j
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                DivRequestExecutor$Companion$STUB$1.execute$lambda$0();
            }
        };
    }
}
