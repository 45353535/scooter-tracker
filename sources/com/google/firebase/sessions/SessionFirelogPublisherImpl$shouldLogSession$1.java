package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f33348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    /* synthetic */ Object f33349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SessionFirelogPublisherImpl f33350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f33351u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation continuation) {
        super(continuation);
        this.f33350t = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33349s = obj;
        this.f33351u |= Integer.MIN_VALUE;
        return this.f33350t.c(this);
    }
}
