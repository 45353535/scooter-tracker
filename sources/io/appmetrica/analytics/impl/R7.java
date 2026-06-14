package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f76339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f76340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P7 f76341d;

    public R7(boolean z10) {
        this.f76338a = z10;
    }

    public final void a(int i10) {
        P7 p72 = this.f76341d;
        String str = p72 == null ? null : p72.f76248c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f76339b;
        if (deferredDeeplinkListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i11 = i10 - 1;
            deferredDeeplinkListener.onError(i11 != 0 ? i11 != 1 ? i11 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f76339b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f76340c;
        if (deferredDeeplinkParametersListener != null) {
            if (i10 == 0) {
                throw null;
            }
            int i12 = i10 - 1;
            deferredDeeplinkParametersListener.onError(i12 != 0 ? i12 != 1 ? i12 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f76340c = null;
        }
    }

    public final void a() {
        P7 p72 = this.f76341d;
        if (p72 != null) {
            String str = p72.f76247b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f76339b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f76339b = null;
                }
                if (!no.a(this.f76341d.f76246a)) {
                    Map<String, String> map = this.f76341d.f76246a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f76340c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f76340c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f76341d.f76248c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f76340c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f76340c = null;
                    return;
                }
                return;
            }
            if (p72.f76248c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
