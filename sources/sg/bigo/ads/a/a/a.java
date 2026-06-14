package sg.bigo.ads.a.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import sg.bigo.ads.a.a.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CustomTabsClient f100074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CustomTabsServiceConnection f100075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1202a f100076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CustomTabsCallback f100077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CustomTabsSession f100078e;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1202a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, b.a aVar);

        void a(b.a aVar);
    }

    public final CustomTabsSession a() {
        CustomTabsSession customTabsSessionNewSession;
        CustomTabsClient customTabsClient = this.f100074a;
        if (customTabsClient != null) {
            customTabsSessionNewSession = this.f100078e == null ? customTabsClient.newSession(new CustomTabsCallback() { // from class: sg.bigo.ads.a.a.a.1
                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
                    super.onNavigationEvent(i10, bundle);
                    CustomTabsCallback customTabsCallback = a.this.f100077d;
                    if (customTabsCallback != null) {
                        customTabsCallback.onNavigationEvent(i10, bundle);
                    }
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // androidx.browser.customtabs.CustomTabsCallback
                public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                    super.onRelationshipValidationResult(i10, uri, z10, bundle);
                }
            }) : null;
            return this.f100078e;
        }
        this.f100078e = customTabsSessionNewSession;
        return this.f100078e;
    }

    @Override // sg.bigo.ads.a.a.d
    public final void b() {
        this.f100074a = null;
        this.f100078e = null;
        InterfaceC1202a interfaceC1202a = this.f100076c;
        if (interfaceC1202a != null) {
            interfaceC1202a.d();
        }
    }

    @Override // sg.bigo.ads.a.a.d
    public final void a(CustomTabsClient customTabsClient) {
        this.f100074a = customTabsClient;
        customTabsClient.warmup(0L);
        InterfaceC1202a interfaceC1202a = this.f100076c;
        if (interfaceC1202a != null) {
            interfaceC1202a.c();
        }
    }
}
