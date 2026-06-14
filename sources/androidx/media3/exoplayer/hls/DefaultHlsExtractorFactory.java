package androidx.media3.exoplayer.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private final boolean exposeCea608WhenMissingDeclarations;
    private boolean parseSubtitlesDuringExtraction;
    private final int payloadReaderFactoryFlags;
    private SubtitleParser.Factory subtitleParserFactory;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    private static void addFileTypeIfValidAndNotPresent(int i10, List<Integer> list) {
        if (Ints.indexOf(DEFAULT_EXTRACTOR_ORDER, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    private Extractor createExtractorByFileType(int i10, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster) {
        if (i10 == 0) {
            return new Ac3Extractor();
        }
        if (i10 == 1) {
            return new Ac4Extractor();
        }
        if (i10 == 2) {
            return new AdtsExtractor();
        }
        if (i10 == 7) {
            return new Mp3Extractor(0, 0L);
        }
        if (i10 == 8) {
            return createFragmentedMp4Extractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction, timestampAdjuster, format, list);
        }
        if (i10 == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }
        if (i10 != 13) {
            return null;
        }
        return new WebvttExtractor(format.language, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    private static FragmentedMp4Extractor createFragmentedMp4Extractor(SubtitleParser.Factory factory, boolean z10, TimestampAdjuster timestampAdjuster, Format format, @Nullable List<Format> list) {
        int i10 = isFmp4Variant(format) ? 4 : 0;
        if (!z10) {
            factory = SubtitleParser.Factory.UNSUPPORTED;
            i10 |= 32;
        }
        SubtitleParser.Factory factory2 = factory;
        int i11 = i10;
        if (list == null) {
            list = ImmutableList.of();
        }
        return new FragmentedMp4Extractor(factory2, i11, timestampAdjuster, null, list, null);
    }

    private static TsExtractor createTsExtractor(int i10, boolean z10, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster, SubtitleParser.Factory factory, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new Format.Builder().setSampleMimeType("application/cea-608").build()) : Collections.EMPTY_LIST;
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            factory = SubtitleParser.Factory.UNSUPPORTED;
            i11 = 1;
        }
        return new TsExtractor(2, i11, factory, timestampAdjuster, new DefaultTsPayloadReaderFactory(i12, list), 112800);
    }

    private static boolean isFmp4Variant(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            if (metadata.get(i10) instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean sniffQuietly(Extractor extractor, ExtractorInput extractorInput) throws IOException {
        try {
            boolean zSniff = extractor.sniff(extractorInput);
            extractorInput.resetPeekPosition();
            return zSniff;
        } catch (EOFException unused) {
            extractorInput.resetPeekPosition();
            return false;
        } catch (Throwable th2) {
            extractorInput.resetPeekPosition();
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        return createExtractor(uri, format, (List<Format>) list, timestampAdjuster, (Map<String, List<String>>) map, extractorInput, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public Format getOutputTextFormat(Format format) {
        String str;
        if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
            return format;
        }
        Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(format.sampleMimeType);
        if (format.codecs != null) {
            str = " " + format.codecs;
        } else {
            str = "";
        }
        sb2.append(str);
        return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
    }

    public DefaultHlsExtractorFactory(int i10, boolean z10) {
        this.payloadReaderFactoryFlags = i10;
        this.exposeCea608WhenMissingDeclarations = z10;
        this.subtitleParserFactory = new DefaultSubtitleParserFactory();
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public BundledHlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        int iInferFileTypeFromMimeType = FileTypes.inferFileTypeFromMimeType(format.sampleMimeType);
        int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
        int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromMimeType, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromResponseHeaders, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromUri, arrayList);
        for (int i10 : iArr) {
            addFileTypeIfValidAndNotPresent(i10, arrayList);
        }
        extractorInput.resetPeekPosition();
        Extractor extractor = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            Extractor extractor2 = (Extractor) Assertions.checkNotNull(createExtractorByFileType(iIntValue, format, list, timestampAdjuster));
            if (sniffQuietly(extractor2, extractorInput)) {
                return new BundledHlsMediaChunkExtractor(extractor2, format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
            }
            if (extractor == null && (iIntValue == iInferFileTypeFromMimeType || iIntValue == iInferFileTypeFromResponseHeaders || iIntValue == iInferFileTypeFromUri || iIntValue == 11)) {
                extractor = extractor2;
            }
        }
        return new BundledHlsMediaChunkExtractor((Extractor) Assertions.checkNotNull(extractor), format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    @CanIgnoreReturnValue
    public DefaultHlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.parseSubtitlesDuringExtraction = z10;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    @CanIgnoreReturnValue
    public DefaultHlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        return this;
    }
}
