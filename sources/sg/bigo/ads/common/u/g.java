package sg.bigo.ads.common.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.u.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f102772a;

    @NonNull
    public static c<sg.bigo.ads.common.u.c.a> a(@NonNull sg.bigo.ads.common.u.b.c cVar) {
        b.a aVar = new b.a();
        f102772a.c(cVar, aVar);
        return new c<>(aVar.f102735b, aVar.f102736c);
    }

    public static void a(@NonNull sg.bigo.ads.common.u.b.a aVar, @Nullable b bVar) {
        if (bVar == null) {
            bVar = b.f102733d;
        }
        f102772a.b(aVar, bVar);
    }
}
