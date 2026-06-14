package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.ironsource.N6;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.h f54003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54004b;

    public c(com.moloco.sdk.acm.h config, Context context) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54003a = config;
        this.f54004b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.b
    public void a() {
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Data dataA = d.a(MapsKt.mapOf(TuplesKt.to("url", this.f54003a.d()), TuplesKt.to("AppKey", this.f54003a.c().get("AppKey")), TuplesKt.to("AppBundle", this.f54003a.c().get("AppBundle")), TuplesKt.to("AppVersion", this.f54003a.c().get("AppVersion")), TuplesKt.to("OS", this.f54003a.c().get("OS")), TuplesKt.to(N6.G, this.f54003a.c().get(N6.G)), TuplesKt.to("SdkVersion", this.f54003a.c().get("SdkVersion")), TuplesKt.to("Mediator", this.f54003a.c().get("Mediator"))));
        if (dataA == null) {
            return;
        }
        WorkManager.getInstance(this.f54004b).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DBRequestWorker.class).setConstraints(constraintsBuild).setInputData(dataA).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).build());
    }
}
