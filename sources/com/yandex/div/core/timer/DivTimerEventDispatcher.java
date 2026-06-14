package com.yandex.div.core.timer;

import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "(Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "activeTimerIds", "", "", "timerControllers", "", "Lcom/yandex/div/core/timer/TimerController;", "addTimerController", "", "timerController", "changeState", "id", f.b.f45113g, "getTimerController", "onAttach", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/yandex/div/core/view2/Div2View;", "onDetach", "setActiveTimerIds", "ids", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivTimerEventDispatcher {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, TimerController> timerControllers = new LinkedHashMap();

    @NotNull
    private final Set<String> activeTimerIds = new LinkedHashSet();

    public DivTimerEventDispatcher(@NotNull ErrorCollector errorCollector) {
        this.errorCollector = errorCollector;
    }

    public final void addTimerController(@NotNull TimerController timerController) {
        String str = timerController.getDivTimer().f92813c;
        if (this.timerControllers.containsKey(str)) {
            return;
        }
        this.timerControllers.put(str, timerController);
    }

    public final void changeState(@NotNull String id2, @NotNull String command) {
        Unit unit;
        TimerController timerController = getTimerController(id2);
        if (timerController != null) {
            timerController.applyCommand(command);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.errorCollector.logError(new IllegalArgumentException("Timer with id '" + id2 + "' does not exist!"));
        }
    }

    @Nullable
    public final TimerController getTimerController(@NotNull String id2) {
        if (this.activeTimerIds.contains(id2)) {
            return this.timerControllers.get(id2);
        }
        return null;
    }

    public final void onAttach(@NotNull Div2View view) {
        Iterator<T> it = this.activeTimerIds.iterator();
        while (it.hasNext()) {
            TimerController timerController = this.timerControllers.get((String) it.next());
            if (timerController != null && !timerController.isAttachedToView(view)) {
                timerController.onAttach(view);
            }
        }
    }

    public final void onDetach(@NotNull Div2View view) {
        Iterator<T> it = this.timerControllers.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).onDetach(view);
        }
    }

    public final void setActiveTimerIds(@NotNull List<String> ids) {
        Map<String, TimerController> map = this.timerControllers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TimerController> entry : map.entrySet()) {
            if (!ids.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).reset();
        }
        this.activeTimerIds.clear();
        this.activeTimerIds.addAll(ids);
    }
}
