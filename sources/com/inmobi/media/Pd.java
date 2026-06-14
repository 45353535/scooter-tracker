package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Pd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f37539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pd(Sd sd2, Continuation continuation) {
        super(2, continuation);
        this.f37539a = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pd(this.f37539a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pd(this.f37539a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Sd sd2 = this.f37539a;
        if (sd2.f37712b.f37618b) {
            C3717fn c3717fn = sd2.f37720j;
            c3717fn.c();
            c3717fn.f38602g = -1;
            c3717fn.b();
            MediaPlayer mediaPlayer = this.f37539a.f37718h;
            Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.f37539a.f37718h;
            Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
            try {
                mediaPlayer2.start();
            } catch (IllegalStateException unused2) {
            }
        } else {
            sd2.f37720j.c();
            C4134wg c4134wg = (C4134wg) this.f37539a.f37721k.f39318i.f37976d.getValue();
            c4134wg.f39857f.set(true);
            H6.a(c4134wg.f39856e);
            c4134wg.f39856e = null;
            this.f37539a.f37715e = EnumC4034sg.f39537f;
        }
        return Unit.f93236a;
    }
}
