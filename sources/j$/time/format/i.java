package j$.time.format;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f84623f = {0, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f84624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f84627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f84628e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.q qVar, int i10, int i11, u uVar) {
        this.f84624a = (Enum) qVar;
        this.f84625b = i10;
        this.f84626c = i11;
        this.f84627d = uVar;
        this.f84628e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.q qVar, int i10, int i11, u uVar, int i12) {
        this.f84624a = (Enum) qVar;
        this.f84625b = i10;
        this.f84626c = i11;
        this.f84627d = uVar;
        this.f84628e = i12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    public i a() {
        return this.f84628e == -1 ? this : new i(this.f84624a, this.f84625b, this.f84626c, this.f84627d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    public i b(int i10) {
        int i11 = this.f84628e + i10;
        return new i(this.f84624a, this.f84625b, this.f84626c, this.f84627d, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean j(p pVar, StringBuilder sb2) {
        ?? r02 = this.f84624a;
        Long lA = pVar.a(r02);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.f84651b.f84612c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i10 = this.f84626c;
        if (length > i10) {
            throw new j$.time.b("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i10);
        }
        sVar.getClass();
        int i11 = this.f84625b;
        u uVar = this.f84627d;
        if (jLongValue >= 0) {
            int i12 = c.f84617a[uVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jLongValue >= f84623f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = c.f84617a[uVar.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new j$.time.b("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public String toString() {
        Enum r02 = this.f84624a;
        int i10 = this.f84626c;
        u uVar = this.f84627d;
        int i11 = this.f84625b;
        if (i11 == 1 && i10 == 19 && uVar == u.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i11 == i10 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + r02 + StringUtils.COMMA + i11 + ")";
        }
        return "Value(" + r02 + StringUtils.COMMA + i11 + StringUtils.COMMA + i10 + StringUtils.COMMA + uVar + ")";
    }
}
