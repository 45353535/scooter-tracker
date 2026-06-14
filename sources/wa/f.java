package wa;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import n9.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q9.p0;
import q9.u;
import wa.c;

/* JADX INFO: loaded from: classes12.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f107833a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f107834b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f107835c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | x | XmlPullParserException unused) {
            u.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!p0.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw x.a("Couldn't find xmp metadata", null);
        }
        ImmutableList immutableListOf = ImmutableList.of();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (p0.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                immutableListOf = c(xmlPullParserNewPullParser);
            } else if (p0.f(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (p0.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!p0.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new c(jE, immutableListOf);
    }

    private static ImmutableList c(XmlPullParser xmlPullParser) {
        for (String str : f107835c) {
            String strA = p0.a(xmlPullParser, str);
            if (strA != null) {
                return ImmutableList.of(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return ImmutableList.of();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f107833a) {
            String strA = p0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f107834b) {
            String strA = p0.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static ImmutableList f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (p0.f(xmlPullParser, str3)) {
                String strA = p0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = p0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = p0.a(xmlPullParser, str2 + ":Length");
                String strA4 = p0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return ImmutableList.of();
                }
                builder.add(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!p0.d(xmlPullParser, str4));
        return builder.build();
    }
}
