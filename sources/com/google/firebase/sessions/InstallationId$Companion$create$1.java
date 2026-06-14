package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {31, 39}, m = "create")
final class InstallationId$Companion$create$1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f33297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    /* synthetic */ Object f33298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ InstallationId.Companion f33299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f33300u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallationId$Companion$create$1(InstallationId.Companion companion, Continuation continuation) {
        super(continuation);
        this.f33299t = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33298s = obj;
        this.f33300u |= Integer.MIN_VALUE;
        return this.f33299t.create(null, this);
    }
}
