package com.startapp.sdk.internal;

import android.content.Context;
import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class bh extends k6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vf f64319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Context context, vf prefs, z3 configProvider) {
        super(context, SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f64319e = prefs;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a(boolean z10) {
        ah ahVar = new ah();
        String string = z10 ? null : this.f64319e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f64817a;
            context.getPackageName();
            string = vi.b(context);
            uf ufVarEdit = this.f64319e.edit();
            ufVarEdit.a("a83b59c2138cbf65", string);
            ufVarEdit.f65346a.putString("a83b59c2138cbf65", string);
            ufVarEdit.apply();
        }
        ahVar.f64285a = string;
        return ahVar;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object c() {
        return new ah();
    }
}
