package com.taurusx.tax.f;

import android.text.TextUtils;
import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66051a = "CompanionAds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66052c = "Linear";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66053n = "Error";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66054o = "Creatives";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66055s = "Creative";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66056t = "Extensions";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66057w = "Impression";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66058y = "Companion";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66059z;

    public y(Node node) {
        r.z(node);
        this.f66059z = node;
    }

    public List<s> c() {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66059z, f66054o);
        if (nodeY != null && (listC = m0.c(nodeY, f66055s)) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                Node nodeY2 = m0.y(it.next(), f66052c);
                if (nodeY2 != null) {
                    arrayList.add(new s(nodeY2));
                }
            }
        }
        return arrayList;
    }

    public VastExtensionParentXmlManager o() {
        Node nodeY = m0.y(this.f66059z, f66056t);
        if (nodeY == null) {
            return null;
        }
        return new VastExtensionParentXmlManager(nodeY);
    }

    public List<VastTracker> w() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = m0.c(this.f66059z, "Error");
        if (listC != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (!TextUtils.isEmpty(strZ)) {
                    arrayList.add(new VastTracker.Builder(strZ).isRepeatable(true).build());
                }
            }
        }
        return arrayList;
    }

    public List<VastTracker> y() {
        List<Node> listC = m0.c(this.f66059z, f66057w);
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = listC.iterator();
        while (it.hasNext()) {
            String strZ = m0.z(it.next());
            if (!TextUtils.isEmpty(strZ)) {
                arrayList.add(new VastTracker.Builder(strZ).build());
            }
        }
        return arrayList;
    }

    public List<c> z() {
        List<Node> listC;
        List<Node> listC2;
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66059z, f66054o);
        if (nodeY != null && (listC = m0.c(nodeY, f66055s)) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                Node nodeY2 = m0.y(it.next(), f66051a);
                if (nodeY2 != null && (listC2 = m0.c(nodeY2, f66058y)) != null) {
                    Iterator<Node> it2 = listC2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new c(it2.next()));
                    }
                }
            }
        }
        return arrayList;
    }
}
