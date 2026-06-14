package f1;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f70045d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ne f70046e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f70048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf f70049c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public hf(Context context, r2 displayMeasurement, zf deviceFieldsWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        Intrinsics.checkNotNullParameter(deviceFieldsWrapper, "deviceFieldsWrapper");
        this.f70047a = context;
        this.f70048b = displayMeasurement;
        this.f70049c = deviceFieldsWrapper;
    }

    public final ne a() {
        try {
            i3 i3VarA = this.f70048b.a();
            i3 i3VarE = this.f70048b.e();
            String packageName = this.f70047a.getPackageName();
            int iB = i3VarA.b();
            int iA = i3VarA.a();
            int iB2 = i3VarE.b();
            int iA2 = i3VarE.a();
            float fC = this.f70048b.c();
            String strValueOf = String.valueOf(this.f70048b.d());
            int iA3 = this.f70049c.a();
            String strB = this.f70049c.b();
            PackageManager packageManager = this.f70047a.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNull(packageName);
            ne neVar = new ne(iB, iA, iB2, iA2, fC, strValueOf, iA3, strB, packageName, vd.d(packageManager, packageName), this.f70049c.c());
            f70046e = neVar;
            return neVar;
        } catch (Exception e10) {
            eg.i("Cannot create device body", e10);
            return new ne(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
        }
    }
}
