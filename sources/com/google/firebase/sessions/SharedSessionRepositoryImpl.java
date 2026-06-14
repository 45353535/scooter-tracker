package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0001\u0018\u00002\u00020\u0001:\u0001BBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "Lcom/google/firebase/sessions/ProcessDataManager;", "processDataManager", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;Lcom/google/firebase/sessions/SessionFirelogPublisher;Lcom/google/firebase/sessions/TimeProvider;Landroidx/datastore/core/DataStore;Lcom/google/firebase/sessions/ProcessDataManager;Lkotlin/coroutines/CoroutineContext;)V", "", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "type", "", "d", "(Ljava/lang/String;Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionData", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Lcom/google/firebase/sessions/SessionData;)Z", "a", "b", "appBackground", "()V", "appForeground", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/SessionGenerator;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/TimeProvider;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroidx/datastore/core/DataStore;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/google/firebase/sessions/ProcessDataManager;", "g", "Lkotlin/coroutines/CoroutineContext;", "localSessionData", "Lcom/google/firebase/sessions/SessionData;", "getLocalSessionData$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SessionData;", "setLocalSessionData$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;)V", "value", "h", "Z", "isInForeground", "()Z", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;)V", "previousNotificationType", "j", "Ljava/lang/String;", "previousSessionId", "NotificationType", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SessionsSettings sessionsSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SessionGenerator sessionGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SessionFirelogPublisher sessionFirelogPublisher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DataStore sessionDataStore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ProcessDataManager processDataManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInForeground;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private NotificationType previousNotificationType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String previousSessionId;
    public SessionData localSessionData;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33382r;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/firebase/sessions/SessionData;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {92}, m = "invokeSuspend")
        static final class C03611 extends kotlin.coroutines.jvm.internal.k implements Function3<FlowCollector, Throwable, Continuation, Object> {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f33384r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f33385s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f33386t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ SharedSessionRepositoryImpl f33387u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03611(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
                super(3, continuation);
                this.f33387u = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f33384r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f33385s;
                    Throwable th2 = (Throwable) this.f33386t;
                    SessionData sessionData = new SessionData(this.f33387u.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    Log.d(FirebaseSessions.TAG, "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f33385s = null;
                    this.f33384r = 1;
                    if (flowCollector.emit(sessionData, this) == objG) {
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

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                C03611 c03611 = new C03611(this.f33387u, continuation);
                c03611.f33385s = flowCollector;
                c03611.f33386t = th2;
                return c03611.invokeSuspend(Unit.f93236a);
            }
        }

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f33382r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flowH = hg.i.h(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new C03611(SharedSessionRepositoryImpl.this, null));
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(SessionData sessionData, Continuation continuation) {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        Object objD = sharedSessionRepositoryImpl.d(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, continuation);
                        return objD == pf.b.g() ? objD : Unit.f93236a;
                    }
                };
                this.f33382r = 1;
                if (flowH.collect(flowCollector, this) == objG) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ NotificationType[] f33389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f33390c;
        public static final NotificationType GENERAL = new NotificationType("GENERAL", 0);
        public static final NotificationType FALLBACK = new NotificationType("FALLBACK", 1);

        static {
            NotificationType[] notificationTypeArrD = d();
            f33389b = notificationTypeArrD;
            f33390c = qf.a.a(notificationTypeArrD);
        }

        private NotificationType(String str, int i10) {
        }

        private static final /* synthetic */ NotificationType[] d() {
            return new NotificationType[]{GENERAL, FALLBACK};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f33390c;
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) f33389b.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {112}, m = "invokeSuspend")
    static final class C35611 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33391r;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "sessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class C03621 extends kotlin.coroutines.jvm.internal.k implements Function2<SessionData, Continuation, Object> {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f33393r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f33394s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SharedSessionRepositoryImpl f33395t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03621(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
                super(2, continuation);
                this.f33395t = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C03621 c03621 = new C03621(this.f33395t, continuation);
                c03621.f33394s = obj;
                return c03621;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation continuation) {
                return ((C03621) create(sessionData, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f33393r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return SessionData.copy$default((SessionData) this.f33394s, null, this.f33395t.timeProvider.currentTime(), null, 5, null);
            }
        }

        C35611(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SharedSessionRepositoryImpl.this.new C35611(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f33391r;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    DataStore dataStore = SharedSessionRepositoryImpl.this.sessionDataStore;
                    C03621 c03621 = new C03621(SharedSessionRepositoryImpl.this, null);
                    this.f33391r = 1;
                    if (dataStore.updateData(c03621, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
            } catch (Exception e10) {
                Log.d(FirebaseSessions.TAG, "App backgrounded, failed to update data. Message: " + e10.getMessage());
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35611) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
    static final class C35621 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33396r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SessionData f33398t;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class C03631 extends kotlin.coroutines.jvm.internal.k implements Function2<SessionData, Continuation, Object> {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f33399r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f33400s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SharedSessionRepositoryImpl f33401t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03631(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
                super(2, continuation);
                this.f33401t = sharedSessionRepositoryImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C03631 c03631 = new C03631(this.f33401t, continuation);
                c03631.f33400s = obj;
                return c03631;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SessionData sessionData, Continuation continuation) {
                return ((C03631) create(sessionData, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f33399r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                SessionData sessionData = (SessionData) this.f33400s;
                boolean zC = this.f33401t.c(sessionData);
                boolean zA = this.f33401t.a(sessionData);
                boolean zB = this.f33401t.b(sessionData);
                Map<String, ProcessData> mapGenerateProcessDataMap = zA ? this.f33401t.processDataManager.generateProcessDataMap() : zB ? this.f33401t.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                SessionDetails sessionDetails = zA ? null : sessionData.getSessionDetails();
                if (!zC && !zA) {
                    return zB ? SessionData.copy$default(sessionData, null, null, this.f33401t.processDataManager.updateProcessDataMap(mapGenerateProcessDataMap), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsGenerateNewSession = this.f33401t.sessionGenerator.generateNewSession(sessionDetails);
                this.f33401t.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                this.f33401t.processDataManager.onSessionGenerated();
                return sessionData.copy(sessionDetailsGenerateNewSession, null, mapGenerateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35621(SessionData sessionData, Continuation continuation) {
            super(2, continuation);
            this.f33398t = sessionData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SharedSessionRepositoryImpl.this.new C35621(this.f33398t, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r10.updateData(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.d(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r1 = pf.b.g()
                int r0 = r9.f33396r
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                kotlin.d.b(r10)
                goto L9a
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                kotlin.d.b(r10)     // Catch: java.lang.Exception -> L20
                goto L9a
            L20:
                r0 = move-exception
                r10 = r0
                goto L3d
            L23:
                kotlin.d.b(r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L20
                androidx.datastore.core.DataStore r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionDataStore$p(r10)     // Catch: java.lang.Exception -> L20
                com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1 r0 = new com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1     // Catch: java.lang.Exception -> L20
                com.google.firebase.sessions.SharedSessionRepositoryImpl r4 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f33396r = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = r10.updateData(r0, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r1) goto L9a
                goto L99
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.append(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r10)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r0 = r9.f33398t
                boolean r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$isSessionExpired(r10, r0)
                if (r10 == 0) goto L9a
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionGenerator r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionGenerator$p(r10)
                com.google.firebase.sessions.SessionData r0 = r9.f33398t
                com.google.firebase.sessions.SessionDetails r0 = r0.getSessionDetails()
                com.google.firebase.sessions.SessionDetails r4 = r10.generateNewSession(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionData r3 = r9.f33398t
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                com.google.firebase.sessions.SessionData r0 = com.google.firebase.sessions.SessionData.copy$default(r3, r4, r5, r6, r7, r8)
                r10.setLocalSessionData$com_google_firebase_firebase_sessions(r0)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                com.google.firebase.sessions.SessionFirelogPublisher r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$getSessionFirelogPublisher$p(r10)
                r10.mayLogSession(r4)
                com.google.firebase.sessions.SharedSessionRepositoryImpl r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.this
                java.lang.String r0 = r4.getSessionId()
                com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType r3 = com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType.FALLBACK
                r9.f33396r = r2
                java.lang.Object r10 = com.google.firebase.sessions.SharedSessionRepositoryImpl.access$notifySubscribers(r10, r0, r3, r9)
                if (r10 != r1) goto L9a
            L99:
                return r1
            L9a:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.C35621.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C35621) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public SharedSessionRepositoryImpl(@NotNull SessionsSettings sessionsSettings, @NotNull SessionGenerator sessionGenerator, @NotNull SessionFirelogPublisher sessionFirelogPublisher, @NotNull TimeProvider timeProvider, @NotNull DataStore<SessionData> sessionDataStore, @NotNull ProcessDataManager processDataManager, @Background @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        Intrinsics.checkNotNullParameter(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionDataStore, "sessionDataStore");
        Intrinsics.checkNotNullParameter(processDataManager, "processDataManager");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        eg.i.d(kotlinx.coroutines.i.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data map");
            return true;
        }
        boolean zIsColdStart = this.processDataManager.isColdStart(processDataMap);
        if (zIsColdStart) {
            Log.d(FirebaseSessions.TAG, "Cold app start detected");
        }
        return zIsColdStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d(FirebaseSessions.TAG, "No process data for " + this.processDataManager.getMyProcessName());
            return true;
        }
        boolean zIsMyProcessStale = this.processDataManager.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            Log.d(FirebaseSessions.TAG, "Process " + this.processDataManager.getMyProcessName() + " is stale");
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z10 = kotlin.time.b.i(this.timeProvider.currentTime().m4496minus5sfh64U(backgroundTime), this.sessionsSettings.m4499getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z10) {
            Log.d(FirebaseSessions.TAG, "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, com.google.firebase.sessions.SharedSessionRepositoryImpl.NotificationType r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SharedSessionRepositoryImpl.d(java.lang.String, com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            Log.d(FirebaseSessions.TAG, "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d(FirebaseSessions.TAG, "App backgrounded on " + this.processDataManager.getMyProcessName());
        eg.i.d(kotlinx.coroutines.i.a(this.backgroundDispatcher), null, null, new C35611(null), 3, null);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            Log.d(FirebaseSessions.TAG, "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        Log.d(FirebaseSessions.TAG, "App foregrounded on " + this.processDataManager.getMyProcessName());
        if (c(localSessionData$com_google_firebase_firebase_sessions) || b(localSessionData$com_google_firebase_firebase_sessions)) {
            eg.i.d(kotlinx.coroutines.i.a(this.backgroundDispatcher), null, null, new C35621(localSessionData$com_google_firebase_firebase_sessions, null), 3, null);
        }
    }

    @NotNull
    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localSessionData");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions, reason: from getter */
    public final NotificationType getPreviousNotificationType() {
        return this.previousNotificationType;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(@NotNull SessionData sessionData) {
        Intrinsics.checkNotNullParameter(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }

    public final void setPreviousNotificationType$com_google_firebase_firebase_sessions(@NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(notificationType, "<set-?>");
        this.previousNotificationType = notificationType;
    }
}
