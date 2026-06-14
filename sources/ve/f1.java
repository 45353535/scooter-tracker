package ve;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ug.l(with = k1.class)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\bE\b\u0007\u0018\u0000 X2\u00060\u0001j\u0002`\u0002:\u0001YBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010 R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R!\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u00107R\u0019\u0010E\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u001b\u0010J\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bI\u0010\u0019R\u001b\u0010M\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\bL\u0010\u0019R\u001b\u0010P\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\bO\u0010\u0019R\u001d\u0010S\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010\u0019R\u001d\u0010T\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010>\u001a\u0004\bQ\u0010\u0019R\u001b\u0010U\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bN\u0010\u0019R\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010\u001e¨\u0006Z"}, d2 = {"Lve/f1;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lve/t0;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Lve/g0;", "parameters", "fragment", "user", HintConstants.AUTOFILL_HINT_PASSWORD, "", "trailingQuery", "urlString", "<init>", "(Lve/t0;Ljava/lang/String;ILjava/util/List;Lve/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "writeReplace", "()Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/String;", "v", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "I", "C", "d", "Lve/g0;", "getParameters", "()Lve/g0;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getFragment", InneractiveMediationDefs.GENDER_FEMALE, "getUser", "g", "getPassword", "h", "Z", "D", "()Z", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", CampaignEx.JSON_KEY_AD_K, "getRawSegments", "rawSegments", CmcdData.Factory.STREAM_TYPE_LIVE, "Lkotlin/Lazy;", "getSegments", "segments", "m", "Lve/t0;", "B", "()Lve/t0;", "protocolOrNull", "n", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "o", "s", "encodedPath", "p", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "encodedQuery", CampaignEx.JSON_KEY_AD_Q, "getEncodedPathAndQuery", "encodedPathAndQuery", "r", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "encodedUser", "encodedPassword", "encodedFragment", "x", "port", com.taurusx.tax.f.y.f66058y, "a", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int specifiedPort;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g0 parameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String fragment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String user;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String password;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean trailingQuery;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String urlString;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List pathSegments;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List rawSegments;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy segments;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t0 protocolOrNull;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t0 protocol;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPath;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedQuery;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPathAndQuery;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedUser;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedPassword;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy encodedFragment;

    /* JADX INFO: renamed from: ve.f1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return k1.f106683a;
        }

        private Companion() {
        }
    }

    public f1(t0 t0Var, String host, int i10, final List pathSegments, g0 parameters, String fragment, String str, String str2, boolean z10, String urlString) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.host = host;
        this.specifiedPort = i10;
        this.parameters = parameters;
        this.fragment = fragment;
        this.user = str;
        this.password = str2;
        this.trailingQuery = z10;
        this.urlString = urlString;
        if (i10 < 0 || i10 >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
        }
        this.pathSegments = pathSegments;
        this.rawSegments = pathSegments;
        this.segments = lf.i.a(new Function0() { // from class: ve.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.E(pathSegments);
            }
        });
        this.protocolOrNull = t0Var;
        this.protocol = t0Var == null ? t0.f106709d.c() : t0Var;
        this.encodedPath = lf.i.a(new Function0() { // from class: ve.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.m(pathSegments, this);
            }
        });
        this.encodedQuery = lf.i.a(new Function0() { // from class: ve.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.n(this.f106542b);
            }
        });
        this.encodedPathAndQuery = lf.i.a(new Function0() { // from class: ve.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.l(this.f106554b);
            }
        });
        this.encodedUser = lf.i.a(new Function0() { // from class: ve.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.o(this.f106590b);
            }
        });
        this.encodedPassword = lf.i.a(new Function0() { // from class: ve.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.k(this.f106592b);
            }
        });
        this.encodedFragment = lf.i.a(new Function0() { // from class: ve.e1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.j(this.f106596b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E(List list) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return list.subList((((CharSequence) CollectionsKt.first(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) CollectionsKt.last(list)).length() == 0 ? CollectionsKt.getLastIndex(list) : 1 + CollectionsKt.getLastIndex(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(f1 f1Var) {
        int iU0 = StringsKt.u0(f1Var.urlString, '#', 0, false, 6, null) + 1;
        if (iU0 == 0) {
            return "";
        }
        String strSubstring = f1Var.urlString.substring(iU0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(f1 f1Var) {
        String str = f1Var.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String strSubstring = f1Var.urlString.substring(StringsKt.u0(f1Var.urlString, ':', f1Var.protocol.i().length() + 3, false, 4, null) + 1, StringsKt.u0(f1Var.urlString, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(f1 f1Var) {
        int iU0 = StringsKt.u0(f1Var.urlString, IOUtils.DIR_SEPARATOR_UNIX, f1Var.protocol.i().length() + 3, false, 4, null);
        if (iU0 == -1) {
            return "";
        }
        int iU02 = StringsKt.u0(f1Var.urlString, '#', iU0, false, 4, null);
        if (iU02 == -1) {
            String strSubstring = f1Var.urlString.substring(iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = f1Var.urlString.substring(iU0, iU02);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(List list, f1 f1Var) {
        int iU0;
        if (list.isEmpty() || (iU0 = StringsKt.u0(f1Var.urlString, IOUtils.DIR_SEPARATOR_UNIX, f1Var.protocol.i().length() + 3, false, 4, null)) == -1) {
            return "";
        }
        int iX0 = StringsKt.x0(f1Var.urlString, new char[]{'?', '#'}, iU0, false, 4, null);
        if (iX0 == -1) {
            String strSubstring = f1Var.urlString.substring(iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = f1Var.urlString.substring(iU0, iX0);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(f1 f1Var) {
        int iU0 = StringsKt.u0(f1Var.urlString, '?', 0, false, 6, null) + 1;
        if (iU0 == 0) {
            return "";
        }
        int iU02 = StringsKt.u0(f1Var.urlString, '#', iU0, false, 4, null);
        if (iU02 == -1) {
            String strSubstring = f1Var.urlString.substring(iU0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        String strSubstring2 = f1Var.urlString.substring(iU0, iU02);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(f1 f1Var) {
        String str = f1Var.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = f1Var.protocol.i().length() + 3;
        String strSubstring = f1Var.urlString.substring(length, StringsKt.x0(f1Var.urlString, new char[]{':', '@'}, length, false, 4, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final Object writeReplace() {
        return io.ktor.utils.io.b0.a(i1.f106678b, this);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final t0 getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final t0 getProtocolOrNull() {
        return this.protocolOrNull;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || f1.class != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.urlString, ((f1) other).urlString);
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    public final String q() {
        return (String) this.encodedFragment.getValue();
    }

    public final String r() {
        return (String) this.encodedPassword.getValue();
    }

    public final String s() {
        return (String) this.encodedPath.getValue();
    }

    public final String t() {
        return (String) this.encodedQuery.getValue();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getUrlString() {
        return this.urlString;
    }

    public final String u() {
        return (String) this.encodedUser.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public final int x() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.h();
    }
}
