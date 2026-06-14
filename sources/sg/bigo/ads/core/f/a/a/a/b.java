package sg.bigo.ads.core.f.a.a.a;

import androidx.annotation.NonNull;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements sg.bigo.ads.core.f.a.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Node f104186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<sg.bigo.ads.core.f.a.a.d> f104187b;

    public b(@NonNull Node node) {
        this.f104186a = node;
    }

    @Override // sg.bigo.ads.core.f.a.a.b
    public final List<sg.bigo.ads.core.f.a.a.d> a() {
        if (this.f104187b == null) {
            this.f104187b = new ArrayList();
            Iterator<Node> it = sg.bigo.ads.core.f.a.c(this.f104186a, y.f66058y).iterator();
            while (it.hasNext()) {
                this.f104187b.add(new d(it.next()));
            }
        }
        return this.f104187b;
    }
}
