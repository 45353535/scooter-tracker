package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4960aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xl f76806a = new Xl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C5012ca f76807b = new C5012ca();

    public final synchronized void a(C5012ca c5012ca) {
        this.f76807b = c5012ca;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f76807b.f76960a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C5012ca c5012ca = this.f76807b;
                    IdentifierStatus identifierStatus = c5012ca.f76961b;
                    String str2 = c5012ca.f76962c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new lf.m();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f76806a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
