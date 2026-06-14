package com.yandex.div.core.expression.triggers;

import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k8.bw;
import k8.j1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z6.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001b¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010&\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b&\u0010\u001dR\u001e\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0003068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010:\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0016\u0010;\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/yandex/div/core/expression/triggers/TriggerExecutor;", "", "Lcom/yandex/div/json/expressions/Expression$MutableExpression;", "", "expression", "", "Lk8/j1;", "actions", "Lcom/yandex/div/json/expressions/Expression;", "Lk8/bw$c;", C4240b4.a.f42515t, "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "resolver", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/core/Div2Logger;", "logger", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "<init>", "(Lcom/yandex/div/json/expressions/Expression$MutableExpression;Ljava/util/List;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "", "invalidateObservation", "()V", "stopObserving", "startObserving", "tryTriggerActions", "Lcom/yandex/div/core/DivViewFacade;", "viewFacade", "(Lcom/yandex/div/core/DivViewFacade;)V", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "tryTriggerActionsAfterBind", "(Lcom/yandex/div/core/view2/Div2View;)V", "conditionSatisfied", "(Lcom/yandex/div/core/DivViewFacade;)Z", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onAttach", "onDetach", "Lcom/yandex/div/json/expressions/Expression$MutableExpression;", "Ljava/util/List;", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lkotlin/Function1;", "changeTrigger", "Lkotlin/jvm/functions/Function1;", "Lcom/yandex/div/core/Disposable;", "modeObserver", "Lcom/yandex/div/core/Disposable;", "currentMode", "Lk8/bw$c;", "Ljava/util/WeakHashMap;", "wasConditionSatisfied", "Ljava/util/WeakHashMap;", "observersDisposable", "removingDisposable", "bindCompletionDisposable", "", "attachedViews", "Ljava/util/Set;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TriggerExecutor {

    @NotNull
    private final List<j1> actions;

    @NotNull
    private final Set<DivViewFacade> attachedViews;

    @NotNull
    private Disposable bindCompletionDisposable;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Expression.MutableExpression<?, Boolean> expression;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final Expression<bw.c> mode;

    @NotNull
    private Disposable modeObserver;

    @NotNull
    private Disposable observersDisposable;

    @NotNull
    private Disposable removingDisposable;

    @NotNull
    private final ExpressionResolverImpl resolver;

    @NotNull
    private final Function1<Boolean, Unit> changeTrigger = new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$changeTrigger$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f93236a;
        }

        public final void invoke(boolean z10) {
            this.this$0.tryTriggerActions();
        }
    };

    @NotNull
    private bw.c currentMode = bw.c.ON_CONDITION;

    @NotNull
    private WeakHashMap<DivViewFacade, Boolean> wasConditionSatisfied = new WeakHashMap<>();

    public TriggerExecutor(@NotNull Expression.MutableExpression<?, Boolean> mutableExpression, @NotNull List<j1> list, @NotNull Expression<bw.c> expression, @NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger div2Logger, @NotNull DivActionBinder divActionBinder) {
        this.expression = mutableExpression;
        this.actions = list;
        this.mode = expression;
        this.resolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
        this.modeObserver = expression.observeAndGet(expressionResolverImpl, new Function1<bw.c, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$modeObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bw.c cVar) {
                invoke2(cVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull bw.c cVar) {
                this.this$0.currentMode = cVar;
            }
        });
        Disposable disposable = Disposable.NULL;
        this.observersDisposable = disposable;
        this.removingDisposable = disposable;
        this.bindCompletionDisposable = disposable;
        this.attachedViews = new LinkedHashSet();
    }

    private final boolean conditionSatisfied(DivViewFacade viewFacade) throws Exception {
        RuntimeException runtimeException;
        try {
            Boolean boolEvaluate = this.expression.evaluate(this.resolver);
            boolean zBooleanValue = boolEvaluate.booleanValue();
            Boolean bool = this.wasConditionSatisfied.get(viewFacade);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean zBooleanValue2 = bool.booleanValue();
            this.wasConditionSatisfied.put(viewFacade, boolEvaluate);
            if (zBooleanValue) {
                return (this.currentMode == bw.c.ON_CONDITION && zBooleanValue2) ? false : true;
            }
            return false;
        } catch (Exception e10) {
            if (e10 instanceof ClassCastException) {
                runtimeException = new RuntimeException("Condition evaluated in non-boolean result! (expression: '" + this.expression.getRawValue() + "')", e10);
            } else {
                if (!(e10 instanceof EvaluableException)) {
                    throw e10;
                }
                runtimeException = new RuntimeException("Condition evaluation failed! (expression: '" + this.expression.getRawValue() + "')", e10);
            }
            this.errorCollector.logError(runtimeException);
            return false;
        }
    }

    private final void invalidateObservation() {
        if (this.attachedViews.isEmpty()) {
            stopObserving();
        } else {
            startObserving();
        }
    }

    private final void startObserving() {
        this.modeObserver.close();
        this.observersDisposable = this.expression.observe(this.resolver, this.changeTrigger);
        this.removingDisposable = this.resolver.getVariableController().subscribeToVariablesUndeclared(this.expression.getVariablesName(this.resolver), new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor.startObserving.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Variable variable) {
                invoke2(variable);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Variable variable) {
                TriggerExecutor.this.stopObserving();
            }
        });
        this.modeObserver = this.mode.observeAndGet(this.resolver, new Function1<bw.c, Unit>() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor.startObserving.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bw.c cVar) {
                invoke2(cVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull bw.c cVar) {
                TriggerExecutor.this.currentMode = cVar;
            }
        });
        tryTriggerActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObserving() {
        this.modeObserver.close();
        this.observersDisposable.close();
        this.removingDisposable.close();
        this.bindCompletionDisposable.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryTriggerActions() {
        Assert.assertMainThread();
        Iterator<T> it = this.attachedViews.iterator();
        while (it.hasNext()) {
            tryTriggerActions((DivViewFacade) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.downloader.PersistentDivDataObserver, com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1] */
    private final void tryTriggerActionsAfterBind(final Div2View div2View) {
        this.bindCompletionDisposable.close();
        ?? r02 = new PersistentDivDataObserver() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1
            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public void onAfterDivDataChanged() {
                div2View.removePersistentDivDataObserver$div_release(this);
                this.tryTriggerActions();
            }

            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public /* synthetic */ void onBeforeDivDataChanged() {
                c.a(this);
            }
        };
        this.bindCompletionDisposable = new a(div2View, r02);
        div2View.addPersistentDivDataObserver$div_release(r02);
    }

    public final void onAttach(@NotNull DivViewFacade view) {
        this.attachedViews.add(view);
        invalidateObservation();
    }

    public final void onDetach(@Nullable DivViewFacade view) {
        b1.a(this.attachedViews).remove(view);
        invalidateObservation();
    }

    private final void tryTriggerActions(DivViewFacade viewFacade) {
        boolean z10 = viewFacade instanceof Div2View;
        Div2View div2View = z10 ? (Div2View) viewFacade : null;
        if (div2View != null) {
            if (!div2View.getInMiddleOfBind()) {
                div2View = null;
            }
            if (div2View != null) {
                tryTriggerActionsAfterBind(div2View);
                return;
            }
        }
        if (conditionSatisfied(viewFacade)) {
            for (j1 j1Var : this.actions) {
                Div2View div2View2 = z10 ? (Div2View) viewFacade : null;
                if (div2View2 != null) {
                    this.logger.logTrigger(div2View2, j1Var);
                }
            }
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, viewFacade, this.resolver, this.actions, "trigger", null, 16, null);
        }
    }
}
