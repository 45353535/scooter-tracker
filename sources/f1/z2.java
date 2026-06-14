package f1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public interface z2 {
    public static final c K8 = c.f71710a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71692c = new a("IGNORED", 0, "cache_ignored");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f71693d = new a("START", 1, "cache_start");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f71694e = new a("FINISH_SUCCESS", 2, "cache_finish_success");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71695f = new a("FINISH_FAILURE", 3, "cache_finish_failure");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f71696g = new a("GET_RESPONSE_PARSING_ERROR", 4, "cache_get_response_parsing_error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f71697h = new a("BID_RESPONSE_PARSING_ERROR", 5, "cache_bid_response_parsing_error");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f71698i = new a("ASSET_DOWNLOAD_ERROR", 6, "cache_asset_download_error");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f71699j = new a("REQUEST_ERROR", 7, "cache_request_error");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f71700k = new a("SERVER_ERROR", 8, "cache_server_error");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ a[] f71701l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71702m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71703b;

        static {
            a[] aVarArrD = d();
            f71701l = aVarArrD;
            f71702m = qf.a.a(aVarArrD);
        }

        public a(String str, int i10, String str2) {
            this.f71703b = str2;
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f71692c, f71693d, f71694e, f71695f, f71696g, f71697h, f71698i, f71699j, f71700k};
        }

        public static EnumEntries g() {
            return f71702m;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f71701l.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71703b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71704c = new b("SUCCESS", 0, "click_success");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f71705d = new b("FAILURE", 1, "click_failure");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f71706e = new b("INVALID_URL_ERROR", 2, "click_invalid_url_error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f71707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71708g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71709b;

        static {
            b[] bVarArrD = d();
            f71707f = bVarArrD;
            f71708g = qf.a.a(bVarArrD);
        }

        public b(String str, int i10, String str2) {
            this.f71709b = str2;
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f71704c, f71705d, f71706e};
        }

        public static EnumEntries g() {
            return f71708g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71707f.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71709b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f71710a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f71711b = lf.i.a(a.f71712f);

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f71712f = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return ArraysKt.flatten(new Object[][]{a.g().toArray(new a[0]), i.g().toArray(new i[0]), b.g().toArray(new b[0]), d.g().toArray(new d[0]), g.g().toArray(new g[0]), h.g().toArray(new h[0]), j.g().toArray(new j[0]), f.g().toArray(new f[0])});
            }
        }

        public final List a() {
            return (List) f71711b.getValue();
        }

        public final List b(List values) {
            Intrinsics.checkNotNullParameter(values, "values");
            List listA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (values.contains(((z2) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f71713c = new d("SUBCLASSING_ERROR", 0, "consent_subclassing_error");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f71714d = new d("DECODING_ERROR", 1, "consent_decoding_error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f71715e = new d("CREATION_ERROR", 2, "consent_creation_error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f71716f = new d("PERSISTED_DATA_READING_ERROR", 3, "consent_persisted_data_reading_error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f71717g = new d("PERSISTENCE_ERROR", 4, "consent_persistence_error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ d[] f71718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71719i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71720b;

        static {
            d[] dVarArrD = d();
            f71718h = dVarArrD;
            f71719i = qf.a.a(dVarArrD);
        }

        public d(String str, int i10, String str2) {
            this.f71720b = str2;
        }

        public static final /* synthetic */ d[] d() {
            return new d[]{f71713c, f71714d, f71715e, f71716f, f71717g};
        }

        public static EnumEntries g() {
            return f71719i;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f71718h.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71720b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f71721c = new e("IMPRESSION_TRACKER_FAILURE", 0, "imptracker_failure");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ e[] f71722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71723e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71724b;

        static {
            e[] eVarArrD = d();
            f71722d = eVarArrD;
            f71723e = qf.a.a(eVarArrD);
        }

        public e(String str, int i10, String str2) {
            this.f71724b = str2;
        }

        public static final /* synthetic */ e[] d() {
            return new e[]{f71721c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f71722d.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71724b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f71725c = new f("USER_AGENT_UPDATE_ERROR", 0, "user_agent_update_error");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f71726d = new f("PREFETCH_REQUEST_ERROR", 1, "prefetch_request_error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f71727e = new f("CONFIG_REQUEST_ERROR", 2, "config_request_error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f71728f = new f("INSTALL_REQUEST_ERROR", 3, "install_request_error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final f f71729g = new f("IMPRESSION_RECORDED", 4, "impression_recorded");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f f71730h = new f("UNSUPPORTED_OS_VERSION", 5, "unsupported_os_version");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final f f71731i = new f("TOO_MANY_EVENTS", 6, "too_many_events");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ f[] f71732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71733k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71734b;

        static {
            f[] fVarArrD = d();
            f71732j = fVarArrD;
            f71733k = qf.a.a(fVarArrD);
        }

        public f(String str, int i10, String str2) {
            this.f71734b = str2;
        }

        public static final /* synthetic */ f[] d() {
            return new f[]{f71725c, f71726d, f71727e, f71728f, f71729g, f71730h, f71731i};
        }

        public static EnumEntries g() {
            return f71733k;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f71732j.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71734b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f71735c = new g("SUCCESS", 0, "navigation_success");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f71736d = new g("FAILURE", 1, "navigation_failure");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ g[] f71737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71738f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71739b;

        static {
            g[] gVarArrD = d();
            f71737e = gVarArrD;
            f71738f = qf.a.a(gVarArrD);
        }

        public g(String str, int i10, String str2) {
            this.f71739b = str2;
        }

        public static final /* synthetic */ g[] d() {
            return new g[]{f71735c, f71736d};
        }

        public static EnumEntries g() {
            return f71738f;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f71737e.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71739b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f71740c = new h("REQUEST_JSON_SERIALIZATION_ERROR", 0, "request_json_serialization_error");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f71741d = new h("RESPONSE_JSON_SERIALIZATION_ERROR", 1, "response_json_serialization_error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f71742e = new h("RESPONSE_DATA_WRITE_ERROR", 2, "response_data_write_error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h f71743f = new h("DISPATCHER_EXCEPTION", 3, "network_failure_dispatcher_exception");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ h[] f71744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71745h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71746b;

        static {
            h[] hVarArrD = d();
            f71744g = hVarArrD;
            f71745h = qf.a.a(hVarArrD);
        }

        public h(String str, int i10, String str2) {
            this.f71746b = str2;
        }

        public static final /* synthetic */ h[] d() {
            return new h[]{f71740c, f71741d, f71742e, f71743f};
        }

        public static EnumEntries g() {
            return f71745h;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f71744g.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71746b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class i implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f71747c = new i("START", 0, "show_start");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f71748d = new i("FINISH_SUCCESS", 1, "show_finish_success");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f71749e = new i("FINISH_FAILURE", 2, "show_finish_failure");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f71750f = new i("UNAVAILABLE_ASSET_ERROR", 3, "show_unavailable_asset_error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final i f71751g = new i("TIMEOUT_EVENT", 4, "show_timeout_error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final i f71752h = new i("HTML_MISSING_MUSTACHE_ERROR", 5, "show_html_missing_mustache_error");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final i f71753i = new i("WEBVIEW_SSL_ERROR", 6, "show_webview_ssl_error");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final i f71754j = new i("WEBVIEW_ERROR", 7, "show_webview_error");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final i f71755k = new i("WEBVIEW_CRASH", 8, "show_webview_crash");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final i f71756l = new i("UNEXPECTED_DISMISS_ERROR", 9, "show_unexpected_dismiss_error");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final i f71757m = new i("REQUEST_ERROR", 10, "show_request_error");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final i f71758n = new i("CLOSE_BEFORE_TEMPLATE_SHOW_ERROR", 11, "show_close_before_template_show_error");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final i f71759o = new i("DISMISS_MISSING", 12, "dismiss_missing");

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ i[] f71760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71761q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71762b;

        static {
            i[] iVarArrD = d();
            f71760p = iVarArrD;
            f71761q = qf.a.a(iVarArrD);
        }

        public i(String str, int i10, String str2) {
            this.f71762b = str2;
        }

        public static final /* synthetic */ i[] d() {
            return new i[]{f71747c, f71748d, f71749e, f71750f, f71751g, f71752h, f71753i, f71754j, f71755k, f71756l, f71757m, f71758n, f71759o};
        }

        public static EnumEntries g() {
            return f71761q;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f71760p.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71762b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j implements z2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f71763c = new j("FINISH_SUCCESS", 0, "video_finish_success");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f71764d = new j("FINISH_FAILURE", 1, "video_finish_failure");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ j[] f71765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71766f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71767b;

        static {
            j[] jVarArrD = d();
            f71765e = jVarArrD;
            f71766f = qf.a.a(jVarArrD);
        }

        public j(String str, int i10, String str2) {
            this.f71767b = str2;
        }

        public static final /* synthetic */ j[] d() {
            return new j[]{f71763c, f71764d};
        }

        public static EnumEntries g() {
            return f71766f;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f71765e.clone();
        }

        @Override // f1.z2
        public String getValue() {
            return this.f71767b;
        }
    }

    String getValue();
}
