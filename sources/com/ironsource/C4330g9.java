package com.ironsource;

import com.ironsource.Ee;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4330g9 {

    /* JADX INFO: renamed from: com.ironsource.g9$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43181a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43181a = iArr;
        }
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        S7.a(S7.f41731a, runnable, 0L, 2, null);
    }

    public final void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        S7.f41731a.a(callback);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull List<? extends IronSourceAds.AdFormat> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i10 = a.f43181a[it.next().ordinal()];
            if (i10 == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i10 == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i10 == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final C4318fe b(@NotNull C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C4318fe(error.c(), "serverResponseIsNotValid") : error;
    }

    @NotNull
    public final IronSourceError a(@NotNull C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C4598w5.f45712a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C4598w5.f45712a.c();
        }
        return C4598w5.f45712a.b();
    }

    public final void a(long j10, @NotNull Ee.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put("duration", j10);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Ib.f41088s.d().q().a(new C4649z5(A5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(@NotNull C4318fe error, long j10) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("errorCode", error.c());
            jSONObjectB.put("reason", error.d());
            jSONObjectB.put("duration", j10);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Ib.f41088s.d().q().a(new C4649z5(A5.SDK_INIT_FAILED, jSONObjectB));
    }
}
