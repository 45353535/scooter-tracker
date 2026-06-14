package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ed implements yz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c92 f110328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110329b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fd f110330c;

    public ed(c92 c92Var) {
        this.f110328a = c92Var;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f110329b.iterator();
            while (it.hasNext()) {
                od odVar = (od) ((hd) it.next());
                if (odVar.a(scheme, host)) {
                    odVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.yz0
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                fd fdVar = this.f110330c;
                if (fdVar != null) {
                    vf0.a(((zc) fdVar).f118608a.f108637a);
                    return;
                }
                return;
            }
        }
    }

    public final List a() {
        return CollectionsKt.listOf(new od("noInterestAd", new dd(this)));
    }
}
