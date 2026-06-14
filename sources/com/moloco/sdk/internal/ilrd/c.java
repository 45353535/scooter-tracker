package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import eg.m1;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f54381c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54382d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f54384b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54383a = context;
    }

    public final Init$SDKInitResponse.ILRDConfig a(Init$SDKInitResponse init$SDKInitResponse) {
        if (init$SDKInitResponse.hasIlrdConfig()) {
            return init$SDKInitResponse.getIlrdConfig();
        }
        return null;
    }

    public final IlrdEventsRepository b(CoroutineScope coroutineScope, Init$SDKInitResponse.ILRDConfig iLRDConfig, Init$SDKInitResponse init$SDKInitResponse) {
        String rawImpUrl = iLRDConfig.getRawImpUrl();
        Intrinsics.checkNotNullExpressionValue(rawImpUrl, "getRawImpUrl(...)");
        l lVarC = b.i.f55834a.c();
        b.a aVar = kotlin.time.b.f93560c;
        int sessionExp = iLRDConfig.getSessionExp();
        cg.b bVar = cg.b.f6839f;
        long jS = kotlin.time.c.s(sessionExp, bVar);
        int maxBatchSize = iLRDConfig.getMaxBatchSize();
        long jS2 = kotlin.time.c.s(iLRDConfig.getUploadInterval(), bVar);
        long jS3 = kotlin.time.c.s(iLRDConfig.getMaxSessionLen(), bVar);
        b.h hVar = b.h.f55827a;
        com.moloco.sdk.internal.services.i iVarH = hVar.h();
        Lifecycle lifecycle = ProcessLifecycleOwner.INSTANCE.get().getLifecycle();
        o oVarD = hVar.d();
        String publisherId = init$SDKInitResponse.getPublisherId();
        Intrinsics.checkNotNullExpressionValue(publisherId, "getPublisherId(...)");
        String appId = init$SDKInitResponse.getAppId();
        Intrinsics.checkNotNullExpressionValue(appId, "getAppId(...)");
        return new IlrdEventsRepository(coroutineScope, rawImpUrl, lVarC, jS, maxBatchSize, jS2, jS3, iVarH, lifecycle, oVarD, publisherId, appId, b.j.f55840a.b(), null, null, null, 57344, null);
    }

    public final g c() {
        return this.f54384b;
    }

    public final g d(CoroutineScope coroutineScope, IlrdEventsRepository ilrdEventsRepository, List list) {
        g gVar = new g(coroutineScope, this.f54383a, ilrdEventsRepository, list);
        this.f54384b = gVar;
        gVar.h();
        return gVar;
    }

    public final Object e(Init$SDKInitResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.f54384b != null) {
            Result.Companion companion = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
        Init$SDKInitResponse.ILRDConfig iLRDConfigA = a(response);
        if (iLRDConfigA == null) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("No ILRD configuration found")));
        }
        List<Init$SDKInitResponse.e> supportedNetworksList = iLRDConfigA.getSupportedNetworksList();
        if (!iLRDConfigA.getEnabled()) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("Publisher has not opted into ILRD collection")));
        }
        if (supportedNetworksList.isEmpty()) {
            Result.Companion companion4 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("No ILRD supported networks available")));
        }
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getDefault().plus(m1.b(null, 1, null)));
        IlrdEventsRepository ilrdEventsRepositoryB = b(coroutineScopeA, iLRDConfigA, response);
        Intrinsics.checkNotNull(supportedNetworksList);
        d(coroutineScopeA, ilrdEventsRepositoryB, supportedNetworksList);
        Result.Companion companion5 = Result.f93230c;
        return Result.b(Unit.f93236a);
    }
}
