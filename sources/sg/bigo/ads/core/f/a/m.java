package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import com.taurusx.tax.f.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Document f104243a;

    public final List<d> a() {
        ArrayList arrayList = new ArrayList();
        Document document = this.f104243a;
        if (document != null) {
            NodeList elementsByTagName = document.getElementsByTagName(t.f66040o);
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                arrayList.add(new d(elementsByTagName.item(i10)));
            }
        }
        return arrayList;
    }

    public final List<n> b() {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = this.f104243a.getElementsByTagName("Error");
        for (int i10 = 0; i10 < elementsByTagName.getLength() && (listC = sg.bigo.ads.core.f.a.c(elementsByTagName.item(i10), "Error")) != null; i10++) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }
}
