package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f51879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f51880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f51881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f51882z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f51879w = j10;
        } else {
            this.f51879w = 60000L;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f51880x == null) {
            this.f51880x = new HashMap();
        }
        try {
            this.f51880x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f51881y == null) {
            this.f51881y = new HashMap();
        }
        try {
            this.f51881y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f51881y == null) {
            this.f51881y = new HashMap();
        }
        this.f51881y.put("Charset", "UTF-8");
        return this.f51881y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected Map<String, String> i() {
        if (this.f51880x == null) {
            this.f51880x = new HashMap();
        }
        return this.f51880x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f51882z == null) {
            this.f51882z = new e(30000, this.f51879w, 3);
        }
        return this.f51882z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
