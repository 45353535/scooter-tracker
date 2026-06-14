package com.yandex.div.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/CompositeDisposable;", "Lcom/yandex/div/core/Disposable;", "disposable", "", "plusAssign", "(Lcom/yandex/div/core/CompositeDisposable;Lcom/yandex/div/core/Disposable;)V", "div-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class CompositeDisposableKt {
    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
