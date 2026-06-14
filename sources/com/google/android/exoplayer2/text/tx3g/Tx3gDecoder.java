package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final String TAG = "Tx3gDecoder";
    private static final String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = 1937013100;
    private static final int TYPE_TBOX = 1952608120;
    private final int calculatedVideoTrackHeight;
    private final boolean customVerticalPlacement;
    private final int defaultColorRgba;
    private final int defaultFontFace;
    private final String defaultFontFamily;
    private final float defaultVerticalPlacement;
    private final ParsableByteArray parsableByteArray;

    public Tx3gDecoder(List<byte[]> list) {
        super(TAG);
        this.parsableByteArray = new ParsableByteArray();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.defaultFontFace = 0;
            this.defaultColorRgba = -1;
            this.defaultFontFamily = "sans-serif";
            this.customVerticalPlacement = false;
            this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
            this.calculatedVideoTrackHeight = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.defaultFontFace = bArr[24];
        this.defaultColorRgba = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.defaultFontFamily = TX3G_SERIF.equals(Util.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * Ascii.DC4;
        this.calculatedVideoTrackHeight = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.customVerticalPlacement = z10;
        if (z10) {
            this.defaultVerticalPlacement = Util.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
        }
    }

    private void applyStyleRecord(ParsableByteArray parsableByteArray, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        assertTrue(parsableByteArray.bytesLeft() >= 12);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int i10 = parsableByteArray.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            Log.w(TAG, "Truncating styl end (" + unsignedShort2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            unsignedShort2 = spannableStringBuilder.length();
        }
        int i11 = unsignedShort2;
        if (unsignedShort < i11) {
            attachFontFace(spannableStringBuilder, unsignedByte, this.defaultFontFace, unsignedShort, i11, 0);
            attachColor(spannableStringBuilder, i10, this.defaultColorRgba, unsignedShort, i11, 0);
            return;
        }
        Log.w(TAG, "Ignoring styl with start (" + unsignedShort + ") >= end (" + i11 + ").");
    }

    private static void assertTrue(boolean z10) throws SubtitleDecoderException {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void attachColor(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String readSubtitleText(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        assertTrue(parsableByteArray.bytesLeft() >= 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        int position = parsableByteArray.getPosition();
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        int position2 = unsignedShort - (parsableByteArray.getPosition() - position);
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = Charsets.UTF_8;
        }
        return parsableByteArray.readString(position2, utfCharsetFromBom);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.parsableByteArray.reset(bArr, i10);
        String subtitleText = readSubtitleText(this.parsableByteArray);
        if (subtitleText.isEmpty()) {
            return Tx3gSubtitle.EMPTY;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subtitleText);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachFontFamily(spannableStringBuilder, this.defaultFontFamily, 0, spannableStringBuilder.length());
        float fConstrainValue = this.defaultVerticalPlacement;
        while (this.parsableByteArray.bytesLeft() >= 8) {
            int position = this.parsableByteArray.getPosition();
            int i11 = this.parsableByteArray.readInt();
            int i12 = this.parsableByteArray.readInt();
            if (i12 == TYPE_STYL) {
                assertTrue(this.parsableByteArray.bytesLeft() >= 2);
                int unsignedShort = this.parsableByteArray.readUnsignedShort();
                for (int i13 = 0; i13 < unsignedShort; i13++) {
                    applyStyleRecord(this.parsableByteArray, spannableStringBuilder);
                }
            } else if (i12 == TYPE_TBOX && this.customVerticalPlacement) {
                assertTrue(this.parsableByteArray.bytesLeft() >= 2);
                fConstrainValue = Util.constrainValue(this.parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, 0.0f, 0.95f);
            }
            this.parsableByteArray.setPosition(position + i11);
        }
        return new Tx3gSubtitle(new Cue.Builder().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }
}
