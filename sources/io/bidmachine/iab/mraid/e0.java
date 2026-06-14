package io.bidmachine.iab.mraid;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final DateFormat f80215a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f80216b = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    e0() {
    }

    e a(String str) {
        return e(new JSONObject(str));
    }

    String b(JSONArray jSONArray) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                sb2.append(StringUtils.COMMA);
            }
            int i11 = jSONArray.getInt(i10);
            if (i11 >= 0 && i11 <= 6) {
                sb2.append(f80216b[i11]);
            }
        }
        return sb2.toString();
    }

    String c(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        g(jSONObject, sb2);
        h(jSONObject, sb2);
        d(jSONObject, sb2);
        j(jSONObject, sb2);
        i(jSONObject, sb2);
        k(jSONObject, sb2);
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    void d(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("expires")) {
            return;
        }
        try {
            Date date = f80215a.parse(jSONObject.getString("expires"));
            sb2.append("UNTIL=");
            sb2.append(date);
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    e e(JSONObject jSONObject) throws JSONException, ParseException {
        String string = jSONObject.getString("description");
        Objects.requireNonNull(string);
        DateFormat dateFormat = f80215a;
        Date date = dateFormat.parse(jSONObject.getString("start"));
        Objects.requireNonNull(date);
        e eVar = new e(string, date);
        if (jSONObject.has("location")) {
            eVar.a(jSONObject.getString("location"));
        }
        if (jSONObject.has("summary")) {
            eVar.e(jSONObject.getString("summary"));
        }
        if (jSONObject.has("end")) {
            eVar.b(dateFormat.parse(jSONObject.getString("end")));
        }
        if (jSONObject.has("status")) {
            eVar.d(jSONObject.getString("status"));
        }
        if (jSONObject.has("transparency")) {
            eVar.f(jSONObject.getString("transparency"));
        }
        if (jSONObject.has("recurrence")) {
            eVar.c(c(jSONObject.getJSONObject("recurrence")));
        }
        return eVar;
    }

    String f(JSONArray jSONArray) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(jSONArray.get(i10).toString());
        }
        return sb2.toString();
    }

    void g(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("frequency")) {
            return;
        }
        try {
            sb2.append("FREQ=");
            sb2.append(jSONObject.getString("frequency"));
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    void h(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("interval")) {
            return;
        }
        try {
            sb2.append("INTERVAL=");
            sb2.append(jSONObject.getInt("interval"));
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    void i(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"monthly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("daysInMonth")) {
                JSONArray jSONArray = jSONObject.getJSONArray("daysInMonth");
                if (jSONArray.length() > 0) {
                    sb2.append("BYMONTHDAY=");
                    sb2.append(f(jSONArray));
                    sb2.append(";");
                }
            }
            if (jSONObject.isNull("weeksInMonth")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("weeksInMonth");
            if (jSONArray2.length() > 0) {
                sb2.append("BYWEEKNO=");
                sb2.append(f(jSONArray2));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }

    void j(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"weekly".equalsIgnoreCase(jSONObject.getString("frequency")) || jSONObject.isNull("daysInWeek")) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("daysInWeek");
            if (jSONArray.length() > 0) {
                sb2.append("BYDAY=");
                sb2.append(b(jSONArray));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }

    void k(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"yearly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("monthsInYear")) {
                JSONArray jSONArray = jSONObject.getJSONArray("monthsInYear");
                if (jSONArray.length() > 0) {
                    sb2.append("BYMONTH=");
                    sb2.append(f(jSONArray));
                    sb2.append(";");
                }
            }
            if (jSONObject.isNull("daysInYear")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("daysInYear");
            if (jSONArray2.length() > 0) {
                sb2.append("BYYEARDAY=");
                sb2.append(f(jSONArray2));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }
}
