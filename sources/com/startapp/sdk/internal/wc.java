package com.startapp.sdk.internal;

import android.widget.ImageButton;
import androidx.annotation.NonNull;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class wc extends w1 {
    final /* synthetic */ xc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(xc xcVar, @NonNull v1 v1Var) {
        super(v1Var);
        this.this$0 = xcVar;
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void close() {
        xc xcVar = this.this$0;
        MraidState mraidState = MraidState.HIDDEN;
        xcVar.f65543b = mraidState;
        vi.a(xcVar.f65542a.f65681v, true, "mraid.fireStateChangeEvent", mraidState.toString());
        oa oaVar = this.this$0.f65542a.K;
        oaVar.f65013a.i();
        oaVar.f65013a.b();
    }

    public void fireViewableChangeEvent() {
        ag agVar;
        xc xcVar = this.this$0;
        vi.a(xcVar.f65542a.f65681v, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(xcVar.f65551j));
        xc xcVar2 = this.this$0;
        if (!xcVar2.f65551j || (agVar = xcVar2.f65542a.f65685z) == null) {
            return;
        }
        agVar.b();
    }

    @Override // com.startapp.sdk.internal.w1
    public boolean isFeatureSupported(String str) {
        xc xcVar = this.this$0;
        if (xcVar.f65545d == null) {
            xcVar.f65545d = new zc(xcVar.f65542a.f65429a);
        }
        return xcVar.f65545d.f65694b.contains(str);
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void setOrientationProperties(@NonNull Map<String, String> map) {
        boolean z10 = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        xc xcVar = this.this$0;
        if (xcVar.f65546e == null) {
            xcVar.f65546e = new ad();
        }
        ad adVar = xcVar.f65546e;
        if (adVar.f64267a == z10) {
            int i10 = adVar.f64268b;
            int iIndexOf = ad.f64266c.indexOf(str);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            if (i10 == iIndexOf) {
                return;
            }
        }
        adVar.f64267a = z10;
        int iIndexOf2 = ad.f64266c.indexOf(str);
        adVar.f64268b = iIndexOf2 != -1 ? iIndexOf2 : 2;
        applyOrientationProperties(this.this$0.f65542a.f65429a, adVar);
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void useCustomClose(String str) {
        boolean z10 = Boolean.parseBoolean(str);
        xc xcVar = this.this$0;
        if (xcVar.f65550i != z10) {
            xcVar.f65550i = z10;
            if (!z10) {
                xcVar.f65542a.t();
                return;
            }
            za zaVar = xcVar.f65542a;
            zaVar.getClass();
            try {
                ImageButton imageButton = zaVar.f65683x;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
    }
}
