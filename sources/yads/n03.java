package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class n03 extends rw2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f113671r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f113672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o03 f113673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f113674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f113675p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f113676q = -3.4028235E38f;

    public n03(List list) {
        if (list == null || list.isEmpty()) {
            this.f113672m = false;
            this.f113673n = null;
            return;
        }
        this.f113672m = true;
        String strA = w83.a((byte[]) list.get(0));
        fi.a(strA.startsWith("Format:"));
        this.f113673n = (o03) fi.a(o03.a(strA));
        a(new w92((byte[]) list.get(1)));
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00fd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d7 A[LOOP:2: B:148:0x02d5->B:149:0x02d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012c A[SYNTHETIC] */
    @Override // yads.rw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.d23 a(byte[] r37, int r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.n03.a(byte[], int, boolean):yads.d23");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x031e, code lost:
    
        r39.f113674o = r10;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0217 A[Catch: RuntimeException -> 0x01fd, TryCatch #1 {RuntimeException -> 0x01fd, blocks: (B:108:0x01da, B:110:0x01e8, B:111:0x01ee, B:119:0x0213, B:121:0x0217, B:123:0x0226, B:125:0x022a, B:127:0x0239, B:129:0x023d, B:130:0x0243, B:135:0x0267, B:137:0x026b, B:141:0x027c, B:143:0x0280, B:147:0x0291, B:149:0x0295, B:153:0x02a6, B:155:0x02aa, B:159:0x02bb, B:161:0x02bf, B:162:0x02c5, B:169:0x02e8, B:167:0x02d5, B:133:0x024b, B:117:0x0200), top: B:190:0x01da, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022a A[Catch: RuntimeException -> 0x01fd, TryCatch #1 {RuntimeException -> 0x01fd, blocks: (B:108:0x01da, B:110:0x01e8, B:111:0x01ee, B:119:0x0213, B:121:0x0217, B:123:0x0226, B:125:0x022a, B:127:0x0239, B:129:0x023d, B:130:0x0243, B:135:0x0267, B:137:0x026b, B:141:0x027c, B:143:0x0280, B:147:0x0291, B:149:0x0295, B:153:0x02a6, B:155:0x02aa, B:159:0x02bb, B:161:0x02bf, B:162:0x02c5, B:169:0x02e8, B:167:0x02d5, B:133:0x024b, B:117:0x0200), top: B:190:0x01da, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023d A[Catch: RuntimeException -> 0x01fd, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01fd, blocks: (B:108:0x01da, B:110:0x01e8, B:111:0x01ee, B:119:0x0213, B:121:0x0217, B:123:0x0226, B:125:0x022a, B:127:0x0239, B:129:0x023d, B:130:0x0243, B:135:0x0267, B:137:0x026b, B:141:0x027c, B:143:0x0280, B:147:0x0291, B:149:0x0295, B:153:0x02a6, B:155:0x02aa, B:159:0x02bb, B:161:0x02bf, B:162:0x02c5, B:169:0x02e8, B:167:0x02d5, B:133:0x024b, B:117:0x0200), top: B:190:0x01da, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bf A[Catch: RuntimeException -> 0x01fd, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01fd, blocks: (B:108:0x01da, B:110:0x01e8, B:111:0x01ee, B:119:0x0213, B:121:0x0217, B:123:0x0226, B:125:0x022a, B:127:0x0239, B:129:0x023d, B:130:0x0243, B:135:0x0267, B:137:0x026b, B:141:0x027c, B:143:0x0280, B:147:0x0291, B:149:0x0295, B:153:0x02a6, B:155:0x02aa, B:159:0x02bb, B:161:0x02bf, B:162:0x02c5, B:169:0x02e8, B:167:0x02d5, B:133:0x024b, B:117:0x0200), top: B:190:0x01da, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.w92 r40) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.n03.a(yads.w92):void");
    }

    public static long a(String str) {
        Matcher matcher = f113671r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = w83.f117341a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }
}
