package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4621xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D0 f45828a;

    public C4621xb(D0 d02) {
        this.f45828a = d02;
    }

    public void a(boolean z10) {
        HashMap map = new HashMap();
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f45828a.a(A0.LOAD_AD, map);
    }

    public void b(int i10) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i10));
        this.f45828a.a(A0.SKIP_RELOAD_AD, map);
    }

    public void a() {
        this.f45828a.a(A0.RELOAD_AD, new HashMap());
    }

    public void b(long j10, int i10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        this.f45828a.a(A0.RELOAD_AD_NO_FILL, map);
    }

    public void a(int i10) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i10));
        this.f45828a.a(A0.DESTROY_AD, map);
    }

    public void a(long j10, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f45828a.a(A0.LOAD_AD_SUCCESS, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        this.f45828a.a(A0.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j10, int i10, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f45828a.a(A0.LOAD_AD_FAILED, map);
    }

    public void a(long j10, int i10, String str, boolean z10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f45828a.a(A0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f45828a.a(A0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(boolean z10, long j10, boolean z11) {
        A0 a02;
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        if (z11) {
            map.put("errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        D0 d02 = this.f45828a;
        if (z10) {
            a02 = A0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            a02 = A0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        d02.a(a02, map);
    }

    public void a(long j10, int i10) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j10));
        map.put("errorCode", Integer.valueOf(i10));
        this.f45828a.a(A0.LOAD_AD_NO_FILL, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f45828a.a(bool.booleanValue() ? A0.AD_READY_TRUE : A0.AD_READY_FALSE, map);
    }
}
