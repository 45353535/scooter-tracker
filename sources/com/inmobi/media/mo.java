package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.mo;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Je f39056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3748h3 f39057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f39059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lo f39060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f39061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f39062g;

    public mo(Je mNetworkRequest, C3748h3 mWebViewClient, long j10, Function0 function0) {
        Intrinsics.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        Intrinsics.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.f39056a = mNetworkRequest;
        this.f39057b = mWebViewClient;
        this.f39058c = j10;
        this.f39059d = function0;
        this.f39061f = new Handler(Looper.getMainLooper());
    }

    public static final void a(mo moVar) {
        Intrinsics.checkNotNullExpressionValue("mo", "TAG");
        String str = moVar.f39056a.f37135a;
        moVar.a();
        Function0 function0 = moVar.f39059d;
        if (function0 != null) {
            function0.invoke();
        }
        moVar.f39059d = null;
    }

    public final void b() {
        try {
            Context context = Ji.f37157a;
            if (context != null) {
                lo loVar = new lo(context);
                loVar.setWebViewClient(this.f39057b);
                loVar.getSettings().setJavaScriptEnabled(true);
                loVar.getSettings().setCacheMode(2);
                this.f39060e = loVar;
            }
            lo loVar2 = this.f39060e;
            if (loVar2 != null) {
                Je je2 = this.f39056a;
                String strA = Se.a(je2.f37135a, je2.f37138d);
                Map<String, String> mapEmptyMap = this.f39056a.f37136b;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                loVar2.loadUrl(strA, mapEmptyMap);
            }
            if (this.f39058c > 0) {
                Runnable runnable = new Runnable() { // from class: w3.x9
                    @Override // java.lang.Runnable
                    public final void run() {
                        mo.a(this.f107382b);
                    }
                };
                this.f39061f.postDelayed(runnable, this.f39058c);
                this.f39062g = runnable;
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("mo", "TAG");
            e10.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.f39062g;
        if (runnable != null) {
            this.f39061f.removeCallbacks(runnable);
        }
        this.f39062g = null;
        try {
            Result.Companion companion = Result.f93230c;
            lo loVar = this.f39060e;
            if (loVar != null && !loVar.f38998a) {
                loVar.stopLoading();
                loVar.removeAllViews();
                loVar.destroy();
            }
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
        this.f39060e = null;
    }
}
