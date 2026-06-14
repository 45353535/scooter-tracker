package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f21104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f21105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaEvents f21106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21107d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21108e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f21109f;

    public final void a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th2.getMessage();
        t0 t0Var = this.f21109f;
        z.a(simpleName, str, t0Var != null ? t0Var.f21035a : null, t0Var != null ? t0Var.f21036b : null);
    }

    public final ArrayList a(List list) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f21112a != null) {
                    if (!TextUtils.isEmpty(hVar.f21116e) && !TextUtils.isEmpty(hVar.f21115d)) {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.f21116e, hVar.f21112a, hVar.f21115d);
                    } else {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f21112a);
                    }
                    verificationScriptResource = verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
