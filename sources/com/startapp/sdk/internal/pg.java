package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class pg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pg f65112d = new pg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65113a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65114b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MetaDataRequest$RequestReason f65115c = MetaDataRequest$RequestReason.LAUNCH;

    public final synchronized void a(Context context, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        this.f65113a = UUID.randomUUID().toString();
        this.f65114b = System.currentTimeMillis();
        this.f65115c = metaDataRequest$RequestReason;
        WeakHashMap weakHashMap = vi.f65408a;
        t tVar = t.f65279d;
        tVar.f65280a.clear();
        tVar.f65281b.clear();
        tVar.f65282c.clear();
        MetaData.E().a(context, new AdPreferences(), metaDataRequest$RequestReason, false, null, true);
    }
}
