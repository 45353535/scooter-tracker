package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: loaded from: classes10.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i10, long j10);

    boolean dispatchSetPlayWhenReady(Player player, boolean z10);

    boolean dispatchSetRepeatMode(Player player, int i10);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z10);

    boolean dispatchStop(Player player, boolean z10);
}
