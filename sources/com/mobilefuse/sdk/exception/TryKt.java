package com.mobilefuse.sdk.exception;

import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a\u001a\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a*\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"gracefullyHandleException", "Lcom/mobilefuse/sdk/exception/Either;", "", "T", "block", "Lkotlin/Function0;", C4240b4.f.f42572e, "Lcom/mobilefuse/sdk/exception/ExceptionHandlingStrategy;", "source", "", "handleExceptions", "", "runnableTry", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class TryKt {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3}, xi = 128)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$0 = iArr;
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            iArr[exceptionHandlingStrategy.ordinal()] = 1;
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.Ignore;
            iArr[exceptionHandlingStrategy2.ordinal()] = 2;
            int[] iArr2 = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[exceptionHandlingStrategy.ordinal()] = 1;
            iArr2[exceptionHandlingStrategy2.ordinal()] = 2;
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th2) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return new ErrorResult(th2);
        }
    }

    public static final void handleExceptions(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.invoke();
        } catch (Throwable th2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public static final Function0<Unit> runnableTry(@NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new Function0<Unit>() { // from class: com.mobilefuse.sdk.exception.TryKt.runnableTry.1
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
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    block.invoke();
                } catch (Throwable th2) {
                    int i10 = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }
        };
    }

    public static final void handleExceptions(@NotNull String source, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.invoke();
        } catch (Throwable th2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException(source, th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th2) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th2);
            }
            return new ErrorResult(th2);
        }
    }

    public static final void handleExceptions(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable th2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException(source, th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th2) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th2);
            }
            return new ErrorResult(th2);
        }
    }

    public static final void handleExceptions(@NotNull ExceptionHandlingStrategy strategy, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable th2) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull ExceptionHandlingStrategy strategy, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th2) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return new ErrorResult(th2);
        }
    }
}
