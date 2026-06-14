package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f37696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f37697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f37698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37699e;

    public S7(Context context, CoroutineScope coroutineScope, ExoPlayer exoPlayer, boolean z10, MutableSharedFlow playerEventsFlow) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playerEventsFlow, "playerEventsFlow");
        this.f37695a = coroutineScope;
        this.f37696b = exoPlayer;
        this.f37697c = playerEventsFlow;
        Q1 q12 = new Q1(context);
        this.f37698d = q12;
        this.f37699e = z10;
        Q7 listener = new Q7(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        q12.f37567c = new WeakReference(listener);
    }

    public final void a() {
        this.f37696b.setVolume(0.0f);
        P4.a(this.f37697c, this.f37695a, new S1(0.0f, true));
        this.f37699e = true;
    }
}
