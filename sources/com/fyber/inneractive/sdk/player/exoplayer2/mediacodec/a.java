package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C4240b4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f22721e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10) {
        str.getClass();
        this.f22717a = str;
        this.f22720d = str2;
        this.f22721e = codecCapabilities;
        boolean z11 = false;
        this.f22718b = !z10 && codecCapabilities != null && z.f23162a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && z.f23162a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z11 = true;
        }
        this.f22719c = z11;
    }

    public final boolean a(String str) {
        String strA;
        String[] strArrSplit;
        Pair pair;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        int i10 = 2;
        if (str == null || this.f22720d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.f22720d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.f22746a;
        strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        pair = null;
        switch (str2) {
            case "avc1":
            case "avc2":
                if (strArrSplit.length >= 2) {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                            numValueOf2 = numValueOf3;
                        }
                        pair = new Pair(Integer.valueOf(j.f22748c.get(numValueOf2.intValue())), Integer.valueOf(j.f22749d.get(numValueOf.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                    break;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                }
                break;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length >= 4) {
                    Matcher matcher = j.f22746a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i10 = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.f22750e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i10), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                    break;
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22721e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22721e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        b("sampleRate.support, " + i10);
        return false;
    }

    public final void b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f22717a + ", " + this.f22720d + "] [" + z.f23166e + C4240b4.j.f42674e);
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22721e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d10 != -1.0d && d10 > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i10, i11);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i10 < i11) {
            if (d10 != -1.0d && d10 > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i11, i10, d10);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i11, i10);
            }
            if (zIsSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10) + "] [" + this.f22717a + ", " + this.f22720d + "] [" + z.f23166e + C4240b4.j.f42674e);
                return true;
            }
        }
        b("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
        return false;
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22721e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = z.f23162a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i10) {
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f22721e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.f22717a;
        String str2 = this.f22720d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.f23162a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i11 = 6;
            } else {
                i11 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i11 + C4240b4.j.f42674e);
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        b("channelCount.support, " + i10);
        return false;
    }
}
