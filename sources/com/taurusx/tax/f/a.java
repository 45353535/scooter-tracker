package com.taurusx.tax.f;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65988a = "minBitrate";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65989c = "delivery";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f65990n = "maxBitrate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f65991o = "type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f65992s = "bitrate";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f65993w = "width";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f65994y = "height";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f65995z;

    public a(Node node) {
        r.z(node, "mediaNode cannot be null");
        this.f65995z = node;
    }

    public String c() {
        return m0.z(this.f65995z);
    }

    public String o() {
        return m0.z(this.f65995z, "type");
    }

    public Integer s() {
        return m0.w(this.f65995z, "width");
    }

    public String w() {
        return m0.z(this.f65995z, "delivery");
    }

    public Integer y() {
        return m0.w(this.f65995z, "height");
    }

    public Integer z() {
        Integer numW = m0.w(this.f65995z, f65992s);
        if (numW != null) {
            return numW;
        }
        Integer numW2 = m0.w(this.f65995z, f65988a);
        Integer numW3 = m0.w(this.f65995z, f65990n);
        return (numW2 == null || numW3 == null) ? numW2 != null ? numW2 : numW3 : Integer.valueOf((numW2.intValue() + numW3.intValue()) / 2);
    }
}
