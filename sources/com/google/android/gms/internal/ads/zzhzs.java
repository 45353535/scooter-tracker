package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhzs implements Closeable, Flushable, AutoCloseable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzhyj zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzhyq zzk;
    private String zzl;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            zzb[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzhzs(Writer writer) {
        boolean z10 = false;
        zzm(6);
        this.zzk = zzhyq.LEGACY_STRICT;
        Objects.requireNonNull(writer, "out == null");
        this.zzd = writer;
        zzhyj zzhyjVar = zzhyj.zza;
        Objects.requireNonNull(zzhyjVar);
        this.zzg = zzhyjVar;
        this.zzi = StringUtils.COMMA;
        if (zzhyjVar.zzc()) {
            this.zzh = ": ";
            if (zzhyjVar.zza().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = StringUtils.PROCESS_POSTFIX_DELIMITER;
        }
        if (zzhyjVar.zza().isEmpty() && zzhyjVar.zzb().isEmpty()) {
            z10 = true;
        }
        this.zzj = z10;
    }

    private final zzhzs zzk(int i10, char c10) throws IOException {
        zzs();
        zzm(i10);
        this.zzd.write(c10);
        return this;
    }

    private final zzhzs zzl(int i10, int i11, char c10) throws IOException {
        int iZzn = zzn();
        if (iZzn != i11 && iZzn != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZzn == i11) {
            zzr();
        }
        this.zzd.write(c10);
        return this;
    }

    private final void zzm(int i10) {
        int i11 = this.zzf;
        int[] iArr = this.zze;
        if (i11 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i11 + i11);
        }
        int[] iArr2 = this.zze;
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        iArr2[i12] = i10;
    }

    private final int zzn() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return this.zze[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void zzo(int i10) {
        this.zze[this.zzf - 1] = i10;
    }

    private final void zzp() throws IOException {
        if (this.zzl != null) {
            int iZzn = zzn();
            if (iZzn == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzn != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzr();
            zzo(4);
            zzq(this.zzl);
            this.zzl = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzq(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            java.io.Writer r0 = r9.zzd
            java.lang.String[] r1 = com.google.android.gms.internal.ads.zzhzs.zzb
            r2 = 34
            r0.write(r2)
            int r3 = r10.length()
            r4 = 0
            r5 = r4
        Lf:
            if (r4 >= r3) goto L39
            int r6 = r4 + 1
            char r7 = r10.charAt(r4)
            r8 = 128(0x80, float:1.8E-43)
            if (r7 >= r8) goto L20
            r7 = r1[r7]
            if (r7 == 0) goto L37
            goto L2d
        L20:
            r8 = 8232(0x2028, float:1.1535E-41)
            if (r7 != r8) goto L27
            java.lang.String r7 = "\\u2028"
            goto L2d
        L27:
            r8 = 8233(0x2029, float:1.1537E-41)
            if (r7 != r8) goto L37
            java.lang.String r7 = "\\u2029"
        L2d:
            if (r5 >= r4) goto L33
            int r4 = r4 - r5
            r0.write(r10, r5, r4)
        L33:
            r0.write(r7)
            r5 = r6
        L37:
            r4 = r6
            goto Lf
        L39:
            if (r5 >= r3) goto L3f
            int r3 = r3 - r5
            r0.write(r10, r5, r3)
        L3f:
            r0.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzs.zzq(java.lang.String):void");
    }

    private final void zzr() throws IOException {
        if (this.zzj) {
            return;
        }
        Writer writer = this.zzd;
        zzhyj zzhyjVar = this.zzg;
        writer.write(zzhyjVar.zza());
        int i10 = this.zzf;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(zzhyjVar.zzb());
        }
    }

    private final void zzs() throws IOException {
        int iZzn = zzn();
        if (iZzn == 1) {
            zzo(2);
            zzr();
            return;
        }
        if (iZzn == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzr();
        } else {
            if (iZzn == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzo(5);
                return;
            }
            if (iZzn != 6) {
                if (iZzn != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzhyq.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzo(7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i10 = this.zzf;
        if (i10 > 1 || (i10 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzk = zzhyqVar;
    }

    public final zzhzs zzb() throws IOException {
        zzp();
        zzk(1, '[');
        return this;
    }

    public final zzhzs zzc() throws IOException {
        zzl(1, 2, ']');
        return this;
    }

    public final zzhzs zzd() throws IOException {
        zzp();
        zzk(3, '{');
        return this;
    }

    public final zzhzs zze() throws IOException {
        zzl(3, 5, '}');
        return this;
    }

    public final zzhzs zzf(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzn = zzn();
        if (iZzn != 3 && iZzn != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzhzs zzg(String str) throws IOException {
        if (str == null) {
            zzj();
            return this;
        }
        zzp();
        zzs();
        zzq(str);
        return this;
    }

    public final zzhzs zzh(boolean z10) throws IOException {
        zzp();
        zzs();
        this.zzd.write(true != z10 ? "false" : "true");
        return this;
    }

    public final zzhzs zzi(Number number) throws IOException {
        if (number == null) {
            zzj();
            return this;
        }
        zzp();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzhyq.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 47 + string.length());
                sb2.append("String created by ");
                sb2.append(strValueOf);
                sb2.append(" is not a valid JSON number: ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        zzs();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzhzs zzj() throws IOException {
        if (this.zzl != null) {
            zzp();
        }
        zzs();
        this.zzd.write("null");
        return this;
    }
}
