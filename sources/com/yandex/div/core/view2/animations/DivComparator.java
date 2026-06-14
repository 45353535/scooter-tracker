package com.yandex.div.core.view2.animations;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k8.ea;
import k8.f7;
import k8.u8;
import k8.x9;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001c\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b \u0010!J5\u0010$\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/animations/DivComparator;", "", "<init>", "()V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "extractChildren", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/List;", "Lk8/f7;", "", "hasTransitions", "(Lk8/f7;)Z", "Lk8/u8;", "isOverlap", "(Lk8/u8;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/ea;", "old", "new", "", "stateId", "oldResolver", "newResolver", "Lcom/yandex/div/core/view2/animations/DivComparatorReporter;", "reporter", "isDivDataReplaceable", "(Lk8/ea;Lk8/ea;JLcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/animations/DivComparatorReporter;)Z", "areDivsReplaceable", "(Lk8/y0;Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/animations/DivComparatorReporter;)Z", "areValuesReplaceable", "(Lk8/f7;Lk8/f7;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/view2/animations/DivComparatorReporter;)Z", "oldChildren", "newChildren", "areChildrenReplaceable", "(Ljava/util/List;Ljava/util/List;Lcom/yandex/div/core/view2/animations/DivComparatorReporter;)Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivComparator {

    @NotNull
    public static final DivComparator INSTANCE = new DivComparator();

    private DivComparator() {
    }

    public static /* synthetic */ boolean areChildrenReplaceable$default(DivComparator divComparator, List list, List list2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areChildrenReplaceable(list, list2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areDivsReplaceable$default(DivComparator divComparator, y0 y0Var, y0 y0Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areDivsReplaceable(y0Var, y0Var2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areValuesReplaceable$default(DivComparator divComparator, f7 f7Var, f7 f7Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areValuesReplaceable(f7Var, f7Var2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    private final List<DivItemBuilderResult> extractChildren(y0 div, ExpressionResolver resolver) {
        if (div instanceof y0.c) {
            return DivCollectionExtensionsKt.buildItems(((y0.c) div).d(), resolver);
        }
        if (div instanceof y0.g) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((y0.g) div).d(), resolver);
        }
        if (div instanceof y0.h) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.f) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.r) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.m) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.e) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.k) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.q) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.o) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.d) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.j) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.l) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.i) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.n) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.s) {
            return CollectionsKt.emptyList();
        }
        if (div instanceof y0.p) {
            return CollectionsKt.emptyList();
        }
        throw new m();
    }

    private final boolean hasTransitions(f7 f7Var) {
        return (f7Var.v() == null && f7Var.i() == null && f7Var.j() == null) ? false : true;
    }

    private final boolean isOverlap(u8 u8Var, ExpressionResolver expressionResolver) {
        return u8Var.I.evaluate(expressionResolver) == u8.d.OVERLAP;
    }

    public final boolean areChildrenReplaceable(@NotNull List<DivItemBuilderResult> oldChildren, @NotNull List<DivItemBuilderResult> newChildren, @Nullable DivComparatorReporter reporter) {
        if (oldChildren.size() != newChildren.size()) {
            if (reporter != null) {
                reporter.onComparisonDifferentChildCount();
            }
            return false;
        }
        List<Pair> listZip = CollectionsKt.zip(oldChildren, newChildren);
        if ((listZip instanceof Collection) && listZip.isEmpty()) {
            return true;
        }
        for (Pair pair : listZip) {
            DivComparatorReporter divComparatorReporter = reporter;
            if (!INSTANCE.areDivsReplaceable(((DivItemBuilderResult) pair.getFirst()).getDiv(), ((DivItemBuilderResult) pair.getSecond()).getDiv(), ((DivItemBuilderResult) pair.getFirst()).getExpressionResolver(), ((DivItemBuilderResult) pair.getSecond()).getExpressionResolver(), divComparatorReporter)) {
                return false;
            }
            reporter = divComparatorReporter;
        }
        return true;
    }

    public final boolean areDivsReplaceable(@Nullable y0 old, @Nullable y0 y0Var, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter reporter) {
        if (!Intrinsics.areEqual(old != null ? old.getClass() : null, y0Var != null ? y0Var.getClass() : null)) {
            if (reporter != null) {
                reporter.onComparisonDifferentClasses();
            }
            return false;
        }
        if (old == null || y0Var == null || old == y0Var) {
            return true;
        }
        return areValuesReplaceable(old.c(), y0Var.c(), oldResolver, newResolver, reporter) && areChildrenReplaceable(extractChildren(old, oldResolver), extractChildren(y0Var, newResolver), reporter);
    }

    public final boolean areValuesReplaceable(@NotNull f7 old, @NotNull f7 f7Var, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter reporter) {
        if (old.getId() != null && f7Var.getId() != null && !Intrinsics.areEqual(old.getId(), f7Var.getId()) && (hasTransitions(old) || hasTransitions(f7Var))) {
            if (reporter != null) {
                reporter.onComparisonDifferentIdsWithTransition();
            }
            return false;
        }
        if ((old instanceof x9) && (f7Var instanceof x9) && !Intrinsics.areEqual(((x9) old).f92311j, ((x9) f7Var).f92311j)) {
            if (reporter != null) {
                reporter.onComparisonDifferentCustomTypes();
            }
            return false;
        }
        if (!(old instanceof u8) || !(f7Var instanceof u8)) {
            return true;
        }
        u8 u8Var = (u8) old;
        u8 u8Var2 = (u8) f7Var;
        if (isOverlap(u8Var, oldResolver) != isOverlap(u8Var2, newResolver)) {
            if (reporter != null) {
                reporter.onComparisonDifferentOverlap();
            }
            return false;
        }
        if (DivUtilKt.isWrapContainer(u8Var, oldResolver) == DivUtilKt.isWrapContainer(u8Var2, newResolver)) {
            return true;
        }
        if (reporter != null) {
            reporter.onComparisonDifferentWrap();
        }
        return false;
    }

    public final boolean isDivDataReplaceable(@Nullable ea old, @NotNull ea eaVar, long stateId, @NotNull ExpressionResolver oldResolver, @NotNull ExpressionResolver newResolver, @Nullable DivComparatorReporter reporter) {
        Object obj;
        Object next;
        if (old == null) {
            if (reporter != null) {
                reporter.onComparisonNoOldData();
            }
            return false;
        }
        Iterator it = old.f87205c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ea.c) next).f87216b == stateId) {
                break;
            }
        }
        ea.c cVar = (ea.c) next;
        Iterator it2 = eaVar.f87205c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((ea.c) next2).f87216b == stateId) {
                obj = next2;
                break;
            }
        }
        ea.c cVar2 = (ea.c) obj;
        if (cVar == null || cVar2 == null) {
            if (reporter != null) {
                reporter.onComparisonNoState();
            }
            return false;
        }
        boolean zAreDivsReplaceable = areDivsReplaceable(cVar.f87215a, cVar2.f87215a, oldResolver, newResolver, reporter);
        if (zAreDivsReplaceable && reporter != null) {
            reporter.onComparisonSuccess();
        }
        return zAreDivsReplaceable;
    }
}
