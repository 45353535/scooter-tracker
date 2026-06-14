package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {199}, m = "notifySubscribers")
final class SharedSessionRepositoryImpl$notifySubscribers$1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f33402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Object f33403s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f33404t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ SharedSessionRepositoryImpl f33405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f33406v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedSessionRepositoryImpl$notifySubscribers$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.f33405u = sharedSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33404t = obj;
        this.f33406v |= Integer.MIN_VALUE;
        return this.f33405u.d(null, null, this);
    }
}
