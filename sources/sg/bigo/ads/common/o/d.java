package sg.bigo.ads.common.o;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f102596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f102597b;

    private d(Context context, long j10) {
        this.f102596a = context;
        this.f102597b = j10;
    }

    @Nullable
    private synchronized sg.bigo.ads.common.a a() {
        f fVarA;
        e eVarA = a(this.f102596a);
        if (eVarA == null) {
            throw new b();
        }
        fVarA = eVarA.a(this.f102597b, TimeUnit.MILLISECONDS);
        if (fVarA == null) {
            eVarA.a();
            throw new b();
        }
        return new sg.bigo.ads.common.a(fVarA.a(), fVarA.b());
    }

    @Nullable
    public static sg.bigo.ads.common.a a(Context context, long j10) {
        try {
            return new d(context, j10).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private static e a(Context context) {
        boolean zBindService;
        e eVarA = e.a(context);
        if (eVarA.f102600a.isEmpty()) {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            try {
                eVarA.f102601b = true;
                zBindService = context.bindService(intent, eVarA, 1);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                eVarA.a();
                throw th2;
            }
            if (!zBindService) {
                if (zBindService) {
                    return null;
                }
                eVarA.a();
                return null;
            }
            if (!zBindService) {
                eVarA.a();
            }
        }
        return eVarA;
    }
}
