package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes9.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StackTraceTrimmingStrategy[] f32716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MiddleOutStrategy f32717c;

    public MiddleOutFallbackStrategy(int i10, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f32715a = i10;
        this.f32716b = stackTraceTrimmingStrategyArr;
        this.f32717c = new MiddleOutStrategy(i10);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f32715a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f32716b) {
            if (trimmedStackTrace.length <= this.f32715a) {
                break;
            }
            trimmedStackTrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > this.f32715a ? this.f32717c.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
