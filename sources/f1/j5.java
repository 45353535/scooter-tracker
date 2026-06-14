package f1;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class j5 implements ProviderInstaller.ProviderInstallListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6 f70149b;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        public final void a() {
            try {
                ProviderInstaller.installIfNeededAsync(j5.this.f70148a, j5.this);
            } catch (Exception e10) {
                eg.i("ProviderInstaller", e10);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public j5(Context context, t6 uiPoster) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f70148a = context;
        this.f70149b = uiPoster;
    }

    public final void b() {
        if (c()) {
            this.f70149b.b(new a());
        }
    }

    public final boolean c() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f70148a) == 0;
        } catch (Exception e10) {
            eg.i("GoogleApiAvailability error", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i10, Intent intent) {
        eg.p("ProviderInstaller onProviderInstallFailed: " + i10 + " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted.", null, 2, null);
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        eg.j("ProviderInstaller onProviderInstalled", null, 2, null);
    }
}
