package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f33421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Object f33422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f33423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Object f33424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Object f33425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Object f33426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    /* synthetic */ Object f33427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final /* synthetic */ FirebaseSessionsDependencies f33428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f33429z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, Continuation continuation) {
        super(continuation);
        this.f33428y = firebaseSessionsDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33427x = obj;
        this.f33429z |= Integer.MIN_VALUE;
        return this.f33428y.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
