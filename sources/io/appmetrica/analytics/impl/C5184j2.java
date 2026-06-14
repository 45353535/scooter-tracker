package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5184j2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f77459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f77460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f77461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f77462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5159i2 f77463f;

    @VisibleForTesting
    public C5184j2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f77458a = context;
        this.f77459b = iAppSetIdRetriever;
        this.f77461d = new CountDownLatch(1);
        this.f77462e = 20L;
        this.f77463f = new C5159i2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @WorkerThread
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f77460c == null) {
            try {
                this.f77461d = new CountDownLatch(1);
                this.f77459b.retrieveAppSetId(this.f77458a, this.f77463f);
                this.f77461d.await(this.f77462e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f77460c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f77460c = appSetId;
        }
        return appSetId;
    }

    public C5184j2(@NotNull Context context) {
        this(context, AbstractC5210k2.a());
    }
}
