package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.f.w;
import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static com.bytedance.sdk.openadsdk.core.fs.qdl qdl(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, int i10, double d10) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, mzz.f17235wd, w.f66048w);
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.fs.qdl();
        while (true) {
            if (xmlPullParser.next() == 3 && w.f66048w.equals(xmlPullParser.getName())) {
                qdlVar.qdl().to(list);
                return qdlVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        qdlVar.qdl(mml.qdl(xmlPullParser));
                        continue;
                        break;
                    case "Creatives":
                        if (!TextUtils.isEmpty(qdlVar.wd()) && qdlVar.lnr() != null) {
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if (y.f66055s.equals(xmlPullParser.getName())) {
                                        qdl(context, xmlPullParser, qdlVar, i10, d10);
                                    } else {
                                        mzz.qdl(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "Description":
                        qdlVar.ud(mzz.ud(xmlPullParser, name));
                        continue;
                        break;
                    case "Error":
                        list.addAll(mzz.qdl(xmlPullParser, name));
                        continue;
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && y.f66056t.equals(xmlPullParser.getName())) {
                                continue;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && z.f66069w.equals(xmlPullParser.getName())) {
                                    qdlVar.qdl(mml.qdl(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        qdlVar.qdl(mzz.ud(xmlPullParser, name));
                        continue;
                        break;
                    case "Impression":
                        qdlVar.qdl().qdl(mzz.qdl(xmlPullParser, name));
                        continue;
                        break;
                }
                mzz.qdl(xmlPullParser);
            }
        }
    }

    public static void qdl(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, int i10, double d10) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (y.f66052c.equals(xmlPullParser.getName()) && TextUtils.isEmpty(qdlVar.wd())) {
                    lnr.qdl(xmlPullParser, qdlVar, i10, d10);
                } else if (y.f66051a.equals(xmlPullParser.getName()) && qdlVar.lnr() == null) {
                    qdlVar.qdl(qdl.qdl(context, xmlPullParser));
                } else {
                    mzz.qdl(xmlPullParser);
                }
            }
        }
    }
}
