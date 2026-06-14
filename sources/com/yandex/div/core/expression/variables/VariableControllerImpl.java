package com.yandex.div.core.expression.variables;

import c7.b;
import c7.c;
import c7.d;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001C\b\u0010\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0012¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0012¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0012¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\bH\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\bH\u0012¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010!\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0016J+\u00102\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0016¢\u0006\u0004\b4\u00105R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0002\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020%0:8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b;\u0010<R2\u0010>\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070=078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b>\u00109R2\u0010?\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070=078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b?\u00109R,\u0010@\u001a\u001a\u0012\u0004\u0012\u00020/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b@\u00109R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/yandex/div/core/expression/variables/VariableControllerImpl;", "Lcom/yandex/div/core/expression/variables/VariableController;", "delegate", "<init>", "(Lcom/yandex/div/core/expression/variables/VariableController;)V", "", "name", "Lkotlin/Function1;", "Lcom/yandex/div/data/Variable;", "", "observer", "addObserver", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "", "invokeOnSubscription", "subscribeToVariableChangeImpl", "(Ljava/lang/String;Lcom/yandex/div/core/view2/errors/ErrorCollector;ZLkotlin/jvm/functions/Function1;)V", "removeChangeObserver", "v", "notifyVariableChanged", "(Lcom/yandex/div/data/Variable;)V", "variable", "onVariableDeclared", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "names", "Lcom/yandex/div/core/Disposable;", "subscribeToVariablesChange", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "subscribeToVariableChange", "(Ljava/lang/String;Lcom/yandex/div/core/view2/errors/ErrorCollector;ZLkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "subscribeToVariablesUndeclared", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/core/Disposable;", "Lcom/yandex/div/core/expression/variables/VariableSource;", "source", "addSource", "(Lcom/yandex/div/core/expression/variables/VariableSource;)V", "getMutableVariable", "(Ljava/lang/String;)Lcom/yandex/div/data/Variable;", "cleanupSubscriptions", "()V", "restoreSubscriptions", "declare", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "owner", "callback", "setOnAnyVariableChangeCallback", "(Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "captureAll", "()Ljava/util/List;", "Lcom/yandex/div/core/expression/variables/VariableController;", "", "variables", "Ljava/util/Map;", "", "extraVariablesSources", "Ljava/util/List;", "Lcom/yandex/div/core/ObserverList;", "onChangeObservers", "onRemoveObservers", "onAnyVariableChangeObservers", "notifyVariableChangedCallback", "Lkotlin/jvm/functions/Function1;", "com/yandex/div/core/expression/variables/VariableControllerImpl$declarationObserver$1", "declarationObserver", "Lcom/yandex/div/core/expression/variables/VariableControllerImpl$declarationObserver$1;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class VariableControllerImpl implements VariableController {

    @NotNull
    private final VariableControllerImpl$declarationObserver$1 declarationObserver;

    @Nullable
    private final VariableController delegate;

    @NotNull
    private final List<VariableSource> extraVariablesSources;

    @NotNull
    private final Function1<Variable, Unit> notifyVariableChangedCallback;

    @NotNull
    private final Map<ExpressionResolver, Function1<Variable, Unit>> onAnyVariableChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1<Variable, Unit>>> onChangeObservers;

    @NotNull
    private final Map<String, ObserverList<Function1<Variable, Unit>>> onRemoveObservers;

    @NotNull
    private final Map<String, Variable> variables;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1] */
    public VariableControllerImpl(@Nullable VariableController variableController) {
        this.delegate = variableController;
        this.variables = new LinkedHashMap();
        this.extraVariablesSources = new ArrayList();
        this.onChangeObservers = new LinkedHashMap();
        this.onRemoveObservers = new LinkedHashMap();
        this.onAnyVariableChangeObservers = new LinkedHashMap();
        this.notifyVariableChangedCallback = new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChangedCallback$1
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
                this.this$0.notifyVariableChanged(variable);
            }
        };
        this.declarationObserver = new DeclarationObserver() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1
        };
    }

    private void addObserver(String name, Function1<? super Variable, Unit> observer) {
        Map<String, ObserverList<Function1<Variable, Unit>>> map = this.onChangeObservers;
        ObserverList<Function1<Variable, Unit>> observerList = map.get(name);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map.put(name, observerList);
        }
        observerList.addObserver(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVariableChanged(Variable v10) {
        Assert.assertMainThread();
        Iterator it = CollectionsKt.toList(this.onAnyVariableChangeObservers.values()).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(v10);
        }
        ObserverList<Function1<Variable, Unit>> observerList = this.onChangeObservers.get(v10.getName());
        if (observerList != null) {
            Iterator<Function1<Variable, Unit>> it2 = observerList.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(v10);
            }
        }
    }

    private void onVariableDeclared(Variable variable) {
        variable.addObserver(this.notifyVariableChangedCallback);
        notifyVariableChanged(variable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangeObserver(String name, Function1<? super Variable, Unit> observer) {
        ObserverList<Function1<Variable, Unit>> observerList = this.onChangeObservers.get(name);
        if (observerList != null) {
            observerList.removeObserver(observer);
        }
    }

    private void subscribeToVariableChangeImpl(String name, ErrorCollector errorCollector, boolean invokeOnSubscription, Function1<? super Variable, Unit> observer) {
        Variable mutableVariable = getMutableVariable(name);
        if (mutableVariable == null) {
            if (errorCollector != null) {
                errorCollector.logError(ParsingExceptionKt.missingVariable$default(name, null, 2, null));
            }
            addObserver(name, observer);
        } else {
            if (invokeOnSubscription) {
                Assert.assertMainThread();
                observer.invoke(mutableVariable);
            }
            addObserver(name, observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesChange$lambda$5(List list, List list2, VariableControllerImpl variableControllerImpl, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            variableControllerImpl.removeChangeObserver((String) it.next(), function1);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesUndeclared$lambda$10(List list, VariableControllerImpl variableControllerImpl, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ObserverList<Function1<Variable, Unit>> observerList = variableControllerImpl.onRemoveObservers.get((String) it.next());
            if (observerList != null) {
                observerList.removeObserver(function1);
            }
        }
    }

    public void addSource(@NotNull VariableSource source) {
        source.observeVariables(this.notifyVariableChangedCallback);
        source.observeDeclaration(this.declarationObserver);
        this.extraVariablesSources.add(source);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public List<Variable> captureAll() {
        return CollectionsKt.toList(this.variables.values());
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.removeVariablesObserver(this.notifyVariableChangedCallback);
            variableSource.removeDeclarationObserver(this.declarationObserver);
        }
        this.onAnyVariableChangeObservers.clear();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) throws VariableDeclarationException {
        Variable variablePut = this.variables.put(variable.getName(), variable);
        if (variablePut == null) {
            onVariableDeclared(variable);
            return;
        }
        this.variables.put(variable.getName(), variablePut);
        throw new VariableDeclarationException("Variable '" + variable.getName() + "' already declared!", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Variable mutableVariable = getMutableVariable(name);
        Object objWrapVariableValue = VariableControllerKt.wrapVariableValue(mutableVariable != null ? mutableVariable.getValue() : null);
        if (objWrapVariableValue != null) {
            return objWrapVariableValue;
        }
        VariableController variableController = this.delegate;
        if (variableController != null) {
            return variableController.get(name);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        Variable mutableVariable;
        Variable variable = this.variables.get(name);
        if (variable != null) {
            return variable;
        }
        VariableController variableController = this.delegate;
        if (variableController != null && (mutableVariable = variableController.getMutableVariable(name)) != null) {
            return mutableVariable;
        }
        Iterator<T> it = this.extraVariablesSources.iterator();
        while (it.hasNext()) {
            Variable mutableVariable2 = ((VariableSource) it.next()).getMutableVariable(name);
            if (mutableVariable2 != null) {
                return mutableVariable2;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.observeVariables(this.notifyVariableChangedCallback);
            variableSource.receiveVariablesUpdates(this.notifyVariableChangedCallback);
            variableSource.observeDeclaration(this.declarationObserver);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull final Function1<? super Variable, Unit> callback) {
        this.onAnyVariableChangeObservers.put(owner, callback);
        VariableController variableController = this.delegate;
        if (variableController != null) {
            variableController.setOnAnyVariableChangeCallback(owner, new Function1<Variable, Unit>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl.setOnAnyVariableChangeCallback.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    if (VariableControllerImpl.this.variables.get(variable.getName()) == null) {
                        callback.invoke(variable);
                    }
                }
            });
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer) {
        if (!this.variables.containsKey(name)) {
            VariableController variableController = this.delegate;
            if ((variableController != null ? variableController.getMutableVariable(name) : null) != null) {
                return this.delegate.subscribeToVariableChange(name, errorCollector, invokeOnSubscription, observer);
            }
        }
        subscribeToVariableChangeImpl(name, errorCollector, invokeOnSubscription, observer);
        return new b(this, name, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean invokeOnSubscription, @NotNull Function1<? super Variable, Unit> observer) {
        ArrayList arrayList = new ArrayList();
        for (String str : names) {
            if (!this.variables.containsKey(str)) {
                VariableController variableController = this.delegate;
                if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                    arrayList.add(this.delegate.subscribeToVariableChange(str, null, invokeOnSubscription, observer));
                }
            }
            subscribeToVariableChangeImpl(str, null, invokeOnSubscription, observer);
        }
        return new d(names, arrayList, this, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1<? super Variable, Unit> observer) {
        for (String str : names) {
            Map<String, ObserverList<Function1<Variable, Unit>>> map = this.onRemoveObservers;
            ObserverList<Function1<Variable, Unit>> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.addObserver(observer);
        }
        return new c(names, this, observer);
    }

    public /* synthetic */ VariableControllerImpl(VariableController variableController, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : variableController);
    }
}
