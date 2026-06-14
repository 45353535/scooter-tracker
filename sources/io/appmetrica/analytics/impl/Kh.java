package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class Kh extends P3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected I8 f76024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C5598zf f76025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f76027f;

    public Kh(@NonNull Gf gf2, @NonNull CounterConfiguration counterConfiguration, @NonNull I8 i82) {
        this(gf2, counterConfiguration, i82, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f76218b.toBundle(bundle);
        Gf gf2 = this.f76217a;
        synchronized (gf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf2);
        }
        return bundle;
    }

    @Nullable
    public final synchronized String d() {
        I8 i82;
        i82 = this.f76024c;
        return i82.f75926a.isEmpty() ? null : new JSONObject(i82.f75926a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f76027f;
    }

    public boolean f() {
        return this.f76026e;
    }

    public Kh(@NonNull Gf gf2, @NonNull CounterConfiguration counterConfiguration, @NonNull I8 i82, @Nullable String str) {
        super(gf2, counterConfiguration);
        this.f76026e = true;
        this.f76027f = str;
        this.f76024c = i82;
    }
}
