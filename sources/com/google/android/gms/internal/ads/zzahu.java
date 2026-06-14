package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
final class zzahu {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaht zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(java.lang.String):com.google.android.gms.internal.ads.zzaht");
    }

    public static boolean zzb(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i10 = 0; i10 < 4; i10++) {
            if (str.contains(String.valueOf(strArr[i10]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzguf zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i10 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfq.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzfq.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzfq.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzfq.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzfq.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzguf.zzi();
                }
                zzgucVar.zzf(new zzahs(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzfq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgucVar.zzi();
    }
}
