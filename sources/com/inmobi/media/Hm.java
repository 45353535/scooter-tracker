package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class Hm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f37033a;

    public Hm(MediaPlayer mediaPlayer) {
        this.f37033a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f37033a.release();
        return Unit.f93236a;
    }
}
