package io.sentry;

import j$.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f83509b;

    public g0(String str) {
        Pattern patternCompile;
        this.f83508a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            k5.t().getOptions().getLogger().c(g7.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f83509b = patternCompile;
    }

    public String a() {
        return this.f83508a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f83509b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f83508a, ((g0) obj).f83508a);
    }

    public int hashCode() {
        return Objects.hash(this.f83508a);
    }
}
