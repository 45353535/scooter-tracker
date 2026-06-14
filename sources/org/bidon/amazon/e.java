package org.bidon.amazon;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f97028b;

    public e(String appKey, Map slots) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.f97027a = appKey;
        this.f97028b = slots;
    }

    public final String a() {
        return this.f97027a;
    }

    public final Map b() {
        return this.f97028b;
    }
}
