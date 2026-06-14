package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5104g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f77194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f77195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zk f77196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uk f77197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ya f77198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f77199f;

    public AbstractC5104g(@NonNull C5058e5 c5058e5, @NonNull Vk vk, @NonNull Zk zk, @NonNull Uk uk, @NonNull Ya ya2, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f77194a = c5058e5;
        this.f77195b = vk;
        this.f77196c = zk;
        this.f77197d = uk;
        this.f77198e = ya2;
        this.f77199f = systemTimeProvider;
    }

    @NonNull
    public final /* bridge */ Ik a(@NonNull Object obj) {
        return a((Jk) obj);
    }

    @Nullable
    public final Ik b() {
        if (this.f77196c.h()) {
            return new Ik(this.f77194a, this.f77196c, a(), this.f77199f);
        }
        return null;
    }

    @NonNull
    public final Ik a(@NonNull Jk jk) {
        if (this.f77196c.h()) {
            this.f77198e.reportEvent("create session with non-empty storage");
        }
        C5058e5 c5058e5 = this.f77194a;
        Zk zk = this.f77196c;
        long jA = this.f77195b.a();
        Zk zk2 = this.f77196c;
        zk2.a(Zk.f76763f, Long.valueOf(jA));
        zk2.a(Zk.f76761d, Long.valueOf(jk.f76006a));
        zk2.a(Zk.f76765h, Long.valueOf(jk.f76006a));
        zk2.a(Zk.f76764g, 0L);
        zk2.a(Zk.f76766i, Boolean.TRUE);
        zk2.b();
        this.f77194a.f77066e.a(jA, this.f77197d.f76571a, TimeUnit.MILLISECONDS.toSeconds(jk.f76007b));
        return new Ik(c5058e5, zk, a(), new SystemTimeProvider());
    }

    public final Lk a() {
        Kk kk = new Kk(this.f77197d);
        kk.f76035g = this.f77196c.i();
        kk.f76034f = this.f77196c.f76769c.a(Zk.f76764g);
        kk.f76032d = this.f77196c.f76769c.a(Zk.f76765h);
        kk.f76031c = this.f77196c.f76769c.a(Zk.f76763f);
        kk.f76036h = this.f77196c.f76769c.a(Zk.f76761d);
        kk.f76029a = this.f77196c.f76769c.a(Zk.f76762e);
        return new Lk(kk);
    }
}
