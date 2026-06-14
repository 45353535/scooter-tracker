package io.sentry;

import java.net.URI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f83491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83492b;

    public f4(v7 v7Var) {
        io.sentry.util.w.c(v7Var, "options is required");
        this.f83491a = v7Var.retrieveParsedDsn();
        this.f83492b = v7Var.getSentryClientName();
    }

    public e4 a() {
        String str;
        URI uriC = this.f83491a.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = this.f83491a.a();
        String strB = this.f83491a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f83492b);
        sb2.append(",sentry_key=");
        sb2.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb2.append(str);
        String string2 = sb2.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", this.f83492b);
        map.put("X-Sentry-Auth", string2);
        return new e4(string, map);
    }
}
