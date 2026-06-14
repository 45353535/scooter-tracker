package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class Yg extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f76712b;

    public Yg(@NonNull C5058e5 c5058e5, @NonNull IReporter iReporter) {
        super(c5058e5);
        this.f76712b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        Nc nc2 = (Nc) Nc.f76161c.get(w52.f76617d);
        HashMap map = new HashMap();
        map.put("type", nc2.f76162a);
        map.put("delivery_method", nc2.f76163b);
        this.f76712b.reportEvent("crash_saved", map);
        return false;
    }
}
