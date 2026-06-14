package com.taurusx.tax.vast;

import com.taurusx.tax.g.m0;
import com.taurusx.tax.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class VastExtensionParentXmlManager {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f66980w = "Extension";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Node f66981z;

    public VastExtensionParentXmlManager(Node node) {
        r.z(node);
        this.f66981z = node;
    }

    public List<VastExtensionXmlManager> z() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = m0.c(this.f66981z, f66980w);
        if (listC != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(new VastExtensionXmlManager(it.next()));
            }
        }
        return arrayList;
    }
}
