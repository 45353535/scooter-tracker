package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned r17, @androidx.annotation.Nullable java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.SubripParser.buildCue(android.text.Spanned, java.lang.String):androidx.media3.common.text.Cue");
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : Charsets.UTF_8;
    }

    @VisibleForTesting(otherwise = 2)
    public static float getFractionalPositionForAnchorType(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return END_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        e.a(this, bArr, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return e.b(this, bArr, i10, i11);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public /* synthetic */ void reset() {
        e.c(this);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i10, int i11, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        long j10;
        String line;
        String str;
        this.parsableByteArray.reset(bArr, i10 + i11);
        this.parsableByteArray.setPosition(i10);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (outputOptions.startTimeUs == -9223372036854775807L || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line2 == null) {
                break;
            }
            if (line2.length() != 0) {
                try {
                    Integer.parseInt(line2);
                    line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    Log.w(TAG, "Skipping invalid index: " + line2);
                }
                if (line == null) {
                    Log.w(TAG, "Unexpected end");
                    break;
                }
                Matcher matcher = SUBRIP_TIMING_LINE.matcher(line);
                if (matcher.matches()) {
                    long timecode = parseTimecode(matcher, 1);
                    long timecode2 = parseTimecode(matcher, 6);
                    int i12 = 0;
                    this.textBuilder.setLength(0);
                    this.tags.clear();
                    String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    while (!TextUtils.isEmpty(line3)) {
                        if (this.textBuilder.length() > 0) {
                            this.textBuilder.append("<br>");
                        }
                        this.textBuilder.append(processLine(line3, this.tags));
                        line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
                    while (true) {
                        if (i12 >= this.tags.size()) {
                            str = null;
                            break;
                        }
                        str = this.tags.get(i12);
                        if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = outputOptions.startTimeUs;
                    if (j12 == j10 || timecode >= j12) {
                        consumer.accept(new CuesWithTiming(ImmutableList.of(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                    } else if (arrayList != null) {
                        arrayList.add(new CuesWithTiming(ImmutableList.of(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                    }
                } else {
                    j10 = j11;
                    Log.w(TAG, "Skipping invalid timing: " + line);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }
}
