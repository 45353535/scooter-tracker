package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4340h2 extends e.a {
    public C4340h2(R1 r12, URL url, JSONObject jSONObject, boolean z10, C4460o2 c4460o2) {
        super(r12, url, jSONObject, z10, c4460o2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z10, R1 r12, long j10) {
        try {
            if (z10) {
                ((InterfaceC4220a2) r12).a(this.f44003b, this.f44007f + 1, j10, this.f44011j, this.f44010i);
            } else {
                r12.a(this.f44004c, this.f44005d, this.f44007f + 1, this.f44008g, j10);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            r12.a(1009, e10.getMessage(), this.f44007f + 1, this.f44008g, j10);
        }
    }
}
