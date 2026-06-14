package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f83431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f83432b;

    public e4(String str, Map map) {
        io.sentry.util.w.c(str, "url is required");
        io.sentry.util.w.c(map, "headers is required");
        try {
            this.f83431a = URI.create(str).toURL();
            this.f83432b = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public Map a() {
        return this.f83432b;
    }

    public URL b() {
        return this.f83431a;
    }
}
