package com.taurusx.tax.vast;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VastResourceXmlManager {
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String HTML_RESOURCE = "HTMLResource";
    public static final String IFRAME_RESOURCE = "IFrameResource";
    public static final String STATIC_RESOURCE = "StaticResource";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f67022z;

    public VastResourceXmlManager(Node node) {
        r.z(node);
        this.f67022z = node;
    }

    public String c() {
        String strZ = m0.z(m0.y(this.f67022z, STATIC_RESOURCE), "creativeType");
        if (strZ != null) {
            return strZ.toLowerCase();
        }
        return null;
    }

    public String w() {
        return m0.z(m0.y(this.f67022z, IFRAME_RESOURCE));
    }

    public String y() {
        return m0.z(m0.y(this.f67022z, STATIC_RESOURCE));
    }

    public String z() {
        return m0.z(m0.y(this.f67022z, HTML_RESOURCE));
    }
}
