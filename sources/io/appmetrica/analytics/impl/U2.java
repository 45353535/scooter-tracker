package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public abstract class U2 implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected final PublicLogger f76546c;

    public U2(int i10, String str, PublicLogger publicLogger) {
        this.f76544a = i10;
        this.f76545b = str;
        this.f76546c = publicLogger;
    }
}
