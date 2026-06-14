package com.taurusx.tax.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.c;
import com.taurusx.tax.o.f0;
import com.taurusx.tax.o.y;

/* JADX INFO: loaded from: classes11.dex */
public class MraidVideoPlayerActivity extends y implements c.z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f66388i = "video_view_class_name";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f66389p = "video_url";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f66390m;

    public class z extends c {
        public z(Context context) {
            super(context);
        }
    }

    private c n() {
        if ("mraid".equals(getIntent().getStringExtra(f66388i))) {
            return new f0(this, getIntent(), this);
        }
        z(y.f66551o);
        finish();
        return new z(this);
    }

    public static void w(Context context, String str) {
        try {
            context.startActivity(z(context, str));
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    public static Intent z(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MraidVideoPlayerActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(f66388i, "mraid");
        intent.putExtra("video_url", str);
        return intent;
    }

    @Override // com.taurusx.tax.o.y
    public View o() {
        c cVarN = n();
        this.f66390m = cVarN;
        return cVarN;
    }

    @Override // com.taurusx.tax.o.y, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s();
        this.f66390m.start();
    }

    @Override // com.taurusx.tax.o.y, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.f66390m.z();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f66390m.w();
    }

    @Override // com.taurusx.tax.o.c.z
    public void w(boolean z10) {
        LogUtil.d("videoError", "Error: video can not be played.");
        a();
        z(y.f66551o);
        if (z10) {
            finish();
        }
    }

    @Override // com.taurusx.tax.o.c.z
    public void z() {
        a();
    }

    @Override // com.taurusx.tax.o.c.z
    public void z(boolean z10) {
        a();
        if (z10) {
            finish();
        }
    }

    @Override // com.taurusx.tax.o.c.z
    public void w() {
        z(y.f66550n);
    }
}
