package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m1 implements ListenerSet.Event {
    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
