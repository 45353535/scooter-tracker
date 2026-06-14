package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Vd implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3579ae f37905a;

    public Vd(C3579ae c3579ae) {
        this.f37905a = c3579ae;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f37905a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        C3579ae c3579ae = this.f37905a;
        MediaPlayer mediaPlayer = c3579ae.f38200c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c3579ae.a(c3579ae.f38208k, c3579ae.f38207j);
        P4.a(c3579ae.f38202e, c3579ae.f38199b, new S1(1.0f, false));
        c3579ae.f38206i = false;
    }
}
