package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3943p extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f39225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f39226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f39227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943p(InterfaceC3878m9 interfaceC3878m9, Context context, long j10, Continuation continuation) {
        super(2, continuation);
        this.f39225a = interfaceC3878m9;
        this.f39226b = context;
        this.f39227c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3943p(this.f39225a, this.f39226b, this.f39227c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3943p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9 = this.f39225a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3968q.f39324b == null) {
            Object systemService = this.f39226b.getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3968q.f39324b = (AudioManager) systemService;
        }
        C3968q c3968q = C3968q.f39323a;
        C3968q.f39328f = F3.a(C3968q.f39329g, 0L, this.f39227c, new C3918o(null));
        C3968q.a(this.f39227c);
        Context context = this.f39226b;
        C3968q.f39325c = new C3818k();
        context.registerReceiver(C3968q.f39325c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3968q.a(Float.valueOf(c3968q.a()));
        return Unit.f93236a;
    }
}
