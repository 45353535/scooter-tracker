package com.yandex.div.core.expression;

import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k8.bw;
import k8.ea;
import k8.kw;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eRT\u0010#\u001aB\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00150\u0015 !* \u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\"0\u001f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0&0%8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/div/core/expression/RuntimeStoreProvider;", "", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "runtimeProvider", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/core/expression/ExpressionResolverImpl;", "resolver", "Lk8/ea;", "data", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "", "ensureVariablesSynced", "(Lcom/yandex/div/core/expression/ExpressionResolverImpl;Lk8/ea;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "getOrCreate$div_release", "(Lcom/yandex/div/DivDataTag;Lk8/ea;Lcom/yandex/div/core/view2/Div2View;)Lcom/yandex/div/core/expression/local/RuntimeStore;", "getOrCreate", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "cleanupRuntime$div_release", "(Lcom/yandex/div/core/view2/Div2View;)V", "cleanupRuntime", "Lcom/yandex/div/core/expression/local/ExpressionsRuntimeProvider;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "", "", "kotlin.jvm.PlatformType", "", "runtimeStores", "Ljava/util/Map;", "Ljava/util/WeakHashMap;", "", "divDataTags", "Ljava/util/WeakHashMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class RuntimeStoreProvider {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;
    private final Map<String, RuntimeStore> runtimeStores = DesugarCollections.synchronizedMap(new LinkedHashMap());

    @NotNull
    private final WeakHashMap<Div2View, Set<String>> divDataTags = new WeakHashMap<>();

    public RuntimeStoreProvider(@NotNull ExpressionsRuntimeProvider expressionsRuntimeProvider, @NotNull ErrorCollectors errorCollectors) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollectors = errorCollectors;
    }

    private void ensureVariablesSynced(ExpressionResolverImpl resolver, ea data, ErrorCollector errorCollector) {
        boolean z10;
        VariableController variableController = resolver.getVariableController();
        List<kw> list = data.f87209g;
        if (list != null) {
            for (kw kwVar : list) {
                Variable mutableVariable = variableController.getMutableVariable(RuntimeStoreProviderKt.getName(kwVar));
                if (mutableVariable == null) {
                    VariableControllerKt.declare(variableController, kwVar, resolver, errorCollector);
                } else {
                    if (kwVar instanceof kw.b) {
                        z10 = mutableVariable instanceof Variable.BooleanVariable;
                    } else if (kwVar instanceof kw.g) {
                        z10 = mutableVariable instanceof Variable.IntegerVariable;
                    } else if (kwVar instanceof kw.h) {
                        z10 = mutableVariable instanceof Variable.DoubleVariable;
                    } else if (kwVar instanceof kw.j) {
                        z10 = mutableVariable instanceof Variable.StringVariable;
                    } else if (kwVar instanceof kw.c) {
                        z10 = mutableVariable instanceof Variable.ColorVariable;
                    } else if (kwVar instanceof kw.k) {
                        z10 = mutableVariable instanceof Variable.UrlVariable;
                    } else if (kwVar instanceof kw.f) {
                        z10 = mutableVariable instanceof Variable.DictVariable;
                    } else if (kwVar instanceof kw.a) {
                        z10 = mutableVariable instanceof Variable.ArrayVariable;
                    } else {
                        if (!(kwVar instanceof kw.i)) {
                            throw new m();
                        }
                        z10 = false;
                    }
                    if (!z10) {
                        errorCollector.logError(new IllegalArgumentException(StringsKt.n("\n                           Variable inconsistency detected!\n                           at DivData: " + RuntimeStoreProviderKt.getName(kwVar) + " (" + kwVar + ")\n                           at VariableController: " + variableController.getMutableVariable(RuntimeStoreProviderKt.getName(kwVar)) + "\n                        ")));
                    }
                }
            }
        }
    }

    public void cleanupRuntime$div_release(@NotNull Div2View view) {
        Set<String> set = this.divDataTags.get(view);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                RuntimeStore runtimeStore = this.runtimeStores.get((String) it.next());
                if (runtimeStore != null) {
                    runtimeStore.cleanupRuntimes(view);
                }
            }
        }
        this.divDataTags.remove(view);
    }

    @NotNull
    public RuntimeStore getOrCreate$div_release(@NotNull DivDataTag tag, @NotNull ea data, @NotNull Div2View div2View) {
        WeakHashMap<Div2View, Set<String>> weakHashMap = this.divDataTags;
        Set<String> linkedHashSet = weakHashMap.get(div2View);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            weakHashMap.put(div2View, linkedHashSet);
        }
        linkedHashSet.add(tag.getId());
        RuntimeStore runtimeStore = this.runtimeStores.get(tag.getId());
        if (runtimeStore == null) {
            RuntimeStoreImpl runtimeStoreImpl = new RuntimeStoreImpl(data, this.runtimeProvider, this.errorCollectors.getOrCreate(tag, data));
            this.runtimeStores.put(tag.getId(), runtimeStoreImpl);
            return runtimeStoreImpl;
        }
        ensureVariablesSynced(runtimeStore.getRootRuntime().getExpressionResolver(), data, this.errorCollectors.getOrCreate(tag, data));
        TriggersController triggersController = runtimeStore.getRootRuntime().getTriggersController();
        if (triggersController != null) {
            List<bw> listEmptyList = data.f87208f;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            triggersController.ensureTriggersSynced(listEmptyList);
        }
        return runtimeStore;
    }
}
