package yads;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f118739a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f118740b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f118741c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static nk2 a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        v31 v31Var = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (ym3.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = ym3.a(xmlPullParser, strConcat3);
                String strA2 = ym3.a(xmlPullParser, strConcat4);
                String strA3 = ym3.a(xmlPullParser, strConcat5);
                String strA4 = ym3.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return nk2.f113952f;
                }
                qt1 qt1Var = new qt1(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L);
                int i11 = i10 + 1;
                if (objArrCopyOf.length < i11) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i11));
                }
                objArrCopyOf[i10] = qt1Var;
                i10 = i11;
            }
        } while (!ym3.b(xmlPullParser, strConcat2));
        return y31.b(i10, objArrCopyOf);
    }

    public static rt1 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (ym3.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            v31 v31Var = y31.f118068c;
            nk2 nk2VarA = nk2.f113952f;
            long j10 = -9223372036854775807L;
            loop0: do {
                xmlPullParserNewPullParser.next();
                if (ym3.c(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = f118739a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break loop0;
                        }
                        String strA = ym3.a(xmlPullParserNewPullParser, strArr[i10]);
                        if (strA == null) {
                            i10++;
                        } else if (Integer.parseInt(strA) == 1) {
                            String[] strArr2 = f118740b;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 4) {
                                    break;
                                }
                                String strA2 = ym3.a(xmlPullParserNewPullParser, strArr2[i11]);
                                if (strA2 != null) {
                                    j10 = Long.parseLong(strA2);
                                    if (j10 == -1) {
                                        break;
                                    }
                                } else {
                                    i11++;
                                }
                            }
                            j10 = -9223372036854775807L;
                            String[] strArr3 = f118741c;
                            int i12 = 0;
                            while (true) {
                                if (i12 < 2) {
                                    String strA3 = ym3.a(xmlPullParserNewPullParser, strArr3[i12]);
                                    if (strA3 != null) {
                                        nk2VarA = y31.a(new qt1("image/jpeg", 0L, 0L), new qt1("video/mp4", Long.parseLong(strA3), 0L));
                                        break;
                                    }
                                    i12++;
                                } else {
                                    v31 v31Var2 = y31.f118068c;
                                    nk2VarA = nk2.f113952f;
                                    break;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (ym3.c(xmlPullParserNewPullParser, "Container:Directory")) {
                    nk2VarA = a(xmlPullParserNewPullParser, "Container", "Item");
                } else if (ym3.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    nk2VarA = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!ym3.b(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (nk2VarA.isEmpty()) {
                return null;
            }
            return new rt1(j10, nk2VarA);
        }
        throw new ba2("Couldn't find xmp metadata", null, true, 1);
    }
}
