package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String TAG = "MediaCodecUtil";
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    private static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z10, boolean z11) {
            this.mimeType = str;
            this.secure = z10;
            this.tunneling = z11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.mimeType.hashCode() + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i10);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    private static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    @RequiresApi(21)
    private static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;

        @Nullable
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z10, boolean z11) {
            this.codecKind = (z10 || z11) ? 1 : 0;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i10) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ScoreProvider<T> {
        int getScore(T t10);
    }

    private MediaCodecUtil() {
    }

    public static /* synthetic */ int a(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if ("audio/raw".equals(str)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.g
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(Object obj) {
                    return MediaCodecUtil.b((MediaCodecInfo) obj);
                }
            });
        }
        int i10 = Util.SDK_INT;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.h
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                    public final int getScore(Object obj) {
                        return MediaCodecUtil.c((MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int av1LevelNumberToConst(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static /* synthetic */ int b(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int c(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    @VisibleForTesting
    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    public static /* synthetic */ int d(Format format, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(format) ? 1 : 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    private static Integer dolbyVisionStringToLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b10 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b10 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b10 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b10 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b10 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b10 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b10 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b10 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b10 = 8;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b10 = 9;
                }
                break;
            case 1568:
                if (str.equals(Protocol.VAST_4_1)) {
                    b10 = 10;
                }
                break;
            case 1569:
                if (str.equals(Protocol.VAST_4_1_WRAPPER)) {
                    b10 = Ascii.VT;
                }
                break;
            case 1570:
                if (str.equals(Protocol.VAST_4_2)) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
        }
        return null;
    }

    @Nullable
    private static Integer dolbyVisionStringToProfile(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if ("audio/eac3-joc".equals(format.sampleMimeType)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i10;
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                Log.w(TAG, "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                Log.w(TAG, "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i10 = colorInfo.colorTransfer) == 7 || i10 == 6)) ? 2 : 4096 : 1;
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i12);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i14), Integer.valueOf(iAv1LevelNumberToConst));
            }
            Log.w(TAG, "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i11);
            if (iAvcProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown AVC profile: " + i11);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i10);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            Log.w(TAG, "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "av01":
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case "avc1":
            case "avc2":
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case "hev1":
            case "hvc1":
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case "mp4a":
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case "vp09":
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z10, z11);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z10, boolean z11) throws DecoderQueryException {
        try {
            CodecKey codecKey = new CodecKey(str, z10, z11);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            int i10 = Util.SDK_INT;
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, i10 >= 21 ? new MediaCodecListCompatV21(z10, z11) : new MediaCodecListCompatV16());
            if (z10 && decoderInfosInternal.isEmpty() && 21 <= i10 && i10 <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    Log.w(TAG, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).name);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
            map.put(codecKey, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[PHI: r16
  0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> getDecoderInfosInternal(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.CodecKey r19, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat r20) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.getDecoderInfosInternal(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$CodecKey, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$MediaCodecListCompat):java.util.ArrayList");
    }

    @CheckResult
    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.i
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.d(format, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static MediaCodecInfo getDecryptOnlyDecoderInfo() throws DecoderQueryException {
        return getDecoderInfo("audio/raw", false, false);
    }

    @Nullable
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            Log.w(TAG, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        Log.w(TAG, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                Log.w(TAG, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i10 = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i10), numHevcCodecStringToProfileLevel);
        }
        Log.w(TAG, "Unknown HEVC level string: " + str2);
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i10);
            if (iVp9ProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown VP9 profile: " + i10);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i11);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            Log.w(TAG, "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    private static Integer hevcCodecStringToProfileLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = Ascii.VT;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = Ascii.FF;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = Ascii.SO;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = Ascii.SI;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = Ascii.SYN;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b10 = Ascii.ETB;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = Ascii.EM;
                }
                break;
        }
        switch (b10) {
        }
        return null;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    @RequiresApi(29)
    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = Util.SDK_INT;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return Util.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    @RequiresApi(29)
    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    @RequiresApi(29)
    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    @RequiresApi(29)
    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.SDK_INT >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static int mp4aAudioObjectTypeToProfile(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.a(scoreProvider, obj, obj2);
            }
        });
    }

    private static int vp9LevelNumberToConst(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void warmDecoderInfoCache(String str, boolean z10, boolean z11) {
        try {
            getDecoderInfos(str, z10, z11);
        } catch (DecoderQueryException e10) {
            Log.e(TAG, "Codec warming failed", e10);
        }
    }
}
