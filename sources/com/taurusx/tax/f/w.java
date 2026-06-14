package com.taurusx.tax.f;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66047c = "sequence";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66048w = "InLine";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66049y = "Wrapper";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66050z;

    public w(Node node) {
        r.z(node);
        this.f66050z = node;
    }

    public String w() {
        return m0.z(this.f66050z, f66047c);
    }

    public n y() {
        Node nodeY = m0.y(this.f66050z, f66049y);
        if (nodeY != null) {
            return new n(nodeY);
        }
        return null;
    }

    public o z() {
        Node nodeY = m0.y(this.f66050z, f66048w);
        if (nodeY != null) {
            return new o(nodeY);
        }
        return null;
    }
}
