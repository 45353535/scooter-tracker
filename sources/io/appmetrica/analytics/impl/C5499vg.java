package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5499vg implements InterfaceC5350pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f78457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f78458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5424sg f78459c;

    public C5499vg() {
        this(C5468ua.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5350pg
    public final synchronized void a(@Nullable C5424sg c5424sg) {
        if (c5424sg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c5424sg.f78239d.f78156a, c5424sg.f78236a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f78459c = c5424sg;
        this.f78458b = true;
        Iterator it = this.f78457a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5224kg) it.next()).a(this.f78459c);
        }
        this.f78457a.clear();
    }

    public C5499vg(C5375qg c5375qg) {
        this.f78457a = new HashSet();
        c5375qg.a(new Bl(this));
        c5375qg.a();
    }

    public final synchronized void a(@NonNull InterfaceC5224kg interfaceC5224kg) {
        this.f78457a.add(interfaceC5224kg);
        if (this.f78458b) {
            interfaceC5224kg.a(this.f78459c);
            this.f78457a.remove(interfaceC5224kg);
        }
    }
}
