package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {
    private static final int BOX_HEADER_SIZE = 8;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final ParsableByteArray sampleData;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.sampleData = new ParsableByteArray();
    }

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i10) throws SubtitleDecoderException {
        CharSequence cueText = null;
        Cue.Builder cueSettingsList = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int i11 = parsableByteArray.readInt();
            int i12 = parsableByteArray.readInt();
            int i13 = i11 - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i13);
            parsableByteArray.skipBytes(i13);
            i10 = (i10 - 8) - i13;
            if (i12 == TYPE_sttg) {
                cueSettingsList = WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i12 == TYPE_payl) {
                cueText = WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
            }
        }
        if (cueText == null) {
            cueText = "";
        }
        return cueSettingsList != null ? cueSettingsList.setText(cueText).build() : WebvttCueParser.newCueForText(cueText);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.sampleData.reset(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.sampleData.bytesLeft() > 0) {
            if (this.sampleData.bytesLeft() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int i11 = this.sampleData.readInt();
            if (this.sampleData.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.sampleData, i11 - 8));
            } else {
                this.sampleData.skipBytes(i11 - 8);
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
