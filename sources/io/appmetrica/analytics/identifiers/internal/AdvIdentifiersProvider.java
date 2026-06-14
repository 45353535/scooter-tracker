package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.d;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public class AdvIdentifiersProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f75375a = 0;
    private static final d retriever = new d();

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle bundle) {
        c cVarA;
        b bVar = (b) retriever.f75358a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (bVar == null || (cVarA = bVar.a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        a aVar = cVarA.f75356b;
        if (aVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", aVar.f75352a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", aVar.f75353b);
            Boolean bool = aVar.f75354c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", cVarA.f75355a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", cVarA.f75357c);
        return bundle2;
    }
}
