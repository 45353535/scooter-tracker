package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes9.dex */
public final class Im implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f37078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f37080c;

    public Im(InterfaceC3878m9 interfaceC3878m9, String str, kotlinx.coroutines.e eVar) {
        this.f37078a = interfaceC3878m9;
        this.f37079b = str;
        this.f37080c = eVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37078a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.f37079b);
        }
        P4.a(this.f37080c, Boolean.TRUE);
    }
}
