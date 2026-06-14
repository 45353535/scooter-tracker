package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3579ae f38001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(C3579ae c3579ae, Continuation continuation) {
        super(2, continuation);
        this.f38001a = c3579ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Xd(this.f38001a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Xd(this.f38001a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f38001a.f38204g.setActivated(false);
        this.f38001a.f38204g.setFocusable(false);
        MediaPlayer mediaPlayer = this.f38001a.f38200c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        this.f38001a.f38203f.a();
        return Unit.f93236a;
    }
}
