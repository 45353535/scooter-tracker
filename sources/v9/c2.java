package v9;

import android.media.metrics.LogSessionId;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c2 f105863d = new c2("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f105865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f105866c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f105867a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            q9.a.g(this.f105867a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f105867a = logSessionId;
        }
    }

    public c2(String str) {
        this.f105864a = str;
        this.f105865b = q9.o0.f98837a >= 31 ? new a() : null;
        this.f105866c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) q9.a.e(this.f105865b)).f105867a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) q9.a.e(this.f105865b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Objects.equals(this.f105864a, c2Var.f105864a) && Objects.equals(this.f105865b, c2Var.f105865b) && Objects.equals(this.f105866c, c2Var.f105866c);
    }

    public int hashCode() {
        return Objects.hash(this.f105864a, this.f105865b, this.f105866c);
    }
}
