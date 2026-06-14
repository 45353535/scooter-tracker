package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class md implements yz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd f113427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113428b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nd f113429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f113430d;

    public md(bd bdVar) {
        this.f113427a = bdVar;
    }

    public final void a() {
        nd ndVar = this.f113429c;
        if (ndVar != null) {
            tc tcVar = (tc) ndVar;
            tcVar.f116166a.f116956b.a();
            vf0.a(tcVar.f116166a.f116955a);
        }
    }

    public final List b() {
        return CollectionsKt.listOf((Object[]) new od[]{new od("adtuneRendered", new ld(this)), new od("adtuneClosed", new jd(this)), new od("openOptOut", new kd(this))});
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f113428b.iterator();
            while (it.hasNext()) {
                od odVar = (od) ((hd) it.next());
                if (odVar.a(scheme, host)) {
                    odVar.a();
                    return;
                }
            }
            nd ndVar = this.f113429c;
            if (ndVar != null) {
                ((tc) ndVar).f116166a.f116957c.a(str);
            }
        } catch (URISyntaxException unused) {
            boolean z10 = lb1.f113032a;
            a();
        }
    }

    @Override // yads.yz0
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                a();
                return;
            }
        }
    }
}
