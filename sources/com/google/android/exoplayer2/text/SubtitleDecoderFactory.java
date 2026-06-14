package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.text.dvb.DvbDecoder;
import com.google.android.exoplayer2.text.pgs.PgsDecoder;
import com.google.android.exoplayer2.text.ssa.SsaDecoder;
import com.google.android.exoplayer2.text.subrip.SubripDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlDecoder;
import com.google.android.exoplayer2.text.tx3g.Tx3gDecoder;
import com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.google.android.exoplayer2.text.webvtt.WebvttDecoder;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes7.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: com.google.android.exoplayer2.text.SubtitleDecoderFactory.1
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            if (str != null) {
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            b10 = 0;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            b10 = 1;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            b10 = 2;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            b10 = 3;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            b10 = 4;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            b10 = 5;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            b10 = 6;
                        }
                        break;
                    case 1201784583:
                        if (str.equals(MimeTypes.TEXT_EXOPLAYER_CUES)) {
                            b10 = 7;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            b10 = 8;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            b10 = 9;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            b10 = 10;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            b10 = Ascii.VT;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        return new DvbDecoder(format.initializationData);
                    case 1:
                        return new PgsDecoder();
                    case 2:
                        return new Mp4WebvttDecoder();
                    case 3:
                        return new WebvttDecoder();
                    case 4:
                        return new Tx3gDecoder(format.initializationData);
                    case 5:
                        return new SsaDecoder(format.initializationData);
                    case 6:
                    case 8:
                        return new Cea608Decoder(str, format.accessibilityChannel, 16000L);
                    case 7:
                        return new ExoplayerCuesDecoder();
                    case 9:
                        return new Cea708Decoder(format.accessibilityChannel, format.initializationData);
                    case 10:
                        return new SubripDecoder();
                    case 11:
                        return new TtmlDecoder();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || MimeTypes.TEXT_EXOPLAYER_CUES.equals(str);
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
