package com.mbridge.msdk.playercommon.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes10.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i10, int i11, int i12) {
            super("Unhandled format: " + i10 + " Hz, " + i11 + " channels in encoding " + i12);
        }
    }

    boolean configure(int i10, int i11, int i12) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
