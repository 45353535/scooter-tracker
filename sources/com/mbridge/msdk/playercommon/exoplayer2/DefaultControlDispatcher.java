package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int i10, long j10) {
        player.seekTo(i10, j10);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean z10) {
        player.setPlayWhenReady(z10);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int i10) {
        player.setRepeatMode(i10);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean z10) {
        player.setShuffleModeEnabled(z10);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean z10) {
        player.stop(z10);
        return true;
    }
}
