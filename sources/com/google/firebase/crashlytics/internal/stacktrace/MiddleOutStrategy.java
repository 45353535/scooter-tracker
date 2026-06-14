package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes9.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32718a;

    public MiddleOutStrategy(int i10) {
        this.f32718a = i10;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f32718a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
