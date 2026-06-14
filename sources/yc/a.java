package yc;

import android.text.TextUtils;
import ic.v;
import id.c0;
import id.d0;
import id.e0;
import id.z0;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1336a f118909c = new C1336a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f118910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f118911b;

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    public static final class C1336a {
        public /* synthetic */ C1336a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1336a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118912a;

        static {
            int[] iArr = new int[d0.values().length];
            try {
                iArr[d0.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d0.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d0.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d0.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d0.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d0.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d0.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d0.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d0.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d0.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d0.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d0.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d0.Expand.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d0.Collapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f118912a = iArr;
        }
    }

    public a(f eventTaskExecutor, String sourceName) {
        Intrinsics.checkNotNullParameter(eventTaskExecutor, "eventTaskExecutor");
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        this.f118910a = eventTaskExecutor;
        this.f118911b = sourceName;
    }

    private final String b(Object obj, Object... objArr) {
        String string = obj != null ? obj.toString() : null;
        if (!TextUtils.isEmpty(string) || objArr.length == 0) {
            return string;
        }
        Object obj2 = objArr[0];
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }

    private final void c(e0 e0Var, d0 d0Var) {
        u(e0Var, d0Var);
        this.f118910a.b();
    }

    private final void d(e0 e0Var, d0 d0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || StringsKt.y0(string)) {
            f(e0Var, d0Var, "value");
            return;
        }
        z0 z0VarC = jd.d.c(string);
        if (z0VarC == null) {
            f(e0Var, d0Var, "value");
        } else {
            p(e0Var, d0Var, "%s", string);
            this.f118910a.b(z0VarC);
        }
    }

    private final void e(e0 e0Var, d0 d0Var, Object obj, Object... objArr) {
        String strB = b(obj, Arrays.copyOf(objArr, objArr.length));
        if (strB == null || StringsKt.y0(strB)) {
            f(e0Var, d0Var, "notify open url");
        } else {
            p(e0Var, d0Var, "%s", strB);
            this.f118910a.d(strB);
        }
    }

    private final void f(e0 e0Var, d0 d0Var, String str) {
        v.b("Event", "Could not find required params (" + str + ") for execute task (" + e0Var + ", " + d0Var + ')', new Object[0]);
    }

    private final void g(e0 e0Var, d0 d0Var, String str, Object obj) {
        Long lQ;
        long jLongValue = (obj == null || (lQ = g0.Q(obj, null, 1, null)) == null) ? Long.MIN_VALUE : lQ.longValue();
        if (jLongValue < 0) {
            f(e0Var, d0Var, "schedule time");
        } else {
            p(e0Var, d0Var, "target - %s, timeMs - %s", str, Long.valueOf(jLongValue));
            this.f118910a.a(str, jLongValue);
        }
    }

    private final void h(e0 e0Var, d0 d0Var, String str, Object obj, Object... objArr) {
        Boolean boolI = g0.I(obj, null, 1, null);
        if (boolI == null && objArr.length != 0) {
            boolI = g0.I(objArr[0], null, 1, null);
        }
        if (boolI == null) {
            f(e0Var, d0Var, "visibility value");
        } else {
            p(e0Var, d0Var, "target - %s, lockVisibility - %s", str, boolI);
            this.f118910a.a(str, boolI.booleanValue());
        }
    }

    private final void i(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        p(e0Var, d0Var, "target - %s", str);
        f fVar = this.f118910a;
        Object objFirstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.e(str, objFirstOrNull != null ? g0.M(objFirstOrNull, null, 1, null) : null);
    }

    private final void j(e0 e0Var, d0 d0Var) {
        u(e0Var, d0Var);
        this.f118910a.a();
    }

    private final void k(e0 e0Var, d0 d0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || StringsKt.y0(string)) {
            f(e0Var, d0Var, "state groups value");
        } else {
            p(e0Var, d0Var, "%s", string);
            this.f118910a.a(string);
        }
    }

    private final void l(e0 e0Var, d0 d0Var, Object obj, Object... objArr) {
        String strB = b(obj, Arrays.copyOf(objArr, objArr.length));
        if (strB == null || StringsKt.y0(strB)) {
            f(e0Var, d0Var, "open url");
        } else {
            p(e0Var, d0Var, "%s", strB);
            this.f118910a.b(strB);
        }
    }

    private final void m(e0 e0Var, d0 d0Var, String str) {
        p(e0Var, d0Var, "target - %s", str);
        this.f118910a.c(str);
    }

    private final void n(e0 e0Var, d0 d0Var, String str, Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return;
        }
        p(e0Var, d0Var, "target - %s, value - %s", str, string);
        this.f118910a.a(str, string);
    }

    private final void o(e0 e0Var, d0 d0Var, String str, Object obj, Object... objArr) {
        Throwable th2;
        try {
            try {
                try {
                    switch (b.f118912a[d0Var.ordinal()]) {
                        case 1:
                            r(e0Var, d0Var, obj);
                            return;
                        case 2:
                            l(e0Var, d0Var, obj, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 3:
                            e(e0Var, d0Var, obj, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 4:
                            x(e0Var, d0Var);
                            return;
                        case 5:
                            c(e0Var, d0Var);
                            return;
                        case 6:
                            t(e0Var, d0Var, str, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 7:
                            z(e0Var, d0Var, str, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 8:
                            m(e0Var, d0Var, str);
                            return;
                        case 9:
                            y(e0Var, d0Var, str, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 10:
                            i(e0Var, d0Var, str, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 11:
                            w(e0Var, d0Var, str, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 12:
                            g(e0Var, d0Var, str, obj);
                            return;
                        case 13:
                            n(e0Var, d0Var, str, obj);
                            return;
                        case 14:
                            h(e0Var, d0Var, str, obj, Arrays.copyOf(objArr, objArr.length));
                            return;
                        case 15:
                            v(e0Var, d0Var, str);
                            return;
                        case 16:
                            s(e0Var, d0Var, str);
                            return;
                        case 17:
                            d(e0Var, d0Var, obj);
                            return;
                        case 18:
                            k(e0Var, d0Var, obj);
                            return;
                        case 19:
                            q(e0Var, d0Var);
                            return;
                        case 20:
                            j(e0Var, d0Var);
                            return;
                        default:
                            return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        th2 = th;
        v.i(th2);
    }

    private final void p(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        if (v.f()) {
            if (str == null) {
                v.g("Event", "Event - " + e0Var.getKey() + " (source - " + this.f118911b + "), Task - " + d0Var.getKey(), new Object[0]);
                return;
            }
            try {
                a1 a1Var = a1.f93282a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                v.g("Event", "Event - " + e0Var.getKey() + " (source - " + this.f118911b + "), Task - " + d0Var.getKey() + " (" + str2 + ')', new Object[0]);
            } catch (Throwable th2) {
                v.i(th2);
            }
        }
    }

    private final void q(e0 e0Var, d0 d0Var) {
        u(e0Var, d0Var);
        this.f118910a.c();
    }

    private final void r(e0 e0Var, d0 d0Var, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string == null || StringsKt.y0(string)) {
            f(e0Var, d0Var, "track url");
        } else {
            p(e0Var, d0Var, "%s", string);
            this.f118910a.g(string);
        }
    }

    private final void s(e0 e0Var, d0 d0Var, String str) {
        p(e0Var, d0Var, "target - %s", str);
        this.f118910a.f(str);
    }

    private final void t(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        p(e0Var, d0Var, "target - %s", str);
        f fVar = this.f118910a;
        Object objFirstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.c(str, objFirstOrNull != null ? g0.M(objFirstOrNull, null, 1, null) : null);
    }

    private final void u(e0 e0Var, d0 d0Var) {
        p(e0Var, d0Var, null, new Object[0]);
    }

    private final void v(e0 e0Var, d0 d0Var, String str) {
        p(e0Var, d0Var, "target - %s", str);
        this.f118910a.e(str);
    }

    private final void w(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        if (objArr.length < 2) {
            f(e0Var, d0Var, "progress parameters");
            return;
        }
        Long lQ = g0.Q(objArr[0], null, 1, null);
        long jLongValue = lQ != null ? lQ.longValue() : Long.MIN_VALUE;
        Long lQ2 = g0.Q(objArr[1], null, 1, null);
        long jLongValue2 = lQ2 != null ? lQ2.longValue() : Long.MIN_VALUE;
        if (jLongValue < 1 || jLongValue2 < 0) {
            f(e0Var, d0Var, "maxProgressMs, currentProgressMs");
        } else {
            this.f118910a.f(str, jLongValue, jLongValue2, (jLongValue2 * 100.0f) / jLongValue);
        }
    }

    private final void x(e0 e0Var, d0 d0Var) {
        u(e0Var, d0Var);
        this.f118910a.e();
    }

    private final void y(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        p(e0Var, d0Var, "target - %s", str);
        f fVar = this.f118910a;
        Object objFirstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.d(str, objFirstOrNull != null ? g0.M(objFirstOrNull, null, 1, null) : null);
    }

    private final void z(e0 e0Var, d0 d0Var, String str, Object... objArr) {
        p(e0Var, d0Var, "target - %s", str);
        f fVar = this.f118910a;
        Object objFirstOrNull = ArraysKt.firstOrNull(objArr);
        fVar.a(str, objFirstOrNull != null ? g0.M(objFirstOrNull, null, 1, null) : null);
    }

    @Override // yc.d
    public void a(e0 eventType, c0 eventTaskParams, Object... params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTaskParams, "eventTaskParams");
        Intrinsics.checkNotNullParameter(params, "params");
        o(eventType, eventTaskParams.a(), eventTaskParams.c(), eventTaskParams.d(), Arrays.copyOf(params, params.length));
    }
}
