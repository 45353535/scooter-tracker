package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4055tc extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4080uc f39590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4130wc f39591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f39592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4055tc(C4080uc c4080uc, C4130wc c4130wc, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f39590a = c4080uc;
        this.f39591b = c4130wc;
        this.f39592c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4055tc(this.f39590a, this.f39591b, this.f39592c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4055tc) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Context context = this.f39590a.f39663b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    C4080uc c4080uc = this.f39590a;
                    if (streamVolume != c4080uc.f39664c) {
                        c4080uc.f39664c = streamVolume;
                        InterfaceC3878m9 interfaceC3878m9 = this.f39591b.f39840b;
                        if (interfaceC3878m9 != null) {
                            ((C3903n9) interfaceC3878m9).a("MraidMediaProcessor", "volume change detected - " + this.f39592c);
                        }
                        this.f39591b.a(this.f39590a.f39662a, streamVolume);
                    }
                } catch (Exception e10) {
                    InterfaceC3878m9 interfaceC3878m92 = this.f39591b.f39840b;
                    if (interfaceC3878m92 != null) {
                        ((C3903n9) interfaceC3878m92).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
        return Unit.f93236a;
    }
}
