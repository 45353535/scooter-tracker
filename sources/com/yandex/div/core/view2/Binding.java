package com.yandex.div.core.view2;

import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import k8.ea;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/Binding;", "", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "Lk8/ea;", "data", "<init>", "(Lcom/yandex/div/DivDataTag;Lk8/ea;)V", "Lcom/yandex/div/DivDataTag;", "getTag", "()Lcom/yandex/div/DivDataTag;", "Lk8/ea;", "getData", "()Lk8/ea;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Binding {

    @Nullable
    private final ea data;

    @NotNull
    private final DivDataTag tag;

    public Binding(@NotNull DivDataTag divDataTag, @Nullable ea eaVar) {
        this.tag = divDataTag;
        this.data = eaVar;
    }

    @Nullable
    public final ea getData() {
        return this.data;
    }

    @NotNull
    public final DivDataTag getTag() {
        return this.tag;
    }
}
