package h2;

import android.text.TextUtils;
import android.util.Xml;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x {
    public static s a(InputStream inputStream) throws Exception {
        if (inputStream == null) {
            throw new Exception();
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(inputStream, null);
        int next = xmlPullParserNewPullParser.next();
        if (next == 1) {
            throw new Exception();
        }
        while (next != 3 && next != 1) {
            if (xmlPullParserNewPullParser.getEventType() == 2 && t.D(xmlPullParserNewPullParser.getName(), "VAST")) {
                return new s(xmlPullParserNewPullParser);
            }
            next = xmlPullParserNewPullParser.next();
        }
        return null;
    }

    public static s b(String str) throws Exception {
        ByteArrayInputStream byteArrayInputStream;
        if (TextUtils.isEmpty(str)) {
            throw new Exception();
        }
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Charset.defaultCharset().name()));
                try {
                    s sVarA = a(byteArrayInputStream);
                    try {
                        byteArrayInputStream.close();
                        return sVarA;
                    } catch (Exception e10) {
                        f2.c.b("VastXmlParser", e10);
                        return sVarA;
                    }
                } catch (Exception e11) {
                    e = e11;
                    byteArrayInputStream2 = byteArrayInputStream;
                    f2.c.b("VastXmlParser", e);
                    throw new Exception();
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e12) {
                            f2.c.b("VastXmlParser", e12);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = byteArrayInputStream2;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }
}
