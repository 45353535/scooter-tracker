package com.google.firebase.sessions.settings;

import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import pf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {64}, m = "invokeSuspend")
final class SettingsCacheImpl$sessionConfigs$1 extends k implements Function2<CoroutineScope, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f33507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ SettingsCacheImpl f33508s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsCacheImpl$sessionConfigs$1(SettingsCacheImpl settingsCacheImpl, Continuation continuation) {
        super(2, continuation);
        this.f33508s = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsCacheImpl$sessionConfigs$1(this.f33508s, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = b.g();
        int i10 = this.f33507r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        Flow data = this.f33508s.sessionConfigsDataStore.getData();
        this.f33507r = 1;
        Object objX = i.x(data, this);
        return objX == objG ? objG : objX;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SettingsCacheImpl$sessionConfigs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
