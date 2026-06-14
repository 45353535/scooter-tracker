package com.taurusx.tax.g;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet<g0> f66131c = EnumSet.of(g0.HANDLE_PHONE_SCHEME, g0.OPEN_APP_MARKET, g0.OPEN_NATIVE_BROWSER, g0.FOLLOW_DEEP_LINK_WITH_FALLBACK, g0.FOLLOW_DEEP_LINK);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y f66132o = new z();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f66133w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f66134y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EnumSet<g0> f66135z;

    public static class w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public EnumSet<g0> f66137z = EnumSet.of(g0.NOOP);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public y f66136w = i0.f66132o;

        public w z(g0 g0Var, g0... g0VarArr) {
            this.f66137z = EnumSet.of(g0Var, g0VarArr);
            return this;
        }

        public w z(EnumSet<g0> enumSet) {
            this.f66137z = EnumSet.copyOf((EnumSet) enumSet);
            return this;
        }

        public w z(y yVar) {
            this.f66136w = yVar;
            return this;
        }

        public i0 z() {
            return new i0(this.f66137z, this.f66136w, null);
        }
    }

    public interface y {
        void w(String str, g0 g0Var);

        void z(String str, g0 g0Var);
    }

    public class z implements y {
        @Override // com.taurusx.tax.g.i0.y
        public void w(String str, g0 g0Var) {
        }

        @Override // com.taurusx.tax.g.i0.y
        public void z(String str, g0 g0Var) {
        }
    }

    public /* synthetic */ i0(EnumSet enumSet, y yVar, z zVar) {
        this(enumSet, yVar);
    }

    public y w() {
        return this.f66133w;
    }

    public EnumSet<g0> y() {
        return EnumSet.copyOf((EnumSet) this.f66135z);
    }

    public i0(EnumSet<g0> enumSet, y yVar) {
        this.f66135z = EnumSet.copyOf((EnumSet) enumSet);
        this.f66133w = yVar;
        this.f66134y = false;
    }

    public boolean z(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            z(str, null, "Attempted to handle empty url.", null);
            return false;
        }
        g0 g0Var = g0.NOOP;
        Uri uri = Uri.parse(str);
        for (g0 g0Var2 : this.f66135z) {
            if (g0Var2.shouldTryHandlingUrl(uri)) {
                try {
                    g0Var2.handleUrl(this, context, uri);
                    if (!this.f66134y) {
                        this.f66133w.w(uri.toString(), g0Var2);
                        this.f66134y = true;
                    }
                    return true;
                } catch (Exception e10) {
                    LogUtil.v("taurusx", "error : " + e10);
                    g0Var = g0Var2;
                }
            }
        }
        z(str, g0Var, "Link ignored. Unable to handle url: " + str, null);
        return false;
    }

    private void z(String str, g0 g0Var, String str2, Throwable th2) {
        if (g0Var == null) {
            g0Var = g0.NOOP;
        }
        if (th2 != null) {
            LogUtil.v("taurusx", "throwable : " + th2);
        }
        this.f66133w.z(str, g0Var);
    }
}
