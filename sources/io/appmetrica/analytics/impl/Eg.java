package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public final class Eg implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dg f75739b;

    public Eg(@NonNull String str) {
        this(str, new Dg());
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return a(context, new C5067ee());
    }

    public final AdTrackingInfoResult b(Context context) throws NoSuchMethodException {
        int i10 = AdvIdentifiersProvider.f75375a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.f75738a);
        Dg dg2 = this.f75739b;
        Object[] objArr = {context, bundle};
        AdTrackingInfo adTrackingInfo = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        dg2.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            Object obj = C5.f75606a.get(bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
            if (obj == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            adTrackingInfo = new AdTrackingInfo((AdTrackingInfo.Provider) obj, bundle3.getString("io.appmetrica.analytics.identifiers.extra.ID"), bundle3.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED")) : null);
        }
        return new AdTrackingInfoResult(adTrackingInfo, IdentifierStatus.INSTANCE.from(bundle2.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), bundle2.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
    }

    public Eg(String str, Dg dg2) {
        this.f75738a = str;
        this.f75739b = dg2;
    }

    @Override // io.appmetrica.analytics.impl.K
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull Li li) {
        AdTrackingInfoResult adTrackingInfoResult;
        AdTrackingInfoResult adTrackingInfoResult2;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            Ln ln = (Ln) li;
            ln.f76100c = 0;
            adTrackingInfoResult = null;
            while (ln.b()) {
                try {
                    return b(context);
                } catch (InvocationTargetException e10) {
                    String message = e10.getTargetException() != null ? e10.getTargetException().getMessage() : null;
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f75738a + " adv_id: " + message);
                    adTrackingInfoResult = adTrackingInfoResult2;
                    try {
                        Thread.sleep(((Ln) li).f76099b);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    adTrackingInfoResult2 = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "exception while fetching " + this.f75738a + " adv_id: " + th2.getMessage());
                    adTrackingInfoResult = adTrackingInfoResult2;
                    Thread.sleep(((Ln) li).f76099b);
                }
            }
        } else {
            adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        }
        return adTrackingInfoResult == null ? new AdTrackingInfoResult() : adTrackingInfoResult;
    }
}
