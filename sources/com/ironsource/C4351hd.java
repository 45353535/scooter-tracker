package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.M7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4351hd implements M7, M7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43262a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43263b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43264c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f43265d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f43266e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f43267f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f43268g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f43269h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43270i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.hd$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43271a;

        static {
            int[] iArr = new int[EnumC4368id.values().length];
            f43271a = iArr;
            try {
                iArr[EnumC4368id.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43271a[EnumC4368id.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.hd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.M7
    public synchronized b a(Context context, AbstractC4545t3 abstractC4545t3, IronSource.a aVar) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4545t3 == null) {
            return b.NOT_CAPPED;
        }
        String strA = a(aVar);
        if (abstractC4545t3.c() == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4545t3.a() == null) {
            return b.NOT_CAPPED;
        }
        return b(context, strA, abstractC4545t3.c());
    }

    @Override // com.ironsource.M7.a
    public synchronized void b(Context context, AbstractC4545t3 abstractC4545t3, IronSource.a aVar) {
        if (context == null || abstractC4545t3 == null) {
            return;
        }
        C4300ed c4300edA = abstractC4545t3.a();
        if (c4300edA == null) {
            return;
        }
        a(context, a(aVar), abstractC4545t3.c(), c4300edA);
    }

    @Override // com.ironsource.M7
    public synchronized boolean c(Context context, AbstractC4545t3 abstractC4545t3, IronSource.a aVar) {
        return a(context, abstractC4545t3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, f43262a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, f43264c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.a(context, a(str, f43270i, str2), 0L) < IronSourceUtils.a(context, a(str, f43267f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, f43263b, str2), false)) {
            int iA = IronSourceUtils.a(context, a(str, f43265d, str2), 0);
            String strA = a(str, f43268g, str2);
            int iA2 = IronSourceUtils.a(context, strA, 0);
            String strA2 = a(str, f43269h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.a(context, strA2, 0L)) {
                IronSourceUtils.b(context, strA, 0);
                IronSourceUtils.b(context, strA2, 0L);
            } else if (iA2 >= iA) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.M7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(Context context, String str, String str2) {
        EnumC4368id enumC4368id;
        int i10 = 0;
        if (IronSourceUtils.a(context, a(str, f43264c, str2), false)) {
            IronSourceUtils.b(context, a(str, f43270i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, f43263b, str2), false)) {
            String strA = a(str, f43268g, str2);
            int iA = IronSourceUtils.a(context, strA, 0);
            if (iA == 0) {
                String strC = IronSourceUtils.c(context, a(str, f43266e, str2), EnumC4368id.PER_DAY.toString());
                EnumC4368id[] enumC4368idArrValues = EnumC4368id.values();
                int length = enumC4368idArrValues.length;
                while (true) {
                    if (i10 >= length) {
                        enumC4368id = null;
                        break;
                    }
                    enumC4368id = enumC4368idArrValues[i10];
                    if (enumC4368id.f43364a.equals(strC)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                IronSourceUtils.b(context, a(str, f43269h, str2), a(enumC4368id));
            }
            IronSourceUtils.b(context, strA, iA + 1);
        }
    }

    private long a(EnumC4368id enumC4368id) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = a.f43271a[enumC4368id.ordinal()];
        if (i10 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i10 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C4300ed c4300ed) {
        boolean zE = c4300ed.e();
        IronSourceUtils.b(context, a(str, f43262a, str2), zE);
        if (zE) {
            boolean zD = c4300ed.d();
            IronSourceUtils.b(context, a(str, f43263b, str2), zD);
            if (zD) {
                IronSourceUtils.b(context, a(str, f43265d, str2), c4300ed.b());
                IronSourceUtils.f(context, a(str, f43266e, str2), c4300ed.a().toString());
            }
            boolean zF = c4300ed.f();
            IronSourceUtils.b(context, a(str, f43264c, str2), zF);
            if (zF) {
                IronSourceUtils.b(context, a(str, f43267f, str2), c4300ed.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
