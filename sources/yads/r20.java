package yads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.base.Ascii;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class r20 extends DefaultHandler implements ca2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f115276b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f115277c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f115278d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f115279e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f115280a;

    public r20() {
        try {
            this.f115280a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = w83.f117341a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new xu2(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static int b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iBitCount;
        iBitCount = 6;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount <= 0 || iBitCount >= 33) {
                    iBitCount = -1;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    iBitCount = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    String strA = ci.a(attributeValue4);
                    strA.getClass();
                    switch (strA) {
                        case "4000":
                            iBitCount = 1;
                            break;
                        case "a000":
                            iBitCount = 2;
                            break;
                        case "f801":
                            break;
                        case "fa01":
                            iBitCount = 8;
                            break;
                        default:
                            iBitCount = -1;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i10 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i10 >= 0) {
                    int[] iArr = f115279e;
                    iBitCount = i10 >= iArr.length ? -1 : iArr[i10];
                    break;
                } else {
                    iBitCount = -1;
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) == 0) {
                    iBitCount = -1;
                    break;
                }
                break;
            default:
                iBitCount = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!ym3.b(xmlPullParser, "AudioChannelConfiguration"));
        return iBitCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r20.c(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    @Override // yads.ca2
    public final Object a(Uri uri, e30 e30Var) throws ba2 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f115280a.newPullParser();
            xmlPullParserNewPullParser.setInput(e30Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return a(xmlPullParserNewPullParser, uri);
            }
            throw new ba2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e10) {
            throw new ba2(null, e10, true, 4);
        }
    }

    public static long a(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList a(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = z10 ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!ym3.b(xmlPullParser, "BaseURL"));
        if (text != null && b83.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return be1.a(new mo(i10, i11, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            mo moVar = (mo) list.get(i12);
            String strA = b83.a(moVar.f113562a, text);
            String str = attributeValue3 == null ? strA : attributeValue3;
            if (z10) {
                i10 = moVar.f113564c;
                i11 = moVar.f113565d;
                str = moVar.f113563b;
            }
            arrayList.add(new mo(i10, i11, strA, str));
        }
        return arrayList;
    }

    public static ff0 a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!ym3.b(xmlPullParser, str));
        return new ff0(attributeValue, attributeValue2, str2);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = w83.f117348h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
            String strGroup = matcher.group(3);
            double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
            String strGroup2 = matcher.group(5);
            double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
            String strGroup3 = matcher.group(7);
            double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
            String strGroup4 = matcher.group(10);
            double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
            String strGroup5 = matcher.group(12);
            double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
            String strGroup6 = matcher.group(14);
            long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
            return !zIsEmpty ? -j11 : j11;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static lj2 a(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split(TokenBuilder.TOKEN_DELIMITER);
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return new lj2(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return new lj2(attributeValue, j10, j11);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    b10 = 0;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    b10 = 1;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    b10 = 2;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    b10 = 3;
                }
                break;
            case -1408024454:
                if (str.equals(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE)) {
                    b10 = 4;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    b10 = 5;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    b10 = 6;
                }
                break;
            case 3343801:
                if (str.equals(C4240b4.i.Z)) {
                    b10 = 7;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    b10 = 8;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    b10 = 9;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    b10 = 10;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
        }
        return 0;
    }

    public static yu2 a(XmlPullParser xmlPullParser, yu2 yu2Var) throws XmlPullParserException, IOException {
        long j10 = yu2Var != null ? yu2Var.f118840b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = yu2Var != null ? yu2Var.f118841c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = yu2Var != null ? yu2Var.f118385d : 0L;
        long j15 = yu2Var != null ? yu2Var.f118386e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split(TokenBuilder.TOKEN_DELIMITER);
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        lj2 lj2VarA = yu2Var != null ? yu2Var.f118839a : null;
        while (true) {
            xmlPullParser.next();
            if (ym3.c(xmlPullParser, "Initialization")) {
                lj2VarA = a(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
            } else {
                a(xmlPullParser);
            }
            lj2 lj2Var = lj2VarA;
            if (ym3.b(xmlPullParser, "SegmentBase")) {
                return new yu2(lj2Var, j11, j13, j17, j16);
            }
            lj2VarA = lj2Var;
        }
    }

    public static vu2 a(XmlPullParser xmlPullParser, vu2 vu2Var, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = vu2Var != null ? vu2Var.f118840b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = vu2Var != null ? vu2Var.f118841c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = vu2Var != null ? vu2Var.f116783e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = vu2Var != null ? vu2Var.f116782d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == -9223372036854775807L ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        lj2 lj2VarA = null;
        List listA = null;
        do {
            xmlPullParser.next();
            if (ym3.c(xmlPullParser, "Initialization")) {
                lj2VarA = a(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
            } else if (ym3.c(xmlPullParser, "SegmentTimeline")) {
                listA = a(xmlPullParser, j16, j11);
            } else if (ym3.c(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a(xmlPullParser, "media", "mediaRange"));
            } else {
                a(xmlPullParser);
            }
        } while (!ym3.b(xmlPullParser, "SegmentList"));
        if (vu2Var != null) {
            if (lj2VarA == null) {
                lj2VarA = vu2Var.f118839a;
            }
            if (listA == null) {
                listA = vu2Var.f116784f;
            }
            if (arrayList == null) {
                arrayList = vu2Var.f117207j;
            }
        }
        return new vu2(lj2VarA, j16, j18, j22, j20, listA, j24, arrayList, w83.a(j14), w83.a(j10));
    }

    public static wu2 a(XmlPullParser xmlPullParser, wu2 wu2Var, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = wu2Var != null ? wu2Var.f118840b : 1L;
        lj2 lj2VarA = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = wu2Var != null ? wu2Var.f118841c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = wu2Var != null ? wu2Var.f116783e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = wu2Var != null ? wu2Var.f116782d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            ff0 ff0Var = (ff0) list.get(i10);
            if (ci.a("http://dashif.org/guidelines/last-segment-number", ff0Var.f110700a)) {
                j15 = Long.parseLong(ff0Var.f110701b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == -9223372036854775807L ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        j83 j83VarA = a(xmlPullParser, "media", wu2Var != null ? wu2Var.f117604k : null);
        j83 j83VarA2 = a(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, wu2Var != null ? wu2Var.f117603j : null);
        List listA = null;
        do {
            xmlPullParser.next();
            if (ym3.c(xmlPullParser, "Initialization")) {
                lj2VarA = a(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
            } else if (ym3.c(xmlPullParser, "SegmentTimeline")) {
                listA = a(xmlPullParser, j17, j11);
            } else {
                a(xmlPullParser);
            }
        } while (!ym3.b(xmlPullParser, "SegmentTemplate"));
        if (wu2Var != null) {
            if (lj2VarA == null) {
                lj2VarA = wu2Var.f118839a;
            }
            if (listA == null) {
                listA = wu2Var.f116784f;
            }
        }
        return new wu2(lj2VarA, j17, j19, j23, j24, j21, listA, j26, j83VarA2, j83VarA, w83.a(j14), w83.a(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.j83 a(org.xmlpull.v1.XmlPullParser r17, java.lang.String r18, yads.j83 r19) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r20.a(org.xmlpull.v1.XmlPullParser, java.lang.String, yads.j83):yads.j83");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0fad A[LOOP:11: B:292:0x099f->B:546:0x0fad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x12d4 A[LOOP:5: B:182:0x0571->B:641:0x12d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x16fc A[LOOP:1: B:44:0x0143->B:761:0x16fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x16bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x114c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0ba6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0d0c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.p20 a(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r20.a(org.xmlpull.v1.XmlPullParser, android.net.Uri):yads.p20");
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (ym3.c(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP);
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i11, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != -9223372036854775807L) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                a(xmlPullParser);
            }
        } while (!ym3.b(xmlPullParser, "SegmentTimeline"));
        if (!z10) {
            return arrayList;
        }
        a(arrayList, jA, j13, i10, w83.a(j11, j10, 1000L));
        return arrayList;
    }
}
