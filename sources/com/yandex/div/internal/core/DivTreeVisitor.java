package com.yandex.div.internal.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.as;
import k8.k8;
import k8.lq;
import k8.y0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00028\u0000*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH$¢\u0006\u0004\b\u0015\u0010\u0013JU\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u001fJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010!J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010#J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020$2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010%J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020&2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010'J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020(2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010)J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020*2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010+J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010-J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020.2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010/J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u0002002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u00101J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u0002022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u00103J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u0002042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u00105J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u0002062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u00107J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u00109J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020:2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010;J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020<2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010=J'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020>2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010?R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, d2 = {"Lcom/yandex/div/internal/core/DivTreeVisitor;", "T", "", "Lkotlin/Function1;", "", "returnCondition", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lk8/k8;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "parent", "visit", "(Lk8/k8;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/lang/Object;)Ljava/lang/Object;", "Lk8/y0;", "div", "parentContext", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "data", "defaultVisit", "", FirebaseAnalytics.Param.ITEMS, "itemBuilder", "pathOverride", "defaultVisitCollection", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/util/List;Lk8/k8;Ljava/util/List;)Ljava/lang/Object;", "visitCollectionChild", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Ljava/lang/Object;)Ljava/lang/Object;", "Lk8/y0$c;", "(Lk8/y0$c;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$g;", "(Lk8/y0$g;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$e;", "(Lk8/y0$e;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$k;", "(Lk8/y0$k;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$q;", "(Lk8/y0$q;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$o;", "(Lk8/y0$o;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$d;", "(Lk8/y0$d;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$r;", "(Lk8/y0$r;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$h;", "(Lk8/y0$h;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$f;", "(Lk8/y0$f;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$m;", "(Lk8/y0$m;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$i;", "(Lk8/y0$i;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$n;", "(Lk8/y0$n;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$j;", "(Lk8/y0$j;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$l;", "(Lk8/y0$l;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$s;", "(Lk8/y0$s;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lk8/y0$p;", "(Lk8/y0$p;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivTreeVisitor<T> {

    @Nullable
    private final Function1<T, Boolean> returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor(@Nullable Function1<? super T, Boolean> function1) {
        this.returnCondition = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object defaultVisitCollection$default(DivTreeVisitor divTreeVisitor, y0 y0Var, BindingContext bindingContext, DivStatePath divStatePath, List list, k8 k8Var, List list2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultVisitCollection");
        }
        if ((i10 & 16) != 0) {
            k8Var = null;
        }
        if ((i10 & 32) != 0) {
            list2 = null;
        }
        return divTreeVisitor.defaultVisitCollection(y0Var, bindingContext, divStatePath, list, k8Var, list2);
    }

    protected abstract T defaultVisit(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path);

    protected T defaultVisitCollection(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path, @Nullable List<? extends y0> items, @Nullable k8 itemBuilder, @Nullable List<DivStatePath> pathOverride) {
        List<String> ids;
        DivStatePath divStatePathAppendDiv;
        T tDefaultVisit = defaultVisit(data, context, path);
        Function1<T, Boolean> function1 = this.returnCondition;
        if (function1 != null && function1.invoke(tDefaultVisit).booleanValue()) {
            return tDefaultVisit;
        }
        if (itemBuilder != null) {
            return visit(itemBuilder, context, path, tDefaultVisit);
        }
        if (items != null && (ids = DivPathUtils.INSTANCE.getIds(items)) != null) {
            int i10 = 0;
            for (T t10 : items) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                y0 y0Var = (y0) t10;
                if (pathOverride == null || (divStatePathAppendDiv = pathOverride.get(i10)) == null) {
                    divStatePathAppendDiv = path.appendDiv(ids.get(i10));
                }
                T tVisitCollectionChild = visitCollectionChild(y0Var, context, divStatePathAppendDiv, tDefaultVisit);
                Function1<T, Boolean> function12 = this.returnCondition;
                if (function12 != null && function12.invoke(tVisitCollectionChild).booleanValue()) {
                    return tVisitCollectionChild;
                }
                i10 = i11;
            }
        }
        return tDefaultVisit;
    }

    protected final T visit(@NotNull y0 div, @NotNull BindingContext parentContext, @NotNull DivStatePath path) {
        BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
        if (div instanceof y0.r) {
            return visit((y0.r) div, childContext, path);
        }
        if (div instanceof y0.h) {
            return visit((y0.h) div, childContext, path);
        }
        if (div instanceof y0.f) {
            return visit((y0.f) div, childContext, path);
        }
        if (div instanceof y0.m) {
            return visit((y0.m) div, childContext, path);
        }
        if (div instanceof y0.c) {
            return visit((y0.c) div, childContext, path);
        }
        if (div instanceof y0.g) {
            return visit((y0.g) div, childContext, path);
        }
        if (div instanceof y0.e) {
            return visit((y0.e) div, childContext, path);
        }
        if (div instanceof y0.k) {
            return visit((y0.k) div, childContext, path);
        }
        if (div instanceof y0.q) {
            return visit((y0.q) div, childContext, path);
        }
        if (div instanceof y0.o) {
            return visit((y0.o) div, childContext, path);
        }
        if (div instanceof y0.d) {
            return visit((y0.d) div, childContext, path);
        }
        if (div instanceof y0.i) {
            return visit((y0.i) div, childContext, path);
        }
        if (div instanceof y0.n) {
            return visit((y0.n) div, childContext, path);
        }
        if (div instanceof y0.j) {
            return visit((y0.j) div, childContext, path);
        }
        if (div instanceof y0.l) {
            return visit((y0.l) div, childContext, path);
        }
        if (div instanceof y0.s) {
            return visit((y0.s) div, childContext, path);
        }
        if (div instanceof y0.p) {
            return visit((y0.p) div, childContext, path);
        }
        throw new m();
    }

    protected T visitCollectionChild(@NotNull y0 div, @NotNull BindingContext context, @NotNull DivStatePath path, T parent) {
        return visit(div, context, path);
    }

    public /* synthetic */ DivTreeVisitor(Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1);
    }

    private final T visit(k8 k8Var, BindingContext bindingContext, DivStatePath divStatePath, T t10) {
        ExpressionResolver expressionResolver;
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(k8Var, bindingContext.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (T t11 : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t11;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = bindingContext.getDivView().getRuntimeStore().resolveRuntimeWith(bindingContext.getDivView(), divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), bindingContext.getExpressionResolver());
            if (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) {
                expressionResolver = divItemBuilderResult.getExpressionResolver();
            }
            T tVisitCollectionChild = visitCollectionChild(divItemBuilderResult.getDiv(), new BindingContext(bindingContext.getDivView(), expressionResolver), divStatePathAppendDiv, t10);
            Function1<T, Boolean> function1 = this.returnCondition;
            if (function1 != null && function1.invoke(tVisitCollectionChild).booleanValue()) {
                return tVisitCollectionChild;
            }
            i10 = i11;
        }
        return t10;
    }

    protected T visit(@NotNull y0.c data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.d().B, data.d().f91616z, null, 32, null);
    }

    protected T visit(@NotNull y0.g data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.d().f88817y, null, null, 48, null);
    }

    protected T visit(@NotNull y0.e data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.d().f91300u, data.d().f91298s, null, 32, null);
    }

    protected T visit(@NotNull y0.k data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.d().f88456t, data.d().f88454r, null, 32, null);
    }

    protected T visit(@NotNull y0.q data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        List list = data.d().f86342q;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((as.c) it.next()).f86355a);
        }
        return (T) defaultVisitCollection$default(this, data, context, path, arrayList, null, null, 48, null);
    }

    protected T visit(@NotNull y0.o data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        String id$div_release$default = DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, data.d(), null, 1, null);
        List<lq.c> list = data.d().I;
        ArrayList arrayList = new ArrayList();
        for (lq.c cVar : list) {
            DivStatePath divStatePathAppend$div_release = cVar.f88889c == null ? null : path.append$div_release(id$div_release$default, cVar, cVar.f88890d);
            if (divStatePathAppend$div_release != null) {
                arrayList.add(divStatePathAppend$div_release);
            }
        }
        List list2 = data.d().I;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            y0 y0Var = ((lq.c) it.next()).f88889c;
            if (y0Var != null) {
                arrayList2.add(y0Var);
            }
        }
        return defaultVisitCollection(data, context, path, arrayList2, null, arrayList);
    }

    protected T visit(@NotNull y0.d data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return (T) defaultVisitCollection$default(this, data, context, path, data.d().f92318q, null, null, 48, null);
    }

    protected T visit(@NotNull y0.r data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.h data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.f data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.m data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.i data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.n data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.j data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.l data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.s data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull y0.p data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        return defaultVisit(data, context, path);
    }
}
