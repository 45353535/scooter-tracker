package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import com.ironsource.sdk.controller.f;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21193a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f21197e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f21199g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21196d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21198f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21200h = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21194b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21195c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node nodeD = w1.d(node, com.taurusx.tax.f.z.f66069w);
        if (nodeD != null) {
            for (Node node2 : w1.c(nodeD, com.taurusx.tax.f.z.f66070y)) {
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.f21116e = w1.b(node2, com.taurusx.tax.f.z.f66061c);
                    Node nodeD2 = w1.d(node2, com.taurusx.tax.f.z.f66066o);
                    if (nodeD2 != null) {
                        hVar2.f21118g = true;
                        try {
                            hVar2.f21117f = w1.a(nodeD2);
                            hVar2.f21113b = w1.b(nodeD2, "apiFramework");
                            hVar2.f21112a = new URL(hVar2.f21117f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeD3 = w1.d(node2, "TrackingEvents");
                    if (nodeD3 != null) {
                        for (Node node3 : w1.c(nodeD3, "Tracking")) {
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.f21244a = w1.b(node3, "event");
                                wVar.f21245b = w1.a(node3);
                                wVar.f21246c = w1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.f21244a.equalsIgnoreCase(com.taurusx.tax.f.z.f66064m)) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.f21245b);
                            }
                        }
                    }
                    Node nodeD4 = w1.d(node2, com.taurusx.tax.f.z.f66065n);
                    if (nodeD4 != null) {
                        hVar2.f21115d = w1.a(nodeD4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.f21196d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node nodeD;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        Iterator it;
        h hVar;
        Iterator it2;
        w wVar;
        w wVar2;
        Iterator it3;
        Iterator it4;
        r rVar;
        g gVar = this;
        Node nodeD2 = w1.d(node, "AdSystem");
        if (nodeD2 != null) {
            w1.b(nodeD2, "version");
            w1.a(nodeD2);
        }
        Node nodeD3 = w1.d(node, "Error");
        if (nodeD3 != null) {
            String strA = w1.a(nodeD3);
            if (!TextUtils.isEmpty(strA)) {
                gVar.f21193a = strA;
            }
        }
        Iterator it5 = w1.c(node, com.taurusx.tax.f.y.f66057w).iterator();
        while (it5.hasNext()) {
            String strA2 = w1.a((Node) it5.next());
            if (!TextUtils.isEmpty(strA2)) {
                gVar.f21194b.add(strA2);
            }
        }
        Node nodeD4 = w1.d(node, com.taurusx.tax.f.y.f66054o);
        if (nodeD4 != null) {
            Iterator it6 = w1.c(nodeD4, com.taurusx.tax.f.y.f66055s).iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(w1.b(node2, "AdID"))) {
                        w1.b(node2, f.b.f45109c);
                    }
                    w1.b(node2, "id");
                    w1.a(node2, com.taurusx.tax.f.w.f66047c);
                    Node nodeD5 = w1.d(node2, com.taurusx.tax.f.y.f66052c);
                    if (nodeD5 != null) {
                        q qVar = new q();
                        it = it6;
                        Node nodeD6 = w1.d(nodeD5, com.taurusx.tax.f.s.f66008a);
                        if (nodeD6 != null) {
                            ArrayList arrayListC = w1.c(nodeD6, com.taurusx.tax.f.s.f66021n);
                            if (!arrayListC.isEmpty()) {
                                qVar.f21221a = new ArrayList();
                                Iterator it7 = arrayListC.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new r();
                                        rVar.f21226a = w1.b(node3, "delivery");
                                        rVar.f21227b = w1.a(node3, "width");
                                        rVar.f21228c = w1.a(node3, "height");
                                        rVar.f21229d = w1.b(node3, "type");
                                        w1.b(node3, "id");
                                        rVar.f21231f = w1.b(node3, "apiFramework");
                                        rVar.f21230e = w1.a(node3, com.taurusx.tax.f.a.f65992s);
                                        String strB = w1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(strB)) {
                                            try {
                                                Boolean.valueOf(strB);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strB2 = w1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(strB2)) {
                                            try {
                                                Boolean.valueOf(strB2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.f21232g = w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f21221a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node nodeD7 = w1.d(nodeD5, com.taurusx.tax.f.s.f66032y);
                        if (nodeD7 != null) {
                            qVar.f21223c = w1.a(w1.d(nodeD7, com.taurusx.tax.f.s.f66022o));
                            ArrayList arrayListC2 = w1.c(nodeD7, com.taurusx.tax.f.s.f66026s);
                            if (!arrayListC2.isEmpty()) {
                                qVar.f21224d = new ArrayList();
                                Iterator it8 = arrayListC2.iterator();
                                while (it8.hasNext()) {
                                    String strA3 = w1.a((Node) it8.next());
                                    if (!TextUtils.isEmpty(strA3)) {
                                        qVar.f21224d.add(strA3);
                                    }
                                }
                            }
                        }
                        Node nodeD8 = w1.d(nodeD5, "TrackingEvents");
                        if (nodeD8 != null) {
                            ArrayList arrayListC3 = w1.c(nodeD8, "Tracking");
                            if (!arrayListC3.isEmpty()) {
                                qVar.f21222b = new ArrayList();
                                Iterator it9 = arrayListC3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        it3 = it9;
                                        wVar2.f21244a = w1.b(node4, "event");
                                        wVar2.f21245b = w1.a(node4);
                                        wVar2.f21246c = w1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.f21222b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node nodeD9 = w1.d(nodeD5, "Duration");
                        if (nodeD9 != null) {
                            qVar.f21225e = w1.a(nodeD9);
                        }
                        mVar.f21214a = qVar;
                    } else {
                        it = it6;
                    }
                    Node nodeD10 = w1.d(node2, com.taurusx.tax.f.y.f66051a);
                    if (nodeD10 != null) {
                        j jVar = new j();
                        String strB3 = w1.b(nodeD10, POBCoreNativeConstants.NATIVE_REQUIRED_FIELD);
                        if (!"all".equalsIgnoreCase(strB3)) {
                            "none".equalsIgnoreCase(strB3);
                        }
                        ArrayList arrayListC4 = w1.c(nodeD10, com.taurusx.tax.f.y.f66058y);
                        jVar.f21211a.clear();
                        Iterator it10 = arrayListC4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.f21201a = w1.a(node5, "width");
                                hVar.f21202b = w1.a(node5, "height");
                                hVar.f21203c = w1.b(node5, "id");
                                w1.b(node5, "apiFramework");
                                w1.a(node5, "expandedWidth");
                                w1.a(node5, "expandedHeight");
                                Node nodeD11 = w1.d(node5, VastResourceXmlManager.STATIC_RESOURCE);
                                if (nodeD11 != null) {
                                    l lVar = new l();
                                    it2 = it10;
                                    lVar.f21212a = w1.b(nodeD11, "creativeType");
                                    lVar.f21213b = w1.a(nodeD11);
                                    hVar.f21204d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                Node nodeD12 = w1.d(node5, VastResourceXmlManager.HTML_RESOURCE);
                                if (nodeD12 != null) {
                                    hVar.f21206f = w1.a(nodeD12);
                                }
                                Node nodeD13 = w1.d(node5, VastResourceXmlManager.IFRAME_RESOURCE);
                                if (nodeD13 != null) {
                                    hVar.f21205e = w1.a(nodeD13);
                                }
                                Node nodeD14 = w1.d(node5, com.taurusx.tax.f.c.f66001o);
                                if (nodeD14 != null) {
                                    hVar.f21207g = w1.a(nodeD14);
                                }
                                hVar.f21208h.clear();
                                ArrayList arrayListC5 = w1.c(node5, com.taurusx.tax.f.c.f66002s);
                                if (arrayListC5.size() > 0) {
                                    Iterator it11 = arrayListC5.iterator();
                                    while (it11.hasNext()) {
                                        String strA4 = w1.a((Node) it11.next());
                                        if (!TextUtils.isEmpty(strA4)) {
                                            hVar.f21208h.add(strA4);
                                        }
                                    }
                                }
                                hVar.f21210j.clear();
                                Node nodeD15 = w1.d(node5, "TrackingEvents");
                                if (nodeD15 != null) {
                                    ArrayList<Node> arrayListC6 = w1.c(nodeD15, "Tracking");
                                    if (!arrayListC6.isEmpty()) {
                                        for (Node node6 : arrayListC6) {
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.f21244a = w1.b(node6, "event");
                                                wVar.f21245b = w1.a(node6);
                                                wVar.f21246c = w1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.f21210j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f21211a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.f21215b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.f21195c.add(mVar);
                }
                it6 = it;
            }
        }
        Node nodeD16 = w1.d(node, com.taurusx.tax.f.y.f66056t);
        if (nodeD16 != null) {
            for (Node node7 : w1.c(nodeD16, VastExtensionParentXmlManager.f66980w)) {
                if (com.taurusx.tax.f.z.f66069w.equalsIgnoreCase(w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(w1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeD17 = w1.d(node7, "FMPCompanionAssets");
                    if (nodeD17 != null) {
                        o oVar = new o();
                        String strB4 = w1.b(nodeD17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(strB4) || "0".equals(strB4)) {
                            oVar.f21220d = false;
                        }
                        Node nodeD18 = w1.d(nodeD17, "Name");
                        if (nodeD18 != null) {
                            oVar.f21217a = w1.a(nodeD18);
                        }
                        Node nodeD19 = w1.d(nodeD17, "Description");
                        if (nodeD19 != null) {
                            w1.a(nodeD19);
                        }
                        oVar.f21218b.clear();
                        Node nodeD20 = w1.d(nodeD17, com.taurusx.tax.f.s.f66027t);
                        if (nodeD20 != null) {
                            Iterator it12 = w1.c(nodeD20, com.taurusx.tax.f.s.f66014g).iterator();
                            while (it12.hasNext()) {
                                oVar.f21218b.add(w1.a((Node) it12.next()));
                            }
                        }
                        Node nodeD21 = w1.d(nodeD17, "Rating");
                        if (nodeD21 != null) {
                            try {
                                Float.parseFloat(w1.a(nodeD21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeD22 = w1.d(nodeD17, "Screenshots");
                        if (nodeD22 != null) {
                            oVar.f21219c = new ArrayList();
                            Iterator it13 = w1.c(nodeD22, "Screenshot").iterator();
                            while (it13.hasNext()) {
                                String strA5 = w1.a((Node) it13.next());
                                if (!TextUtils.isEmpty(strA5)) {
                                    oVar.f21219c.add(strA5);
                                }
                            }
                        }
                        gVar.f21197e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(w1.b(node7, "type"))) {
                    Node nodeD23 = w1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (nodeD23 != null) {
                        nVar.f21216a = w1.a(nodeD23);
                    }
                    if (!TextUtils.isEmpty(nVar.f21216a)) {
                        gVar.f21200h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(w1.b(node7, "type")) && (nodeD = w1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node nodeD24 = w1.d(nodeD, "DTSPNm");
                    if (nodeD24 != null) {
                        vVar.f21236b = w1.a(nodeD24);
                    }
                    Node nodeD25 = w1.d(nodeD, "DTSPTUrl");
                    if (nodeD25 != null) {
                        vVar.f21237c = w1.a(nodeD25);
                    }
                    Node nodeD26 = w1.d(nodeD, "DTSPPNm");
                    if (nodeD26 != null) {
                        vVar.f21243i = w1.a(nodeD26);
                    }
                    Node nodeD27 = w1.d(nodeD, "DTSPIap");
                    if (nodeD27 != null) {
                        vVar.f21238d = w1.a(nodeD27);
                    }
                    Node nodeD28 = w1.d(nodeD, "DTSPCads");
                    if (nodeD28 != null) {
                        vVar.f21239e = w1.a(nodeD28);
                    }
                    Node nodeD29 = w1.d(nodeD, "DTSPMedia");
                    if (nodeD29 != null && (childNodes2 = nodeD29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i10 = 0; i10 < childNodes2.getLength(); i10++) {
                            Node nodeItem = childNodes2.item(i10);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strA6 = w1.a(nodeItem);
                                if (!TextUtils.isEmpty(strA6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f21240f.add(strA6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.f21241g.add(strA6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f21235a = strA6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeD30 = w1.d(nodeD, "DTSPMetadata");
                    if (nodeD30 != null && (childNodes = nodeD30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strA7 = null;
                        String strA8 = null;
                        String strA9 = null;
                        for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                            Node nodeItem2 = childNodes.item(i11);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strA7 = w1.a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strA8 = w1.a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strA9 = w1.a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strA7) && !TextUtils.isEmpty(strA8) && !TextUtils.isEmpty(strA9)) {
                            vVar.f21242h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(strA8, strA7, strA9);
                        }
                    }
                    gVar.f21199g = vVar;
                }
            }
        }
        a(node);
    }
}
