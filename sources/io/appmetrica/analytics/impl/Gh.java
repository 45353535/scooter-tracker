package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: loaded from: classes12.dex */
public final class Gh extends AbstractC5365q6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yn f75831d;

    public Gh(@NonNull Context context, @NonNull Yn yn, @NonNull InterfaceC5340p6 interfaceC5340p6, @Nullable ICrashTransformer iCrashTransformer) {
        this(yn, interfaceC5340p6, iCrashTransformer, new T9(context));
    }

    public Gh(Yn yn, InterfaceC5340p6 interfaceC5340p6, ICrashTransformer iCrashTransformer, T9 t92) {
        super(interfaceC5340p6, iCrashTransformer, t92);
        this.f75831d = yn;
    }
}
