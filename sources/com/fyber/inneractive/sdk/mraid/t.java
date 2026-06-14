package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends f {
    public t(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        Map map = this.f21263b;
        this.f21264c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.f21263b.get("allowOrientationChange"))) ? false : true, (String) this.f21263b.get("forceOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }
}
