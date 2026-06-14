package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.ApiRequest;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapter;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.b;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class e4 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f80076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f80077k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f80078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80079b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue f80082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue f80083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f80084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ApiRequest f80085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f80086i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.l f80080c = new BidMachineTrackingObject();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f80081d = new b(this);

    class a implements Runnable {

        /* JADX INFO: renamed from: io.bidmachine.e4$a$a, reason: collision with other inner class name */
        class C0976a implements b.InterfaceC0975b {
            C0976a() {
            }

            @Override // io.bidmachine.core.b.InterfaceC0975b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onFail(ae.a aVar) {
                final long j10;
                e4.this.f80085h = null;
                if (e4.this.f80083f.isEmpty()) {
                    j10 = e4.this.j();
                    io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.d4
                        @Override // ce.b
                        public final Object get() {
                            return String.format("reschedule init request (%s)", Long.valueOf(j10));
                        }
                    });
                    if (e4.this.f80084g != null) {
                        e4.this.f80084g.onFail(aVar);
                    }
                } else {
                    j10 = 0;
                }
                io.bidmachine.core.h.T(e4.this.f80081d, j10);
                e4.this.f80080c.eventFinish(TrackEventType.InitLoading, null, null, aVar);
            }

            @Override // io.bidmachine.core.b.InterfaceC0975b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InitResponse initResponse) {
                e4.this.f80085h = null;
                e4.this.f80086i = 0L;
                io.bidmachine.core.h.f(e4.this.f80081d);
                if (e4.this.f80084g != null) {
                    e4.this.f80084g.onSuccess(initResponse);
                }
                e4.this.f80080c.eventFinish(TrackEventType.InitLoading, null, null, null);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e4.this.f80085h = new ApiRequest.Builder().url(e4.this.q()).setDataBinder(new ApiRequest.ApiInitDataBinder()).setRequestData(e4.this.l()).setCallback(new C0976a()).request();
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f80089b;

        public b(e4 e4Var) {
            this.f80089b = new WeakReference(e4Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            e4 e4Var = (e4) this.f80089b.get();
            if (e4Var != null) {
                e4Var.r();
            }
        }
    }

    interface c extends b.InterfaceC0975b {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f80076j = timeUnit.toMillis(2L);
        f80077k = timeUnit.toMillis(128L);
    }

    public e4(Context context, String str, Queue queue) {
        this.f80078a = context;
        this.f80079b = str;
        this.f80082e = new LinkedList(queue);
        this.f80083f = new LinkedList(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        long j10 = this.f80086i;
        if (j10 <= 0) {
            this.f80086i = f80076j;
        } else {
            long j11 = j10 * 2;
            this.f80086i = j11;
            long j12 = f80077k;
            if (j11 >= j12) {
                this.f80086i = j12;
            }
        }
        return this.f80086i;
    }

    private Struct k(Context context) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        builderNewBuilder.putFields("networks_info", Value.newBuilder().setListValue(m(context)).build());
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InitRequest l() throws Throwable {
        ConnectionType connectionTypeB;
        AdvertisingDataManager.d(this.f80078a);
        j2 j2VarE = j2.e();
        d6 d6VarW = j2VarE.w();
        TargetingParams targetingParamsU = j2VarE.u();
        InitRequest.Builder builderNewBuilder = InitRequest.newBuilder();
        String packageName = this.f80078a.getPackageName();
        if (packageName != null) {
            builderNewBuilder.setBundle(packageName);
        }
        builderNewBuilder.setSellerId(this.f80079b);
        builderNewBuilder.setOs(OS.OS_ANDROID);
        builderNewBuilder.setOsv(ae.c.h());
        String strT = io.bidmachine.core.h.t(this.f80078a);
        if (strT != null) {
            builderNewBuilder.setAppVer(strT);
        }
        builderNewBuilder.setSdk(BidMachine.NAME);
        builderNewBuilder.setSdkver("3.5.0");
        builderNewBuilder.setIfa(AdvertisingDataManager.a(this.f80078a, !d6VarW.e()));
        String strJ = j2VarE.j();
        if (!TextUtils.isEmpty(strJ)) {
            builderNewBuilder.setIfv(strJ);
        }
        builderNewBuilder.setBmIfv(j2VarE.G(this.f80078a));
        builderNewBuilder.setSessionId(SessionManager.get().getSessionId());
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(this.f80078a);
        String str = deviceInfoObtain.manufacturer;
        if (str != null) {
            builderNewBuilder.setMake(str);
        }
        String str2 = deviceInfoObtain.model;
        if (str2 != null) {
            builderNewBuilder.setModel(str2);
        }
        String hwv = deviceInfoObtain.getHWV();
        if (hwv != null) {
            builderNewBuilder.setHwv(hwv);
        }
        builderNewBuilder.setDeviceType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        if (d6VarW.c()) {
            connectionTypeB = ae.c.b(this.f80078a);
            builderNewBuilder.setContype(connectionTypeB);
        } else {
            connectionTypeB = null;
        }
        if (d6VarW.f()) {
            Context.Geo.Builder builderC = ae.f.c(this.f80078a, targetingParamsU.getDeviceLocation(), null, true);
            targetingParamsU.build(builderC);
            builderNewBuilder.setGeo(builderC);
        }
        builderNewBuilder.setContext(RequestDataRetriever.collectContext(this.f80078a, j2VarE, d6VarW, targetingParamsU, connectionTypeB, null));
        builderNewBuilder.setAndroid(o(this.f80078a));
        builderNewBuilder.setExt(k(this.f80078a));
        return builderNewBuilder.build();
    }

    private ListValue.Builder m(android.content.Context context) {
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (o4 o4Var : n4.e(context).values()) {
            builderNewBuilder.addValues(n(o4Var.c(), o4Var.d(), o4Var.a()));
        }
        builderNewBuilder.addValues(n("mraid", "3.5.0", "3.5.0.1"));
        builderNewBuilder.addValues(n("vast", "3.5.0", "3.5.0.1"));
        builderNewBuilder.addValues(n(NastAdapter.KEY, NastAdapter.ADAPTER_SDK_VERSION_NAME, "3.5.0.1"));
        builderNewBuilder.addValues(n(AdaptiveRenderingAdapter.KEY, "3.5.0", "3.5.0.1"));
        return builderNewBuilder;
    }

    private Value n(String str, String str2, String str3) {
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        Value valueBuild2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", valueBuild).putFields("network_version", valueBuild2).putFields("network_adapter_version", Value.newBuilder().setStringValue(str3).build()).build()).build();
    }

    private InitRequest.AndroidPlatformData o(android.content.Context context) {
        PlatformData platformData = PlatformData.get(context);
        final InitRequest.AndroidPlatformData.Builder builderNewBuilder = InitRequest.AndroidPlatformData.newBuilder();
        Integer minSdkVersion = platformData.getMinSdkVersion();
        Objects.requireNonNull(builderNewBuilder);
        io.bidmachine.core.h.F(minSdkVersion, new Executable() { // from class: io.bidmachine.b4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setMinApiLevel(((Integer) obj).intValue());
            }
        });
        io.bidmachine.core.h.F(platformData.kotlinVersion, new Executable() { // from class: io.bidmachine.c4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builderNewBuilder.setKotlinVersion((String) obj);
            }
        });
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String q() {
        if (this.f80083f.isEmpty()) {
            this.f80083f.addAll(this.f80082e);
        }
        return (String) this.f80083f.poll();
    }

    void p() {
        this.f80084g = null;
        this.f80085h = null;
    }

    void r() {
        this.f80080c.eventStart(TrackEventType.InitLoading, null);
        io.bidmachine.core.h.S(new a());
    }

    void s(c cVar) {
        this.f80084g = cVar;
    }
}
