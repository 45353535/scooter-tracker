package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import pf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
final class SettingsCacheImpl$removeConfigs$2 extends k implements Function2<SessionConfigs, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33506r;

    SettingsCacheImpl$removeConfigs$2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsCacheImpl$removeConfigs$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SessionConfigs sessionConfigs, Continuation continuation) {
        return ((SettingsCacheImpl$removeConfigs$2) create(sessionConfigs, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.g();
        if (this.f33506r != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        return SessionConfigsSerializer.INSTANCE.getDefaultValue();
    }
}
