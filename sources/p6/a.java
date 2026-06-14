package p6;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l6.a f98067a;

    public a(l6.a aVar) {
        this.f98067a = aVar;
    }

    public AdRequest a() {
        return c().build();
    }

    public AdRequest b(String str) {
        return str.isEmpty() ? a() : c().setAdString(str).build();
    }

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f98067a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f98067a.a());
    }
}
