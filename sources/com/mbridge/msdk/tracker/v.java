package com.mbridge.msdk.tracker;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f52037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t.a f52038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private v.b<T> f52039y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f52040z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public v.b<T> C() {
        return this.f52039y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected Map<String, String> i() {
        return this.f52037w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public t.a l() {
        return this.f52038x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f52040z = wVar;
    }

    public void a(t.a aVar) {
        this.f52038x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f52037w = map;
    }

    public void a(v.b<T> bVar) {
        this.f52039y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f52040z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected void a(T t10) {
        v.b<T> bVarC = C();
        this.f52039y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
