package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = Util.createHandlerForCurrentLooper(this);
    private final EventMessageDecoder decoder = new EventMessageDecoder();

    private static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j10, long j11) {
            this.eventTimeUs = j10;
            this.manifestPublishTimeMsInEmsg = j11;
        }
    }

    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j10);

        void onDashManifestRefreshRequested();
    }

    public final class PlayerTrackEmsgHandler implements TrackOutput {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final MetadataInputBuffer buffer = new MetadataInputBuffer();
        private long maxLoadedChunkEndTimeUs = -9223372036854775807L;

        PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = SampleQueue.createWithoutDrm(allocator);
        }

        @Nullable
        private MetadataInputBuffer dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void onManifestExpiredMessageEncountered(long j10, long j11) {
            PlayerEmsgHandler.this.handler.sendMessage(PlayerEmsgHandler.this.handler.obtainMessage(1, new ManifestExpiryEventInfo(j10, j11)));
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                MetadataInputBuffer metadataInputBufferDequeueSample = dequeueSample();
                if (metadataInputBufferDequeueSample != null) {
                    long j10 = metadataInputBufferDequeueSample.timeUs;
                    Metadata metadataDecode = PlayerEmsgHandler.this.decoder.decode(metadataInputBufferDequeueSample);
                    if (metadataDecode != null) {
                        EventMessage eventMessage = (EventMessage) metadataDecode.get(0);
                        if (PlayerEmsgHandler.isPlayerEmsgEvent(eventMessage.schemeIdUri, eventMessage.value)) {
                            parsePlayerEmsgEvent(j10, eventMessage);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private void parsePlayerEmsgEvent(long j10, EventMessage eventMessage) {
            long manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(eventMessage);
            if (manifestPublishTimeMsInEmsg == -9223372036854775807L) {
                return;
            }
            onManifestExpiredMessageEncountered(j10, manifestPublishTimeMsInEmsg);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            this.sampleQueue.format(format);
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j10) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j10);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            long j10 = this.maxLoadedChunkEndTimeUs;
            if (j10 == -9223372036854775807L || chunk.endTimeUs > j10) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public boolean onChunkLoadError(Chunk chunk) {
            long j10 = this.maxLoadedChunkEndTimeUs;
            return PlayerEmsgHandler.this.onChunkLoadError(j10 != -9223372036854775807L && j10 < chunk.startTimeUs);
        }

        public void release() {
            this.sampleQueue.release();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) {
            return f.a(this, dataReader, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            this.sampleQueue.sampleMetadata(j10, i10, i11, i12, cryptoData);
            parseAndDiscardSamples();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
            f.b(this, parsableByteArray, i10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
            return this.sampleQueue.sampleData(dataReader, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
            this.sampleQueue.sampleData(parsableByteArray, i10);
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    @Nullable
    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j10) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(EventMessage eventMessage) {
        try {
            return Util.parseXsDateTime(Util.fromUtf8Bytes(eventMessage.messageData));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void handleManifestExpiredMessage(long j10, long j11) {
        Long l10 = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j11));
        if (l10 == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    boolean maybeRefreshManifestBeforeLoadingNextChunk(long j10) {
        DashManifest dashManifest = this.manifest;
        boolean z10 = false;
        if (!dashManifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(dashManifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j10) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z10 = true;
        }
        if (z10) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z10;
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.allocator);
    }

    void onChunkLoadCompleted(Chunk chunk) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    boolean onChunkLoadError(boolean z10) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z10) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    public void updateManifest(DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }
}
