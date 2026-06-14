package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd f114123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy0 f114124b;

    public /* synthetic */ ny0() {
        this(new sd(), new iy0());
    }

    public final rd a(jy0 jy0Var) {
        try {
            IBinder iBinder = (IBinder) jy0Var.f112507a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            this.f114124b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            ae gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof ae ? (ae) iInterfaceQueryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f114123a.getClass();
            rd rdVar = (adTrackingLimited == null || advertisingId == null) ? null : new rd(advertisingId, adTrackingLimited.booleanValue());
            boolean z10 = lb1.f113032a;
            return rdVar;
        } catch (InterruptedException unused) {
            boolean z11 = lb1.f113032a;
            return null;
        }
    }

    public ny0(sd sdVar, iy0 iy0Var) {
        this.f114123a = sdVar;
        this.f114124b = iy0Var;
    }
}
