package com.taurusx.tax.f;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.vast.ViewabilityVendor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66060a = "event";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66061c = "vendor";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66062f = "omid";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66063g = "apiFramework";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f66064m = "verificationNotExecuted";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66065n = "VerificationParameters";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f66066o = "JavaScriptResource";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66067s = "TrackingEvents";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f66068t = "Tracking";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66069w = "AdVerifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66070y = "Verification";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Set<ViewabilityVendor> f66071z = new HashSet();

    public z(Node node) {
        if (node != null) {
            z(node);
        }
    }

    private void z(Node node) {
        List<Node> listC = m0.c(m0.y(node, f66069w), f66070y);
        if (listC == null || listC.isEmpty()) {
            return;
        }
        for (Node node2 : listC) {
            Node nodeZ = m0.z(node2, f66066o, "apiFramework", (List<String>) Collections.singletonList("omid"));
            if (nodeZ != null) {
                Node nodeZ2 = m0.z(m0.y(node2, "TrackingEvents"), "Tracking", "event", (List<String>) Collections.singletonList(f66064m));
                Node nodeY = m0.y(node2, f66065n);
                ViewabilityVendor.Builder builder = new ViewabilityVendor.Builder(m0.z(nodeZ));
                builder.withApiFramework("omid").withVendorKey(m0.z(node2, f66061c)).withVerificationParameters(m0.z(nodeY)).withVerificationNotExecuted(m0.z(nodeZ2));
                ViewabilityVendor viewabilityVendorBuild = builder.build();
                if (viewabilityVendorBuild != null) {
                    this.f66071z.add(viewabilityVendorBuild);
                }
            }
        }
    }

    public Set<ViewabilityVendor> z() {
        return this.f66071z;
    }
}
