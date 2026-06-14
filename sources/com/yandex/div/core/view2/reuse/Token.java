package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/reuse/Token;", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "item", "", "childIndex", "<init>", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;I)V", "other", "", "isCombinable", "(Lcom/yandex/div/core/view2/reuse/Token;)Z", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "I", "getChildIndex", "()I", "divHash", "getDivHash", "Lk8/y0;", "div", "Lk8/y0;", "getDiv", "()Lk8/y0;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Token {
    private final int childIndex;

    @NotNull
    private final y0 div;
    private final int divHash;

    @NotNull
    private final DivItemBuilderResult item;

    public Token(@NotNull DivItemBuilderResult divItemBuilderResult, int i10) {
        this.item = divItemBuilderResult;
        this.childIndex = i10;
        this.divHash = divItemBuilderResult.getDiv().b();
        this.div = divItemBuilderResult.getDiv();
    }

    public final int getChildIndex() {
        return this.childIndex;
    }

    @NotNull
    public final y0 getDiv() {
        return this.div;
    }

    public final int getDivHash() {
        return this.divHash;
    }

    @NotNull
    public final DivItemBuilderResult getItem() {
        return this.item;
    }

    public final boolean isCombinable(@NotNull Token other) {
        return this.divHash == other.divHash && Intrinsics.areEqual(DivUtilKt.getType(this.div), DivUtilKt.getType(other.div));
    }
}
