package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.media.core.config.models.AdConfig;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f22746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f22747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f22748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f22749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f22750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f22751f;

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        f22746a = Pattern.compile("^\\D?(\\d+)$");
        f22747b = new HashMap();
        f22751f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22748c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f22749d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f22750e = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    public static a a(boolean z10, String str) {
        List listUnmodifiableList;
        synchronized (j.class) {
            try {
                e eVar = new e(z10, str);
                listUnmodifiableList = (List) f22747b.get(eVar);
                if (listUnmodifiableList == null) {
                    int i10 = z.f23162a;
                    ArrayList arrayListA = a(eVar, i10 >= 21 ? new i(z10) : new h());
                    if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                        arrayListA = a(eVar, new h());
                        if (!arrayListA.isEmpty()) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((a) arrayListA.get(0)).f22717a);
                        }
                    }
                    if (i10 < 26) {
                        int i11 = 1;
                        if (arrayListA.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) arrayListA.get(0)).f22717a)) {
                            while (true) {
                                if (i11 >= arrayListA.size()) {
                                    break;
                                }
                                a aVar = (a) arrayListA.get(i11);
                                if ("OMX.google.raw.decoder".equals(aVar.f22717a)) {
                                    arrayListA.remove(i11);
                                    arrayListA.add(0, aVar);
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayListA);
                    f22747b.put(eVar, listUnmodifiableList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (a) listUnmodifiableList.get(0);
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f22751f == -1) {
            int iMax = 0;
            a aVarA = a(false, "video/avc");
            if (aVarA != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aVarA.f22721e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, z.f23162a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f22751f = iMax;
        }
        return f22751f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e r16, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g r17) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g):java.util.ArrayList");
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = z.f23162a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.f23163b)) {
            return false;
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.f23163b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.f23163b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(z.f23164c)) {
            String str4 = z.f23163b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i10 <= 19 && z.f23163b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
