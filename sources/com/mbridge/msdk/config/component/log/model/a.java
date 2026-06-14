package com.mbridge.msdk.config.component.log.model;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47106a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47107b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47108c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47109d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47110e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47111f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47112g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f47113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f47114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f47115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f47116k;

    public void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey("size")) {
                this.f47106a = ((Integer) map.get("size")).intValue();
            }
            if (map.containsKey("timeout")) {
                this.f47107b = ((Integer) map.get("timeout")).intValue();
            }
            if (map.containsKey("report_on_network_changed")) {
                this.f47108c = ((Integer) map.get("report_on_network_changed")).intValue();
            }
            if (map.containsKey("report_on_succeed")) {
                this.f47109d = ((Integer) map.get("report_on_succeed")).intValue();
            }
            if (map.containsKey("retry")) {
                this.f47110e = ((Integer) map.get("retry")).intValue();
            }
            if (map.containsKey("max_count")) {
                this.f47111f = ((Integer) map.get("max_count")).intValue();
            }
            if (map.containsKey("ttl")) {
                this.f47112g = ((Integer) map.get("ttl")).intValue();
            }
            if (map.containsKey("http_config")) {
                this.f47113h = (Map) map.get("http_config");
            }
            if (map.containsKey("tcp_config")) {
                this.f47114i = (Map) map.get("tcp_config");
            }
            if (map.containsKey("shared_info")) {
                this.f47115j = (Map) map.get("shared_info");
            }
            this.f47116k = map.containsKey("trigger_report") ? ((Integer) map.get("trigger_report")).intValue() : 0;
        }
    }

    public int b() {
        return this.f47107b;
    }

    public String c() {
        Map<String, Object> map = this.f47113h;
        return (map == null || !map.containsKey("url")) ? "" : (String) this.f47113h.get("url");
    }

    public int d() {
        return this.f47111f;
    }

    public int e() {
        return this.f47116k;
    }

    public int f() {
        Map<String, Object> map = this.f47113h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f47110e;
    }

    public Map<String, Object> h() {
        return this.f47115j;
    }

    public String i() {
        Map<String, Object> map = this.f47114i;
        return (map == null || !map.containsKey("host")) ? "" : (String) this.f47114i.get("host");
    }

    public int j() {
        Map<String, Object> map = this.f47114i;
        if (map == null || !map.containsKey("port")) {
            return 0;
        }
        return ((Integer) this.f47114i.get("port")).intValue();
    }

    public int k() {
        return this.f47112g;
    }

    public int a() {
        return this.f47106a;
    }
}
