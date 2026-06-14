package oe;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Charset f96946c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f96944a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f96945b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Charset f96947d = Charsets.UTF_8;

    public final Map a() {
        return this.f96945b;
    }

    public final Set b() {
        return this.f96944a;
    }

    public final Charset c() {
        return this.f96947d;
    }

    public final Charset d() {
        return this.f96946c;
    }
}
