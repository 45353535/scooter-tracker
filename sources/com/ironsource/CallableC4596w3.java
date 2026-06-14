package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class CallableC4596w3 implements Callable<A3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdData f45698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4630y3 f45699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4613x3 f45700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkSettings f45701f;

    /* JADX INFO: renamed from: com.ironsource.w3$a */
    class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4360i5 f45702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BlockingQueue f45703b;

        a(C4360i5 c4360i5, BlockingQueue blockingQueue) {
            this.f45702a = c4360i5;
            this.f45703b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.f45703b.add(new A3(CallableC4596w3.this.d(), CallableC4596w3.this.c(), null, C4360i5.a(this.f45702a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.f45703b.add(new A3(CallableC4596w3.this.d(), CallableC4596w3.this.c(), map, C4360i5.a(this.f45702a), null));
        }
    }

    public CallableC4596w3(int i10, String str, AdData adData, InterfaceC4630y3 interfaceC4630y3, InterfaceC4613x3 interfaceC4613x3, NetworkSettings networkSettings) {
        this.f45696a = i10;
        this.f45697b = str;
        this.f45698c = adData;
        this.f45699d = interfaceC4630y3;
        this.f45700e = interfaceC4613x3;
        this.f45701f = networkSettings;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public A3 call() throws Exception {
        C4360i5 c4360i5 = new C4360i5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f45698c, ContextProvider.getInstance().getActiveContext(), new a(c4360i5, arrayBlockingQueue));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            String str = "Exception while calling collectBiddingData - " + e10.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC4613x3 interfaceC4613x3 = this.f45700e;
            if (interfaceC4613x3 != null) {
                interfaceC4613x3.a(str);
            }
        } catch (NoClassDefFoundError e11) {
            C4462o4.d().a(e11);
            String str2 = "Error while calling collectBiddingData - " + e11.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC4613x3 interfaceC4613x32 = this.f45700e;
            if (interfaceC4613x32 != null) {
                interfaceC4613x32.a(str2);
            }
        }
        InterfaceC4613x3 interfaceC4613x33 = this.f45700e;
        if (interfaceC4613x33 != null) {
            interfaceC4613x33.a(this.f45701f);
        }
        return (A3) arrayBlockingQueue.take();
    }

    public InterfaceC4630y3 b() {
        return this.f45699d;
    }

    public String c() {
        return this.f45697b;
    }

    public int d() {
        return this.f45696a;
    }
}
