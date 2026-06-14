package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes12.dex */
public class U5 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5204jm f76558c;

    public final String b() {
        return this.f76557b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f76556a + "', mAppSystem='" + this.f76557b + "', startupState=" + this.f76558c + '}';
    }

    @NonNull
    public final String a() {
        return this.f76556a;
    }
}
