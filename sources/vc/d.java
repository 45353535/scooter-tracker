package vc;

import android.content.Context;
import android.net.Uri;
import ic.q;
import io.bidmachine.iab.mraid.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import pd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106482c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f106483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f106484b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(m mraidNativeFeatureUrlParser, q intentLauncher) {
        Intrinsics.checkNotNullParameter(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        Intrinsics.checkNotNullParameter(intentLauncher, "intentLauncher");
        this.f106483a = mraidNativeFeatureUrlParser;
        this.f106484b = intentLauncher;
    }

    @Override // vc.c
    public /* synthetic */ void a(Context context, String str, h hVar) {
        b.a(this, context, str, hVar);
    }

    @Override // vc.c
    public void b(Context context, Uri uri, h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        io.bidmachine.iab.mraid.e eVarA = this.f106483a.a(uri);
        if (eVarA != null) {
            this.f106484b.f(context, eVarA, hVar);
        } else {
            b9.e.b("MraidCalendarDeeplinkProcessor", "processUrl (mraidCalendarEvent is null)", new Object[0]);
            jd.h.f(Boolean.FALSE, hVar);
        }
    }

    @Override // vc.c
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual(MRAIDNativeFeature.CALENDAR, uri.getScheme());
    }
}
