package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.w2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class MetadataRenderer extends BaseRenderer implements Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 0;
    private static final String TAG = "MetadataRenderer";
    private final MetadataInputBuffer buffer;

    @Nullable
    private MetadataDecoder decoder;
    private final MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final MetadataOutput output;

    @Nullable
    private final Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;

    @Nullable
    private Metadata pendingMetadata;
    private long subsampleOffsetUs;

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper) {
        this(metadataOutput, looper, MetadataDecoderFactory.DEFAULT);
    }

    private void decodeWrappedMetadata(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            Format wrappedMetadataFormat = metadata.get(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                list.add(metadata.get(i10));
            } else {
                MetadataDecoder metadataDecoderCreateDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) Assertions.checkNotNull(metadata.get(i10).getWrappedMetadataBytes());
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ((ByteBuffer) Util.castNonNull(this.buffer.data)).put(bArr);
                this.buffer.flip();
                Metadata metadataDecode = metadataDecoderCreateDecoder.decode(this.buffer);
                if (metadataDecode != null) {
                    decodeWrappedMetadata(metadataDecode, list);
                }
            }
        }
    }

    private long getPresentationTimeUs(long j10) {
        Assertions.checkState(j10 != -9223372036854775807L);
        Assertions.checkState(this.outputStreamOffsetUs != -9223372036854775807L);
        return j10 - this.outputStreamOffsetUs;
    }

    private void invokeRenderer(Metadata metadata) {
        Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    private boolean outputMetadata(long j10) {
        boolean z10;
        Metadata metadata = this.pendingMetadata;
        if (metadata == null || (!this.outputMetadataEarly && metadata.presentationTimeUs > getPresentationTimeUs(j10))) {
            z10 = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z10 = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z10;
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.buffer, 0);
        if (source != -4) {
            if (source == -5) {
                this.subsampleOffsetUs = ((Format) Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
            }
        } else {
            if (this.buffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return;
            }
            MetadataInputBuffer metadataInputBuffer = this.buffer;
            metadataInputBuffer.subsampleOffsetUs = this.subsampleOffsetUs;
            metadataInputBuffer.flip();
            Metadata metadataDecode = ((MetadataDecoder) Util.castNonNull(this.decoder)).decode(this.buffer);
            if (metadataDecode != null) {
                ArrayList arrayList = new ArrayList(metadataDecode.length());
                decodeWrappedMetadata(metadataDecode, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new Metadata(getPresentationTimeUs(this.buffer.timeUs), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return TAG;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        invokeRendererInternal((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onPositionReset(long j10, boolean z10) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    protected void onStreamChanged(Format[] formatArr, long j10, long j11) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j11);
        }
        this.outputStreamOffsetUs = j11;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j10, long j11) {
        boolean zOutputMetadata = true;
        while (zOutputMetadata) {
            readMetadata();
            zOutputMetadata = outputMetadata(j10);
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsFormat(Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return w2.a(format.cryptoType == 0 ? 4 : 2);
        }
        return w2.a(0);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper, MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(MetadataOutput metadataOutput, @Nullable Looper looper, MetadataDecoderFactory metadataDecoderFactory, boolean z10) {
        super(5);
        this.output = (MetadataOutput) Assertions.checkNotNull(metadataOutput);
        this.outputHandler = looper == null ? null : Util.createHandler(looper, this);
        this.decoderFactory = (MetadataDecoderFactory) Assertions.checkNotNull(metadataDecoderFactory);
        this.outputMetadataEarly = z10;
        this.buffer = new MetadataInputBuffer();
        this.outputStreamOffsetUs = -9223372036854775807L;
    }
}
