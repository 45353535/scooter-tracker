package com.taurusx.tax.f;

import android.text.TextUtils;
import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.vast.VastResourceXmlManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65996a = "event";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65997c = "TrackingEvents";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65998f = "creativeView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65999g = "adSlotID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66000n = "width";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66001o = "CompanionClickThrough";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66002s = "CompanionClickTracking";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66003t = "height";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66004y = "Tracking";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final VastResourceXmlManager f66005w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66006z;

    public c(Node node) {
        r.z(node, "companionNode cannot be null");
        this.f66006z = node;
        this.f66005w = new VastResourceXmlManager(node);
    }

    public Integer a() {
        return m0.w(this.f66006z, "width");
    }

    public List<VastTracker> c() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66006z, "TrackingEvents");
        if (nodeY != null) {
            Iterator<Node> it = m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("creativeView")).iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (strZ != null) {
                    arrayList.add(new VastTracker.Builder(strZ).build());
                }
            }
        }
        return arrayList;
    }

    public boolean n() {
        return (TextUtils.isEmpty(this.f66005w.y()) && TextUtils.isEmpty(this.f66005w.z()) && TextUtils.isEmpty(this.f66005w.w())) ? false : true;
    }

    public Integer o() {
        return m0.w(this.f66006z, "height");
    }

    public VastResourceXmlManager s() {
        return this.f66005w;
    }

    public String w() {
        return m0.z(m0.y(this.f66006z, f66001o));
    }

    public List<VastTracker> y() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = m0.c(this.f66006z, f66002s);
        if (listC != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (!TextUtils.isEmpty(strZ)) {
                    arrayList.add(new VastTracker.Builder(strZ).build());
                }
            }
        }
        return arrayList;
    }

    public String z() {
        return m0.z(this.f66006z, f65999g);
    }
}
