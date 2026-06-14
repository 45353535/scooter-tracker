package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.EnumC4380j9;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4337h;
import com.ironsource.P9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class InlineStoreActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f67814c = "InlineStoreActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67815d = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f67816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f67817b = false;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f67818a = "inline_store_intent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final String f67819b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4337h f67820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f67821b;

        public b(InterfaceC4337h interfaceC4337h) {
            this.f67820a = interfaceC4337h;
        }

        @NotNull
        public b a(Intent intent) {
            this.f67821b = intent;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f67820a.a(context);
            intentA.putExtra("inline_store_intent", this.f67821b);
            return intentA;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1001) {
            v vVar = this.f67816a;
            if (vVar != null) {
                vVar.a(i11, this.f67817b);
            }
            Map<String, Object> map = new HashMap<>();
            String str = "resultCode:" + i11;
            if (this.f67817b) {
                str = str + ",destroyCalled:true";
            }
            map.put(IronSourceConstants.EVENTS_EXT1, str);
            a(A5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f67814c, "onCreate()");
        try {
            this.f67816a = (v) P9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            v vVar = this.f67816a;
            if (vVar != null) {
                vVar.j(e10.toString());
            }
            a(A5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        v vVar = this.f67816a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.f67817b = true;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        v vVar = this.f67816a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void b() {
        requestWindowFeature(1);
    }

    private void a(Intent intent) {
        startActivityForResult(intent, 1001);
        v vVar = this.f67816a;
        if (vVar != null) {
            vVar.y();
        }
        a(A5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(final A5 a52, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.c
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.a(map, a52);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, A5 a52) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC4380j9.APP_ACTIVITY.b();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + StringUtils.COMMA + obj);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Ib.U().q().a(new C4649z5(a52, new JSONObject(map2)));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }
}
