package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.to;
import com.taurusx.tax.f.z;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public static Set<to> qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        to toVarQdl;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (z.f66070y.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(mzz.f17235wd, z.f66061c);
                    String strUd = null;
                    String strUd2 = null;
                    String strUd3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !z.f66070y.equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!z.f66064m.equals(xmlPullParser.getAttributeValue(mzz.f17235wd, "event"))) {
                                            break;
                                        } else {
                                            strUd3 = mzz.ud(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(mzz.f17235wd, "apiFramework"))) {
                                            break;
                                        } else {
                                            strUd = mzz.ud(xmlPullParser, z.f66066o);
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strUd2 = mzz.ud(xmlPullParser, z.f66065n);
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strUd) && (toVarQdl = to.qdl(strUd, attributeValue, strUd2, strUd3)) != null) {
                            hashSet.add(toVarQdl);
                        }
                    }
                } else {
                    mzz.qdl(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
