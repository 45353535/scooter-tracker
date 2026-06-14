package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C4240b4;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class ui1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f116662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f116663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f116665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f116666h;

    public ui1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f116659a = (String) fi.a((Object) str);
        this.f116660b = str2;
        this.f116661c = str3;
        this.f116662d = codecCapabilities;
        this.f116665g = z10;
        this.f116663e = z11;
        this.f116664f = z12;
        this.f116666h = tr1.f(str2);
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116662d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = w83.f117341a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(yv0 yv0Var) {
        if (this.f116666h) {
            return this.f116663e;
        }
        Pair pairB = ij1.b(yv0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f116659a;
    }

    public final ia0 a(yv0 yv0Var, yv0 yv0Var2) {
        yv0 yv0Var3;
        yv0 yv0Var4;
        int i10 = !w83.a(yv0Var.f118398m, yv0Var2.f118398m) ? 8 : 0;
        if (this.f116666h) {
            if (yv0Var.f118406u != yv0Var2.f118406u) {
                i10 |= 1024;
            }
            if (!this.f116663e && (yv0Var.f118403r != yv0Var2.f118403r || yv0Var.f118404s != yv0Var2.f118404s)) {
                i10 |= 512;
            }
            if (!w83.a(yv0Var.f118410y, yv0Var2.f118410y)) {
                i10 |= 2048;
            }
            String str = this.f116659a;
            String str2 = w83.f117344d;
            vi1 vi1Var = li2.f113102c;
            if (str2.startsWith(vi1Var.b()) && vi1Var.a().equals(str) && !yv0Var.a(yv0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ia0(this.f116659a, yv0Var, yv0Var2, yv0Var.a(yv0Var2) ? 3 : 2, 0);
            }
            yv0Var3 = yv0Var;
            yv0Var4 = yv0Var2;
        } else {
            yv0Var3 = yv0Var;
            yv0Var4 = yv0Var2;
            if (yv0Var3.f118411z != yv0Var4.f118411z) {
                i10 |= 4096;
            }
            if (yv0Var3.A != yv0Var4.A) {
                i10 |= 8192;
            }
            if (yv0Var3.B != yv0Var4.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f116660b)) {
                Pair pairB = ij1.b(yv0Var3);
                Pair pairB2 = ij1.b(yv0Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ia0(this.f116659a, yv0Var3, yv0Var4, 3, 0);
                    }
                }
            }
            if (!yv0Var3.a(yv0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f116660b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ia0(this.f116659a, yv0Var3, yv0Var4, 1, 0);
            }
        }
        return new ia0(this.f116659a, yv0Var3, yv0Var4, 0, i10);
    }

    public final boolean a(yv0 yv0Var) {
        int i10;
        Pair pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f116660b.equals(yv0Var.f118398m) && !this.f116660b.equals(ij1.a(yv0Var))) {
            return false;
        }
        int i11 = 16;
        if (yv0Var.f118395j != null && (pairB = ij1.b(yv0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(yv0Var.f118398m)) {
                if ("video/avc".equals(this.f116660b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f116660b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f116666h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116662d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (w83.f117341a <= 23 && "video/x-vnd.on2.vp9".equals(this.f116660b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f116662d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i12 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        if ("video/hevc".equals(this.f116660b) && 2 == iIntValue) {
                            byte[] bArrDecode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = Charsets.UTF_8;
                            String str = new String(bArrDecode, charset);
                            String str2 = w83.f117342b;
                            if (str.equals(str2) || new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + yv0Var.f118395j + ", " + this.f116661c);
                return false;
            }
        }
        if (this.f116666h) {
            int i13 = yv0Var.f118403r;
            if (i13 <= 0 || (i10 = yv0Var.f118404s) <= 0) {
                return true;
            }
            if (w83.f117341a >= 21) {
                return a(i13, i10, yv0Var.f118405t);
            }
            boolean z10 = i13 * i10 <= ij1.a();
            if (!z10) {
                a("legacyFrameSize, " + yv0Var.f118403r + "x" + yv0Var.f118404s);
            }
            return z10;
        }
        int i14 = w83.f117341a;
        if (i14 >= 21) {
            int i15 = yv0Var.A;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f116662d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                        a("sampleRate.support, " + i15);
                    }
                }
                return false;
            }
            int i16 = yv0Var.f118411z;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f116662d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str3 = this.f116659a;
                        String str4 = this.f116660b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                            if ("audio/ac3".equals(str4)) {
                                i11 = 6;
                            } else if (!"audio/eac3".equals(str4)) {
                                i11 = 30;
                            }
                            uf1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i11 + C4240b4.j.f42674e);
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i16) {
                            a("channelCount.support, " + i16);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116662d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = w83.f117341a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i13, i14);
        }
        if (!zIsSizeSupported) {
            if (i10 < i11) {
                String str = this.f116659a;
                byte[] bArrDecode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = Charsets.UTF_8;
                if (!new String(bArrDecode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(w83.f117342b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i11 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i10 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i15 = point2.x;
                    int i16 = point2.y;
                    if (d10 != -1.0d && d10 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d10));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i15, i16);
                    }
                    if (zIsSizeSupported2) {
                        uf1.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10) + "] [" + this.f116659a + ", " + this.f116660b + "] [" + w83.f117345e + C4240b4.j.f42674e);
                    }
                }
            }
            a("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ui1 a(java.lang.String r5, java.lang.String r6, java.lang.String r7, android.media.MediaCodecInfo.CodecCapabilities r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            yads.ui1 r5 = new yads.ui1
            r11 = 1
            r0 = 0
            if (r9 == 0) goto L68
            int r1 = yads.w83.f117341a
            r2 = 19
            if (r1 < r2) goto L68
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r9.isFeatureSupported(r2)
            if (r2 == 0) goto L68
            r2 = 22
            if (r1 > r2) goto L66
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T0RST0lELVhVMw=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r1.<init>(r2, r3)
            java.lang.String r2 = yads.w83.f117344d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L43
            java.lang.String r1 = new java.lang.String
            java.lang.String r4 = "TmV4dXMgMTA="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            r1.<init>(r4, r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L66
        L43:
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L68
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L66
            goto L68
        L66:
            r1 = r11
            goto L6a
        L68:
            r1 = r11
            r11 = r0
        L6a:
            r2 = 21
            if (r9 == 0) goto L77
            int r3 = yads.w83.f117341a
            if (r3 < r2) goto L77
            java.lang.String r3 = "tunneled-playback"
            r9.isFeatureSupported(r3)
        L77:
            if (r12 != 0) goto L8a
            if (r9 == 0) goto L88
            int r12 = yads.w83.f117341a
            if (r12 < r2) goto L88
            java.lang.String r12 = "secure-playback"
            boolean r12 = r9.isFeatureSupported(r12)
            if (r12 == 0) goto L88
            goto L8a
        L88:
            r12 = r0
            goto L8b
        L8a:
            r12 = r1
        L8b:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ui1.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):yads.ui1");
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (w83.f117341a >= 29 && "video/x-vnd.on2.vp9".equals(this.f116660b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f116662d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(String str) {
        uf1.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f116659a + ", " + this.f116660b + "] [" + w83.f117345e + C4240b4.j.f42674e);
    }
}
