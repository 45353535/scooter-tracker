package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4518ra {

    /* JADX INFO: renamed from: com.ironsource.ra$a */
    public static final class a implements InterfaceC4518ra {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private WebView f44828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44829b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f44828a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f44828a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC4518ra
        public boolean a() {
            return this.f44828a != null;
        }

        public a(int i10) {
            this.f44829b = i10 >= 19;
        }

        @Override // com.ironsource.InterfaceC4518ra
        public void a(@NotNull String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.f44829b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                this.f44829b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @Override // com.ironsource.InterfaceC4518ra
        public void a(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.f44828a = webView;
        }
    }

    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();
}
