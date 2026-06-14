package com.yandex.div.internal.util;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0014\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/internal/util/JsonPrinter;", "", "indentSpaces", "", "nestingLimit", "(II)V", "print", "", "json", "Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "deepCopy", "nestingLevel", y.f66058y, "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsonPrinter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int indentSpaces;
    private final int nestingLimit;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/util/JsonPrinter$Companion;", "", "()V", "ELLIPSIS", "", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public JsonPrinter(int i10, int i11) {
        this.indentSpaces = i10;
        this.nestingLimit = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONObject deepCopy(org.json.JSONObject r7, int r8) throws org.json.JSONException {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r7.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L2c
            if (r8 != 0) goto L23
        L21:
            r3 = r5
            goto L3b
        L23:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L3b
        L2c:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L3b
            if (r8 != 0) goto L33
            goto L21
        L33:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L3b:
            r0.put(r2, r3)
            goto L9
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONObject, int):org.json.JSONObject");
    }

    @NotNull
    public final String print(@NotNull JSONObject json) throws JSONException {
        JSONObject jSONObjectDeepCopy = deepCopy(json, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONObjectDeepCopy.toString() : jSONObjectDeepCopy.toString(i10);
    }

    @NotNull
    public final String print(@NotNull JSONArray json) throws JSONException {
        JSONArray jSONArrayDeepCopy = deepCopy(json, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONArrayDeepCopy.toString() : jSONArrayDeepCopy.toString(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONArray deepCopy(org.json.JSONArray r7, int r8) {
        /*
            r6 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r7.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r7.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L23
            if (r8 != 0) goto L1a
        L18:
            r3 = r5
            goto L32
        L1a:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r8 + (-1)
            org.json.JSONObject r3 = r6.deepCopy(r3, r4)
            goto L32
        L23:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L32
            if (r8 != 0) goto L2a
            goto L18
        L2a:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r8 + (-1)
            org.json.JSONArray r3 = r6.deepCopy(r3, r4)
        L32:
            r0.put(r3)
            int r2 = r2 + 1
            goto La
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.JsonPrinter.deepCopy(org.json.JSONArray, int):org.json.JSONArray");
    }
}
