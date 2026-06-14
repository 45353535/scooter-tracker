package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Node f104226a;

    public i(@NonNull Node node) {
        this.f104226a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f104226a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f104226a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f104226a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f104226a, com.taurusx.tax.f.a.f65992s).intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f104226a, "md5");
    }
}
