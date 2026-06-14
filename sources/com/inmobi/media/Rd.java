package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Rd implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f37657a;

    public Rd(Sd sd2) {
        this.f37657a = sd2;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        Sd sd2 = this.f37657a;
        EnumC4034sg enumC4034sg = sd2.f37715e;
        if (enumC4034sg == EnumC4034sg.f39536e || enumC4034sg == EnumC4034sg.f39534c) {
            Context context = sd2.f37717g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (Rm.a(context, sd2.f37712b.f37617a)) {
                C3579ae c3579ae = sd2.f37719i;
                P4.a(c3579ae.f38199b, new Yd(c3579ae, null));
                sd2.f37720j.b();
                MediaPlayer mediaPlayer = sd2.f37718h;
                Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
                P4.a(sd2.f37716f, sd2.f37711a, new C3768hn(sd2.f37718h.getCurrentPosition()));
                sd2.f37715e = EnumC4034sg.f39535d;
            }
        }
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        Sd sd2 = this.f37657a;
        if (sd2.f37715e != EnumC4034sg.f39535d) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f37718h;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        sd2.f37720j.c();
        C3579ae c3579ae = sd2.f37719i;
        P4.a(c3579ae.f38199b, new Xd(c3579ae, null));
        P4.a(sd2.f37716f, sd2.f37711a, new Om(sd2.f37718h.getCurrentPosition()));
        sd2.f37715e = EnumC4034sg.f39536e;
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Sd sd2 = this.f37657a;
        if (sd2.f37715e != EnumC4034sg.f39537f) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f37718h;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
