package z9;

import java.util.Map;
import java.util.UUID;
import z9.n;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.a f119191a;

    public c0(n.a aVar) {
        this.f119191a = (n.a) q9.a.e(aVar);
    }

    @Override // z9.n
    public t9.b getCryptoConfig() {
        return null;
    }

    @Override // z9.n
    public n.a getError() {
        return this.f119191a;
    }

    @Override // z9.n
    public final UUID getSchemeUuid() {
        return n9.f.f95287a;
    }

    @Override // z9.n
    public int getState() {
        return 1;
    }

    @Override // z9.n
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // z9.n
    public Map queryKeyStatus() {
        return null;
    }

    @Override // z9.n
    public boolean requiresSecureDecoder(String str) {
        return false;
    }

    @Override // z9.n
    public void a(u.a aVar) {
    }

    @Override // z9.n
    public void b(u.a aVar) {
    }
}
