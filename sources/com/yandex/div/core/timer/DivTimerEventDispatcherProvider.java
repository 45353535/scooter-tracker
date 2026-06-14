package com.yandex.div.core.timer;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.ExpressionResolver;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.ea;
import k8.yu;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eRT\u0010#\u001aB\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010 !* \u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\"0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/div/core/timer/DivTimerEventDispatcherProvider;", "", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "<init>", "(Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lk8/yu;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "Lcom/yandex/div/core/timer/TimerController;", "toTimerController", "(Lk8/yu;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/timer/TimerController;", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "", "timers", "", "invalidateTimersSet", "(Lcom/yandex/div/core/timer/DivTimerEventDispatcher;Ljava/util/List;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/DivDataTag;", "dataTag", "Lk8/ea;", "data", "getOrCreate$div_release", "(Lcom/yandex/div/DivDataTag;Lk8/ea;Lcom/yandex/div/json/expressions/ExpressionResolver;)Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "getOrCreate", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "", "", "kotlin.jvm.PlatformType", "", "controllers", "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTimerEventDispatcherProvider {
    private final Map<String, DivTimerEventDispatcher> controllers = DesugarCollections.synchronizedMap(new LinkedHashMap());

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollectors errorCollectors;

    public DivTimerEventDispatcherProvider(@NotNull DivActionBinder divActionBinder, @NotNull ErrorCollectors errorCollectors) {
        this.divActionBinder = divActionBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void invalidateTimersSet(DivTimerEventDispatcher divTimerEventDispatcher, List<yu> list, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        List<yu> list2 = list;
        for (yu yuVar : list2) {
            if (divTimerEventDispatcher.getTimerController(yuVar.f92813c) == null) {
                divTimerEventDispatcher.addTimerController(toTimerController(yuVar, errorCollector, expressionResolver));
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((yu) it.next()).f92813c);
        }
        divTimerEventDispatcher.setActiveTimerIds(arrayList);
    }

    private final TimerController toTimerController(yu yuVar, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        return new TimerController(yuVar, this.divActionBinder, errorCollector, expressionResolver);
    }

    @Nullable
    public final DivTimerEventDispatcher getOrCreate$div_release(@NotNull DivDataTag dataTag, @NotNull ea data, @NotNull ExpressionResolver expressionResolver) {
        List<yu> list = data.f87206d;
        if (list == null) {
            return null;
        }
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(dataTag, data);
        Map<String, DivTimerEventDispatcher> map = this.controllers;
        String id2 = dataTag.getId();
        DivTimerEventDispatcher divTimerEventDispatcher = map.get(id2);
        if (divTimerEventDispatcher == null) {
            divTimerEventDispatcher = new DivTimerEventDispatcher(orCreate);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divTimerEventDispatcher.addTimerController(toTimerController((yu) it.next(), orCreate, expressionResolver));
            }
            map.put(id2, divTimerEventDispatcher);
        }
        DivTimerEventDispatcher divTimerEventDispatcher2 = divTimerEventDispatcher;
        invalidateTimersSet(divTimerEventDispatcher2, list, orCreate, expressionResolver);
        return divTimerEventDispatcher2;
    }
}
