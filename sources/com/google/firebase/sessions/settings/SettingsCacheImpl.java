package com.google.firebase.sessions.settings;

import androidx.compose.animation.core.c;
import androidx.datastore.core.DataStore;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.TimeProvider;
import eg.h;
import eg.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u001aH\u0081@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/TimeProvider;Landroidx/datastore/core/DataStore;)V", "", "hasCacheExpired", "()Z", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "sessionConfigs", "", "updateConfigs", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "a", "Lkotlin/coroutines/CoroutineContext;", "b", "Lcom/google/firebase/sessions/TimeProvider;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroidx/datastore/core/DataStore;", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigsAtomicReference", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsCacheImpl implements SettingsCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DataStore sessionConfigsDataStore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference sessionConfigsAtomicReference;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33500r;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C03641 implements FlowCollector, v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicReference f33502b;

            C03641(AtomicReference atomicReference) {
                this.f33502b = atomicReference;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(SessionConfigs sessionConfigs, Continuation continuation) {
                Object objC = AnonymousClass1.c(this.f33502b, sessionConfigs, continuation);
                return objC == b.g() ? objC : Unit.f93236a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof v)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.v
            public final lf.e getFunctionDelegate() {
                return new a(2, this.f33502b, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object c(AtomicReference atomicReference, SessionConfigs sessionConfigs, Continuation continuation) {
            atomicReference.set(sessionConfigs);
            return Unit.f93236a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return SettingsCacheImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.f33500r;
            if (i10 == 0) {
                d.b(obj);
                Flow data = SettingsCacheImpl.this.sessionConfigsDataStore.getData();
                C03641 c03641 = new C03641(SettingsCacheImpl.this.sessionConfigsAtomicReference);
                this.f33500r = 1;
                if (data.collect(c03641, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
    static final class C35631 extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f33509r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f33511t;

        C35631(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33509r = obj;
            this.f33511t |= Integer.MIN_VALUE;
            return SettingsCacheImpl.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<SessionConfigs, Continuation, Object> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33512r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ SessionConfigs f33513s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SessionConfigs sessionConfigs, Continuation continuation) {
            super(2, continuation);
            this.f33513s = sessionConfigs;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f33513s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SessionConfigs sessionConfigs, Continuation continuation) {
            return ((AnonymousClass2) create(sessionConfigs, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.g();
            if (this.f33512r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return this.f33513s;
        }
    }

    public SettingsCacheImpl(@Background @NotNull CoroutineContext backgroundDispatcher, @NotNull TimeProvider timeProvider, @NotNull DataStore<SessionConfigs> sessionConfigsDataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference();
        i.d(kotlinx.coroutines.i.a(backgroundDispatcher), null, null, new AnonymousClass1(null), 3, null);
    }

    private final SessionConfigs a() {
        if (this.sessionConfigsAtomicReference.get() == null) {
            c.a(this.sessionConfigsAtomicReference, null, h.b(null, new SettingsCacheImpl$sessionConfigs$1(this, null), 1, null));
        }
        Object obj = this.sessionConfigsAtomicReference.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (SessionConfigs) obj;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = a().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = a().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.timeProvider.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$1) r0
            int r1 = r0.f33505t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33505t = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f33503r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f33505t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r6 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.d.b(r6)
            androidx.datastore.core.DataStore r6 = r5.sessionConfigsDataStore     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r4)     // Catch: java.io.IOException -> L29
            r0.f33505t = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r6.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove config values: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            int r6 = android.util.Log.w(r0, r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCacheImpl.removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Integer sessionRestartTimeout() {
        return a().getSessionTimeoutSeconds();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Double sessionSamplingRate() {
        return a().getSessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    @Nullable
    public Boolean sessionsEnabled() {
        return a().getSessionsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateConfigs(@org.jetbrains.annotations.NotNull com.google.firebase.sessions.settings.SessionConfigs r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.firebase.sessions.settings.SettingsCacheImpl.C35631
            if (r0 == 0) goto L13
            r0 = r7
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCacheImpl.C35631) r0
            int r1 = r0.f33511t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33511t = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f33509r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f33511t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r7)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.d.b(r7)
            androidx.datastore.core.DataStore r7 = r5.sessionConfigsDataStore     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.f33511t = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to update config values: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCacheImpl.updateConfigs(com.google.firebase.sessions.settings.SessionConfigs, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
