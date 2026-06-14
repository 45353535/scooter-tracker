package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5482v implements InterfaceC5507w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78406a;

    public C5482v(@NotNull Context context) {
        this.f78406a = context;
    }

    @Nullable
    public final String a() {
        C5186j4 c5186j4L = C5186j4.l();
        Context context = this.f78406a;
        T9 t92 = c5186j4L.f77484t;
        if (t92 == null) {
            synchronized (c5186j4L) {
                try {
                    t92 = c5186j4L.f77484t;
                    if (t92 == null) {
                        t92 = new T9(context);
                        c5186j4L.f77484t = t92;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = t92.f76497d.getApplicationMetaData(t92.f76494a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
