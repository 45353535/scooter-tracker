package ic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.ironsource.C4240b4;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f74348b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f74349a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public q() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f74349a = executorServiceNewSingleThreadExecutor;
    }

    private final Intent b(Intent intent) {
        Intent flags = Intent.createChooser(intent, "").setFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(flags, "createChooser(intent, \"\"…t.FLAG_ACTIVITY_NEW_TASK)");
        return flags;
    }

    private final Intent c(io.bidmachine.iab.mraid.e eVar) {
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", eVar.g()).putExtra(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, eVar.k().getTime());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_INS…CalendarEvent.start.time)");
        Date dateH = eVar.h();
        if (dateH != null) {
            intentPutExtra.putExtra(MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, dateH.getTime());
        }
        String strM = eVar.m();
        if (strM != null) {
            intentPutExtra.putExtra("description", strM);
        }
        String strI = eVar.i();
        if (strI != null) {
            intentPutExtra.putExtra(MRAIDNativeFeatureProvider.EVENT_LOCATION, strI);
        }
        String strL = eVar.l();
        int i10 = 0;
        if (strL != null) {
            intentPutExtra.putExtra(MRAIDNativeFeatureProvider.STATUS, Intrinsics.areEqual(strL, "confirmed") ? 1 : Intrinsics.areEqual(strL, "cancelled") ? 2 : 0);
        }
        String strN = eVar.n();
        if (strN != null) {
            if (Intrinsics.areEqual(strN, C4240b4.i.T)) {
                i10 = 1;
            } else if (!Intrinsics.areEqual(strN, "opaque")) {
                i10 = 2;
            }
            intentPutExtra.putExtra("availability", i10);
        }
        String strJ = eVar.j();
        if (strJ != null) {
            intentPutExtra.putExtra("rrule", strJ);
        }
        return intentPutExtra;
    }

    private final void d(Context context, Intent intent, pd.h hVar) {
        try {
            context.startActivity(intent);
            jd.h.f(Boolean.TRUE, hVar);
        } catch (Exception e10) {
            v.i(e10);
            jd.h.f(Boolean.FALSE, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(q this$0, Context applicationContext, Uri uri, pd.h hVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        this$0.j(applicationContext, uri, hVar);
    }

    private final void h(Context context, final Uri uri, final pd.h hVar) {
        final Context applicationContext = context.getApplicationContext();
        this.f74349a.execute(new Runnable() { // from class: ic.p
            @Override // java.lang.Runnable
            public final void run() {
                q.g(this.f74344b, applicationContext, uri, hVar);
            }
        });
    }

    private final void i(Context context, io.bidmachine.iab.mraid.e eVar, pd.h hVar) {
        d(context, b(c(eVar)), hVar);
    }

    private final void j(Context context, Uri uri, pd.h hVar) {
        pd.l.b(context, uri.toString(), hVar);
    }

    public final void e(Context context, Uri uri, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            v.b("IntentLauncher", "launch - Uri is null", new Object[0]);
            jd.h.f(Boolean.FALSE, hVar);
        } else if (pd.f0.q(uri)) {
            h(context, uri, hVar);
        } else if (uri.getScheme() != null) {
            jd.h.f(Boolean.valueOf(pd.l.d(context, uri.toString())), hVar);
        } else {
            v.b("IntentLauncher", "launch - Invalid uri: %s", uri);
            jd.h.f(Boolean.FALSE, hVar);
        }
    }

    public final void f(Context context, io.bidmachine.iab.mraid.e mraidCalendarEvent, pd.h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidCalendarEvent, "mraidCalendarEvent");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        i(applicationContext, mraidCalendarEvent, hVar);
    }
}
