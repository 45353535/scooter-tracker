package com.yandex.div.core.expression.local;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.StoredValueProvider;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import java.util.Iterator;
import java.util.List;
import k8.bw;
import k8.ea;
import k8.f7;
import k8.kw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "divVariableController", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/Div2Logger;", "logger", "Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;", "storedValuesController", "<init>", "(Lcom/yandex/div/core/expression/variables/DivVariableController;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/Div2Logger;Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;)V", "", "Lk8/bw;", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "resolver", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/core/expression/triggers/TriggersController;", "toTriggersController", "(Ljava/util/List;Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;)Lcom/yandex/div/core/expression/triggers/TriggersController;", "Lk8/ea;", "data", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "runtimeStore", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "createRootRuntime", "(Lk8/ea;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/core/expression/local/RuntimeStore;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lk8/f7;", "div", "parentResolver", "createChildRuntime", "(Lcom/yandex/div/core/state/DivStatePath;Lk8/f7;Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lcom/yandex/div/core/view2/errors/ErrorCollector;)Lcom/yandex/div/core/expression/ExpressionsRuntime;", "Lcom/yandex/div/core/expression/variables/DivVariableController;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/Div2Logger;", "Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ExpressionsRuntimeProvider {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivVariableController divVariableController;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final StoredValuesController storedValuesController;

    public ExpressionsRuntimeProvider(@NotNull DivVariableController divVariableController, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull StoredValuesController storedValuesController) {
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = div2Logger;
        this.storedValuesController = storedValuesController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector, String str) {
        StoredValue storedValue = expressionsRuntimeProvider.storedValuesController.getStoredValue(str, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    private TriggersController toTriggersController(List<bw> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        List<bw> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }

    @NotNull
    public ExpressionsRuntime createChildRuntime(@NotNull DivStatePath path, @NotNull f7 div, @NotNull ExpressionResolverImpl parentResolver, @NotNull ErrorCollector errorCollector) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(parentResolver.getVariableController());
        List listU = div.u();
        FunctionProvider functionProvider = parentResolver.getEvaluator().getEvaluationContext().getFunctionProvider();
        Intrinsics.checkNotNull(functionProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        FunctionProviderDecorator functionProviderDecoratorPlus = (FunctionProviderDecorator) functionProvider;
        List list = listU;
        if (list != null && !list.isEmpty()) {
            functionProviderDecoratorPlus = functionProviderDecoratorPlus.plus(FunctionMapperKt.toLocalFunctions(listU));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl(parentResolver.getPath() + IOUtils.DIR_SEPARATOR_UNIX + path.getLastDivId$div_release(), parentResolver.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, parentResolver.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecoratorPlus, parentResolver.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector, null, 32, null);
        List listC = div.c();
        if (listC != null) {
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (kw) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(div.s(), expressionResolverImpl, errorCollector));
    }

    @NotNull
    public ExpressionsRuntime createRootRuntime(@NotNull ea data, @NotNull final ErrorCollector errorCollector, @NotNull RuntimeStore runtimeStore) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, null);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource());
        StoredValueProvider storedValueProvider = new StoredValueProvider() { // from class: b7.a
            @Override // com.yandex.div.evaluable.StoredValueProvider
            public final Object get(String str) {
                return ExpressionsRuntimeProvider.createRootRuntime$lambda$0(this.f5834a, errorCollector, str);
            }
        };
        FunctionProviderDecorator functionProviderDecorator = new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE);
        List list = data.f87203a;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(list));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, storedValueProvider, functionProviderDecorator, new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* JADX INFO: renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo7588sendBIH1yYw(@NotNull Evaluable evaluable, @NotNull String str) {
                errorCollector.logWarning(new Throwable("Warning occurred while evaluating '" + evaluable.getRawExpr() + "':", new Throwable(str)));
            }
        })), errorCollector, null, 32, null);
        List list3 = data.f87209g;
        if (list3 != null) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (kw) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(data.f87208f, expressionResolverImpl, errorCollector));
    }
}
