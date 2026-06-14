package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f21234b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.f21233a = w1.b(node, "version");
        ArrayList<Node> arrayListC = w1.c(node, com.taurusx.tax.f.t.f66040o);
        if (!arrayListC.isEmpty()) {
            uVar.f21234b = new ArrayList();
            for (Node node2 : arrayListC) {
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.f21190a = w1.b(node2, "id");
                    Node nodeD = w1.d(node2, com.taurusx.tax.f.w.f66049y);
                    if (nodeD != null) {
                        fVar2.f21191b = a0.c(nodeD);
                    }
                    Node nodeD2 = w1.d(node2, com.taurusx.tax.f.w.f66048w);
                    if (nodeD2 != null) {
                        fVar2.f21192c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.f21234b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f21233a + "\nAds: ").toString();
    }
}
