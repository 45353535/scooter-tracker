package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.moloco.sdk.internal.h0;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f56525b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56526a;

    public static final class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f56527c = new a();

        public a() {
            super("close", null);
        }
    }

    public static final class b {

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f56528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f56529b;

            public a(boolean z10, String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.f56528a = z10;
                this.f56529b = description;
            }

            public final boolean a() {
                return this.f56528a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final h0 a(String str) {
            Object objB;
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(Uri.parse(str));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Object objB2 = null;
            if (Result.i(objB)) {
                objB = null;
            }
            Uri uri = (Uri) objB;
            if (uri == null) {
                return new h0.a(new a(false, "Invalid url: " + str));
            }
            if (!Intrinsics.areEqual(uri.getScheme(), "mraid")) {
                return new h0.a(new a(false, "Non-mraid url scheme: " + str));
            }
            Map mapD = d(uri);
            String host = uri.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals("expand")) {
                            objB2 = b(mapD);
                        }
                        break;
                    case -934437708:
                        if (host.equals("resize")) {
                            c();
                        }
                        break;
                    case 3417674:
                        if (host.equals("open")) {
                            objB2 = e(mapD);
                        }
                        break;
                    case 94756344:
                        if (host.equals("close")) {
                            objB2 = a.f56527c;
                        }
                        break;
                    case 133423073:
                        if (host.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                            objB2 = f(mapD);
                        }
                        break;
                }
            }
            if (objB2 != null) {
                return new h0.b(objB2);
            }
            return new h0.a(new a(true, "Unknown/unsupported mraid command " + uri.getHost()));
        }

        public final c b(Map map) {
            Object objB;
            String str = (String) map.get("url");
            Uri uri = null;
            if (str != null) {
                try {
                    Result.Companion companion = Result.f93230c;
                    objB = Result.b(Uri.parse(str));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                uri = (Uri) (Result.i(objB) ? null : objB);
            }
            return new c(uri);
        }

        public final e c() {
            return null;
        }

        public final Map d(Uri uri) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : uri.getQueryParameterNames()) {
                linkedHashMap.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
            }
            return linkedHashMap;
        }

        public final d e(Map map) {
            Object objB;
            String str = (String) map.get("url");
            if (str == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.f93230c;
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                objB = Result.b(new d(uri));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            return (d) (Result.i(objB) ? null : objB);
        }

        public final f f(Map map) {
            Boolean boolU1;
            String str = (String) map.get("allowOrientationChange");
            if (str == null || (boolU1 = StringsKt.u1(str)) == null) {
                return null;
            }
            boolean zBooleanValue = boolU1.booleanValue();
            y yVarA = y.f56534b.a((String) map.get("forceOrientation"));
            if (yVarA == null) {
                return null;
            }
            return new f(zBooleanValue, yVarA);
        }

        public b() {
        }
    }

    public static final class c extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f56530c;

        public c(Uri uri) {
            super("expand", null);
            this.f56530c = uri;
        }

        public final Uri c() {
            return this.f56530c;
        }
    }

    public static final class d extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f56531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri) {
            super("open", null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f56531c = uri;
        }

        public final Uri c() {
            return this.f56531c;
        }
    }

    public static final class e extends w {
    }

    public static final class f extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f56532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f56533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, y forceOrientation) {
            super(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, null);
            Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
            this.f56532c = z10;
            this.f56533d = forceOrientation;
        }

        public final boolean c() {
            return this.f56532c;
        }

        public final y d() {
            return this.f56533d;
        }
    }

    public /* synthetic */ w(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(z.a(fVar.d()), fVar.c());
    }

    public final String b() {
        return this.f56526a;
    }

    public w(String str) {
        this.f56526a = str;
    }
}
