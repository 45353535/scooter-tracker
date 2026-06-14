package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class D0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f40506p = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f40507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f40508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0 f40509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC4511r3 f40510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public X8 f40511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4621xb f40512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Of f40513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q1 f40514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M f40515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Sf f40516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Qc f40517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<A0, a> f40518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<A0, a> f40519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<A0, a> f40520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<A0, a> f40521o;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f40523b;

        public a(A5 a52, A5 a53) {
            if (a52 != null) {
                this.f40522a = a52.b();
            } else {
                this.f40522a = -1;
            }
            if (a53 != null) {
                this.f40523b = a53.b();
            } else {
                this.f40523b = -1;
            }
        }

        int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f40522a : this.f40523b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public D0(IronSource.a aVar, b bVar, C0 c02) {
        this(aVar, bVar, c02, a(aVar));
    }

    private static AbstractC4511r3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? Td.i() : G9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.f40521o = map;
        map.put(A0.INIT_STARTED, new a(A5.NT_MANAGER_INIT_STARTED, null));
        this.f40521o.put(A0.INIT_ENDED, new a(A5.NT_MANAGER_INIT_ENDED, null));
        this.f40521o.put(A0.PLACEMENT_CAPPED, new a(A5.NT_PLACEMENT_CAPPED, null));
        this.f40521o.put(A0.AUCTION_REQUEST, new a(A5.NT_AUCTION_REQUEST, null));
        this.f40521o.put(A0.AUCTION_SUCCESS, new a(A5.NT_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f40521o;
        A0 a02 = A0.AUCTION_FAILED;
        A5 a52 = A5.NT_AUCTION_FAILED;
        map2.put(a02, new a(a52, null));
        this.f40521o.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(a52, null));
        this.f40521o.put(A0.AUCTION_REQUEST_WATERFALL, new a(A5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f40521o.put(A0.AUCTION_RESULT_WATERFALL, new a(A5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f40521o.put(A0.INIT_SUCCESS, new a(null, null));
        this.f40521o.put(A0.INIT_FAILED, new a(null, null));
        this.f40521o.put(A0.AD_OPENED, new a(A5.NT_CALLBACK_SHOW, A5.NT_INSTANCE_SHOW));
        this.f40521o.put(A0.AD_CLICKED, new a(A5.NT_CALLBACK_CLICK, A5.NT_INSTANCE_CLICK));
        this.f40521o.put(A0.LOAD_AD, new a(A5.NT_LOAD, A5.NT_INSTANCE_LOAD));
        this.f40521o.put(A0.LOAD_AD_SUCCESS, new a(A5.NT_CALLBACK_LOAD_SUCCESS, A5.NT_INSTANCE_LOAD_SUCCESS));
        this.f40521o.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(A5.NT_CALLBACK_LOAD_ERROR, A5.NT_INSTANCE_LOAD_ERROR));
        this.f40521o.put(A0.LOAD_AD_NO_FILL, new a(null, A5.NT_INSTANCE_LOAD_NO_FILL));
        this.f40521o.put(A0.AD_FORMAT_CAPPED, new a(A5.NT_AD_UNIT_CAPPED, null));
        Map<A0, a> map3 = this.f40521o;
        A0 a03 = A0.COLLECT_TOKEN;
        A5 a53 = A5.NT_COLLECT_TOKENS;
        A5 a54 = A5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(a03, new a(a53, a54));
        this.f40521o.put(A0.COLLECT_TOKENS_COMPLETED, new a(A5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f40521o.put(A0.COLLECT_TOKENS_FAILED, new a(A5.NT_COLLECT_TOKENS_FAILED, null));
        this.f40521o.put(A0.INSTANCE_COLLECT_TOKEN, new a(a54, null));
        Map<A0, a> map4 = this.f40521o;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        A5 a55 = A5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(a04, new a(a55, a55));
        Map<A0, a> map5 = this.f40521o;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        A5 a56 = A5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(a05, new a(a56, a56));
        Map<A0, a> map6 = this.f40521o;
        A0 a06 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        A5 a57 = A5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(a06, new a(a57, a57));
        this.f40521o.put(A0.DESTROY_AD, new a(A5.NT_DESTROY, A5.NT_INSTANCE_DESTROY));
        this.f40521o.put(A0.TROUBLESHOOT_ILR_REVENUE, new a(A5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<A0, a> map7 = this.f40521o;
        A0 a07 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        A5 a58 = A5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(a07, new a(a58, a58));
        Map<A0, a> map8 = this.f40521o;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        A5 a59 = A5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(a08, new a(a59, a59));
        Map<A0, a> map9 = this.f40521o;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        A5 a510 = A5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(a09, new a(a510, a510));
        Map<A0, a> map10 = this.f40521o;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        A5 a511 = A5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(a010, new a(a511, a511));
        Map<A0, a> map11 = this.f40521o;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        A5 a512 = A5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(a011, new a(a512, a512));
        Map<A0, a> map12 = this.f40521o;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        A5 a513 = A5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(a012, new a(a513, a513));
        Map<A0, a> map13 = this.f40521o;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        A5 a514 = A5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(a013, new a(a514, a514));
        Map<A0, a> map14 = this.f40521o;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        A5 a515 = A5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(a014, new a(a515, a515));
        Map<A0, a> map15 = this.f40521o;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        A5 a516 = A5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(a015, new a(a516, a516));
        Map<A0, a> map16 = this.f40521o;
        A0 a016 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        A5 a517 = A5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(a016, new a(a517, a517));
        Map<A0, a> map17 = this.f40521o;
        A0 a017 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        A5 a518 = A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(a017, new a(a518, a518));
        Map<A0, a> map18 = this.f40521o;
        A0 a018 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        A5 a519 = A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(a018, new a(a519, a519));
        this.f40521o.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(A5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        HashMap map = new HashMap();
        this.f40518l = map;
        map.put(A0.INIT_STARTED, new a(A5.IS_MANAGER_INIT_STARTED, null));
        this.f40518l.put(A0.INIT_ENDED, new a(A5.IS_MANAGER_INIT_ENDED, null));
        this.f40518l.put(A0.SESSION_CAPPED, new a(null, A5.IS_CAP_SESSION));
        this.f40518l.put(A0.PLACEMENT_CAPPED, new a(A5.IS_CAP_PLACEMENT, null));
        this.f40518l.put(A0.CHECK_PLACEMENT_CAPPED, new a(A5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f40518l.put(A0.AUCTION_REQUEST, new a(A5.IS_AUCTION_REQUEST, null));
        this.f40518l.put(A0.AUCTION_SUCCESS, new a(A5.IS_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f40518l;
        A0 a02 = A0.AUCTION_FAILED;
        A5 a52 = A5.IS_AUCTION_FAILED;
        map2.put(a02, new a(a52, null));
        this.f40518l.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(a52, null));
        this.f40518l.put(A0.AUCTION_REQUEST_WATERFALL, new a(A5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f40518l.put(A0.AUCTION_RESULT_WATERFALL, new a(A5.IS_RESULT_WATERFALL, null));
        this.f40518l.put(A0.INIT_SUCCESS, new a(null, null));
        this.f40518l.put(A0.INIT_FAILED, new a(null, null));
        this.f40518l.put(A0.AD_OPENED, new a(null, A5.IS_INSTANCE_OPENED));
        this.f40518l.put(A0.AD_CLOSED, new a(A5.IS_CALLBACK_AD_CLOSED, A5.IS_INSTANCE_CLOSED));
        this.f40518l.put(A0.AD_CLICKED, new a(A5.IS_CALLBACK_AD_CLICKED, A5.IS_INSTANCE_CLICKED));
        this.f40518l.put(A0.AD_INFO_CHANGED, new a(A5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f40518l.put(A0.LOAD_AD, new a(A5.IS_LOAD_CALLED, A5.IS_INSTANCE_LOAD));
        this.f40518l.put(A0.LOAD_AD_SUCCESS, new a(A5.IS_CALLBACK_LOAD_SUCCESS, A5.IS_INSTANCE_LOAD_SUCCESS));
        this.f40518l.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(A5.IS_CALLBACK_LOAD_ERROR, A5.IS_INSTANCE_LOAD_FAILED));
        this.f40518l.put(A0.LOAD_AD_NO_FILL, new a(null, A5.IS_INSTANCE_LOAD_NO_FILL));
        this.f40518l.put(A0.SHOW_AD, new a(A5.IS_SHOW_CALLED, A5.IS_INSTANCE_SHOW));
        this.f40518l.put(A0.SHOW_AD_FAILED, new a(A5.IS_CALLBACK_AD_SHOW_ERROR, A5.IS_INSTANCE_SHOW_FAILED));
        this.f40518l.put(A0.AD_FORMAT_CAPPED, new a(A5.IS_AD_FORMAT_CAPPED, null));
        this.f40518l.put(A0.AD_UNIT_CAPPED, new a(A5.IS_AD_UNIT_CAPPED, null));
        this.f40518l.put(A0.COLLECT_TOKEN, new a(A5.IS_COLLECT_TOKENS, null));
        this.f40518l.put(A0.COLLECT_TOKENS_COMPLETED, new a(A5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f40518l.put(A0.COLLECT_TOKENS_FAILED, new a(A5.IS_COLLECT_TOKENS_FAILED, null));
        this.f40518l.put(A0.INSTANCE_COLLECT_TOKEN, new a(A5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f40518l.put(A0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(A5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f40518l.put(A0.INSTANCE_COLLECT_TOKEN_FAILED, new a(A5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f40518l.put(A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(A5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f40518l.put(A0.AD_READY_TRUE, new a(A5.IS_CHECK_READY_TRUE, null));
        this.f40518l.put(A0.AD_READY_FALSE, new a(A5.IS_CHECK_READY_FALSE, null));
        this.f40518l.put(A0.OPERATIONAL_LOAD_AD, new a(A5.IS_OPERATIONAL_LOAD_AD, null));
        this.f40518l.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(A5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f40518l.put(A0.OPERATIONAL_LOAD_FAILED, new a(A5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f40518l.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(A5.IS_SET_CONFIGURATION, null));
        Map<A0, a> map3 = this.f40518l;
        A0 a03 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        A5 a53 = A5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(a03, new a(a53, a53));
        Map<A0, a> map4 = this.f40518l;
        A0 a04 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        A5 a54 = A5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(a04, new a(a54, a54));
        Map<A0, a> map5 = this.f40518l;
        A0 a05 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        A5 a55 = A5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(a05, new a(a55, a55));
        Map<A0, a> map6 = this.f40518l;
        A0 a06 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        A5 a56 = A5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(a06, new a(a56, a56));
        Map<A0, a> map7 = this.f40518l;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        A5 a57 = A5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(a07, new a(a57, a57));
        Map<A0, a> map8 = this.f40518l;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        A5 a58 = A5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(a08, new a(a58, a58));
        Map<A0, a> map9 = this.f40518l;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        A5 a59 = A5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(a09, new a(a59, a59));
        Map<A0, a> map10 = this.f40518l;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        A5 a510 = A5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(a010, new a(a510, a510));
        Map<A0, a> map11 = this.f40518l;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        A5 a511 = A5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(a011, new a(a511, a511));
        Map<A0, a> map12 = this.f40518l;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        A5 a512 = A5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(a012, new a(a512, a512));
        Map<A0, a> map13 = this.f40518l;
        A0 a013 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        A5 a513 = A5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(a013, new a(a513, a513));
        Map<A0, a> map14 = this.f40518l;
        A0 a014 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        A5 a514 = A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(a014, new a(a514, a514));
        Map<A0, a> map15 = this.f40518l;
        A0 a015 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        A5 a515 = A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(a015, new a(a515, a515));
        this.f40518l.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(A5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map16 = this.f40518l;
        A0 a016 = A0.TROUBLESHOOT_AD_EXPIRED;
        A5 a516 = A5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(a016, new a(a516, a516));
        this.f40518l.put(A0.TROUBLESHOOT_LOAD, new a(A5.TROUBLESHOOTING_IS_LOAD, null));
        this.f40518l.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(A5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f40518l.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(A5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f40518l.put(A0.TROUBLESHOOT_LOAD_FAILED, new a(A5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f40518l.put(A0.TROUBLESHOOT_SHOW, new a(A5.TROUBLESHOOTING_IS_SHOW, null));
        this.f40518l.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(A5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f40518l.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(A5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<A0, a> map17 = this.f40518l;
        A0 a017 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        A5 a517 = A5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(a017, new a(a517, a517));
        this.f40518l.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(A5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f40518l.put(A0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(A5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f40518l.put(A0.TROUBLESHOOT_ILR_REVENUE, new a(A5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
    }

    void e() {
        HashMap map = new HashMap();
        this.f40519m = map;
        map.put(A0.INIT_STARTED, new a(A5.RV_MANAGER_INIT_STARTED, null));
        this.f40519m.put(A0.INIT_ENDED, new a(A5.RV_MANAGER_INIT_ENDED, null));
        this.f40519m.put(A0.SESSION_CAPPED, new a(null, A5.RV_CAP_SESSION));
        this.f40519m.put(A0.PLACEMENT_CAPPED, new a(A5.RV_CAP_PLACEMENT, null));
        this.f40519m.put(A0.CHECK_PLACEMENT_CAPPED, new a(A5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f40519m.put(A0.AUCTION_REQUEST, new a(A5.RV_AUCTION_REQUEST, null));
        this.f40519m.put(A0.AUCTION_SUCCESS, new a(A5.RV_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f40519m;
        A0 a02 = A0.AUCTION_FAILED;
        A5 a52 = A5.RV_AUCTION_FAILED;
        map2.put(a02, new a(a52, null));
        this.f40519m.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(a52, null));
        this.f40519m.put(A0.AUCTION_REQUEST_WATERFALL, new a(A5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f40519m.put(A0.AUCTION_RESULT_WATERFALL, new a(A5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f40519m.put(A0.INIT_SUCCESS, new a(null, null));
        this.f40519m.put(A0.INIT_FAILED, new a(null, null));
        this.f40519m.put(A0.AD_VISIBLE, new a(null, A5.RV_INSTANCE_VISIBLE));
        this.f40519m.put(A0.AD_OPENED, new a(null, A5.RV_BUSINESS_INSTANCE_OPENED));
        this.f40519m.put(A0.AD_CLOSED, new a(null, A5.RV_INSTANCE_CLOSED));
        this.f40519m.put(A0.AD_STARTED, new a(null, A5.RV_INSTANCE_STARTED));
        this.f40519m.put(A0.AD_ENDED, new a(null, A5.RV_INSTANCE_ENDED));
        this.f40519m.put(A0.AD_CLICKED, new a(A5.RV_CALLBACK_AD_CLICKED, A5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f40519m.put(A0.AD_INFO_CHANGED, new a(A5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f40519m.put(A0.AD_REWARDED, new a(null, A5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f40519m.put(A0.AD_AVAILABILITY_CHANGED_TRUE, new a(A5.RV_CALLBACK_AVAILABILITY_TRUE, A5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f40519m.put(A0.AD_AVAILABILITY_CHANGED_FALSE, new a(A5.RV_CALLBACK_AVAILABILITY_FALSE, A5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f40519m.put(A0.LOAD_AD, new a(A5.RV_BUSINESS_MEDIATION_LOAD, A5.RV_BUSINESS_INSTANCE_LOAD));
        this.f40519m.put(A0.LOAD_AD_SUCCESS, new a(A5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, A5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f40519m.put(A0.LOAD_AD_FAILED, new a(null, A5.RV_INSTANCE_LOAD_FAILED));
        this.f40519m.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(A5.RV_MEDIATION_LOAD_ERROR, A5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f40519m.put(A0.LOAD_AD_NO_FILL, new a(null, A5.RV_INSTANCE_LOAD_NO_FILL));
        this.f40519m.put(A0.SHOW_AD, new a(A5.RV_API_SHOW_CALLED, A5.RV_INSTANCE_SHOW));
        this.f40519m.put(A0.SHOW_AD_CHANCE, new a(null, A5.RV_INSTANCE_SHOW_CHANCE));
        this.f40519m.put(A0.SHOW_AD_FAILED, new a(A5.RV_CALLBACK_SHOW_FAILED, A5.RV_INSTANCE_SHOW_FAILED));
        this.f40519m.put(A0.AD_FORMAT_CAPPED, new a(A5.RV_AD_UNIT_CAPPED, null));
        this.f40519m.put(A0.COLLECT_TOKEN, new a(A5.RV_COLLECT_TOKENS, null));
        this.f40519m.put(A0.COLLECT_TOKENS_COMPLETED, new a(A5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f40519m.put(A0.COLLECT_TOKENS_FAILED, new a(A5.RV_COLLECT_TOKENS_FAILED, null));
        this.f40519m.put(A0.INSTANCE_COLLECT_TOKEN, new a(A5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.f40519m;
        A0 a03 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        A5 a53 = A5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a03, new a(a53, a53));
        Map<A0, a> map4 = this.f40519m;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        A5 a54 = A5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a04, new a(a54, a54));
        Map<A0, a> map5 = this.f40519m;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        A5 a55 = A5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a05, new a(a55, a55));
        this.f40519m.put(A0.AD_READY_TRUE, new a(A5.RV_CHECK_READY_TRUE, null));
        this.f40519m.put(A0.AD_READY_FALSE, new a(A5.RV_CHECK_READY_FALSE, null));
        this.f40519m.put(A0.OPERATIONAL_LOAD_AD, new a(A5.RV_OPERATIONAL_LOAD_AD, null));
        this.f40519m.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(A5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f40519m.put(A0.OPERATIONAL_LOAD_FAILED, new a(A5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f40519m.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(A5.RV_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.f40519m;
        A0 a06 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        A5 a56 = A5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(a06, new a(a56, a56));
        Map<A0, a> map7 = this.f40519m;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        A5 a57 = A5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(a07, new a(a57, a57));
        Map<A0, a> map8 = this.f40519m;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        A5 a58 = A5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(a08, new a(a58, a58));
        Map<A0, a> map9 = this.f40519m;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        A5 a59 = A5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a09, new a(a59, a59));
        Map<A0, a> map10 = this.f40519m;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        A5 a510 = A5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(a010, new a(a510, a510));
        Map<A0, a> map11 = this.f40519m;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        A5 a511 = A5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a011, new a(a511, a511));
        Map<A0, a> map12 = this.f40519m;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        A5 a512 = A5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(a012, new a(a512, a512));
        Map<A0, a> map13 = this.f40519m;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        A5 a513 = A5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(a013, new a(a513, a513));
        Map<A0, a> map14 = this.f40519m;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        A5 a514 = A5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(a014, new a(a514, a514));
        Map<A0, a> map15 = this.f40519m;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        A5 a515 = A5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(a015, new a(a515, a515));
        Map<A0, a> map16 = this.f40519m;
        A0 a016 = A0.TROUBLESHOOT_LOAD_FAILED;
        A5 a516 = A5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(a016, new a(a516, a516));
        Map<A0, a> map17 = this.f40519m;
        A0 a017 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        A5 a517 = A5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(a017, new a(a517, a517));
        Map<A0, a> map18 = this.f40519m;
        A0 a018 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        A5 a518 = A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a018, new a(a518, a518));
        Map<A0, a> map19 = this.f40519m;
        A0 a019 = A0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        A5 a519 = A5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(a019, new a(a519, a519));
        this.f40519m.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(A5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map20 = this.f40519m;
        A0 a020 = A0.TROUBLESHOOT_AD_EXPIRED;
        A5 a520 = A5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(a020, new a(a520, a520));
        this.f40519m.put(A0.TROUBLESHOOT_LOAD, new a(A5.TROUBLESHOOTING_RV_LOAD, null));
        this.f40519m.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(A5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f40519m.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(A5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f40519m.put(A0.TROUBLESHOOT_SHOW, new a(A5.TROUBLESHOOTING_RV_SHOW, null));
        this.f40519m.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(A5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f40519m.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(A5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<A0, a> map21 = this.f40519m;
        A0 a021 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        A5 a521 = A5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(a021, new a(a521, a521));
        this.f40519m.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(A5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f40519m.put(A0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(A5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f40519m.put(A0.TROUBLESHOOT_ILR_REVENUE, new a(A5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
    }

    public void f() {
        this.f40509c = null;
        this.f40513g = null;
        this.f40514h = null;
        this.f40511e = null;
        this.f40512f = null;
        this.f40515i = null;
        this.f40516j = null;
        this.f40517k = null;
    }

    public D0(IronSource.a aVar, b bVar, C0 c02, AbstractC4511r3 abstractC4511r3) {
        this.f40507a = aVar;
        this.f40508b = bVar;
        this.f40509c = c02;
        this.f40510d = abstractC4511r3 == null ? a(aVar) : abstractC4511r3;
        b();
        this.f40511e = new X8(this);
        this.f40512f = new C4621xb(this);
        this.f40513g = new Of(this);
        this.f40514h = new Q1(this);
        this.f40515i = new M(this);
        this.f40516j = new Sf(this);
        this.f40517k = new Qc(this);
    }

    protected void a(A0 a02, Map<String, Object> map) {
        a(a02, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(A0 a02, Map<String, Object> map, long j10) {
        int iA = a(a02);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        C0 c02 = this.f40509c;
        if (c02 != null) {
            map2.putAll(c02.a(a02));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f40510d.a(new C4649z5(iA, j10, new JSONObject(map2)));
    }

    private int a(A0 a02) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.f40507a) && this.f40518l.containsKey(a02)) {
                return this.f40518l.get(a02).a(this.f40508b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.f40507a) && this.f40519m.containsKey(a02)) {
                return this.f40519m.get(a02).a(this.f40508b);
            }
            if (IronSource.a.BANNER.equals(this.f40507a) && this.f40520n.containsKey(a02)) {
                return this.f40520n.get(a02).a(this.f40508b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.f40507a) && this.f40521o.containsKey(a02)) {
                return this.f40521o.get(a02).a(this.f40508b);
            }
            return -1;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    void a() {
        HashMap map = new HashMap();
        this.f40520n = map;
        map.put(A0.INIT_STARTED, new a(A5.BN_MANAGER_INIT_STARTED, null));
        this.f40520n.put(A0.INIT_ENDED, new a(A5.BN_MANAGER_INIT_ENDED, null));
        this.f40520n.put(A0.PLACEMENT_CAPPED, new a(A5.BN_PLACEMENT_CAPPED, null));
        this.f40520n.put(A0.AUCTION_REQUEST, new a(A5.BN_AUCTION_REQUEST, null));
        this.f40520n.put(A0.AUCTION_SUCCESS, new a(A5.BN_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f40520n;
        A0 a02 = A0.AUCTION_FAILED;
        A5 a52 = A5.BN_AUCTION_FAILED;
        map2.put(a02, new a(a52, null));
        this.f40520n.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(a52, null));
        this.f40520n.put(A0.AUCTION_REQUEST_WATERFALL, new a(A5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f40520n.put(A0.AUCTION_RESULT_WATERFALL, new a(A5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f40520n.put(A0.INIT_SUCCESS, new a(null, null));
        this.f40520n.put(A0.INIT_FAILED, new a(null, null));
        this.f40520n.put(A0.AD_OPENED, new a(A5.BN_CALLBACK_SHOW, A5.BN_INSTANCE_SHOW));
        this.f40520n.put(A0.SHOW_AD_FAILED, new a(A5.BN_CALLBACK_SHOW_FAILED, A5.BN_INSTANCE_SHOW_FAILED));
        this.f40520n.put(A0.AD_CLICKED, new a(A5.BN_CALLBACK_CLICK, A5.BN_INSTANCE_CLICK));
        this.f40520n.put(A0.LOAD_AD, new a(A5.BN_LOAD, A5.BN_INSTANCE_LOAD));
        this.f40520n.put(A0.RELOAD_AD, new a(A5.BN_RELOAD, A5.BN_INSTANCE_RELOAD));
        this.f40520n.put(A0.LOAD_AD_SUCCESS, new a(A5.BN_CALLBACK_LOAD_SUCCESS, A5.BN_INSTANCE_LOAD_SUCCESS));
        this.f40520n.put(A0.RELOAD_AD_SUCCESS, new a(A5.BN_CALLBACK_RELOAD_SUCCESS, A5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f40520n.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(A5.BN_CALLBACK_LOAD_ERROR, A5.BN_INSTANCE_LOAD_ERROR));
        this.f40520n.put(A0.RELOAD_AD_FAILED_WITH_REASON, new a(A5.BN_CALLBACK_RELOAD_ERROR, A5.BN_INSTANCE_RELOAD_ERROR));
        this.f40520n.put(A0.LOAD_AD_NO_FILL, new a(null, A5.BN_INSTANCE_LOAD_NO_FILL));
        this.f40520n.put(A0.RELOAD_AD_NO_FILL, new a(null, A5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f40520n.put(A0.AD_FORMAT_CAPPED, new a(A5.BN_AD_UNIT_CAPPED, null));
        this.f40520n.put(A0.COLLECT_TOKEN, new a(A5.BN_COLLECT_TOKENS, null));
        this.f40520n.put(A0.COLLECT_TOKENS_COMPLETED, new a(A5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f40520n.put(A0.COLLECT_TOKENS_FAILED, new a(A5.BN_COLLECT_TOKENS_FAILED, null));
        this.f40520n.put(A0.INSTANCE_COLLECT_TOKEN, new a(A5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.f40520n;
        A0 a03 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        A5 a53 = A5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a03, new a(a53, a53));
        Map<A0, a> map4 = this.f40520n;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        A5 a54 = A5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a04, new a(a54, a54));
        Map<A0, a> map5 = this.f40520n;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        A5 a55 = A5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a05, new a(a55, a55));
        this.f40520n.put(A0.DESTROY_AD, new a(A5.BN_DESTROY, A5.BN_INSTANCE_DESTROY));
        this.f40520n.put(A0.SKIP_RELOAD_AD, new a(A5.BN_SKIP_RELOAD, null));
        this.f40520n.put(A0.AD_LEFT_APPLICATION, new a(A5.BN_CALLBACK_LEAVE_APP, A5.BN_INSTANCE_LEAVE_APP));
        this.f40520n.put(A0.AD_PRESENT_SCREEN, new a(A5.BN_CALLBACK_PRESENT_SCREEN, A5.BN_INSTANCE_PRESENT_SCREEN));
        this.f40520n.put(A0.AD_DISMISS_SCREEN, new a(A5.BN_CALLBACK_DISMISS_SCREEN, A5.BN_INSTANCE_DISMISS_SCREEN));
        this.f40520n.put(A0.AD_VIEW_BOUND, new a(A5.BN_BOUND, A5.BN_INSTANCE_BOUND));
        this.f40520n.put(A0.PAUSE_AD, new a(A5.BN_REFRESH_PAUSE, null));
        this.f40520n.put(A0.RESUME_AD, new a(A5.BN_REFRESH_RESUME, null));
        this.f40520n.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(A5.BN_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.f40520n;
        A0 a06 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        A5 a56 = A5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(a06, new a(a56, a56));
        Map<A0, a> map7 = this.f40520n;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        A5 a57 = A5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(a07, new a(a57, a57));
        Map<A0, a> map8 = this.f40520n;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        A5 a58 = A5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(a08, new a(a58, a58));
        Map<A0, a> map9 = this.f40520n;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        A5 a59 = A5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a09, new a(a59, a59));
        Map<A0, a> map10 = this.f40520n;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        A5 a510 = A5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(a010, new a(a510, a510));
        Map<A0, a> map11 = this.f40520n;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        A5 a511 = A5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a011, new a(a511, a511));
        Map<A0, a> map12 = this.f40520n;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        A5 a512 = A5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(a012, new a(a512, a512));
        Map<A0, a> map13 = this.f40520n;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        A5 a513 = A5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(a013, new a(a513, a513));
        Map<A0, a> map14 = this.f40520n;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        A5 a514 = A5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(a014, new a(a514, a514));
        Map<A0, a> map15 = this.f40520n;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        A5 a515 = A5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(a015, new a(a515, a515));
        Map<A0, a> map16 = this.f40520n;
        A0 a016 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        A5 a516 = A5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(a016, new a(a516, a516));
        Map<A0, a> map17 = this.f40520n;
        A0 a017 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        A5 a517 = A5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(a017, new a(a517, a517));
        Map<A0, a> map18 = this.f40520n;
        A0 a018 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        A5 a518 = A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a018, new a(a518, a518));
        Map<A0, a> map19 = this.f40520n;
        A0 a019 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        A5 a519 = A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(a019, new a(a519, a519));
        this.f40520n.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(A5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f40520n.put(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(A5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f40520n.put(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(A5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f40520n.put(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(A5.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f40520n.put(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(A5.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f40520n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(A5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f40520n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(A5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<A0, a> map20 = this.f40520n;
        A0 a020 = A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        A5 a520 = A5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(a020, new a(a520, a520));
        Map<A0, a> map21 = this.f40520n;
        A0 a021 = A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        A5 a521 = A5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(a021, new a(a521, a521));
        Map<A0, a> map22 = this.f40520n;
        A0 a022 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        A5 a522 = A5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(a022, new a(a522, a522));
        this.f40520n.put(A0.TROUBLESHOOT_RELOAD, new a(A5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<A0, a> map23 = this.f40520n;
        A0 a023 = A0.TROUBLESHOOT_LOAD_SKIPPED;
        A5 a523 = A5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(a023, new a(a523, a523));
        this.f40520n.put(A0.TROUBLESHOOT_ILR_REVENUE, new a(A5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
