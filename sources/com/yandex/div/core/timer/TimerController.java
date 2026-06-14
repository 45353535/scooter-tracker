package com.yandex.div.core.timer;

import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.j1;
import k8.yu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u001c\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00103\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/div/core/timer/TimerController;", "", "Lk8/yu;", "divTimer", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "errorCollector", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "expressionResolver", "<init>", "(Lk8/yu;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/view2/errors/ErrorCollector;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "updateTimer", "()V", "", "time", "onTick", "(J)V", "onEnd", "value", "updateTimerVariable", "Lcom/yandex/div/core/view2/Div2View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onAttach", "(Lcom/yandex/div/core/view2/Div2View;)V", "onDetach", "reset", "", "isAttachedToView", "(Lcom/yandex/div/core/view2/Div2View;)Z", "", f.b.f45113g, "applyCommand", "(Ljava/lang/String;)V", "Lk8/yu;", "getDivTimer", "()Lk8/yu;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "id", "Ljava/lang/String;", "valueVariable", "", "Lk8/j1;", "endActions", "Ljava/util/List;", "tickActions", "savedForBackground", "Z", "Lcom/yandex/div/core/timer/Ticker;", "ticker", "Lcom/yandex/div/core/timer/Ticker;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimerController {

    @Nullable
    private Div2View div2View;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final yu divTimer;

    @Nullable
    private final List<j1> endActions;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final ExpressionResolver expressionResolver;

    @NotNull
    private final String id;
    private boolean savedForBackground;

    @Nullable
    private final List<j1> tickActions;

    @NotNull
    private final Ticker ticker;

    @Nullable
    private final String valueVariable;

    public TimerController(@NotNull yu yuVar, @NotNull DivActionBinder divActionBinder, @NotNull ErrorCollector errorCollector, @NotNull ExpressionResolver expressionResolver) {
        this.divTimer = yuVar;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = yuVar.f92813c;
        this.id = str;
        this.valueVariable = yuVar.f92816f;
        this.endActions = yuVar.f92812b;
        this.tickActions = yuVar.f92814d;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        yuVar.f92811a.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                invoke(l10.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10) {
                TimerController.this.updateTimer();
            }
        });
        Expression expression = yuVar.f92815e;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.timer.TimerController.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    invoke(l10.longValue());
                    return Unit.f93236a;
                }

                public final void invoke(long j10) {
                    TimerController.this.updateTimer();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long time) {
        updateTimerVariable(time);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long time) {
        updateTimerVariable(time);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long jLongValue = ((Number) this.divTimer.f92811a.evaluate(this.expressionResolver)).longValue();
        Expression expression = this.divTimer.f92815e;
        ticker.update(jLongValue, expression != null ? (Long) expression.evaluate(this.expressionResolver) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long value) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(value));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void applyCommand(@NotNull String command) {
        switch (command.hashCode()) {
            case -1367724422:
                if (command.equals(MenuActionType.CANCEL)) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (command.equals("resume")) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (command.equals(AtomManager.ATOM_STOP_METHOD_NAME)) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (command.equals("pause")) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (command.equals("reset")) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (command.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(command + " is unsupported timer command!"));
    }

    @NotNull
    public final yu getDivTimer() {
        return this.divTimer;
    }

    public final boolean isAttachedToView(@NotNull Div2View view) {
        return Intrinsics.areEqual(view, this.div2View);
    }

    public final void onAttach(@NotNull Div2View view) {
        this.div2View = view;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(@Nullable Div2View view) {
        if (Intrinsics.areEqual(view, this.div2View)) {
            reset();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }
}
