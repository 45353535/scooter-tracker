package io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import com.my.target.common.menu.MenuActionType;
import io.bidmachine.ApiRequest;
import io.bidmachine.core.b;
import io.bidmachine.e5;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ae.k f81919a = new ae.k("AdResponseLoader");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f81921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f81922d;

    interface a {
        void a(ae.a aVar);

        void b(u uVar);

        void onCancel();
    }

    static class b implements b.InterfaceC0975b, b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f81923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f81924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdRequestParameters f81925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NetworkAdUnitManager f81926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WeakReference f81927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f81928f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicBoolean f81929g = new AtomicBoolean(false);

        class a implements e5.a {
            a() {
            }

            @Override // io.bidmachine.e5.a
            public void a(ae.a aVar) {
                b.this.f81926d.notifyNetworkAuctionResult(null);
                b.this.f81926d.notifyNetworkClearAuction();
                b.this.k(aVar);
            }

            @Override // io.bidmachine.e5.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(u uVar) {
                boolean zE = b.this.e();
                uVar.T(zE ? x0.Idle : x0.Busy);
                w0.f().n(uVar);
                if (zE) {
                    uVar.Q();
                } else {
                    b.this.f81926d.notifyNetworkAuctionResult(uVar.I());
                    b.this.l(uVar);
                }
            }
        }

        public b(String str, String str2, AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, a aVar) {
            this.f81923a = str;
            this.f81924b = str2;
            this.f81925c = adRequestParameters;
            this.f81926d = networkAdUnitManager;
            this.f81927e = new WeakReference(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            return this.f81929g.get() || this.f81928f.get() || this.f81927e.get() == null;
        }

        private a i() {
            if (e()) {
                return null;
            }
            this.f81928f.set(true);
            return (a) this.f81927e.get();
        }

        private void j() {
            a aVarI = i();
            if (aVarI != null) {
                aVarI.onCancel();
            }
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(ae.a aVar) {
            a aVarI = i();
            if (aVarI != null) {
                aVarI.a(aVar);
            }
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(u uVar) {
            a aVarI = i();
            if (aVarI != null) {
                aVarI.b(uVar);
            } else {
                uVar.T(x0.Idle);
            }
            f();
        }

        public void f() {
            this.f81929g.set(true);
            this.f81927e.clear();
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onFail(ae.a aVar) {
            b5.b().c(this.f81923a);
            this.f81926d.notifyNetworkAuctionResult(null);
            this.f81926d.notifyNetworkClearAuction();
            u uVarK = w0.f().k(this.f81925c);
            if (uVarK != null) {
                l(uVarK);
            } else {
                k(aVar);
            }
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Response response) {
            b5.b().c(this.f81923a);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.f81924b);
            e5.a(this.f81925c, this.f81926d, response, new a());
        }

        @Override // io.bidmachine.core.b.c
        public void onCanceled() {
            b5.b().c(this.f81923a);
            this.f81926d.notifyNetworkClearAuction();
            j();
        }
    }

    public s0(String str) {
        this.f81920b = str;
    }

    public void a() {
        io.bidmachine.core.a.c(this.f81919a, MenuActionType.CANCEL);
        this.f81921c = null;
        b bVar = this.f81922d;
        if (bVar != null) {
            bVar.f();
            this.f81922d = null;
        }
    }

    public void b(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, ApiRequest.Builder builder, a aVar) {
        io.bidmachine.core.a.c(this.f81919a, "load");
        b bVar = this.f81922d;
        if (bVar != null) {
            bVar.f();
        }
        this.f81921c = aVar;
        b bVar2 = new b(this.f81920b, builder.getUrl(), adRequestParameters, networkAdUnitManager, aVar);
        this.f81922d = bVar2;
        builder.setCallback(bVar2);
        builder.setCancelCallback(this.f81922d);
        b5.b().a(this.f81920b, builder.request());
    }
}
