package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.acm.db.MetricsDb;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR'\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "TAG", "Lcom/moloco/sdk/acm/db/d;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/acm/db/d;", "metricsDAO", "d", "url", "", "Lkotlin/jvm/internal/EnhancedNullability;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/Map;", "clientOptions", "Lkotlin/Function1;", "Lve/p;", "", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "headers", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
public final class DBRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.acm.db.d metricsDAO;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Map clientOptions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Function1 headers;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f53997r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f53998s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f54000u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53998s = obj;
            this.f54000u |= Integer.MIN_VALUE;
            return DBRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.TAG = "DBRequestWorker";
        this.metricsDAO = MetricsDb.INSTANCE.b(context).g();
        this.url = getInputData().getString("url");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("AppKey", getInputData().getString("AppKey")), TuplesKt.to("AppBundle", getInputData().getString("AppBundle")), TuplesKt.to("AppVersion", getInputData().getString("AppVersion")), TuplesKt.to("OS", getInputData().getString("OS")), TuplesKt.to(N6.G, getInputData().getString(N6.G)), TuplesKt.to("SdkVersion", getInputData().getString("SdkVersion")), TuplesKt.to("Mediator", getInputData().getString("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.clientOptions = linkedHashMap;
        this.headers = new com.moloco.sdk.acm.http.b().b((String) linkedHashMap.get("SdkVersion"), (String) linkedHashMap.get(N6.G), (String) linkedHashMap.get("AppKey"), (String) linkedHashMap.get("AppBundle"), (String) linkedHashMap.get("AppVersion"), (String) linkedHashMap.get("Mediator"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker.a) r0
            int r1 = r0.f54000u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54000u = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a r0 = new com.moloco.sdk.acm.eventprocessing.DBRequestWorker$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53998s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54000u
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r0 = r0.f53997r
            r1 = r0
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker r1 = (com.moloco.sdk.acm.eventprocessing.DBRequestWorker) r1
            kotlin.d.b(r10)     // Catch: java.lang.Exception -> L33
            kotlin.Result r10 = (kotlin.Result) r10     // Catch: java.lang.Exception -> L33
            r10.l()     // Catch: java.lang.Exception -> L33
            goto L79
        L33:
            r0 = move-exception
            r10 = r0
            goto L7e
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            kotlin.d.b(r10)
            java.lang.String r10 = r9.url     // Catch: java.lang.Exception -> L74
            if (r10 == 0) goto L78
            com.moloco.sdk.acm.http.d r10 = com.moloco.sdk.acm.http.d.f54068a     // Catch: java.lang.Exception -> L74
            ie.c r2 = com.moloco.sdk.acm.http.g.d()     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = r9.url     // Catch: java.lang.Exception -> L74
            r10.b(r2, r4)     // Catch: java.lang.Exception -> L74
            com.moloco.sdk.acm.eventprocessing.h r2 = new com.moloco.sdk.acm.eventprocessing.h     // Catch: java.lang.Exception -> L74
            com.moloco.sdk.acm.http.i r10 = r10.a()     // Catch: java.lang.Exception -> L74
            com.moloco.sdk.acm.db.d r4 = r9.metricsDAO     // Catch: java.lang.Exception -> L74
            com.moloco.sdk.acm.eventprocessing.e r5 = new com.moloco.sdk.acm.eventprocessing.e     // Catch: java.lang.Exception -> L74
            com.moloco.sdk.acm.services.g r6 = new com.moloco.sdk.acm.services.g     // Catch: java.lang.Exception -> L74
            r6.<init>()     // Catch: java.lang.Exception -> L74
            r7 = 720(0x2d0, double:3.557E-321)
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L74
            kotlin.jvm.functions.Function1 r6 = r9.headers     // Catch: java.lang.Exception -> L74
            r2.<init>(r10, r4, r5, r6)     // Catch: java.lang.Exception -> L74
            r0.f53997r = r9     // Catch: java.lang.Exception -> L74
            r0.f54000u = r3     // Catch: java.lang.Exception -> L74
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Exception -> L74
            if (r10 != r1) goto L78
            return r1
        L74:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto L7e
        L78:
            r1 = r9
        L79:
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.success()     // Catch: java.lang.Exception -> L33
            return r10
        L7e:
            com.moloco.sdk.acm.services.d r2 = com.moloco.sdk.acm.services.d.f54105a
            java.lang.String r3 = r1.TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Work Manager failure: "
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r4 = r0.toString()
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            com.moloco.sdk.acm.services.d.e(r2, r3, r4, r5, r6, r7, r8)
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.failure()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.DBRequestWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
