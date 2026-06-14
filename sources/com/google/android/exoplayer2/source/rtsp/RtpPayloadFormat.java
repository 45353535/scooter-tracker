package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class RtpPayloadFormat {
    private static final String RTP_MEDIA_AC3 = "AC3";
    private static final String RTP_MEDIA_H264 = "H264";
    private static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    public final int clockRate;
    public final ImmutableMap<String, String> fmtpParameters;
    public final Format format;
    public final int rtpPayloadType;

    public RtpPayloadFormat(Format format, int i10, int i11, Map<String, String> map) {
        this.rtpPayloadType = i10;
        this.clockRate = i11;
        this.format = format;
        this.fmtpParameters = ImmutableMap.copyOf((Map) map);
    }

    public static String getMimeTypeFromRtpMediaType(String str) {
        String upperCase = Ascii.toUpperCase(str);
        upperCase.getClass();
        switch (upperCase) {
            case "MPEG4-GENERIC":
                return "audio/mp4a-latm";
            case "AC3":
                return "audio/ac3";
            case "H264":
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean isFormatSupported(MediaDescription mediaDescription) {
        String upperCase = Ascii.toUpperCase(mediaDescription.rtpMapAttribute.mediaEncoding);
        upperCase.getClass();
        switch (upperCase) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RtpPayloadFormat.class == obj.getClass()) {
            RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
            if (this.rtpPayloadType == rtpPayloadFormat.rtpPayloadType && this.clockRate == rtpPayloadFormat.clockRate && this.format.equals(rtpPayloadFormat.format) && this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.rtpPayloadType) * 31) + this.clockRate) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode();
    }
}
