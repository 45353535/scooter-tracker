package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.C3709ff;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3709ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3903n9 f38580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f38583e;

    public C3709ff(Context context, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38579a = context;
        this.f38580b = c3903n9;
        this.f38581c = "";
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        this.f38583e = ((SignalsConfig) Y3.f38021a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C3658df a() {
        if (this.f38582d) {
            return new C3658df(MapsKt.hashMapOf(TuplesKt.to("n-h-id", this.f38581c)));
        }
        C3903n9 c3903n9 = this.f38580b;
        if (c3903n9 != null) {
            c3903n9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C3658df(MapsKt.emptyMap());
    }

    public final void b() {
        String networkOperatorName;
        Context context = this.f38579a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f38583e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                networkOperatorName = "";
            }
            List<String> carrierNames = this.f38583e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (StringsKt.e0(networkOperatorName, (String) it.next(), true)) {
                        try {
                            String strA = a(this.f38579a);
                            this.f38582d = true;
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random();
                            for (int i10 = 0; i10 < 40; i10++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                                if (cCharAt == 'x') {
                                    sb2.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            this.f38581c = string;
                            ((C4077u9) He.f37018c.getValue()).a(new C3735gf(this.f38583e, new C3683ef(string, strA), this.f38580b).a()).q(new Function1() { // from class: w3.b7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C3709ff.a(this.f106991b, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3903n9 c3903n9 = this.f38580b;
        if (c3903n9 != null) {
            c3903n9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final Unit a(C3709ff c3709ff, Throwable th2) {
        if (th2 == null) {
            C3903n9 c3903n9 = c3709ff.f38580b;
            if (c3903n9 != null) {
                c3903n9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3903n9 c3903n92 = c3709ff.f38580b;
            if (c3903n92 != null) {
                c3903n92.a("NovatiqDataHandler", "Error: " + th2);
            }
        }
        return Unit.f93236a;
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.V(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, null) + "_app";
    }
}
