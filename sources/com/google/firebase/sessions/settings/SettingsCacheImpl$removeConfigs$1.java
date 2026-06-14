package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {107}, m = "removeConfigs$com_google_firebase_firebase_sessions")
final class SettingsCacheImpl$removeConfigs$1 extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f33503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ SettingsCacheImpl f33504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f33505t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsCacheImpl$removeConfigs$1(SettingsCacheImpl settingsCacheImpl, Continuation continuation) {
        super(continuation);
        this.f33504s = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33503r = obj;
        this.f33505t |= Integer.MIN_VALUE;
        return this.f33504s.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
