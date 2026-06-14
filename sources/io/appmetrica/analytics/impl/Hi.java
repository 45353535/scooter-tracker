package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final Context f75869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75871c;

    public Hi(Context context, String str, String str2) {
        this.f75869a = context;
        this.f75870b = str;
        this.f75871c = str2;
    }

    @Nullable
    public final Object a() {
        int identifier = this.f75869a.getResources().getIdentifier(this.f75870b, this.f75871c, this.f75869a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i10);
}
