package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.b2;
import com.startapp.sdk.internal.lb;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ad f64041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f64043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdEventListener f64044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f64045e;

    public d(Ad ad2, lb networkApiExecutor, Context context, AdEventListener adEventListener, String admParam) {
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admParam, "admParam");
        this.f64041a = ad2;
        this.f64042b = networkApiExecutor;
        this.f64043c = context;
        this.f64044d = adEventListener;
        this.f64045e = a2.a(admParam);
    }

    public abstract Object a(String str);

    @Override // com.startapp.sdk.internal.b2
    public final void a() {
        ((Executor) this.f64042b.a()).execute(new Runnable() { // from class: com.startapp.sdk.adsbase.t
            @Override // java.lang.Runnable
            public final void run() {
                d.a(this.f64162b);
            }
        });
    }

    public static final void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.a(this$0.f64045e) == null) {
            a0.a(this$0.f64043c, this$0.f64044d, this$0.f64041a, false);
            return;
        }
        Ad ad2 = this$0.f64041a;
        if (ad2 != null) {
            ad2.setState(Ad.AdState.READY);
        }
        a0.b(this$0.f64043c, this$0.f64044d, this$0.f64041a, false);
    }
}
