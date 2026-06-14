package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5159i2 implements AppSetIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5184j2 f77366a;

    public C5159i2(C5184j2 c5184j2) {
        this.f77366a = c5184j2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onAppSetIdRetrieved(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f77366a.f77460c = new AppSetId(str, appSetIdScope);
        this.f77366a.f77461d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onFailure(@Nullable Throwable th2) {
        this.f77366a.f77461d.countDown();
    }
}
