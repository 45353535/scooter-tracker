package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static void a(SubtitleParser subtitleParser, byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        subtitleParser.parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    public static Subtitle b(SubtitleParser subtitleParser, byte[] bArr, int i10, int i11) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        SubtitleParser.OutputOptions outputOptions = SubtitleParser.OutputOptions.ALL;
        Objects.requireNonNull(builder);
        subtitleParser.parse(bArr, i10, i11, outputOptions, new Consumer() { // from class: androidx.media3.extractor.text.d
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                builder.add((CuesWithTiming) obj);
            }
        });
        return new CuesWithTimingSubtitle(builder.build());
    }

    public static void c(SubtitleParser subtitleParser) {
    }
}
