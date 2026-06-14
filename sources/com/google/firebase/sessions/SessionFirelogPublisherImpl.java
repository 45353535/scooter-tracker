package com.google.firebase.sessions;

import android.util.Log;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionSettings", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "eventGDTLogger", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/google/firebase/sessions/SessionEvent;", "sessionEvent", "", "a", "(Lcom/google/firebase/sessions/SessionEvent;)V", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()Z", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "mayLogSession", "(Lcom/google/firebase/sessions/SessionDetails;)V", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "d", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lkotlin/coroutines/CoroutineContext;", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f33333f = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseApp firebaseApp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FirebaseInstallationsApi firebaseInstallations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SessionsSettings sessionSettings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final EventGDTLoggerInterface eventGDTLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f33339r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f33340s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f33341t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f33342u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f33343v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f33344w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f33345x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ SessionDetails f33347z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SessionDetails sessionDetails, Continuation continuation) {
            super(2, continuation);
            this.f33347z = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SessionFirelogPublisherImpl.this.new AnonymousClass1(this.f33347z, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.f33345x
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r8.f33344w
                com.google.firebase.sessions.settings.SessionsSettings r0 = (com.google.firebase.sessions.settings.SessionsSettings) r0
                java.lang.Object r1 = r8.f33343v
                com.google.firebase.sessions.SessionDetails r1 = (com.google.firebase.sessions.SessionDetails) r1
                java.lang.Object r2 = r8.f33342u
                com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2
                java.lang.Object r3 = r8.f33341t
                com.google.firebase.sessions.SessionEvents r3 = (com.google.firebase.sessions.SessionEvents) r3
                java.lang.Object r4 = r8.f33340s
                com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r4
                java.lang.Object r5 = r8.f33339r
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                kotlin.d.b(r9)
                r7 = r3
                r3 = r0
                r0 = r7
                r7 = r2
                r2 = r1
                r1 = r7
            L32:
                r7 = r4
                goto L9d
            L35:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L3d:
                kotlin.d.b(r9)
                goto L6c
            L41:
                kotlin.d.b(r9)
                goto L53
            L45:
                kotlin.d.b(r9)
                com.google.firebase.sessions.SessionFirelogPublisherImpl r9 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                r8.f33345x = r4
                java.lang.Object r9 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$shouldLogSession(r9, r8)
                if (r9 != r0) goto L53
                goto L95
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb0
                com.google.firebase.sessions.InstallationId$Companion r9 = com.google.firebase.sessions.InstallationId.INSTANCE
                com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.installations.FirebaseInstallationsApi r1 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseInstallations$p(r1)
                r8.f33345x = r3
                java.lang.Object r9 = r9.create(r1, r8)
                if (r9 != r0) goto L6c
                goto L95
            L6c:
                r5 = r9
                com.google.firebase.sessions.InstallationId r5 = (com.google.firebase.sessions.InstallationId) r5
                com.google.firebase.sessions.SessionFirelogPublisherImpl r4 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.sessions.SessionEvents r3 = com.google.firebase.sessions.SessionEvents.INSTANCE
                com.google.firebase.FirebaseApp r9 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getFirebaseApp$p(r4)
                com.google.firebase.sessions.SessionDetails r1 = r8.f33347z
                com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = com.google.firebase.sessions.SessionFirelogPublisherImpl.this
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.SessionFirelogPublisherImpl.access$getSessionSettings$p(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r8.f33339r = r5
                r8.f33340s = r4
                r8.f33341t = r3
                r8.f33342u = r9
                r8.f33343v = r1
                r8.f33344w = r6
                r8.f33345x = r2
                java.lang.Object r2 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r8)
                if (r2 != r0) goto L96
            L95:
                return r0
            L96:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r0
                r0 = r3
                r3 = r6
                goto L32
            L9d:
                r4 = r9
                java.util.Map r4 = (java.util.Map) r4
                r9 = r5
                java.lang.String r5 = r9.getFid()
                java.lang.String r6 = r9.getAuthToken()
                com.google.firebase.sessions.SessionEvent r9 = r0.buildSession(r1, r2, r3, r4, r5, r6)
                com.google.firebase.sessions.SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent(r7, r9)
            Lb0:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @Background @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d(FirebaseSessions.TAG, "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e(FirebaseSessions.TAG, "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean b() {
        return f33333f <= this.sessionSettings.getSamplingRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.f33351u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33351u = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f33349s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f33351u
            r3 = 2
            r4 = 0
            java.lang.String r5 = "FirebaseSessions"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f33348r
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            kotlin.d.b(r9)
            goto L8e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.f33348r
            com.google.firebase.sessions.SessionFirelogPublisherImpl r2 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r2
            kotlin.d.b(r9)
            goto L54
        L43:
            kotlin.d.b(r9)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r9 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r0.f33348r = r8
            r0.f33351u = r6
            java.lang.Object r9 = r9.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r9 != r1) goto L53
            goto L8c
        L53:
            r2 = r8
        L54:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Collection r9 = r9.values()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r7 = r9 instanceof java.util.Collection
            if (r7 == 0) goto L6a
            r7 = r9
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L6a
            goto Lb5
        L6a:
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r9.next()
            com.google.firebase.sessions.api.SessionSubscriber r7 = (com.google.firebase.sessions.api.SessionSubscriber) r7
            boolean r7 = r7.isDataCollectionEnabled()
            if (r7 == 0) goto L6e
            com.google.firebase.sessions.settings.SessionsSettings r9 = r2.sessionSettings
            r0.f33348r = r2
            r0.f33351u = r3
            java.lang.Object r9 = r9.updateSettings(r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r0 = r2
        L8e:
            com.google.firebase.sessions.settings.SessionsSettings r9 = r0.sessionSettings
            boolean r9 = r9.getSessionsEnabled()
            if (r9 != 0) goto La0
            java.lang.String r9 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r9
        La0:
            boolean r9 = r0.b()
            if (r9 != 0) goto Lb0
            java.lang.String r9 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r9
        Lb0:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r9
        Lb5:
            java.lang.String r9 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void mayLogSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        eg.i.d(kotlinx.coroutines.i.a(this.backgroundDispatcher), null, null, new AnonymousClass1(sessionDetails, null), 3, null);
    }
}
