package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.N6;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.InitResponse;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k9.g f81835a = new k9.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f81836b;

    static Boolean A(Context context) {
        return io.bidmachine.core.i.a(Integer.valueOf(pd.y.c(D(context), "is_google_play_instant", -1)));
    }

    static String B(Context context) {
        SharedPreferences sharedPreferencesD = D(context);
        String strE = pd.y.e(sharedPreferencesD, "bid_machine_ifv", null);
        if (!TextUtils.isEmpty(strE)) {
            return strE;
        }
        String string = UUID.randomUUID().toString();
        pd.y.k(sharedPreferencesD, "bid_machine_ifv", string);
        return string;
    }

    static long C(Context context) {
        SharedPreferences sharedPreferencesD = D(context);
        long jD = pd.y.d(sharedPreferencesD, "first_app_launch_ms", 0L);
        if (jD != 0) {
            return jD;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        pd.y.i(sharedPreferencesD, "first_app_launch_ms", Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    static SharedPreferences D(Context context) {
        if (f81836b == null) {
            f81836b = context.getSharedPreferences("BidMachinePref", 0);
        }
        return f81836b;
    }

    private static Long E(SharedPreferences sharedPreferences, String str) {
        long jD = pd.y.d(sharedPreferences, str, -1L);
        if (jD != -1) {
            return Long.valueOf(jD);
        }
        return null;
    }

    static void F(Context context, k9.f fVar) {
        pd.y.k(D(context), "current_version_milestone", fVar != null ? f81835a.d(fVar).toString() : null);
    }

    static void G(Context context, List list) {
        if (list.isEmpty()) {
            pd.y.l(D(context), "history_version_milestone_list");
        } else {
            pd.y.k(D(context), "history_version_milestone_list", f81835a.c(list).toString());
        }
    }

    static void H(Context context, String str, String str2) {
        pd.y.k(D(context), "hw_info_" + str, str2);
    }

    static void I(Context context, final h9.b bVar) {
        pd.y.b(D(context), new Function1() { // from class: io.bidmachine.m2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n2.a(bVar, (SharedPreferences.Editor) obj);
            }
        });
    }

    static void J(Context context, long j10) {
        pd.y.i(D(context), "sdk_install_time", Long.valueOf(j10));
    }

    static void K(Context context, String str) {
        pd.y.k(D(context), N6.f41375d0, str);
    }

    static void L(Context context, String str) {
        pd.y.k(D(context), "ua_device_os", str);
    }

    static void M(Context context, long j10) {
        pd.y.i(D(context), "ua_exp", Long.valueOf(j10));
    }

    static void N(Context context, String str, long j10) {
        K(context, str);
        L(context, ae.c.h());
        M(context, j10);
    }

    static void O(Context context, long j10) {
        pd.y.i(D(context), "current_session_duration", Long.valueOf(j10));
    }

    static void P(Context context, Extras extras) {
        try {
            pd.y.k(D(context), "init_extras", Base64.encodeToString(extras.toByteArray(), 0));
        } catch (Exception unused) {
        }
    }

    static void Q(Context context, InitResponse initResponse, String str) {
        try {
            pd.y.k(D(context), "initData", Base64.encodeToString(initResponse.toByteArray(), 0));
            pd.y.k(D(context), "init_data_session_id", str);
        } catch (Exception unused) {
        }
    }

    static void R(Context context, long j10) {
        pd.y.i(D(context), "last_session_duration", Long.valueOf(j10));
    }

    static void S(Context context, int i10) {
        pd.y.g(D(context), "session_count", Integer.valueOf(i10));
    }

    public static /* synthetic */ Unit a(h9.b bVar, SharedPreferences.Editor editor) {
        pd.y.j(editor, "install_referrer_url", bVar.e());
        pd.y.j(editor, "install_version", bVar.f());
        pd.y.h(editor, "install_referrer_click_sec", bVar.c());
        pd.y.h(editor, "install_begin_sec", bVar.a());
        pd.y.h(editor, "install_referrer_click_server_sec", bVar.d());
        pd.y.h(editor, "install_begin_server_sec", bVar.b());
        pd.y.f(editor, "is_google_play_instant", io.bidmachine.core.i.c(bVar.i()));
        return Unit.f93236a;
    }

    static void b(Context context) {
        R(context, e(context));
    }

    static void c(Context context) {
        pd.y.a(D(context));
    }

    static void d(Context context) {
        pd.y.l(D(context), "init_extras");
    }

    static long e(Context context) {
        return pd.y.d(D(context), "current_session_duration", 0L);
    }

    static k9.f f(Context context) {
        String strE = pd.y.e(D(context), "current_version_milestone", null);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return f81835a.b(new JSONObject(strE));
        } catch (Throwable unused) {
            return null;
        }
    }

    static List g(Context context) {
        String strE = pd.y.e(D(context), "history_version_milestone_list", null);
        if (TextUtils.isEmpty(strE)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return f81835a.a(new JSONArray(strE));
        } catch (Throwable unused) {
            return Collections.EMPTY_LIST;
        }
    }

    static String h(Context context, String str) {
        return pd.y.e(D(context), "hw_info_" + str, null);
    }

    static Extras i(Context context) {
        SharedPreferences sharedPreferencesD = D(context);
        try {
            return Extras.parseFrom(Base64.decode(pd.y.e(sharedPreferencesD, "init_extras", null), 0));
        } catch (Exception unused) {
            pd.y.l(sharedPreferencesD, "init_extras");
            return null;
        }
    }

    static InitResponse j(Context context) {
        SharedPreferences sharedPreferencesD = D(context);
        try {
            return InitResponse.parseFrom(Base64.decode(sharedPreferencesD.getString("initData", null), 0));
        } catch (Exception unused) {
            pd.y.l(sharedPreferencesD, "initData");
            return null;
        }
    }

    static String k(Context context) {
        String strE = pd.y.e(D(context), "init_data_session_id", null);
        return strE != null ? strE : "";
    }

    static Long l(Context context) {
        return E(D(context), "install_begin_sec");
    }

    static Long m(Context context) {
        return E(D(context), "install_begin_server_sec");
    }

    static Long n(Context context) {
        return E(D(context), "install_referrer_click_sec");
    }

    static Long o(Context context) {
        return E(D(context), "install_referrer_click_server_sec");
    }

    static String p(Context context) {
        return pd.y.e(D(context), "install_referrer_url", null);
    }

    static String q(Context context) {
        return pd.y.e(D(context), "install_version", null);
    }

    static long r(Context context) {
        return pd.y.d(D(context), "last_session_duration", 0L);
    }

    static long s(Context context) {
        return pd.y.d(D(context), "sdk_install_time", 0L);
    }

    static int t(Context context) {
        return pd.y.c(D(context), "session_count", 0);
    }

    static String u(Context context) {
        return pd.y.e(D(context), N6.f41375d0, null);
    }

    static String v(Context context) {
        return pd.y.e(D(context), "ua_device_os", null);
    }

    static long w(Context context) {
        return pd.y.d(D(context), "ua_exp", -1L);
    }

    static String x(Context context) {
        String strU = u(context);
        if (TextUtils.isEmpty(strU) || !ae.c.h().equals(v(context)) || w(context) <= System.currentTimeMillis()) {
            return null;
        }
        return strU;
    }

    static boolean y(Context context) {
        return D(context).contains("bid_machine_ifv");
    }

    static void z(Context context) {
        S(context, t(context) + 1);
    }
}
