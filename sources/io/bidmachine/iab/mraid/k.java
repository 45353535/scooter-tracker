package io.bidmachine.iab.mraid;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f80234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f80235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f80236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f80237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f80238e;

    public k(Context context, String[] strArr) {
        this(context, strArr != null ? Arrays.asList(strArr) : null);
    }

    private boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean b() {
        return this.f80237d;
    }

    public boolean c() {
        return this.f80236c;
    }

    public boolean d() {
        return this.f80234a;
    }

    public boolean e() {
        return this.f80238e;
    }

    public boolean f() {
        return this.f80235b;
    }

    public k(Context context, List list) {
        b9.s sVar = new b9.s(context);
        boolean z10 = false;
        this.f80234a = a(MRAIDNativeFeature.SMS, list) && sVar.a();
        if (a(MRAIDNativeFeature.TEL, list) && sVar.a()) {
            z10 = true;
        }
        this.f80235b = z10;
        this.f80236c = a(MRAIDNativeFeature.INLINE_VIDEO, list);
        this.f80237d = a(MRAIDNativeFeature.CALENDAR, list);
        this.f80238e = a(MRAIDNativeFeature.STORE_PICTURE, list);
    }
}
