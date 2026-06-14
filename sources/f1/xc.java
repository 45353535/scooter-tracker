package f1;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AdSize f71575h;

    public xc(String location, String adType, String str, String adCreativeId, String adCreativeType, String adMarkup, String templateUrl, AdSize adSize) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adCreativeId, "adCreativeId");
        Intrinsics.checkNotNullParameter(adCreativeType, "adCreativeType");
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(templateUrl, "templateUrl");
        this.f71568a = location;
        this.f71569b = adType;
        this.f71570c = str;
        this.f71571d = adCreativeId;
        this.f71572e = adCreativeType;
        this.f71573f = adMarkup;
        this.f71574g = templateUrl;
        this.f71575h = adSize;
    }

    public final String a() {
        return this.f71571d;
    }

    public final String b() {
        return this.f71570c;
    }

    public final AdSize c() {
        return this.f71575h;
    }

    public final String d() {
        return this.f71569b;
    }

    public final String e() {
        return this.f71568a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return Intrinsics.areEqual(this.f71568a, xcVar.f71568a) && Intrinsics.areEqual(this.f71569b, xcVar.f71569b) && Intrinsics.areEqual(this.f71570c, xcVar.f71570c) && Intrinsics.areEqual(this.f71571d, xcVar.f71571d) && Intrinsics.areEqual(this.f71572e, xcVar.f71572e) && Intrinsics.areEqual(this.f71573f, xcVar.f71573f) && Intrinsics.areEqual(this.f71574g, xcVar.f71574g) && Intrinsics.areEqual(this.f71575h, xcVar.f71575h);
    }

    public final String f() {
        String str = this.f71570c;
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(0, kotlin.ranges.g.j(str.length(), 20));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String g() {
        return this.f71574g;
    }

    public int hashCode() {
        int iHashCode = ((this.f71568a.hashCode() * 31) + this.f71569b.hashCode()) * 31;
        String str = this.f71570c;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71571d.hashCode()) * 31) + this.f71572e.hashCode()) * 31) + this.f71573f.hashCode()) * 31) + this.f71574g.hashCode()) * 31;
        AdSize adSize = this.f71575h;
        return iHashCode2 + (adSize != null ? adSize.hashCode() : 0);
    }

    public String toString() {
        return "TrackAd: location: " + this.f71568a + " adType: " + this.f71569b + " adImpressionId: " + f() + " adCreativeId: " + this.f71571d + " adCreativeType: " + this.f71572e + " adMarkup: " + this.f71573f + " templateUrl: " + this.f71574g;
    }

    /* JADX INFO: renamed from: f1.xc$a, reason: from toString */
    @ug.l
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001d\u0012B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0018R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lf1/xc$a;", "", "", "Lcom/chartboost/sdk/tracking/Pixels;", "height", "width", "<init>", "(II)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(IIILyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lf1/xc$a;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AdSize {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final int height;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final int width;

        /* JADX INFO: renamed from: f1.xc$a$a, reason: collision with other inner class name */
        public static final class C0880a implements yg.o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0880a f71579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ yg.i2 f71580b;

            static {
                C0880a c0880a = new C0880a();
                f71579a = c0880a;
                yg.i2 i2Var = new yg.i2("com.chartboost.sdk.tracking.TrackAd.AdSize", c0880a, 2);
                i2Var.n("height", false);
                i2Var.n("width", false);
                f71580b = i2Var;
            }

            @Override // ug.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdSize deserialize(Decoder decoder) {
                int iF;
                int iF2;
                int i10;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                xg.d dVarB = decoder.b(descriptor);
                if (dVarB.j()) {
                    iF = dVarB.f(descriptor, 0);
                    iF2 = dVarB.f(descriptor, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    iF = 0;
                    int iF3 = 0;
                    int i11 = 0;
                    while (z10) {
                        int iX = dVarB.x(descriptor);
                        if (iX == -1) {
                            z10 = false;
                        } else if (iX == 0) {
                            iF = dVarB.f(descriptor, 0);
                            i11 |= 1;
                        } else {
                            if (iX != 1) {
                                throw new ug.z(iX);
                            }
                            iF3 = dVarB.f(descriptor, 1);
                            i11 |= 2;
                        }
                    }
                    iF2 = iF3;
                    i10 = i11;
                }
                dVarB.c(descriptor);
                return new AdSize(i10, iF, iF2, null);
            }

            @Override // ug.n
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(Encoder encoder, AdSize value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor descriptor = getDescriptor();
                xg.f fVarB = encoder.b(descriptor);
                AdSize.b(value, fVarB, descriptor);
                fVarB.c(descriptor);
            }

            @Override // yg.o0
            public KSerializer[] childSerializers() {
                yg.x0 x0Var = yg.x0.f119093a;
                return new KSerializer[]{x0Var, x0Var};
            }

            @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
            public SerialDescriptor getDescriptor() {
                return f71580b;
            }

            @Override // yg.o0
            public KSerializer[] typeParametersSerializers() {
                return o0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: f1.xc$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C0880a.f71579a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public AdSize(int i10, int i11) {
            this.height = i10;
            this.width = i11;
        }

        public static final /* synthetic */ void b(AdSize self, xg.f output, SerialDescriptor serialDesc) {
            output.o(serialDesc, 0, self.height);
            output.o(serialDesc, 1, self.width);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSize)) {
                return false;
            }
            AdSize adSize = (AdSize) other;
            return this.height == adSize.height && this.width == adSize.width;
        }

        public int hashCode() {
            return (this.height * 31) + this.width;
        }

        public String toString() {
            return "AdSize(height=" + this.height + ", width=" + this.width + ")";
        }

        public /* synthetic */ AdSize(int i10, int i11, int i12, yg.t2 t2Var) {
            if (3 != (i10 & 3)) {
                yg.e2.a(i10, 3, C0880a.f71579a.getDescriptor());
            }
            this.height = i11;
            this.width = i12;
        }
    }

    public /* synthetic */ xc(String str, String str2, String str3, String str4, String str5, String str6, String str7, AdSize adSize, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & 128) != 0 ? null : adSize);
    }
}
