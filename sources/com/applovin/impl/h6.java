package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f8985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f8986h;

    private static final class a extends s7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f10419b.add(p8Var);
        }
    }

    private static final class b extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f8987i;

        b(String str, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f8987i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p8 p8VarB = b(this.f8987i);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to process XML: " + this.f8987i);
            }
            c(this.f8987i);
            a(t7.XML_PARSING);
        }
    }

    private static final class c extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JSONObject f8988i;

        c(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            this.f8988i = s7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f8988i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "No VAST response received.");
                }
                a(t7.NO_WRAPPER_RESPONSE);
                return;
            }
            if (string.length() >= ((Integer) this.f9071a.a(x4.P4)).intValue()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "VAST response is over max length");
                }
                a(t7.XML_PARSING);
                return;
            }
            p8 p8VarB = b(string);
            if (p8VarB != null) {
                a(p8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to process XML: " + string);
            }
            c(string);
            a(t7.XML_PARSING);
        }
    }

    private static final class d extends h6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p8 f8989i;

        d(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(s7Var, appLovinAdLoadListener, kVar);
            if (p8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (s7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f8989i = p8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processing VAST Wrapper response...");
            }
            a(this.f8989i);
        }
    }

    h6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f8985g = appLovinAdLoadListener;
        this.f8986h = (a) s7Var;
    }

    public static h6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    protected p8 b(String str) {
        try {
            return q8.a(str, this.f9071a);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to process VAST response", th2);
            }
            a(t7.XML_PARSING);
            this.f9071a.D().a(this.f9072b, th2);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f9071a.a(x4.f11337i5)), 1).iterator();
        while (it.hasNext()) {
            p8 p8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (p8VarB != null) {
                this.f8986h.a(p8VarB);
            }
        }
    }

    public static h6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static h6 a(p8 p8Var, s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(p8Var, s7Var, appLovinAdLoadListener, kVar);
    }

    void a(p8 p8Var) {
        int iD = this.f8986h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Finished parsing XML at depth " + iD);
        }
        this.f8986h.a(p8Var);
        if (a8.b(p8Var)) {
            int iIntValue = ((Integer) this.f9071a.a(x4.Q4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.a(this.f9072b, "VAST response is wrapper. Resolving...");
                }
                this.f9071a.q0().a(new p6(this.f8986h, this.f8985g, this.f9071a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(t7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (a8.a(p8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "VAST response is inline. Rendering ad...");
            }
            this.f9071a.q0().a(new k6(this.f8986h, this.f8985g, this.f9071a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "VAST response is an error");
        }
        a(t7.NO_WRAPPER_RESPONSE);
    }

    void a(t7 t7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Failed to process VAST response due to VAST error code " + t7Var);
        }
        a8.a(this.f8986h, this.f8985g, t7Var, -6, this.f9071a);
    }
}
