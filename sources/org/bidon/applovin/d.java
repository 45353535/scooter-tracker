package org.bidon.applovin;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f97081c;

    public d(String key, String str, List list) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f97079a = key;
        this.f97080b = str;
        this.f97081c = list;
    }

    public final List a() {
        return this.f97081c;
    }

    public final String b() {
        return this.f97079a;
    }

    public final String c() {
        return this.f97080b;
    }
}
