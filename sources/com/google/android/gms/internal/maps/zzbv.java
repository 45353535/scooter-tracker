package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzbv extends zzbn {
    static final zzbn zza = new zzbv(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbv(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    static zzbv zzg(int i10, Object[] objArr, zzbm zzbmVar) {
        boolean z10;
        int i11;
        int i12;
        short[] sArr;
        boolean z11;
        Object obj;
        boolean z12;
        ?? r16;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (zzbv) zza;
        }
        zzbl zzblVar = null;
        ?? r22 = 0;
        zzbl zzblVar2 = null;
        zzbl zzblVar3 = null;
        boolean z13 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzbf.zza(obj2, obj3);
            return new zzbv(null, objArrCopyOf, 1);
        }
        zzbc.zzb(i13, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzf = zzbo.zzf(i13);
        if (i13 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzbf.zza(obj4, obj5);
            r16 = 0;
            i13 = 1;
            i11 = 1;
        } else {
            int i15 = iZzf - 1;
            if (iZzf <= 128) {
                byte[] bArr = new byte[iZzf];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj6 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i19 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbf.zza(obj6, obj7);
                    int iZza = zzbg.zza(obj6.hashCode());
                    while (true) {
                        int i20 = iZza & i15;
                        z12 = z13;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj6;
                                objArrCopyOf[i18 ^ 1] = obj7;
                            }
                            i17++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                                int i22 = ~i21;
                                Object obj8 = objArrCopyOf[i22 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzbl zzblVar4 = new zzbl(obj6, obj7, obj8);
                                objArrCopyOf[i22 == true ? 1 : 0] = obj7;
                                zzblVar2 = zzblVar4;
                                break;
                            }
                            iZza = i20 + 1;
                            z13 = z12;
                        }
                    }
                    i16++;
                    z13 = z12;
                }
                z10 = z13;
                obj = bArr;
                z11 = z10;
                if (i17 != i13) {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i17);
                    sArr[2] = zzblVar2;
                    r22 = sArr;
                    i11 = 1;
                    r16 = z10;
                }
                i11 = 1;
                r22 = obj;
                r16 = z11;
            } else {
                z10 = false;
                if (iZzf <= 32768) {
                    sArr = new short[iZzf];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj9 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbf.zza(obj9, obj10);
                        int iZza2 = zzbg.zza(obj9.hashCode());
                        while (true) {
                            int i27 = iZza2 & i15;
                            char c10 = (char) sArr[i27];
                            if (c10 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj9;
                                    objArrCopyOf[i25 ^ 1] = obj10;
                                }
                                i23++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c10])) {
                                    int i28 = c10 ^ 1;
                                    Object obj11 = objArrCopyOf[i28 == true ? 1 : 0];
                                    Objects.requireNonNull(obj11);
                                    zzbl zzblVar5 = new zzbl(obj9, obj10, obj11);
                                    objArrCopyOf[i28 == true ? 1 : 0] = obj10;
                                    zzblVar3 = zzblVar5;
                                    break;
                                }
                                iZza2 = i27 + 1;
                            }
                        }
                    }
                    if (i23 != i13) {
                        obj = new Object[]{sArr, Integer.valueOf(i23), zzblVar3};
                        z11 = z10;
                        i11 = 1;
                        r22 = obj;
                        r16 = z11;
                    }
                    r22 = sArr;
                    i11 = 1;
                    r16 = z10;
                } else {
                    int[] iArr = new int[iZzf];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj12 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i32 ^ i14];
                        Objects.requireNonNull(obj13);
                        zzbf.zza(obj12, obj13);
                        int iZza3 = zzbg.zza(obj12.hashCode());
                        while (true) {
                            int i33 = iZza3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj12;
                                    objArrCopyOf[i31 ^ 1] = obj13;
                                }
                                i30++;
                                i12 = i14;
                            } else {
                                i12 = i14;
                                if (obj12.equals(objArrCopyOf[i34])) {
                                    int i35 = i34 ^ 1;
                                    Object obj14 = objArrCopyOf[i35];
                                    Objects.requireNonNull(obj14);
                                    zzbl zzblVar6 = new zzbl(obj12, obj13, obj14);
                                    objArrCopyOf[i35] = obj13;
                                    zzblVar = zzblVar6;
                                    break;
                                }
                                iZza3 = i33 + 1;
                                i14 = i12;
                            }
                        }
                        i29++;
                        i14 = i12;
                    }
                    i11 = i14;
                    if (i30 == i13) {
                        r22 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i11] = Integer.valueOf(i30);
                        objArr2[2] = zzblVar;
                        r22 = objArr2;
                        r16 = z10;
                    }
                }
            }
        }
        boolean z14 = r22 instanceof Object[];
        ?? r23 = r22;
        if (z14) {
            Object[] objArr3 = (Object[]) r22;
            zzbmVar.zzc = (zzbl) objArr3[2];
            Object obj15 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r23 = obj15;
            i13 = iIntValue;
        }
        return new zzbv(r23, objArrCopyOf, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.maps.zzbn, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            j$.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            j$.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbg.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.maps.zzbg.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.maps.zzbg.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzbv.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    final zzbh zza() {
        return new zzbu(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    final zzbo zzd() {
        return new zzbs(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    final zzbo zze() {
        return new zzbt(this, new zzbu(this.zzb, 0, this.zzd));
    }
}
