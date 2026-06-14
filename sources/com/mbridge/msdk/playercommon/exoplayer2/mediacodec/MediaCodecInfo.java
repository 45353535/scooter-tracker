package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(16)
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities capabilities;

    @Nullable
    public final String mimeType;
    public final String name;
    public final boolean passthrough;
    public final boolean secure;
    public final boolean tunneling;

    private MediaCodecInfo(String str, @Nullable String str2, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.capabilities = codecCapabilities;
        this.passthrough = z10;
        boolean z13 = false;
        this.adaptive = (z11 || codecCapabilities == null || !isAdaptive(codecCapabilities)) ? false : true;
        this.tunneling = codecCapabilities != null && isTunneling(codecCapabilities);
        if (z12 || (codecCapabilities != null && isSecure(codecCapabilities))) {
            z13 = true;
        }
        this.secure = z13;
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i10) {
        if (i10 > 1 || ((Util.SDK_INT >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C4240b4.j.f42674e);
        return i11;
    }

    @TargetApi(21)
    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        return (d10 == -1.0d || d10 <= 0.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
    }

    @TargetApi(23)
    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 19 && isAdaptiveV19(codecCapabilities);
    }

    @TargetApi(19)
    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isSecureV21(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        Log.d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + C4240b4.j.f42674e);
    }

    private void logNoSupport(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + C4240b4.j.f42674e);
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, false, false);
    }

    public static MediaCodecInfo newPassthroughInstance(String str) {
        return new MediaCodecInfo(str, null, null, true, false, false);
    }

    @TargetApi(21)
    public Point alignVideoSizeV21(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i10, widthAlignment) * widthAlignment, Util.ceilDivide(i11, heightAlignment) * heightAlignment);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public boolean isAudioChannelCountSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        logNoSupport("channelCount.support, " + i10);
        return false;
    }

    @TargetApi(21)
    public boolean isAudioSampleRateSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i10);
        return false;
    }

    public boolean isCodecSupported(String str) {
        String mediaMimeType;
        if (str == null || this.mimeType == null || (mediaMimeType = MimeTypes.getMediaMimeType(str)) == null) {
            return true;
        }
        if (!this.mimeType.equals(mediaMimeType)) {
            logNoSupport("codec.mime " + str + ", " + mediaMimeType);
            return false;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(str);
        if (codecProfileAndLevel == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
            if (codecProfileLevel.profile == ((Integer) codecProfileAndLevel.first).intValue() && codecProfileLevel.level >= ((Integer) codecProfileAndLevel.second).intValue()) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + str + ", " + mediaMimeType);
        return false;
    }

    @TargetApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (areSizeAndRateSupportedV21(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 >= i11 || !areSizeAndRateSupportedV21(videoCapabilities, i11, i10, d10)) {
            logNoSupport("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
            return false;
        }
        logAssumedSupport("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
        return true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new MediaCodecInfo(str, str2, codecCapabilities, false, z10, z11);
    }
}
