package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.google.common.base.Ascii;
import com.taurusx.tax.f.a;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.y;
import com.taurusx.tax.vast.VastIconXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> lnr(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return qdl(xmlPullParser, false);
    }

    public static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, int i10, double d10) throws XmlPullParserException, IOException {
        boolean z10 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals(y.f66052c)) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z10 && TextUtils.isEmpty(qdlVar.wd())) {
                        mzz.qdl(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            qdl(xmlPullParser, qdlVar);
                            break;
                        case "Duration":
                            qdlVar.qdl(ud(xmlPullParser));
                            break;
                        case "MediaFiles":
                            qdl(xmlPullParser, i10, d10, qdlVar);
                            z10 = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.fs.ud udVarQdl = qdl(xmlPullParser);
                            if (udVarQdl != null && qdlVar.ud() == null) {
                                qdlVar.qdl(udVarQdl);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            qdl(xmlPullParser, qdlVar.qdl());
                            break;
                        default:
                            mzz.qdl(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    public static double ud(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (mzz.ud(xmlPullParser, "Duration").split(StringUtils.PROCESS_POSTFIX_DELIMITER).length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * 3600) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    private static String qdl(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) throws XmlPullParserException, IOException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(s.f66008a)) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(s.f66021n)) {
                String str2 = mzz.f17235wd;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iUd = mzz.ud(xmlPullParser.getAttributeValue(str2, "width"));
                int iUd2 = mzz.ud(xmlPullParser.getAttributeValue(str2, "height"));
                int iUd3 = mzz.ud(xmlPullParser.getAttributeValue(str2, a.f65992s));
                String strUd = mzz.ud(xmlPullParser, s.f66021n);
                if (iUd > 0 && iUd2 > 0 && com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl.contains(attributeValue) && !TextUtils.isEmpty(strUd)) {
                    double dQdl = com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(i10, d10, iUd, iUd2, iUd3, attributeValue);
                    if (dQdl > d11) {
                        str = strUd;
                        d11 = dQdl;
                        i11 = iUd;
                        i12 = iUd2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            qdlVar.mml(str);
            qdlVar.qdl(i11);
            qdlVar.ud(i12);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.fs.ud qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        String str2;
        qdl.EnumC0258qdl enumC0258qdl;
        byte b10;
        String str3 = VastResourceXmlManager.HTML_RESOURCE;
        int i10 = 2;
        int i11 = 3;
        com.bytedance.sdk.openadsdk.core.fs.ud udVar = null;
        while (true) {
            if (xmlPullParser.getEventType() == i11 && xmlPullParser.getName().equals(s.f66027t)) {
                return udVar;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i10 && xmlPullParser.getName().equals(s.f66014g)) {
                String str4 = mzz.f17235wd;
                int iUd = mzz.ud(xmlPullParser.getAttributeValue(str4, "width"));
                int iUd2 = mzz.ud(xmlPullParser.getAttributeValue(str4, "height"));
                if (iUd > 0 && iUd <= 300 && iUd2 > 0 && iUd2 <= 300) {
                    int iQdl = com.bytedance.sdk.openadsdk.core.fs.ud.qdl.qdl(xmlPullParser.getAttributeValue(str4, "offset"));
                    int iQdl2 = com.bytedance.sdk.openadsdk.core.fs.ud.qdl.qdl(xmlPullParser.getAttributeValue(str4, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    mzz.qdl qdlVar = null;
                    String strUd = null;
                    while (true) {
                        if (xmlPullParser.next() == i11 && xmlPullParser.getName().equals(s.f66014g)) {
                            if (qdlVar != null && (udVar == null || TextUtils.isEmpty(udVar.mo()))) {
                                com.bytedance.sdk.openadsdk.core.fs.ud udVar2 = new com.bytedance.sdk.openadsdk.core.fs.ud(iUd, iUd2, iQdl, iQdl2, qdlVar.f17236ud, qdlVar.lnr, qdlVar.qdl, arrayList, arrayList2, strUd);
                                mzz.qdl(xmlPullParser, s.f66027t, 3);
                                udVar = udVar2;
                            }
                            i10 = 2;
                            i11 = 3;
                        } else {
                            int i12 = iUd2;
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            int i13 = iQdl2;
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                byte b11 = -1;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals(VastIconXmlManager.ICON_VIEW_TRACKING)) {
                                            b10 = 0;
                                            b11 = b10;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals(VastResourceXmlManager.IFRAME_RESOURCE)) {
                                            b10 = 1;
                                            b11 = b10;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals(VastResourceXmlManager.STATIC_RESOURCE)) {
                                            b11 = 2;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals(VastIconXmlManager.ICON_CLICKS)) {
                                            b11 = 3;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals(str3)) {
                                            b10 = 4;
                                            b11 = b10;
                                        }
                                        break;
                                }
                                switch (b11) {
                                    case 0:
                                        str2 = str3;
                                        arrayList4.add(new lnr.qdl(mzz.ud(xmlPullParser, VastIconXmlManager.ICON_VIEW_TRACKING)).qdl());
                                        break;
                                    case 1:
                                        str2 = str3;
                                        if (qdlVar == null) {
                                            qdlVar = new mzz.qdl(mzz.ud(xmlPullParser, VastResourceXmlManager.IFRAME_RESOURCE), qdl.EnumC0258qdl.NONE, qdl.ud.IFRAME_RESOURCE);
                                        } else {
                                            mzz.qdl(xmlPullParser);
                                        }
                                        break;
                                    case 2:
                                        str2 = str3;
                                        qdl.EnumC0258qdl enumC0258qdl2 = qdl.EnumC0258qdl.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(mzz.f17235wd, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl;
                                        String strUd2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.f17214ud.contains(lowerCase)) ? mzz.ud(xmlPullParser, VastResourceXmlManager.STATIC_RESOURCE) : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0258qdl = qdl.EnumC0258qdl.IMAGE;
                                        } else {
                                            enumC0258qdl = qdl.EnumC0258qdl.JAVASCRIPT;
                                        }
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        qdlVar = new mzz.qdl(strUd2, enumC0258qdl, qdl.ud.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        str2 = str3;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(VastIconXmlManager.ICON_CLICKS)) {
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals(VastIconXmlManager.ICON_CLICK_THROUGH)) {
                                                    strUd = mzz.ud(xmlPullParser, VastIconXmlManager.ICON_CLICK_THROUGH);
                                                } else if (xmlPullParser.getName().equals(VastIconXmlManager.ICON_CLICK_TRACKING)) {
                                                    arrayList3.add(new lnr.qdl(mzz.ud(xmlPullParser, VastIconXmlManager.ICON_CLICK_TRACKING)).qdl());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (qdlVar == null || qdlVar.lnr == qdl.ud.IFRAME_RESOURCE) {
                                            str2 = str3;
                                            qdlVar = new mzz.qdl(mzz.ud(xmlPullParser, str3), qdl.EnumC0258qdl.NONE, qdl.ud.HTML_RESOURCE);
                                            break;
                                        }
                                    default:
                                        str2 = str3;
                                        mzz.qdl(xmlPullParser);
                                        break;
                                }
                                iUd2 = i12;
                                iQdl2 = i13;
                                str3 = str2;
                                i11 = 3;
                            } else {
                                str2 = str3;
                            }
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            iUd2 = i12;
                            iQdl2 = i13;
                            str3 = str2;
                            i11 = 3;
                        }
                    }
                } else {
                    str = str3;
                    mzz.qdl(xmlPullParser);
                }
            } else {
                str = str3;
            }
            str3 = str;
            i10 = 2;
            i11 = 3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(mzz.f17235wd, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        mzz.qdl(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        byte b10 = -1;
                        switch (attributeValue.hashCode()) {
                            case -1638835128:
                                if (attributeValue.equals("midpoint")) {
                                    b10 = 0;
                                }
                                break;
                            case -1337830390:
                                if (attributeValue.equals("thirdQuartile")) {
                                    b10 = 1;
                                }
                                break;
                            case -934426579:
                                if (attributeValue.equals("resume")) {
                                    b10 = 2;
                                }
                                break;
                            case -840405966:
                                if (attributeValue.equals("unmute")) {
                                    b10 = 3;
                                }
                                break;
                            case -599445191:
                                if (attributeValue.equals("complete")) {
                                    b10 = 4;
                                }
                                break;
                            case 3363353:
                                if (attributeValue.equals("mute")) {
                                    b10 = 5;
                                }
                                break;
                            case 3532159:
                                if (attributeValue.equals("skip")) {
                                    b10 = 6;
                                }
                                break;
                            case 94756344:
                                if (attributeValue.equals("close")) {
                                    b10 = 7;
                                }
                                break;
                            case 106440182:
                                if (attributeValue.equals("pause")) {
                                    b10 = 8;
                                }
                                break;
                            case 109757538:
                                if (attributeValue.equals("start")) {
                                    b10 = 9;
                                }
                                break;
                            case 560220243:
                                if (attributeValue.equals("firstQuartile")) {
                                    b10 = 10;
                                }
                                break;
                            case 1778167540:
                                if (attributeValue.equals("creativeView")) {
                                    b10 = Ascii.VT;
                                }
                                break;
                        }
                        switch (b10) {
                            case 0:
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case 1:
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case 2:
                                mmlVar.lnr(qdl(xmlPullParser, true));
                                break;
                            case 3:
                                mmlVar.fs(qdl(xmlPullParser, true));
                                break;
                            case 4:
                                mmlVar.mml(lnr(xmlPullParser));
                                break;
                            case 5:
                                mmlVar.rq(qdl(xmlPullParser, true));
                                break;
                            case 6:
                                mmlVar.mo(lnr(xmlPullParser));
                                break;
                            case 7:
                                mmlVar.mzz(lnr(xmlPullParser));
                                break;
                            case 8:
                                mmlVar.ud(qdl(xmlPullParser, true));
                                break;
                            case 9:
                            case 11:
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0L);
                                break;
                            case 10:
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    mzz.qdl(xmlPullParser);
                }
            }
        }
    }

    private static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(s.f66032y)) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals(s.f66022o)) {
                    if (name.equals(s.f66026s)) {
                        qdlVar.qdl().wd(mzz.qdl(xmlPullParser, s.f66026s));
                    } else {
                        mzz.qdl(xmlPullParser);
                    }
                } else {
                    qdlVar.lnr(mzz.ud(xmlPullParser, s.f66022o));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, boolean z10) throws XmlPullParserException, IOException {
        return mzz.qdl(xmlPullParser, "Tracking", z10);
    }
}
