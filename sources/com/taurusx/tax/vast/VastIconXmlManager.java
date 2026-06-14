package com.taurusx.tax.vast;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VastIconXmlManager {
    public static final String DURATION = "duration";
    public static final String HEIGHT = "height";
    public static final String ICON_CLICKS = "IconClicks";
    public static final String ICON_CLICK_THROUGH = "IconClickThrough";
    public static final String ICON_CLICK_TRACKING = "IconClickTracking";
    public static final String ICON_VIEW_TRACKING = "IconViewTracking";
    public static final String OFFSET = "offset";
    public static final String WIDTH = "width";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final VastResourceXmlManager f66999w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f67000z;

    public VastIconXmlManager(Node node) {
        r.z(node);
        this.f67000z = node;
        this.f66999w = new VastResourceXmlManager(node);
    }

    public List<VastTracker> a() {
        List<Node> listC = m0.c(this.f67000z, ICON_VIEW_TRACKING);
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = listC.iterator();
        while (it.hasNext()) {
            String strZ = m0.z(it.next());
            if (strZ != null) {
                arrayList.add(new VastTracker.Builder(strZ).build());
            }
        }
        return arrayList;
    }

    public Integer c() {
        return m0.w(this.f67000z, "height");
    }

    public Integer n() {
        return m0.w(this.f67000z, "width");
    }

    public Integer o() {
        String strZ = m0.z(this.f67000z, "offset");
        try {
            return VastAbsoluteProgressTracker.INSTANCE.parseAbsoluteOffset(strZ);
        } catch (NumberFormatException unused) {
            LogUtil.v("taurusx", String.format("Invalid VAST icon offset format: %s:" + strZ, new Object[0]));
            return null;
        }
    }

    public VastResourceXmlManager s() {
        return this.f66999w;
    }

    public List<VastTracker> w() {
        Node nodeY = m0.y(this.f67000z, ICON_CLICKS);
        ArrayList arrayList = new ArrayList();
        if (nodeY != null) {
            Iterator<Node> it = m0.c(nodeY, ICON_CLICK_TRACKING).iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (strZ != null) {
                    arrayList.add(new VastTracker.Builder(strZ).build());
                }
            }
        }
        return arrayList;
    }

    public Integer y() {
        String strZ = m0.z(this.f67000z, "duration");
        try {
            return VastAbsoluteProgressTracker.INSTANCE.parseAbsoluteOffset(strZ);
        } catch (NumberFormatException unused) {
            LogUtil.v("taurusx", String.format("Invalid VAST icon duration format: %s:" + strZ, new Object[0]));
            return null;
        }
    }

    public String z() {
        Node nodeY = m0.y(this.f67000z, ICON_CLICKS);
        if (nodeY == null) {
            return null;
        }
        return m0.z(m0.y(nodeY, ICON_CLICK_THROUGH));
    }
}
