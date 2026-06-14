package f1;

import android.content.Context;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.Partner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f69450d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Partner f69451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rc f69453c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bc(Context applicationContext, ce sharedPrefsHelper, e4 resourcesLoader) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Partner partnerCreatePartner = Partner.createPartner("Chartboost", "9.10.2");
        Intrinsics.checkNotNullExpressionValue(partnerCreatePartner, "createPartner(...)");
        this.f69451a = partnerCreatePartner;
        this.f69452b = true;
        this.f69453c = new rc(sharedPrefsHelper, resourcesLoader);
        Omid.activate(applicationContext);
    }
}
