package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk8/y0;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/util/DivTreeWalk;", "walk", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/util/DivTreeWalk;", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItems", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivItemBuilderResult> getItems(y0 y0Var, ExpressionResolver expressionResolver) {
        if (y0Var instanceof y0.r) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.h) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.f) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.m) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.i) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.n) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.j) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.d) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.l) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.s) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.p) {
            return CollectionsKt.emptyList();
        }
        if (y0Var instanceof y0.c) {
            return DivCollectionExtensionsKt.buildItems(((y0.c) y0Var).d(), expressionResolver);
        }
        if (y0Var instanceof y0.g) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((y0.g) y0Var).d(), expressionResolver);
        }
        if (y0Var instanceof y0.e) {
            return DivCollectionExtensionsKt.buildItems(((y0.e) y0Var).d(), expressionResolver);
        }
        if (y0Var instanceof y0.k) {
            return DivCollectionExtensionsKt.buildItems(((y0.k) y0Var).d(), expressionResolver);
        }
        if (y0Var instanceof y0.q) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((y0.q) y0Var).d(), expressionResolver);
        }
        if (y0Var instanceof y0.o) {
            return DivCollectionExtensionsKt.statesToDivItemBuilderResult(((y0.o) y0Var).d(), expressionResolver);
        }
        throw new m();
    }

    @NotNull
    public static final DivTreeWalk walk(@NotNull y0 y0Var, @NotNull ExpressionResolver expressionResolver) {
        return new DivTreeWalk(y0Var, expressionResolver);
    }
}
