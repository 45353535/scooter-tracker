package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f21946a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21947b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f21948c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f21949d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f21950e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f21951f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f21952g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f21953h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f21954i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f21955j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f21956k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f21957l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f21958m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f21959n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f21960o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f21961p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f21962q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f21963r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f21964s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f21965t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f21966u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f21967v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Multi-variable type inference failed */
    public static d b(f fVar, String str) throws r {
        String str2;
        int i10;
        int i11;
        int i12;
        f fVar2 = fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i13 = 1;
        String str3 = null;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        boolean zEquals = false;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        c cVar = null;
        String strB = null;
        String strA = null;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z11 = false;
        long j17 = -9223372036854775807L;
        int i20 = 1;
        while (fVar2.a()) {
            int i21 = i17;
            if (fVar2.a()) {
                str2 = fVar2.f21945c;
                fVar2.f21945c = str3;
            } else {
                str2 = str3;
            }
            long j18 = j10;
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strB2 = b(str2, f21952g);
                if ("VOD".equals(strB2)) {
                    i14 = i13;
                    i17 = i21;
                    j10 = j18;
                } else if ("EVENT".equals(strB2)) {
                    i17 = i21;
                    j10 = j18;
                    str3 = null;
                    i14 = 2;
                } else {
                    i10 = i13;
                    fVar2 = fVar;
                    i17 = i21;
                    j10 = j18;
                    i13 = i10;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j17 = (long) (Double.parseDouble(b(str2, f21955j)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-MAP")) {
                    String strB3 = b(str2, f21959n);
                    String strA2 = a(str2, f21957l);
                    if (strA2 != null) {
                        String[] strArrSplit = strA2.split("@");
                        j16 = Long.parseLong(strArrSplit[i21]);
                        if (strArrSplit.length > i13) {
                            j13 = Long.parseLong(strArrSplit[i13]);
                        }
                    }
                    c cVar2 = new c(strB3, 0L, -1, -9223372036854775807L, false, null, null, j13, j16);
                    j13 = 0;
                    j16 = -1;
                    i17 = i21;
                    j10 = j18;
                    cVar = cVar2;
                } else {
                    if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j11 = ((long) Integer.parseInt(b(str2, f21950e))) * 1000000;
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i15 = Integer.parseInt(b(str2, f21953h));
                        i19 = i15;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i20 = Integer.parseInt(b(str2, f21951f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j14 = (long) (Double.parseDouble(b(str2, f21954i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f21958m));
                        if (zEquals) {
                            strB = b(str2, f21959n);
                            strA = a(str2, f21960o);
                        } else {
                            i17 = i21;
                            j10 = j18;
                            i13 = 1;
                            str3 = null;
                            strB = null;
                            strA = null;
                        }
                    } else {
                        if (str2.startsWith("#EXT-X-BYTERANGE")) {
                            String[] strArrSplit2 = b(str2, f21956k).split("@");
                            j16 = Long.parseLong(strArrSplit2[i21]);
                            i11 = 1;
                            if (strArrSplit2.length > 1) {
                                j13 = Long.parseLong(strArrSplit2[1]);
                            }
                        } else {
                            i11 = 1;
                            if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i18 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                                i13 = 1;
                                z10 = true;
                            } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                                i16++;
                            } else {
                                if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (j12 == 0) {
                                        String strSubstring = str2.substring(str2.indexOf(58) + 1);
                                        Matcher matcher = z.f23167f.matcher(strSubstring);
                                        if (!matcher.matches()) {
                                            throw new r("Invalid date/time format: " + strSubstring);
                                        }
                                        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                            i12 = i21;
                                        } else {
                                            i12 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                            if (matcher.group(11).equals(TokenBuilder.TOKEN_DELIMITER)) {
                                                i12 *= -1;
                                            }
                                        }
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                                        gregorianCalendar.clear();
                                        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                        if (!TextUtils.isEmpty(matcher.group(8))) {
                                            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                        }
                                        long timeInMillis = gregorianCalendar.getTimeInMillis();
                                        if (i12 != 0) {
                                            timeInMillis -= (long) (i12 * 60000);
                                        }
                                        int i22 = com.fyber.inneractive.sdk.player.exoplayer2.b.f21703a;
                                        j12 = (timeInMillis == j18 ? j18 : timeInMillis * 1000) - j15;
                                        fVar2 = fVar;
                                    } else {
                                        i10 = 1;
                                    }
                                } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                                    arrayList2.add(str2);
                                    i10 = 1;
                                } else if (str2.startsWith("#")) {
                                    i10 = 1;
                                    if (str2.equals("#EXT-X-ENDLIST")) {
                                        fVar2 = fVar;
                                        i17 = i21;
                                        j10 = j18;
                                        i13 = 1;
                                        z11 = true;
                                    }
                                } else {
                                    String hexString = !zEquals ? null : strA != null ? strA : Integer.toHexString(i15);
                                    int i23 = i15 + 1;
                                    long j19 = j16 == -1 ? 0L : j13;
                                    arrayList.add(new c(str2, j14, i16, j15, zEquals, strB, hexString, j19, j16));
                                    j15 += j14;
                                    if (j16 != -1) {
                                        j19 += j16;
                                    }
                                    j13 = j19;
                                    i15 = i23;
                                    j14 = 0;
                                    j16 = -1;
                                    i17 = i21;
                                    j10 = j18;
                                    i13 = 1;
                                    str3 = null;
                                    fVar2 = fVar;
                                }
                                fVar2 = fVar;
                                i17 = i21;
                                j10 = j18;
                                i13 = i10;
                            }
                        }
                        i13 = i11;
                    }
                    i17 = i21;
                    j10 = j18;
                    i13 = 1;
                }
                i17 = i21;
                j10 = j18;
            }
            str3 = null;
        }
        return new d(i14, str, j17, j12, z10, i18, i19, i20, j11, z11, j12 != 0 ? i13 : i17, cVar, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:36:0x006f, B:37:0x0076, B:14:0x0032, B:16:0x0038, B:20:0x0041, B:22:0x0049, B:25:0x0056, B:27:0x005c, B:31:0x0063, B:32:0x0068, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:46:0x00a1, B:48:0x00a9, B:50:0x00b1, B:52:0x00b9, B:54:0x00c1, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:63:0x00e2, B:64:0x00e6), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e a(android.net.Uri r7, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r8) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(android.net.Uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f r44, java.lang.String r45) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b");
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
