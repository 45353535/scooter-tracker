package com.google.firebase.sessions.api;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.my.target.common.menu.MenuActionType;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0003RT\u0010\u001c\u001aB\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r \u001a* \u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "<init>", "()V", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "subscriberName", "", "addDependency", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)V", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "register", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "a", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegisteredSubscribers", "getSubscriber$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "reset$com_google_firebase_firebase_sessions", "reset", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "Dependency", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsDependencies {

    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Map dependencies = DesugarCollections.synchronizedMap(new LinkedHashMap());

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "<init>", "(Lkotlinx/coroutines/sync/Mutex;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "()Lkotlinx/coroutines/sync/Mutex;", "component2", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", MenuActionType.COPY, "(Lkotlinx/coroutines/sync/Mutex;Lcom/google/firebase/sessions/api/SessionSubscriber;)Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "b", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Dependency {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Mutex mutex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private SessionSubscriber subscriber;

        public Dependency(@NotNull Mutex mutex, @Nullable SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        public static /* synthetic */ Dependency copy$default(Dependency dependency, Mutex mutex, SessionSubscriber sessionSubscriber, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mutex = dependency.mutex;
            }
            if ((i10 & 2) != 0) {
                sessionSubscriber = dependency.subscriber;
            }
            return dependency.copy(mutex, sessionSubscriber);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Mutex getMutex() {
            return this.mutex;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        @NotNull
        public final Dependency copy(@NotNull Mutex mutex, @Nullable SessionSubscriber subscriber) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            return new Dependency(mutex, subscriber);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return Intrinsics.areEqual(this.mutex, dependency.mutex) && Intrinsics.areEqual(this.subscriber, dependency.subscriber);
        }

        @NotNull
        public final Mutex getMutex() {
            return this.mutex;
        }

        @Nullable
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final void setSubscriber(@Nullable SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(Mutex mutex, SessionSubscriber sessionSubscriber, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutex, (i10 & 2) != 0 ? null : sessionSubscriber);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    private final Dependency a(SessionSubscriber.Name subscriberName) {
        Map dependencies2 = dependencies;
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        Object obj = dependencies2.get(subscriberName);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "getOrElse(...)");
            return (Dependency) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    public static final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d(FirebaseSessions.TAG, "Dependency " + subscriberName + " already added.");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(f.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d(FirebaseSessions.TAG, "Dependency to " + subscriberName + " added.");
    }

    public static final void register(@NotNull SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        Dependency dependencyA = INSTANCE.a(sessionSubscriberName);
        if (dependencyA.getSubscriber() != null) {
            Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        dependencyA.setSubscriber(subscriber);
        Log.d(FirebaseSessions.TAG, "Subscriber " + sessionSubscriberName + " registered.");
        Mutex.a.c(dependencyA.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.f33429z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33429z = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f33427x
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f33429z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f33426w
            java.lang.Object r5 = r0.f33425v
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f33424u
            kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.f33423t
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.f33422s
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f33421r
            java.util.Map r9 = (java.util.Map) r9
            kotlin.d.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            kotlin.d.b(r11)
            java.util.Map r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.getMutex()
            r0.f33421r = r5
            r0.f33422s = r8
            r0.f33423t = r7
            r0.f33424u = r6
            r0.f33425v = r5
            r0.f33426w = r2
            r0.f33429z = r3
            java.lang.Object r11 = r6.lock(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lb0
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.unlock(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.unlock(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber subscriber = a(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        dependencies.clear();
    }
}
