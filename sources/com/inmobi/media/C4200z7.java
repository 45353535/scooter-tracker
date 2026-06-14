package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.C4240b4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4200z7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f40036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3702f8 f40037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4200z7(Continuation continuation, N7 n72, C3702f8 c3702f8) {
        super(2, continuation);
        this.f40036a = n72;
        this.f40037b = c3702f8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4200z7(continuation, this.f40036a, this.f40037b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4200z7((Continuation) obj2, this.f40036a, this.f40037b).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        pf.b.g();
        kotlin.d.b(obj);
        this.f40036a.f37413l.set(EnumC4034sg.f39534c);
        this.f40036a.f37417p.seekTo(0L);
        C3927o8 c3927o8 = this.f40036a.f37427z;
        if (!c3927o8.f39175g && (surface = c3927o8.f39173e) != null) {
            c3927o8.f39175g = true;
            c3927o8.f39170b.setVideoSurface(surface);
        }
        N7 n72 = this.f40036a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.f40037b.f38562b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.f40037b.f38561a);
        htmlVideoPlaybackState.setLatency(kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - this.f40036a.f37422u));
        htmlVideoPlaybackState.setMuted(this.f40036a.f37426y.f37699e);
        EnumC3802j8[] enumC3802j8Arr = EnumC3802j8.f38802a;
        htmlVideoPlaybackState.setState(C4240b4.i.f42650s);
        htmlVideoPlaybackState.setTime(this.f40036a.f37417p.getCurrentPosition() / 1000.0f);
        n72.a(new C3728g8(htmlVideoPlaybackState, this.f40037b.f38563c));
        return Unit.f93236a;
    }
}
