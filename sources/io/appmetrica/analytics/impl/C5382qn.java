package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5382qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5431sn f78096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5431sn f78097b;

    public C5382qn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f78096a = new T2(new C5404rl(context));
            this.f78097b = new T2(new Sc(context));
        } else {
            this.f78096a = new C5061e8();
            this.f78097b = new C5061e8();
        }
    }
}
