package com.apm.insight.l;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Writer f7962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f7963b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7964a = new a("EMPTY_ARRAY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7965b = new a("NONEMPTY_ARRAY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f7966c = new a("EMPTY_OBJECT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f7967d = new a("DANGLING_KEY", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f7968e = new a("NONEMPTY_OBJECT", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f7969f = new a("NULL", 5);

        private a(String str, int i10) {
        }
    }

    private h(Writer writer) {
        this.f7962a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f7964a, C4240b4.j.f42672d);
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f7964a;
        return a(C4240b4.j.f42674e);
    }

    private h c() throws JSONException, IOException {
        return a(a.f7966c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f7964a;
        return a("}");
    }

    private a e() throws JSONException {
        return this.f7963b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        if (this.f7963b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f7964a) {
            a(a.f7965b);
            return;
        }
        if (aVarE == a.f7965b) {
            this.f7962a.write(44);
        } else if (aVarE == a.f7967d) {
            this.f7962a.write(StringUtils.PROCESS_POSTFIX_DELIMITER);
            a(a.f7968e);
        } else if (aVarE != a.f7969f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f7963b.add(aVar);
        this.f7962a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f7962a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f7962a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f7962a.write("\\b");
                            continue;
                        case '\t':
                            this.f7962a.write("\\t");
                            continue;
                        case '\n':
                            this.f7962a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f7962a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            }
                            break;
                    }
                } else {
                    this.f7962a.write(92);
                }
                this.f7962a.write(cCharAt);
            } else {
                this.f7962a.write("\\r");
            }
        }
        this.f7962a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f7968e) {
            this.f7962a.write(44);
        } else if (aVarE != a.f7966c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f7967d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f7963b.remove(r0.size() - 1);
        this.f7962a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f7963b.set(r0.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f7962a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f7962a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f7962a.write("null");
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
