package io.bidmachine.iab.mraid;

import android.net.Uri;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f80240a = new e0();

    public e a(Uri uri) {
        try {
            return this.f80240a.a(Uri.decode(uri.getQueryParameter("eventJson")));
        } catch (Exception e10) {
            i.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    public Uri b(Uri uri) {
        try {
            return Uri.parse(Uri.decode(uri.getQueryParameter("url")));
        } catch (Exception e10) {
            i.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }
}
