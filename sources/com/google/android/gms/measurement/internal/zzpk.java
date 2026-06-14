package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.my.target.common.StoreType;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.w.s.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpk extends zzos {
    zzpk(zzpg zzpgVar) {
        super(zzpgVar);
    }

    static final void zzC(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str, Object obj) {
        List listZza = zzhrVar.zza();
        int i10 = 0;
        while (true) {
            if (i10 >= listZza.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i10)).zzb())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb(str);
        zzhvVarZzn.zzf(((Long) obj).longValue());
        if (i10 >= 0) {
            zzhrVar.zze(i10, zzhvVarZzn);
        } else {
            zzhrVar.zzg(zzhvVarZzn);
        }
    }

    @WorkerThread
    static final boolean zzD(zzbg zzbgVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzbgVar);
        Preconditions.checkNotNull(zzrVar);
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    static final Bundle zzE(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(strZzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(strZzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(strZzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.zzhw zzF(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    static final Map zzG(com.google.android.gms.internal.measurement.zzhs zzhsVar, String... strArr) {
        Object objZzP;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (Arrays.asList(strArr).contains(zzhwVar.zzb()) && (objZzP = zzP(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objZzP);
            }
        }
        return map;
    }

    static final Map zzH(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        Object objZzP;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (objZzP = zzP(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objZzP);
            }
        }
        return map;
    }

    static final Object zzI(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzF = zzF(zzhsVar, str);
        if (zzhwVarZzF == null) {
            return null;
        }
        return zzP(zzhwVarZzF);
    }

    static final Object zzJ(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str, Object obj) {
        Object objZzI = zzI(zzhsVar, str);
        return objZzI == null ? obj : objZzI;
    }

    private final void zzK(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                zzM(sb2, i11);
                sb2.append("param {\n");
                zzS(sb2, i11, "name", zzhwVar.zza() ? this.zzu.zzl().zzb(zzhwVar.zzb()) : null);
                zzS(sb2, i11, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                zzS(sb2, i11, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                zzS(sb2, i11, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    zzK(sb2, i11, zzhwVar.zzk());
                }
                zzM(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zzL(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        zzM(sb2, i10);
        sb2.append("filter {\n");
        if (zzfhVar.zze()) {
            zzS(sb2, i10, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            zzS(sb2, i10, "param_name", this.zzu.zzl().zzb(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzfr zzfrVarZzb = zzfhVar.zzb();
            if (zzfrVarZzb != null) {
                zzM(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzfrVarZzb.zza()) {
                    switch (zzfrVarZzb.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzS(sb2, i11, "match_type", str);
                }
                if (zzfrVarZzb.zzb()) {
                    zzS(sb2, i11, "expression", zzfrVarZzb.zzc());
                }
                if (zzfrVarZzb.zzd()) {
                    zzS(sb2, i11, "case_sensitive", Boolean.valueOf(zzfrVarZzb.zze()));
                }
                if (zzfrVarZzb.zzg() > 0) {
                    zzM(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzfrVarZzb.zzf()) {
                        zzM(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    sb2.append("}\n");
                }
                zzM(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            zzT(sb2, i10 + 1, "number_filter", zzfhVar.zzd());
        }
        zzM(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzM(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final void zzN(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final String zzO(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final Object zzP(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return zzy(zzhwVar.zzk());
        }
        return null;
    }

    private static final void zzQ(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(StringUtils.COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zzN(builder, str3, string, set);
            }
        }
    }

    private static final void zzR(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        zzM(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zziiVar.zzd() != 0) {
            zzM(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zziiVar.zzc()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            zzM(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zziiVar.zza()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            zzM(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            zzM(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append(C4240b4.j.f42674e);
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzM(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzS(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzM(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzT(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        zzM(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzflVar.zza()) {
            int iZzm = zzflVar.zzm();
            zzS(sb2, i10, "comparison_type", iZzm != 1 ? iZzm != 2 ? iZzm != 3 ? iZzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            zzS(sb2, i10, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            zzS(sb2, i10, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            zzS(sb2, i10, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            zzS(sb2, i10, "max_comparison_value", zzflVar.zzi());
        }
        zzM(sb2, i10);
        sb2.append("}\n");
    }

    static boolean zzm(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean zzn(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static List zzp(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.zznl zzw(com.google.android.gms.internal.measurement.zznl zznlVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzmr {
        com.google.android.gms.internal.measurement.zzlr zzlrVarZza = com.google.android.gms.internal.measurement.zzlr.zza();
        return zzlrVarZza != null ? zznlVar.zzaV(bArr, zzlrVarZza) : zznlVar.zzaW(bArr);
    }

    static int zzx(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i10 = 0; i10 < zzicVar.zzl(); i10++) {
            if (str.equals(zzicVar.zzm(i10).zzc())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle[] zzy(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    final zzbg zzA(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzB = zzB(zzaaVar.zzf(), true);
        String string = (!bundleZzB.containsKey("_o") || (obj = bundleZzB.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzjm.zzb(zzaaVar.zzb());
        if (strZzb == null) {
            strZzb = zzaaVar.zzb();
        }
        return new zzbg(strZzb, new zzbe(bundleZzB), string, zzaaVar.zza());
    }

    final Bundle zzB(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(zzB((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }

    final void zzc(com.google.android.gms.internal.measurement.zzit zzitVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzitVar.zzg(((Double) obj).doubleValue());
        } else {
            this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                    zzhvVarZzn2.zzb(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzhvVarZzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzhvVarZzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzhvVarZzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzhvVarZzn.zzk(zzhvVarZzn2);
                }
                if (zzhvVarZzn.zzj() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    @TargetApi(30)
    final zzoh zzf(String str, com.google.android.gms.internal.measurement.zzic zzicVar, com.google.android.gms.internal.measurement.zzhr zzhrVar, String str2) {
        int iIndexOf;
        zzqp.zza();
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzp(str, zzfy.zzaP)) {
            return null;
        }
        long jCurrentTimeMillis = zzicVar2.zzaZ().currentTimeMillis();
        Set setA = j.a(zzicVar2.zzc().zzk(str, zzfy.zzau).split(StringUtils.COMMA));
        zzpg zzpgVar = this.zzg;
        zzou zzouVarZzf = zzpgVar.zzf();
        String strZzc = zzouVarZzf.zzg.zzh().zzc(str);
        Uri.Builder builder = new Uri.Builder();
        zzic zzicVar3 = zzouVarZzf.zzu;
        builder.scheme(zzicVar3.zzc().zzk(str, zzfy.zzan));
        if (TextUtils.isEmpty(strZzc)) {
            builder.authority(zzicVar3.zzc().zzk(str, zzfy.zzao));
        } else {
            String strZzk = zzicVar3.zzc().zzk(str, zzfy.zzao);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(strZzk).length());
            sb2.append(strZzc);
            sb2.append(".");
            sb2.append(strZzk);
            builder.authority(sb2.toString());
        }
        builder.path(zzicVar3.zzc().zzk(str, zzfy.zzap));
        zzN(builder, "gmp_app_id", zzicVar.zzac(), setA);
        zzicVar2.zzc().zzi();
        zzN(builder, "gmp_version", String.valueOf(133005L), setA);
        String strZzV = zzicVar.zzV();
        zzal zzalVarZzc = zzicVar2.zzc();
        zzfx zzfxVar = zzfy.zzaS;
        if (zzalVarZzc.zzp(str, zzfxVar) && zzpgVar.zzh().zzt(str)) {
            strZzV = "";
        }
        zzN(builder, "app_instance_id", strZzV, setA);
        zzN(builder, "rdid", zzicVar.zzP(), setA);
        zzN(builder, "bundle_id", zzicVar.zzK(), setA);
        String strZzk2 = zzhrVar.zzk();
        String strZza = zzjm.zza(strZzk2);
        if (true != TextUtils.isEmpty(strZza)) {
            strZzk2 = strZza;
        }
        zzN(builder, "app_event_name", strZzk2, setA);
        zzN(builder, "app_version", String.valueOf(zzicVar.zzai()), setA);
        String strZzD = zzicVar.zzD();
        if (zzicVar2.zzc().zzp(str, zzfxVar) && zzpgVar.zzh().zzq(str) && !TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
            strZzD = strZzD.substring(0, iIndexOf);
        }
        zzN(builder, CommonUrlParts.OS_VERSION, strZzD, setA);
        zzN(builder, "timestamp", String.valueOf(zzhrVar.zzn()), setA);
        if (zzicVar.zzS()) {
            zzN(builder, N6.f41419s, "1", setA);
        }
        zzN(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), setA);
        zzN(builder, "trigger_uri_source", "1", setA);
        zzN(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setA);
        zzN(builder, "request_uuid", str2, setA);
        List<com.google.android.gms.internal.measurement.zzhw> listZza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : listZza) {
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        zzQ(builder, zzicVar2.zzc().zzk(str, zzfy.zzat).split("\\|"), bundle, setA);
        List<com.google.android.gms.internal.measurement.zziu> listZzk = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zziu zziuVar : listZzk) {
            String strZzc2 = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(strZzc2, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzg()));
            }
        }
        zzQ(builder, zzicVar2.zzc().zzk(str, zzfy.zzas).split("\\|"), bundle2, setA);
        zzN(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", setA);
        if (!zzicVar.zzaE().isEmpty()) {
            zzN(builder, "dma_cps", zzicVar.zzaE(), setA);
        }
        if (zzicVar.zzaK()) {
            com.google.android.gms.internal.measurement.zzha zzhaVarZzaL = zzicVar.zzaL();
            if (!zzhaVarZzaL.zzb().isEmpty()) {
                zzN(builder, "dl_gclid", zzhaVarZzaL.zzb(), setA);
            }
            if (!zzhaVarZzaL.zzd().isEmpty()) {
                zzN(builder, "dl_gbraid", zzhaVarZzaL.zzd(), setA);
            }
            if (!zzhaVarZzaL.zzf().isEmpty()) {
                zzN(builder, "dl_gs", zzhaVarZzaL.zzf(), setA);
            }
            if (zzhaVarZzaL.zzh() > 0) {
                zzN(builder, "dl_ss_ts", String.valueOf(zzhaVarZzaL.zzh()), setA);
            }
            if (!zzhaVarZzaL.zzj().isEmpty()) {
                zzN(builder, "mr_gclid", zzhaVarZzaL.zzj(), setA);
            }
            if (!zzhaVarZzaL.zzm().isEmpty()) {
                zzN(builder, "mr_gbraid", zzhaVarZzaL.zzm(), setA);
            }
            if (!zzhaVarZzaL.zzo().isEmpty()) {
                zzN(builder, "mr_gs", zzhaVarZzaL.zzo(), setA);
            }
            if (zzhaVarZzaL.zzq() > 0) {
                zzN(builder, "mr_click_ts", String.valueOf(zzhaVarZzaL.zzq()), setA);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    final com.google.android.gms.internal.measurement.zzhs zzh(zzbb zzbbVar) {
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
        zzhrVarZzk.zzq(zzbbVar.zze);
        zzbe zzbeVar = zzbbVar.zzf;
        zzbd zzbdVar = new zzbd(zzbeVar);
        while (zzbdVar.hasNext()) {
            String next = zzbdVar.next();
            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzhvVarZzn.zzb(next);
            Object objZza = zzbeVar.zza(next);
            Preconditions.checkNotNull(objZza);
            zzd(zzhvVarZzn, objZza);
            zzhrVarZzk.zzg(zzhvVarZzn);
        }
        String str = zzbbVar.zzc;
        if (!TextUtils.isEmpty(str) && zzbeVar.zza("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzhvVarZzn2.zzb("_o");
            zzhvVarZzn2.zzd(str);
            zzhrVarZzk.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbc());
        }
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVarZzk.zzbc();
    }

    final String zzi(com.google.android.gms.internal.measurement.zzib zzibVar) {
        com.google.android.gms.internal.measurement.zzhe zzheVarZzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (zzibVar.zzf()) {
            zzS(sb2, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            zzS(sb2, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (com.google.android.gms.internal.measurement.zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                zzM(sb2, 1);
                sb2.append("bundle {\n");
                if (zzidVar.zza()) {
                    zzS(sb2, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(zzidVar.zzb()));
                }
                zzrb.zza();
                zzic zzicVar = this.zzu;
                if (zzicVar.zzc().zzp(zzidVar.zzA(), zzfy.zzaM) && zzidVar.zzag()) {
                    zzS(sb2, 1, "session_stitching_token", zzidVar.zzah());
                }
                zzS(sb2, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    zzS(sb2, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    zzS(sb2, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    zzS(sb2, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    zzS(sb2, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                zzS(sb2, 1, "gmp_app_id", zzidVar.zzP());
                zzS(sb2, 1, "app_id", zzidVar.zzA());
                zzS(sb2, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    zzS(sb2, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                zzS(sb2, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    zzS(sb2, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                zzS(sb2, 1, StoreType.APP_STORE, zzidVar.zzz());
                if (zzidVar.zzi()) {
                    zzS(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    zzS(sb2, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    zzS(sb2, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    zzS(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    zzS(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                zzS(sb2, 1, "app_instance_id", zzidVar.zzJ());
                zzS(sb2, 1, "resettable_device_id", zzidVar.zzG());
                zzS(sb2, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    zzS(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                zzS(sb2, 1, CommonUrlParts.OS_VERSION, zzidVar.zzu());
                zzS(sb2, 1, "device_model", zzidVar.zzv());
                zzS(sb2, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    zzS(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    zzS(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    zzS(sb2, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    zzS(sb2, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                zzS(sb2, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    zzS(sb2, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    zzS(sb2, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    zzS(sb2, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    zzS(sb2, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    zzS(sb2, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    zzS(sb2, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzqp.zza();
                if (zzicVar.zzc().zzp(zzidVar.zzA(), zzfy.zzaP)) {
                    zzS(sb2, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzheVarZzat = zzidVar.zzat()) != null) {
                        zzM(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        zzS(sb2, 2, "eligible", Boolean.valueOf(zzheVarZzat.zza()));
                        zzS(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarZzat.zzb()));
                        zzS(sb2, 2, "pre_r", Boolean.valueOf(zzheVarZzat.zzc()));
                        zzS(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarZzat.zzd()));
                        zzS(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarZzat.zze()));
                        zzS(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarZzat.zzf()));
                        zzS(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarZzat.zzg()));
                        zzM(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    com.google.android.gms.internal.measurement.zzha zzhaVarZzax = zzidVar.zzax();
                    zzM(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (zzhaVarZzax.zza()) {
                        zzS(sb2, 2, "deep_link_gclid", zzhaVarZzax.zzb());
                    }
                    if (zzhaVarZzax.zzc()) {
                        zzS(sb2, 2, "deep_link_gbraid", zzhaVarZzax.zzd());
                    }
                    if (zzhaVarZzax.zze()) {
                        zzS(sb2, 2, "deep_link_gad_source", zzhaVarZzax.zzf());
                    }
                    if (zzhaVarZzax.zzg()) {
                        zzS(sb2, 2, "deep_link_session_millis", Long.valueOf(zzhaVarZzax.zzh()));
                    }
                    if (zzhaVarZzax.zzi()) {
                        zzS(sb2, 2, "market_referrer_gclid", zzhaVarZzax.zzj());
                    }
                    if (zzhaVarZzax.zzk()) {
                        zzS(sb2, 2, "market_referrer_gbraid", zzhaVarZzax.zzm());
                    }
                    if (zzhaVarZzax.zzn()) {
                        zzS(sb2, 2, "market_referrer_gad_source", zzhaVarZzax.zzo());
                    }
                    if (zzhaVarZzax.zzp()) {
                        zzS(sb2, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarZzax.zzq()));
                    }
                    zzM(sb2, 2);
                    sb2.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    zzS(sb2, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    com.google.android.gms.internal.measurement.zzis zzisVarZzaz = zzidVar.zzaz();
                    zzM(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int iZzf = zzisVarZzaz.zzf();
                    zzS(sb2, 2, "upload_type", iZzf != 1 ? iZzf != 2 ? iZzf != 3 ? iZzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    zzS(sb2, 2, "client_upload_eligibility", zzisVarZzaz.zza().name());
                    int iZzg = zzisVarZzaz.zzg();
                    zzS(sb2, 2, "service_upload_eligibility", iZzg != 1 ? iZzg != 2 ? iZzg != 3 ? iZzg != 4 ? iZzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    zzM(sb2, 2);
                    sb2.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    com.google.android.gms.internal.measurement.zzho zzhoVarZzaD = zzidVar.zzaD();
                    zzM(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : zzhoVarZzaD.zza()) {
                        zzM(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int iZzc = zzhlVar.zzc();
                        zzS(sb2, 3, "type", iZzc != 1 ? iZzc != 2 ? iZzc != 3 ? iZzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iZzd = zzhlVar.zzd();
                        zzS(sb2, 3, C4240b4.a.f42515t, iZzd != 1 ? iZzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzM(sb2, 3);
                        sb2.append("}\n");
                    }
                    zzM(sb2, 2);
                    sb2.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.zziu> listZzf = zzidVar.zzf();
                if (listZzf != null) {
                    for (com.google.android.gms.internal.measurement.zziu zziuVar : listZzf) {
                        if (zziuVar != null) {
                            zzM(sb2, 2);
                            sb2.append("user_property {\n");
                            zzS(sb2, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            zzS(sb2, 2, "name", zzicVar.zzl().zzc(zziuVar.zzc()));
                            zzS(sb2, 2, "string_value", zziuVar.zze());
                            zzS(sb2, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
                            zzS(sb2, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
                            zzM(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhg> listZzS = zzidVar.zzS();
                if (listZzS != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : listZzS) {
                        if (zzhgVar != null) {
                            zzM(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                zzS(sb2, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                zzS(sb2, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                            }
                            zzR(sb2, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                zzR(sb2, 2, "previous_data", zzhgVar.zze());
                            }
                            zzM(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhs> listZzc = zzidVar.zzc();
                if (listZzc != null) {
                    for (com.google.android.gms.internal.measurement.zzhs zzhsVar : listZzc) {
                        if (zzhsVar != null) {
                            zzM(sb2, 2);
                            sb2.append("event {\n");
                            zzS(sb2, 2, "name", zzicVar.zzl().zza(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                zzS(sb2, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                zzS(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                zzS(sb2, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                zzK(sb2, 2, zzhsVar.zza());
                            }
                            zzM(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                zzM(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final String zzj(com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzffVar.zza()) {
            zzS(sb2, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
        }
        zzS(sb2, 0, s.I, this.zzu.zzl().zza(zzffVar.zzc()));
        String strZzO = zzO(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
        if (!strZzO.isEmpty()) {
            zzS(sb2, 0, "filter_type", strZzO);
        }
        if (zzffVar.zzg()) {
            zzT(sb2, 1, "event_count_filter", zzffVar.zzh());
        }
        if (zzffVar.zze() > 0) {
            sb2.append("  filters {\n");
            Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                zzL(sb2, 2, (com.google.android.gms.internal.measurement.zzfh) it.next());
            }
        }
        zzM(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String zzk(com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        if (zzfnVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            zzS(sb2, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        zzS(sb2, 0, "property_name", this.zzu.zzl().zzc(zzfnVar.zzc()));
        String strZzO = zzO(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!strZzO.isEmpty()) {
            zzS(sb2, 0, "filter_type", strZzO);
        }
        zzL(sb2, 1, zzfnVar.zzd());
        sb2.append("}\n");
        return sb2.toString();
    }

    final Parcelable zzl(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader.ParseException unused) {
                this.zzu.zzaV().zzb().zza("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    final List zzq(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaV().zze().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaV().zze().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final boolean zzs(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzu.zzaZ().currentTimeMillis() - j10) > j11;
    }

    @WorkerThread
    final long zzt(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzic zzicVar = this.zzu;
        zzicVar.zzk().zzg();
        MessageDigest messageDigestZzO = zzpp.zzO();
        if (messageDigestZzO != null) {
            return zzpp.zzP(messageDigestZzO.digest(bArr));
        }
        zzicVar.zzaV().zzb().zza("Failed to get MD5");
        return 0L;
    }

    final long zzu(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzt(str.getBytes(Charset.forName("UTF-8")));
    }

    final byte[] zzv(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzu.zzaV().zzb().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }

    final Map zzz(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzz((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzz((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzz((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }
}
