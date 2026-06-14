package ba;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import ba.f;
import ba.g;
import com.ironsource.C4240b4;
import ib.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.media3.common.DrmInitData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.r;
import n9.w;
import n9.x;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f6131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f6132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f6090c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f6092d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f6094e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f6096f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f6098g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f6100h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f6102i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f6104j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f6106k = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f6108l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f6110m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f6112n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f6114o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f6116p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f6118q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f6120r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f6122s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f6124t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f6125u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f6126v = b("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f6127w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f6128x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f6129y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f6130z = b("CAN-BLOCK-RELOAD");
    private static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern N = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern R = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern T = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern U = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern W = b("AUTOSELECT");
    private static final Pattern X = b("DEFAULT");
    private static final Pattern Y = b("FORCED");
    private static final Pattern Z = b("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f6088a0 = b("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f6089b0 = b("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f6091c0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f6093d0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f6095e0 = Pattern.compile("[:,]ID=\"(.+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f6097f0 = Pattern.compile("CLASS=\"(.+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f6099g0 = Pattern.compile("START-DATE=\"(.+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f6101h0 = Pattern.compile("CUE=\"(.+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f6103i0 = Pattern.compile("END-DATE=\"(.+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f6105j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f6107k0 = b("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f6109l0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f6111m0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f6113n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f6115o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f6117p0 = Pattern.compile("X-SNAP=\"(.+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f6119q0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f6121r0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f6123s0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f6133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f6134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6135c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f6134b = queue;
            this.f6133a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f6135c != null) {
                return true;
            }
            if (!this.f6134b.isEmpty()) {
                this.f6135c = (String) q9.a.e((String) this.f6134b.poll());
                return true;
            }
            do {
                String line = this.f6133a.readLine();
                this.f6135c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f6135c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f6135c;
            this.f6135c = null;
            return str;
        }
    }

    public i() {
        this(g.f6064n, null);
    }

    private static String A(String str, Pattern pattern, Map map) throws x {
        String strW = w(str, pattern, map);
        if (strW != null) {
            return strW;
        }
        throw x.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long B(String str, Pattern pattern) {
        return new BigDecimal(A(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String C(String str, Map map) {
        Matcher matcher = f6121r0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int D(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !o0.I0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean a(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iD = D(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iD != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iD = bufferedReader.read();
        }
        return o0.I0(D(bufferedReader, false, iD));
    }

    private static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].b(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String d(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static g.b e(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g.b bVar = (g.b) arrayList.get(i10);
            if (str.equals(bVar.f6082d)) {
                return bVar;
            }
        }
        return null;
    }

    private static g.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g.b bVar = (g.b) arrayList.get(i10);
            if (str.equals(bVar.f6083e)) {
                return bVar;
            }
        }
        return null;
    }

    private static g.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g.b bVar = (g.b) arrayList.get(i10);
            if (str.equals(bVar.f6081c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean h(String str, String str2, String str3, String str4) {
        if (!w.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static f.b j(String str, String str2, Map map) {
        String str3 = str2 + C4240b4.j.f42668b;
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new f.b(str2, A(str, Pattern.compile(str2 + "=\"(.+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new f.b(str2, A(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, k(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double k(String str, Pattern pattern) {
        return Double.parseDouble(A(str, pattern, Collections.EMPTY_MAP));
    }

    private static DrmInitData.SchemeData l(String str, String str2, Map map) throws x {
        String strV = v(str, M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strA = A(str, N, map);
            return new DrmInitData.SchemeData(n9.f.f95290d, "video/mp4", Base64.decode(strA.substring(strA.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(n9.f.f95290d, "hls", o0.u0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strV)) {
            return null;
        }
        String strA2 = A(str, N, map);
        byte[] bArrDecode = Base64.decode(strA2.substring(strA2.indexOf(44)), 0);
        UUID uuid = n9.f.f95291e;
        return new DrmInitData.SchemeData(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    private static String m(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int n(String str, Pattern pattern) {
        return Integer.parseInt(A(str, pattern, Collections.EMPTY_MAP));
    }

    private static long o(String str, Pattern pattern) {
        return Long.parseLong(A(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0699, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x069d, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06ab, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06b8, code lost:
    
        r32 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0335 A[PHI: r2
  0x0335: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v1 java.lang.String) binds: [B:119:0x0346, B:113:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x069b A[PHI: r32
  0x069b: PHI (r32v8 int) = (r32v4 int), (r32v5 int), (r32v6 int), (r32v9 int) binds: [B:252:0x06c0, B:248:0x06b3, B:244:0x06a5, B:241:0x0699] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0922  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static ba.f p(ba.g r112, ba.f r113, ba.i.b r114, java.lang.String r115) throws n9.x, ba.i.a {
        /*
            Method dump skipped, instruction units count: 2640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i.p(ba.g, ba.f, ba.i$b, java.lang.String):ba.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x037f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static ba.g q(ba.i.b r36, java.lang.String r37) throws n9.x {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i.q(ba.i$b, java.lang.String):ba.g");
    }

    private static boolean r(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double s(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) q9.a.e(matcher.group(1))) : d10;
    }

    private static int t(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) q9.a.e(matcher.group(1))) : i10;
    }

    private static long u(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) q9.a.e(matcher.group(1))) : j10;
    }

    private static String v(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) q9.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : C(str2, map);
    }

    private static String w(String str, Pattern pattern, Map map) {
        return v(str, pattern, null, map);
    }

    private static int x(String str, Map map) {
        String strW = w(str, U, map);
        if (TextUtils.isEmpty(strW)) {
            return 0;
        }
        String[] strArrJ1 = o0.j1(strW, StringUtils.COMMA);
        int i10 = o0.s(strArrJ1, "public.accessibility.describes-video") ? 512 : 0;
        if (o0.s(strArrJ1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (o0.s(strArrJ1, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return o0.s(strArrJ1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int y(String str) {
        boolean zR = r(str, X, false);
        ?? r02 = zR;
        if (r(str, Y, false)) {
            r02 = (zR ? 1 : 0) | 2;
        }
        return r(str, W, false) ? r02 | 4 : r02;
    }

    private static f.h z(String str) {
        double dS = s(str, f6125u, -9.223372036854776E18d);
        long j10 = dS == -9.223372036854776E18d ? -9223372036854775807L : (long) (dS * 1000000.0d);
        boolean zR = r(str, f6126v, false);
        double dS2 = s(str, f6128x, -9.223372036854776E18d);
        long j11 = dS2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dS2 * 1000000.0d);
        double dS3 = s(str, f6129y, -9.223372036854776E18d);
        return new f.h(j10, zR, j11, dS3 != -9.223372036854776E18d ? (long) (dS3 * 1000000.0d) : -9223372036854775807L, r(str, f6130z, false));
    }

    @Override // ka.r.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h parse(Uri uri, InputStream inputStream) throws x {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!a(bufferedReader)) {
                throw x.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    o0.m(bufferedReader);
                    throw x.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return q(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return p(this.f6131a, this.f6132b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            o0.m(bufferedReader);
        }
    }

    public i(g gVar, f fVar) {
        this.f6131a = gVar;
        this.f6132b = fVar;
    }
}
