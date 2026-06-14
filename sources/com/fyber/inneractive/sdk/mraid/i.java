package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends e {
    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int iA = a(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH);
        int iA2 = a("h");
        this.f21264c.a((String) this.f21263b.get("url"), iA <= 0 ? -1 : iA, iA2 <= 0 ? -1 : iA2, "true".equals(this.f21263b.get("shouldUseCustomClose")), "true".equals(this.f21263b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f21263b.get("url");
    }
}
