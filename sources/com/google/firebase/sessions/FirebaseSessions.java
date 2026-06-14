package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "settings", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;", "sessionsActivityLifecycleCallbacks", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;)V", "a", "Lcom/google/firebase/FirebaseApp;", "b", "Lcom/google/firebase/sessions/settings/SessionsSettings;", y.f66058y, "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FirebaseSessions";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseApp firebaseApp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33279r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SessionsActivityLifecycleCallbacks f33281t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, Continuation continuation) {
            super(2, continuation);
            this.f33281t = sessionsActivityLifecycleCallbacks;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            sessionsActivityLifecycleCallbacks.onAppDelete();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return FirebaseSessions.this.new AnonymousClass1(this.f33281t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f33279r
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.d.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.d.b(r6)
                goto L2e
            L20:
                kotlin.d.b(r6)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r5.f33279r = r4
                java.lang.Object r6 = r6.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r5)
                if (r6 != r0) goto L2e
                goto L68
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L92
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r6.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L48
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                r5.f33279r = r3
                java.lang.Object r6 = r6.updateSettings(r5)
                if (r6 != r0) goto L69
            L68:
                return r0
            L69:
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.settings.SessionsSettings r6 = com.google.firebase.sessions.FirebaseSessions.access$getSettings$p(r6)
                boolean r6 = r6.getSessionsEnabled()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                kotlin.coroutines.jvm.internal.b.d(r6)
                goto L9b
            L7f:
                com.google.firebase.sessions.FirebaseSessions r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.FirebaseApp r6 = com.google.firebase.sessions.FirebaseSessions.access$getFirebaseApp$p(r6)
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = r5.f33281t
                com.google.firebase.sessions.b r1 = new com.google.firebase.sessions.b
                r1.<init>()
                r6.addLifecycleEventListener(r1)
                kotlin.Unit r6 = kotlin.Unit.f93236a
                goto L9b
            L92:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                kotlin.coroutines.jvm.internal.b.d(r6)
            L9b:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "<init>", "()V", "TAG", "", C4424m2.f43617p, "Lcom/google/firebase/sessions/FirebaseSessions;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull SessionsSettings settings, @Background @NotNull CoroutineContext backgroundDispatcher, @NotNull SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d(TAG, "Initializing Firebase Sessions 3.0.3.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            eg.i.d(kotlinx.coroutines.i.a(backgroundDispatcher), null, null, new AnonymousClass1(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
