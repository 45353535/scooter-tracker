package m9;

import android.content.Context;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.iab.omid.library.appodeal.Omid;
import com.iab.omid.library.appodeal.adsession.Partner;
import io.bidmachine.BuildConfig;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.core.h;
import io.bidmachine.protobuf.sdk.SDK;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f94511a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f94512b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Partner f94513c;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f94514b;

        a(Context context) {
            this.f94514b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (Omid.isActive()) {
                    return;
                }
                Omid.activate(this.f94514b);
                Omid.updateLastActivity();
                Partner unused = c.f94513c = Partner.createPartner("Appodeal", BuildConfig.OMSDK_VERSION_NAME);
                c.f94512b.set(true);
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
        }
    }

    public static void c(SDK.Builder builder) {
        builder.setOmidpn("Appodeal");
        builder.setOmidpv(BuildConfig.OMSDK_VERSION_NAME);
    }

    public static void d(Struct.Builder builder) {
        builder.putFields(ProtoExtConstants.Source.OMID_PN, Value.newBuilder().setStringValue("Appodeal").build());
        builder.putFields(ProtoExtConstants.Source.OMID_PV, Value.newBuilder().setStringValue(BuildConfig.OMSDK_VERSION_NAME).build());
    }

    public static Partner e() {
        return f94513c;
    }

    public static void f(Context context) {
        if (f94511a.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            if (ExtraParamsManager.get().getInternalDataRetriever(applicationContext).m("omsdk_disabled", false)) {
                return;
            }
            h.U(new a(applicationContext));
        }
    }

    public static boolean g() {
        return f94512b.get();
    }
}
