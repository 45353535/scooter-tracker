package f1;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ze {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f71819i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f71823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f71824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f71825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f71826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f71827h;

    public static final class a {
        public a() {
        }

        public final ze a(JSONObject config) {
            Intrinsics.checkNotNullParameter(config, "config");
            long jOptLong = config.optLong("maxBytes", 52428800L);
            int iOptInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int iOptInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long jOptLong2 = config.optLong("timeWindow", 18000L);
            long jOptLong3 = config.optLong("timeWindowCellular", 18000L);
            long jOptLong4 = config.optLong("ttl", TelemetryConfig.DEFAULT_EVENT_TTL_SEC);
            int iOptInt3 = config.optInt("bufferSize", 3);
            String strOptString = config.optString("videoPlayer", sf.f71102a);
            b.a aVar = b.f71828c;
            Intrinsics.checkNotNull(strOptString);
            return new ze(jOptLong, iOptInt, iOptInt2, jOptLong2, jOptLong3, jOptLong4, iOptInt3, aVar.a(strOptString));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f71829d = new b("EXO_PLAYER", 0, "exoplayer");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f71830e = new b("MEDIA_PLAYER", 1, "mediaplayer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f71831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71832g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71833b;

        public static final class a {
            public a() {
            }

            public final b a(String value) {
                Object next;
                Intrinsics.checkNotNullParameter(value, "value");
                Iterator<E> it = b.g().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((b) next).h(), value)) {
                        break;
                    }
                }
                b bVar = (b) next;
                return bVar == null ? b.f71829d : bVar;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            b[] bVarArrD = d();
            f71831f = bVarArrD;
            f71832g = qf.a.a(bVarArrD);
            f71828c = new a(null);
        }

        public b(String str, int i10, String str2) {
            this.f71833b = str2;
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f71829d, f71830e};
        }

        public static EnumEntries g() {
            return f71832g;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71831f.clone();
        }

        public final String h() {
            return this.f71833b;
        }
    }

    public ze(long j10, int i10, int i11, long j11, long j12, long j13, int i12, b videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f71820a = j10;
        this.f71821b = i10;
        this.f71822c = i11;
        this.f71823d = j11;
        this.f71824e = j12;
        this.f71825f = j13;
        this.f71826g = i12;
        this.f71827h = videoPlayer;
    }

    public static final ze b(JSONObject jSONObject) {
        return f71819i.a(jSONObject);
    }

    public final int a() {
        return this.f71826g;
    }

    public final long c() {
        return this.f71820a;
    }

    public final int d() {
        return this.f71821b;
    }

    public final int e() {
        return this.f71822c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return this.f71820a == zeVar.f71820a && this.f71821b == zeVar.f71821b && this.f71822c == zeVar.f71822c && this.f71823d == zeVar.f71823d && this.f71824e == zeVar.f71824e && this.f71825f == zeVar.f71825f && this.f71826g == zeVar.f71826g && this.f71827h == zeVar.f71827h;
    }

    public final long f() {
        return this.f71823d;
    }

    public final long g() {
        return this.f71824e;
    }

    public final long h() {
        return this.f71825f;
    }

    public int hashCode() {
        return (((((((((((((androidx.collection.b.a(this.f71820a) * 31) + this.f71821b) * 31) + this.f71822c) * 31) + androidx.collection.b.a(this.f71823d)) * 31) + androidx.collection.b.a(this.f71824e)) * 31) + androidx.collection.b.a(this.f71825f)) * 31) + this.f71826g) * 31) + this.f71827h.hashCode();
    }

    public final b i() {
        return this.f71827h;
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.f71820a + ", maxUnitsPerTimeWindow=" + this.f71821b + ", maxUnitsPerTimeWindowCellular=" + this.f71822c + ", timeWindow=" + this.f71823d + ", timeWindowCellular=" + this.f71824e + ", ttl=" + this.f71825f + ", bufferSize=" + this.f71826g + ", videoPlayer=" + this.f71827h + ")";
    }

    public /* synthetic */ ze(long j10, int i10, int i11, long j11, long j12, long j13, int i12, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 52428800L : j10, (i13 & 2) != 0 ? 10 : i10, (i13 & 4) == 0 ? i11 : 10, (i13 & 8) != 0 ? 18000L : j11, (i13 & 16) == 0 ? j12 : 18000L, (i13 & 32) != 0 ? TelemetryConfig.DEFAULT_EVENT_TTL_SEC : j13, (i13 & 64) != 0 ? 3 : i12, (i13 & 128) != 0 ? b.f71829d : bVar);
    }
}
