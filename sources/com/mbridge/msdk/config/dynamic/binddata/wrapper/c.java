package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class c implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f47568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f47570e = new AtomicBoolean(false);

    public c(String str, String str2, View view, int i10) {
        this.f47568c = view;
        this.f47566a = str;
        this.f47567b = str2;
        this.f47569d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f47568c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f47566a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f47568c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f47570e.get() || (view = this.f47568c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f47566a, this.f47567b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
