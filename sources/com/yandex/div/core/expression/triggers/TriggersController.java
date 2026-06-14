package com.yandex.div.core.expression.triggers;

import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.bw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R,\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/yandex/div/core/expression/triggers/TriggersController;", "", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "expressionResolver", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/core/Div2Logger;", "logger", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "<init>", "(Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "", "", "variables", "", "findErrors", "(Ljava/util/List;)Ljava/lang/Throwable;", "Lk8/bw;", "divTriggers", "", "ensureTriggersSynced", "(Ljava/util/List;)V", "Lcom/yandex/div/core/DivViewFacade;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "clearBinding", "(Lcom/yandex/div/core/DivViewFacade;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "", "", "Lcom/yandex/div/core/expression/triggers/TriggerExecutor;", "executors", "Ljava/util/Map;", "currentView", "Lcom/yandex/div/core/DivViewFacade;", "activeTriggers", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TriggersController {

    @Nullable
    private List<bw> activeTriggers;

    @Nullable
    private DivViewFacade currentView;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<List<bw>, List<TriggerExecutor>> executors = new LinkedHashMap();

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @NotNull
    private final Div2Logger logger;

    public TriggersController(@NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger div2Logger, @NotNull DivActionBinder divActionBinder) {
        this.expressionResolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
    }

    private Throwable findErrors(List<String> variables) {
        if (variables.isEmpty()) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }

    public void clearBinding(@Nullable DivViewFacade view) {
        this.currentView = null;
        Iterator<Map.Entry<List<bw>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(view);
            }
        }
    }

    public void ensureTriggersSynced(@NotNull List<bw> divTriggers) {
        if (this.activeTriggers == divTriggers) {
            return;
        }
        this.activeTriggers = divTriggers;
        DivViewFacade divViewFacade = this.currentView;
        Map<List<bw>, List<TriggerExecutor>> map = this.executors;
        List<TriggerExecutor> arrayList = map.get(divTriggers);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(divTriggers, arrayList);
        }
        List<TriggerExecutor> list = arrayList;
        if (divViewFacade != null) {
            clearBinding(divViewFacade);
        }
        for (bw bwVar : divTriggers) {
            Expression expression = bwVar.f86586b;
            Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
            if (mutableExpression == null) {
                this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + bwVar.f86586b + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                Throwable thFindErrors = findErrors(mutableExpression.getVariablesName(this.expressionResolver));
                if (thFindErrors != null) {
                    this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + bwVar.f86586b + '\'', thFindErrors));
                } else {
                    list.add(new TriggerExecutor(mutableExpression, bwVar.f86585a, bwVar.f86587c, this.expressionResolver, this.errorCollector, this.logger, this.divActionBinder));
                }
            }
        }
        if (divViewFacade != null) {
            onAttachedToWindow(divViewFacade);
        }
    }

    public void onAttachedToWindow(@NotNull DivViewFacade view) {
        List<TriggerExecutor> list;
        if (Intrinsics.areEqual(this.currentView, view)) {
            return;
        }
        this.currentView = view;
        List<bw> list2 = this.activeTriggers;
        if (list2 == null || (list = this.executors.get(list2)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).onAttach(view);
        }
    }

    public void onDetachedFromWindow(@NotNull DivViewFacade view) {
        if (Intrinsics.areEqual(this.currentView, view)) {
            this.currentView = null;
        }
        Iterator<Map.Entry<List<bw>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(view);
            }
        }
    }
}
