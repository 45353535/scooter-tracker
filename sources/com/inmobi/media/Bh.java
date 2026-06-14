package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4077u9 f36632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3923o4 f36634c;

    public Bh(C4077u9 configClient) {
        Intrinsics.checkNotNullParameter(configClient, "configClient");
        this.f36632a = configClient;
        this.f36633b = Bh.class.getSimpleName();
        this.f36634c = new C3923o4();
    }

    public static final boolean a(Set set, C3873m4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.f39008b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.AbstractC3948p4 a(com.inmobi.media.C3898n4 r6, com.inmobi.media.C3873m4 r7) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(com.inmobi.media.n4, com.inmobi.media.m4):com.inmobi.media.p4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x00e5, B:38:0x0129], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:66:0x01f4, B:54:0x01bd], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:76:0x0259, B:78:0x025c], limit reached: 182 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ff A[LOOP:4: B:130:0x03f9->B:132:0x03ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0267  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x04ba -> B:152:0x04bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:154:0x04cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r26, java.lang.String r27, com.inmobi.media.core.config.models.RootConfig r28, java.util.List r29, gg.v r30, kotlin.coroutines.jvm.internal.d r31) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, gg.v, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Ne r7, java.util.List r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ah
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ah r0 = (com.inmobi.media.Ah) r0
            int r1 = r0.f36579e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36579e = r1
            goto L18
        L13:
            com.inmobi.media.Ah r0 = new com.inmobi.media.Ah
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f36577c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36579e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.ArrayList r7 = r0.f36576b
            java.util.List r8 = r0.f36575a
            kotlin.d.b(r9)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            goto L4e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.d.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.f36575a = r8     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            r0.f36576b = r9     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            r0.f36579e = r4     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            java.lang.Object r7 = r7.a()     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r5 = r9
            r9 = r7
            r7 = r5
        L4e:
            com.inmobi.media.n4 r9 = (com.inmobi.media.C3898n4) r9     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            if (r9 == 0) goto L6b
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
        L56:
            boolean r1 = r0.hasNext()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            com.inmobi.media.m4 r1 = (com.inmobi.media.C3873m4) r1     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            com.inmobi.media.p4 r1 = r6.a(r9, r1)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            r7.add(r1)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            goto L56
        L6a:
            return r7
        L6b:
            org.json.JSONException r9 = new org.json.JSONException     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            java.lang.String r0 = "Error parsing config response"
            r9.<init>(r0)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            throw r9     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
        L73:
            r7 = r9
        L74:
            a(r8, r3)
            goto L7c
        L78:
            r7 = r9
        L79:
            a(r8, r3)
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(com.inmobi.media.Ne, java.util.List, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void a(int i10, List list, List list2) {
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("errorCode", Integer.valueOf(i10)), TuplesKt.to("name", list), TuplesKt.to("lts", list2), TuplesKt.to("networkType", C4148x5.m()));
        Wj wj = Wj.f37959a;
        Wj.b("InvalidConfig", mapMutableMapOf, EnumC3585ak.f38215a);
    }

    public static void a(List list, int i10) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3873m4) it.next()).f39008b.getType());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3873m4) it2.next()).f39008b.getLastUpdateTimeStamp()));
        }
        a(i10, arrayList, arrayList2);
    }
}
