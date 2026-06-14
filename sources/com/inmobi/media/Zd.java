package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Zd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3579ae f38115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zd(C3579ae c3579ae, Continuation continuation) {
        super(2, continuation);
        this.f38115a = c3579ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Zd(this.f38115a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Zd(this.f38115a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        if (this.f38115a.f38203f.d()) {
            C3579ae c3579ae = this.f38115a;
            MediaPlayer mediaPlayer = c3579ae.f38200c;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c3579ae.a(c3579ae.f38208k, c3579ae.f38207j);
            P4.a(c3579ae.f38202e, c3579ae.f38199b, new S1(1.0f, false));
            c3579ae.f38206i = false;
        } else {
            this.f38115a.a();
        }
        return Unit.f93236a;
    }
}
