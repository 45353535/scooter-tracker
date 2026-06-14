package com.taurusx.tax.f;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.vast.VastAbsoluteProgressTracker;
import com.taurusx.tax.vast.VastFractionalProgressTracker;
import com.taurusx.tax.vast.VastIconXmlManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class s {
    public static final int A = 0;
    public static final float B = 0.25f;
    public static final float C = 0.5f;
    public static final float D = 0.75f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66008a = "MediaFiles";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66009b = "progress";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66010c = "Tracking";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f66011d = "skip";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66012e = "midpoint";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66013f = "event";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66014g = "Icon";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66015h = "close";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f66016i = "creativeView";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66017j = "closeLinear";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f66018k = "thirdQuartile";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66019l = "firstQuartile";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f66020m = "offset";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66021n = "MediaFile";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66022o = "ClickThrough";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f66023p = "skipoffset";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f66024q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f66025r = "resume";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66026s = "ClickTracking";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66027t = "Icons";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f66028u = "complete";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f66029v = "start";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66030w = "TrackingEvents";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f66031x = "pause";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66032y = "VideoClicks";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66033z;

    public s(Node node) {
        r.z(node);
        this.f66033z = node;
    }

    public List<a> a() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, f66008a);
        if (nodeY != null) {
            Iterator<Node> it = m0.c(nodeY, f66021n).iterator();
            while (it.hasNext()) {
                arrayList.add(new a(it.next()));
            }
        }
        return arrayList;
    }

    public List<VastFractionalProgressTracker> c() {
        ArrayList arrayList = new ArrayList();
        z(arrayList, z("firstQuartile"), 0.25f);
        return arrayList;
    }

    public List<VastTracker> e() {
        return w("complete");
    }

    public List<VastTracker> f() {
        List<String> listZ = z("pause");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker.Builder(it.next()).isRepeatable(true).build());
        }
        return arrayList;
    }

    public List<VastFractionalProgressTracker> g() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, "TrackingEvents");
        if (nodeY != null) {
            for (Node node : m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("progress"))) {
                String strZ = m0.z(node, "offset");
                if (strZ != null) {
                    String strTrim = strZ.trim();
                    if (VastFractionalProgressTracker.INSTANCE.isPercentageTracker(strTrim)) {
                        String strZ2 = m0.z(node);
                        try {
                            float f10 = Float.parseFloat(strTrim.replace("%", "")) / 100.0f;
                            if (f10 >= 0.0f) {
                                arrayList.add(new VastFractionalProgressTracker.Builder(strZ2, f10).build());
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.v("taurusx", String.format("Failed to parse VAST progress tracker %s", strTrim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List<String> i() {
        return z("start");
    }

    public List<VastTracker> k() {
        return w("skip");
    }

    public List<VastTracker> l() {
        List<VastTracker> listW = w("close");
        listW.addAll(w("closeLinear"));
        return listW;
    }

    public List<VastTracker> m() {
        List<String> listZ = z("resume");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker.Builder(it.next()).isRepeatable(true).build());
        }
        return arrayList;
    }

    public List<VastFractionalProgressTracker> n() {
        ArrayList arrayList = new ArrayList();
        z(arrayList, z("midpoint"), 0.5f);
        return arrayList;
    }

    public List<VastFractionalProgressTracker> o() {
        ArrayList arrayList = new ArrayList();
        z(arrayList, z("firstQuartile"), 0.25f);
        z(arrayList, z("midpoint"), 0.5f);
        z(arrayList, z("thirdQuartile"), 0.75f);
        Node nodeY = m0.y(this.f66033z, "TrackingEvents");
        if (nodeY != null) {
            for (Node node : m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("progress"))) {
                String strZ = m0.z(node, "offset");
                if (strZ != null) {
                    String strTrim = strZ.trim();
                    if (VastFractionalProgressTracker.INSTANCE.isPercentageTracker(strTrim)) {
                        String strZ2 = m0.z(node);
                        try {
                            float f10 = Float.parseFloat(strTrim.replace("%", "")) / 100.0f;
                            if (f10 >= 0.0f) {
                                arrayList.add(new VastFractionalProgressTracker.Builder(strZ2, f10).build());
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.v("taurusx", String.format("Failed to parse VAST progress tracker %s", strTrim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public String p() {
        String strZ = m0.z(this.f66033z, f66023p);
        if (strZ == null || strZ.trim().isEmpty()) {
            return null;
        }
        return strZ.trim();
    }

    public List<VastIconXmlManager> s() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, f66027t);
        if (nodeY != null) {
            Iterator<Node> it = m0.c(nodeY, f66014g).iterator();
            while (it.hasNext()) {
                arrayList.add(new VastIconXmlManager(it.next()));
            }
        }
        return arrayList;
    }

    public List<VastAbsoluteProgressTracker> t() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, "TrackingEvents");
        if (nodeY != null) {
            for (Node node : m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("progress"))) {
                String strZ = m0.z(node, "offset");
                if (strZ != null) {
                    String strTrim = strZ.trim();
                    VastAbsoluteProgressTracker.Companion companion = VastAbsoluteProgressTracker.INSTANCE;
                    if (companion.isAbsoluteTracker(strTrim)) {
                        String strZ2 = m0.z(node);
                        try {
                            Integer absoluteOffset = companion.parseAbsoluteOffset(strTrim);
                            if (absoluteOffset != null && absoluteOffset.intValue() >= 0) {
                                arrayList.add(new VastAbsoluteProgressTracker.Builder(strZ2, absoluteOffset.intValue()).build());
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.v("taurusx", String.format("Failed to parse VAST progress tracker %s", strTrim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List<VastFractionalProgressTracker> v() {
        ArrayList arrayList = new ArrayList();
        z(arrayList, z("thirdQuartile"), 0.75f);
        return arrayList;
    }

    public String w() {
        Node nodeY = m0.y(this.f66033z, f66032y);
        if (nodeY == null) {
            return null;
        }
        return m0.z(m0.y(nodeY, f66022o));
    }

    public List<VastTracker> y() {
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, f66032y);
        if (nodeY != null) {
            Iterator<Node> it = m0.c(nodeY, f66026s).iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (strZ != null) {
                    arrayList.add(new VastTracker.Builder(strZ).build());
                }
            }
        }
        return arrayList;
    }

    public List<VastAbsoluteProgressTracker> z() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = z("start").iterator();
        while (it.hasNext()) {
            arrayList.add(new VastAbsoluteProgressTracker.Builder(it.next(), 0).build());
        }
        Node nodeY = m0.y(this.f66033z, "TrackingEvents");
        if (nodeY != null) {
            for (Node node : m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("progress"))) {
                String strZ = m0.z(node, "offset");
                if (strZ != null) {
                    String strTrim = strZ.trim();
                    VastAbsoluteProgressTracker.Companion companion = VastAbsoluteProgressTracker.INSTANCE;
                    if (companion.isAbsoluteTracker(strTrim)) {
                        String strZ2 = m0.z(node);
                        try {
                            Integer absoluteOffset = companion.parseAbsoluteOffset(strTrim);
                            if (absoluteOffset != null && absoluteOffset.intValue() >= 0) {
                                arrayList.add(new VastAbsoluteProgressTracker.Builder(strZ2, absoluteOffset.intValue()).build());
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.v("taurusx", String.format("Failed to parse VAST progress tracker %s", strTrim));
                        }
                    }
                }
            }
            Iterator<Node> it2 = m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList("creativeView")).iterator();
            while (it2.hasNext()) {
                String strZ3 = m0.z(it2.next());
                if (strZ3 != null) {
                    arrayList.add(new VastAbsoluteProgressTracker.Builder(strZ3, 0).build());
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<VastTracker> w(String str) {
        List<String> listZ = z(str);
        ArrayList arrayList = new ArrayList(listZ.size());
        Iterator<String> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new VastTracker.Builder(it.next()).build());
        }
        return arrayList;
    }

    private List<String> z(String str) {
        r.z(str);
        ArrayList arrayList = new ArrayList();
        Node nodeY = m0.y(this.f66033z, "TrackingEvents");
        if (nodeY != null) {
            Iterator<Node> it = m0.w(nodeY, "Tracking", "event", (List<String>) Collections.singletonList(str)).iterator();
            while (it.hasNext()) {
                String strZ = m0.z(it.next());
                if (strZ != null) {
                    arrayList.add(strZ);
                }
            }
        }
        return arrayList;
    }

    private void z(List<VastFractionalProgressTracker> list, List<String> list2, float f10) {
        r.z(list, "trackers cannot be null");
        r.z(list2, "urls cannot be null");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            list.add(new VastFractionalProgressTracker.Builder(it.next(), f10).build());
        }
    }
}
