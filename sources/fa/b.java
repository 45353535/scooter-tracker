package fa;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import ka.r;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r.a f71973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f71974b;

    public b(r.a aVar, List list) {
        this.f71973a = aVar;
        this.f71974b = list;
    }

    @Override // ka.r.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a parse(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f71973a.parse(uri, inputStream);
        List list = this.f71974b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.copy(this.f71974b);
    }
}
