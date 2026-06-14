package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface g extends t {
    View N();

    Object a(Continuation continuation);

    void a(String str);

    void b(boolean z10);

    StateFlow f();

    StateFlow isPlaying();

    StateFlow o();

    void pause();

    void play();

    void seekTo(long j10);
}
