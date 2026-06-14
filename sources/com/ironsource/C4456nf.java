package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4511r3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4456nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.a, C4475p0> f44475a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.nf$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44477b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f44477b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44477b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44477b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44477b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f44476a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44476a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44476a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44476a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static R0 a(AbstractC4576v0 abstractC4576v0, int i10) {
        return a(abstractC4576v0).a(abstractC4576v0.b().c(), abstractC4576v0.m(), i10);
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    public static int c(IronSource.a aVar) {
        int i10 = a.f44476a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractC4511r3.e.NOT_SUPPORTED.b() : AbstractC4511r3.e.BANNER.b() : AbstractC4511r3.e.NATIVE_AD.b() : AbstractC4511r3.e.INTERSTITIAL.b() : AbstractC4511r3.e.REWARDED_VIDEO.b();
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i10 = a.f44477b[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    /* JADX INFO: renamed from: com.ironsource.nf$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.a f44478a;

        public b(IronSource.a aVar) {
            this.f44478a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.f44478a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            String str3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb2.append(str3);
            String string = sb2.toString();
            if (TextUtils.isEmpty(str)) {
                return string;
            }
            return string + " - " + str;
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    private static C4475p0 a(AbstractC4576v0 abstractC4576v0) {
        Map<IronSource.a, C4475p0> map = f44475a;
        if (map.containsKey(abstractC4576v0.b().a())) {
            return map.get(abstractC4576v0.b().a());
        }
        C4475p0 c4475p0 = new C4475p0();
        map.put(abstractC4576v0.b().a(), c4475p0);
        return c4475p0;
    }

    public static C4246ba a() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public static void a(Throwable th2) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th2.getMessage());
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(A5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(A5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(A5 a52, JSONObject jSONObject) {
        Ib.U().q().a(new C4649z5(a52, C4365ia.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f44477b[adFormat.ordinal()];
        if (i10 == 1) {
            return "rewarded";
        }
        if (i10 == 2) {
            return "interstitial";
        }
        if (i10 == 3) {
            return "banner";
        }
        if (i10 != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i10 = a.f44476a[aVar.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i10 != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
