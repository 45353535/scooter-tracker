package f1;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z3 extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f71768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71768b = context;
    }

    public e1 b() throws Throwable {
        String str = null;
        if (a()) {
            return new e1(f6.f69803e, null);
        }
        f6 f6Var = f6.f69801c;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f71768b);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                f6Var = f6.f69803e;
            } else {
                f6Var = f6.f69802d;
                String id2 = advertisingIdInfo.getId();
                try {
                    if (Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", id2)) {
                        f6Var = f6.f69803e;
                    } else {
                        str = id2;
                    }
                } catch (GooglePlayServicesNotAvailableException e10) {
                    e = e10;
                    str = id2;
                    eg.i("Google play service is not available.", e);
                } catch (GooglePlayServicesRepairableException e11) {
                    e = e11;
                    str = id2;
                    eg.i("There was a recoverable error connecting to Google Play Services.", e);
                } catch (IOException e12) {
                    e = e12;
                    str = id2;
                    eg.i("The connection to Google Play Services failed.", e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str = id2;
                    eg.i("This should have been called off the main thread.", e);
                }
            }
        } catch (GooglePlayServicesNotAvailableException e14) {
            e = e14;
        } catch (GooglePlayServicesRepairableException e15) {
            e = e15;
        } catch (IOException e16) {
            e = e16;
        } catch (IllegalStateException e17) {
            e = e17;
        }
        return new e1(f6Var, str);
    }
}
