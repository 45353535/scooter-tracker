package vc;

import android.content.Context;
import android.net.Uri;
import ic.y;
import io.bidmachine.iab.mraid.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import pd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106485c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f106486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f106487b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(m mraidNativeFeatureUrlParser, y pictureDownloader) {
        Intrinsics.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        Intrinsics.checkNotNullParameter(pictureDownloader, "pictureDownloader");
        this.f106486a = mraidNativeFeatureUrlParser;
        this.f106487b = pictureDownloader;
    }

    @Override // vc.c
    public /* synthetic */ void a(Context context, String str, h hVar) {
        b.a(this, context, str, hVar);
    }

    @Override // vc.c
    public void b(Context context, Uri uri, h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri uriB = this.f106486a.b(uri);
        if (uriB == null) {
            b9.e.b("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            jd.h.f(Boolean.FALSE, hVar);
        } else {
            y yVar = this.f106487b;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            yVar.b(applicationContext, uriB, hVar);
        }
    }

    @Override // vc.c
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual(MRAIDNativeFeature.STORE_PICTURE, uri.getScheme());
    }
}
