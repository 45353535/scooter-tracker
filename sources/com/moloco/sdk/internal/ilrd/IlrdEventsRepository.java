package com.moloco.sdk.internal.ilrd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.IlrdRequest$ImpressionLevelRevenue;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.internal.services.o;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001&B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010 J\u001f\u0010&\u001a\n %*\u0004\u0018\u00010$0$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b.\u0010 J\r\u0010/\u001a\u00020\u001e¢\u0006\u0004\b/\u0010,J\u0015\u00100\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u001e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001eH\u0001¢\u0006\u0004\b6\u0010,J\u000f\u00107\u001a\u00020\u001eH\u0001¢\u0006\u0004\b7\u0010,J\u000f\u00108\u001a\u00020\u001eH\u0001¢\u0006\u0004\b8\u0010,J\u000f\u00109\u001a\u00020\u001eH\u0001¢\u0006\u0004\b9\u0010,J\u000f\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010CR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010BR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010\u0019\u001a\u00020\u00188G¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b7\u0010MR\u0017\u0010\u001a\u001a\u00020\u00188G¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\b)\u0010MR\u0017\u0010\u001b\u001a\u00020\u00188G¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\b@\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR(\u0010W\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010VR&\u0010[\u001a\b\u0012\u0004\u0012\u00020$0X8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010Y\u0012\u0004\b>\u0010,\u001a\u0004\bF\u0010Z¨\u0006\\"}, d2 = {"Lcom/moloco/sdk/internal/ilrd/IlrdEventsRepository;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "url", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;", "persistentHttpRequest", "Lkotlin/time/b;", "sessionExp", "", "maxBatchSize", "uploadInterval", "sessionMaxLength", "Lcom/moloco/sdk/internal/services/i;", "timeProvider", "Landroidx/lifecycle/Lifecycle;", "processLifeycle", "Lcom/moloco/sdk/internal/services/o;", "advertisingIdService", "pubId", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lcom/moloco/sdk/internal/services/g0;", "dataStoreService", "Lcom/moloco/sdk/internal/ilrd/e;", "sessionInactiveScheduler", "sessionMaxLengthScheduler", "scheduledUploadScheduler", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;JIJJLcom/moloco/sdk/internal/services/i;Landroidx/lifecycle/Lifecycle;Lcom/moloco/sdk/internal/services/o;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/services/g0;Lcom/moloco/sdk/internal/ilrd/e;Lcom/moloco/sdk/internal/ilrd/e;Lcom/moloco/sdk/internal/ilrd/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", CampaignEx.JSON_KEY_AD_Q, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/moloco/sdk/internal/ilrd/d$a;", "ilrdData", "Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", "kotlin.jvm.PlatformType", "b", "(Lcom/moloco/sdk/internal/ilrd/d$a;)Lcom/moloco/sdk/IlrdRequest$ImpressionLevelRevenue;", "duration", "g", "(J)V", "v", "()V", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "o", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/moloco/sdk/internal/ilrd/d$a;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", C4240b4.i.f42653t0, "(Landroidx/lifecycle/LifecycleOwner;)V", "x", InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_URL, POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "", "s", "()Z", "Lkotlinx/coroutines/CoroutineScope;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/String;", "d", "Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;", "J", "I", "h", "Lcom/moloco/sdk/internal/services/i;", "j", "Lcom/moloco/sdk/internal/services/o;", CampaignEx.JSON_KEY_AD_K, "m", "Lcom/moloco/sdk/internal/services/g0;", "n", "Lcom/moloco/sdk/internal/ilrd/e;", "()Lcom/moloco/sdk/internal/ilrd/e;", "p", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/moloco/sdk/internal/ilrd/a;", "value", "r", "Lcom/moloco/sdk/internal/ilrd/a;", "()Lcom/moloco/sdk/internal/ilrd/a;", com.taurusx.tax.g.b.f66095s, "", "Ljava/util/List;", "()Ljava/util/List;", "events", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class IlrdEventsRepository implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f54295u = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long sessionExp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int maxBatchSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long uploadInterval;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long sessionMaxLength;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.internal.services.i timeProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final o advertisingIdService;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String pubId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String appId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final g0 dataStoreService;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.e sessionInactiveScheduler;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.e sessionMaxLengthScheduler;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.internal.ilrd.e scheduledUploadScheduler;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Mutex mutex;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public com.moloco.sdk.internal.ilrd.a session;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final List events;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54314r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54315s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f54316t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f54318v;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.IlrdEventsRepository$a$a, reason: collision with other inner class name */
        public static final class C0661a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54319r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f54320s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ IlrdEventsRepository f54321t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0661a(Lifecycle lifecycle, IlrdEventsRepository ilrdEventsRepository, Continuation continuation) {
                super(2, continuation);
                this.f54320s = lifecycle;
                this.f54321t = ilrdEventsRepository;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0661a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0661a(this.f54320s, this.f54321t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f54319r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f54320s.addObserver(this.f54321t);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, Continuation continuation) {
            super(2, continuation);
            this.f54318v = lifecycle;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new a(this.f54318v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (eg.g.g(r7, r1, r6) != r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f54316t
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L35
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.d.b(r7)
                goto L7c
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f54314r
                kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
                kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L26
                goto L5b
            L26:
                r7 = move-exception
                goto L7f
            L28:
                java.lang.Object r1 = r6.f54315s
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r1 = (com.moloco.sdk.internal.ilrd.IlrdEventsRepository) r1
                java.lang.Object r4 = r6.f54314r
                kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
                kotlin.d.b(r7)
                r7 = r4
                goto L4d
            L35:
                kotlin.d.b(r7)
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r7 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                kotlinx.coroutines.sync.Mutex r7 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.k(r7)
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r1 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                r6.f54314r = r7
                r6.f54315s = r1
                r6.f54316t = r4
                java.lang.Object r4 = r7.lock(r5, r6)
                if (r4 != r0) goto L4d
                goto L7b
            L4d:
                r6.f54314r = r7     // Catch: java.lang.Throwable -> L82
                r6.f54315s = r5     // Catch: java.lang.Throwable -> L82
                r6.f54316t = r3     // Catch: java.lang.Throwable -> L82
                java.lang.Object r1 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.d(r1, r6)     // Catch: java.lang.Throwable -> L82
                if (r1 != r0) goto L5a
                goto L7b
            L5a:
                r1 = r7
            L5b:
                kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L26
                r1.unlock(r5)
                com.moloco.sdk.internal.scheduling.a r7 = com.moloco.sdk.internal.scheduling.c.a()
                kotlin.coroutines.CoroutineContext r7 = r7.getMain()
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository$a$a r1 = new com.moloco.sdk.internal.ilrd.IlrdEventsRepository$a$a
                androidx.lifecycle.Lifecycle r3 = r6.f54318v
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r4 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                r1.<init>(r3, r4, r5)
                r6.f54314r = r5
                r6.f54316t = r2
                java.lang.Object r7 = eg.g.g(r7, r1, r6)
                if (r7 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L7f:
                r0 = r7
                r7 = r1
                goto L83
            L82:
                r0 = move-exception
            L83:
                r7.unlock(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.IlrdEventsRepository$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] b(byte[] bArr) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    Unit unit = Unit.f93236a;
                    uf.c.a(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    uf.c.a(byteArrayOutputStream, null);
                    Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }

        public Companion() {
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54322r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54323s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54324t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f54325u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54326v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ d.a f54328x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f54328x = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new c(this.f54328x, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
        
            if (r2.i(r19) == r0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00fa A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:17:0x0048, B:35:0x00bc, B:37:0x00fa, B:39:0x0100), top: B:59:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0129 A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:43:0x0123, B:45:0x0129, B:46:0x012b), top: B:61:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54329r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54330s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54331t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54333v;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54331t = obj;
            this.f54333v |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.e(this);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54334r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54336t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.f54336t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new e(this.f54336t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54334r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return new com.moloco.sdk.internal.ilrd.a(IlrdEventsRepository.this.timeProvider, this.f54336t);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54337r;

        public f(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54337r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.b();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f54337r = 1;
                if (ilrdEventsRepository.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54339r;

        public g(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54339r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.internal.ilrd.a session = IlrdEventsRepository.this.getSession();
                if (session != null) {
                    session.b();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f54339r = 1;
                if (ilrdEventsRepository.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54341r;

        public h(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return IlrdEventsRepository.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54341r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f54341r = 1;
                if (ilrdEventsRepository.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54343r;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54343r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f54343r = 1;
                if (ilrdEventsRepository.i(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54345r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54346s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54347t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f54348u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f54350w;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54348u = obj;
            this.f54350w |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.i(this);
        }
    }

    public static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54351r;

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IlrdEventsRepository.this.new k(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r5.a("ilrd_events_store", r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (r2.c("ilrd_events_store", r5, r4) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f54351r
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.d.b(r5)
                goto L6c
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.d.b(r5)
                goto L3e
            L1e:
                kotlin.d.b(r5)
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r5 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                java.util.List r5 = r5.getEvents()
                boolean r5 = r5.isEmpty()
                java.lang.String r1 = "ilrd_events_store"
                if (r5 == 0) goto L41
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r5 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                com.moloco.sdk.internal.services.g0 r5 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.c(r5)
                r4.f54351r = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L3e
                goto L6b
            L3e:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            L41:
                com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest$a r5 = com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest.newBuilder()
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r2 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                java.util.List r2 = r2.getEvents()
                com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest$a r5 = r5.a(r2)
                com.google.protobuf.GeneratedMessageLite r5 = r5.build()
                com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest r5 = (com.moloco.sdk.IlrdRequest$ImpressionRevenueRequest) r5
                byte[] r5 = r5.toByteArray()
                java.lang.String r5 = android.util.Base64.encodeToString(r5, r3)
                com.moloco.sdk.internal.ilrd.IlrdEventsRepository r2 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.this
                com.moloco.sdk.internal.services.g0 r2 = com.moloco.sdk.internal.ilrd.IlrdEventsRepository.c(r2)
                r4.f54351r = r3
                java.lang.Object r5 = r2.c(r1, r5, r4)
                if (r5 != r0) goto L6c
            L6b:
                return r0
            L6c:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54353r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a f54354s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IlrdEventsRepository f54355t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.moloco.sdk.internal.ilrd.a aVar, IlrdEventsRepository ilrdEventsRepository, Continuation continuation) {
            super(2, continuation);
            this.f54354s = aVar;
            this.f54355t = ilrdEventsRepository;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.f54354s, this.f54355t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54353r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                String strI = this.f54354s.i();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Storing current session: " + strI, null, false, 12, null);
                g0 g0Var = this.f54355t.dataStoreService;
                this.f54353r = 1;
                if (g0Var.c("ilrd_session_store", strI, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i iVar, Lifecycle lifecycle, o oVar, String str2, String str3, g0 g0Var, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, lVar, j10, i10, j11, j12, iVar, lifecycle, oVar, str2, str3, g0Var, eVar, eVar2, eVar3);
    }

    public final IlrdRequest$ImpressionLevelRevenue b(d.a ilrdData) {
        IlrdRequest$ImpressionLevelRevenue.a aVarA = IlrdRequest$ImpressionLevelRevenue.newBuilder().a(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar != null) {
            aVarA.c(aVar.f());
            b.a aVar2 = kotlin.time.b.f93560c;
            long jT = kotlin.time.c.t(this.timeProvider.a() - aVar.g(), cg.b.f6838e);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event created: sessionId=" + aVar.f() + ", sessionAge=" + ((Object) kotlin.time.b.L(jT)), null, false, 12, null);
        }
        if (!(ilrdData instanceof d.a.C0666a)) {
            throw new m();
        }
        aVarA.b(((d.a.C0666a) ilrdData).a());
        return (IlrdRequest$ImpressionLevelRevenue) aVarA.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
    
        if (r0.a("ilrd_events_store", r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015c, code lost:
    
        if (r0.a("ilrd_events_store", r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0275, code lost:
    
        if (r0.a("ilrd_events_store", r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0293, code lost:
    
        if (r0.a("ilrd_events_store", r2) != r3) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[PHI: r0 r4
  0x00e5: PHI (r0v15 java.lang.Object) = (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:36:0x00e1, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x00e5: PHI (r4v11 com.moloco.sdk.internal.ilrd.IlrdEventsRepository) = (r4v7 com.moloco.sdk.internal.ilrd.IlrdEventsRepository), (r4v15 com.moloco.sdk.internal.ilrd.IlrdEventsRepository) binds: [B:36:0x00e1, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.moloco.sdk.internal.ilrd.IlrdEventsRepository, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f() {
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar == null || aVar.h()) {
            x();
            return;
        }
        b.a aVar2 = kotlin.time.b.f93560c;
        long jT = kotlin.time.c.t(this.timeProvider.a() - aVar.g(), cg.b.f6838e);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Session validation - age: " + ((Object) kotlin.time.b.L(jT)) + ", limit: " + ((Object) kotlin.time.b.L(this.sessionMaxLength)), null, false, 12, null);
    }

    public final void g(long duration) {
        this.sessionMaxLengthScheduler.b(duration, new g(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getEvents() {
        return this.events;
    }

    public final void l(d.a ilrdData) {
        Intrinsics.checkNotNullParameter(ilrdData, "ilrdData");
        eg.g.c(this.scope, kotlin.coroutines.e.f93267b, f0.f69146b, new c(ilrdData, null));
    }

    public final Object o(Continuation continuation) {
        Object objG = eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new k(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "onPause called, sending events", null, false, 12, null);
        w();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    public final Object q(Continuation continuation) {
        com.moloco.sdk.internal.ilrd.a aVar = this.session;
        if (aVar == null) {
            return Unit.f93236a;
        }
        Object objG = eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new l(aVar, this, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final com.moloco.sdk.internal.ilrd.a getSession() {
        return this.session;
    }

    public final boolean s() {
        boolean z10 = this.events.size() >= this.maxBatchSize;
        if (z10) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "batch size reached", null, false, 12, null);
        }
        return z10;
    }

    public final synchronized void t() {
        f();
        u();
    }

    public final void u() {
        this.sessionInactiveScheduler.b(this.sessionExp, new f(null));
    }

    public final void v() {
        this.scheduledUploadScheduler.b(this.uploadInterval, new h(null));
    }

    public final void w() {
        eg.i.d(this.scope, null, null, new i(null), 3, null);
    }

    public final void x() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.timeProvider, null, 2, null);
        this.session = aVar;
        g(this.sessionMaxLength);
        v();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "New session started: sessionId=" + aVar.f() + ", maxBatch=" + this.maxBatchSize + ", uploadInterval=" + ((Object) kotlin.time.b.L(this.uploadInterval)) + ", sessionExp=" + ((Object) kotlin.time.b.L(this.sessionExp)) + ", maxLength=" + ((Object) kotlin.time.b.L(this.sessionMaxLength)), null, false, 12, null);
    }

    public IlrdEventsRepository(CoroutineScope scope, String url, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i timeProvider, Lifecycle processLifeycle, o advertisingIdService, String pubId, String appId, g0 dataStoreService, com.moloco.sdk.internal.ilrd.e sessionInactiveScheduler, com.moloco.sdk.internal.ilrd.e sessionMaxLengthScheduler, com.moloco.sdk.internal.ilrd.e scheduledUploadScheduler) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(processLifeycle, "processLifeycle");
        Intrinsics.checkNotNullParameter(advertisingIdService, "advertisingIdService");
        Intrinsics.checkNotNullParameter(pubId, "pubId");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        Intrinsics.checkNotNullParameter(sessionInactiveScheduler, "sessionInactiveScheduler");
        Intrinsics.checkNotNullParameter(sessionMaxLengthScheduler, "sessionMaxLengthScheduler");
        Intrinsics.checkNotNullParameter(scheduledUploadScheduler, "scheduledUploadScheduler");
        this.scope = scope;
        this.url = url;
        this.persistentHttpRequest = persistentHttpRequest;
        this.sessionExp = j10;
        this.maxBatchSize = i10;
        this.uploadInterval = j11;
        this.sessionMaxLength = j12;
        this.timeProvider = timeProvider;
        this.advertisingIdService = advertisingIdService;
        this.pubId = pubId;
        this.appId = appId;
        this.dataStoreService = dataStoreService;
        this.sessionInactiveScheduler = sessionInactiveScheduler;
        this.sessionMaxLengthScheduler = sessionMaxLengthScheduler;
        this.scheduledUploadScheduler = scheduledUploadScheduler;
        this.mutex = ng.f.b(false, 1, null);
        this.events = new ArrayList();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "ILRD repository initialized - url=" + url + ", uploadInterval=" + ((Object) kotlin.time.b.L(j11)) + ", maxBatchSize=" + i10 + ", sessionExpiry=" + ((Object) kotlin.time.b.L(j10)) + ", maxSessionLength=" + ((Object) kotlin.time.b.L(j12)), null, false, 12, null);
        eg.i.d(scope, null, null, new a(processLifeycle, null), 3, null);
    }

    public /* synthetic */ IlrdEventsRepository(CoroutineScope coroutineScope, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.i iVar, Lifecycle lifecycle, o oVar, String str2, String str3, g0 g0Var, com.moloco.sdk.internal.ilrd.e eVar, com.moloco.sdk.internal.ilrd.e eVar2, com.moloco.sdk.internal.ilrd.e eVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, lVar, j10, i10, j11, j12, iVar, lifecycle, oVar, str2, str3, g0Var, (i11 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, iVar, "SessionInactiveScheduler") : eVar, (i11 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, iVar, "SessionMaxLengthScheduler") : eVar2, (i11 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.e(coroutineScope, iVar, "UploadIntervalScheduler") : eVar3, null);
    }
}
