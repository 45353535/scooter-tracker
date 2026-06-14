package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: loaded from: classes12.dex */
public class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gf f76217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f76218b;

    public P3(Gf gf2, CounterConfiguration counterConfiguration) {
        this.f76217a = gf2;
        this.f76218b = counterConfiguration;
    }

    @Nullable
    public static P3 a(@NonNull Context context, @NonNull Bundle bundle) {
        Gf gf2;
        String str = Gf.f75823c;
        if (bundle != null) {
            try {
                gf2 = (Gf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
                gf2 = null;
            }
        } else {
            gf2 = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || gf2 == null || !context.getPackageName().equals(gf2.f75824a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || gf2.f75824a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new P3(gf2, counterConfigurationFromBundle);
    }

    @NonNull
    public final CounterConfiguration b() {
        return this.f76218b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f76217a + ", mCounterConfiguration=" + this.f76218b + '}';
    }

    @NonNull
    public final Gf a() {
        return this.f76217a;
    }
}
