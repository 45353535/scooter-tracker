package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import k8.lq;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/reuse/NewToken;", "Lcom/yandex/div/core/view2/reuse/Token;", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "childIndex", "", "lastExistingParent", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;ILcom/yandex/div/core/view2/reuse/ExistingToken;)V", "getLastExistingParent", "()Lcom/yandex/div/core/view2/reuse/ExistingToken;", "setLastExistingParent", "(Lcom/yandex/div/core/view2/reuse/ExistingToken;)V", "getChildrenTokens", "", "itemsToNewTokenList", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NewToken extends Token {

    @Nullable
    private ExistingToken lastExistingParent;

    public NewToken(@NotNull DivItemBuilderResult divItemBuilderResult, int i10, @Nullable ExistingToken existingToken) {
        super(divItemBuilderResult, i10);
        this.lastExistingParent = existingToken;
    }

    private final List<NewToken> itemsToNewTokenList(List<DivItemBuilderResult> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new NewToken((DivItemBuilderResult) obj, i10, this.lastExistingParent));
            i10 = i11;
        }
        return arrayList;
    }

    @NotNull
    public final List<NewToken> getChildrenTokens() {
        y0 y0Var;
        ExpressionResolver expressionResolver = getItem().getExpressionResolver();
        y0 div = getItem().getDiv();
        if (div instanceof y0.r) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.h) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.f) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.m) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.i) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.n) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.j) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.l) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.s) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.p) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.c) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((y0.c) div).d(), expressionResolver));
        }
        if (div instanceof y0.d) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(DivCollectionExtensionsKt.getNonNullItems(((y0.d) div).d()), expressionResolver));
        }
        if (div instanceof y0.g) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((y0.g) div).d(), expressionResolver));
        }
        if (div instanceof y0.e) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((y0.e) div).d(), expressionResolver));
        }
        if (div instanceof y0.k) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((y0.k) div).d(), expressionResolver));
        }
        if (div instanceof y0.q) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((y0.q) div).d(), expressionResolver));
        }
        if (!(div instanceof y0.o)) {
            throw new m();
        }
        lq.c defaultState = DivUtilKt.getDefaultState(((y0.o) div).d(), expressionResolver);
        return (defaultState == null || (y0Var = defaultState.f88889c) == null) ? CollectionsKt.emptyList() : itemsToNewTokenList(CollectionsKt.listOf(DivCollectionExtensionsKt.toItemBuilderResult(y0Var, expressionResolver)));
    }

    @Nullable
    public final ExistingToken getLastExistingParent() {
        return this.lastExistingParent;
    }

    public final void setLastExistingParent(@Nullable ExistingToken existingToken) {
        this.lastExistingParent = existingToken;
    }
}
