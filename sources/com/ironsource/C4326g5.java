package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4326g5 implements InterfaceC4651z7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f43150e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C4326g5 f43151f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerC4309f5 f43152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f43153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f43154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43155d;

    private C4326g5(String str, S7 s72, JSONObject jSONObject) {
        this.f43155d = str;
        this.f43152a = new HandlerC4309f5(s72.a());
        this.f43153b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C4326g5 a(String str, S7 s72, JSONObject jSONObject) {
        try {
            if (f43151f == null) {
                f43151f = new C4326g5(str, s72, jSONObject);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43151f;
    }

    private Thread b(C4652z8 c4652z8, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f43153b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f43153b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f43153b.optBoolean(C4274d4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C4275d5(c4652z8, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), zOptBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.f43154c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f43151f = null;
        HandlerC4309f5 handlerC4309f5 = this.f43152a;
        if (handlerC4309f5 != null) {
            handlerC4309f5.a();
            this.f43152a = null;
        }
    }

    @Override // com.ironsource.InterfaceC4651z7
    public void a(Lc lc2) {
        this.f43152a.a(lc2);
    }

    private Thread a(C4275d5 c4275d5, Handler handler) {
        return new Thread(new Cif(c4275d5, handler));
    }

    @Override // com.ironsource.InterfaceC4651z7
    public void a(C4652z8 c4652z8, String str, int i10, int i11, Handler handler) {
        b(c4652z8, str, i10, i11, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f43155d, C4274d4.D);
    }

    @Override // com.ironsource.InterfaceC4651z7
    public void a(C4652z8 c4652z8, String str, int i10, int i11) {
        b(c4652z8, str, i10, i11, this.f43152a).start();
    }

    @Override // com.ironsource.InterfaceC4651z7
    public void a(C4652z8 c4652z8, String str) {
        int iOptInt = this.f43153b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f43153b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f43153b.optBoolean(C4274d4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C4275d5(c4652z8, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f43152a);
        this.f43154c = threadA;
        threadA.start();
    }

    public String a() {
        return this.f43155d;
    }
}
