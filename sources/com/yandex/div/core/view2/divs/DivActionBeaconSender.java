package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import com.taurusx.tax.f.y;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import java.util.LinkedHashMap;
import java.util.Map;
import k8.dp;
import k8.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0011\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u0005*\u0004\u0018\u00010\u000fH\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0019R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBeaconSender;", "", "Lm8/a;", "Lx6/b;", "sendBeaconManagerLazy", "", "isTapBeaconsEnabled", "isVisibilityBeaconsEnabled", "isSwipeOutBeaconsEnabled", "<init>", "(Lm8/a;ZZZ)V", "Lk8/j1;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "", "toHttpHeaders", "(Lk8/j1;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/Map;", "Lk8/dp;", "(Lk8/dp;Lcom/yandex/div/json/expressions/ExpressionResolver;)Ljava/util/Map;", "isHttpScheme", "(Ljava/lang/String;)Z", "action", "", "sendTapActionBeacon", "(Lk8/j1;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "sendVisibilityActionBeacon", "(Lk8/dp;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "sendSwipeOutActionBeacon", "Lm8/a;", "Z", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivActionBeaconSender {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isSwipeOutBeaconsEnabled;
    private final boolean isTapBeaconsEnabled;
    private final boolean isVisibilityBeaconsEnabled;

    @NotNull
    private final m8.a sendBeaconManagerLazy;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivActionBeaconSender$Companion;", "", "()V", "HTTPS_SCHEME", "", "HTTP_HEADER_REFERER", "HTTP_SCHEME", "TAG", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DivActionBeaconSender(@NotNull m8.a aVar, boolean z10, boolean z11, boolean z12) {
        this.sendBeaconManagerLazy = aVar;
        this.isTapBeaconsEnabled = z10;
        this.isVisibilityBeaconsEnabled = z11;
        this.isSwipeOutBeaconsEnabled = z12;
    }

    private boolean isHttpScheme(String str) {
        return Intrinsics.areEqual(str, "http") || Intrinsics.areEqual(str, "https");
    }

    private Map<String, String> toHttpHeaders(j1 j1Var, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression expression = j1Var.f88311g;
        if (expression != null) {
            linkedHashMap.put(HttpHeaders.REFERER, ((Uri) expression.evaluate(expressionResolver)).toString());
        }
        return linkedHashMap;
    }

    public void sendSwipeOutActionBeacon(@NotNull j1 action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Expression expression = action.f88308d;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isSwipeOutBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    public void sendTapActionBeacon(@NotNull j1 action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Expression expression = action.f88308d;
        if (expression == null || (uri = (Uri) expression.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isTapBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    public void sendVisibilityActionBeacon(@NotNull dp action, @NotNull ExpressionResolver resolver) {
        Uri uri;
        Expression url = action.getUrl();
        if (url == null || (uri = (Uri) url.evaluate(resolver)) == null) {
            return;
        }
        if (isHttpScheme(uri.getScheme())) {
            if (this.isVisibilityBeaconsEnabled) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("SendBeaconManager was not configured");
                    return;
                }
                return;
            }
            return;
        }
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.WARNING)) {
            kLog.print(5, "DivActionBeaconSender", "Trying to send beacon with unsupported URL '" + uri + '\'');
        }
    }

    private Map<String, String> toHttpHeaders(dp dpVar, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression expressionF = dpVar.f();
        if (expressionF != null) {
            linkedHashMap.put(HttpHeaders.REFERER, ((Uri) expressionF.evaluate(expressionResolver)).toString());
        }
        return linkedHashMap;
    }
}
