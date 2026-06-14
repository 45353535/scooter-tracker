package v2;

import android.content.Context;
import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import com.facebook.appevents.m0;
import com.facebook.appevents.o;
import com.facebook.d0;
import com.facebook.internal.r;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f105727a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105728b = o.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long[] f105729c = {300000, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, 3600000, 21600000, 43200000, SignalManager.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private o() {
    }

    public static final int a(long j10) {
        if (e3.a.d(o.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f105729c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                e3.a.b(th2, o.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void b(String activityName, p pVar, String str, Context context) {
        String string;
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            if (pVar == null || (string = pVar.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            m0.a aVar = m0.f19689b;
            m0 m0VarA = aVar.a(activityName, str, null);
            m0VarA.d("fb_mobile_activate_app", bundle);
            if (aVar.c() != o.b.EXPLICIT_ONLY) {
                m0VarA.a();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }

    private final void c() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            r.a aVar = r.f19964e;
            d0 d0Var = d0.APP_EVENTS;
            String str = f105728b;
            Intrinsics.checkNotNull(str);
            aVar.b(d0Var, str, "Clock skew detected");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void d(String activityName, n nVar, String str) {
        long jLongValue;
        String string;
        if (e3.a.d(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (nVar == null) {
                return;
            }
            Long lB = nVar.b();
            if (lB != null) {
                jLongValue = lB.longValue();
            } else {
                Long lE = nVar.e();
                jLongValue = 0 - (lE != null ? lE.longValue() : 0L);
            }
            if (jLongValue < 0) {
                f105727a.c();
                jLongValue = 0;
            }
            long jF = nVar.f();
            if (jF < 0) {
                f105727a.c();
                jF = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", nVar.c());
            a1 a1Var = a1.f93282a;
            String str2 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(a(jLongValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str2);
            p pVarG = nVar.g();
            if (pVarG == null || (string = pVarG.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lE2 = nVar.e();
            bundle.putLong("_logTime", (lE2 != null ? lE2.longValue() : 0L) / ((long) 1000));
            m0.f19689b.a(activityName, str, null).c("fb_mobile_deactivate_app", jF / 1000, bundle);
        } catch (Throwable th2) {
            e3.a.b(th2, o.class);
        }
    }
}
