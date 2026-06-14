package com.monetization.ads.exo.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.TreeMap;
import yads.ke;
import yads.p20;
import yads.tl0;
import yads.w83;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f59003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f59004c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p20 f59008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f59010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59011j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f59007f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f59006e = w83.a((Handler.Callback) this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tl0 f59005d = new tl0();

    public l(p20 p20Var, j jVar, ke keVar) {
        this.f59008g = p20Var;
        this.f59004c = jVar;
        this.f59003b = keVar;
    }

    public final boolean a(long j10) {
        p20 p20Var = this.f59008g;
        boolean z10 = false;
        if (!p20Var.f114529d) {
            return false;
        }
        if (this.f59010i) {
            return true;
        }
        Map.Entry entryCeilingEntry = this.f59007f.ceilingEntry(Long.valueOf(p20Var.f114533h));
        if (entryCeilingEntry != null && ((Long) entryCeilingEntry.getValue()).longValue() < j10) {
            ((c) this.f59004c).f58991a.onDashManifestPublishTimeExpired(((Long) entryCeilingEntry.getKey()).longValue());
            z10 = true;
        }
        if (z10) {
            a();
        }
        return z10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f59011j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        i iVar = (i) message.obj;
        long j10 = iVar.f58996a;
        long j11 = iVar.f58997b;
        Long l10 = (Long) this.f59007f.get(Long.valueOf(j11));
        if (l10 == null || l10.longValue() > j10) {
            this.f59007f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }

    public final void a() {
        if (this.f59009h) {
            this.f59010i = true;
            this.f59009h = false;
            ((c) this.f59004c).f58991a.onDashManifestRefreshRequested();
        }
    }
}
