package com.yandex.div.core.timer;

import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u0;
import kotlin.ranges.g;
import lf.i;
import lf.l;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u0007H\u0002J\b\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0007J\b\u0010,\u001a\u00020\u0007H\u0002J\u000e\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u0007J\u0010\u00101\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J\u0006\u00105\u001a\u00020\u0007J(\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000709H\u0002J\u0006\u0010:\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020\u0007J\u001d\u0010<\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010=R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/yandex/div/core/timer/Ticker;", "", "name", "", "onInterrupt", "Lkotlin/Function1;", "", "", "onStart", "onEnd", "onTick", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/yandex/div/core/view2/errors/ErrorCollector;)V", "currentDuration", "Ljava/lang/Long;", "currentInterval", "currentTime", "getCurrentTime", "()J", "duration", "interruptedAt", "interval", "startedAt", "state", "Lcom/yandex/div/core/timer/Ticker$State;", "timer", "Lcom/yandex/div/core/timer/FixedRateScheduler;", "getTimer", "()Lcom/yandex/div/core/timer/FixedRateScheduler;", "timer$delegate", "Lkotlin/Lazy;", "totalWorkTime", "getTotalWorkTime", "workTime", "getWorkTime", "workTimeFromPrevious", MenuActionType.CANCEL, "cleanTicker", "coercedTick", "onError", PglCryptUtils.KEY_MESSAGE, "pause", "reset", "resetTickerState", "restoreState", "fromPreviousPoint", "", "resume", "runCountDownTimer", "runEndlessTimer", "runTickTimer", "runTimer", "saveState", "setupTimer", TypedValues.CycleType.S_WAVE_PERIOD, "initialDelay", "Lkotlin/Function0;", "start", AtomManager.ATOM_STOP_METHOD_NAME, "update", "(JLjava/lang/Long;)V", y.f66058y, "State", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Ticker {

    @Nullable
    private Long currentDuration;

    @Nullable
    private Long currentInterval;

    @Nullable
    private Long duration;

    @Nullable
    private final ErrorCollector errorCollector;

    @Nullable
    private Long interval;

    @NotNull
    private final String name;

    @NotNull
    private final Function1<Long, Unit> onEnd;

    @NotNull
    private final Function1<Long, Unit> onInterrupt;

    @NotNull
    private final Function1<Long, Unit> onStart;

    @NotNull
    private final Function1<Long, Unit> onTick;
    private long workTimeFromPrevious;

    @NotNull
    private State state = State.STOPPED;
    private long startedAt = -1;
    private long interruptedAt = -1;

    /* JADX INFO: renamed from: timer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timer = i.b(l.f94211d, new Function0<FixedRateScheduler>() { // from class: com.yandex.div.core.timer.Ticker$timer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FixedRateScheduler invoke() {
            return new FixedRateScheduler();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/timer/Ticker$State;", "", "(Ljava/lang/String;I)V", "STOPPED", "WORKING", "PAUSED", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@NotNull String str, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Long, Unit> function12, @NotNull Function1<? super Long, Unit> function13, @NotNull Function1<? super Long, Unit> function14, @Nullable ErrorCollector errorCollector) {
        this.name = str;
        this.onInterrupt = function1;
        this.onStart = function12;
        this.onEnd = function13;
        this.onTick = function14;
        this.errorCollector = errorCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l10 = this.duration;
        if (l10 != null) {
            this.onTick.invoke(Long.valueOf(g.k(getTotalWorkTime(), l10.longValue())));
        } else {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
        }
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    private final void onError(String message) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    private final void runCountDownTimer(final long duration) {
        long totalWorkTime = duration - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker.runCountDownTimer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Ticker.this.cleanTicker();
                    Ticker.this.onEnd.invoke(Long.valueOf(duration));
                    Ticker.this.state = State.STOPPED;
                    Ticker.this.resetTickerState();
                }
            }, 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(duration));
            resetTickerState();
        }
    }

    private final void runEndlessTimer(long interval) {
        setupTimer(interval, interval - (getTotalWorkTime() % interval), new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker.runEndlessTimer.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Ticker.this.coercedTick();
            }
        });
    }

    private final void runTickTimer(final long duration, final long interval) {
        long totalWorkTime = interval - (getTotalWorkTime() % interval);
        final u0 u0Var = new u0();
        u0Var.f93333b = (duration / interval) - (getTotalWorkTime() / interval);
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (u0Var.f93333b > 0) {
                    this.onTick.invoke(Long.valueOf(duration));
                }
                this.onEnd.invoke(Long.valueOf(duration));
                this.cleanTicker();
                this.resetTickerState();
                this.state = Ticker.State.STOPPED;
            }
        };
        setupTimer(interval, totalWorkTime, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker.runTickTimer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long totalWorkTime2 = duration - this.getTotalWorkTime();
                this.coercedTick();
                u0 u0Var2 = u0Var;
                u0Var2.f93333b--;
                if (1 > totalWorkTime2 || totalWorkTime2 >= interval) {
                    if (totalWorkTime2 <= 0) {
                        function0.invoke();
                    }
                } else {
                    this.cleanTicker();
                    Ticker ticker = this;
                    final Function0<Unit> function02 = function0;
                    Ticker.setupTimer$default(ticker, totalWorkTime2, 0L, new Function0<Unit>() { // from class: com.yandex.div.core.timer.Ticker.runTickTimer.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function02.invoke();
                        }
                    }, 2, null);
                }
            }
        });
    }

    private final void runTimer() {
        Long l10 = this.currentInterval;
        Long l11 = this.currentDuration;
        if (l10 != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l10.longValue()) {
            coercedTick();
        }
        if (l10 == null && l11 != null) {
            runCountDownTimer(l11.longValue());
            return;
        }
        if (l10 != null && l11 != null) {
            runTickTimer(l11.longValue(), l10.longValue());
        } else {
            if (l10 == null || l11 != null) {
                return;
            }
            runEndlessTimer(l10.longValue());
        }
    }

    private final void setupTimer(long period, long initialDelay, Function0<Unit> onTick) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(initialDelay, period, onTick);
    }

    static /* synthetic */ void setupTimer$default(Ticker ticker, long j10, long j11, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        ticker.setupTimer(j10, j11, function0);
    }

    public final void cancel() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void pause() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2) {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' already paused!");
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void restoreState(boolean fromPreviousPoint) {
        if (!fromPreviousPoint) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void resume() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' is stopped!");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
            return;
        }
        onError("The timer '" + this.name + "' already working!");
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void start() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            cleanTicker();
            this.currentDuration = this.duration;
            this.currentInterval = this.interval;
            this.state = State.WORKING;
            this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
            runTimer();
            return;
        }
        if (i10 == 2) {
            onError("The timer '" + this.name + "' already working!");
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' paused!");
    }

    public final void stop() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void update(long duration, @Nullable Long interval) {
        this.interval = interval;
        this.duration = duration == 0 ? null : Long.valueOf(duration);
    }
}
