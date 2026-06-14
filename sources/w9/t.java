package w9;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes12.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f107761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f107763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f107764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f107765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f107766f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f107767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f107768b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f107769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f107770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f107771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f107772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f107773g;

        public a(AudioTrack audioTrack) {
            this.f107767a = audioTrack;
        }

        public void a() {
            this.f107772f = true;
        }

        public long b() {
            return this.f107771e;
        }

        public long c() {
            return this.f107768b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f107767a.getTimestamp(this.f107768b);
            if (timestamp) {
                long j10 = this.f107768b.framePosition;
                long j11 = this.f107770d;
                if (j11 > j10) {
                    if (this.f107772f) {
                        this.f107773g += j11;
                        this.f107772f = false;
                    } else {
                        this.f107769c++;
                    }
                }
                this.f107770d = j10;
                this.f107771e = j10 + this.f107773g + (this.f107769c << 32);
            }
            return timestamp;
        }
    }

    public t(AudioTrack audioTrack) {
        this.f107761a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f107762b = i10;
        if (i10 == 0) {
            this.f107765e = 0L;
            this.f107766f = -1L;
            this.f107763c = System.nanoTime() / 1000;
            this.f107764d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f107764d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f107764d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f107764d = 500000L;
        }
    }

    public void a() {
        if (this.f107762b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f107761a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f107761a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f107761a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f107762b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f107761a;
        if (aVar == null || j10 - this.f107765e < this.f107764d) {
            return false;
        }
        this.f107765e = j10;
        boolean zD = aVar.d();
        int i10 = this.f107762b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        h();
                        return zD;
                    }
                } else if (!zD) {
                    h();
                    return zD;
                }
            } else {
                if (!zD) {
                    h();
                    return zD;
                }
                if (this.f107761a.b() > this.f107766f) {
                    i(2);
                    return zD;
                }
            }
        } else {
            if (zD) {
                if (this.f107761a.c() < this.f107763c) {
                    return false;
                }
                this.f107766f = this.f107761a.b();
                i(1);
                return zD;
            }
            if (j10 - this.f107763c > 500000) {
                i(3);
            }
        }
        return zD;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f107761a != null) {
            i(0);
        }
    }
}
