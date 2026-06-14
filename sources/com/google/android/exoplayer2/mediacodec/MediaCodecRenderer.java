package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.FrameworkCryptoConfig;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;

    @Nullable
    private C2Mp3TimestampTracker c2Mp3TimestampTracker;

    @Nullable
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;

    @Nullable
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @Nullable
    private MediaCodecInfo codecInfo;

    @Nullable
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;

    @Nullable
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed;
    private final ArrayList<Long> decodeOnlyPresentationTimestamps;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;

    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;

    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;

    @Nullable
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;

    @Nullable
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;

    @Nullable
    private ExoPlaybackException pendingPlaybackException;

    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;

    @Nullable
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;

    @RequiresApi(31)
    private static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
        }
    }

    private static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j10, long j11, long j12) {
            this.previousStreamLastBufferTimeUs = j10;
            this.startPositionUs = j11;
            this.streamOffsetUs = j12;
        }
    }

    public MediaCodecRenderer(int i10, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z10, float f10) {
        super(i10);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z10;
        this.assumedMinimumCodecOperatingRate = f10;
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.decodeOnlyPresentationTimestamps = new ArrayList<>();
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = -9223372036854775807L;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    private void bypassRead() throws ExoPlaybackException {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int source = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source != -4) {
                if (source != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.bypassSampleBuffer.isEndOfStream()) {
                    this.inputStreamEnded = true;
                    return;
                }
                if (this.waitingForFirstSampleInFormat) {
                    Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                    this.outputFormat = format;
                    onOutputFormatChanged(format, null);
                    this.waitingForFirstSampleInFormat = false;
                }
                this.bypassSampleBuffer.flip();
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean bypassRender(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            z10 = false;
            if (!processOutputBuffer(j10, j11, null, batchBuffer.data, this.outputIndex, 0, batchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), this.bypassBatchBuffer.isDecodeOnly(), this.bypassBatchBuffer.isEndOfStream(), this.outputFormat)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        } else {
            z10 = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z10;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z10;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z10;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z10;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z10;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i10 = Util.SDK_INT;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Util.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        if (Util.SDK_INT >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER)) {
            return false;
        }
        String str2 = Util.DEVICE;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i10 = Util.SDK_INT;
        if (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i10 > 19) {
            return false;
        }
        String str2 = Util.DEVICE;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        int i10 = Util.SDK_INT;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure;
        }
        return true;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i10 = Util.SDK_INT;
        if (i10 < 18) {
            return true;
        }
        if (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i10 == 19 && Util.MODEL.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        return Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    @TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBufferIndex;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    iDequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.codec.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                this.codec.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.codecNeedsEosBufferTimestampWorkaround) {
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.largestQueuedPresentationTimeUs;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.isDecodeOnlyOutputBuffer = isDecodeOnlyBuffer(this.outputBufferInfo.presentationTimeUs);
            long j13 = this.lastBufferInStreamPresentationTimeUs;
            long j14 = this.outputBufferInfo.presentationTimeUs;
            this.isLastOutputBuffer = j13 == j14;
            updateOutputFormatForTime(j14);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                MediaCodecAdapter mediaCodecAdapter = this.codec;
                ByteBuffer byteBuffer2 = this.outputBuffer;
                int i10 = this.outputIndex;
                MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
                z10 = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(j10, j11, mediaCodecAdapter, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            MediaCodecAdapter mediaCodecAdapter2 = this.codec;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i11 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo5 = this.outputBufferInfo;
            zProcessOutputBuffer = processOutputBuffer(j10, j11, mediaCodecAdapter2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z11 = (this.outputBufferInfo.flags & 4) != 0 ? true : z10;
            resetOutputBuffer();
            if (!z11) {
                return true;
            }
            processEndOfStream();
        }
        return z10;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        FrameworkCryptoConfig frameworkCryptoConfig;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || !drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || Util.SDK_INT < 23) {
            return true;
        }
        UUID uuid = C.PLAYREADY_UUID;
        if (uuid.equals(drmSession.getSchemeUuid()) || uuid.equals(drmSession2.getSchemeUuid()) || (frameworkCryptoConfig = getFrameworkCryptoConfig(drmSession2)) == null) {
            return true;
        }
        return !mediaCodecInfo.secure && (frameworkCryptoConfig.forceAllowInsecureDecoderComponents ? false : drmSession2.requiresSecureDecoder(format.sampleMimeType));
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int i10;
        if (this.codec == null || (i10 = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i10 == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        if (this.inputIndex < 0) {
            int iDequeueInputBufferIndex = this.codec.dequeueInputBufferIndex();
            this.inputIndex = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = this.codec.getInputBuffer(iDequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i11 = 0; i11 < this.codecInputFormat.initializationData.size(); i11++) {
                this.buffer.data.put(this.codecInputFormat.initializationData.get(i11));
            }
            this.codecReconfigurationState = 2;
        }
        int iPosition = this.buffer.data.position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int source = readSource(formatHolder, this.buffer, 0);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            if (source == -3) {
                return false;
            }
            if (source == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw createRendererException(e10, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e10.getErrorCode()));
                }
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.buffer.isEncrypted();
            if (zIsEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.codecNeedsDiscardToSpsWorkaround && !zIsEncrypted) {
                NalUnitUtil.discardToSps(this.buffer.data);
                if (this.buffer.data.position() == 0) {
                    return true;
                }
                this.codecNeedsDiscardToSpsWorkaround = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            long jUpdateAndGetPresentationTimeUs = decoderInputBuffer.timeUs;
            C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
            if (c2Mp3TimestampTracker != null) {
                jUpdateAndGetPresentationTimeUs = c2Mp3TimestampTracker.updateAndGetPresentationTimeUs(this.inputFormat, decoderInputBuffer);
                this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.c2Mp3TimestampTracker.getLastOutputBufferPresentationTimeUs(this.inputFormat));
            }
            long j10 = jUpdateAndGetPresentationTimeUs;
            if (this.buffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j10));
            }
            if (this.waitingForFirstSampleInFormat) {
                if (this.pendingOutputStreamChanges.isEmpty()) {
                    this.outputStreamInfo.formatQueue.add(j10, this.inputFormat);
                } else {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j10, this.inputFormat);
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j10);
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            try {
                if (zIsEncrypted) {
                    this.codec.queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j10, 0);
                } else {
                    this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j10, 0);
                }
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                this.codecReconfigurationState = 0;
                this.decoderCounters.queuedInputBufferCount++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw createRendererException(e11, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e11.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            onCodecError(e12);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            this.codec.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, z10);
        if (!decoderInfos.isEmpty() || !z10) {
            return decoderInfos;
        }
        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, false);
        if (!decoderInfos2.isEmpty()) {
            Log.w(TAG, "Drm session requires secure decoder for " + this.inputFormat.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos2 + ".");
        }
        return decoderInfos2;
    }

    @Nullable
    private FrameworkCryptoConfig getFrameworkCryptoConfig(DrmSession drmSession) throws ExoPlaybackException {
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig == null || (cryptoConfig instanceof FrameworkCryptoConfig)) {
            return (FrameworkCryptoConfig) cryptoConfig;
        }
        throw createRendererException(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.inputFormat, 6001);
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) throws Exception {
        String str = mediaCodecInfo.name;
        int i10 = Util.SDK_INT;
        float codecOperatingRateV23 = i10 < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, this.inputFormat, getStreamFormats());
        float f10 = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, this.inputFormat, mediaCrypto, f10);
        if (i10 >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            this.codec = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            TraceUtil.endSection();
            float f11 = f10;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(this.inputFormat)) {
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(this.inputFormat), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f11;
            this.codecInputFormat = this.inputFormat;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, this.codecInputFormat);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str, this.codecInputFormat);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (this.codec.needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if ("c2.android.mp3.decoder".equals(mediaCodecInfo.name)) {
                this.c2Mp3TimestampTracker = new C2Mp3TimestampTracker();
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = SystemClock.elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            TraceUtil.endSection();
            throw th2;
        }
    }

    private boolean isDecodeOnlyBuffer(long j10) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.decodeOnlyPresentationTimestamps.get(i10).longValue() == j10) {
                this.decodeOnlyPresentationTimestamps.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeInitCodecWithFallback(android.media.MediaCrypto r8, boolean r9) throws com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException {
        /*
            r7 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.getAvailableCodecInfos(r9)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r2.<init>()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r7.availableCodecInfos = r2     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            boolean r3 = r7.enableDecoderFallback     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            r2.add(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
        L2c:
            r7.preferredDecoderInitializationException = r1     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L18
            goto L3a
        L2f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r1 = r7.inputFormat
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L3a:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb6
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r0 = r7.availableCodecInfos
            java.lang.Object r0 = r0.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r0 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r0
        L4a:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r2 = r7.codec
            if (r2 != 0) goto Lb3
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            java.lang.Object r2 = r2.peekFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r2 = (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r2
            boolean r3 = r7.shouldInitCodec(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.google.android.exoplayer2.util.Log.w(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.util.Log.w(r4, r5, r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r4 = r7.availableCodecInfos
            r4.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r5 = r7.inputFormat
            r4.<init>(r5, r3, r9, r2)
            r7.onCodecError(r4)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = r7.preferredDecoderInitializationException
            if (r2 != 0) goto La1
            r7.preferredDecoderInitializationException = r4
            goto La7
        La1:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.access$000(r2, r4)
            r7.preferredDecoderInitializationException = r2
        La7:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> r2 = r7.availableCodecInfos
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            goto L4a
        Lb0:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = r7.preferredDecoderInitializationException
            throw r8
        Lb3:
            r7.availableCodecInfos = r1
            return
        Lb6:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.Format r0 = r7.inputFormat
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.maybeInitCodecWithFallback(android.media.MediaCrypto, boolean):void");
    }

    @TargetApi(23)
    private void processEndOfStream() throws ExoPlaybackException {
        int i10 = this.codecDrainAction;
        if (i10 == 1) {
            flushCodec();
            return;
        }
        if (i10 == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i10 == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private boolean readSourceOmittingSampleData(int i10) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int source = readSource(formatHolder, this.noDataBuffer, i10 | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setCodecDrmSession(@Nullable DrmSession drmSession) {
        com.google.android.exoplayer2.drm.i.b(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        long j10 = outputStreamInfo.streamOffsetUs;
        if (j10 != -9223372036854775807L) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(j10);
        }
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        com.google.android.exoplayer2.drm.i.b(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueRendering(long j10) {
        return this.renderTimeLimitMs == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.renderTimeLimitMs;
    }

    protected static boolean supportsFormatDrm(Format format) {
        int i10 = format.cryptoType;
        return i10 == 0 || i10 == 2;
    }

    @RequiresApi(23)
    private void updateDrmSessionV23() throws ExoPlaybackException {
        try {
            this.mediaCrypto.setMediaDrmSession(getFrameworkCryptoConfig(this.sourceDrmSession).sessionId);
            setCodecDrmSession(this.sourceDrmSession);
            this.codecDrainState = 0;
            this.codecDrainAction = 0;
        } catch (MediaCryptoException e10) {
            throw createRendererException(e10, this.inputFormat, 6006);
        }
    }

    protected DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    protected MediaCodecDecoderException createDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th2, mediaCodecInfo);
    }

    protected final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    protected boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i10 = this.codecDrainAction;
        if (i10 == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i10 == 2) {
            int i11 = Util.SDK_INT;
            Assertions.checkState(i11 >= 23);
            if (i11 >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ExoPlaybackException e10) {
                    Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e10);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    @Nullable
    protected final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    @Nullable
    protected final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    protected boolean getCodecNeedsEosPropagation() {
        return false;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    protected float getCodecOperatingRateV23(float f10, Format format, Format[] formatArr) {
        return -1.0f;
    }

    @Nullable
    protected final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    protected abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    protected abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f10);

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        if (this.inputFormat == null) {
            return false;
        }
        if (isSourceReady() || hasOutputBuffer()) {
            return true;
        }
        return this.codecHotswapDeadlineMs != -9223372036854775807L && SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs;
    }

    protected final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (this.sourceDrmSession == null && shouldUseBypass(format)) {
            initBypass(this.inputFormat);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        String str = this.inputFormat.sampleMimeType;
        DrmSession drmSession = this.codecDrmSession;
        if (drmSession != null) {
            if (this.mediaCrypto == null) {
                FrameworkCryptoConfig frameworkCryptoConfig = getFrameworkCryptoConfig(drmSession);
                if (frameworkCryptoConfig != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
                        this.mediaCrypto = mediaCrypto;
                        this.mediaCryptoRequiresSecureDecoder = !frameworkCryptoConfig.forceAllowInsecureDecoderComponents && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw createRendererException(e10, this.inputFormat, 6006);
                    }
                } else if (this.codecDrmSession.getError() == null) {
                    return;
                }
            }
            if (FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
                int state = this.codecDrmSession.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(this.codecDrmSession.getError());
                    throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            maybeInitCodecWithFallback(this.mediaCrypto, this.mediaCryptoRequiresSecureDecoder);
        } catch (DecoderInitializationException e11) {
            throw createRendererException(e11, this.inputFormat, 4001);
        }
    }

    protected void onCodecError(Exception exc) {
    }

    protected void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j10, long j11) {
    }

    protected void onCodecReleased(String str) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onEnabled(boolean z10, boolean z11) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onInputFormatChanged(com.google.android.exoplayer2.FormatHolder):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    protected void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    protected void onOutputStreamOffsetUsChanged(long j10) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @CallSuper
    protected void onProcessedOutputBuffer(long j10) {
        this.lastProcessedOutputBufferTimeUs = j10;
        while (!this.pendingOutputStreamChanges.isEmpty() && j10 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo(this.pendingOutputStreamChanges.poll());
            onProcessedStreamChange();
        }
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStopped() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onStreamChanged(com.google.android.exoplayer2.Format[] r13, long r14, long r16) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r12 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.outputStreamInfo
            long r0 = r13.streamOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.setOutputStreamInfo(r4)
            return
        L1e:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r13 = r12.pendingOutputStreamChanges
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.largestQueuedPresentationTimeUs
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.lastProcessedOutputBufferTimeUs
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.outputStreamInfo
            long r13 = r13.streamOffsetUs
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.onProcessedStreamChange()
        L51:
            return
        L52:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo> r13 = r12.pendingOutputStreamChanges
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r6 = r12.largestQueuedPresentationTimeUs
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onStreamChanged(com.google.android.exoplayer2.Format[], long, long):void");
    }

    protected abstract boolean processOutputBuffer(long j10, long j11, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException;

    protected void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(this.codecInfo.name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j10, j11)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j10, j11) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j10);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (IllegalStateException e10) {
            if (!isMediaCodecException(e10)) {
                throw e10;
            }
            onCodecError(e10);
            if (Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e10)) {
                z10 = true;
            }
            if (z10) {
                releaseCodec();
            }
            throw createRendererException(createDecoderException(e10, getCodecInfo()), this.inputFormat, z10, 4003);
        }
    }

    protected void renderToEndOfStream() throws ExoPlaybackException {
    }

    @CallSuper
    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.lastProcessedOutputBufferTimeUs = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.c2Mp3TimestampTracker;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.reset();
        }
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    @CallSuper
    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.c2Mp3TimestampTracker = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
        this.mediaCryptoRequiresSecureDecoder = false;
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    protected final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        this.currentPlaybackSpeed = f10;
        this.targetPlaybackSpeed = f11;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void setRenderTimeLimitMs(long j10) {
        this.renderTimeLimitMs = j10;
    }

    protected boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw createRendererException(e10, format, 4002);
        }
    }

    protected abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    protected final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    protected final void updateOutputFormatForTime(long j10) throws ExoPlaybackException {
        Format formatPollFloor = this.outputStreamInfo.formatQueue.pollFloor(j10);
        if (formatPollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            formatPollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        onOutputFormatChanged(this.outputFormat, this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    private boolean updateCodecOperatingRate(Format format) throws ExoPlaybackException {
        if (Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
            float f10 = this.codecOperatingRate;
            if (f10 == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f10 == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            this.codec.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + format, th2, format.sampleMimeType, z10, null, buildCustomDiagnosticInfo(i10), null);
        }

        private static String buildCustomDiagnosticInfo(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        @Nullable
        @RequiresApi(21)
        private static String getDiagnosticInfoV21(@Nullable Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z10, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th2, format.sampleMimeType, z10, mediaCodecInfo, Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th2) : null, null);
        }

        private DecoderInitializationException(String str, @Nullable Throwable th2, String str2, boolean z10, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
