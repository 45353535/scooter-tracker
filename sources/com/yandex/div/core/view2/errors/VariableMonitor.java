package com.yandex.div.core.view2.errors;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u0018j\u0002`\u00190\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u0018j\u0002`\u00192\"\u0010\u001e\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0018j\u0002`\u001d\u0012\u0004\u0012\u00020\u000f0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 JC\u0010'\u001a\u00020&\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u0017*\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010.J;\u00101\u001a\u00020\u00042,\u00100\u001a(\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u0018j\u0002`\u00190\u0017\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`/¢\u0006\u0004\b1\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R0\u00104\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0018j\u0002`\u001d\u0012\u0004\u0012\u00020\u000f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R@\u00106\u001a,\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u0018j\u0002`\u00190\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102RB\u00107\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0#2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00105\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableMonitor;", "", "Lkotlin/Function1;", "", "", "errorHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Lcom/yandex/div/core/expression/variables/VariableController;", "oldControllers", "onControllersChange", "(Ljava/util/Set;)V", "", "path", "Lcom/yandex/div/data/Variable;", "createCallback", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "notifyOnChange", "()V", "variable", "saveVariable", "(Lcom/yandex/div/data/Variable;Ljava/lang/String;)V", "", "Lkotlin/Pair;", "Lcom/yandex/div/core/view2/errors/VariableWithPath;", "variablesList", "()Ljava/util/List;", "", "Lcom/yandex/div/core/view2/errors/PathAndName;", "entry", "entriesToVariables", "(Ljava/util/Map$Entry;)Lkotlin/Pair;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "map", TypedValues.TransitionType.S_FROM, "", "hasAllPairs", "(Ljava/util/Map;Ljava/util/Map;)Z", "getAllNames", "(Lcom/yandex/div/core/expression/variables/VariableController;)Ljava/util/List;", "name", "value", "mutateVariable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/yandex/div/core/view2/errors/VariablesUpdatedCallback;", "callback", "setVariablesUpdatedCallback", "Lkotlin/jvm/functions/Function1;", "", "variables", "Ljava/util/Map;", "variablesUpdatedCallback", "controllerMap", "getControllerMap", "()Ljava/util/Map;", "setControllerMap", "(Ljava/util/Map;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VariableMonitor {

    @NotNull
    private final Function1<Throwable, Unit> errorHandler;

    @Nullable
    private Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> variablesUpdatedCallback;

    @NotNull
    private final Map<Pair<String, String>, Variable> variables = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends VariableController> controllerMap = MapsKt.emptyMap();

    /* JADX WARN: Multi-variable type inference failed */
    public VariableMonitor(@NotNull Function1<? super Throwable, Unit> function1) {
        this.errorHandler = function1;
    }

    private final Function1<Variable, Unit> createCallback(final String path) {
        return new Function1<Variable, Unit>() { // from class: com.yandex.div.core.view2.errors.VariableMonitor.createCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                VariableMonitor.this.saveVariable(variable, path);
                VariableMonitor.this.notifyOnChange();
            }
        };
    }

    private final Pair<String, Variable> entriesToVariables(Map.Entry<Pair<String, String>, ? extends Variable> entry) {
        Pair<String, String> key = entry.getKey();
        return TuplesKt.to(key.getFirst(), entry.getValue());
    }

    private final List<String> getAllNames(VariableController variableController) {
        List<Variable> listCaptureAll = variableController.captureAll();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listCaptureAll, 10));
        Iterator<T> it = listCaptureAll.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        return arrayList;
    }

    private final <K, V> boolean hasAllPairs(Map<K, ? extends V> map, Map<K, ? extends V> from) {
        if (from.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            K key = entry.getKey();
            if (!Intrinsics.areEqual(map.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnChange() {
        List<Pair<String, Variable>> listVariablesList = variablesList();
        Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> function1 = this.variablesUpdatedCallback;
        if (function1 != null) {
            function1.invoke(listVariablesList);
        }
    }

    private final void onControllersChange(Set<? extends VariableController> oldControllers) {
        Map<String, ? extends VariableController> map = this.controllerMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends VariableController> entry : map.entrySet()) {
            if (!oldControllers.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            VariableController variableController = (VariableController) entry2.getValue();
            c7.a.b(variableController, getAllNames(variableController), false, createCallback(str), 2, null);
        }
        this.variables.clear();
        for (Map.Entry<String, ? extends VariableController> entry3 : this.controllerMap.entrySet()) {
            String key = entry3.getKey();
            Iterator<T> it = entry3.getValue().captureAll().iterator();
            while (it.hasNext()) {
                saveVariable((Variable) it.next(), key);
            }
        }
        notifyOnChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVariable(Variable variable, String path) {
        this.variables.put(TuplesKt.to(path, variable.getName()), variable);
    }

    private final List<Pair<String, Variable>> variablesList() {
        Map<Pair<String, String>, Variable> map = this.variables;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Pair<String, String>, Variable>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(entriesToVariables(it.next()));
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$variablesList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Pair pair = (Pair) t10;
                Pair pair2 = (Pair) t11;
                return mf.a.d(((String) pair.component1()) + ((Variable) pair.component2()).getName(), ((String) pair2.component1()) + ((Variable) pair2.component2()).getName());
            }
        });
    }

    public final void mutateVariable(@NotNull String name, @NotNull String path, @NotNull String value) {
        Variable variable = this.variables.get(TuplesKt.to(path, name));
        if (Intrinsics.areEqual(String.valueOf(variable != null ? variable.getValue() : null), value) || variable == null) {
            return;
        }
        try {
            variable.set(value);
        } catch (Exception unused) {
            this.errorHandler.invoke(new VariableMutationException("Unable to set '" + value + "' value to variable '" + name + "'.", null, 2, null));
        }
    }

    public final void setControllerMap(@NotNull Map<String, ? extends VariableController> map) {
        if (hasAllPairs(this.controllerMap, map)) {
            return;
        }
        Set<? extends VariableController> set = CollectionsKt.toSet(this.controllerMap.values());
        this.controllerMap = map;
        onControllersChange(set);
    }

    public final void setVariablesUpdatedCallback(@NotNull Function1<? super List<? extends Pair<String, ? extends Variable>>, Unit> callback) {
        this.variablesUpdatedCallback = callback;
        notifyOnChange();
    }
}
