package com.applovin.impl;

import com.applovin.impl.b5;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r3 extends x4 {
    public static final x4 A7;
    public static final x4 A8;
    public static final x4 B7;
    public static final x4 B8;
    public static final x4 C7;
    public static final x4 C8;
    public static final x4 D7;
    public static final x4 E7;
    public static final x4 F7;
    public static final x4 G7;
    public static final x4 H7;
    public static final x4 I7;
    public static final x4 J7;
    public static final x4 K7;
    public static final x4 L7;
    public static final x4 M7;
    public static final x4 N7;
    public static final x4 O7;
    public static final x4 P7;
    public static final x4 Q7;
    public static final x4 R7;
    public static final x4 S7;
    public static final x4 T7;
    public static final x4 U7;
    public static final x4 V7;
    public static final x4 W7;
    public static final x4 X7;
    public static final x4 Y7;
    public static final x4 Z7;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public static final x4 f10308a8;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    public static final x4 f10309b8;

    /* JADX INFO: renamed from: c8, reason: collision with root package name */
    public static final x4 f10310c8;

    /* JADX INFO: renamed from: d8, reason: collision with root package name */
    public static final x4 f10311d8;

    /* JADX INFO: renamed from: e8, reason: collision with root package name */
    public static final x4 f10312e8;

    /* JADX INFO: renamed from: f8, reason: collision with root package name */
    public static final x4 f10313f8;

    /* JADX INFO: renamed from: g8, reason: collision with root package name */
    public static final x4 f10314g8;

    /* JADX INFO: renamed from: h8, reason: collision with root package name */
    public static final x4 f10315h8;

    /* JADX INFO: renamed from: i8, reason: collision with root package name */
    public static final x4 f10316i8;

    /* JADX INFO: renamed from: j8, reason: collision with root package name */
    public static final x4 f10317j8;

    /* JADX INFO: renamed from: k8, reason: collision with root package name */
    public static final x4 f10318k8;

    /* JADX INFO: renamed from: l8, reason: collision with root package name */
    public static final x4 f10319l8;

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    public static final x4 f10320m7 = x4.a("afi", "");

    /* JADX INFO: renamed from: m8, reason: collision with root package name */
    public static final x4 f10321m8;

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final x4 f10322n7;

    /* JADX INFO: renamed from: n8, reason: collision with root package name */
    public static final x4 f10323n8;

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    public static final x4 f10324o7;

    /* JADX INFO: renamed from: o8, reason: collision with root package name */
    public static final x4 f10325o8;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final x4 f10326p7;

    /* JADX INFO: renamed from: p8, reason: collision with root package name */
    public static final x4 f10327p8;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    public static final x4 f10328q7;

    /* JADX INFO: renamed from: q8, reason: collision with root package name */
    public static final x4 f10329q8;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    public static final x4 f10330r7;

    /* JADX INFO: renamed from: r8, reason: collision with root package name */
    public static final x4 f10331r8;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    public static final x4 f10332s7;

    /* JADX INFO: renamed from: s8, reason: collision with root package name */
    public static final x4 f10333s8;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    public static final x4 f10334t7;

    /* JADX INFO: renamed from: t8, reason: collision with root package name */
    public static final x4 f10335t8;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    public static final x4 f10336u7;

    /* JADX INFO: renamed from: u8, reason: collision with root package name */
    public static final x4 f10337u8;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final x4 f10338v7;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    public static final x4 f10339v8;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    public static final x4 f10340w7;

    /* JADX INFO: renamed from: w8, reason: collision with root package name */
    public static final x4 f10341w8;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final x4 f10342x7;

    /* JADX INFO: renamed from: x8, reason: collision with root package name */
    public static final x4 f10343x8;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final x4 f10344y7;

    /* JADX INFO: renamed from: y8, reason: collision with root package name */
    public static final x4 f10345y8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final x4 f10346z7;

    /* JADX INFO: renamed from: z8, reason: collision with root package name */
    public static final x4 f10347z8;

    static {
        Boolean bool = Boolean.FALSE;
        f10322n7 = x4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10324o7 = x4.a("afi_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f10326p7 = x4.a("mediation_endpoint", "https://ms.applovin.com/");
        f10328q7 = x4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f10330r7 = x4.a("fetch_next_ad_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        f10332s7 = x4.a("fetch_next_ad_timeout_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f10334t7 = x4.a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(timeUnit.toMillis(7L)));
        Boolean bool2 = Boolean.TRUE;
        f10336u7 = x4.a("auto_init_mediation_debugger", bool2);
        f10338v7 = x4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f10340w7 = x4.a("max_signal_provider_latency_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f10342x7 = x4.a("default_adapter_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f10344y7 = x4.a("ad_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        f10346z7 = x4.a("ad_load_failure_refresh_ms", Long.valueOf(timeUnit.toMillis(30L)));
        A7 = x4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        B7 = x4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        C7 = x4.a("refresh_ad_view_timer_responds_to_background", bool2);
        D7 = x4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        E7 = x4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        F7 = x4.a("avrsponse", bool);
        G7 = x4.a("allow_pause_auto_refresh_immediately", bool);
        H7 = x4.a("ad_view_race_condition_fix_enabled", bool);
        I7 = x4.a("always_destroy_ad_view_on_ui_thread", bool);
        J7 = x4.a("fullscreen_display_delay_ms", 0L);
        K7 = x4.a("susaode", bool);
        L7 = x4.a("ahdm", 500L);
        M7 = x4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        N7 = x4.a("ad_view_refresh_precache_request_enabled", bool2);
        O7 = x4.a("famttl_ms", 0L);
        P7 = x4.a("signal_expiration_ms", -1L);
        Q7 = x4.a("signal_cache_level", Integer.valueOf(b5.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        R7 = x4.a("ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        S7 = x4.a("native_ad_expiration_ms", Long.valueOf(timeUnit2.toMillis(4L)));
        T7 = x4.a("rena", bool2);
        U7 = x4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        V7 = x4.a("freast_ms", -1L);
        W7 = x4.a("ad_hidden_timeout_ms", -1L);
        X7 = x4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        Y7 = x4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        Z7 = x4.a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f10308a8 = x4.a("proe", bool);
        f10309b8 = x4.a("mute_state", 2);
        f10310c8 = x4.a("saf", "");
        f10311d8 = x4.a("saui", "");
        f10312e8 = x4.a("malm_v2_e", bool);
        f10313f8 = x4.a("slsaod", bool);
        f10314g8 = x4.a("mspc", 1);
        f10315h8 = x4.a("mra", -1);
        f10316i8 = x4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        f10317j8 = x4.a("fadiafase", bool2);
        f10318k8 = x4.a("fadwvcv", bool2);
        f10319l8 = x4.a("bfarud", bool);
        f10321m8 = x4.a("inacc", Boolean.valueOf(n7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f10323n8 = x4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f10325o8 = x4.a("faomq", bool);
        f10327p8 = x4.a("rahcnct_sec", -1);
        f10329q8 = x4.a("paslbaf", JsonUtils.EMPTY_JSON);
        f10331r8 = x4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        f10333s8 = x4.a("siarni", bool);
        f10335t8 = x4.a("spims", bool);
        f10337u8 = x4.a("uabta", bool);
        f10339v8 = x4.a("use_initialization_spec_during_init", bool);
        f10341w8 = x4.a("report_cimp_after_ierr", bool);
        f10343x8 = x4.a("fail_collection_for_empty_signal", bool);
        f10345y8 = x4.a("fetch_mediated_ad_gzip", bool2);
        f10347z8 = x4.a("max_postback_gzip", bool2);
        A8 = x4.a("md_endpoint", "https://md.applovin.com/");
        B8 = x4.a("md_backup_endpoint", "https://md.applvn.com/");
        C8 = x4.a("md_v2", bool);
    }
}
