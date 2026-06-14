package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f48021a;

    private c() {
    }

    public static c a() {
        if (f48021a == null) {
            synchronized (c.class) {
                try {
                    if (f48021a == null) {
                        f48021a = new c();
                    }
                } finally {
                }
            }
        }
        return f48021a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("close")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals(NativeAdPresenter.DOWNLOAD)) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals(Constants.DEEPLINK) && str.equals("activity")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                aVar = new d();
            }
            if (str.equals("notice")) {
                aVar = new e();
            }
            if (str.equals("permissionInfo")) {
                aVar = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return aVar;
    }
}
