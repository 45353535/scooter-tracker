package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f75879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f75880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f75882f;

    public Hl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f75877a = str;
        this.f75878b = str2;
        this.f75879c = num;
        this.f75880d = num2;
        this.f75881e = str3;
        this.f75882f = bool;
    }

    public Hl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
