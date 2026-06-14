package io.sentry;

import com.google.common.base.Ascii;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f83698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Double f83699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f83700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Double f83701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f83702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f83703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f83704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f83705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f83706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f83707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f83708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    w3 f83709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f83710n;

    public static final class a implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l5 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            l5 l5Var = new l5();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -801141276:
                        if (strNextName.equals("is_enable_app_start_profiling")) {
                            b10 = 0;
                        }
                        break;
                    case -566246656:
                        if (strNextName.equals("trace_sampled")) {
                            b10 = 1;
                        }
                        break;
                    case -450071601:
                        if (strNextName.equals("profiling_traces_dir_path")) {
                            b10 = 2;
                        }
                        break;
                    case -436975123:
                        if (strNextName.equals("is_continuous_profiling_enabled")) {
                            b10 = 3;
                        }
                        break;
                    case -116896685:
                        if (strNextName.equals("is_profiling_enabled")) {
                            b10 = 4;
                        }
                        break;
                    case -104146616:
                        if (strNextName.equals("is_start_profiler_on_app_start")) {
                            b10 = 5;
                        }
                        break;
                    case -69617820:
                        if (strNextName.equals("profile_sampled")) {
                            b10 = 6;
                        }
                        break;
                    case 401419348:
                        if (strNextName.equals("profile_lifecycle")) {
                            b10 = 7;
                        }
                        break;
                    case 1401020980:
                        if (strNextName.equals("continuous_profile_sampled")) {
                            b10 = 8;
                        }
                        break;
                    case 1583866442:
                        if (strNextName.equals("profiling_traces_hz")) {
                            b10 = 9;
                        }
                        break;
                    case 1653938779:
                        if (strNextName.equals("trace_sample_rate")) {
                            b10 = 10;
                        }
                        break;
                    case 2140552383:
                        if (strNextName.equals("profile_sample_rate")) {
                            b10 = Ascii.VT;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        Boolean boolX = m3Var.x();
                        if (boolX != null) {
                            l5Var.f83707k = boolX.booleanValue();
                        }
                        break;
                    case 1:
                        Boolean boolX2 = m3Var.x();
                        if (boolX2 != null) {
                            l5Var.f83700d = boolX2.booleanValue();
                        }
                        break;
                    case 2:
                        String strG = m3Var.G();
                        if (strG != null) {
                            l5Var.f83702f = strG;
                        }
                        break;
                    case 3:
                        Boolean boolX3 = m3Var.x();
                        if (boolX3 != null) {
                            l5Var.f83704h = boolX3.booleanValue();
                        }
                        break;
                    case 4:
                        Boolean boolX4 = m3Var.x();
                        if (boolX4 != null) {
                            l5Var.f83703g = boolX4.booleanValue();
                        }
                        break;
                    case 5:
                        Boolean boolX5 = m3Var.x();
                        if (boolX5 != null) {
                            l5Var.f83708l = boolX5.booleanValue();
                        }
                        break;
                    case 6:
                        Boolean boolX6 = m3Var.x();
                        if (boolX6 != null) {
                            l5Var.f83698b = boolX6.booleanValue();
                        }
                        break;
                    case 7:
                        String strG2 = m3Var.G();
                        if (strG2 != null) {
                            try {
                                l5Var.f83709m = w3.valueOf(strG2);
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(g7.ERROR, "Error when deserializing ProfileLifecycle: " + strG2, new Object[0]);
                            }
                        }
                        break;
                    case 8:
                        Boolean boolX7 = m3Var.x();
                        if (boolX7 != null) {
                            l5Var.f83706j = boolX7.booleanValue();
                        }
                        break;
                    case 9:
                        Integer numD0 = m3Var.d0();
                        if (numD0 != null) {
                            l5Var.f83705i = numD0.intValue();
                        }
                        break;
                    case 10:
                        Double dX = m3Var.X();
                        if (dX != null) {
                            l5Var.f83701e = dX;
                        }
                        break;
                    case 11:
                        Double dX2 = m3Var.X();
                        if (dX2 != null) {
                            l5Var.f83699c = dX2;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            l5Var.a(concurrentHashMap);
            m3Var.endObject();
            return l5Var;
        }
    }

    public l5() {
        this.f83700d = false;
        this.f83701e = null;
        this.f83698b = false;
        this.f83699c = null;
        this.f83706j = false;
        this.f83702f = null;
        this.f83703g = false;
        this.f83704h = false;
        this.f83709m = w3.MANUAL;
        this.f83705i = 0;
        this.f83707k = true;
        this.f83708l = false;
    }

    public void a(Map map) {
        this.f83710n = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("profile_sampled").j(iLogger, Boolean.valueOf(this.f83698b));
        n3Var.e("profile_sample_rate").j(iLogger, this.f83699c);
        n3Var.e("continuous_profile_sampled").j(iLogger, Boolean.valueOf(this.f83706j));
        n3Var.e("trace_sampled").j(iLogger, Boolean.valueOf(this.f83700d));
        n3Var.e("trace_sample_rate").j(iLogger, this.f83701e);
        n3Var.e("profiling_traces_dir_path").j(iLogger, this.f83702f);
        n3Var.e("is_profiling_enabled").j(iLogger, Boolean.valueOf(this.f83703g));
        n3Var.e("is_continuous_profiling_enabled").j(iLogger, Boolean.valueOf(this.f83704h));
        n3Var.e("profile_lifecycle").j(iLogger, this.f83709m.name());
        n3Var.e("profiling_traces_hz").j(iLogger, Integer.valueOf(this.f83705i));
        n3Var.e("is_enable_app_start_profiling").j(iLogger, Boolean.valueOf(this.f83707k));
        n3Var.e("is_start_profiler_on_app_start").j(iLogger, Boolean.valueOf(this.f83708l));
        Map map = this.f83710n;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83710n.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    l5(v7 v7Var, d9 d9Var) {
        this.f83700d = d9Var.e().booleanValue();
        this.f83701e = d9Var.d();
        this.f83698b = d9Var.b().booleanValue();
        this.f83699c = d9Var.a();
        this.f83706j = v7Var.getInternalTracesSampler().c(io.sentry.util.b0.a().h());
        this.f83702f = v7Var.getProfilingTracesDirPath();
        this.f83703g = v7Var.isProfilingEnabled();
        this.f83704h = v7Var.isContinuousProfilingEnabled();
        this.f83709m = v7Var.getProfileLifecycle();
        this.f83705i = v7Var.getProfilingTracesHz();
        this.f83707k = v7Var.isEnableAppStartProfiling();
        this.f83708l = v7Var.isStartProfilerOnAppStart();
    }
}
