package cf;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import lf.i;
import org.jetbrains.annotations.NotNull;
import ug.l;
import ug.n;
import ug.z;
import yg.e2;
import yg.i1;
import yg.i2;
import yg.j0;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.x0;

/* JADX INFO: renamed from: cf.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@l
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002)ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010\u001d\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b6\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcf/d;", "", "", "seconds", "minutes", "hours", "Lcf/f;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lcf/e;", "month", "year", "", "timestamp", "<init>", "(IIILcf/f;IILcf/e;IJ)V", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(IIIILcf/f;IILcf/e;IJLyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "h", "(Lcf/d;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "other", "g", "(Lcf/d;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "getSeconds", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getMinutes", "d", "getHours", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcf/f;", "getDayOfWeek", "()Lcf/f;", InneractiveMediationDefs.GENDER_FEMALE, "getDayOfMonth", "getDayOfYear", "Lcf/e;", "getMonth", "()Lcf/e;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "getYear", "j", "J", "getTimestamp", "()J", y.f66058y, "a", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GMTDate implements Comparable<GMTDate> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Lazy[] f6795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final GMTDate f6796l;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int seconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minutes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hours;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final f dayOfWeek;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dayOfMonth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dayOfYear;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final e month;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int year;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: cf.d$a */
    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6806a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f6806a = aVar;
            i2 i2Var = new i2("io.ktor.util.date.GMTDate", aVar, 9);
            i2Var.n("seconds", false);
            i2Var.n("minutes", false);
            i2Var.n("hours", false);
            i2Var.n("dayOfWeek", false);
            i2Var.n("dayOfMonth", false);
            i2Var.n("dayOfYear", false);
            i2Var.n("month", false);
            i2Var.n("year", false);
            i2Var.n("timestamp", false);
            descriptor = i2Var;
        }

        private a() {
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GMTDate deserialize(Decoder decoder) {
            int iF;
            e eVar;
            f fVar;
            int iF2;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            long jE;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            xg.d dVarB = decoder.b(serialDescriptor);
            Lazy[] lazyArr = GMTDate.f6795k;
            int i15 = 7;
            if (dVarB.j()) {
                iF = dVarB.f(serialDescriptor, 0);
                int iF3 = dVarB.f(serialDescriptor, 1);
                int iF4 = dVarB.f(serialDescriptor, 2);
                f fVar2 = (f) dVarB.s(serialDescriptor, 3, (ug.c) lazyArr[3].getValue(), null);
                int iF5 = dVarB.f(serialDescriptor, 4);
                int iF6 = dVarB.f(serialDescriptor, 5);
                eVar = (e) dVarB.s(serialDescriptor, 6, (ug.c) lazyArr[6].getValue(), null);
                iF2 = dVarB.f(serialDescriptor, 7);
                i10 = iF6;
                i11 = 511;
                i12 = iF5;
                i13 = iF4;
                fVar = fVar2;
                i14 = iF3;
                jE = dVarB.e(serialDescriptor, 8);
            } else {
                boolean z10 = true;
                iF = 0;
                int iF7 = 0;
                int iF8 = 0;
                int iF9 = 0;
                e eVar2 = null;
                long jE2 = 0;
                int iF10 = 0;
                int iF11 = 0;
                int i16 = 0;
                f fVar3 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            i15 = 7;
                            break;
                        case 0:
                            i16 |= 1;
                            iF = dVarB.f(serialDescriptor, 0);
                            i15 = 7;
                            break;
                        case 1:
                            iF9 = dVarB.f(serialDescriptor, 1);
                            i16 |= 2;
                            i15 = 7;
                            break;
                        case 2:
                            iF8 = dVarB.f(serialDescriptor, 2);
                            i16 |= 4;
                            break;
                        case 3:
                            fVar3 = (f) dVarB.s(serialDescriptor, 3, (ug.c) lazyArr[3].getValue(), fVar3);
                            i16 |= 8;
                            break;
                        case 4:
                            iF7 = dVarB.f(serialDescriptor, 4);
                            i16 |= 16;
                            break;
                        case 5:
                            iF11 = dVarB.f(serialDescriptor, 5);
                            i16 |= 32;
                            break;
                        case 6:
                            eVar2 = (e) dVarB.s(serialDescriptor, 6, (ug.c) lazyArr[6].getValue(), eVar2);
                            i16 |= 64;
                            break;
                        case 7:
                            iF10 = dVarB.f(serialDescriptor, i15);
                            i16 |= 128;
                            break;
                        case 8:
                            jE2 = dVarB.e(serialDescriptor, 8);
                            i16 |= 256;
                            break;
                        default:
                            throw new z(iX);
                    }
                }
                eVar = eVar2;
                fVar = fVar3;
                iF2 = iF10;
                i10 = iF11;
                i11 = i16;
                i12 = iF7;
                i13 = iF8;
                i14 = iF9;
                jE = jE2;
            }
            int i17 = iF;
            dVarB.c(serialDescriptor);
            return new GMTDate(i11, i17, i14, i13, fVar, i12, i10, eVar, iF2, jE, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, GMTDate value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            xg.f fVarB = encoder.b(serialDescriptor);
            GMTDate.h(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = GMTDate.f6795k;
            x0 x0Var = x0.f119093a;
            return new KSerializer[]{x0Var, x0Var, x0Var, lazyArr[3].getValue(), x0Var, x0Var, lazyArr[6].getValue(), x0Var, i1.f118988a};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: cf.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f6806a;
        }

        private Companion() {
        }
    }

    static {
        lf.l lVar = lf.l.f94210c;
        f6795k = new Lazy[]{null, null, null, i.b(lVar, new Function0() { // from class: cf.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GMTDate.d();
            }
        }), null, null, i.b(lVar, new Function0() { // from class: cf.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GMTDate.e();
            }
        }), null, null};
        f6796l = cf.a.a(0L);
    }

    public /* synthetic */ GMTDate(int i10, int i11, int i12, int i13, f fVar, int i14, int i15, e eVar, int i16, long j10, t2 t2Var) {
        if (511 != (i10 & 511)) {
            e2.a(i10, 511, a.f6806a.getDescriptor());
        }
        this.seconds = i11;
        this.minutes = i12;
        this.hours = i13;
        this.dayOfWeek = fVar;
        this.dayOfMonth = i14;
        this.dayOfYear = i15;
        this.month = eVar;
        this.year = i16;
        this.timestamp = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return j0.b("io.ktor.util.date.WeekDay", f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer e() {
        return j0.b("io.ktor.util.date.Month", e.values());
    }

    public static final /* synthetic */ void h(GMTDate self, xg.f output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f6795k;
        output.o(serialDesc, 0, self.seconds);
        output.o(serialDesc, 1, self.minutes);
        output.o(serialDesc, 2, self.hours);
        output.F(serialDesc, 3, (n) lazyArr[3].getValue(), self.dayOfWeek);
        output.o(serialDesc, 4, self.dayOfMonth);
        output.o(serialDesc, 5, self.dayOfYear);
        output.F(serialDesc, 6, (n) lazyArr[6].getValue(), self.month);
        output.o(serialDesc, 7, self.year);
        output.v(serialDesc, 8, self.timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) other;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(GMTDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.timestamp, other.timestamp);
    }

    public int hashCode() {
        return (((((((((((((((this.seconds * 31) + this.minutes) * 31) + this.hours) * 31) + this.dayOfWeek.hashCode()) * 31) + this.dayOfMonth) * 31) + this.dayOfYear) * 31) + this.month.hashCode()) * 31) + this.year) * 31) + androidx.collection.b.a(this.timestamp);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.seconds + ", minutes=" + this.minutes + ", hours=" + this.hours + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ", dayOfYear=" + this.dayOfYear + ", month=" + this.month + ", year=" + this.year + ", timestamp=" + this.timestamp + ')';
    }

    public GMTDate(int i10, int i11, int i12, f dayOfWeek, int i13, int i14, e month, int i15, long j10) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.seconds = i10;
        this.minutes = i11;
        this.hours = i12;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = i13;
        this.dayOfYear = i14;
        this.month = month;
        this.year = i15;
        this.timestamp = j10;
    }
}
