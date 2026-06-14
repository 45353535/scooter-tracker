package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    @Nullable
    private Extractor extractor;

    @Nullable
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(androidx.media3.common.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, androidx.media3.extractor.ExtractorOutput r15) throws java.io.IOException {
        /*
            r7 = this;
            androidx.media3.extractor.DefaultExtractorInput r1 = new androidx.media3.extractor.DefaultExtractorInput
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.extractorInput = r1
            androidx.media3.extractor.Extractor r8 = r7.extractor
            if (r8 == 0) goto Lf
            return
        Lf:
            androidx.media3.extractor.ExtractorsFactory r8 = r7.extractorsFactory
            androidx.media3.extractor.Extractor[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.extractor = r8
            goto L83
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7f
            r0 = r8[r14]
            boolean r2 = r0.sniff(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            if (r2 == 0) goto L3d
            r7.extractor = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            androidx.media3.common.util.Assertions.checkState(r13)
            r1.resetPeekPosition()
            goto L7f
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5b
        L3d:
            java.util.List r0 = r0.getSniffFailureDetails()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            r10.addAll(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            androidx.media3.extractor.Extractor r0 = r7.extractor
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r12
            goto L54
        L53:
            r0 = r13
        L54:
            androidx.media3.common.util.Assertions.checkState(r0)
            r1.resetPeekPosition()
            goto L7c
        L5b:
            androidx.media3.extractor.Extractor r9 = r7.extractor
            if (r9 != 0) goto L67
            long r9 = r1.getPosition()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L68
        L67:
            r12 = r13
        L68:
            androidx.media3.common.util.Assertions.checkState(r12)
            r1.resetPeekPosition()
            throw r8
        L6f:
            androidx.media3.extractor.Extractor r0 = r7.extractor
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7c:
            int r14 = r14 + 1
            goto L27
        L7f:
            androidx.media3.extractor.Extractor r11 = r7.extractor
            if (r11 == 0) goto L89
        L83:
            androidx.media3.extractor.Extractor r8 = r7.extractor
            r8.init(r15)
            return
        L89:
            androidx.media3.exoplayer.source.UnrecognizedInputFormatException r11 = new androidx.media3.exoplayer.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            com.google.common.base.Joiner r13 = com.google.common.base.Joiner.on(r13)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.copyOf(r8)
            androidx.media3.exoplayer.source.a r14 = new androidx.media3.exoplayer.source.a
            r14.<init>()
            java.util.List r8 = com.google.common.collect.Lists.transform(r8, r14)
            java.lang.String r8 = r13.join(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = androidx.media3.common.util.Assertions.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            com.google.common.collect.ImmutableList r10 = r10.build()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.BundledExtractorsAdapter.init(androidx.media3.common.DataReader, android.net.Uri, java.util.Map, long, long, androidx.media3.extractor.ExtractorOutput):void");
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j10, long j11) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j10, j11);
    }
}
