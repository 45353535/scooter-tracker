package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4204zb {
    public static final ContentValues a(C3980qb c3980qb) {
        Intrinsics.checkNotNullParameter(c3980qb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3980qb.f39367a);
        contentValues.put("saveTimestamp", Long.valueOf(c3980qb.f39368b));
        contentValues.put("retryCount", Integer.valueOf(c3980qb.f39369c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3980qb.f39370d));
        contentValues.put("checkpoints", Integer.valueOf(c3980qb.f39372f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3980qb.f39371e ? 1 : 0));
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.inmobi.media.C3980qb a(android.content.ContentValues r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "filename"
            java.lang.String r2 = r10.getAsString(r0)
            java.lang.String r0 = "getAsString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r0 = "saveTimestamp"
            java.lang.Long r0 = r10.getAsLong(r0)
            java.lang.String r1 = "getAsLong(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            long r3 = r0.longValue()
            java.lang.String r0 = "retryCount"
            java.lang.Integer r0 = r10.getAsInteger(r0)
            java.lang.String r5 = "getAsInteger(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            int r0 = r0.intValue()
            java.lang.String r6 = "lastRetryTimestamp"
            java.lang.Long r6 = r10.getAsLong(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            long r6 = r6.longValue()
            java.lang.String r1 = "checkpoints"
            java.lang.Integer r1 = r10.getAsInteger(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            int r9 = r1.intValue()
            java.lang.String r1 = "hasLoggerFinished"
            java.lang.Integer r10 = r10.getAsInteger(r1)
            if (r10 != 0) goto L51
            goto L5a
        L51:
            int r10 = r10.intValue()
            r1 = 1
            if (r10 != r1) goto L5a
        L58:
            r8 = r1
            goto L5c
        L5a:
            r1 = 0
            goto L58
        L5c:
            com.inmobi.media.qb r1 = new com.inmobi.media.qb
            r5 = r0
            r1.<init>(r2, r3, r5, r6, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4204zb.a(android.content.ContentValues):com.inmobi.media.qb");
    }
}
