package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/internal/core/DivItemBuilderResult;", "", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "<init>", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "component1", "()Lk8/y0;", "component2", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk8/y0;", "getDiv", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getExpressionResolver", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DivItemBuilderResult {

    @NotNull
    private final y0 div;

    @NotNull
    private final ExpressionResolver expressionResolver;

    public DivItemBuilderResult(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
        this.div = y0Var;
        this.expressionResolver = expressionResolver;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final y0 getDiv() {
        return this.div;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) other;
        return Intrinsics.areEqual(this.div, divItemBuilderResult.div) && Intrinsics.areEqual(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    @NotNull
    public final y0 getDiv() {
        return this.div;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public int hashCode() {
        return (this.div.hashCode() * 31) + this.expressionResolver.hashCode();
    }

    @NotNull
    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }
}
