package com.yandex.div.core.expression.local;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import java.util.List;
import k8.as;
import k8.k8;
import k8.lq;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u0013\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0012¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010H\u0012¢\u0006\u0004\b(\u0010)J/\u0010+\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b+\u0010,J/\u0010+\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020-2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010H\u0012¢\u0006\u0004\b+\u0010.J7\u00101\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0012¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u00122\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J/\u0010;\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?¨\u0006@"}, d2 = {"Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "", "Lcom/yandex/div/state/DivStateCache;", "divStateCache", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "temporaryStateCache", "Lcom/yandex/div/core/state/TabsStateCache;", "tabsCache", "<init>", "(Lcom/yandex/div/state/DivStateCache;Lcom/yandex/div/core/state/TemporaryDivStateCache;Lcom/yandex/div/core/state/TabsStateCache;)V", "Lk8/y0;", "div", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "parentRuntime", "", "visit", "(Lk8/y0;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "", FirebaseAnalytics.Param.ITEMS, "Lk8/k8;", "itemBuilder", "visitContainer", "(Lk8/y0;Lcom/yandex/div/core/view2/Div2View;Ljava/util/List;Lk8/k8;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "runtime", "(Lk8/k8;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "Lk8/lq;", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "resolver", "", "getActiveStateId", "(Lk8/lq;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionResolverImpl;)Ljava/lang/String;", "Lk8/y0$o;", "visitState", "(Lk8/y0$o;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "visitStates", "(Lk8/lq;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "Lk8/y0$q;", "visitTabs", "(Lk8/y0$q;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "Lk8/as;", "(Lk8/as;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;)V", "", "isActive", "visitChild", "(Lk8/y0;Lcom/yandex/div/core/view2/Div2View;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/expression/ExpressionsRuntime;Z)V", "rootDiv", "rootPath", "createAndAttachRuntimes", "(Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/Div2View;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "createAndAttachRuntimesToState", "(Lcom/yandex/div/core/view2/Div2View;Lk8/lq;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "createAndAttachRuntimesToTabs", "(Lcom/yandex/div/core/view2/Div2View;Lk8/as;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/state/DivStateCache;", "Lcom/yandex/div/core/state/TemporaryDivStateCache;", "Lcom/yandex/div/core/state/TabsStateCache;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivRuntimeVisitor {

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final TabsStateCache tabsCache;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    public DivRuntimeVisitor(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull TabsStateCache tabsStateCache) {
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.tabsCache = tabsStateCache;
    }

    private ExpressionsRuntime defaultVisit(y0 div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        ExpressionsRuntime orCreateRuntime = divView.getRuntimeStore().getOrCreateRuntime(path, div, parentRuntime.getExpressionResolver());
        orCreateRuntime.onAttachedToWindow(divView);
        return orCreateRuntime;
    }

    private String getActiveStateId(lq div, Div2View divView, DivStatePath path, ExpressionResolverImpl resolver) {
        String str = path.getStatesString$div_release() + IOUtils.DIR_SEPARATOR_UNIX + path.getLastDivId$div_release();
        String id2 = divView.getDivTag().getId();
        String state = this.temporaryStateCache.getState(id2, str);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id2, str);
        if (state2 == null) {
            String str2 = div.H;
            if (str2 != null) {
                Variable mutableVariable = resolver.getVariableController().getMutableVariable(str2);
                state2 = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
            } else {
                state2 = null;
            }
            if (state2 == null) {
                Expression expression = div.f88871n;
                state2 = expression != null ? (String) expression.evaluate(resolver) : null;
                if (state2 == null) {
                    lq.c cVar = (lq.c) CollectionsKt.firstOrNull(div.I);
                    if (cVar != null) {
                        return cVar.f88890d;
                    }
                    return null;
                }
            }
        }
        return state2;
    }

    private void visit(y0 div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        if (div instanceof y0.c) {
            y0.c cVar = (y0.c) div;
            visitContainer(div, divView, cVar.d().B, cVar.d().f91616z, path, parentRuntime);
            return;
        }
        if (div instanceof y0.g) {
            visitContainer(div, divView, ((y0.g) div).d().f88817y, null, path, parentRuntime);
            return;
        }
        if (div instanceof y0.e) {
            y0.e eVar = (y0.e) div;
            visitContainer(div, divView, eVar.d().f91300u, eVar.d().f91298s, path, parentRuntime);
            return;
        }
        if (div instanceof y0.k) {
            y0.k kVar = (y0.k) div;
            visitContainer(div, divView, kVar.d().f88456t, kVar.d().f88454r, path, parentRuntime);
            return;
        }
        if (div instanceof y0.o) {
            visitState((y0.o) div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.q) {
            visitTabs((y0.q) div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.d) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.f) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.h) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.i) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.j) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.l) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.m) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.n) {
            defaultVisit(div, divView, path, parentRuntime);
            return;
        }
        if (div instanceof y0.r) {
            defaultVisit(div, divView, path, parentRuntime);
        } else if (div instanceof y0.s) {
            defaultVisit(div, divView, path, parentRuntime);
        } else if (div instanceof y0.p) {
            defaultVisit(div, divView, path, parentRuntime);
        }
    }

    private void visitChild(y0 div, final Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime, boolean isActive) {
        if (isActive) {
            visit(div, divView, path, parentRuntime);
        } else {
            divView.getRuntimeStore().traverseFrom(divView.getRuntimeStore().getOrCreateRuntime(path, div, parentRuntime.getExpressionResolver()), path, new Function1<ExpressionsRuntime, Unit>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor.visitChild.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ExpressionsRuntime expressionsRuntime) {
                    invoke2(expressionsRuntime);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExpressionsRuntime expressionsRuntime) {
                    expressionsRuntime.clearBinding(divView);
                }
            });
        }
    }

    private void visitContainer(y0 div, Div2View divView, List<? extends y0> items, k8 itemBuilder, DivStatePath path, ExpressionsRuntime parentRuntime) {
        List<String> ids;
        ExpressionsRuntime expressionsRuntimeDefaultVisit = defaultVisit(div, divView, path, parentRuntime);
        if (itemBuilder != null) {
            visit(itemBuilder, divView, path, expressionsRuntimeDefaultVisit);
            return;
        }
        if (items == null || (ids = DivPathUtils.INSTANCE.getIds(items)) == null) {
            return;
        }
        int i10 = 0;
        for (Object obj : items) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            visit((y0) obj, divView, path.appendDiv(ids.get(i10)), expressionsRuntimeDefaultVisit);
            i10 = i11;
        }
    }

    private void visitState(y0.o div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        visitStates(div.d(), divView, path, defaultVisit(div, divView, path, parentRuntime));
    }

    private void visitStates(lq div, Div2View divView, DivStatePath path, ExpressionsRuntime runtime) {
        Div2View div2View;
        ExpressionsRuntime expressionsRuntime;
        String activeStateId = getActiveStateId(div, divView, path, runtime.getExpressionResolver());
        for (lq.c cVar : div.I) {
            y0 y0Var = cVar.f88889c;
            if (y0Var == null) {
                div2View = divView;
                expressionsRuntime = runtime;
            } else {
                div2View = divView;
                expressionsRuntime = runtime;
                visitChild(y0Var, div2View, path.append$div_release(path.getLastDivId$div_release(), cVar, cVar.f88890d), expressionsRuntime, Intrinsics.areEqual(cVar.f88890d, activeStateId));
            }
            divView = div2View;
            runtime = expressionsRuntime;
        }
    }

    private void visitTabs(y0.q div, Div2View divView, DivStatePath path, ExpressionsRuntime parentRuntime) {
        visitTabs(div.d(), divView, path, defaultVisit(div, divView, path, parentRuntime));
    }

    public void createAndAttachRuntimes(@NotNull y0 rootDiv, @NotNull DivStatePath rootPath, @NotNull Div2View divView) {
        ExpressionsRuntime rootRuntime = divView.getRuntimeStore().getRootRuntime();
        rootRuntime.onAttachedToWindow(divView);
        visit(rootDiv, divView, rootPath, rootRuntime);
    }

    public void createAndAttachRuntimesToState(@NotNull Div2View divView, @NotNull lq div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = divView.getRuntimeStore().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitStates(div, divView, path, runtimeWithOrNull);
    }

    public void createAndAttachRuntimesToTabs(@NotNull Div2View divView, @NotNull as div, @NotNull DivStatePath path, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = divView.getRuntimeStore().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitTabs(div, divView, path, runtimeWithOrNull);
    }

    private void visitTabs(as div, Div2View divView, DivStatePath path, ExpressionsRuntime runtime) {
        int iIntValue;
        Integer selectedTab = this.tabsCache.getSelectedTab(divView.getDataTag().getId(), path.getFullPath$div_release());
        if (selectedTab != null) {
            iIntValue = selectedTab.intValue();
        } else {
            long jLongValue = ((Number) div.f86350y.evaluate(runtime.getExpressionResolver())).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                iIntValue = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        List ids$default = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, div.f86342q, new Function1<as.c, y0>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitTabs$ids$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final y0 invoke(@NotNull as.c cVar) {
                return cVar.f86355a;
            }
        }, null, 2, null);
        int i10 = 0;
        for (Object obj : div.f86342q) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            visitChild(((as.c) obj).f86355a, divView, path.appendDiv((String) ids$default.get(i10)), runtime, iIntValue == i10);
            i10 = i11;
        }
    }

    private void visit(k8 k8Var, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(k8Var, expressionsRuntime.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (Object obj : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            Div2View div2View2 = div2View;
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = div2View.getRuntimeStore().resolveRuntimeWith(div2View2, divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
            y0 div = divItemBuilderResult.getDiv();
            if (expressionsRuntimeResolveRuntimeWith == null) {
                expressionsRuntimeResolveRuntimeWith = expressionsRuntime;
            }
            visit(div, div2View2, divStatePathAppendDiv, expressionsRuntimeResolveRuntimeWith);
            i10 = i11;
            div2View = div2View2;
        }
    }
}
