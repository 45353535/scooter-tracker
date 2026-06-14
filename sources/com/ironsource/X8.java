package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f42059a;

    public X8(D0 d02) {
        this.f42059a = d02;
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f42059a.a(A0.INIT_STARTED, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f42059a.a(A0.INIT_ENDED, map);
    }

    public void a() {
        this.f42059a.a(A0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        map.put("reason", str);
        this.f42059a.a(A0.INIT_FAILED, map);
    }
}
