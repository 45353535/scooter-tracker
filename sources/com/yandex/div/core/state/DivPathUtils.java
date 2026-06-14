package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.as;
import k8.ea;
import k8.f7;
import k8.lq;
import k8.y0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0014\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0014\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020$\u0018\u00010#*\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b%\u0010&J#\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(H\u0000¢\u0006\u0004\b*\u0010+J%\u00103\u001a\u00020\n*\u00020-2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\n0(*\b\u0012\u0004\u0012\u00020\t0(¢\u0006\u0004\b4\u0010+J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\n0(*\b\u0012\u0004\u0012\u00020\u00160(¢\u0006\u0004\b5\u0010+JO\u00104\u001a\b\u0012\u0004\u0012\u00020\n0(\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00122\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001070\u0012¢\u0006\u0004\b4\u00108J\u0013\u00103\u001a\u0004\u0018\u00010\n*\u00020\t¢\u0006\u0004\b3\u00109¨\u0006:"}, d2 = {"Lcom/yandex/div/core/state/DivPathUtils;", "", "<init>", "()V", "Lcom/yandex/div/core/state/DivStatePath;", "other", "", "lastStateEquals", "(Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/state/DivStatePath;)Z", "Lk8/y0;", "", "divId", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "findByPath", "(Lk8/y0;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/y0;", "T", "", "Lkotlin/Function1;", "getDiv", "findRecursively", "(Ljava/lang/Iterable;Ljava/lang/String;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)Lk8/y0;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Ljava/lang/Iterable;Ljava/lang/String;)Lk8/y0;", "Landroid/view/View;", "path", "Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "findStateLayout$div_release", "(Landroid/view/View;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "findStateLayout", "findDivState$div_release", "(Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lk8/y0;", "findDivState", "Lk8/ea$c;", "state", "Lkotlin/Pair;", "Lk8/y0$o;", "tryFindStateDivAndLayout$div_release", "(Landroid/view/View;Lk8/ea$c;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lkotlin/Pair;", "tryFindStateDivAndLayout", "", "paths", "compactPathList$div_release", "(Ljava/util/List;)Ljava/util/List;", "compactPathList", "Lk8/lq;", "Lkotlin/Function0;", "", "errorCallback", "getId$div_release", "(Lk8/lq;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "getId", "getIds", "getItemIds", "div", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "(Lk8/y0;)Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPathUtils {

    @NotNull
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    private final y0 findByPath(y0 y0Var, String str, ExpressionResolver expressionResolver) {
        if (y0Var instanceof y0.o) {
            y0.o oVar = (y0.o) y0Var;
            if (!Intrinsics.areEqual(getId$div_release$default(INSTANCE, oVar.d(), null, 1, null), str)) {
                y0Var = null;
            }
            y0.o oVar2 = (y0.o) y0Var;
            return oVar2 != null ? oVar2 : findRecursively(oVar.d().I, str, expressionResolver, new Function1<lq.c, y0>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final y0 invoke(@NotNull lq.c cVar) {
                    return cVar.f88889c;
                }
            });
        }
        if (y0Var instanceof y0.q) {
            return findRecursively(((y0.q) y0Var).d().f86342q, str, expressionResolver, new Function1<as.c, y0>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final y0 invoke(@NotNull as.c cVar) {
                    return cVar.f86355a;
                }
            });
        }
        if (y0Var instanceof y0.c) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((y0.c) y0Var).d(), expressionResolver), str);
        }
        if (y0Var instanceof y0.g) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((y0.g) y0Var).d()), str, expressionResolver, null, 4, null);
        }
        if (y0Var instanceof y0.e) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((y0.e) y0Var).d(), expressionResolver), str);
        }
        if (y0Var instanceof y0.k) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((y0.k) y0Var).d(), expressionResolver), str);
        }
        if (y0Var instanceof y0.d) {
            List list = ((y0.d) y0Var).d().f92318q;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((y0Var instanceof y0.r) || (y0Var instanceof y0.h) || (y0Var instanceof y0.n) || (y0Var instanceof y0.j) || (y0Var instanceof y0.f) || (y0Var instanceof y0.i) || (y0Var instanceof y0.m) || (y0Var instanceof y0.l) || (y0Var instanceof y0.s) || (y0Var instanceof y0.p)) {
            return null;
        }
        throw new m();
    }

    private final <T> y0 findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, Function1<? super T, ? extends y0> function1) {
        y0 y0VarFindByPath;
        Iterator<? extends T> it = iterable.iterator();
        do {
            y0VarFindByPath = null;
            if (!it.hasNext()) {
                break;
            }
            y0 y0VarInvoke = function1.invoke(it.next());
            if (y0VarInvoke != null) {
                y0VarFindByPath = INSTANCE.findByPath(y0VarInvoke, str, expressionResolver);
            }
        } while (y0VarFindByPath == null);
        return y0VarFindByPath;
    }

    static /* synthetic */ y0 findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: com.yandex.div.core.state.DivPathUtils.findRecursively.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final y0 invoke(Object obj2) {
                    return (y0) obj2;
                }
            };
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, lq lqVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return divPathUtils.getId$div_release(lqVar, function0);
    }

    public static /* synthetic */ List getIds$default(DivPathUtils divPathUtils, List list, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function12 = new Function1() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        return divPathUtils.getIds(list, function1, function12);
    }

    private final boolean lastStateEquals(DivStatePath divStatePath, DivStatePath divStatePath2) {
        DivStatePath divStatePathParentState;
        if (divStatePath2.getContainsOnlyStates()) {
            return Intrinsics.areEqual(divStatePath != null ? divStatePath.getPathToLastState() : null, divStatePath2.getPathToLastState());
        }
        if (divStatePath != null && (divStatePathParentState = divStatePath.parentState()) != null) {
            fullPath$div_release = divStatePathParentState.getFullPath$div_release();
        }
        return Intrinsics.areEqual(fullPath$div_release, divStatePath2.parentState().getFullPath$div_release());
    }

    @NotNull
    public final List<DivStatePath> compactPathList$div_release(@NotNull List<DivStatePath> paths) {
        List listListOf;
        if (paths.isEmpty()) {
            return paths;
        }
        List listSortedWith = CollectionsKt.sortedWith(paths, DivStatePath.INSTANCE.alphabeticalComparator$div_release());
        List<DivStatePath> list = listSortedWith;
        Object objFirst = CollectionsKt.first((List<? extends Object>) listSortedWith);
        int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(list, 9);
        if (iCollectionSizeOrDefault == 0) {
            listListOf = CollectionsKt.listOf(objFirst);
        } else {
            ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
            arrayList.add(objFirst);
            Object obj = objFirst;
            for (DivStatePath divStatePath : list) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            listListOf = arrayList;
        }
        return CollectionsKt.distinct(listListOf);
    }

    @Nullable
    public final y0 findDivState$div_release(@NotNull y0 y0Var, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) {
        List<Pair<String, String>> states = divStatePath.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component1();
            if (y0Var == null || (y0Var = INSTANCE.findByPath(y0Var, str, expressionResolver)) == null) {
                return null;
            }
        }
        return y0Var;
    }

    @Nullable
    public final DivStateLayout findStateLayout$div_release(@NotNull View view, @NotNull DivStatePath divStatePath) throws StateConflictException {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            if (lastStateEquals(divStateLayout.getPath(), divStatePath)) {
                return divStateLayout;
            }
        }
        Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
        DivStateLayout divStateLayout2 = null;
        while (it.hasNext()) {
            DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release((View) it.next(), divStatePath);
            if (divStateLayoutFindStateLayout$div_release != null) {
                if (Intrinsics.areEqual(String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null), String.valueOf(divStateLayoutFindStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + divStatePath + "'. Found multiple elements that respond to path '" + divStateLayoutFindStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = divStateLayoutFindStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    @Nullable
    public final String getId(@NotNull y0 y0Var) {
        f7 f7VarC = y0Var.c();
        return f7VarC instanceof lq ? getId$div_release$default(INSTANCE, (lq) f7VarC, null, 1, null) : f7VarC.getId();
    }

    @NotNull
    public final String getId$div_release(@NotNull lq lqVar, @Nullable Function0<Unit> function0) {
        String str = lqVar.f88873p;
        if (str != null) {
            return str;
        }
        String id2 = lqVar.getId();
        if (id2 != null) {
            return id2;
        }
        if (function0 != null) {
            function0.invoke();
        }
        return "";
    }

    @NotNull
    public final List<String> getIds(@NotNull List<? extends y0> list) {
        return getIds$default(this, list, new Function1<y0, y0>() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final y0 invoke(@NotNull y0 y0Var) {
                return y0Var;
            }
        }, null, 2, null);
    }

    @NotNull
    public final List<String> getItemIds(@NotNull List<DivItemBuilderResult> list) {
        return getIds(list, new Function1<DivItemBuilderResult, y0>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final y0 invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return divItemBuilderResult.getDiv();
            }
        }, new Function1<DivItemBuilderResult, ExpressionResolverImpl>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.2
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final ExpressionResolverImpl invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            }
        });
    }

    @Nullable
    public final Pair<DivStateLayout, y0.o> tryFindStateDivAndLayout$div_release(@NotNull View view, @NotNull ea.c cVar, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) throws StateConflictException {
        y0.o div;
        DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release(view, divStatePath);
        if (divStateLayoutFindStateLayout$div_release == null) {
            DivStatePath divStatePathParentState = divStatePath.parentState();
            if ((divStatePathParentState.isRootPath() && cVar.f87216b == divStatePath.getTopLevelStateId()) || findStateLayout$div_release(view, divStatePathParentState) == null) {
                return null;
            }
        }
        if (divStateLayoutFindStateLayout$div_release == null || (div = divStateLayoutFindStateLayout$div_release.getDiv()) == null) {
            y0 y0VarFindDivState$div_release = findDivState$div_release(cVar.f87215a, divStatePath, expressionResolver);
            div = y0VarFindDivState$div_release instanceof y0.o ? (y0.o) y0VarFindDivState$div_release : null;
            if (div == null) {
                return null;
            }
        }
        return new Pair<>(divStateLayoutFindStateLayout$div_release, div);
    }

    private final y0 findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            y0 y0VarFindByPath = INSTANCE.findByPath(divItemBuilderResult.getDiv(), str, divItemBuilderResult.getExpressionResolver());
            if (y0VarFindByPath != null) {
                return y0VarFindByPath;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.util.List<java.lang.String> getIds(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends k8.y0> r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, com.yandex.div.core.expression.ExpressionResolverImpl> r12) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r1 = r10.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            com.yandex.div.core.state.DivPathUtils r5 = com.yandex.div.core.state.DivPathUtils.INSTANCE
            java.lang.Object r2 = r11.invoke(r2)
            k8.y0 r2 = (k8.y0) r2
            java.lang.String r2 = r5.getId(r2)
            if (r2 != 0) goto L26
            goto Lb
        L26:
            java.lang.Object r5 = r0.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L32
            int r4 = r5.intValue()
        L32:
            int r4 = r4 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r3)
            goto Lb
        L3b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r2)
            r1.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r2 = r4
        L4b:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r10.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L5c
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L5c:
            com.yandex.div.core.state.DivPathUtils r7 = com.yandex.div.core.state.DivPathUtils.INSTANCE
            java.lang.Object r8 = r11.invoke(r5)
            k8.y0 r8 = (k8.y0) r8
            java.lang.String r7 = r7.getId(r8)
            if (r7 == 0) goto L90
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L77
            int r8 = r8.intValue()
            goto L78
        L77:
            r8 = r4
        L78:
            if (r8 <= r3) goto L8e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r7 = 35
            r8.append(r7)
            r8.append(r2)
            java.lang.String r7 = r8.toString()
        L8e:
            if (r7 != 0) goto La8
        L90:
            java.lang.Object r5 = r12.invoke(r5)
            com.yandex.div.core.expression.ExpressionResolverImpl r5 = (com.yandex.div.core.expression.ExpressionResolverImpl) r5
            if (r5 == 0) goto L9e
            java.lang.String r5 = r5.getItemBuilderData()
        L9c:
            r7 = r5
            goto La0
        L9e:
            r5 = 0
            goto L9c
        La0:
            if (r7 != 0) goto La8
            com.yandex.div.core.expression.local.ChildPathUnitCache r5 = com.yandex.div.core.expression.local.ChildPathUnitCache.INSTANCE
            java.lang.String r7 = r5.getValue$div_release(r2)
        La8:
            r1.add(r7)
            r2 = r6
            goto L4b
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.state.DivPathUtils.getIds(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.util.List");
    }
}
