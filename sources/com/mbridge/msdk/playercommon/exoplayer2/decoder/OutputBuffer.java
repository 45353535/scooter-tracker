package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OutputBuffer extends Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public abstract void release();
}
