package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes9.dex */
public final class Jm implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f37171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f37173c;

    public Jm(InterfaceC3878m9 interfaceC3878m9, String str, kotlinx.coroutines.e eVar) {
        this.f37171a = interfaceC3878m9;
        this.f37172b = str;
        this.f37173c = eVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37171a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("VideoLoaderHelper", "Video Load Error URL: " + this.f37172b);
        }
        P4.a(this.f37173c, Boolean.FALSE);
        return true;
    }
}
