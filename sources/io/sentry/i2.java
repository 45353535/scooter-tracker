package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
final class i2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83602b;

    i2(v7 v7Var) {
        this.f83602b = v7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f83602b.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f83602b.getLogger().c(g7.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.f83602b.isEnableAutoSessionTracking()) {
            this.f83602b.getLogger().c(g7.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f83602b.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof io.sentry.cache.f) {
            io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
            fVar.y(io.sentry.cache.f.v(cacheDirPath), io.sentry.cache.f.x(cacheDirPath));
            fVar.u();
        }
    }
}
