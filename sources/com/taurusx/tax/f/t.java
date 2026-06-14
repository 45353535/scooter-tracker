package com.taurusx.tax.f;

import android.text.TextUtils;
import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.vast.VastTracker;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes11.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66034a = "MP_TRACKING_URL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66035c = "</MPMoVideoXMLDocRoot>";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66036f = "MoPubForceOrientation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66037g = "MoPubCloseIcon";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f66038m = 15;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66039n = "MoPubCtaText";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66040o = "Ad";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f66041p = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66042s = "Error";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66043t = "MoPubSkipText";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66044w = "MPMoVideoXMLDocRoot";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66045y = "<MPMoVideoXMLDocRoot>";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Document f66046z;

    public String c() {
        String strZ = m0.z(this.f66046z, f66043t);
        if (strZ == null || strZ.length() > 8) {
            return null;
        }
        return strZ;
    }

    public VastTracker o() {
        Document document = this.f66046z;
        if (document == null) {
            return null;
        }
        String strZ = m0.z(document, "Error");
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        return new VastTracker.Builder(strZ).build();
    }

    public List<VastTracker> s() {
        List<String> listW = m0.w(this.f66046z, f66034a);
        ArrayList arrayList = new ArrayList(listW.size());
        Iterator<String> it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker.Builder(it.next()).build());
        }
        return arrayList;
    }

    public String w() {
        return m0.z(this.f66046z, f66037g);
    }

    public String y() {
        String strZ = m0.z(this.f66046z, f66039n);
        if (strZ == null || strZ.length() > 15) {
            return null;
        }
        return strZ;
    }

    public void z(String str) throws ParserConfigurationException, SAXException, IOException {
        r.z(str, "xmlString cannot be null");
        String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setCoalescing(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        this.f66046z = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
    }

    public List<w> z() {
        ArrayList arrayList = new ArrayList();
        Document document = this.f66046z;
        if (document != null) {
            NodeList elementsByTagName = document.getElementsByTagName(f66040o);
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                arrayList.add(new w(elementsByTagName.item(i10)));
            }
        }
        return arrayList;
    }
}
